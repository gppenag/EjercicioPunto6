/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**,
 *
 * @author gipao
 */
public abstract class Mascota {
protected String id;
protected String nombre;
protected String colorCabello;

    public Mascota( String id, String nombre, String colorCabello ) {
        this.id = id;
        this.nombre = nombre;
        this.colorCabello = colorCabello;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }
    
    public abstract String sound();

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", colorCabello=" + colorCabello + '}';
    }

    
}
