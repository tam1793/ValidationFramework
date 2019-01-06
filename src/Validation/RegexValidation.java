/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Regex;
import Validate.RegexValidate;
import java.util.regex.Matcher;

/**
 *
 * @author tamnnq
 */
public class RegexValidation extends AbstractValidation<Regex,RegexValidate> {

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
    public void init(Regex annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<NotNullValidate> getValidate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
