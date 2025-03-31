package org.example.car;

public class Car {
    private Engine engine;
    private GearShift gearShift;
    private Chassis chassis;

    public Car(Engine engine, GearShift gearShift, Chassis chassis) {
        this.engine = engine;
        this.gearShift = gearShift;
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearShift getGearShift() {
        return gearShift;
    }

    public void setGearShift(GearShift gearShift) {
        this.gearShift = gearShift;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public double getFullPrice() {
        return this.engine.getPrice() + this.gearShift.getPrice() + this.chassis.getPrice();
    }
}
