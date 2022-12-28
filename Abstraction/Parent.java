package Abstraction;

import javax.management.ObjectName;

abstract class Parent{
    private String name;

    Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void eat()
    {
        System.out.println(name + " is eating");
    }
    abstract void sleep();

    static void read()
    {
         System.out.println("qjdbnqwjndqd");
    }

    //in abstract class you can define abstract methods and normal methods
}
