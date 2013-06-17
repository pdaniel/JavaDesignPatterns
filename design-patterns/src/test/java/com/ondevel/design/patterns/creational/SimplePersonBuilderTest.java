package com.ondevel.design.patterns.creational;


import com.ondevel.design.patterns.creational.builder.SimplePersonBuilder;
import org.junit.Test;

/**
 *
 * Author: Daniel
 * Date: 6/17/13
 * Time: 6:06 PM
 *
 */

public class SimplePersonBuilderTest {

   @Test
    public void testSimpleBuilder(){
       //we are building our object
       SimplePersonBuilder person = new SimplePersonBuilder.Builder().withAge(29).withFirstName("Marco").withLastName("Polo").build();
       assert person.getAge()==29 && "Marco".equals(person.getFirstName()) && "Polo".equals(person.getLastName());
   }
}
