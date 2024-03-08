package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.review.equipmentregister.model.TV;
import test.review.equipmentregister.service.TvService;

import java.util.List;

@RestController
@RequestMapping("tv")
public class TvController {
    @Autowired
    private final TvService tvService;

    public TvController(TvService tvService) {
        this.tvService = tvService;
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<TV>> getCategory(@PathVariable String category) {
        return ResponseEntity.ok(tvService.getByCategory(category));
    }
    @GetMapping("/technology/{technology}")
    public ResponseEntity<List<TV>> getByTechnology(@PathVariable String technology) {
        return ResponseEntity.ok(tvService.getByTechnology(technology));
    }
    @PostMapping
    public ResponseEntity<TV> createTv(@RequestBody TV tv) {
        TV createTv = tvService.createTv(tv);
        return ResponseEntity.ok(tv);
    }
    @PutMapping("{id}")
    public ResponseEntity<TV> editTv(@RequestBody TV tv) {
        TV foundTV = tvService.editTv(tv);
        if (foundTV == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundTV);
    }
    @DeleteMapping("{id}")
    public void deleteTV(@PathVariable Integer id) {
        tvService.deleteTV(id);
    }
}
