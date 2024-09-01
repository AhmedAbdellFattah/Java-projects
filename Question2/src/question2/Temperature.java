/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author Legion
 */

class Temperature {
    private double temperature;
    private char scale;

    public Temperature() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.temperature = 0.0;
        this.scale = scale;
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getDegreesCelsius() {
        if (scale == 'C') {
            return temperature;
        } else {
            return (temperature - 32) * 5 / 9;
        }
    }

    public double getDegreesFahrenheit() {
        if (scale == 'F') {
            return temperature;
        } else {
            return (temperature * 9 / 5) + 32;
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public boolean equals(Temperature other) {
        return this.getDegreesCelsius() == other.getDegreesCelsius();
    }

    public boolean isGreaterThan(Temperature other) {
        return this.getDegreesCelsius() > other.getDegreesCelsius();
    }

    public boolean isLessThan(Temperature other) {
        return this.getDegreesCelsius() < other.getDegreesCelsius();
    }

    @Override
    public String toString() {
        return temperature + " degrees " + scale;
    }
}

