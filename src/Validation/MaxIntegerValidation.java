/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.MaxInteger;

/**
 *
 * @author tamnnq
 */
public class MaxIntegerValidation extends AbstractValidation<MaxInteger> {

    private int max;

    @Override
    protected void init(MaxInteger annotation) {
        max = annotation.value();
    }

    @Override
    protected String getMessage(MaxInteger annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(MaxInteger annotation) {
        return annotation.target();
    }

}
