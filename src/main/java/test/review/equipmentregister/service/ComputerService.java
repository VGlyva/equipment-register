package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.model.Computer;
import test.review.equipmentregister.repositories.ComputerRepository;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    private final ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> findSameName(String name) {
        return computerRepository.findComputerByName(name);
    }
}
