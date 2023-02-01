package com.example.demo.repository;

import com.example.demo.models.Cat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends MongoRepository <Cat, String> {
    List<Cat> findByBreed(String breed);
    List<Cat> findByOriginAndType(String origin, String type);
    List<Cat> findByTypeAndCoat (String type, String coat);

}
