import org.example.journey.Journey;
import org.example.journey.JourneyBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JourneyTest {

    @Test
    public void test1() {
        JourneyBuilder builder = new JourneyBuilder();

        String dest1 = "Nyíregyháza", dest2 = "Budapest";
        builder.addDestination(dest1).addDestination(dest2);
        Journey target = builder.build();

        int expected = 2;
        int actual = target.getDestinationCount();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        JourneyBuilder builder = new JourneyBuilder();

        String dest1 = "Nyíregyháza", dest2 = "Budapest";
        int lengthDays1 = 2, lengthDays2 = 3;

        builder.addDestination(dest1, lengthDays1).addDestination(dest2, lengthDays2);
        Journey target = builder.build();

        int expected = lengthDays1 + lengthDays2;
        int actual = target.journeyLengthDays();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        JourneyBuilder builder = new JourneyBuilder();

        String dest1 = "Nyíregyháza", dest2 = "Budapest";
        builder.addDestination(dest1).addDestination(dest2);
        Journey target = builder.build();

        int expected = 2;
        int actual = target.journeyLengthDays();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        JourneyBuilder builder = new JourneyBuilder();

        String dest1 = "Nyíregyháza", dest2 = "Budapest";
        // HotelStars hotel1 = HotelStars.XXX, hotel2 = HotelStars.XXXX;

        builder.addDestination(dest1).addDestination(dest2);
        Journey target = builder.build();

        int expected = 2;
        int actual = target.journeyLengthDays();

        Assertions.assertEquals(expected, actual);
    }
}
