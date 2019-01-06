/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.MaxInteger;
import Validate.MaxIntegerValidate;

/**
 *
 * @author tamnnq
 */
public class MaxIntegerValidation extends AbstractValidation<MaxInteger,MaxIntegerValidate> {

    private String message;
    private String target;

    @Override
    protected String getMessage() {
        return this.message;
    }

    @Override
    protected String getTarget() {
        return this.target;
    }

    @Override
    protected Class<? extends AbstractValidate> getValidate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(MaxInteger annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

}
