import org.example.Cat;
import org.example.Mouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    public void catCloneTest1() {
        String name = "Szusi";
        int legCount = 4;

        Cat cat1 = new Cat(name, legCount);

        String actualName = cat1.getName();
        Assertions.assertEquals(name, actualName);

        int actualLegCount = cat1.getLegCount();
        Assertions.assertEquals(legCount, actualLegCount);
    }

    @Test
    public void catCloneTest() {
        String name = "Szusi";
        int legCount = 4;

        Cat cat1 = new Cat(name, legCount);
        Cat cat2 = cat1.clone();

        String expectedName = cat1.getName();
        String actualName = cat2.getName();
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertNotSame(cat1, cat2);
    }

    @Test
    public void catCloneTest3() {
        String name = "Szusi";
        int legCount = 4;

        Cat cat1 = new Cat(name, legCount);
        Cat cat2 = cat1;

        cat2.setName("Kormi");
        Assertions.assertEquals("Kormi", cat1.getName());
    }

    @Test
    public void mouseCloneTest1() {
        double weight = 0.3;
        boolean isMale = true;

        Mouse mouse1 = new Mouse(weight, isMale);
        Mouse mouse2 = mouse1.clone();

        Assertions.assertEquals(mouse1.getWeight(), mouse2.getWeight(), 0.001);
        Assertions.assertEquals(mouse1.isMale(), mouse2.isMale());
        Assertions.assertNotSame(mouse1, mouse2);
    }
}
