package com.nttdata.builder;

public class CocheBuilder {

    private String tapiceria;
    private int caballos;
    private String color;

  //Getters and Setters  
    public String getTapiceria() {
        return tapiceria;
    }

    public void setTapiceria(String tapiceria) {
        this.tapicería = tapicería;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  //Builder
    
    private CocheBuilder(BuilderCar builder) {
        
       this.tapicería=builder.tapiceria;
       this.caballos=builder.caballos;
    }
 
    
}