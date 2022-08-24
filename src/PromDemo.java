//Demonstração de ocorrências inesperadas em promoção
public class PromDemo {

    //main
    public static void main (String[]args){

        //variables
        byte b;
        int i, ch3;
        char ch1, ch2, ch4;

        ch1 = 'a'; ch2 = 'b'; ch3 = ch1 + ch2;

        b = 10;
        i = b * b;

        b = 10;

//      b = b * b;//Erro pós-qualquer operação que envolva char, byte ou short automaticamente o resultado se torna int.
        b = (byte) (b * b); //Nessa linha de código deu certo pos ouve a conversão do resultado int em byte.

        System.out.println("i and b " + i + " " + b);

//      ch4 = ch1 + ch2; // Erro pelo mesmo motivo do b = b * b.
        ch4 = (char) (ch1 + ch2); //Nessa linha de código deu certo pos ouve a conversão do resultado int em char.

        System.out.println(ch4);
        System.out.println(ch3);
    }
}
