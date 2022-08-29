package Capitulo2;/*
This program calculate how many metres one object is from you (using eco sounds)

Call this archive Sound.java
*/

public class EcoDemo {

        //main
        public static void main(String[]args){

            //variables
            double secEco, meters, distance;

            secEco = 10;
            meters = 340.29;

            distance = (secEco/2) * meters;

            //System out
            System.out.println("The object is " + distance + " meters from you");
        }
}


