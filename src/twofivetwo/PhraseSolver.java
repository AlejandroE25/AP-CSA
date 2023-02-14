package twofivetwo;

public class PhraseSolver {
    private Player player1;
    private Player player2;

    private Board game;

    private Boolean solved;

    public PhraseSolver(){
        this.player1 = new Player();
        this.player2 = new Player();
        this.game = new Board();
        this.solved = false;
    }

    public void play()
    {
        boolean solved = false;
        int currentPlayer = 1;

        boolean correct = true;
        while (!solved)
        {

            /* your code here - game logic */


            /* your code here - determine how game ends */
            solved = true;
        }

    }

}
