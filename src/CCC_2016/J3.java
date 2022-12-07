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

    public boolean isPalindrome(int index1, int index2) {
        int j = index2;

        if (index2 % 2 != 0) index2++;

        for (int i = index1; i <= index2 / 2; i++) {
            System.out.println("i = " + word.charAt(i) + "   j = " + word.charAt(j));
            if (word.charAt(i) != word.charAt(j)) return false;
            j--;
        }
        return true;
    }

    public int palindromeLength() {
        int palLenght = 0;
        int longestPalindrome = 1;

//        for the first index of the word (until the end)
        for (int i = 0; i < word.length(); i++) {

//            for the last index of the word (until index i)
            for (int j = word.length() - 1; j > i; j--) {

//                uses a function to check if there's a palindrome in the word
                if (isPalindrome(i, j)) {
//                    calculates the length of the palindrome
                    palLenght = j - i + 1;
//                    checks if the
                    if (palLenght > longestPalindrome) longestPalindrome = palLenght;
                    break;
                }
//                checking to make sure the program works
                System.out.println("longest palindrome: " + longestPalindrome);
            }
        }

//        return longestPalindrome % 2 != 0 || longestPalindrome == 0? longestPalindrome : longestPalindrome + 1;
        return longestPalindrome;
    }
}
// banana