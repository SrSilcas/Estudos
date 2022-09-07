package Capitulo3;

//Usando break com laços aninhados

public class Break3 {
    //main
    public static void main(String[]args){

        for (int i = 1; ; i++){
            if (i == 4)break;
            System.out.println("\nOutro loop contando:" + i);
            System.out.print(" Loop interno:");
            int t = 1;
            while(t < 100){
                if(t == 10)break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println(" ");
        }
        System.out.println("\nLoop completado");
    }
}
