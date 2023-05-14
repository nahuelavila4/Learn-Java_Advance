package Luthatel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahuel
 */
public class Ciudadano {
    private int edad;
    private double altura;
    private boolean alomancia;
    public Ciudadano(){
       edad = 30;
       altura = 1.7;
       alomancia = false;
    }
    
    public String get_datos(){
        return "El ciudadano tiene "+edad+" años de edad"+
                ". Mide "+altura+" m";
    }
    public void set_alomancia(String alomancia){
        if(alomancia == "si"){
            this.alomancia = true;
        }else{
            this.alomancia = false;
        }
    }
    public String get_alomancia(){
        if(this.alomancia){
            return "El ciudadano tiene alomancia";
        }else{
            return "El ciudadano no tiene alomancia";
        }
    }
}
