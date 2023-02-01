package com.app.daily;

import com.app.daily.classes.Person;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("------ Hey bienvenue sur votre application console ---------------");

        Person firstPerson = new Person();
        System.out.println("------- Print of first person --------");
        firstPerson.displayInfo();

        Person secondPerson = new Person("mr bank's", 22, 1500000);
        System.out.println("------- Print of second person --------");
        secondPerson.displayInfo();

        Person thirdPerson = new Person("mr bank's", 22);
        System.out.println("------- Print of third person --------");
        thirdPerson.displayInfo();

    }

}
