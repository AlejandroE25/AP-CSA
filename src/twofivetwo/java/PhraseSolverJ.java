package twofivetwo.java;

import static java.lang.System.exit;
import static twofivetwo.java.HelperFunctionsJ.*;

public class PhraseSolverJ {
    private PlayerJ playerJ1;
    private PlayerJ playerJ2;

    private BoardJ game;

    private Boolean solved;

    private int currentPlayer = 1;

    public PhraseSolverJ(){
        this.playerJ1 = new PlayerJ();
        this.playerJ2 = new PlayerJ();
        this.game = new BoardJ();
        this.solved = false;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void play() {
        String guess = "";
        while (!solved) {
            if (game.isSolved(guess)) {
                solved = true;
                cls();
                print("Congratulations, you solved the phrase!");

                if (currentPlayer == 1) {
                    playerJ1.addPoints(1000);
                } else {
                    playerJ2.addPoints(1000);
                }

                print("Player 1: " + playerJ1.getPoints() + " points");
                print("Player 2: " + playerJ2.getPoints() + " points");

                if (playerJ1.getPoints() > playerJ2.getPoints()) {
                    print("Player 1 wins!");
                } else if (playerJ2.getPoints() > playerJ1.getPoints()) {
                    print("Player 2 wins!");
                } else {
                    print("It's a tie!");
                }
                exit(0);
            }
            else if (game.getGameWon()) {
                solved = true;
                cls();
                print("Congratulations, you solved the phrase!");
                print("Player 1: " + playerJ1.getPoints() + " points");
                print("Player 2: " + playerJ2.getPoints() + " points");

                if (playerJ1.getPoints() > playerJ2.getPoints()) {
                    print("Player 1 wins!");
                } else if (playerJ2.getPoints() > playerJ1.getPoints()) {
                    print("Player 2 wins!");
                } else {
                    print("It's a tie!");
                }

                exit(0);
            }
            else {
                cls();
                print(game.getSolvedPhrase());
            }

            switch (currentPlayer) {
                case 1:
                    guess = input("Player 1, guess a letter or phrase: ");
                    Boolean correct = game.guessLetter(guess);
                    if (correct) {
                        print("Correct!");
                        playerJ1.addPoints(100);
                    } else {
                        print("Incorrect!");
                    }
                    break;
                case 2:
                    guess = input("Player 2, guess a letter or phrase: ");
                    correct = game.guessLetter(guess);
                    if (correct) {
                        print("Correct!");
                        playerJ2.addPoints(100);
                    } else {
                        print("Incorrect!");
                    }
                    break;
            }

        }
    }

}
