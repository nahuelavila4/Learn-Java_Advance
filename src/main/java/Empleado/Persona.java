/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author nahuel
 */
public class Persona{
    public static void main(String[] args) {
        Pers[] laspers = new Pers[2];
        laspers[0] = new Empleado2("Luis", 45999, 2005, 4, 4);
        laspers[1] = new Alumno("Leandro", "Quimica");
        
        for(Pers e: laspers){ //Foreach: se pone primero clase, despues var y nombre array
            System.out.println("Nombre: "+e.get_nombre()+"Descripcion: "+e.get_descrp());
        }
    }
}
abstract class Pers{
    private String nombre;
    public Pers(String nombre){
        this.nombre = nombre;
    }
    public String get_nombre(){
        return nombre;
    }
    public abstract String get_descrp();
}

class Alumno extends Pers{
    private String carrera;
    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera = carrera;
    }
    public String get_carrera(){
        return carrera;
    }     
    public String get_descrp(){
        return "Este alumno estudia la carrera de "+carrera;
    }
}

class Empleado2 extends Pers{
    private double sueldo;
    private Date altacontrato;
    private int Id;
    private static int Idsiguiente;
    
    public Empleado2(String nombre, double sueldo, int anio, int mes, int dia){
        super(nombre);
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
        this.altacontrato = calendario.getTime();
        ++Idsiguiente;
        Id = Idsiguiente;
    }
    public String get_descrp(){
        return "Este empleado tiene in ID: "+Id+" con un sueldo";
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
