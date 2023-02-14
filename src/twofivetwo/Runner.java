package twofivetwo;

public class Runner
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Test Name");
        System.out.println("P1 Name:" + p1.getName());

        Player p2 = new Player(p1);
        System.out.println("P1 Name:" + p1.getName());

        System.out.println("P2 Name:" + p2.getName());
    }

}
