/* LearnLang.java
   Author: Ashi Vered
   Version: 1.0
   Date: 23.8.5784
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        //array for original words
        String[] words_orig = new String[10];
        //list of original words
        words_orig[0] = "אבא";
        words_orig[1] = "אמא";
        words_orig[2] = "אח";
        words_orig[3] = "אחות";
        words_orig[4] = "סבא";
        words_orig[5] = "סבתא";
        words_orig[6] = "דוד";
        words_orig[7] = "דודה";
        words_orig[8] = "אחיין";
        words_orig[9] = "אחיינית";

        //array for new words
        String[] words_new = new String[10];
        //list of new words
        words_new[0] = "father";
        words_new[1] = "mother";
        words_new[2] = "brother";
        words_new[3] = "sister";
        words_new[4] = "grandfather";
        words_new[5] = "grandmother";
        words_new[6] = "uncle";
        words_new[7] = "aunt";
        words_new[8] = "nephew";
        words_new[9] = "niece";

        for (int i = 0; i < 10; i++) {
            int selectArray = r.nextInt(2); // Randomly decide whether to prompt for a translation from original lang to new lang.
            int position = r.nextInt(9); // Randomly choose a position in the arrays (i.e. choose which word to display).
            String answer;
                if (selectArray == 0) {
                    // show word in original language.
                    String word_orig = words_orig[position];
                    String word_new = words_new[position];
                    System.out.println("the word in Hebrew: " + word_orig);
                    System.out.println("Enter translate");
                    answer = in.next();
                    if (answer.equals(word_new)) {
                        System.out.println("success!");
                        score++;
                    } else {
                        System.out.println("Error!");
                        System.out.println("Real translate is: " + word_new);
                    }
                } else {
                    // show word in new language.
                    String word_orig = words_orig[position];
                    String word_new = words_new[position];
                    System.out.println("the word in English: " + word_new);
                    System.out.println("Enter translate");
                    answer = in.next();
                    if (answer.equals(word_orig)) {
                        System.out.println("success!");
                        score++;
                    } else {
                        System.out.println("Error!");
                        System.out.println("Real translate is: " + word_orig);
                    }
                }
            }
                System.out.println("Your score: " + score + "/10");



        in.close();
    }
}
