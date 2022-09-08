package Capitulo4;

public class Vehicle3 {
    //main
    public static void main(String[]args){

     int dist = 252;

     Vehicle caminhao = new Vehicle();
     Vehicle moto = new Vehicle();

     moto.passengers = 2;
     moto.fuelcap = 5;
     moto.mpg = 35;

     caminhao.passengers = 3;
     caminhao.fuelcap = 45;
     caminhao.mpg = 10;

     System.out.println("O caminhao precisa de " + caminhao.gasPreciso(dist) + " tanques de gasolina para percorrer " + dist + " milhas.");
     System.out.println("a moto precisa de " + moto.gasPreciso(dist) + " tanques de gasolina para percorrer " + dist + " milhas.");
    }
}
