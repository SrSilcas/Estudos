package Capitulo2;/*
This program use the pythagorean theorem for caculate
hypotenuse length
 */

public class Hypot {

    //main
    public static void main(String[]args){

        //variables
        double x, y, z;

        x = 3;
        y = 4;

        //method
        z = Math.sqrt(x*x + y*y);

        //System out
        System.out.println("Hypotenuse is " + z);
    }
}
