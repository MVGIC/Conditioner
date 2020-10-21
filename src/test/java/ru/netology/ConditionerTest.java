package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseTemperatureUnderMax() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);

        conditioner.setCurrentTemperature(20);


        conditioner.increaseCurrentTemperature();

        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseTemperatureOverMax() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);

        conditioner.setCurrentTemperature(30);


        conditioner.increaseCurrentTemperature();

        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseTemperatureOverMin() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(10);

        conditioner.setCurrentTemperature(20);


        conditioner.decreaseCurrentTemperature();

        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseTemperatureUnderMin() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(10);

        conditioner.setCurrentTemperature(10);


        conditioner.decreaseCurrentTemperature();

        assertEquals(10, conditioner.getCurrentTemperature());
    }
}