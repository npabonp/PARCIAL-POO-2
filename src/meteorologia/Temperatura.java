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
public class Temperatura extends NuevoSensor{
    private String temp;

    public Temperatura(String temp, String marca, String referencia, String f_Instalacion) {
        super(marca, referencia, f_Instalacion);
        this.temp = temp;
    }
        
    @Override
    public String listar() {
      return super.toString();  
    }
}
