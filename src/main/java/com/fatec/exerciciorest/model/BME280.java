package com.fatec.exerciciorest.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BME280")
public class BME280 {

    @Id
    private Timestamp localDateTime;

    @Column(precision = 2, length = 7)
    private double pressure;

    @Column(precision = 2, length = 4)
    private double humidity;

    @Column(precision = 2, length = 4)
    private double temperature;

    public void setLocalDateTime(Timestamp localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Timestamp getLocalDateTime() {
        return localDateTime;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }
}
