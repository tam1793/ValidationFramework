/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Positive;
import Validate.PositiveValidate;

/**
 *
 * @author tamnnq
 */
public class PositiveValidation extends AbstractValidation<Positive,PositiveValidate> {

    @Override
    protected void init(Positive annotation) {
    }

    @Override
    protected String getMessage(Positive annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Positive annotation) {
        return annotation.target();
    }

}
