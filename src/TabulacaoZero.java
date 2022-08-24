/*
"Desafio" do livro usar o programa "LogicalOpTable" para fazer uma tabela que não de true e false e sim mostrasse zeros

Como esperado a tabulação ficou perfeita, até na minha tentativa de compilar sem olhar no livro.
 */

public class TabulacaoZero {


    //main
    public static void main (String[]args){

        //variables
        boolean pT, qT, pF, qF;
        pT= qT = true;
        pF = qF = false;

        boolean p, q;

        //Fazendo como o livro manda (tabulação também ficou fora de alinhamento, acho que a IDE faz isso acontecer)

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p =true; q =true;
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.println(0 + "\t" + 0);

        p =true; q =false;
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.println(0 + "\t" + 0);

        p =false; q =true;
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.println(0 + "\t" + 0);

        p =false; q =false;
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.print(0 + "\t" + 0 + "\t");
        System.out.println(0 + "\t" + 0);

/*
//Tentativa de compilar um código sem olhar pelo livro (Tabulação ficou fora de espaçamento), tentar corrigir!

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
//        System.out.println("P" + '\t' + "Q" + '\t' + "AND" + '\t' + "OR" + '\t' + "XOR" + '\t' + "NOT");
        System.out.println(0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0);
        System.out.println(0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0);
        System.out.println(0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0);
        System.out.println(0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0 + "\t" + 0);
*/
    }
}
