
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jgmontoya
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.nombre = "luffy";
        perro.makeNoise();
        perro.correr();
        
        
        Perro firulay=new Perro(10, "firulay", 5, "Dalmata");
        firulay.correr();
                
        Ave ave=new Ave(2, "Roberto", 2, "Loro");
        ave.makeNoise();

        Animal animal = perro;//el perro es un animal.
        animal.q = 1;//accedo al animal atraves del objeto de un perro
        System.out.println(animal.getClass());

        //Perro perro2 =  animal;//un animal no es un perro, da error
        Perro perro2 = (Perro) animal;//toca hacer el casting
        System.out.println(perro2.nombre);
        

        Object objeto = perro;//el perro es un objeto
        System.out.println(objeto.getClass());
        Perro perro3 = (Perro) objeto;//toca hacer el casting
        System.out.println(perro3.nombre);

        if (objeto instanceof Ave) { //saber si un objeto es instancia
            System.out.println("El objeto no es instancia de un Ave");
        }
        /*
        try {
            Class miclase = Class.forName("Perro");
            System.out.println(miclase.getClass());
            Animal p = (Animal) miclase.newInstance();
            System.out.print("El " + p.getClass().getSimpleName() + " hace el sonido:");
            p.makeNoise();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
