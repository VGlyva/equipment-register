package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.model.Fridge;
import test.review.equipmentregister.repositories.FridgeRepository;

import java.util.List;

@Service
public class FridgeService {
    @Autowired
    private final FridgeRepository fridgeRepository;

    public FridgeService(FridgeRepository fridgeRepository) {
        this.fridgeRepository = fridgeRepository;
    }
    public Fridge createFridge(Fridge fridge) {
        return fridgeRepository.save(fridge);
    }
    public List<Fridge> getNumberOfDoors(Integer numberOfDoors) {
        return fridgeRepository.findFridgeByNumberOfDoors(numberOfDoors);
    }
    public List<Fridge> getCompressorType(String compressorType) {
        return fridgeRepository.findFridgeByCompressorTypeIgnoreCase(compressorType);
    }
    public Fridge editFridge(Fridge fridge) {
        return fridgeRepository.save(fridge);
    }
    public ResponseEntity<?> deleteFridge(Integer id) {
        fridgeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
