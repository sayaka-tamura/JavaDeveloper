package springwork.controller;


import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import springwork.model.User;
import CoreJava.DAO.UserDAO;

@Controller
@RequestMapping("/")
@SessionAttributes("userkey")
public class IndexController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		// binder.setDisallowedFields(new String[] {"username"});
	}
	
	@ModelAttribute("userkey")
	public User setUpUserForm() {
		return new User();
	}
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("Index");
		return mav;
	}
	
	@GetMapping("signup")
	public ModelAndView goto_signup() {
		ModelAndView mav = new ModelAndView("SignUp");
		
		return mav;
	}
	
	@PostMapping("login")
	public ModelAndView login(@ModelAttribute("userkey") User u, HttpServletRequest req ) throws SQLException {
		UserDAO uDAO = new UserDAO();
		
		System.out.println(u.getUser_email());
		System.out.println(req.getParameter("user_email"));
		if (!uDAO.getUserByGmail(u.getUser_email(), u.getUser_password()).equals(null)){
			ModelAndView mav = new ModelAndView("topPage");
			HttpSession s = req.getSession();
			s.setAttribute("userk", u);
			User t = (User) s.getAttribute("userk");
			System.out.println(t.getUser_fname() + " session");
			
			return mav;
		}
		ModelAndView mav = new ModelAndView("login");		// want to put error msg on the top
		//mav.addObject("msg", "Failed to log In"); 		//request.getAtribute("msg");
		return mav;
	}
	
	
	@PostMapping("userInfo")
	public ModelAndView user_info(@ModelAttribute("userkey") @Valid User u, 
			BindingResult errors) {
		if(errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("SignUp");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("Register");
		return mav;
	}
	@RequestMapping(value="/register_userinfo", method=RequestMethod.POST)
	public ModelAndView register_userinfo(@ModelAttribute("userkey") User u) throws SQLException {

		ModelAndView mav = new ModelAndView("UserAccountPage");
		UserDAO uDAO = new UserDAO();
		int id = uDAO.createUser(u);
		System.out.println("Generated ID: " + id);
		return mav;
	}

	@GetMapping("modify")
	public ModelAndView user_info_modify() {
		ModelAndView mav = new ModelAndView("UserAccountModify");
		
		return mav;
	}
	
	@RequestMapping(value="/submit_changes", method=RequestMethod.POST)
	public String user_info_changes(@ModelAttribute User u, 
			@SessionAttribute("userkey") User ukey) {
		if(u.getUser_password().equals(ukey.getUser_password())) {
			return "redirect:modify";
		}
		ukey.setUser_password(u.getUser_password());
		return "UserAccountPage";
	}
}
