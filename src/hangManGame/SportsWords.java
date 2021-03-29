package hangManGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SportsWords extends WordBank1 implements Game {
    private String[] sportsWords = new String[9];
    public static String foundWord;
    public static int level;
    public static int index;
    public static int numOfTriesLefts;
    public static char[] displayChar;
    public int numIncorrectGuesses = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static String randomWordToGuess;

    public SportsWords() {
    }

    public SportsWords(String[] sportsWords) {
        this.sportsWords = sportsWords;
    }

    public String[] getSportsWords() {
        return sportsWords;
    }

    public void setSportsWords(String[] sportsWords) {
        this.sportsWords = sportsWords;
    }


    @Override
    public String[] initializeWordBank() {
        sportsWords[0] = "athlete";
        sportsWords[1] = "badminton";
        sportsWords[2] = "cricket";
        sportsWords[3] = "basketball";
        sportsWords[4] = "stump";
        sportsWords[5] = "hockey";
        sportsWords[6] = "bat";
        sportsWords[7] = "ball";
        sportsWords[8] = "playground";
        return sportsWords;
    }

    @Override
    public void playGameWithSelecteCatagory() {
        //generate Random Words
        SportsWords sw = new SportsWords();
        String[] swords = sw.initializeWordBank();
        Random rn = new Random();
        int index = rn.nextInt(sportsWords.length);
        System.out.println("Random word generated: " + swords[index]);
        for (int i = 0; i < swords.length; i++) {
            System.out.println(swords[i]);
        }
        //convert Random Words to Dashes
        randomWordToGuess = swords[index].toLowerCase();
        for (int i = 0; i < randomWordToGuess.length(); i++) {
            int wordLength = randomWordToGuess.length();
            displayChar = new char[wordLength];
            for (int j = 0; j < randomWordToGuess.length(); j++) {
                if (randomWordToGuess.charAt(j) == ' ') {
                    displayChar[j] = ' ';
                    System.out.print(" ");
                } else {
                    displayChar[j] = '_';
                    System.out.print("_ ");
                }
            }
            System.out.println("\nRandom Word: " + randomWordToGuess);


//            do {
            Boolean continueGame = true;
            int availableLives = 0;
            boolean wordIsGuessed = false;
//                System.out.println("You are currently on level: " + level);

            //Letter Bank Character Array containing 26 chars
            char letterArray[] = "abcdefghijklmnopqrstuvxwyz".toCharArray();
            for (int y = 0; y < letterArray.length; y++) {
                System.out.print(letterArray[y] + " ");
            }

            int len = randomWordToGuess.length();
            boolean letterFound;

            while (continueGame) {
                letterFound = false;
                index = 0;

                System.out.print("\nGuess a letter: ");
                Scanner scanner = new Scanner(System.in);
                char letter = '0';
                try {
                    letter = scanner.next().toLowerCase().charAt(0);
                } catch (InputMismatchException e) {
                    System.out.println("Enter a character only");
                }

                //Letter is present in the letter bank array

                char temp1 = letter;
                for (int y = 0; y < letterArray.length; y++) {
                    if (letterArray[y] == temp1) {
                        letterFound = true;
                        index = y;
                        break;
                    } else {
                        letterFound = false;
                    }
                }
                //Incorrect Guess(remove letter) or invalid Guess and replace the letter with #
                if (letterFound) {
                    letterArray[index] = '#';
                } else {
                    System.out.print("Char is already chosen");
                }

                //If the random word contains the letter that user entered
                for (int y = 0; y < letterArray.length; y++) {
                    System.out.print(letterArray[y] + " ");
                }


                String str = String.valueOf(letter);
                if (randomWordToGuess.contains(str)) {
                    for (int y = 0; y < len; y++) {
                        if (randomWordToGuess.charAt(y) == letter) {
                            displayChar[y] = letter;
                            System.out.println("\nYou have chosen a correct letter");
                            if (randomWordToGuess.equalsIgnoreCase(String.valueOf(displayChar))) {
                                return;
                            }
                        }
                    }
                    System.out.println(displayChar);
                } else {

                    availableLives++;
                    System.out.println("You have chosen an incorrect letter");
                    System.out.println("Chances left " + (10 - availableLives));

                    if (availableLives == 10) {
                        System.out.println("You have lost the game");
                        System.exit(0);
                    }

                    HangmanImage hangmanImage = new HangmanImage();
                    switch (availableLives) {
                        case 1:
                            hangmanImage.man1();
                            break;
                        case 2:
                            hangmanImage.man2();
                            break;
                        case 3:
                            hangmanImage.man3();
                            break;
                        case 4:
                            hangmanImage.man4();
                            break;
                        case 5:
                            hangmanImage.man5();
                            break;
                        case 6:
                            hangmanImage.man6();
                            break;
                        case 7:
                            hangmanImage.man7();
                            break;
                        case 8:
                            hangmanImage.man8();
                            break;
                        case 9:
                            hangmanImage.man9();
                            break;
                        case 10:
                            HangmanImage.man10();
                            break;
                        default:
                            System.out.println("***ERROR: Invalid input!***");
                            break;
                    }
                    if (randomWordToGuess.equals(new String(displayChar))) {
                        continueGame = true;

                        System.out.println(level++);
                    }
                }

            }
        }
    }
}