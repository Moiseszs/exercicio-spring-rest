package com.fatec.exerciciorest.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.exerciciorest.model.BME280;

public interface Bme280Repository extends JpaRepository<BME280, Timestamp>{
    
}
