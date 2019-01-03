/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.Length;
import com.sun.istack.internal.NotNull;

/**
 *
 * @author tamnnq
 */
public class LengthConstraint implements ConstraintInterface<Length, String> {

    private int min;
    private int max;
    
    @Override
    public void initialize(Length annotation) {
        min = annotation.min();
        max = annotation.max();
    }

    @Override
    public boolean isValid(String value) {
        if (value == null){
            return true;
        };
        int length = value.length();
        return length >= min && length <= max;
    }

}
