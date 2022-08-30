package Capitulo3;

//Programa que exibe as raizes quadradas de 1 a 99 e seus erros de arredondamento

public class Fordemo2 {

    //main
    public static void main(String[]args){

        //variables
        double num, sroot, rerr;

        //for
        for (num=1.0; num < 100.0; num++){

            sroot = Math.sqrt(num);
            System.out.println("raiz quadrada de " + num + " e " + sroot);

            //calculando o erro de arredondamento

            rerr = num - (sroot * sroot);
            System.out.println("Erro de arredondamento e " + rerr);
            System.out.println();
        }
    }
}
