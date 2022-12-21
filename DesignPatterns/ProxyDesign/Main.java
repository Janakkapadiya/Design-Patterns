package DesignPatterns.ProxyDesign;

import java.util.logging.Logger;

public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(DesignPatterns.SingleTone.Main.class));

    public static void main(String[] args) throws Exception {
        DatabaseExecutorProxy databaseExecutorProxy = new DatabaseExecutorProxy("NON-ADMIN","1234");
        databaseExecutorProxy.executeQuery("EXECUTE");
    }
}
