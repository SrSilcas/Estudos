package Capitulo5;

public class QueueDemo {
    //main
    public static void main(String[]args){
        //inicializadores
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.print("Usando o bigQ para colocar o alfabeto");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //recuperando e exibindo os elementos de bigQ
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch + " ");
        }
        System.out.println('\n');

        System.out.println("Usando o smallQ para gerar erros");
        for (i = 0; i < 5; i++){
            System.out.print("Tentando armazenar " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        //mais alguns erros em smallQ
        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch != (char)0) System.out.print(ch + " ");
        }
    }


}
