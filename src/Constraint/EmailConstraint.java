/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.Email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tamnnq
 */
public class EmailConstraint implements ConstraintInterface<Email, String> {

    private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    @Override
    public void initialize(Email annotation) {
        
    }

    @Override
    public boolean isValid(String value) {
        if (value == null){
            return false;
        };
        Pattern pattern;
	Matcher matcher;
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
