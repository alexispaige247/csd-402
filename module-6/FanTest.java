// Alexis Mitchell
// September 7, 2025
// This program tests the Fan class

public class FanTest {
    public static void main(String[] args) {

        // Fan with default constructor
        Fan defaultFan = new Fan();

        // Fan with argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        // Display default fan
        System.out.println("Default Fan: " + defaultFan);

        // Display custom fan
        System.out.println("Custom Fan: " + customFan);

        // Modify default fan
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8);
        defaultFan.setColor("red");

        // Show updated fan
        System.out.println("Updated Default Fan: " + defaultFan);

        // Turn off custom fan
        customFan.setOn(false);
        System.out.println("Custom Fan After Turning Off: " + customFan);
    }
}