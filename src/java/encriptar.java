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

    public static void encriptars(String Contraseña) {
        String rstAscii = "";
        int numero;
        String resultado = "";
        int cantidadcaracteres = Contraseña.length();//Contar caracteres

        for (int i = 0; i < cantidadcaracteres; i++) {
            char character = Contraseña.charAt(i);//desmenuzar
            int ascii = (int) character; // convertirlo en numero
//            System.out.println(character);
//            System.out.println(character + " = " + ascii); // imprimir el cada letra y numero
            rstAscii = rstAscii + " " + ascii;
        }
//        System.out.println(rstAscii);
        rstAscii = rstAscii.substring(1);// borrar el primer espacio
//        rstAscii = rstAscii.replace(" ", ",");// remplazo los espacions con ','
        String[] numerocadena = rstAscii.split(" "); // numeros estan separados por espacio
        for (int i = 0; i < numerocadena.length; i++) {
            numero = Integer.valueOf(numerocadena[i]);
            numero = numero * 16;
            resultado = resultado + " " + String.valueOf(numero); // convertirlo a String
//            System.out.println(resultado); // desmenuzar array
        }
        System.out.println(resultado); // desmenuzar array
        String str = resultado;
        String result = "";
        char[] messChar = str.toCharArray();
        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " ";
        }
        System.out.println(result);
    }

    public static void desifrar(String contraseña) {
        int numero = 0;
        char caracter = 0;
        String rpt = "";
        String resultado = "";//(String) cadena a convertir

        for (String s : contraseña.split(" ")) { //los numeros estan separados por espacios
            resultado += String.valueOf((char) Integer.parseInt(s, 2));// concatenar
        }
        System.out.println("desifrado binario " + resultado);
             resultado = resultado.substring(1);// borrar el primer espacio
        String[] codigoascii = resultado.split(" "); // numeros estan separados por espacio
        for (int a = 0; a <codigoascii.length; a++) {
            numero = Integer.valueOf(codigoascii[a]);
            numero = (numero / 16);
            rpt += (char) numero;//desifrar
            rpt = rpt + "" + caracter;//concatenar
        }
        System.out.println(rpt);
    }

    public static void main(String[] args) {
        encriptars("hola que tal");
        desifrar("100000 110001 110110 110110 110100 100000 110001 110111 110111 110110 100000 110001 110111 110010 111000 100000 110001 110101 110101 110010 100000 110101 110001 110010 100000 110001 111000 110000 111000 100000 110001 111000 110111 110010 100000 110001 110110 110001 110110 100000 110101 110001 110010 100000 110001 111000 110101 110110 100000 110001 110101 110101 110010 100000 110001 110111 110010 111000");
    }
}
