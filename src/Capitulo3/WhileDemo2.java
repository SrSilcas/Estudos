package Capitulo3;

//Calculando potências inteiras de 2

public class WhileDemo2 {

    //main
    public static void main(String[]args){

        //variables
        int e;
        int result;

        for ( int i = 0; i < 10; i++){
         result = 1;
         e = i;
         while (e > 0){
          result *= 2;
          e--;
         }
            //registro de saida do resultado
            System.out.println("A potencia de 2 de " + i + " e " + result);
        }
    }
}
