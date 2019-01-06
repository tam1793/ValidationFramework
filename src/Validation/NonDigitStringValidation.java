/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.NonDigitString;

/**
 *
 * @author tamnnq
 */
public class NonDigitStringValidation extends AbstractValidation<NonDigitString> {

    @Override
    protected void init(NonDigitString annotation) {
    }

    @Override
    protected String getMessage(NonDigitString annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(NonDigitString annotation) {
        return annotation.target();
    }
}
