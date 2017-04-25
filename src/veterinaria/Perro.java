/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author gipao
 */
public class Perro extends Mascota {
    private String raza;

    public Perro(String Raza, String id, String nombre, String colorCabello) {
        super(id, nombre, colorCabello);
        this.raza = Raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String Raza) {
        this.raza = Raza;
    }

    
    @Override
    public String toString() {
        return "Perro{" + "Raza=" + raza + '}'+super.toString();
    }

    @Override
    public String sound() {
        return "Guau";
    }
    
        
}
