/* SimpleCalc.java
   Author: Ashi Vered
   Version: 1.0
   Date: 9.3.5784
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, result, act;
// Get input from user - first number
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = in.nextInt();
// Get input from user - first number
        System.out.println("Please enter the second number:");
        num2 = in.nextInt();
// Get input from user - mathematical operation
        System.out.println("Available mathematical operations:");
        System.out.println("Plus (+) : enter 1");
        System.out.println("Minus (-) : enter 2");
        System.out.println("Multiplication (*): enter 3");
        System.out.println("division (/) : enter 4");
        System.out.println("Enter operation:");
        act = in.nextInt();
// check operation&calc
        if (act == 1) {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (act == 2) {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (act == 3) {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (act == 4) {
            System.out.print(num1 + " / " + num2 + " = ");
            System.out.print((double) num1/num2);
        } else {
            System.out.println("Eror. please try again");
        }

    }
}