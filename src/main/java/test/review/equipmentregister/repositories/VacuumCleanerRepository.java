package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.model.VacuumCleaner;

import java.util.List;

public interface VacuumCleanerRepository extends JpaRepository<VacuumCleaner, Integer> {
    List<VacuumCleaner> findVacuumCleanerByDustContainerVolume(Double category);
    List<VacuumCleaner> findVacuumCleanerByNumberOfModes(Integer numberOfModes);
}
