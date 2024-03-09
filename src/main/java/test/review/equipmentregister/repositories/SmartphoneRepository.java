package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.model.Smartphone;

import java.util.List;

public interface SmartphoneRepository extends JpaRepository<Smartphone,Integer> {
    List<Smartphone> findComputerByMemory(Double category);
    List<Smartphone> findComputerByNumberOfCameras(Integer processorType);
}
