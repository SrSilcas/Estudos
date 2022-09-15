package Capitulo4;

public class Vehicle2 {

    public static void main(String[]args){

        Vehicle kombi = new Vehicle(9, 16, 19);
        Vehicle bugi = new Vehicle(5, 12, 20);

        System.out.print("Kombi carrega " + kombi.passengers + " passageiros. ");
        kombi.range();
        System.out.print("Bugi carrega " + bugi.passengers + " passageiros. ");
        bugi.range();
    }
}
