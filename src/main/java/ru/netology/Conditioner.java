package ru.netology;

public class Conditioner {
    String name;
    int maxTemperature;
    int minTemperature;
    int currentTemperature;
    boolean on;

    public void increaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature == maxTemperature)
            return;
        this.currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature == minTemperature)
            return;
        this.currentTemperature = currentTemperature - 1;
    }
}

//        public void setCurrentTemperature ( int currentTemperature){
//            if (currentTemperature > maxTemperature) {
//                return;
//            }
//            if (currentTemperature < minTemperature) {
//                return;
//            }
//            // здесь уверены, что все проверки прошли
//            this.currentTemperature = currentTemperature;

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }



