/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation.Validate;

import Annotation.MinInteger;

/**
 *
 * @author tamnnq
 */
public class MinIntegerValidate extends AbstractValidate<MinInteger> {

    private int min;

    @Override
    protected boolean validate(Object value) {
        if (value == null) {
            return true;
        }
        if (value instanceof Integer) {
            return (Integer) value >= min;
        }
        return false;
    }

    @Override
    public void init(MinInteger annotation) {
        this.min = annotation.value();
    }

}
