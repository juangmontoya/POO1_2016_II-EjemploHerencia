/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Perro extends Animal{    
    private int nivelOlfato;

    public Perro() {
        super(null, 0, null);
    }

    public Perro(int nivelOlfato, String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.nivelOlfato = nivelOlfato;
        
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Guau Guau ..");                
    }
    
    public void correr(){
        System.out.println(nombre+" está corriendo ..");
    }
}
