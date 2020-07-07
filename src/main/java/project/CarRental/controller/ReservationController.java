package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.ReservationService;

@Controller
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}
