package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1500;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);


    }

    public static int displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " manaed to get into position " + position + " on the high score table");
        return 0;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000) {
            return 1;
        }
        else if(playerScore > 500 && playerScore < 1000) {
            return 2;
        }
        else if(playerScore < 500 && playerScore > 100) {
            return 3;
        }
        else {
            return 4;
        }
    }



    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

}
