package project.CarRental.service;

import org.springframework.stereotype.Service;
import project.CarRental.model.dto.ReturnCarDto;
import project.CarRental.model.entity.ReturnCar;
import project.CarRental.model.mappers.ReturnCarMapper;
import project.CarRental.model.repository.ReturnCarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReturnCarService {

    private ReturnCarRepository returnCarRepository;

    public ReturnCarService(ReturnCarRepository returnCarRepository) {
        this.returnCarRepository = returnCarRepository;
    }

    public List<ReturnCarDto> getAllReturnedCars() {
        Iterable<ReturnCar> returnedCarsList = returnCarRepository.findAll();
        ArrayList<ReturnCarDto> result = new ArrayList<>();
        for(ReturnCar returnCar : returnedCarsList) {
            result.add(ReturnCarMapper.INSTANCE.returnCarToDto(returnCar));
        }
        return result;
    }

    public ReturnCarDto getReturnCarById(Integer id) {
        Optional<ReturnCar> returnCar = returnCarRepository.findById(id);
        if(returnCar.isPresent()) {
            return ReturnCarMapper.INSTANCE.returnCarToDto(returnCar.get());
        }
        return null;
    }

    public void saveReturnCar(ReturnCarDto returnCarDto) {
        ReturnCar returnCar = ReturnCarMapper.INSTANCE.dtoToReturnCar(returnCarDto);
        returnCarRepository.save(returnCar);
    }

    public void deleteReturnCarById(Integer id) {
        returnCarRepository.deleteById(id);
    }

}
