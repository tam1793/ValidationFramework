/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import java.util.regex.Matcher;
import Annotation.Regex;

/**
 *
 * @author tamnnq
 */
public class PatternConstraint implements ConstraintInterface<Regex, String> {

    private String pattern;
    
    @Override
    public void initialize(Regex annotation) {
        pattern = annotation.value();
    }

    @Override
    public boolean isValid(String value) {
        if (value == null){
            return false;
        }
        
        java.util.regex.Pattern myPattern;
	Matcher matcher;
        myPattern = java.util.regex.Pattern.compile(pattern);
        matcher = myPattern.matcher(value);
        return matcher.matches();
    }

}
