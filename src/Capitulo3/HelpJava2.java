package Capitulo3;

//Melhorando o HelpJava com a adição do do-while e outras funcionalidades.

public class HelpJava2 {

    //main
    public static void main(String[]args)
    throws java.io.IOException{

        //variables
        char ignore, choice;

        do {
            System.out.println("Deseja ajuda com:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("escolha um: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while(ignore != '\n');

        }while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice){
            case ('1'):
                System.out.println("A forma mais comum do if:\n");
                System.out.println("if(condicional) comando;");
                System.out.println("else comando;");
                break;
            case('2'):
                System.out.println("A forma comum do switch:\n");
                System.out.println("switch(expressao){");
                System.out.println("case(constante):");
                System.out.println("sequencia de comandos;");
                System.out.println("break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case('3'):
                System.out.println("A forma mais comum do for:\n");
                System.out.print("for(inicializador; condicional; interação)");
                System.out.println("comando;");
                break;
            case('4'):
                System.out.println("Forma mais comum do while:\n");
                System.out.println("while(condicional) comando;");
                break;
            case('5'):
                System.out.println("Forma mais comum do do-while:\n");
                System.out.println("do {");
                System.out.println("comando;");
                System.out.println("}while(condicional)");
                break;
        }
    }
}
