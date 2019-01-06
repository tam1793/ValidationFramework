/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Max;

/**
 *
 * @author tamnnq
 */
public class MaxValidation extends AbstractValidation<Max> {

    private int max;

    @Override
    protected void init(Max annotation) {
        max = annotation.value();
    }

    @Override
    protected String getMessage(Max annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Max annotation) {
        return annotation.target();
    }

}
