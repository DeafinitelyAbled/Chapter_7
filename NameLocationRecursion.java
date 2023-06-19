import java.util.Scanner;
import java.util.ArrayList;

public class NameLocationRecursion {
    public static int finder(ArrayList<String> list, String match, int low, int high, String indent) {
        int middle = (high + low) / 2;
        int size = (high - low) + 1;
        int result = 0;

        System.out.println(indent + "Finding...");
        if (match.equals(list.get(middle))) {
            System.out.println(indent + "Found!");
            result = middle;
        }
        else if (size == 1) {
            System.out.println(indent + "Not Found!");
            result = -1;
        }
        else {
            if (match.compareTo(list.get(middle)) < 0) {
                result = finder(list, match, low, middle, indent + "|---");
            }
            else {
                result = finder(list, match, middle + 1, high, indent + "|---");
            }
        }

        System.out.println(indent + "Exiting");
        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String indent = "---";

        list.add("Aziz");
        list.add("Bobobek");
        list.add("Furkat");
        list.add("Hursand");
        list.add("Miraziz");
        list.add("Nodir");
        list.add("Otabek");

        System.out.print("Enter a name: ");
        String match = scnr.nextLine();
        int result = finder(list, match, 0, list.size() - 1, indent);
        if (result >= 0) {
            System.out.println("Location: " + result);
        }
        else {
            System.out.println("Not Found!");
        }

    }

}