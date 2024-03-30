/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest;

/**
 *
 * @author venka
 */
import java.util.Scanner;

public class Multi {

    static int multiplyBy15(int a) {
        int result = 0;
        for (int i = 0; i < 15; i++) {
            result += a;
        }
        return result;
    }

    static int multiplyEvenBy7_5(int b) {
        int result = 0;
        for (int i = 0; i < 7; i++) {
            result += b;
        }
        return result + (result / 2);
    }

    static int multiply15ByNAndDivideBy16(int n) {
        int result = 0;
        for (int i = 0; i < 15; i++) {
            result += n;
        }
        return result / 16;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer to be multiplied by 15:");
        int a = scanner.nextInt();
        int result1 = multiplyBy15(a);
        System.out.println("Multiplying " + a + " by 15 results in: " + result1);

        System.out.println("Enter an even number to be multiplied by 7.5:");
        int b = scanner.nextInt();
        int result2 = multiplyEvenBy7_5(b);
        System.out.println("Multiplying " + b + " by 7.5 results in: " + result2);

        System.out.println("Enter the value of 'n' for the expression 15 * n / 16:");
        int c = scanner.nextInt();
        int result3 = multiply15ByNAndDivideBy16(c);
        System.out.println("Multiplying 15 by " + c + " and dividing by 16 results in: " + result3);

        scanner.close();
    }
}
