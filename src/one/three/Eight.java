package one.three;
import static help.HelperFunctions.*;
import static java.lang.String.valueOf;
import static java.lang.System.exit;


public class Eight {
    public static void main(String[] args) {
        print("TRIP. ON. A. POTHOLE.");
        input("Press enter to continue.");
        cls();
        print("After a long night, you exit the house, with absolutely no idea as to where you are.");
        sleep(3);
        cls();

        while (true) {
            String input = input("Do you turn left or right? \n 1) Left \n 2) Right");

            switch (valueOf(input)) {
                case "1" -> {
                    print("You walk");
                    sleep(3);


                    while (true) {
                        cls();
                        input = input("You come across a lit torch lying on the ground.  Do you pick it up?\n 1) Yes\n2) No");
                        switch (valueOf(input)){
                            case "1" -> {
                                print("With the torch, you see a pothole up ahead in the road.  As you continue walking, you forget about it");
                                sleep(3);
                                print("Not paying attention, you trip on a pothole and die.");
                                exit(0);
                            }
                            case "2" -> {
                                print("You continue walking, and trip on a pothole and die.");
                                exit(0);
                            }
                            default -> print("Invalid input.");
                        }

                    }


                }
                case "2" -> {
                    print("You trip on a pothole and die");
                    exit(0);
                }
                default -> print("Invalid selection");
            }
        }

    }
}
