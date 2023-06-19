import java.util.Scanner;

public class ReverseStringRecursion {
    public static String reverse(String input) {
        String firstChar;
        String remaining;
        String result;
        if (input.length() <= 1) {
            return input;
        }
        else {
            firstChar = input.substring(0, 1);
            remaining = input.substring(1);
            result = reverse(remaining);
            return result + firstChar;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();

        System.out.println("Original: " + input);
        String reversed = reverse(input);
        System.out.println("Reversed: " + reversed);

    }

}