/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Animal {
    public String nombre;
    public int edad;
    public String raza;
    private int p; //Atributo privado no se hereda   
    protected int q;//tambien se hereda

    //Constructor
    public Animal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }    
    
    public void makeNoise(){
        System.out.println("....");
    }
    
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
}
