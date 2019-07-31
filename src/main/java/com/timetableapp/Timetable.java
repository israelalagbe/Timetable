package com.timetableapp;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;
import static org.controlsfx.control.action.ActionMap.actions;

public class Timetable extends ParticleApplication {

    public Timetable() {
        super("Timetable Application");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(Timetable.class.getResource("style.css").toExternalForm());

        setTitle("Timetable Application");

        //getParticle().buildMenu("File -> [exit]", "Help -> [about]");
        
        //getParticle().getToolBarActions().addAll(actions("---", "about", "exit"));
    }
}