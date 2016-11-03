package com.spring.test;

import com.spring.output.OutputHelper;
import com.spring.output.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by donar on 2016/11/2.
 */
public class App {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext(
        //        "applicationContext.xml"); HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        //obj.printHello();
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});

        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context2.getBean("helloBean");

        obj.setName("hihihi");
        obj.printHello();
        ApplicationContext context3 = new ClassPathXmlApplicationContext("SetFactoryBean.xml");

        Customer cust = (Customer)context3.getBean("CustomerBean");
        System.out.println(cust);

        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] { "Spring-Customer.xml" });

        CustomerService cust1 = (CustomerService) appContext.getBean("customerServiceProxy");

        System.out.println("*************************");
        cust1.printName();
        System.out.println("*************************");
        cust1.printURL();
        System.out.println("*************************");
        try {
            cust1.printThrowException();
        } catch (Exception e) {

        }

    }

}
