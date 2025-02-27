import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {

    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;
        int number = getInputNumber();

        startTime = System.currentTimeMillis();
        int sum = sumOfNumbers(number);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 1 elapsed time: " + elapsedTime + " ms");


        startTime = System.currentTimeMillis();
        int sum2 = gaussianSumOfNumbers(number);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 2 elapsed time: " + elapsedTime + " ms");


        System.out.println(sum);
        System.out.println(sum2);
    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum +i;
        }
        return sum;
    }

    boolean testSumOfNumbers() {
        return sumOfNumbers(3) == 6; // 3 + 2 + 1 + 0 = 6
    }

     static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }

    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        return (n*(n+1))/2;
    }
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
