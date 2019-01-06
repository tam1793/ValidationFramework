/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import Annotation.MaxInteger;

/**
 *
 * @author tamnnq
 */
public class MaxIntegerValidate extends AbstractValidate<MaxInteger> {

    private int max;

    @Override
    protected boolean validate(Object value) {
        if (value == null) {
            return true;
        }
        if (value instanceof Integer) {
            return (Integer) value <= max;
        }
        return false;
    }

    @Override
    public void init(MaxInteger annotation) {
        this.max = annotation.value();
    }

}
