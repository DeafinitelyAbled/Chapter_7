import java.util.Scanner;
public class MoneyCalculatorRecursion {
    public static int calculate(int days, int money) {
        int result = 0;

        if (days == 1) {
            result = money * 2;
        }
        else {
            result = calculate((days -1), (money * 2));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int days;
        days = scnr.nextInt();
        int money;
        money = scnr.nextInt();
        System.out.println("Your money doubles to " + calculate(days, money) + " after " + days + " days.");


    }

}