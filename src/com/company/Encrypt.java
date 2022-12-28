package com.company;

import java.util.Scanner;

/*
Problem Description
Sheldon and Leonard are physicists who are fixated on the BIG BANG theory. In order to exchange secret insights they
have devised a code that encodes UPPERCASE words by shifting their letters forward.
Shifting a letter by S positions means to go forward S letters in the alphabet. For example, shifting B by S = 3
positions gives E. However, sometimes this makes us go past Z, the last letter of the alphabet. Whenever this happens we
wrap around, treating A as the letter that follows Z. For example, shifting Z by S = 2 positions gives B.
Sheldon and Leonard’s code depends on a parameter K and also varies depending on the position of each letter in the
word. For the letter at position P , they use the shift value of S = 3P + K.
For example, here is how ZOOM is encoded when K = 3. The first letter Z has a shift value of S = 3 × 1 + 3 = 6; it wraps
around and becomes the letter F. The second letter, O, has S = 3×2+3 = 9 and becomes X. The last two letters become A
and B. So Sheldon sends Leonard the secret message: FXAB
Write a program for Leonard that will decode messages sent by Sheldone.

Input Specification
The input will be two lines. The first line will contain the positive integer K (K < 10), which is used to compute the
shift value. The second line of input will be the word, which will be a sequence of uppercase characters of length at
most 20.

Output Specification
The output will be the decoded word of uppercase letters.

Sample Input 1
3
FXAB
Output for Sample Input 1
ZOOM

Sample Input 2
5
JTUSUKG
Output for Sample Input 2
BIGBANG
*/
public class Encrypt {
    String valueK, encryptedMessage;

    public Encrypt() {
        var scanner = new Scanner(System.in);
        valueK = scanner.nextLine();
        encryptedMessage = scanner.nextLine();
    }

    public void decrypt() {
        int shift;
        char encryptCh;

        for (int i = 0; i < encryptedMessage.length(); i++) {
            shift = 3 * (i + 1) + Integer.parseInt(valueK);
            encryptCh = encryptedMessage.charAt(i);

            for (int j = 0; j < shift; j++) {
                encryptCh--;
                if (encryptCh < 'A') encryptCh = 'Z';
            }
            System.out.print(encryptCh);
        }
    }
}