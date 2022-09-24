package CCC_2006;

import java.util.Scanner;

/*
Problem Description
Diana is playing a game with two dice. One die has sides labelled 1, 2, 3, ..., m The other die has sides labelled
1, 2, 3, ..., n
Write a program to determine how many ways can she roll the dice to get the sum 10.
For example, when the first die has 6 sides and the second die has 8 sides, there are 5 ways to get the sum 10:
                                               2 + 8 = 10
                                               3 + 7 = 10
                                               4 + 6 = 10
                                               5 + 5 = 10
                                               6 + 4 = 10
Input Specifications
The input is given as two integers. First, the user is prompted for and must enter in the number m, where 1 < m < 100.
Second, the user is prompted for and must enter the number n, where 1 < n < 100.
Output Specifications
The program prints out the number of ways 10 may be rolled on these two dice. Note that in the output, the word "way"
should be used if there is only one way to achieve the sum of 10; otherwise, the word "ways" should be used in the
output. That is, if there is only one way to get the sum 10, the output should be:
                                       There is 1 way to get the sum 10.

Sample Prompting and User Input 1 (user input in italics)
Enter m: 6
Enter n: 8
Output for Sample 1
There are 5 ways to get the sum 10.

Sample Prompting and User Input 2 (user input in italics)
Enter m: 12
Enter n: 4
Output for Sample 2
There are 4 ways to get the sum 10.
 */

public class J2 {
    int m, n;

    public J2() {
        var scanner = new Scanner(System.in);

        System.out.print("Enter m: ");
        m = scanner.nextInt();
        System.out.print("Enter n: ");
        n = scanner.nextInt();
    }

    public String answer() {
        if(m >= 9 && n >= 9) {
            return "There are 9 ways to get the sum 10";
        } else if (m > 9 || n > 9) {
            if(m == 1 || n == 1) {
                return "There is 1 way to get the sum 10";
            } else if (m > n) {
                return "There are " + n + " ways to get the sum 10";
            } else {
                return "There are " + m + " ways to get the sum 10";
            }
        } else {
            int max = Math.max(m, n);
            int min = Math.min(m, n);
            int sums = min - (9 - max);

            if(sums == 1) {
                return "There is 1 way to get the sum 10";
            } else if (sums < 1) {
                return "There are 0 ways to get the sum 10";
            } else {
                return "There are " + sums + " ways to get the sum 10";
            }
        }
    }
}
