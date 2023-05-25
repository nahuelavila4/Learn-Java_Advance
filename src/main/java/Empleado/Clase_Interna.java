/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author nahuel
 */
public class Clase_Interna {
    public static void main(String[] args) {
        Reloj mireloj = new Reloj(6000, true);
        mireloj.Arrancar();
        JOptionPane.showMessageDialog(null, "Pulsa para terminar");
        System.exit(0);
    }
}

class Reloj{
    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    private int intervalo;
    private boolean sonido;
    
    public void Arrancar(){
        ActionListener oyente = new DameHora2();
        Timer temporizador = new Timer(intervalo, oyente);
        temporizador.start();
    }
    
    //Inner class
    class DameHora2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Date hora = new Date();
            Toolkit tk = Toolkit.getDefaultToolkit();
            System.out.println("Hora actualizada cada 3 seg: "+hora);
            if(sonido){
                tk.beep();
            }
        }
    }
}