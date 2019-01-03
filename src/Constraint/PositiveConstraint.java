/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.Positive;

/**
 *
 * @author tamnnq
 */
public class PositiveConstraint implements ConstraintInterface<Positive, Integer> {

    @Override
    public void initialize(Positive annotation) {
    }

    @Override
    public boolean isValid(Integer value) {
        return value >0;
    }

}
