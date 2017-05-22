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
public class EstacionM {
    private String nombre;
    private String ubicacion;
    private String f_instalacion;
    private Sensor[] sensores = new Sensor[3];

    public EstacionM(String nombre, String ubicacion, String f_instalacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.f_instalacion = f_instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getF_instalacion() {
        return f_instalacion;
    }

    public void setF_instalacion(String f_instalacion) {
        this.f_instalacion = f_instalacion;
    }

    public Sensor[] getSensores() {
        return sensores;
    }

    public void setSensores(Sensor[] sensores) {
        this.sensores = sensores;
    }

    @Override
    public String toString() {
        return "EstacionM{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + 
                ", f_instalacion=" + f_instalacion + ", sensores=" + sensores + '}';
    }
    
    
}
