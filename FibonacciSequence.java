import java.util.Scanner;
public class FibonacciSequence {

    public static void computeFibonacci(int fibNum1, int fibNum2, int runCnt) {
        System.out.println(fibNum1 + " + " + fibNum2 + " = " +
                (fibNum1 + fibNum2));

        if (runCnt <= 1) { // Base case: Ran for user specified
            // number of steps, do nothing
        }
        else {             // Recursive case: compute next value
            computeFibonacci(fibNum2, fibNum1 + fibNum2, runCnt - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int runFor;     // User specified number of values computed

        // Output program description
        System.out.println("This program outputs the\n" +
                "Fibonacci sequence step-by-step,\n" +
                "starting after the first 0 and 1.\n");

        // Prompt user for number of values to compute
        System.out.print("How many steps would you like? ");
        runFor = scnr.nextInt();

        // Output first two Fibonacci values, call recursive function
        System.out.println("0\n1");
        computeFibonacci(0, 1, runFor);
    }
}
