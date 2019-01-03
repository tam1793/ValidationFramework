/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import com.sun.istack.internal.NotNull;

/**
 *
 * @author tamnnq
 */
public class NotNullConstraint implements ConstraintInterface<NotNull, Object> {

    @Override
    public void initialize(NotNull annotation) {
    }

    @Override
    public boolean isValid(Object value) {
        return value != null;
    }

}
