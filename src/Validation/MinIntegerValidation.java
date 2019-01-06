/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.MinInteger;

/**
 *
 * @author tamnnq
 */
public class MinIntegerValidation extends AbstractValidation<MinInteger> {

    private int min;

    @Override
    protected void init(MinInteger annotation) {
        min = annotation.value();
    }

    @Override
    protected String getMessage(MinInteger annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(MinInteger annotation) {
        return annotation.target();
    }

}
