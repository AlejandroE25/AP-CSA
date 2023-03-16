package topics.twofivetwo.kotlin

import topics.twofivetwo.kotlin.HelperFunctions.input
import topics.twofivetwo.kotlin.HelperFunctions.print

class Player {
    private var name = ""
    var points = 0.0

    constructor() {
        name = input("Enter Player Name:")
        print("Welcome $name")
        points = 0.0
    }

    constructor(playerName: String) {
        name = playerName
        print("Welcome $name")
        points = 0.0
    }

    constructor(p: Player) {
        /* incomplete */
        name = p.name
        points = p.points
    }

    fun getName(): String {
        /* Incomplete */
        return name
    }

    fun setName(x: String) {
        /* incomplete */
        name = x
    }
}