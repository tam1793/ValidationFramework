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
public class RegexValidate extends AbstractValidate {

    private String regex;
    
    @Override
    protected boolean validate(Object value) {
        if(value == null) return false;
        if(value instanceof String){
            String data = (String) value;
            Pattern r = Pattern.compile(regex);
            return r.matcher(data).matches();
        }
        else{
            return false;
        }
    }
    
    public void setRegex(String regex) {
        this.regex = regex;
    }

}
