package Capitulo5;

//demonstração de array Bidimensional.

public class ArrayBidimensional {
    //main
    public static void main(String[]args){
        int table[] [] = new int [3] [4];
        int i, t;

        for(t = 0; t < 3; ++t){
            for (i = 0; i < 4; ++i){
                table[t][i] = (t*4)+ i+i;
                System.out.print(table[t] [i] + " ");
            }
        }
    }
}
