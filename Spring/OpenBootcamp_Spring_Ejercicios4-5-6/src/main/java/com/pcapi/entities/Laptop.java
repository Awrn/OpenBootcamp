package com.pcapi.entities;
import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;

    private Integer year;
    private Float price;
    private Integer ram;
    private Integer batterycapacity;
    private Integer autonomy;
    private Float screenSize;
    private Integer disccapacity;


    public Laptop() {
    }

    public Laptop(Long id, String brand, String model, Integer year, Float price, Integer ram, Integer batterycapacity, Integer autonomy, Float screenSize, Integer disccapacity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.ram = ram;
        this.batterycapacity = batterycapacity;
        this.autonomy = autonomy;
        this.screenSize = screenSize;
        this.disccapacity = disccapacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getBatterycapacity() {
        return batterycapacity;
    }

    public void setBatterycapacity(Integer batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    public Integer getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(Integer autonomy) {
        this.autonomy = autonomy;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getDisccapacity() {
        return disccapacity;
    }

    public void setDisccapacity(Integer disccapacity) {
        this.disccapacity = disccapacity;
    }
}
