package Capitulo1;

/*
In this program java we create a new Gallons to Litters

Call this archive
 */
public class GalToLitTable {

    //main
    public static void main (String[]args){

        //variables
        double gallons, litters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854; //converção para litros

            System.out.println(gallons + " gallons is " + litters + " litters.");
            counter++;

            //a cada décima linha, exibe uma linha em branco

            if (counter == 10){
                System.out.println();
                counter = 0; //zerando o contador
            }
        }
    }
}
