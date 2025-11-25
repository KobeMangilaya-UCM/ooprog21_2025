import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        String predefined = "Carmen";

        if (userInput.equals(predefined)) {
            System.out.println("Carmen equals Carmen");
        } else {
            System.out.println("Carmen does not equal " + userInput);
        }

        input.close();
    }
}
