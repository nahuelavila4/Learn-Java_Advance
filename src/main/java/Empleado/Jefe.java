/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author nahuel
 */
public class Jefe extends Empleado{
    public Jefe(String nombre, double sueldo, int anio, int mes, int dia){
        super(nombre, sueldo, anio, mes, dia);
    }
    private double incentivo;
    
    public void set_incentivo(double b){
        incentivo = b;
    }
    public double get_sueldo(){ //Sobreescritura de metodos de clase padre
        double sueldojefe = super.get_sueldo(); //Guarda en la var lo que retorne el metodo
        return sueldojefe + incentivo;
    }
}
