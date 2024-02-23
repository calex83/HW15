import java.util.Scanner;

public class Main {
    private static final String VALID_STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ -";
    public static void main(String[] args) {
        boolean isValid = true;
        int spaceCount  = 0;

        System.out.println("Introduce you Last Name (surname, family name), First Name and Patronymic");
        String userInput = new Scanner(System.in).nextLine().trim();

        for(int i = 0; i < userInput.length(); i++){
            if(!VALID_STR.contains(String.valueOf(userInput.charAt(i)))){
                System.out.println("Not valid input!");
                isValid = false;
                break;
            }
            if(userInput.charAt(i) == ' ')
                spaceCount++;
        }

        if(isValid && spaceCount == 2 && userInput.indexOf(" ") - userInput.lastIndexOf(" ") != -1){

            System.out.println("Last Name: " + userInput.substring(0,userInput.indexOf(" ")));
            System.out.println("First Name: " + userInput.substring(userInput.indexOf(" "), userInput.lastIndexOf(" ")).trim());
            System.out.println("Patronymic: " + userInput.substring(userInput.lastIndexOf(" ")).trim());
        }
        else
            System.out.println("Introduced data is wrong!");

        System.out.println(userInput.indexOf(" "));
        System.out.println(userInput.lastIndexOf(" "));
    }
}