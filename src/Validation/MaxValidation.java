/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Max;
import Validate.AbstractValidate;

/**
 *
 * @author tamnnq
 */
public class MaxValidation extends AbstractValidation<Max> {

    private int max;

    @Override
    protected AbstractValidate init(Max annotation) {
        max = annotation.value();
        return null;
    }

    @Override
    protected String getMessage(Max annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Max annotation) {
        return annotation.target();
    }

    @Override
    protected Class<? extends AbstractValidate> getValidate(Max annotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
