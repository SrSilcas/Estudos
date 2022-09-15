package Capitulo4;

public class VehicleDemo {
    //main
    public static void main(String[]args){
        //variable
        int range1;
        int range2;
        //new vehicle
        Vehicle minivan = new Vehicle(7,16,21); //give new values to minivan
        Vehicle sportscar = new Vehicle(2, 14, 12); //gives nem values to sportscar
        //calculando o total de milhas percorridas com um tanque.
        range1 = minivan.fuelcap * minivan.mpg;
        System.out.println("A minivan consegue percorrer " + range1 + " milhas com um tanque cheio e carregar " +
                minivan.passengers + " pessoas.\n");
        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("O carro sport consegue percorrer " + range2 + " milhas com um tanque cheio e carregar " +
                sportscar.passengers + " pessoas.");
    }
}
