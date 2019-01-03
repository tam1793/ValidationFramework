/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.Max;
import com.sun.istack.internal.NotNull;

/**
 *
 * @author tamnnq
 */
public class MaxConstraint implements ConstraintInterface<Max, Integer> {

    private int max;
    
    @Override
    public void initialize(Max annotation) {
        max = annotation.value();
    }

    @Override
    public boolean isValid(Integer value) {
        if (value == null){
            return true;
        };
        
        return value <= max;
    }

}
