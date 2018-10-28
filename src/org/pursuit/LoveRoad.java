package org.pursuit;

import java.util.Random;
import java.util.Scanner;

public class LoveRoad implements StartGameOn {

    Scanner scanner = new Scanner(System.in);


    public void startGame() {
        logo();
        instructions();
        choiceColors();
        choiceNumbers();

        System.out.println("\nThanks for playing! Type 'Y' to play again. Or type 'N' to end <3\n");

        String userInputEnd = scanner.nextLine();
        if (userInputEnd.toLowerCase().equals("y")) {
            for (int i = 0; i <= 2; i++) {
                playAgain();
            }
            gamePlayAgain();

        }

        String userInputEndNo = scanner.nextLine();
        if (userInputEndNo.toLowerCase().equals("n")) {
            endGame();
        }

    }


    private static void logo() {
        System.out.println("::::          ::::::      ::::      ::::    :::::::::\n" +
                "::::        ::::  ::::    ::::      ::::    :::::::::\n" +
                "::::       ::::    ::::   ::::      ::::    ::::\n" +
                "::::       ::::    ::::    ::::    ::::     ::::::::\n" +
                "::::       ::::    ::::     ::::  ::::      ::::\n" +
                "::::       ::::    ::::      ::::::::       ::::\n" +
                "::::::::::  ::::  ::::        ::::::        :::::::::\n" +
                "::::::::::    ::::::           ::::         :::::::::\n");
    }

    private static void instructions() {
        System.out.println("\nChoose your ideal romance and enjoy the love you’ve always wanted to in this unique journey!");
        System.out.println("\nType in the color 'Red', 'Blue', 'Yellow', or 'Green' to get Started!!!...\n");
    }

    private void choiceColors() {

        String userInput = scanner.nextLine();

        userInput.toLowerCase();
        if (userInput.toLowerCase().equals("blue")) {
            System.out.println("You picked Blue! You're almost there to finding your true love's path <3\n Please press enter to continue!");
            scanner.nextLine();
        } else if (userInput.toLowerCase().equals("red")) {
            System.out.println("You picked Red! You're almost there to finding your true love's path <3!\nPlease press enter to continue!");
            scanner.nextLine();
        } else if (userInput.toLowerCase().equals("yellow")) {
            System.out.println("You picked Yellow! You're almost there to finding your true love's path <3!\nPlease press enter to continue!");
            scanner.nextLine();
        } else if (userInput.toLowerCase().equals("green")) {
            System.out.println("You picked Green! You're almost there to finding your true love's path <3!\nPlease press enter to continue!");
            scanner.nextLine();
        } else {
            System.out.println("Sowwie - Wrong color input. Please try again!");
            choiceColors();

        }


    }

    private void choiceNumbers() {
        System.out.println("\nLucky you! Now type a number between 1 through 8 and press enter to find out your love's journey!");
        Random random = new Random();
        int numberChoice = random.nextInt(9 - 2) + 1;
        String numberChoiceInput;
        scanner.nextInt();

        switch (numberChoice) {
            case 1:
                numberChoiceInput = "You have a place, which you can touch, and it'll make you crazy...It's your heart!\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 2:
                numberChoiceInput = "You will fall head over heels soon!\n You know you're in love when you can't fall asleep because reality is finally better than your dreams.\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 3:
                numberChoiceInput = "Friendships are your strong suit!\n A friend is someone who knows all about you and still loves you.\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 4:
                numberChoiceInput = "Be wary who you give your heart to.\n We accept the love we think we deserve.\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 5:
                numberChoiceInput = "A true rebel with a heart of gold.\n You speak what's on your mind and know that it is better to be hated for what you are than to be loved for what you are not.\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 6:
                numberChoiceInput = "Being deeply loved by someone gives you strength, while loving someone deeply gives you courage.\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 7:
                numberChoiceInput = "There is never a time or place for true love. It happens accidentally, in a heartbeat, in a single flashing moment.For you this will happen soon!\n Press Enter to continue...";
                scanner.nextLine();
                break;
            case 8:
                numberChoiceInput = "You don't love someone because they're perfect, you love them in spite of the fact that they're not.\n Press Enter to continue...";
                scanner.nextLine();
                break;
            default:
                numberChoiceInput = "Sowwie - Wrong input. Please try again!";
                scanner.nextInt();
                break;

        }
        System.out.println(numberChoiceInput);
        scanner.nextLine();


    }

    private void playAgain() {
        instructions();
        choiceColors();
        choiceNumbers();

    }



    @Override
    public void gamePlayAgain() {

        System.out.println("\nYou've reached the limit of game plays! Thanks for playing <3\n");
        endGame();
    }

    private void endGame() {
        System.out.println("Please Type 'Exit' to end the game my love <3");
        String userInputExit = scanner.nextLine();
        userInputExit.toLowerCase();
        while (!userInputExit.toLowerCase().equals("exit")) {

            System.out.println("Please try again <3");
            scanner.nextLine();
            break;
        }
    }

}


