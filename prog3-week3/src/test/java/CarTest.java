import org.example.car.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void test1() {
        CarBuilder builder = new CarBuilder();

        Engine e1 = new Engine("v4", "DTI", 1200, 1.2e6);
        GearShift gs1 = new GearShift("ZTF-5", .8e6);
        Chassis c1 = new Chassis("Golf4", .8e6);

        Car target = builder.addEngine(e1).addGearShift(gs1).addChassis(c1).build();

        double expected = 1.2e6 + .8e6 + .8e6;
        double actual = target.getFullPrice();

        Assertions.assertEquals(expected, actual, 0.0001);
    }
}
