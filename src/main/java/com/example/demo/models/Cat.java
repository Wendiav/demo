package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "cat")
public class Cat {

    @Id
    private String id;


    @Field(name= "cat_breed")
    private String breed;

    @Field(name = "location_of_origin")
    private String origin;

    private String type;

    @Field(name= "body_type")
    private String bodyType;

    @Field(name= "coat_pattern")
    private String coat;

    //Constructor

    public Cat() {
    }

    public Cat(String id, String breed, String origin, String type, String bodyType, String coat) {
        this.id = id;
        this.breed = breed;
        this.origin = origin;
        this.type = type;
        this.bodyType = bodyType;
        this.coat = coat;
    }
//Getter and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }
}
