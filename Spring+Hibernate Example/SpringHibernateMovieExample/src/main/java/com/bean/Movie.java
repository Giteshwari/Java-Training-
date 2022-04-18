package com.bean;

import javax.persistence.*;

@Entity
@Table(name="spring_hibernate_movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String director_name;
    private float collection;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public float getCollection() {
        return collection;
    }

    public void setCollection(float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director_name='" + director_name + '\'' +
                ", collection=" + collection +
                '}';
    }
}
