package CCC_2018;

import java.util.ArrayList;
import java.util.Scanner;

/*
distance between two cities
A--B--C--D--E

OUTPUT
distance between A and A
distance between A and B
distance between A and C
...

distance between B and A
distance between B and B
distance between B and C
...

distance between C and A
distance between C and B
distance between C and C
...

 */
public class J3 {
    int betweenCities;
    ArrayList<Integer> betweenCitiesArrList;
    public J3() {
        var scanner = new Scanner(System.in);
        betweenCitiesArrList = new ArrayList<Integer>();
        betweenCitiesArrList.add(0);

        for (int i = 0; i < 4; i++) {
            betweenCities = scanner.nextInt();
            betweenCitiesArrList.add(betweenCities);
        }
    }

    public void calculatesDistance() {
        int sumOfDistance = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                sumOfDistance += betweenCitiesArrList.get(j);
                System.out.print(sumOfDistance);
                System.out.print(" ");
            }
            sumOfDistance = 0;
            System.out.println();
        }
    }
}
