package CCC_2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Problem Description
You and your friend have come up with a way to send messages back and forth.
Your friend can encode a message to you by writing down a positive integer N and a symbol. You
can decode that message by writing out that symbol N times in a row on one line. Given a message that your friend has
encoded, decode it.

Input Specification
The first line of input contains L, the number of lines in the message.
The next L lines each contain one positive integer less than 80, followed by one space, followed
by a (non-space) character.

Output Specification
The output should be L lines long. Each line should contain the decoding of the corresponding line of the input.
Specifically, if line i + 1 of the input contained N x, then line i of the output should contain just the character x
printed N times.

Sample Input
4
9 +
3 -
12 A
2 X

Output for Sample Input
+++++++++
---
AAAAAAAAAAAA
XX
 */

public class J2 {
    int amount;
    int number;
    char character;

    public J2() throws FileNotFoundException {
        var file = new File("Data/CCC_2019/J2");
        var scanner = new Scanner(file);

        amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            number = scanner.nextInt();
            character = scanner.next().charAt(0);

            for(int j = 0; j < number; j++) {
                System.out.print(character);
            }
            System.out.println("");
        }
    }
}
