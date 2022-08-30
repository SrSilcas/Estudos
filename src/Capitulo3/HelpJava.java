package Capitulo3;

//Tente isso 3-1 pagina 72, projeto com switch aninhando.

public class HelpJava {

    //main
    public static void main (String[]args)
    throws java.io.IOException{

        //variable
        char escolha;

        //instruções primaria para o usuário
        System.out.println("Ajuda com:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Escolha um:");

        escolha = (char) System.in.read();

        System.out.println("\n");

        switch (escolha){

            case('1'):
                System.out.println("The if:\n");
                System.out.println("if (condicao) instrucao");
                System.out.println("else instrucao (Lembrando que o else nao e obrigatorio)");
                break;
            case ('2'):
                System.out.println("The switch:\n");
                System.out.println("switch (expressao){");
                System.out.println("    case (constante):");
                System.out.println("        sequencia de instrucoes;");
                System.out.println("        break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Opcao escolhida nao encontrada");
        }
    }
}
