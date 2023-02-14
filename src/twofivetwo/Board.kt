package twofivetwo

import java.io.File
import java.util.*

class Board {
    private var solvedPhrase = ""
    private val phrase: String
    private var currentLetterValue = 0

    /* your code here - constructor(s) */
    init {
        phrase = loadPhrase()
        /*this.currentLetterValue = */setLetterValue()
        HelperFunctions.print("Phrase:", phrase)
    }

    /* your code here - accessor(s) */ /* your code here - mutator(s)  */ /* ---------- provided code, do not modify ---------- */
    fun setLetterValue() {
        val randomInt = (Math.random() * 10 + 1).toInt() * 100
        currentLetterValue = randomInt
    }

    fun isSolved(guess: String): Boolean {
        return phrase == guess
    }

    private fun loadPhrase(): String {
        var tempPhrase = ""
        var numOfLines = 0
        try {
            val sc = Scanner(File("src/twofivetwo/phrases.txt"))
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
            val sc = Scanner(File("src/twofivetwo/phrases.txt"))
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