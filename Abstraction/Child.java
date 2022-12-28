package Abstraction;

public class Child extends Parent{
    private String theName;

    public Child(String name, String theName) {
        super(name);
        this.theName = theName;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    @Override
    void sleep() {
       System.out.println(theName + " is sleeping");
    }
}
