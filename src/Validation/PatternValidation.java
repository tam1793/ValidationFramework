/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author tamnnq
 */
public class PatternValidation extends AbstractValidation<Pattern> {

    private String pattern;

    @Override
    protected void init(Pattern annotation) {
        pattern = annotation.value();
    }

    @Override
    protected String getMessage(Pattern annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Pattern annotation) {
        return annotation.target();
    }

}
