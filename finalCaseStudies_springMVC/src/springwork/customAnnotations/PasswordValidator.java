package springwork.customAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator
	implements ConstraintValidator<PasswordConstraint, String>{
		/*
		Password must contain at least one capital letter, 
		at least one number and at least one of the following characters: 
		 !, @, #, $, %, ^, &, *
		*/
		public static final Pattern VALID_PASSWORD_REGEX = Pattern
				.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$",
				Pattern.CASE_INSENSITIVE);
		
		public static boolean validate(String passwordStr) {
			Matcher matcher =  VALID_PASSWORD_REGEX.matcher(passwordStr);
			return matcher.find();
		}
		
		@Override
		public void initialize(PasswordConstraint arg0) {
			
		}
		@Override
		public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
			return(validate(arg0)&&(arg0.length()>8)&&(arg0.length()<30));
		}
}
