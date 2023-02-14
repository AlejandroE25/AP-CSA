package twofivetwo

class PhraseSolver {
    private val player1: Player
    private val player2: Player
    private val game: Board
    private val solved: Boolean

    init {
        player1 = Player()
        player2 = Player()
        game = Board()
        solved = false
    }

    fun play() {
        var solved = false
        val currentPlayer = 1
        val correct = true
        while (!solved) {

            /* your code here - game logic */


            /* your code here - determine how game ends */
            solved = true
        }
    }
}