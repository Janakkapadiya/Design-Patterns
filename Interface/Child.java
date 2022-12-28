package Interface;

public class Child implements Parent,Parent2{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing");
    }

    @Override
    public void sleep() {
        Parent.super.sleep();
    }


}
