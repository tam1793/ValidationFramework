/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.Min;

/**
 *
 * @author tamnnq
 */
public class MinConstraint implements ConstraintInterface<Min, Integer> {

    private int min;
    
    @Override
    public void initialize(Min annotation) {
        min = annotation.value();
    }

    @Override
    public boolean isValid(Integer value) {
        if (value == null){
            return true;
        };
        
        return value >= min;
    }

}
