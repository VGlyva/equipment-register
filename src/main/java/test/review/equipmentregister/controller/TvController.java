package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.review.equipmentregister.model.TV;
import test.review.equipmentregister.service.TvService;

@RestController
@RequestMapping("tv")
public class TvController {
    @Autowired
    private final TvService tvService;

    public TvController(TvService tvService) {
        this.tvService = tvService;
    }
    @PostMapping
    public ResponseEntity<TV> createTv(@RequestBody TV tv) {
        TV createTv = tvService.createTv(tv);
        return ResponseEntity.ok(tv);
    }
}
