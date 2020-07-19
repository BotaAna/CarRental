package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.ReservationDto;
import project.CarRental.service.ReservationService;

import java.util.List;

@Controller
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public String reservations(Model model) {
        List<ReservationDto> reservations = reservationService.getAllReservations();
        model.addAttribute("reservationsList", reservations);
        return "reservations";
    }

    @GetMapping("/addReservation")
    public String addReservationForm() {
        return "addreservation";
    }

    @PostMapping("/addReservation")
    public String addReservation(ReservationDto reservationDto) {
        reservationService.saveReservation(reservationDto);
        return "redirect:/reservations";
    }

    @GetMapping("/editReservation")
    public String editReservation(Model model, @RequestParam("id") Integer id) {
        ReservationDto reservationDto = reservationService.getReservationById(id);
        model.addAttribute("reservation", reservationDto);
        return "editReservation";
    }

    @PostMapping("/editReservation")
    public String saveEditedReservation(ReservationDto reservationDto) {
        reservationService.saveReservation(reservationDto);
        return "redirect:/reservations";
    }

    @GetMapping("/deleteReservation")
    public String deleteReservation(@RequestParam("id") Integer id) {
        reservationService.deleteReservationById(id);
        return "redirect:/reservations";
    }

}
