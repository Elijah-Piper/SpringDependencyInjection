package org.genspark;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        // XML CONTEXT
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("contextXML.xml");

        Student studentXML = (Student) contextXML.getBean("Student");

        System.out.println("XML configuration: " + studentXML);



        // ANNOTATION CONTEXT
        ApplicationContext contextAnnotations = new ClassPathXmlApplicationContext("contextAnnotations.xml");

        Student studentAnnotations = (Student) contextAnnotations.getBean("student");

        System.out.println("Annotation configuration: " + studentAnnotations);



        // JAVA-BASED CONTEXT
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(AppConfig.class);

        Student studentJava = (Student) contextJava.getBean(Student.class);

        System.out.println("Java-based configuration: " + studentJava);
    }
}
