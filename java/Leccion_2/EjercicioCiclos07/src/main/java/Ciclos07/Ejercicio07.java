/*
Ejercicio 7: Le pedimos numeros al usuario hasta que se introduzca
uno negativo y se calcula el promedio

*/
package Ciclos07;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio07 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){ // Mientras el número no sea negativo
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        if (conteo == 0) {
            JOptionPane.showMessageDialog(null, "\nError, La división entre cero no existe"); 
        }
        else{
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        }
    }    
}