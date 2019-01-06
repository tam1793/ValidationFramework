/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation.Validate;

import Annotation.Positive;

/**
 *
 * @author tamnnq
 */
public class PositiveValidate extends AbstractValidate<Positive> {

    @Override
    protected boolean validate(Object value) {
        if (value == null) {
            return true;
        }
        if (value instanceof Number) {
            return (Integer) value > 0;
        }
        return false;
    }

    @Override
    public void init(Positive annotation) {
    }
}
