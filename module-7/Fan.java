// Alexis Mitchell
// September 14, 2025
// This program defines a Fan class with properties and methods to manage fan state

public class Fan {  
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() { return this.speed; }
    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) this.speed = speed;
    }

    public boolean isOn() { return this.on; }
    public void setOn(boolean on) { this.on = on; }

    public double getRadius() { return this.radius; }
    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
    }

    public String getColor() { return this.color; }
    public void setColor(String color) {
        if (color != null && !color.isEmpty()) this.color = color;
    }
}
