/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import java.util.Arrays;

/**
 *
 * @author nahuel
 */
public class Uso_Empleado {
    
    public static void main(String[] args) {
        Jefe jefe1 = new Jefe("Oscar", 84688, 2015, 7, 13);
        jefe1.set_incentivo(3946.34);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Lucas", 13444, 2020, 3, 4);
        misEmpleados[1] = new Empleado("Roberto", 12144, 2020, 6, 17);
        misEmpleados[2] = new Empleado("Sofia", 13444, 2013, 10, 24);
        misEmpleados[3] = new Empleado("Julieta", 4224, 2020, 7, 4);
        misEmpleados[4] = jefe1;//Polimorfismo Metodo de Sustitucion
        misEmpleados[5] = new Jefe("Georgina", 8984, 2022,4, 11);
       
        //Casting
        Jefe jefe2 = (Jefe) misEmpleados[5];
        jefe2.tomar_decisiones("Irse antes");
        jefe2.set_incentivo(10000);
        
        for(Empleado e: misEmpleados){
            e.set_subirsueldo(4000.5);
        }
        
        Arrays.sort(misEmpleados);
        
        //Los obj de tipo Jefe tienen mas dinero porque llama a get_sueldo desde
        //su clase, donde el metodo esta sobreescrito y reciben un incentivo
        //Esto se llama Enlazado Dinamico
        for(Empleado e: misEmpleados){
            System.out.println("ID: "+e.get_id()+", Sueldo: $"+e.get_sueldo()+", Fecha de Alta: "+e.get_altacontrato());
        }
    }
}
