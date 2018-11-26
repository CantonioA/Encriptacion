/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Cristhian
 */
@Named(value = "encriptar")
@SessionScoped
public class encriptar implements Serializable {

//    public static void main(String[] args) {
//        String contraseña;
//        contraseña = "123456";
//        int cantidad = contraseña.length();
//        System.out.println("Contraseña " + contraseña);
//        System.out.println("length: " + cantidad);
//        if (isnu) {
//            
//        }
//        for (int i = 0; i < cantidad; i++) {
//            System.out.println("extrae :" + contraseña.charAt(i));
//            int suma = Integer.parseInt(String.valueOf(contraseña.charAt(i)));
//            suma = suma * 3;
////            System.out.println(numero);
//            System.out.println(suma);
//
//        }
//    }
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static void main(String[] args) {

        String cadena = "a";
        int numero;

        if (isNumeric(cadena) == true) {
            numero = Integer.parseInt(cadena);
            int cantidad = cadena.length();
            System.out.println("Contraseña " + cadena);
            System.out.println("length: " + cantidad);
            String Resultado = "";
            for (int i = 0; i < cantidad; i++) {
                System.out.println("extrae :" + cadena.charAt(i));
                int suma = Integer.parseInt(String.valueOf(cadena.charAt(i)));
                suma = suma * 3;
                Resultado = Resultado + " " + String.valueOf(suma);
                System.out.println(suma);
                System.out.println("Numero: " + numero);
            }
            System.out.println("resultado final:" + Resultado);
        } else {
             int cantidad = cadena.length();
                 char characterValue = 'a';
            
            
            System.out.println("es texto: " + cadena);
            char characterValue = cadena.charAt(numero);
            int asciiValue = (int) characterValue;
            System.out.println(asciiValue);
        }
    }
}
