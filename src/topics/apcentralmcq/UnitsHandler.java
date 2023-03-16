package topics.apcentralmcq;

public class UnitsHandler {
    private static int totalUnits = 0;

    private static int containers = 0;

    private static int unitsPerContainer = 0;

    public UnitsHandler(int containerSize) {
        unitsPerContainer = containerSize;
    }

    public static void update(int c) {
        containers = c;
        totalUnits = unitsPerContainer * containers;
    }

}
