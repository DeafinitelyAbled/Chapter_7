/*
 * This is a recursive algorithm. The class calls its own method which is recursive method,
 * that executes the sequence of algorithm until the desired requirement is met.
 */

public class RecursiveStopwatch {
    public static void CountDown(int time) {
        if (time <= 0) {
            System.out.println("Go!");
        }
        else {
            System.out.println(time);
            CountDown(time - 1);
        }
    }

    public static void main(String[] args) {

        int countDown = 3;
        CountDown(countDown);

    }

}