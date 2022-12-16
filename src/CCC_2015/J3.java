package CCC_2015;

import java.util.Scanner;

/*
Problem Description
In Sweden, there is a simple child’s game similar to Pig Latin called Ro ̈varspra ̊ket (Robbers Language).
In the CCC version of Ro ̈varspra ̊ket, every consonant is replaced by three letters, in the following order:
• the consonant itself;
• the vowel closest to the consonant in the alphabet (e.g., if the consonant is d, then the closest vowel is e), with
the rule that if the consonant falls exactly between two vowels, then the vowel closer to the start of the alphabet will
be chosen (e.g., if the consonant is c, then the closest vowel is a);
• the next consonant in the alphabet following the original consonant (e.g., if the consonant is d, then the next
 consonant is f) except if the original consonant is z, in which case the next consonant is z as well.

Vowels in the word remain the same. (Vowels are a, e, i, o, u and all other letters are consonants.) Write a program
that translates a word from English into Ro ̈varspra ̊ket.

Input Specification
The input consists of one word entirely composed of lower-case letters. There will be at least one letter and no more
than 30 letters in this word.

Output Specification
Output the word as it would be translated into Ro ̈varspra ̊ket on one line.

Sample Input 1
joy
Output for Sample Input 1
jikoyuz

Sample Input 2
ham
Output for Sample Input 2
hijamon
*/
public class J3 {
    String word;

    public J3() {
        var scanner = new Scanner(System.in);
        word = scanner.nextLine();
    }

    public boolean isVowel(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char character : vowels) {
            if (character == letter) return true;
        }
        return false;
    }

    public void translator() {
        char ch;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);

            if (isVowel(ch)) {
                System.out.print(ch);

            } else {
                System.out.print(ch);

                if (ch < 'e') {
//                    print vowel
                    if (ch - 'a' < 'e' - ch) System.out.print('a');
                    else System.out.print('e');

//                    print consonant
                    if (ch == 'd') System.out.print('f');
                    else System.out.print((char) (ch + 1));

                } else if (ch < 'i') {
//                    print vowel
                    if (ch - 'e' < 'i' - ch) System.out.print('e');
                    else System.out.print('i');

//                    print consonant
                    if (ch == 'h') System.out.print('j');
                    else System.out.print((char) (ch + 1));

                } else if (ch < 'o') {
//                    print vowel
                    if (ch - 'i' < 'o' - ch) System.out.print('i');
                    else System.out.print('o');

//                    print consonant
                    if (ch == 'n') System.out.print('p');
                    else System.out.print((char) (ch + 1));

                } else if (ch < 'u') {
//                    print vowel
                    if (ch - 'o' < 'u' - ch) System.out.print('o');
                    else System.out.print('u');

//                    print consonant
                    if (ch == 't') System.out.print('v');
                    else System.out.print((char) (ch + 1));

                } else {
                    System.out.print('u');

//                    print consonant
                    if (ch == 'z') System.out.print('z');
                    else System.out.print((char) (ch + 1));
                }
            }
        }
    }
}
