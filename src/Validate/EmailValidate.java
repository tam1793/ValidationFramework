/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.regex.Pattern;

/**
 *
 * @author tamnnq
 */
public class EmailValidate extends AbstractValidate {

    private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    @Override
    protected boolean validate(Object value) {
        if(value == null) return false;
        if(value instanceof String){
            String data = (String) value;
            Pattern r = Pattern.compile(EMAIL_PATTERN);
            return r.matcher(data).matches();
        }
        else{
            return false;
        }
    }

}
