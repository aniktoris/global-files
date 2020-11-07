package Test;

import com.example.test.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private Model model;
    @BeforeEach
    public void setup() {
        model = new Model();
        System.out.println("Running a test...");
    }

    @Test
    void checkValue() {
        int rightValue = 1;
        boolean checkValue = (rightValue == 1);
        assertTrue(model.checkValue(1) == checkValue == true);
    }

    @RepeatedTest(1000)
    void setValue0() {
        model.setValue();
        assertEquals(0, model.getRightValue());
    }

    @RepeatedTest(1000)
    void setValue100() {
        model.setValue();
        assertEquals(100, model.getRightValue());
    }
}