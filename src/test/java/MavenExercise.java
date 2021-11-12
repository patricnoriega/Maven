import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();

        System.out.println(".isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println(".lowerCase(userInput) = " + StringUtils.lowerCase(userInput));
        System.out.println(".upperCase(userInput) = " + StringUtils.upperCase(userInput));
        System.out.println(".swapCase(userInput) = " + StringUtils.swapCase(userInput));
        System.out.println(".reverse(userInput) = " + StringUtils.reverse(userInput));


    }
}
