import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare
        String gussedLetter;
        Scanner keyboard;

        int minWordcount;
        int maxWordcount;
        int Incorrectguesses = 0;

        minWordcount = 3;

        keyboard = new Scanner(System.in);
        System.out.println("Hello there and WELCOME to The Hangman Game!");
        System.out.println("Here are the rules, you have 7 tries to guess the word or phrase.");
        System.out.println("If you can't correctly in 7 tries then you loose.");
        System.out.println("Guess the correct word or phrase and you win.");

        System.out.println("There are 2 types of difficulty, Mediocre and Hard, No easy mode.");
        maxWordcount = ChooseDifficulty(keyboard);

        for (int i = 0; i < 15; i++) {
            displayhangman(i);
        }

        DisplayHangman(Incorrectguesses);

        numberMisses++;
        DisplayHangman(Incorrectguesses);



        public static int chooseDifficulty(Scanner keyboard){
            System.out.println("Choose a difficulty\n1 for medicore\n2 for hard");
            switch (keyboard.nextInt){
                case 1:
                    return 2;
                case 2:
                    return 4;
                default:
                    return 2;
            }

            public static void DisplayHangman(int tries){
                switch(tries){
                    case 0:
                    default:
                        System.out.println("+-----------+")
                        System.out.println("|           |")
                }       System.out.println("            |")
                        System.out.println("            |")
                        System.out.println("|           |")
                        System.out.println("|           |")
                                break;
            }


















        }




    }
}
