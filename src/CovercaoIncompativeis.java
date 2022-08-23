//Demonstração de converções não compativeis.

public class CovercaoIncompativeis {

    //main
    public static void main(String[]args){

        //variables
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);
        System.out.println("O resultado inteiro de (x / y) e: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("valor de b e: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("valor de b e: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("Ch: " + ch);
    }
}
