package com.SpringBootDemo.service;

import com.SpringBootDemo.LaptopRepository;
import com.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("Method called");
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
