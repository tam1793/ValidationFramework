/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidationContext;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

/**
 *
 * @author tamnnq
 */
public class MetaData<T extends Annotation, K> {

    String fieldName;
    K value;
    ArrayList<ValidationContext> constraints;

    public MetaData(String fieldName, K value, ArrayList<ValidationContext> constraints) {
        this.fieldName = fieldName;
        this.value = value;
        this.constraints = constraints;
    }

    public void add(ValidationContext context) {
        this.constraints.add(context);
    }

    public String getFieldName() {
        return fieldName;
    }

    public K getValue() {
        return value;
    }

    public ArrayList<ValidationContext> getConstraints() {
        return constraints;
    }

}
