package com.blovvme.zoo;

import java.io.Serializable;

/**
 * Created by Blovvme on 8/11/17.
 */

public class Animals implements Serializable {

    String id;
    String catergory;
    String name;
    String diet;
    String status;
    String range;

    public Animals( String catergory, String name, String diet, String status, String range) {
        this.catergory = catergory;
        this.name = name;
        this.diet = diet;
        this.status = status;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id='" + id + '\'' +
                ", catergory='" + catergory + '\'' +
                ", name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", status='" + status + '\'' +
                ", range='" + range + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatergory() {
        return catergory;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
