package Capitulo3;

//Usando um continue rotulado em um exemplo.

public class ContinueRotulado {
    //main
    public static void main(String[]args){
        loopExterno:
            for (int i = 1; i < 10; i++){
                System.out.print("\n Loop Externo: " + i + " Loop interno: ");
                for (int j = 1; j < 10; j++){
                    System.out.print(j);
                    if (j == 5)continue loopExterno;
                }
            }
    }
}
