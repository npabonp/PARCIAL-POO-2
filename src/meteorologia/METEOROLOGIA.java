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
public class METEOROLOGIA {

    public static void main(String[] args) {
       Temperatura t1 = new Temperatura("15° C", "Marca X", "154XX", "22/05/17");
       CargaElectrica c1 = new CargaElectrica("2-Rayos", "Marca Y", "147yy", "22/05/17");
       AguaLLuvia a1 = new AguaLLuvia(17, "Marca ZZ", "125 zz", "22/05/17");
       
       Temperatura t2 = new Temperatura("16° C", "Marca X2", "154XX2", "23/05/17");
       CargaElectrica c2 = new CargaElectrica("3-Truenos", "Marca Y2", "147yy2", "23/05/17");
       AguaLLuvia a2 = new AguaLLuvia(18, "Marca Z2", "125 zz2", "23/05/17");
       
       Temperatura t3 = new Temperatura("18° C", "Marca X3", "154XX3", "24/05/17");
       CargaElectrica c3 = new CargaElectrica("4-Normal", "Marca Y3", "147yy3", "24/05/17");
       AguaLLuvia a3 = new AguaLLuvia(19, "Marca Z3", "125 zz3", "24/05/17");
       
       Sensor s1 = new Sensor(t1, c1, a1);
       Sensor s2 = new Sensor(t2, c2, a2);
       Sensor s3 = new Sensor(t3, c3, a3);
       
       EstacionM e1 = new EstacionM("679, Up", "10°53 N; 85°04 O; 50m", "31/12/2012");
       
    }
    
}
