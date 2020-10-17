package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int expected = conditioner.currentTemperature;

        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemeperature() {
        Conditioner conditioner = new Conditioner();

        int expected = conditioner.currentTemperature;

        assertEquals(expected, conditioner.getCurrentTemperature());


    }
}