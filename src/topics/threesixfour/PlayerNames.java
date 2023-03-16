package topics.threesixfour;

public class PlayerNames {
    private final Player[] players = {new Player("Alex"), new Player("Aiden"),
                                new Player("Bobbie"), new Player(""),
                                new Player("Chris"), new Player("")};

    public Boolean isDuplicate(String newName) {
        for (Player p : players) {
            if (p.getName().equals(newName)) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkForDups() {
        for (Player p : players) {
            if (isDuplicate(p.getName())) {
                return true;
            }
        }
        return false;
    }
}
