package pl.juniorjavadeveloper.java.first.clazz.encatsulation;

public class Thermostat {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // metoda publiczna zmieniająca wartość temperatury termostatu
    public void changeTemp(double newTemperature) {
        if (newTemperature >= 60 && newTemperature <= 100) {
            this.temperature = newTemperature;
        } else {
            System.out.println("Niepoprawna wartość temperatury!");
        }
    }

    // metoda publiczna zwracająza wartość temperatury termostatu
    public double showTemp() {
        return this.temperature;
    }
}
