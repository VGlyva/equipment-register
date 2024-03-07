package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.review.equipmentregister.entity.Technique;
import test.review.equipmentregister.service.TechniqueService;

import java.util.List;

@RestController
@RequestMapping("technique")
public class TechniqueController {
    @Autowired
    private final TechniqueService techniqueService;

    public TechniqueController(TechniqueService techniqueService) {
        this.techniqueService = techniqueService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Technique>> getAll() {
        return ResponseEntity.ok(techniqueService.getAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Technique> getName(@PathVariable String name) {
        return ResponseEntity.ok(techniqueService.findSameName(name));
    }

    @GetMapping("/filter/type")
    public ResponseEntity<List<Technique>> findByTypeOfEquipment(@RequestParam String type) {
        return ResponseEntity.ok(techniqueService.findAllByType(type));
    }
    @GetMapping("/filter/color")
    public ResponseEntity<List<Technique>> findByColor(@RequestParam String color) {
        return ResponseEntity.ok(techniqueService.findAllByColor(color));
    }
}