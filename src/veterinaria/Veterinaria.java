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
public class Veterinaria {
   private String nombre; 
   private ArrayList<Mascota>mascotas;

    public Veterinaria(String nombre) {
         this.nombre = nombre;
         this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

 public void eliminarPet(Mascota p){
     int index = mascotas.indexOf( p );
     if ( index != -1 )
         mascotas.remove( index );
 }
 
 Mascota buscarMascota(String m){
     for(Mascota miMascota:mascotas){
         if(miMascota.getNombre().equals(m)){
             return miMascota;
         }
     }        
     return null;   
 }
 
 public void mostrarPorTipo(String t){
     switch(t)
     {
         case "Perro":
         for ( Mascota m : mascotas )
             if ( m instanceof Perro )
                 System.out.println( ( Perro ) m );
            break;
            
         case "Gato":
         for ( Mascota m : mascotas )
             if ( m instanceof Gato )
                 System.out.println(( Gato ) m );
         break;
         
         case "Hamster":
         for ( Mascota m : mascotas )
             if ( m instanceof Hamster )
                 System.out.println(( Hamster ) m);
         break;
     }
 }
 public void mostrarPet(){
     for(Mascota m: mascotas){
         System.out.println( m );
     }
 }
}
