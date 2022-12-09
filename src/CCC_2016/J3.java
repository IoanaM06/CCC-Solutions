package CCC_2016;

import java.util.Scanner;

/*
Problem Description
A palindrome is a word which is the same when read forwards as it is when read backwards. For example, mom and anna are
two palindromes. A word which has just one letter, such as a, is also a palindrome.

Given a word, what is the longest palindrome that is contained in the word? That is, what is the longest palindrome that
we can obtain, if we are allowed to delete characters from the beginning and/or the end of the string?

Input Specification
The input will consist of one line, containing a sequence of at least 1 and at most 40 lowercase letters.

Output Specification
Output the total number of letters of the longest palindrome contained in the input word.

Sample Input 1
banana
Output for Sample Input 1
5

Explanation for Output for Sample Input 1
The palindrome anana has 5 letters.

Sample Input 2
abracadabra
Output for Sample Input 2
3

Explanation for Output for Sample Input 2
The palindromes aca and ada have 3 letters, and there are no other palindromes in the input which are longer.

Sample Input 3
abba
Output for Sample Input 3
4

 */
public class J3 {
    String word;

    public J3() {
        var scanner = new Scanner(System.in);
        word = scanner.nextLine();
    }

    public static boolean isPalindrome(String checkPal) {
        for (int i = 0; i < checkPal.length() / 2; i++) {
            if (checkPal.charAt(i) != checkPal.charAt(checkPal.length() - 1 - i)) return false;
        }
        return true;
    }

    public int palindromeLength() {
        int wordLength;
        for (int i = 0; i < word.length(); i++) {
            for (int j  = 0; j <= i; j++) {
                wordLength = word.length() - 1 - i;
                System.out.println(word.substring(j, wordLength + j + 1));
                if (isPalindrome(word.substring(j, wordLength + j + 1))) {
                    return wordLength + 1;
                }
            }

        }
        return 1;
    }
}
