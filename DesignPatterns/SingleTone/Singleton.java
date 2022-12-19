package DesignPatterns.SingleTone;

public class Singleton {
    private static volatile Singleton INSTANCE;
    String s;
    String t;
    private Singleton() {
        s = "hello";
        t = "hello hi";
    }
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
