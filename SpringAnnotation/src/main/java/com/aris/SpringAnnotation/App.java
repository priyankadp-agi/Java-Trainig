package com.aris.SpringAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
       Test t1 = context.getBean(Test.class);
       t1.main();
    }
}