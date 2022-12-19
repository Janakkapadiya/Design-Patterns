package DesignPatterns.SingleTone;

import java.util.logging.Logger;

public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {

        //singleton patterns obj
        Singleton obj = Singleton.getInstance();
        log.info(obj.s);
        log.info(obj.t);


    }
}