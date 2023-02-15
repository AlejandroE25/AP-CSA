package twofivetwo.java;

import static twofivetwo.java.HelperFunctionsJ.input;
import static twofivetwo.java.HelperFunctionsJ.print;

public class PlayerJ
{
    private String name = "";
    private double points;

    public PlayerJ(){
        this.name = input("Enter Player Name: ");
        print("Welcome ", this.name);
        this.points = 0;
    }

    public PlayerJ(String playerName) {
        this.name = playerName;
        print("Welcome ", this.name);
        this.points = 0;
    }

    public PlayerJ(PlayerJ p)
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

