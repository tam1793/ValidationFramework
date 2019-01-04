/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.NonDigitString;

/**
 *
 * @author tamnnq
 */
public class NonDigitStringConstraint implements ConstraintInterface<NonDigitString, String> {

    
    @Override
    public void initialize(NonDigitString annotation) {
        
    }

    @Override
    public boolean isValid(String value) {
        if (value == null){
            return false;
        }
        
        for(char ch : value.toCharArray()){
            if(Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
