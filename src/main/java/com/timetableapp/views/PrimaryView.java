package com.timetableapp.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.timetableapp.controllers.PrimaryController;

@ParticleView(name = "primary", isDefault = true)
public class PrimaryView extends FXMLView {
    
    public PrimaryView() {
        super(PrimaryView.class.getResource("primary.fxml"));
    }
    
    @Override
    public void start() {
        ((PrimaryController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((PrimaryController) getController()).dispose();
    }
    
}
