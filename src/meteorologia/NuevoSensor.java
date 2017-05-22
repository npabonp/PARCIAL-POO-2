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
public abstract class NuevoSensor {

    protected String marca;
    protected String referencia;
    protected String f_Instalacion;

    public NuevoSensor(String marca, String referencia, String f_Instalacion) {
        this.marca = marca;
        this.referencia = referencia;
        this.f_Instalacion = f_Instalacion;
    }
    public abstract String listar();
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getF_Instalacion() {
        return f_Instalacion;
    }

    public void setF_Instalacion(String f_Instalacion) {
        this.f_Instalacion = f_Instalacion;
    }



}
