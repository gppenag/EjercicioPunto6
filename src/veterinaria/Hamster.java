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
public class Hamster extends Mascota {
    private double peso;

    public Hamster(double peso, String id, String nombre, String colorCabello) {
        super( id, nombre, colorCabello );
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Hamster{" + "peso=" + peso + '}'+super.toString();
    }

    @Override
    public String sound() {
        return "snif";
    }


    
    
}
