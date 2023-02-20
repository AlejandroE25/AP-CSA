package twofivetwo.kotlin

import twofivetwo.kotlin.HelperFunctions.cls
import twofivetwo.kotlin.HelperFunctions.input
import twofivetwo.kotlin.HelperFunctions.print
import kotlin.system.exitProcess

class PhraseSolver {
    private val player1: Player
    private val player2: Player
    private val game: Board
    private var solved: Boolean
    private var currentPlayer = 1

    init {
        player1 = Player()
        player2 = Player()
        game = Board()
        solved = false
    }

    /**
     * This function starts the game
     */
    fun play() {
        var guess = ""
        while (!solved) {
            if (game.isSolved(guess)) {
                solved = true
                println("Congratulations! You solved the phrase!")

                // add 1000 points for solving the phrase
                if (currentPlayer == 0) {
                    player2.points += 1000
                }
                else {
                    player1.points += 1000
                }

                if (player1.points > player2.points) {
                    println("Player 1 wins!")
                }
                else if (player2.points > player1.points) {
                    println("Player 2 wins!")
                }
                else {
                    println("It's a tie!")
                }

            }
            else if (game.gameWon) {
                solved = true
                cls()
                println("Congratulations! You solved the phrase!")
                print(game.solvedPhrase)
                if (currentPlayer == 0) {
                    player2.points += 1000
                }
                else {
                    player1.points += 1000
                }

                if (player1.points > player2.points) {
                    println("Player 1 wins!")
                }
                else if (player2.points > player1.points) {
                    println("Player 2 wins!")
                }
                else {
                    println("It's a tie!")
                }
                exitProcess(0)
            }
            else if (game.gameWon) {
                solved = true
                cls()
                println("Congratulations! You solved the phrase!")
                print(game.solvedPhrase)
                if (player1.points > player2.points) {
                    print("Player 1 wins with", player1.points, "points!")
                }
                else if (player2.points > player1.points) {
                    print("Player 2 wins with", player2.points, "points!")
                }
                else {
                    println("It's a tie!")
                }
                exitProcess(0)
            }
            else {
                cls()
                print(game.solvedPhrase)
            }

            /* your code here - game logic */

            when (currentPlayer) {
                0 -> {
                    guess = input("Player $currentPlayer, guess a letter: ")
                    val correct = game.guessLetter(guess)
                    if (correct) {
                        println("Correct!")
                        player1.points += 100
                    } else {
                        println("Incorrect!")
                    }
                    currentPlayer = 1
                }
                1 -> {
                    guess = input("Player $currentPlayer, guess a letter: ")
                    val correct = game.guessLetter(guess)
                    if (correct) {
                        println("Correct!")
                        player2.points += 100
                    } else {
                        println("Incorrect!")
                    }
                    currentPlayer = 0
                }
            }
        }
    }
}