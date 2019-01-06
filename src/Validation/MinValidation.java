/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Min;

/**
 *
 * @author tamnnq
 */
public class MinValidation extends AbstractValidation<Min> {

    private int min;

    @Override
    protected void init(Min annotation) {
        min = annotation.value();
    }

    @Override
    protected String getMessage(Min annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Min annotation) {
        return annotation.target();
    }

}
