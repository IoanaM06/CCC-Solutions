package CCC_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Problem J2: Magic Squares
Problem Description
Magic Squares are square arrays of numbers that have the interesting property that the numbers in each column, and in
each row, all add up to the same total.
Given a 4 × 4 square of numbers, determine if it is magic square.

Input Specification
The input consists of four lines, each line having 4 space-separated integers.

Output Specification
Output either magic if the input is a magic square, or not magic if the input is not a magic square.

Sample Input 1
16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1

Output for Sample Input 1
magic

Explanation for Output for Sample Input 1
Notice that each row adds up to 34, and each column also adds up to 34.

Sample Input 2
5 10 1 3
10 4 2 3
1 2 8 5
3 3 5 0
Output for Sample Input 2
not magic

Explanation for Output for Sample Input 2
Notice that the top row adds up to 19, but the rightmost column adds up to 11.
 */

public class J2 {
    int num;
    ArrayList<ArrayList<Integer>> matrix;

    public J2() throws FileNotFoundException {
        var file = new File("Data/CCC_2016/J2");
        var scanner = new Scanner(file);

        matrix = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            matrix.add(new ArrayList<>());

            for (int j = 0; j < 4; j++) {
                num = scanner.nextInt();
                matrix.get(i).add(num);
            }
        }
    }

    public String answer() {
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;

        for (int i = 0; i < 4; i++) {
            value1 += matrix.get(0).get(i);
        }
        for (int i = 0; i < 4; i++) {
            value2 += matrix.get(1).get(i);
        }
        for (int i = 0; i < 4; i++) {
            value3 += matrix.get(2).get(i);
        }
        for (int i = 0; i < 4; i++) {
            value4 += matrix.get(3).get(i);
        }

        if (value1 != value2 || value3 != value4 || value1 != value4) {
            return "not magic";
        } else {
            value1 = 0;
            value2 = 0;
            value3 = 0;
            value4 = 0;

            for (int i = 0; i < 4; i++) {
                value1 += matrix.get(0).get(i);
                value2 += matrix.get(1).get(i);
                value3 += matrix.get(2).get(i);
                value4 += matrix.get(3).get(i);
            }

            if (value1 != value2 || value3 != value4 || value1 != value4) {
                return "not magic";
            } else {
                return "magic";
            }
        }
    }
}
