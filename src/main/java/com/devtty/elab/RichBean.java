package com.devtty.elab;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named("richBean")
public class RichBean implements Serializable {

    private static final long serialVersionUID = -2403138958014741653L;
    private String name;

    public RichBean() {
        System.out.println("post construct: initialize");
        name = "John";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
