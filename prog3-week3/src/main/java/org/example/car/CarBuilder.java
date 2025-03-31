package org.example.car;

public class CarBuilder {
    private Engine engine;
    private GearShift gearShift;
    private Chassis chassis;

    public CarBuilder addEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder addGearShift(GearShift gearShift) {
        this.gearShift = gearShift;
        return this;
    }

    public CarBuilder addChassis(Chassis chassis) {
        this.chassis = chassis;
        return this;
    }

    public Car build() {
        return new Car(engine, gearShift, chassis);
    }
}
