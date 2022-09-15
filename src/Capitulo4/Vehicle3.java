package Capitulo4;

public class Vehicle3 {
    //main
    public static void main(String[]args){

     int dist = 252;
     //crate a new vehicle
     Vehicle caminhao = new Vehicle(2, 5, 35);
     Vehicle moto = new Vehicle(3, 45, 10);
     System.out.println("O caminhao precisa de " + caminhao.gasPreciso(dist) + " tanques de gasolina para percorrer " + dist + " milhas.");
     System.out.println("a moto precisa de " + moto.gasPreciso(dist) + " tanques de gasolina para percorrer " + dist + " milhas.");
    }
}
