/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentipo;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ordenador
 */
public class ExamenTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int M = 3;
        int matriz[][] = {{1, 2, 1},
                          {4, 5, 6}, 
                          {6, 7, 6}};

        System.out.println(diagonaIguales(matriz));

    }

    private static boolean diagonaIguales(int[][] matriz) {
        boolean iguales = true;
        for (int i = 0; i < matriz.length && iguales; i++) {
            iguales = (matriz[i][i] == matriz[i][matriz[0].length - 1 - i]) && iguales;
        }
        return iguales;
    }

    private static void letras(String palabra, int n) {
        if (n < palabra.length()) {
            if (palabra.charAt(n) == 'V') {
                System.out.println(palabra.charAt(n));
                letras(palabra, n + 1);

            } else if (palabra.charAt(n) == 'A' || palabra.charAt(n) == 'I') {
                letras(palabra, n + 1);

                System.out.println(palabra.charAt(n));
            } else {
                letras(palabra, n + 1);
            }
        }
    }

    private static void metodo(int[] c1, int c2) {
        for (int i = 0; i < c1.length; i++) {
            c1[i] = c2 * c1[i];
        }

    }

    private static int factorialRecursivoCompacto(int n) {
        return n > 1 ? factorialRecursivoCompacto(n - 1) * n : 1;
    }

    private static int factorialRecursivo(int n) {
        int resultado = 1;
        if (n > 1) {
            resultado = n * factorialRecursivo(n - 1);
        }
        return resultado;
    }

    private static int sumaRecursivo(int n) {
        int resultado;
        if (n == 1) {
            resultado = 1;
        } else {
            resultado = sumaRecursivo(n - 1) + n;
        }
        return resultado;
    }

    private static double sumaTelescopicaRecursivo(int n) {
        double resultado = 0;
        if (n >= 1) {
            if (n == 1) {
                resultado = 1;
            } else {
                resultado = 1 + 1 / (n * (sumaTelescopicaRecursivo(n - 1)));
            }
        }
        return resultado;
    }

}
