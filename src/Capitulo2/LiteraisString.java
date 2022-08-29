package Capitulo2;

/*
testando todos os literais de String

não é preciso colocar o a sequencia dentro de uma variavel como explicado no exemplo de StringD.
*/
public class LiteraisString {

    //main
    public static void main (String[]args){

        //variables
        char aspasS, aspasD, barraI, retornoC, novaL, avancoP, tabulacaoH, retrocesso, constanteO, constanteH;

        aspasS = '\'';
        aspasD = '\"';
        barraI = '\\';
        retornoC = '\r';
        novaL = '\n';
        avancoP = '\f';
        tabulacaoH = '\t';
        retrocesso = '\b';
        constanteO = '\111';
        constanteH = '\u1111';

        //sistema de saida
        System.out.println(aspasS);
        System.out.println(aspasD);
        System.out.println(barraI);
        System.out.println(retornoC);
        System.out.println(novaL);
        System.out.println(avancoP);
        System.out.println(tabulacaoH);
        System.out.println(retrocesso);
        System.out.println(constanteO);
        System.out.println(constanteH);

    }
}
