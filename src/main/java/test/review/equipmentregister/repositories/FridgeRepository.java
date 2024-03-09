package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.model.Fridge;

import java.util.List;

public interface FridgeRepository extends JpaRepository<Fridge,Integer> {
    List<Fridge> findFridgeByNumberOfDoors(Integer numberOfDoors);
    List<Fridge> findFridgeByCompressorTypeIgnoreCase(String compressorType);
}
