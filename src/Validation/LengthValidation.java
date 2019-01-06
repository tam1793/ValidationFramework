/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Length;

/**
 *
 * @author tamnnq
 */
public class LengthValidation extends AbstractValidation<Length> {

    private int min;
    private int max;

    @Override
    protected void init(Length annotation) {
        min = annotation.min();
        max = annotation.max();
    }

    @Override
    protected String getMessage(Length annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Length annotation) {
        return annotation.target();
    }

}
