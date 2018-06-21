package springwork.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import CoreJava.DAO.ItemDAO;
import CoreJava.DAO.UserDAO;
import springwork.model.Item;
import springwork.model.User;



@Controller
@RequestMapping("/")
@SessionAttributes(value = {"userkey", "itemkey"})

public class IndexController {
	private UserDAO uDAO;
	private ItemDAO iDAO;
	private HttpSession session;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		dateFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));	
	}
	
	@ModelAttribute("userkey")
	public User setUpUserForm() {
		return new User();
	}
	
	@ModelAttribute("itemkey")
	public Item setUpExpenseForm() {
		return new Item();
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
	public ModelAndView login(@ModelAttribute("userkey") User ukey, ModelAndView mav, HttpServletRequest req) throws SQLException {
		uDAO = new UserDAO();
		// fetch user account from DB and put the all info to User object
		User login_user = uDAO.getUserByGmail(ukey.getUser_email(), ukey.getUser_password());
		
		if (login_user != null){
			session = req.getSession();
			// Save the object at this Session
			session.setAttribute("login_user", login_user);
			
			mav.setViewName("topPage_user");
			
		} else {
			 mav.setViewName("Index");
			 session = req.getSession();	
			 session.setAttribute("msg", "Failed to Log In"); 
		}
		
		return mav;
	}
	/* --------------- Sign Up Page --------------- */	
	@PostMapping("userInfo")
	public ModelAndView user_info(@ModelAttribute("userkey") @Valid User ukey, 
			BindingResult errors) {
		if(errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("SignUp");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("Register");
		return mav;
	}
	/* --------------- Register Page --------------- */	
	@RequestMapping(value="/register_userinfo", method=RequestMethod.POST)
	public ModelAndView register_userinfo(@ModelAttribute("userkey") User ukey) throws SQLException, ClassNotFoundException, IOException {
		ModelAndView mav = null;
		
		uDAO = new UserDAO();
		int id = uDAO.createUser(ukey);
		
		if(id != 0) {
			mav = new ModelAndView("SuccessRegister");
			mav.addObject("login_user", ukey);
		} else {
			mav = new ModelAndView("Register");
		}
		return mav;
	}
	/* --------------- UserAccountPage --------------- */
	@GetMapping("edit_user/{user_id}")
	public ModelAndView user_info_modify(@PathVariable("user_id") int u_id) throws SQLException {
		uDAO = new UserDAO();
		User u = uDAO.getUserRecordById(u_id);
		
		ModelAndView mav = new ModelAndView("UserAccountModify");
		mav.addObject("userkey", u);
		return mav;
	}
	
	@GetMapping("delete_user") // how could I get session attribute?
	public ModelAndView delete_user(HttpServletRequest req) throws SQLException {
		uDAO = new UserDAO();
		boolean rslt;
		
		User u= (User) session.getAttribute("login_user");
		rslt = uDAO.deleteUser(u);

		if(rslt) {
			session = req.getSession();
			session.setAttribute("success_delUser", "Deleted the User Successfully!");
		} else {
			session = req.getSession();
			session.setAttribute("Failed_delUser", "Failed to delete User, Please Try Again");
		}
		
		ModelAndView mav = new ModelAndView("UserAccountPage");
		return mav;
	}
	
	/* --------------- UserAccountModify --------------- */
	@PostMapping("submit_edit_user")
	public ModelAndView user_info_changes(@ModelAttribute("userkey") User ukey, HttpServletRequest req) throws SQLException {
		boolean rslt;
		session = req.getSession();
		
		ModelAndView mav = new ModelAndView("UserAccountPage");
		rslt = uDAO.updateUser(ukey);
		if(rslt) {
			session.setAttribute("login_user", ukey);
			session.setAttribute("success_ediUser", "Edited the User Record");
		} else {
			session.setAttribute("Failed_ediUser", "Failed to edit User, Please Try Again");
		}
		
		return mav;
		// put message for ItemModify on History page too
	}
	
	/* --------------- InputExpence --------------- */
	@GetMapping("IncomeExpense")
	public ModelAndView goto_InputExpence() {
		ModelAndView mav = new ModelAndView("IncomeExpense");
		
		return mav;
	}
	
	@PostMapping("expense_form")
	public ModelAndView create_expense_object(@ModelAttribute("itemkey") @Valid Item i, 
			BindingResult errors, HttpServletRequest req) throws SQLException{
		
		ModelAndView mav = null;
		
		if(!errors.hasErrors()) {
			mav = new ModelAndView("IncomeExpense"); 
			
			iDAO = new ItemDAO();
			iDAO.addShoppedItem(i);
			
			session = req.getSession();
			session.setAttribute("success_newEx", "Added new Expense Record Successfully!");
		} else {
			mav = new ModelAndView("IncomeExpense");
			session = req.getSession();
			session.setAttribute("Failed_addEx", "Failed to add new Expense Record, Please Try Again");
		}
		return mav;
	}
	
	/* --------------- History --------------- */
	@GetMapping("/edit_item/{item_id}")
	public ModelAndView edit_item(@PathVariable("item_id") int i_id, HttpServletRequest req) throws SQLException, ClassNotFoundException, IOException{

		iDAO = new ItemDAO();		
		Item i = iDAO.getItemRecordById(i_id);
	
		ModelAndView mav = new ModelAndView("ItemModify");
		mav.addObject("itemkey", i);

		return mav;
	}
	
	@GetMapping("delete_item/{item_id}")
	public ModelAndView delete_item(@PathVariable("item_id") int i_id, HttpServletRequest req) throws SQLException {
		iDAO = new ItemDAO();
		boolean rslt;
		
		ModelAndView mav = new ModelAndView("redirect:/History");
		rslt = iDAO.deleteShoppedItem(i_id);
		
		if(rslt) {
			List<Item> items = new ArrayList<Item>();
			items = iDAO.getAllItemRecord();
			mav.addObject("itemlist", items);
			
			session = req.getSession();
			session.setAttribute("success_delItem", "Deleted the Item Successfully!");
		} else {
			session = req.getSession();
			session.setAttribute("Failed_delItem", "Failed to delete Item, Please Try Again");
		}
		return mav;
	}
	
	/* --------------- ItemModify --------------- */
	@PostMapping("/submit_edit_item")
	public ModelAndView item_info_changes(@ModelAttribute("itemkey") Item ikey, HttpServletRequest req) throws SQLException {

		iDAO = new ItemDAO();
		boolean rslt;
		
		ModelAndView mav = new ModelAndView("History");		
		rslt = iDAO.updateShoppedItem(ikey);
		
		if(rslt) {
			List<Item> items = new ArrayList<Item>();
			items = iDAO.getAllItemRecord();
			mav.addObject("itemlist", items);
			
			session = req.getSession();
			session.setAttribute("success_ediItem", "Edited the Item Record");
		} else {
			session = req.getSession();
			session.setAttribute("Failed_ediItem", "Failed to edit Item, Please Try Again");
		}
		return mav;
	}
	
	/* --------------- SuccessRegister --------------- */
	@GetMapping("Index")
	public ModelAndView goto_Index() {
		ModelAndView mav = new ModelAndView("Index");
		
		return mav;
	}
	/* --------------- Log Out --------------- */
	@GetMapping("logout")
	public ModelAndView logout(HttpSession session, HttpServletRequest req) {
		session.invalidate();
		ModelAndView mav = new ModelAndView("Index");
		session = req.getSession();
		session.setAttribute("success_logout", "Logged out Successfully");
		
		return mav;
	}
	
	/* --------------- Go to Home page --------------- */
	@GetMapping("topPage_user")
	public ModelAndView goto_Home() {
		ModelAndView mav = new ModelAndView("topPage_user");
		
		return mav;
	}
	
	/* --------------- Go to History page --------------- */
	@GetMapping("History")
	public ModelAndView goto_History() throws SQLException {
		ModelAndView mav = new ModelAndView("History");
		
		iDAO = new ItemDAO();
		List<Item> items = new ArrayList<Item>();
		items = iDAO.getAllItemRecord();

		mav.addObject("itemlist", items);
		return mav;
	}
	
	/* --------------- Go to UserAccountPage --------------- */
	@GetMapping("UserAccountPage")
	public ModelAndView goto_UserAccountPage(HttpServletRequest req) {

		session = req.getSession();
		// Get the user object at this Session
		session.getAttribute("login_user");
		
		ModelAndView mav = new ModelAndView("UserAccountPage");
		
		return mav;
	}
}
