package Capitulo3;

//Usando o break rotulado para sair de um laço for aninhado

public class BreakRotulado2 {
    //main
    public static void main(String[]args){
        done:{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        System.out.println("k e " + k);
                        if (k == 5) break done;
                    }
                    System.out.println("Depois do loop k");
                }
                System.out.println("Depois do loop j");
            }
        }
        System.out.println("Depois do loop i");
    }
}
