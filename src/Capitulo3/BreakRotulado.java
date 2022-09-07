package Capitulo3;

//Usando um break rotulado

public class BreakRotulado {
    //main
    public static void main(String[]args){
        //variables
        int i;

        for (i = 1; i < 4; i++){
        um: {
        dois:   {
        tres:       {
            System.out.println("\n i e " + i);
            if (i==1)break um;
            if (i==2)break dois;
            if (i==3)break tres;
            //esse condigo nunca será digitado
            System.out.println("Nunca será digitado");
                    }
                    System.out.println("Depois do bloco tres");
                }
                System.out.println("Depois do bloco dois");
            }
            System.out.println("Depois do bloco um");
        }
        System.out.println("Depois do for");
    }
}
