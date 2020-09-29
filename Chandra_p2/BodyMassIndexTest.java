import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {
    private final BodyMassIndex BMI = new BodyMassIndex(1,1);
    
    @Test
    void testIndex() {
        assertEquals(27.1, BMI.FindIndex(72, 200));
    }
    
    @Test
    void testUnderWeight(){
        assertEquals("underweight.", BMI.FindCategory(13.6));
    }
    @Test
    void testNormalWeight() {
        assertEquals("normal.", BMI.FindCategory(20.3));
    }
    @Test
    void testOverWeight() {
        assertEquals("overweight.", BMI.FindCategory(27.1));
    }
    @Test
    void testObeseWeight() {
        assertEquals("obese.", BMI.FindCategory(40.3));
    }
    
    @Test
    void testBoss(){
        BodyMassIndex bmi = new BodyMassIndex(72, 200);
        assertEquals(27.1,bmi.index);
        assertEquals("overweight.",bmi.category);
    }
}
