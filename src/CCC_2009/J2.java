package CCC_2009;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Problem J2: Old Fishin' Hole
Problem Description
Fishing habitat and fish species are a resource that must be carefully managed to ensure that they will be there for the
future. Accordingly, fishing limits have been established for a particular river based on the population of each
species. Specifically, points are associated with the fish caught and the total points you catch must be less than or
equal to the points allowed for that river.

As an example, suppose each brown trout counts as 2 points, each northern pike counts as 5 points and each yellow
pickerel counts as 2 points, and the total points allowed must be less than or equal to 12. One acceptable catch could
consist of 3 brown trout and 1 northern pike, but other combinations would also be allowed.
Your job is to write a program to input the points allocated for a river, and find how many different ways an angler who
catches at least one fish that can stay within his/her limit.

Input Description
You will be given 4 integers, one per line, representing trout points, pike points, pickerel points, and total points
allowed in that order.
You can assume that each integer will be greater than 0 and less than or equal to 100.

Output Description
For each different combination of fish caught, output the combination of brown trout, northern pike, and yellow pickerel
in that order. The combinations may be listed in any order. The last line of output should display the total number of
unique ways to catch fish within the established limit.

Sample Input 1
1
2
3
2
Sample Output 1
1 Brown Trout, 0 Northern Pike, 0 Yellow Pickerel
2 Brown Trout, 0 Northern Pike, 0 Yellow Pickerel
0 Brown Trout, 1 Northern Pike, 0 Yellow Pickerel
Number of ways to catch fish: 3

Sample Input 2
2
3
4
9
Sample Output 2
0 Brown Trout, 0 Northern Pike, 1 Yellow Pickerel
0 Brown Trout, 0 Northern Pike, 2 Yellow Pickerel
0 Brown Trout, 1 Northern Pike, 0 Yellow Pickerel
0 Brown Trout, 1 Northern Pike, 1 Yellow Pickerel
0 Brown Trout, 2 Northern Pike, 0 Yellow Pickerel
0 Brown Trout, 3 Northern Pike, 0 Yellow Pickerel
1 Brown Trout, 0 Northern Pike, 0 Yellow Pickerel
1 Brown Trout, 0 Northern Pike, 1 Yellow Pickerel
1 Brown Trout, 1 Northern Pike, 0 Yellow Pickerel
1 Brown Trout, 1 Northern Pike, 1 Yellow Pickerel
1 Brown Trout, 2 Northern Pike, 0 Yellow Pickerel
2 Brown Trout, 0 Northern Pike, 0 Yellow Pickerel
2 Brown Trout, 0 Northern Pike, 1 Yellow Pickerel
2 Brown Trout, 1 Northern Pike, 0 Yellow Pickerel
3 Brown Trout, 0 Northern Pike, 0 Yellow Pickerel
3 Brown Trout, 1 Northern Pike, 0 Yellow Pickerel
4 Brown Trout, 0 Northern Pike, 0 Yellow Pickerel
Number of ways to catch fish: 17
 */

public class J2 {
    int trout, pike, pickerel, totalPoints;

    public J2 () throws FileNotFoundException {
        var file = new File("Data/CCC_2009/J2");
        var scanner = new Scanner(file);

        trout = scanner.nextInt();
        pike = scanner.nextInt();
        pickerel = scanner.nextInt();
        totalPoints = scanner.nextInt();
    }

    public int answer() {
        int maxTrout = totalPoints / trout;
        int maxPike = totalPoints / pike;
        int maxPickerel = totalPoints / pickerel;
        int combinations = 0;

        for (int t = 0; t <= maxTrout; t++) {
            for (int p = 0; p <= maxPike; p++) {
                for (int pl = 0; pl <= maxPickerel; pl++) {
                    if (t * trout + p * pike + pl * pickerel <= totalPoints && t + p + pl > 0) {
                        combinations++;
                        System.out.println(t + " Brown Trout " + p + " Northern Pike " + pl + " Yellow Pickerel");
                    }
                }
            }
        }

        return combinations;
    }
}
