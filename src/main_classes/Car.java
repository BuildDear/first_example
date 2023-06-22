package main_classes;

public class Car
{
    static String brand;
    static int motorWareRate;
    static int gearBoxWareRate;
    static int maxSpeed;

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Car.brand = brand;
    }

    public static int getMotorWareRate() {
        return motorWareRate;
    }

    public static void setMotorWareRate(int motorWareRate) {
        Car.motorWareRate = motorWareRate;
    }

    public static int getGearBoxWareRate() {
        return gearBoxWareRate;
    }

    public static void setGearBoxWareRate(int gearBoxWareRate) {
        Car.gearBoxWareRate = gearBoxWareRate;
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public static void setMaxSpeed(int maxSpeed) {
        Car.maxSpeed = maxSpeed;
    }
}
