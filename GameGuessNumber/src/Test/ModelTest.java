package Test;

import com.example.test.Model;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @org.junit.jupiter.api.Test
    void checkValue() {
        int rightValue = 1;
        Model model = new Model();
        boolean checkValue = (rightValue == 1);
        assertTrue(model.checkValue(1) == checkValue);
    }
}