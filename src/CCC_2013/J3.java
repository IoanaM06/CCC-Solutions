package CCC_2013;

import java.util.Scanner;

/*
Problem Description
You might be surprised to know that 2013 is the first year since 1987 with distinct digits. The years 2014, 2015, 2016,
2017, 2018, 2019 each have distinct digits. 2012 does not have distinct digits, since the digit 2 is repeated.
Given a year, what is the next year with distinct digits?

Input Specification
The input consists of one integer Y (0 ≤ Y ≤ 10000), representing the starting year.
Output Specification
The output will be the single integer D, which is the next year after Y with distinct digits.

Sample Input 1
1987
Output for Sample Input 1
2013

Sample Input 2
999
Output for Sample Input 2
1023

Sample Input 3
879
Output for sample input 2
890

Sample Input 4
9876
Output for sample input 4
10234

*/
public class J3 {
    String startingYear;

    public J3() {
//        scanner
        var scanner = new Scanner(System.in);
        startingYear = scanner.nextLine();
    }

    public boolean isDistinct(String year) {
//        array of used numbers
        boolean[] digitIsUsed = new boolean[10];
        char ch;

        for (int i = 0; i < year.length(); i++) {
            ch = year.charAt(i);
            if (!digitIsUsed[ch - '0']) digitIsUsed[ch - '0'] = true;
            else return false;
        }
        return true;
    }

    public int nextDistinctYear() {
        int currentYear = Integer.parseInt(startingYear) + 1;
        while(! isDistinct(Integer.toString(currentYear))) currentYear++;
        return currentYear;
    }
}
