import java.util.Scanner;

public class ReverseStringForLoop {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String name = scnr.nextLine();
        System.out.println("Original: " + name);

        String[] array = name.split("");

        for (int i = 0; i < array.length / 2; ++i) {
            String temp = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length - 1 -i] = temp;
        }

        System.out.print("Reversed: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + "");
        }

    }

}