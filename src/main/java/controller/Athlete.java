package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


public class Athlete {


    private String lasName;

    public Athlete() {

    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }


}
