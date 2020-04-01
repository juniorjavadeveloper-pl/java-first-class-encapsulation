package pl.juniorjavadeveloper.java.first.clazz.encatsulation;

public class CarEngineMain {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
//        thermostat.temperature = 99.99;

        // użycie własnej metody ustawiającej wartość
        thermostat.changeTemp(101.0);
        double showTemp = thermostat.showTemp();
        System.out.println("Temperatura dla termostatu: " + showTemp);

        // użycie metod set i get
        thermostat.setTemperature(80.0);
        double temperature = thermostat.getTemperature();
        System.out.println("Temperatura dla termostatu: " + temperature);
    }
}
