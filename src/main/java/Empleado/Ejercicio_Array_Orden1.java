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
public class Ejercicio_Array_Orden1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] valores = new int[5];
        int[] auxiliar = new int[valores.length];
        for(int r = 0; r < valores.length; r++){
            System.out.println("Ingrese el valor "+(r+1));
            valores[r] = teclado.nextInt();
        }
        //revertir
        int reverse_length;
        System.out.println("Array invertido");
        for(int r = 0; r < valores.length; r++){
            reverse_length = (valores.length) -r-1;
            auxiliar[r] = valores[reverse_length];
        }
        for(int x = 0; x < auxiliar.length; x++){
            System.out.println(auxiliar[x]);
        }
    }
}


