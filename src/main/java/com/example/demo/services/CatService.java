package com.example.demo.services;

import com.example.demo.models.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    @Autowired
    CatRepository catRepository;

    public Cat createCat(Cat cat){
        return catRepository.save(cat);
    }
    public Cat getCatbyId(String id){
        return catRepository.findById(id).get();
    }
    public List<Cat> getAllCats(){
        return catRepository.findAll();
    }
    public  Cat updateCat(Cat cat){
        return catRepository.save(cat);
    }
    public String deteteCat(String id){
        catRepository.deleteById(id);
        return "Katten har tagits bort!";
    }
    //TODO
    //public List<Cat>
}
