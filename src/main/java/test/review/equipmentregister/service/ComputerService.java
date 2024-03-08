package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public Computer createComputer(Computer computer) {
        return computerRepository.save(computer);
    }
    public List<Computer> getCategory(String category) {
        return computerRepository.findComputerByCategoryIgnoreCase(category);
    }
    public List<Computer> getProcessorType(String processorType) {
        return computerRepository.findComputerByProcessorTypeIgnoreCase(processorType);
    }
    public Computer editComputer(Computer computer) {
        return computerRepository.save(computer);
    }
    public ResponseEntity<?> deleteComputer(Integer id) {
        computerRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
