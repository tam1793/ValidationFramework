/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import Annotation.NonDigitString;

/**
 *
 * @author tamnnq
 */
public class NonDigitStringValidate extends AbstractValidate<NonDigitString> {

    @Override
    protected boolean validate(Object value) {
        if(value == null) return false;
        if(value instanceof String){
            String data = (String) value;
            for(char ch : data.toCharArray()){
                if(Character.isDigit(ch)){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }

    @Override
    public void init(NonDigitString annotation) {
    }

}
