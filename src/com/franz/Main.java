package com.franz;

import com.franz.aspect.PrintHaha;
import com.franz.autowiring.A;
import com.franz.autowiring.B;
import com.franz.components.*;
import com.franz.setter_examples.Employee;
import com.franz.util.MyStatic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person franz = (Person) context.getBean("franz");
        Pet doggo = (Pet) context.getBean("doggo");
        ToDo todo = (ToDo) context.getBean("todo");
        Person franzVincent = (Person) context.getBean("franzVincent");
        PersonsList pl = (PersonsList) context.getBean("personList");
        KeyValue k = (KeyValue) context.getBean("myMap");
        Employee e1 = (Employee) context.getBean("emp1");
        A a = context.getBean("a", A.class);
        PrintHaha p = (PrintHaha) context.getBean("proxy");

        p.print();
//        a.display();
//        e1.printEmployee();
//        franz.printName();
//        franzVincent.printName();
//        franzVincent.printPetName();
//        franzVincent.printMyTodo();
//        MyStatic.printName(franz.getFirstName());
//        MyStatic.printName(doggo.getName());
//
//        System.out.println("\n== Person List ==");
//        pl.printPersonList();
//
//        System.out.println("\n == Map ==");
//        MyStatic.printKeyValue(k);
    }
}
