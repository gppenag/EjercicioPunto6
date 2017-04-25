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
public class Gato extends Mascota {
    private boolean cazador;

    public Gato(boolean Cazador, String id, String nombre, String colorCabello) {
        super(id, nombre, colorCabello);
        this.cazador = Cazador;
    }

    public boolean isEsCazador() {
        return cazador;
    }

    public void setEsCazador(boolean esCazador) {
        this.cazador = esCazador;
    }

    @Override
    public String toString() {
        return "Gato{" + "esCazador=" + cazador + '}'+super.toString();
    }

    @Override
    public String sound() {
        return "miau";
    }
    

    
}
