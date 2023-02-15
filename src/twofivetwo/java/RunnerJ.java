package twofivetwo.java;

public class RunnerJ
{
    public static void main(String[] args)
    {
        PlayerJ p1 = new PlayerJ("Test Name");
        System.out.println("P1 Name:" + p1.getName());

        PlayerJ p2 = new PlayerJ(p1);
        System.out.println("P1 Name:" + p1.getName());

        System.out.println("P2 Name:" + p2.getName());
    }

}
