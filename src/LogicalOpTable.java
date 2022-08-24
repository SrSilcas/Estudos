/*
Tabela verdade dos operadores java

usando tabulação, para que a tabela verdade fique alinhada com o cabeçalho
 */

public class LogicalOpTable {

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
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p =true; q =false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p =false; q =true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p =false; q =false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

/*
//Tentativa de compilar um codigo sem olhar pelo livro (Tabulação ficou fora de espaçamento), tentar corrigir!

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
//        System.out.println("P" + '\t' + "Q" + '\t' + "AND" + '\t' + "OR" + '\t' + "XOR" + '\t' + "NOT");
        System.out.println("True" + "\t" + "True" + "\t" + (pT & qT) + "\t" + (pT | qT) + "\t" + (pT ^ qT) + "\t" + (!(pT & qT)));
        System.out.println("True" + "\t" + "False" + "\t" + (pT & qF) + "\t" + (pT | qF) + "\t" + (pT ^ qF) + "\t" + (!(pT & qF)));
        System.out.println("False" + '\t' + "False" + '\t' + (pF & qF) + '\t' + (pF | qF) + '\t' + (pF ^ qF) + '\t' + (!(pF & qF)));
        System.out.println("False" + '\t' + "True" + '\t' + (pF & qT) + '\t' + (pF | qT) + '\t' + (pF ^ qT) + '\t' + (!(pF & qT)));
*/
    }
}
