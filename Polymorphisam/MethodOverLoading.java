package Polymorphisam;

public class MethodOverLoading{
    void eat()
    {
        System.out.println("ghost is eating");
    }

    void eat(String name)
    {
        System.out.println(name +" is eating");
    }
}
