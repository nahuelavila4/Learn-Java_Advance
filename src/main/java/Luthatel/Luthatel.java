package Luthatel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahuel
 */
public class Luthatel {
    public static void main(String[] args) {
        Ciudadano civ1 = new Ciudadano();
        civ1.set_alomancia("no");
        
        System.out.println(civ1.get_datos());
        System.out.println(civ1.get_alomancia());
    }
}
