package project.CarRental.service;

import org.springframework.stereotype.Service;
import project.CarRental.model.repository.ReturnCarRepository;

@Service
public class ReturnCarService {

    private ReturnCarRepository returnCarRepository;

    public ReturnCarService(ReturnCarRepository returnCarRepository) {
        this.returnCarRepository = returnCarRepository;
    }
}
