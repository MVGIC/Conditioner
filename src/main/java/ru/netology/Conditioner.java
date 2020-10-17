package ru.netology;

public class Conditioner {
    String name;
    int maxTemperature;
    int minTemperature;
    int currentTemperature;
    boolean on;


    public void increaseCurrentTemperature() {

        if (currentTemperature < maxTemperature) {
            this.currentTemperature = currentTemperature++;
        }
        if (currentTemperature > maxTemperature) {
            return;
        }
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            this.currentTemperature = currentTemperature--;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }


}



