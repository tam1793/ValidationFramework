/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Regex;
import java.util.regex.Matcher;

/**
 *
 * @author tamnnq
 */
public class RegexValidation extends AbstractValidation<Regex> {

    private String pattern;

    @Override
    protected void init(Regex annotation) {
        pattern = annotation.value();
    }

    @Override
    protected String getMessage(Regex annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Regex annotation) {
        return annotation.target();
    }

}
