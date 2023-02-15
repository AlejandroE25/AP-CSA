package twofivetwo.java;

public class PhraseSolverJ {
    private PlayerJ playerJ1;
    private PlayerJ playerJ2;

    private BoardJ game;

    private Boolean solved;

    public PhraseSolverJ(){
        this.playerJ1 = new PlayerJ();
        this.playerJ2 = new PlayerJ();
        this.game = new BoardJ();
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
