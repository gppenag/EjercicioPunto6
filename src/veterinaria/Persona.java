/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author gipao
 */
public class Persona {
    private String nombre;
    private String id;
    private ArrayList<Mascota>mascotas;

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.mascotas = new ArrayList<>();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void showPets(){
        for(Mascota m : mascotas){
        System.out.println(m.toString());
    }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", mascotas=" + mascotas + '}';
    }
}
