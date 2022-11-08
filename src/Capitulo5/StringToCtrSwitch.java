package Capitulo5;
//using string to control switch
public class StringToCtrSwitch {
    public static void main(String[]args){
        String command = "cancel";
        switch (command){
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command Error!");
                break;

        }
    }
}
