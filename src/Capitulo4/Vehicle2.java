package Capitulo4;

public class Vehicle2 {

    public static void main(String[]args){

        Vehicle kombi = new Vehicle();
        Vehicle bugi = new Vehicle();

        //kombi
        kombi.passengers = 9;
        kombi.fuelcap = 16;
        kombi.mpg = 19;

        //bugi
        bugi.passengers = 5;
        bugi.fuelcap = 12;
        bugi.mpg = 20;

        System.out.print("Kombi carrega " + kombi.passengers + " passageiros. ");
        kombi.range();

        System.out.print("Bugi carrega " + bugi.passengers + " passageiros. ");
        bugi.range();
    }
}
