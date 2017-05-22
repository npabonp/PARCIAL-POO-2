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
public class CargaElectrica extends NuevoSensor{
    public static final String [] NIVEL ={"1-Tormenta Electrica",
        "2-Rayos","3-Truenos","4-Normal"};
    public String nivel;

    public CargaElectrica(String nivel, String marca, String referencia, String f_Instalacion) {
        super(marca, referencia, f_Instalacion);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String listar() {
        return super.toString();
    }


    
}
