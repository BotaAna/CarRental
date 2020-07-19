package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.RentalCarDto;
import project.CarRental.model.entity.RentalCar;
import project.CarRental.model.mappers.RentalCarMapper;
import project.CarRental.model.repository.RentalCarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RentalCarService {

    private RentalCarRepository rentalCarRepository;

    @Autowired
    public RentalCarService(RentalCarRepository rentalCarRepository) {
        this.rentalCarRepository = rentalCarRepository;
    }

    public List<RentalCarDto> getAllRentalCar() {
        Iterable<RentalCar> rentalCarList = rentalCarRepository.findAll();
        ArrayList<RentalCarDto> result = new ArrayList<>();
        for(RentalCar rentalCar : rentalCarList) {
            result.add(RentalCarMapper.INSTANCE.rentalCarToDto(rentalCar));
        }
        return result;
    }

    public RentalCarDto getRenatlCarById(Integer id) {
        Optional<RentalCar> rentalCar = rentalCarRepository.findById(id);
        if(rentalCar.isPresent()) {
            return RentalCarMapper.INSTANCE.rentalCarToDto(rentalCar.get());
        }
        return null;
    }

    public void saveRentalCar(RentalCarDto rentalCarDto) {
        RentalCar rentalCar = RentalCarMapper.INSTANCE.dtoToRentalCar(rentalCarDto);
        rentalCarRepository.save(rentalCar);
    }

    public void deleteRentalCarById(Integer id) {
        rentalCarRepository.deleteById(id);
    }

}
