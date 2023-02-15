package twofivetwo.kotlin

import java.util.*

internal object HelperFunctions {

    private val nums = "1234567890"
    private val letters = "abcdefghijklmnopqrstuvwxyz"

    fun print(vararg args: Any?, end: String? = "\n" ) { //I made my own print function.  Because java is special.
        for (obj in args) {
            kotlin.io.print("$obj ")
        }
        kotlin.io.print(end)
    }

    fun input(question: String?): String { // I made my own input function.  Because java is special.
        print(question, end=" ")
        val readLn = Scanner(System.`in`)
        // Intentionally didn't close the reader.  Because Java is special
        return readLn.nextLine()
    }

    fun sleep(secondsToSleep: Int) {
        try {
            Thread.sleep((secondsToSleep * 1000).toLong())
        } catch (ie: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }

    fun cls() {
        print("\u001b[H\u001b[2J")
        System.out.flush()
    }

    fun int(numString: String): Int {
        var finalInt = 0
        var str = ""
        for (ch in numString) {
            if (ch in nums) {
                str += ch
            }
            else break
        }
        finalInt = str.toInt()
        return finalInt
    }
}