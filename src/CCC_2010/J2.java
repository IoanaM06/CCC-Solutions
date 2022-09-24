package CCC_2010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Problem Description
Nikky and Byron are playing a silly game in gym class.
Nikky is told by his teacher to walk forward a steps (1 ≤ a ≤ 100) and then walk backward b steps (1 ≤ b ≤ 100), after
which he repeats a forward, b backward, etc. Likewise, Byron is told to walk forward c steps (1 ≤ c ≤ 100) and then walk
backward d steps (1 ≤ d ≤ 100), after which he repeats c forward, d backward, etc. You may assume that a ≥ b and c ≥ d.
Byron and Nikky have the same length of step, and they are required to take their steps simultaneously (that is, Nikky
and Byron will both step forward on their first steps at the same time, and this will continue for each step).
Nikky and Byron start walking from one end of a soccer field. After s steps (1 ≤ s ≤ 10000), the gym teacher will blow
the whistle. Your task is to figure out who has moved the farthest away from the starting position when the whistle is
blown.

Input Specification
The input will be the 5 integers a, b, c, d, and s, each on a separate line.

Output Specification
The output of your program will be one of three possibilities: Nikky if Nikky is farther ahead after s steps are taken;
Byron if Byron is farther ahead after s steps are taken; Tied if Byron and Nikky are at the same distance from their
starting position after s steps are taken.
 */

public class J2 {
    int a, b, c, d, steps;

    public J2() throws FileNotFoundException {
        var file = new File("Data/CCC_2010/J2");
        var scanner = new Scanner(file);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        steps = scanner.nextInt();
    }

    public String answer() {
        int absoluteStep1 = a + b;
        int absoluteStep2 = c + d;
        int relativeStep1 = a - b;
        int relativeStep2 = c - d;

        int units1 = steps / absoluteStep1;
        int units2 = steps / absoluteStep2;

        int relativeDistance1 = relativeStep1 * units1 + steps % absoluteStep1;
        int relativeDistance2 = relativeStep2 * units2 + steps % absoluteStep2;

        if (relativeDistance1 > relativeDistance2) return "Nikky";
        else if (relativeDistance1 < relativeDistance2) return "Byron";
        else return "Tied";
    }
}
