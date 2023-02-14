package twofivetwo;

import static twofivetwo.HelperFunctions.input;
import static twofivetwo.HelperFunctions.print;

public class Player
{
    private String name = "";
    private double points;

    public Player(){
        this.name = input("Enter Player Name: ");
        print("Welcome ", this.name);
        this.points = 0;
    }

    public Player(String playerName) {
        this.name = playerName;
        print("Welcome ", this.name);
        this.points = 0;
    }

    public Player(Player p)
    {
        name = p.name;
        p.name = "Overwritten Name";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String x)
    {
        name = x;
    }

    public double getPoints()
    {
        return points;
    }

}

