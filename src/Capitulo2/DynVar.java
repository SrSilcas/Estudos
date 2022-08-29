package Capitulo2;/*
Programa para demostrar a inicialização dinamica de variaveis

Esté programa irá calcular o volume de um cilindro dado o raio da sua base
 */


public class DynVar {

    //main
    public static void main(String[]args){

        //variables not dynamics
        double radius =4, height = 5;

        //Dynamic variable
        double volume = 3.1416 * radius * radius * height;

        //System out
        System.out.println("Volume is " + volume);
    }
}
