/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotaciones;

import java.lang.annotation.*;

/**
 *
 * @author Melga
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface RequestHTTPAceptados {
    public enum HTTPrequest {
        GET, POST, PUT, DELETE
     }

     HTTPrequest[] requests() default {};

}
