package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        // Context using Spring.xml beans
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("Spring.xml");

        Student student = (Student) contextXML.getBean("Student");
        System.out.println(student);

    }
}
