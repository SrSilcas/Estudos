package Capitulo3;

//Demonstração do que acontece quando não se coloca o break no final do case

public class NoBreakSituation {

    //main
    public static void main(String[]args){

        //variable
        int i;

        for (i=0; i <=5 ; i++) {
            switch (i) {
                case 0:
                    System.out.println("i e menor que um");

                case 1:
                    System.out.println("i e menor que dois");

                case 2:
                    System.out.println("i e menor que tres");

                case 3:
                    System.out.println("i e menor que quatro");

                case 4:
                    System.out.println("i e menor que cinco");
            }

            System.out.println();
        }
    }
}
