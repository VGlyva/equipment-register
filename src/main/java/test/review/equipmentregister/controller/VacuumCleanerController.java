package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.review.equipmentregister.model.VacuumCleaner;
import test.review.equipmentregister.service.VacuumCleanerService;

import java.util.List;

@RestController
@RequestMapping("cleaner")
public class VacuumCleanerController {
    @Autowired
    private final VacuumCleanerService vacuumCleanerService;

    public VacuumCleanerController(VacuumCleanerService vacuumCleanerService) {
        this.vacuumCleanerService = vacuumCleanerService;
    }
    @GetMapping("/numberOfModes/{numberOfModes}")
    public ResponseEntity<List<VacuumCleaner>> getNumberOfModes(@PathVariable Integer numberOfModes) {
        return ResponseEntity.ok(vacuumCleanerService.getByNumberOfModes(numberOfModes));
    }

    @GetMapping("/dustContainerVolume/{dustContainerVolume}")
    public ResponseEntity<List<VacuumCleaner>> getByDustContainerVolume
            (@PathVariable Double dustContainerVolume) {
        return ResponseEntity.ok(vacuumCleanerService.getByDustContainerVolume(dustContainerVolume));
    }

    @PostMapping
    public ResponseEntity<VacuumCleaner> createVacuumCleaner(@RequestBody VacuumCleaner vacuumCleaner) {
        VacuumCleaner createVacuumCleaner = vacuumCleanerService.createVacuumCleaner(vacuumCleaner);
        return ResponseEntity.ok(createVacuumCleaner);
    }

    @PutMapping("{id}")
    public ResponseEntity<VacuumCleaner> editVacuumCleaner(@RequestBody VacuumCleaner vacuumCleaner) {
        VacuumCleaner foundVacuumCleaner = vacuumCleanerService.editVacuumCleaner(vacuumCleaner);
        if (foundVacuumCleaner == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundVacuumCleaner);
    }

    @DeleteMapping("{id}")
    public void deleteVacuumCleaner(@PathVariable Integer id) {
        vacuumCleanerService.deleteVacuumCleaner(id);
    }
}
