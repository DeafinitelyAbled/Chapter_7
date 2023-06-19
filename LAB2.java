import java.util.Scanner;
public class LAB2 {
    // TODO: Write recursive printNumPattern() method
    public static void printNumPattern(int n1, int n2) {
        // base case: num1 is negative
        if (n1 < 0) {
            System.out.print(n1 + " ");
            return;
        }

        // recursive case: subtract num2 from num1 and print num1
        System.out.print(n1 + " ");
        printNumPattern(n1 - n2, n2);

        // add num2 to num1 and print num1 again
        System.out.print(n1 + " ");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        printNumPattern(num1, num2);
    }
} 