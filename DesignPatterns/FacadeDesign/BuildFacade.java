package DesignPatterns.FacadeDesign;

import java.util.List;

public class BuildFacade {
    private TV tv;
    private Light light;
    private Sound sound;

    public BuildFacade(TV tv, Light light, Sound sound) {
        this.tv = tv;
        this.light = light;
        this.sound = sound;
    }

    public void watchingTv() {
        tv.TVOn();
        light.lightOn();
        sound.soundOn();
    }

    public void notWatchingTv() {
        tv.TVOff();
        light.lightOff();
        sound.soundOff();
    }
}
