/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author tamnnq
 */
public class LengthValidate extends AbstractValidate {

    private int min;
    private int max;

    @Override
    protected boolean validate(Object value) {
        if (value == null) {
            return true;    
        };
        
        int length = -1;
        if(value instanceof String) {
            length = ((String)value).length();
        } else if(value instanceof Collection) {
            length = ((Collection)value).size();
        }else if(value instanceof Map) {
            length = ((Map)value).size();
        }
        return length >= min && length <= max;
    }

    public void setMaxLength(int maxLength) {
        this.max = maxLength;
    }
    
    public void setMinLength(int minLength) {
        this.min = minLength;
    }
    
}