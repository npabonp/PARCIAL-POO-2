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
public class Sensor {
    private Temperatura temperatura;
    private CargaElectrica cargaE;
    private AguaLLuvia agua;

    public Sensor(Temperatura temperatura, CargaElectrica cargaE, AguaLLuvia agua) {
        this.temperatura = temperatura;
        this.cargaE = cargaE;
        this.agua = agua;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public CargaElectrica getCargaE() {
        return cargaE;
    }

    public void setCargaE(CargaElectrica cargaE) {
        this.cargaE = cargaE;
    }

    public AguaLLuvia getAgua() {
        return agua;
    }

    public void setAgua(AguaLLuvia agua) {
        this.agua = agua;
    }
    
    
}
