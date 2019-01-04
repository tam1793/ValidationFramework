package classdemo;


import Annotation.Max;
import Annotation.Min;
import Annotation.NotNull;
import Annotation.Null;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tamnnq
 */
public class ClassDemo {

    public class User {

        @NotNull()
        String name;

        @Min(message = "You are to young", value = 15)
        @Max(30)
        Integer age;

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
}
