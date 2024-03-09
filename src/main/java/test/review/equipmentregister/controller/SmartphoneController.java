package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.review.equipmentregister.model.Smartphone;
import test.review.equipmentregister.service.SmartphoneService;

import java.util.List;

@RestController
@RequestMapping("smartphone")
public class SmartphoneController {
    @Autowired
    private final SmartphoneService smartphoneService;

    public SmartphoneController(SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }
    @GetMapping("/numberOfCameras/{numberOfCameras}")
    public ResponseEntity<List<Smartphone>> getNumberOfCameras(@PathVariable Integer numberOfCameras) {
        return ResponseEntity.ok(smartphoneService.getNumberOfCameras(numberOfCameras));
    }

    @GetMapping("/memory/{memory}")
    public ResponseEntity<List<Smartphone>> getByMemory(@PathVariable Double memory) {
        return ResponseEntity.ok(smartphoneService.getByMemory(memory));
    }

    @PostMapping
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
        Smartphone createSmartphone = smartphoneService.createSmartphone(smartphone);
        return ResponseEntity.ok(createSmartphone);
    }

    @PutMapping("{id}")
    public ResponseEntity<Smartphone> editSmartphone(@RequestBody Smartphone smartphone) {
        Smartphone foundSmartphone = smartphoneService.editSmartphone(smartphone);
        if (foundSmartphone == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundSmartphone);
    }

    @DeleteMapping("{id}")
    public void deleteSmartphone(@PathVariable Integer id) {
        smartphoneService.deleteSmartphone(id);
    }
}
