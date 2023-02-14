package twofivetwo

import twofivetwo.HelperFunctions.input
import twofivetwo.HelperFunctions.print

class Player {
    private var name = ""
    var points = 0.0
        private set

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
        name = p.name
        points = p.points
    }

    fun getName(): String {
        return name
    }

    fun setName(x: String) {
        name = x
    }
}