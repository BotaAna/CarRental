package project.CarRental.model.dto;

import java.util.Date;

public class ReservationDto {

    private Integer id;
    private Date reservationDate;
    private CustomerDto customer;
    private CarDto car;
    private Date rentalDate;
    private Date returnDate;
    private DepartmentDto rentalDepartment;
    private DepartmentDto returnDepartment;

    public ReservationDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public CarDto getCar() {
        return car;
    }

    public void setCar(CarDto car) {
        this.car = car;
    }

    public Date getDateFrom() {
        return rentalDate;
    }

    public void setDateFrom(Date dateFrom) {
        this.rentalDate = dateFrom;
    }

    public Date getDateTo() {
        return returnDate;
    }

    public void setDateTo(Date dateTo) {
        this.returnDate = dateTo;
    }

    public DepartmentDto getRentalDepartment() {
        return rentalDepartment;
    }

    public void setRentalDepartment(DepartmentDto rentalDepartment) {
        this.rentalDepartment = rentalDepartment;
    }

    public DepartmentDto getReturnDepartment() {
        return returnDepartment;
    }

    public void setReturnDepartment(DepartmentDto returnDepartment) {
        this.returnDepartment = returnDepartment;
    }
}
