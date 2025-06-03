import java.util.Scanner;

public class UserInput {
    public static String inputString(String prompt) {

        System.out.println("Please enter a " + prompt + " : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;

    }

}
