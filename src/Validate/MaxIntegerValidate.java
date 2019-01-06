/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author tamnnq
 */
public class MaxIntegerValidate extends AbstractValidate {

    private int max;

    @Override
    protected boolean validate(Object value) {
        if (value == null) {
            return true;
        }
        if (value instanceof Integer) {
            return (Integer)value <= max;
        }
        return false;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
