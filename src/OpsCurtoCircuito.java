//Demonstração de operadores logicos de curto circuito
public class OpsCurtoCircuito {

    //main
    public static void main(String[]args){

        //variables
        int n, d, q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // d recebendo 0

        //como d agora é == a zero, o segundo operando mnão é avaliado
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        /*
        Tentando a mesma coisa só que agora sem usar o operador de curto circuito.
        Como esperado o sistema apresenta erro de compilação por conta da  divisão por zero
        */
//        if (d != 0 & (n % d) == 0)
//            System.out.println(d + " is a factor of " + n); //manter o comentario nesse if.
    }
}
