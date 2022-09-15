package Capitulo4;

public class HelpClassDemo {

    public static void main(String[] args)
    throws java.io.IOException{

        char choice, ignore;
        Help hp = new Help();

        for (;;){
            do {
                hp.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            }while (!hp.validador(choice));
            if(choice == 's') break;
            System.out.println('\n');
            hp.helpOn(choice);
        }
    }
}
