package CCC_2002;

public class Main {
    public static void main(String[] args) {
        var test = new J2();
        while (test.numOfPics != 0) {
            System.out.println(test.displayAns());
            test = new J2();
        }
    }
}
