/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author nahuel
 */
public class Primer_Temporizador {
    public static void main(String[] args) {
        ActionListener oyente = new DameHora();
        Timer temporizador = new Timer(5000, oyente);
        temporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0);
    }
}

//Metodo Timer pide usar interfaz ActionListener
//ActionListener pide actionPerformed
class DameHora implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Hora actual: "+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}