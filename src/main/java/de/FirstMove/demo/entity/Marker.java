package de.FirstMove.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Marker {

    //Variablen

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private double lat;
    @NotNull
    private double lng;
    @NotNull
    private double c_lat;
    @NotNull
    private double c_lng;
    @NotNull
    private Integer icon_number;
    @NotNull
    private Integer color_number;
    @NotNull
    private Integer zoom;
    @NotNull
    private Integer radius;

    public String marker;
    @NotNull
    private Integer img_number;


    public Marker() {
    }

    public Marker(Integer id, String name, Double lat, Double lng, Double c_lat, Double c_lng, Integer icon_number, Integer img_number, Integer color_number, Integer zoom, Integer radius) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.c_lat = c_lat;
        this.c_lng = c_lng;
        this.icon_number = icon_number;
        this.color_number = color_number;
        this.zoom = zoom;
        this.img_number = img_number;
        this.radius = radius;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getC_lat() {
        return c_lat;
    }

    public void setC_lat(double c_lat) {
        this.c_lat = c_lat;
    }

    public double getC_lng() {
        return c_lng;
    }

    public void setC_lng(double c_lng) {
        this.c_lng = c_lng;
    }

    public Integer getIcon_number() {
        return icon_number;
    }

    public void setIcon_number(Integer icon_number) {
        this.icon_number = icon_number;
    }

    public Integer getColor_number() {
        return color_number;
    }

    public void setColor_number(Integer color_number) {
        this.color_number = color_number;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }


    // Setter und Getter Funktionen von Marker

    public void setMarker(String marker) {

       // this.marker.concat(marker);

        this.marker = marker;

    }

    public String getMarker() {

        return this.marker;
    }


    public String to_String() {
        return "{" +
                "id = " + id +
                ". name= '" + name + '\'' +
                ". lat= '" + lat + '\'' +
                ". lng= '" + lng + '\'' +
                ". c_lat= '" + c_lat + '\'' +
                ". c_lng= '" + c_lng + '\'' +
                ". color_number= '" + color_number + '\'' +
                ". img_number= '" + img_number + '\'' +
                ". icon_number= '" + icon_number + '\'' +
                ". zoom= '" + zoom + '\'' +
                ". radius= '" + radius + '\'' +
                '}';
    }

    public Integer getImg_number() {
        return img_number;
    }

    public void setImg_number(Integer img_number) {
        this.img_number = img_number;
    }
}
