/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import java.util.*;

/**
 *
 * @author nahuel
 */
public class Empleado implements Comparable, Trabajador_Bonus{//implementamos interfaz Comparable
    
    private String nombre;
    private double sueldo;
    private Date altacontrato;
    private int Id;
    private static int Idsiguiente;
   
        
    //Interfaces
    public int compareTo(Object miObj){ //compareTo debe recibir parametro de tipo Objeto
        Empleado otroEmp = (Empleado) miObj;
        if(this.sueldo < otroEmp.sueldo){
            return -1;
        }
        if(this.sueldo > otroEmp.sueldo){
           return 1; 
        }
        return 0;
    }
    
    public double establece_bonus(double plata){
        return Trabajador_Bonus.minimo+plata;
    }
    
    //Constructores
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
        this.altacontrato = calendario.getTime();
        ++Idsiguiente;
        Id = Idsiguiente;
    }
    public Empleado(String nombre){ //Constructor si solo recibo nombre
        this(nombre, 60000, 2023, 5, 5);
    }
    
    //Metodos Getter y Setter
    public String get_nombre(){
        return nombre;
    }
    public double get_sueldo(){
        return sueldo;
    }
    public int get_id(){
        return Id;
    }
    public Date get_altacontrato(){
        return altacontrato;
    }
    public void set_subirsueldo(double porcentaje){
        double aumento = this.sueldo*porcentaje/100;
        this.sueldo += aumento;
    }
}
