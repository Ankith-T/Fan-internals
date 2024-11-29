public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speedOfFan;
    private double radiusOfFan;
    private String colorOfFan;
    private boolean fanOnorOff;
    
    public Fan(){
        speedOfFan = SLOW;
        fanOnorOff = false;
        radiusOfFan = 5.0;
        colorOfFan = "blue";
    }
    public String toString() {
        if (fanOnorOff) {
            return "A " + radiusOfFan + " inch " + colorOfFan + " fan at a speed of " + speedOfFan;
        } else {
            return "A " + radiusOfFan + " inch " + colorOfFan + " fan & fan is off";
        }
    }
    public int getSpeed() {
        return speedOfFan;
    }

    public void setSpeed(int speed) {
        this.speedOfFan = speed;
    }

    public boolean isFanOn() {
        return fanOnorOff;
    }

    public void setFanOn(boolean isFanOn) {
        this.fanOnorOff = isFanOn;
    }

    public double getRadius() {
        return radiusOfFan;
    }

    public void setRadius(double radius) {
        this.radiusOfFan = radius;
    }

    public String getColor() {
        return colorOfFan;
    }

    public void setColor(String color) {
        this.colorOfFan = color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setFanOn(true);

        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setFanOn(false);

        System.out.println(fan2);
    }
    

}
