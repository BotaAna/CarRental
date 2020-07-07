package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.ReservationDto;
import project.CarRental.model.entity.Reservation;

import java.util.List;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    ReservationDto reservationToDto(Reservation reservation);
    Reservation dtoToReservation(ReservationDto reservationDto);

    List<ReservationDto> reservationListToDto(List<Reservation> reservation);
    List<Reservation> dtoToReservationList(List<ReservationDto> reservationDto);

}
