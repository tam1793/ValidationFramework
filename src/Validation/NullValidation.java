/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Null;

/**
 *
 * @author tamnnq
 */
public class NullValidation extends AbstractValidation<Null> {

    @Override
    protected void init(Null annotation) {
    }

    @Override
    protected String getMessage(Null annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Null annotation) {
        return annotation.target();
    }

}
