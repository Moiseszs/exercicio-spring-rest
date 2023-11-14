package com.fatec.exerciciorest.controller;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.exerciciorest.model.BME280;
import com.fatec.exerciciorest.repository.Bme280Repository;

@RestController
@RequestMapping("/api")
public class MainController {
    
    @Autowired
    Bme280Repository repository;
    
    @GetMapping("/bme280")
    public List<BME280> getAll(){
        List<BME280> list = repository.findAll();
        return list;
    }

    @PostMapping("/bme280")
    public BME280 insert(@RequestBody BME280 bme){
        bme.setLocalDateTime(Timestamp.from(Instant.now()));
        BME280 res = repository.save(bme);
        return res;
    }

    @PutMapping("/bme280")
    public BME280 update(@RequestBody BME280 bme){
        BME280 res = repository.save(bme);
        return res; 
    }
    
    // A Fazer:
    // @GetMapping("/bme280/id")
    // public BME280 getOneBy(@RequestBody @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Timestamp datetime){
    //     BME280 res = repository.findById(datetime).get();
    //     return res;
    // }

    @DeleteMapping("/bme280")
    public String delete(@RequestBody BME280 bme){
        repository.delete(bme);   
        return "Deletado com sucesso";   
    }
}
