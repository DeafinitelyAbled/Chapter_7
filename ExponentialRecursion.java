import java.util.Scanner;
public class ExponentialRecursion {
    public static int recursion(int base, int exponential) {
        // base-case
        if (exponential == 0) {
            return 1;
        }
        // recursive-case
        else {
            return base * recursion(base, exponential - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int base = scnr.nextInt();
        int exponential = scnr.nextInt();
        System.out.print(recursion(base, exponential));
    }

}