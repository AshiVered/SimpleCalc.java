/* SimpleCalc.java
   Author: Ashi Vered
   Version: 1.1
   Date: 9.7.5784
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, result;
// Get input from user - first number
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = in.nextInt();
// Get input from user - first number
        System.out.println("Please enter the second number:");
        num2 = in.nextInt();
        result = sumNumbers(num1, num2);
        System.out.println(result);
    }

    public static int sumNumbers(int number1, int number2) {
        int act, sum;

        // Get input from user - mathematical operation
        Scanner in = new Scanner(System.in);
        System.out.println("Available mathematical operations:");
        System.out.println("Plus (+) : enter 1");
        System.out.println("Minus (-) : enter 2");
        System.out.println("Multiplication (*): enter 3");
        System.out.println("division (/) : enter 4");


        do {
            System.out.println("Enter operation:");
            act = in.nextInt();
        } while (act > 4 || act < 1);

        // check operation&calc
        if (act == 1) {
            return number1 + number2;
        } else if (act == 2) {
            return number1 - number2;
        } else if (act == 3) {
            return number1 * number2;
        } else if (act == 4) {
            return number1 / number2;
        }
        return 0;
    }
}