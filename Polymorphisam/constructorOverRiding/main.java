package Polymorphisam.constructorOverRiding;

public class main {

    public static void main(String[] args)
    {
        Tiger tiger = new Lion();
        tiger.Strong("lion");

        Lion lion = new Lion();
        lion.Strong("lion");
    }
}
