package Capitulo4;

public class vehicleDemo {
    //main
    public static void main(String[]args){
        //variable
        int range1;
        int range2;
        //new vehicle
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        //give new values to minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //gives nem values to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        //calculando o total de milhas percorridas com um tanque.
        range1 = minivan.fuelcap * minivan.mpg;
        System.out.println("A minivan consegue percorrer " + range1 + " milhas com um tanque cheio e carregar " +
                minivan.passengers + " pessoas.\n");

        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("O carro sport consegue percorrer " + range2 + " milhas com um tanque cheio e carregar " +
                sportscar.passengers + " pessoas.");


    }
}
