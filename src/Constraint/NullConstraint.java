/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import Annotation.Null;


/**
 *
 * @author tamnnq
 */
public class NullConstraint implements ConstraintInterface<Null, Object> {

    @Override
    public void initialize(Null annotation) {
    }

    @Override
    public boolean isValid(Object value) {
        return value == null;
    }

}
