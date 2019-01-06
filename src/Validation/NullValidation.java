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
public class NullValidation extends AbstractValidation<Null,NullValidate> {

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
    public void init(NotNull annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<NullValidate> getValidate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
