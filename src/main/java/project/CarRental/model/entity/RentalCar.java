package project.CarRental.model.entity;

import project.CarRental.model.dto.EmployeeDto;
import project.CarRental.model.dto.ReservationDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class RentalCar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    //private Employee employee;
    private Date rentalDate;
    //private Reservation reservationNumber;
    private String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
