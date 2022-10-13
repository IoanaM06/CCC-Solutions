package CCC_2003;
import java.util.Scanner;

/*
Americans spell differently from Canadians. Americans write "neighbor" and "color" while Canadians write "neighbour" and
"colour”.
Write a program to help Americans translate to Canadian.
Your program should interact with the user in the following way. The user should type a word (not to exceed 64 letters)
and if the word appears to use American spelling, the program should echo the Canadian spelling for the same word. If
the word does not appear to use American spelling, it should be output without change. When the user types "quit!" the
program should terminate.

The rules for detecting American spelling are quite naive: If the word has more than four letters and has a suffix
consisting of a consonant followed by "or", you may assume it is an American spelling, and that the equivalent Canadian
spelling replaces the "or" by "our". Note : you should treat the letter "y" as a vowel.
Keyboard input and screen output is expected.

Sample session. User input in italics.
Enter words to be translated:
color
colour
for
for
taylor
taylour
quit!
 */
public class J2 {
    String word;

//    constructor
    public J2() {
//        getting user input
        var scanner = new Scanner(System.in);
        System.out.println("Enter words to be translated: ");
        word = scanner.nextLine();

//        runs program until user types "quit!"
        while (! word.equals("quit!")){
            word = scanner.nextLine();

//            if word is 3 or less characters
            if (word.length() < 4) System.out.println(word);

//            if word longer than 3 characters
            else {
//                checks if second last letter is an o
                if (word.charAt(word.length() - 2) == 'o') {

                }
            }
        }
    }
}
