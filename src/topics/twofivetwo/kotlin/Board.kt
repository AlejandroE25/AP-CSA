package topics.twofivetwo.kotlin

import java.io.File
import java.util.*

class Board {
    var solvedPhrase = ""
    private val phrase: String
    var currentLetterValue = 0
    val gameWon: Boolean
        get() {
            var won = true
            for (i in 0 until solvedPhrase.length) {
                if (solvedPhrase.substring(i, i + 1) == "_") {
                    won = false
                }
            }
            return won
        }

    /* your code here - constructor(s) */
    init {
        phrase = loadPhrase()
        /*this.currentLetterValue = */setLetterValue()
    }

    /**
     * This function sets the current letter value
     */
    fun setLetterValue() {
        val randomInt = (Math.random() * 10 + 1).toInt() * 100
        currentLetterValue = randomInt
    }

    /**
     * Checks whether the phrase has been solved
     * @param guess the current guess
     * @return true if the phrase has been solved, false otherwise
     */
    fun isSolved(guess: String): Boolean {
        return phrase == guess
    }

    /**
     * Loads a phrase from the file phrases.txt
     */
    private fun loadPhrase(): String {
        var tempPhrase = ""
        var numOfLines = 0
        try {
            val sc = Scanner(File("src/topics.twofivetwo/kotlin/phrases.txt"))
            while (sc.hasNextLine()) {
                tempPhrase = sc.nextLine().trim { it <= ' ' }
                numOfLines++
            }
        } catch (e: Exception) {
            println("Error reading or parsing phrases.txt")
        }
        val randomInt = (Math.random() * numOfLines + 1).toInt()
        try {
            var count = 0
            val sc = Scanner(File("src/topics.twofivetwo/kotlin/phrases.txt"))
            while (sc.hasNextLine()) {
                count++
                val temp = sc.nextLine().trim { it <= ' ' }
                if (count == randomInt) {
                    tempPhrase = temp
                }
            }
        } catch (e: Exception) {
            println("Error reading or parsing phrases.txt")
        }
        for (i in 0 until tempPhrase.length) {
            solvedPhrase += if (tempPhrase.substring(i, i + 1) == " ") {
                "  "
            } else {
                "_ "
            }
        }
        return tempPhrase
    }

    /**
     * Checks if the letter is in the phrase
     * @return true if the letter is in the phrase, false otherwise
     */
    fun guessLetter(guess: String): Boolean {
        var foundLetter = false
        var newSolvedPhrase = ""
        for (i in 0 until phrase.length) {
            if (phrase.substring(i, i + 1) == guess) {
                newSolvedPhrase += "$guess "
                foundLetter = true
            } else {
                newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " "
            }
        }
        solvedPhrase = newSolvedPhrase
        return foundLetter
    }
}