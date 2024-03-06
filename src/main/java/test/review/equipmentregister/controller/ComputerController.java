package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.review.equipmentregister.model.Computer;
import test.review.equipmentregister.service.ComputerService;

import java.util.List;

@RestController
@RequestMapping("computer")
public class ComputerController {
    @Autowired
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Computer>> getName(@PathVariable String name) {
        return ResponseEntity.ok(computerService.findSameName(name));
    }
}
