/**we are making a java program  The Game is in two languages - English and Hindi. You can choose the language you want to play in. The game has 5 questions. You have to answer all the questions correctly to win the game. You have 4 options for each question. You have to choose the correct option. If you answer a question correctly, you win the money for that question. If you answer a question incorrectly, you lose the game. You can quit the game at any time by typing `quit` in the terminal.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a language - English or Hindi");
        String language = scanner.nextLine();
        if (language.equals("English")) {
            System.out.println("Welcome to the game! You have 5 questions. Each question has 4 options. You have to choose the correct option to win the money for that question. You can quit the game at any time by typing `quit` in the terminal.");
        } else if (language.equals("Hindi")) {
            System.out.println("स्वागत है! आपके पास 5 प्रश्न हैं। प्रत्येक प्रश्न में 4 विकल्प हैं। आप प्रत्येक प्रश्न के लिए जीतने के लिए सही विकल्प का चयन करना होगा। आप गेम को किसी भी समय टाइप करके छोड़ सकते हैं `quit` टर्मिनल में।");
        }
        System.out.println("Question 1 - What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");

        String question1 = scanner.nextLine();
        if (question1.equals("quit")) {
            System.out.println("You quit the game!");
            return;
        }
        if (question1.equals("2")) {
            if (language.equals("English")) {
                System.out.println("You answered correctly! You win 1000 rupees.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप सही उत्तर दिए! आप 1000 रुपए जीतते हैं।");
            }
        } else {
            if (language.equals("English")) {
                System.out.println("You answered incorrectly! You lose the game.");
                System.out.println("You have not won any money.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप गलत उत्तर दिए! आप गेम खो देते हैं।");
                System.out.println("आपने कोई पैसा नहीं जीता है।");
            }
            return;
        }

        System.out.println("Question 2 - What is the capital of Maharashtra?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        String question2 = scanner.nextLine();
        if (question2.equals("quit")) {
            System.out.println("You quit the game!");
            return;
        }
        if (question2.equals("1")) {
            if (language.equals("English")) {
                System.out.println("You answered correctly! You win 10000 rupees.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप सही उत्तर दिए! आप 10000 रुपए जीतते हैं।");
            }
        } else {
            if (language.equals("English")) {
                System.out.println("You answered incorrectly! You lose the game.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप गलत उत्तर दिए! आप गेम खो देते हैं।");
            }
            return;
        }

        System.out.println("Question 3 - What is the capital of West Bengal?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        String question3 = scanner.nextLine();
        if (question3.equals("quit")) {
            System.out.println("You quit the game!");
            return;
        }
        if (question3.equals("3")) {
            if (language.equals("English")) {
                System.out.println("You answered correctly! You win 100000 rupees.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप सही उत्तर दिए! आप 100000 रुपए जीतते हैं।");
            }
        } else {
            if (language.equals("English")) {
                System.out.println("You answered incorrectly! You lose the game.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप गलत उत्तर दिए! आप ग एम खो देते हैं।");
            }
            return;
        }

        System.out.println("Question 4 - What is the capital of Tamil Nadu?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        String question4 = scanner.nextLine();
        if (question4.equals("quit")) {
            System.out.println("You quit the game!");
            return;
        }
        if (question4.equals("4")) {
            if (language.equals("English")) {
                System.out.println("You answered correctly! You win 1000000 rupees.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप सही उत्तर दिए! आप 1000000 रुपए जीतते हैं।");
            }
        } else {
            if (language.equals("English")) {
                System.out.println("You answered incorrectly! You lose the game.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप गलत उत्तर दिए! आप गेम खो देते हैं।");
            }
            return;
        }

        System.out.println("Question 5 - What is the capital of Delhi?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        String question5 = scanner.nextLine();
        if (question5.equals("quit")) {
            System.out.println("You quit the game!");
            return;
        }
        if (question5.equals("2")) {
            if (language.equals("English")) {
                System.out.println("You answered correctly! You win 10000000 rupees.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप सही उत्तर दिए! आप 10000000 रुपए जीतते हैं।");
            }
        } else {
            if (language.equals("English")) {
                System.out.println("You answered incorrectly! You lose the game.");
            } else if (language.equals("Hindi")) {
                System.out.println("आप गलत उत्तर दिए! आप गेम खो देते हैं।");
            }
            return;
        }

        // we have reached the end of the game
        if (language.equals("English")) {
            System.out.println("Congratulations! You have won the game!");
        } else if (language.equals("Hindi")) {
            System.out.println("बधाई हो! आपने गेम जीत लिया है!");
        }

    }

}
