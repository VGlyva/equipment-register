package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.model.Smartphone;
import test.review.equipmentregister.repositories.SmartphoneRepository;

import java.util.List;

@Service
public class SmartphoneService {
    @Autowired
    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneService(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    public Smartphone createSmartphone(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    public List<Smartphone> getByMemory(Double memory) {
        return smartphoneRepository.findComputerByMemory(memory);
    }

    public List<Smartphone> getNumberOfCameras(Integer numberOfCameras) {
        return smartphoneRepository.findComputerByNumberOfCameras(numberOfCameras);
    }

    public Smartphone editSmartphone(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    public ResponseEntity<?> deleteSmartphone(Integer id) {
        smartphoneRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
