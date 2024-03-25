/* SimpleCalc.java
   Author: Ashi Vered
   Version: 1.3
   Date: 14.7.5784
 */

import java.util.Scanner;


public class Main {
    public static boolean allFix = true;
    public static void main(String[] args) {
        int num1, num2, result;
// Get input from user - first number
        Scanner in = new Scanner(System.in);
        print("Please enter the first number:");
        num1 = in.nextInt();
// Get input from user - first number
        print("Please enter the second number:");
        num2 = in.nextInt();
        result = sumNumbers(num1, num2);
        if (allFix) {
            print("Your resault: " + result);
        } else {
            print("Eror, please try again.");
        }
    }

    public static int sumNumbers(int number1, int number2) {
        int act, sum, count = 0;

        // Get input from user - mathematical operation
        Scanner in = new Scanner(System.in);
        print("Available mathematical operations:");
        print("Plus (+) : enter 1");
        print("Minus (-) : enter 2");
        print("Multiplication (*): enter 3");
        print("division (/) : enter 4");
        print("Enter operation:");
          act = in.nextInt();

        // check operation&calc
        switch(act){
            case 1:
                return number1 + number2;
            case 2:
                return number1 - number2;
            case 3:
                return number1 * number2;
            case 4:
                return number1 / number2;
            default:
                allFix = false;
                print("Your selection is not correct. the resault is broken.");
                return 0;
        }
    } public static void print(String s){
        System.out.println(s);
    }
}
