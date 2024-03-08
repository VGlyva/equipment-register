package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.model.VacuumCleaner;
import test.review.equipmentregister.repositories.VacuumCleanerRepository;

import java.util.List;

@Service
public class VacuumCleanerService {
    @Autowired
    private final VacuumCleanerRepository vacuumCleanerRepository;

    public VacuumCleanerService(VacuumCleanerRepository vacuumCleanerRepository) {
        this.vacuumCleanerRepository = vacuumCleanerRepository;
    }
    public List<VacuumCleaner> getByNumberOfModes(Integer numberOfModes) {
        return vacuumCleanerRepository.findVacuumCleanerByNumberOfModes(numberOfModes);
    }

    public List<VacuumCleaner> getByDustContainerVolume(Double dustContainerVolume) {
        return vacuumCleanerRepository.findVacuumCleanerByDustContainerVolume(dustContainerVolume);
    }


    public VacuumCleaner createVacuumCleaner(VacuumCleaner vacuumCleaner) {
        return vacuumCleanerRepository.save(vacuumCleaner);
    }

    public VacuumCleaner editVacuumCleaner(VacuumCleaner vacuumCleaner) {
        return vacuumCleanerRepository.save(vacuumCleaner);
    }

    public ResponseEntity<?> deleteVacuumCleaner(Integer id) {
        vacuumCleanerRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
