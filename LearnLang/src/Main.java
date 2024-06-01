/* LearnLang.java
   Author: Ashi Vered
   Version: 1.1
   Date: 25.9.5784
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        int num_words = 19;
        int num_questions = 10;
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        //array to mark which positions are used
        boolean[] used = new boolean[20];



        //array for original words
        String[] words_orig = {"אבא", "אמא", "אח", "אחות", "סבא", "סבתא", "דוד", "דודה", "אחיין", "אחיינית", "יהלום", "חבר", "משפחה", "טוב", "רע", "אמת", "שקר", "מחשב", "יפה", "מכוער"};

        //array for new words
        String[] words_new =  {"father", "mother", "brother", "sister", "grandfather", "grandmother", "uncle", "aunt", "nephew", "niece", "diamond", "friend", "family", "good", "bad", "true", "false", "computer", "beautiful", "ugly"};


        for (int i = 0; i < num_questions; i++) {
            int selectArray = r.nextInt(2); // Randomly decide whether to prompt for a translation from original lang to new lang.
            int position; // Randomly choose a position in the arrays (i.e. choose which word to display).
            String answer;
            // check if position are used
            do {
                position = r.nextInt(num_words);
            } while (used[position]);
            used[position] = true;

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
