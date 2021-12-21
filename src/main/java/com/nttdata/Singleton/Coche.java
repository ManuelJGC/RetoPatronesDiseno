package com.nttdata.Singleton;

public class Coche{
   
    private String marca;
    private static Coche coche;
    
    public Coche(String marca) {
        this.marca=marca;
        System.out.println("La marca es " + this.nombre);
    }
    
    public static Coche getSingleton(String marca) {
        if (coche == null) {
            coche = new Coche(marca);
        }
        else {
            System.out.println("No se puede crear");
        }
        return coche;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}