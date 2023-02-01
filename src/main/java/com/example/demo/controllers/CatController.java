package com.example.demo.controllers;

import com.example.demo.models.Cat;
import com.example.demo.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/")
public class CatController {

    @Autowired
    CatService catService;

    //Den går till localhost
    @PostMapping("cat")
    public Cat createCat(@RequestBody Cat cat){
        return catService.createCat(cat);
    }

    @GetMapping("cat")
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }
}
