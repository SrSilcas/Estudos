package Capitulo3;

//Usando break rotulado e vendo os seus efeitos.

public class BreakRotulado3 {
    //main
    public static void main(String[]args){
        //variables
        int x, y = 0;

        //nesse exemplo de for o break rotulado é antes do primeiro for
        stop1:{
            for (x = 0; x < 5; x++){
                for(y = 0; y < 5; y++){
                    if(y==2)break stop1;
                    System.out.println("x e y sao: " + x + " "+ y);
                }
            }
        }

        System.out.println(" ");
        //neste exemplo vamos fazer o inverso o break rotulado será dento do primeiro for
        for (x = 0; x < 5; x++){
            stop2:{
                for (y = 0; y < 5; y++){
                    if (y==2)break stop2;
                    System.out.println("x e y sao: " + x + " " + y);
                }
            }
        }
    }

}
