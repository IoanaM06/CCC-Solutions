package CCC_2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Problem J2: Rotating letters
Problem Description
An artist wants to construct a sign whose letters will rotate freely in the breeze. In order to do this, she must only
use letters that are not changed by rotation of 180 degrees: I, O, S, H, Z, X, and N.
Write a program that reads a word and determines whether the word can be used on the sign.

Input Specification
The input will consist of one word, all in uppercase letters, with no spaces. The maximum length of the word will be 30
letters, and the word will have at least one letter in it.

Output Specification
Output YES if the input word can be used on the sign; otherwise, output NO.

Sample Input 1
SHINS
Output for Sample Input 1
YES

Sample Input 2
NOISE
Output for Sample Input 2
NO
 */

public class J2 {
    String word;

    public J2() throws FileNotFoundException {
        var file = new File("Data/CCC_2013/J2");
        var scanner = new Scanner(file);
        word = scanner.nextLine();
    }

    public String answer() {
        String spinLetters = "IOSHZXN";
        int no = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (spinLetters.indexOf(ch) == -1) {
                no++;
            }
        }

        if (no > 0) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
