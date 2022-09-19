package Capitulo5;

//Demonstrando a utilização de arrays irregulares.

public class Ragged {
    //main
    public static void main (String[]args) {
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];
        int i, j;
        for (i = 0; i < 5; i++){
            for (j = 0; j < 10; j++)
                riders[i] [j] = i + j + 10;
        }
        for (i = 5; i < 7; i++){
            for (j = 0; j < 2; j++)
                riders[i] [j] = i + j + 10;
        }
        System.out.println("Passageiros por viagem durante a semana e: ");
        for (i = 0; i < 5; i++){
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Passageiros por viagem durante a o final de semana e: ");
        for (i = 5; i < 7; i++){
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}
