/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import Annotation.MinInteger;
import java.util.Collection;
import java.util.Map;

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
            return (Integer)value >= min;
        }
        return false;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public void init(MinInteger annotation) {
        this.min = annotation.value();
    }

}
