package com.app.daily.classes;

public class Person {

    private String name;
    private int old;
    private double salary;

    public Person() {
        super();
    }

    public Person(String name, int old, double salary) {
        this.name = name;
        this.old = old;
        this.salary = salary;
    }

    public Person(String name, int old) {
        this.name = name;
        this.old = old;
        this.salary = -1;
    }

    public static void main(String[] args) throws Exception {
    }

    public void displayInfo() {
        System.out.printf("Bonjour Mr/Mme votre nom est %s ", this.name);
        System.out.printf("Votre âge est %d ans ", this.old);
        if (this.salary == -1)
            System.out.println("Salaire non fourni");
        else
            System.out.printf("Vous avez un salaire de %f FCFA", this.salary);
        System.out.println("--------------------- Fin ---------------------------------------'");
    }
}
