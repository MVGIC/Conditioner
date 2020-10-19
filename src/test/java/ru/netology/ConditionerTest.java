package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {

        Conditioner conditioner = new Conditioner();

        int initialTemperature = conditioner.currentTemperature;
        int expected = conditioner.currentTemperature++;


        int actual = conditioner.increaseCurrentTemperature(initialTemperature);

        assertEquals(expected, actual);

    }

    @Test
    void decreaseCurrentTemeperature() {
        Conditioner conditioner = new Conditioner();

        int expected = conditioner.currentTemperature--;

        int actual = conditioner.getCurrentTemperature();

        assertEquals(expected, actual);


    }
}