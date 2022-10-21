package CCC_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
The CCC harp is a stringed instrument with strings labelled A,B,...,T. Like other instruments, it can be out of tune.
A musically inclined computer science student has written a clever computer program to help tune the harp. The program
analyzes the sounds produced by the harp and provides instructions to fix each string that is out of tune. Each
instruction includes a group of strings, whether they should be tightened or loosened, and by how many turns.


Unfortunately, the output of the program is not very user friendly. It outputs all the tuning instructions on a single
line. For example, the single line AFB+8HC-4 actually contains two tuning instructions: AFB+8 and HC-4. The first
instruction indicates that harp strings A, F, and B should be tightened 8 turns, and the second instruction indicates
that harp strings H and C should be loosened 4 turns.

Your job is to take a single line of tuning instructions and make them easier to read.

Input Specification
There will be one line of input which is a sequence of tuning instructions. Each tuning instruction will be a sequence
of uppercase letters, followed by a plus sign (+) or minus sign (-), followed by a positive integer. There will be at
least one instruction and at least one letter per instruction. Also, each uppercase letter will appear at most once.

Output Specification
There will be one line of output for each tuning instruction. Each line of output will consist of three parts, each
separated by a single space: the uppercase letters referring to the strings, tighten if the instruction contained a plus
sign or loosen if the instruction contained a minus sign, and the number of turns.

Sample Input 1
AFB+8HC-4

Output for Sample Input 1
AFB tighten 8
HC loosen 4

Explanation of Sample Output 1
The input contains two tuning instructions: AFB+8 and HC-4.

Sample Input 2
AFB+8SC-4H-2GDPE+9

Output for Sample Input 2
AFB tighten 8
SC loosen 4
H loosen 2
GDPE tighten 9

Explanation of Sample Output 2
The input contains four tuning instructions: AFB+8, SC-4, H-2, and GDPE+9.


Sample Input 3
APQ+12345BD-999999J+5CERSTGLK-2022F-8HI+55555

Output for Sample Input 3
APQ tighten 12345
BD loosen 999999
J tighten 5
CERSTGLK loosen 2022
F loosen 8
HI tighten 55555
*/
public class J3 {
    String tuning;

    public J3() throws FileNotFoundException {
        var file = new File("Data/CCC_2022/J3");
        var scanner = new Scanner(file);
        tuning = scanner.nextLine();
    }

    public boolean isDigit(char ch) {
        if ((int) ch >= 47 && (int) ch <= 57) return true;
        return false;
    }

    public String convertChar() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < tuning.length(); i++) {
            if (tuning.charAt(i) == '+') res.append(" tighten ");
            else if (tuning.charAt(i) == '-') res.append(" loosen ");
            else res.append(tuning.charAt(i));
        }
        return res.toString();
    }
}
