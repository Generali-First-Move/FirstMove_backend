package de.FirstMove.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name ="users")
public class User {

    //Variablen
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String city;
    @NotNull
    private Integer dist_train_station, dist_bus_station, dist_uni, dist_shopping, dist_park, dist_sport, dist_center, dist_nightlife, dist_safety;

    // Constructor
    public User(){};
    public User(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        //this.preferences = preferences;
    }
    public User(String name, String surname, String city, Integer dist_train_station, Integer dist_bus_station, Integer dist_uni, Integer dist_shopping, Integer dist_park, Integer dist_sport, Integer dist_center, Integer dist_nightlife, Integer dist_safety) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.dist_train_station = dist_train_station;
        this.dist_bus_station = dist_bus_station;
        this.dist_uni = dist_uni;
        this.dist_shopping = dist_shopping;
        this.dist_park = dist_park;
        this.dist_sport = dist_sport;
        this.dist_center = dist_center;
        this.dist_nightlife = dist_nightlife;
        this.dist_safety = dist_safety;
    }


    //Getter und Setter
    public Integer getDist_bus_station() {
        return dist_bus_station;
    }
    public void setDist_bus_station(Integer dist_bus_station) {
        this.dist_bus_station = dist_bus_station;
    }
    public Integer getDist_nightlife() {
        return dist_nightlife;
    }
    public void setDist_nightlife(Integer dist_nightlife) {
        this.dist_nightlife = dist_nightlife;
    }
    public Integer getDist_safety() {
        return dist_safety;
    }
    public void setDist_safety(Integer dist_safety) {
        this.dist_safety = dist_safety;
    }
    public Integer getDist_train_station() {
        return dist_train_station;
    }
    public void setDist_train_station(Integer dist_train_station) {
        this.dist_train_station = dist_train_station;
    }
    public Integer getDist_uni() {
        return dist_uni;
    }
    public void setDist_uni(Integer dist_uni) {
        this.dist_uni = dist_uni;
    }
    public Integer getDist_shopping() {
        return dist_shopping;
    }
    public void setDist_shopping(Integer dist_shopping) {
        this.dist_shopping = dist_shopping;
    }
    public Integer getDist_park() {
        return dist_park;
    }
    public void setDist_park(Integer dist_park) {
        this.dist_park = dist_park;
    }
    public Integer getDist_sport() {
        return dist_sport;
    }
    public void setDist_sport(Integer dist_sport) {
        this.dist_sport = dist_sport;
    }
    public Integer getDist_center() {
        return dist_center;
    }
    public void setDist_center(Integer dist_center) {
        this.dist_center = dist_center;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }


}
