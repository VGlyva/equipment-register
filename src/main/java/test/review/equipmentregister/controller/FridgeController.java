package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.review.equipmentregister.model.Fridge;
import test.review.equipmentregister.service.FridgeService;

import java.util.List;

@RestController
@RequestMapping("fridge")
public class FridgeController {
    @Autowired
    private final FridgeService fridgeService;

    public FridgeController(FridgeService fridgeService) {
        this.fridgeService = fridgeService;
    }

    @GetMapping("/numberOfDoors/{numberOfDoors}")
    public ResponseEntity<List<Fridge>> getNumberOfDoors(@PathVariable Integer numberOfDoors) {
        return ResponseEntity.ok(fridgeService.getNumberOfDoors(numberOfDoors));
    }

    @GetMapping("/compressorType/{compressorType}")
    public ResponseEntity<List<Fridge>> getCompressorType(@PathVariable String compressorType) {
        return ResponseEntity.ok(fridgeService.getCompressorType(compressorType));
    }

    @PostMapping
    public ResponseEntity<Fridge> createFridge(@RequestBody Fridge fridge) {
        Fridge createFridge = fridgeService.createFridge(fridge);
        return ResponseEntity.ok(createFridge);
    }

    @PutMapping("{id}")
    public ResponseEntity<Fridge> editFridge(@RequestBody Fridge fridge) {
        Fridge foundFridge = fridgeService.editFridge(fridge);
        if (foundFridge == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundFridge);
    }

    @DeleteMapping("{id}")
    public void deleteFridge(@PathVariable Integer id) {
        fridgeService.deleteFridge(id);
    }
}
