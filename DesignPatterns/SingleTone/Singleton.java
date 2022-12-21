package DesignPatterns.SingleTone;

// we use singleton design when we want to instanciate the constructe as it called and only instanciate ones
//types of the singletone
// 1. egar signgleton.
// 2. lazy sigleton. (widlu used)
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
