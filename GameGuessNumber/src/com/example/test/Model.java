package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    private int min;
    private int max;

    private int rightValue;

    private List<Integer> guessedNumbers = new ArrayList<Integer>();

    //range from 1 to 99
    public void setValue() {
        min = 1;
        max = 99;
        Random random = new Random();
        rightValue = random.nextInt(max + 1);
    }

    public boolean checkValue(int yourNumber) {
        guessedNumbers.add(yourNumber);
        if (yourNumber == rightValue) {
            return false;
        } else if (yourNumber > rightValue) {
            max = yourNumber;
        } else {
            min = yourNumber;
        }
        return true;
    }

    public void setBoundaries(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getRightValue() {
        return rightValue;
    }

    public List<Integer> getGuessedNumbers() {
        return guessedNumbers;
    }
}
