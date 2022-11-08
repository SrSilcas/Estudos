package Capitulo5;

public class Encode {
    public static void main(String[]args){
        String msg = "This is a test";
        String encodeMsg = "";
        String decodeMsg = "";
        int key = 54;

        System.out.print("Original message: ");
        System.out.println(msg);

        for (int i = 0; i < msg.length(); i++){
            encodeMsg = encodeMsg + (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Encode message: ");
        System.out.println(encodeMsg);

        for (int i = 0; i < encodeMsg.length(); i++){
            decodeMsg = decodeMsg + (char) (encodeMsg.charAt(i) ^ key);
        }

        System.out.print("Decode message: ");
        System.out.println(decodeMsg);
    }
}
