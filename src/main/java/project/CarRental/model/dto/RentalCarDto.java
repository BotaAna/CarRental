package project.CarRental.model.dto;

import java.util.Date;

public class RentalCarDto {

    private Integer id;
    private EmployeeDto employee;
    private Date rentalDate;
    private ReservationDto reservationNumber;
    private String comments;

    public RentalCarDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public ReservationDto getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(ReservationDto reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
