/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.NotNull;
import Validate.NotNullValidate;

/**
 *
 * @author tamnnq
 */
public class NotNullValidation extends AbstractValidation<NotNull,NotNullValidate> {

    @Override
    protected void init(NotNull annotation) {
    }

    @Override
    protected String getMessage(NotNull annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(NotNull annotation) {
        return annotation.target();
    }

}
