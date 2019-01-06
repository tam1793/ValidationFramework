
import Annotation.Email;
import Annotation.MaxInteger;
import ValidationResult.ValidationResult;
import Validator.Validator;
import java.util.HashMap;
import Annotation.MinInteger;
import Annotation.NotNull;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tamnnq
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static class User {

        @NotNull(message = "test mess not null")
        String name;

        @MinInteger(message = "You are to young", value = 15)
        @MaxInteger(message = "You are to old", value = 30)
        Integer age;

        @MinInteger(message = "Test field in field", value = 2, target = "this.age")
        public User user;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

    }

    @interface DemoCustom {

    }

    public static void main(String[] args) {
        User user = new User("asd", 33);
        user.user = new User("test", 0);
        ValidationResult result = Validator.getInstance().validate(user);
        if (result != null) {
            HashMap map = result.getErrorMessage();
            System.err.println(map.toString());
        }
    }

}
