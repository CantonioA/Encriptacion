/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Arrays;

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
//    public static boolean isNumeric(String cadena) {
//
//        boolean resultado;
//
//        try {
//            Integer.parseInt(cadena);
//            resultado = true;
//        } catch (NumberFormatException excepcion) {
//            resultado = false;
//        }
//
//        return resultado;
//    }
    public static void main(String[] args) {
        String cadena = "HOLA ";
        int numero;
        String resultado = "";
        int nameLenght = cadena.length(); // contar caracteres
        for (int i = 0; i < nameLenght; i++) {   // while counting characters if less than the length add one        
            char character = cadena.charAt(i); // start on the first character
            int ascii = (int) character; //convert the first character
//            System.out.println(character + " = " + ascii); // print the character and it's value in ascii
            resultado = resultado + " " + ascii;
        }
        System.out.println(resultado);
        resultado = resultado.substring(1);// borrar el primer espacio
        resultado = resultado.replace(" ", ",");// remplazo los espacions con ','
        String[] numerocadena = resultado.split(",");
        System.out.println(Arrays.toString(numerocadena));
        for (int i = 0; i < numerocadena.length; i++) {
            numero = Integer.valueOf(numerocadena[i]);
            if (numero % 2 == 0) {
                System.out.println(" es divisible" + numero);
                numero = numero * 16;
            }
            System.out.println(numero); // desmenuzar array
        }
        
        
        

//        if (isNumeric(cadena) == true) {
//            numero = Integer.parseInt(cadena);
//            int cantidad = cadena.length();
//            System.out.println("Contraseña " + cadena);
//            System.out.println("length: " + cantidad);
//            String Resultado = "";
//            for (int i = 0; i < cantidad; i++) {
//                System.out.println("extrae :" + cadena.charAt(i));
//                int suma = Integer.parseInt(String.valueOf(cadena.charAt(i)));
//                suma = suma * 3;
//                Resultado = Resultado + " " + String.valueOf(suma);
//                System.out.println(suma);
//                System.out.println("Numero: " + numero);
//            }
//            System.out.println("resultado final:" + Resultado);
//        } else {
//            String resultado = "";
//         
//
//        }
    }
}
