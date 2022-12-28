package Interface;

@FunctionalInterface
interface Parent{
    abstract void eat();
    default void sleep()
    {
        System.out.println("sleeping");
    }
    static void reading()
    {
       System.out.print("parent is reading");
    }
    // for the interface we can
}
