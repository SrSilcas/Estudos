package Capitulo3;

// Programa para encontrar os fatores de 2 a 100

public class Fatorando {
    //main
    public static void main(String[]args){

        for (int i = 2; i <= 100; i++){
            System.out.print("Os fatores de " + i + " sao: ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.print(j + " ");
            System.out.println(" ");
        }
    }
}
