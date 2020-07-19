package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.ReservationDto;
import project.CarRental.model.entity.Reservation;
import project.CarRental.model.mappers.ReservationMapper;
import project.CarRental.model.repository.ReservationRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<ReservationDto> getAllReservations() {
        Iterable<Reservation> reservationsList = reservationRepository.findAll();
        ArrayList<ReservationDto> result = new ArrayList<>();
        for(Reservation reservation : reservationsList) {
            result.add(ReservationMapper.INSTANCE.reservationToDto(reservation));
        }
        return result;
    }

    public ReservationDto getReservationById(Integer id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        if(reservation.isPresent()) {
            return ReservationMapper.INSTANCE.reservationToDto(reservation.get());
        }
        return null;
    }

    public void saveReservation(ReservationDto reservationDto) {
        Reservation reservation = ReservationMapper.INSTANCE.dtoToReservation(reservationDto);
        reservationRepository.save(reservation);
    }

    public void deleteReservationById(Integer id) {
        reservationRepository.deleteById(id);
    }
}
