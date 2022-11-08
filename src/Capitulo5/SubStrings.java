package Capitulo5;

public class SubStrings {
    public static void main(String[]args){
        String originalString = "Java makes the web movie";
        String subString = originalString.substring(5,18);
        System.out.println("OriginalString: " + originalString);
        System.out.println("SubString: " + subString);
    }
}
