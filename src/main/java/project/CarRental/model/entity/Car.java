package project.CarRental.model.entity;

import project.CarRental.model.dto.DepartmentDto;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String make;
    private String model;
    private String carBody;
    private Integer productionDate;
    private String color;
    private Integer carMileage;
    private String carStatus;
    private BigDecimal pricePerDay;
    private String availableInDep;

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public Integer getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Integer productionDate) {
        this.productionDate = productionDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Integer carMileage) {
        this.carMileage = carMileage;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getAvailableInDep() {
        return availableInDep;
    }

    public void setAvailableInDep(String availableInDep) {
        this.availableInDep = availableInDep;
    }
}
