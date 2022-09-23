import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main
{
  public static void main(String[] args)
  {
    World habitat = new World(500,500);
    // 1. Create a Turtle object in the habitat
    Turtle robert = new Turtle(habitat);
    robert.setWidth(50);
    robert.penUp();
    robert.moveTo(200, 300);
    robert.penDown();
    // 2. Have the turtle draw a small square
    int i = 4;

    while (i>0){
      robert.forward();
      robert.turnRight();
      i--;
    }

    // 3. Have the turtle draw a large square
    robert.penUp();
    robert.moveTo(200, 300);
    robert.penDown();

    i = 4;

    while (i>0){
      robert.forward();
      robert.forward();
      robert.turnRight();
      i--;
    }

    // 4. Play around!



    habitat.show(true);
  }
}
