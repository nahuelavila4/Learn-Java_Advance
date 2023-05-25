/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author nahuel
 */
public class Jefe extends Empleado implements Jefe_Interface{
    public Jefe(String nombre, double sueldo, int anio, int mes, int dia){
        super(nombre, sueldo, anio, mes, dia);
    }
    private double incentivo;
    
    public void set_incentivo(double b){
        incentivo = b;
    }
    
    //Interfaces
    public String tomar_decisiones(String decision){
        return "Este jefe ha tomado la decision "+ decision;
    }
    public double establece_bonus(double plata){
        double prima = 2000;
        return Trabajador_Bonus.minimo+prima+plata;
    }
    
    
    public double get_sueldo(){ //Sobreescritura de metodos de clase padre
        double sueldojefe = super.get_sueldo(); //Guarda en la var lo que retorne el metodo
        return sueldojefe + incentivo;
    }
}
