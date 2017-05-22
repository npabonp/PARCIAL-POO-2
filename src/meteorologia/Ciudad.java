/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorologia;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private String nombre;
    private EstacionM[] estaciones;
    
    public Ciudad(EstacionM[] estaciones, String nombre){
        this.nombre = nombre;
        this.estaciones = estaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstacionM[] getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(EstacionM[] estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", estaciones=" + estaciones + '}';
    }
}
