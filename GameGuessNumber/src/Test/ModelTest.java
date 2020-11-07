package Test;

import com.example.test.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    void checkValue() {
        int rightValue = 1;
        Model model = new Model();
        boolean checkValue = (rightValue == 1);
        assertTrue(model.checkValue(1) == checkValue);
    }

    @Test
    void testCheckValue() {
    }
}