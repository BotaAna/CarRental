package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.repository.RentalCarRepository;

@Service
public class RentalCarService {

    private RentalCarRepository rentalCarRepository;

    @Autowired
    public RentalCarService(RentalCarRepository rentalCarRepository) {
        this.rentalCarRepository = rentalCarRepository;
    }
}
