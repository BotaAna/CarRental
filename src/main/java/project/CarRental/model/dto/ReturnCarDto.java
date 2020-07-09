package project.CarRental.model.dto;

import project.CarRental.model.entity.Employee;
import project.CarRental.model.entity.Reservation;

import java.math.BigDecimal;
import java.util.Date;

public class ReturnCarDto {

    private Integer id;
    private EmployeeDto employee;
    private Date returnDate;
    private ReservationDto reservationNumber;
    private String comments;
    private BigDecimal balance;


    public ReturnCarDto() {
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

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
