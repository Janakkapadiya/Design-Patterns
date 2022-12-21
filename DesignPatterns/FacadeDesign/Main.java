package DesignPatterns.FacadeDesign;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(DesignPatterns.BuilderDesign.Main.class));

    public static void main(String[] args) {

        TV tv = new TV();
        Light light = new Light();
        Sound sound = new Sound();

        BuildFacade facade = new BuildFacade(tv, light, sound);

        facade.watchingTv();
        facade.notWatchingTv();
    }
}
