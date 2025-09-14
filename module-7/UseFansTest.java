// Alexis Mitchell
// September 14, 2025
// This program tests the Fan class by creating multiple Fan objects and displaying their states

import java.util.ArrayList;
import java.util.List;

public class UseFansTest {

    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON [Speed: " + fan.getSpeed() +
                    ", Radius: " + fan.getRadius() +
                    ", Color: " + fan.getColor() + "]");
        } else {
            System.out.println("Fan is OFF [Radius: " + fan.getRadius() +
                    ", Color: " + fan.getColor() + "]");
        }
    }

    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) displayFan(fan);
    }

    public static void main(String[] args) {
        List<Fan> fans = new ArrayList<>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "red");
        Fan fan4 = new Fan(Fan.SLOW, false, 12, "green");

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        System.out.println("Displaying all fans:");
        displayFans(fans);

        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("black");

        System.out.println("\nAfter updating Fan 1:");
        displayFan(fan1);
    }
}