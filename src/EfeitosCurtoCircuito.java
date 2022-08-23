//Demonstração dos efeitos colaterais

public class EfeitosCurtoCircuito {

    //main
    public static void main (String[]args){

        //variables
        int i;
        i = 0;

        System.out.println(i);

        if(false & (++i > 100))
            System.out.println("this won't execute");

        System.out.println(i);

        if(false && (++i > 100))
            System.out.println("this won't execute");

        System.out.println(i);
    }
}
