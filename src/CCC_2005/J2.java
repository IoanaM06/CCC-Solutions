package CCC_2005;

import java.util.Scanner;

/*
When a credit card number is sent through the Internet it must be protected so that other people cannot see it.
Many web browsers use a protection based on "RSA Numbers."

A number is an RSA number if it has exactly four divisors. In other words, there are exactly four numbers that divide
into it evenly. For example, 10 is an RSA number because it has exactly four divisors (1, 2, 5, 10). 12 is not an RSA
number because it has too many divisors (1, 2, 3, 4, 6, 12). 11 is not an RSA number either. There is only one RSA
number in the range 10...12.

Write a program that inputs a range of numbers and then counts how many numbers from that range are RSA numbers. You may
assume that the numbers in the range are less than 1000.

Sample Session 1
Program Output: Enter lower limit of range
User Input: 10
Program Output: Enter upper limit of range
User Input: 12
Program Output: The number of RSA numbers between 10 and 12 is 1

Sample Session 2
Program Output: Enter lower limit of range
User Input: 11
Program Output: Enter upper limit of range
User Input: 15
Program Output: The number of RSA numbers between 11 and 15 is 2
*/
public class J2 {
    int rangeMin, rangeMax;

    public J2() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter lower limit of range: ");
        rangeMin = scanner.nextInt();
        System.out.println("Enter lower upper of range: ");
        rangeMax = scanner.nextInt();
    }

    public boolean isRsa(int num) {

        int divisorCounter = 0;

        for (int i = 1; i <= num / 2 + 1; i++) {
            if (num % i <= 1) {
                divisorCounter ++;

                if ((divisorCounter - 1) * 2 > 4) {
                    return false;
                }
            }
        }

        if ((divisorCounter - 1) * 2 != 4) {
            return false;
        } else {
            return true;
        }
    }

    public String answer() {
        int rsaNumCounter = 0;
        int rsaNum = rangeMin;

        for (int i = 0; i < rangeMax - rangeMin + 1; i++) {
            if (isRsa(rsaNum)) {
                rsaNumCounter++;
            }
            rsaNum++;
        }

        return "The number of RSA numbers between " + rangeMin + " and " + rangeMax + " is " + rsaNumCounter;
    }
}
