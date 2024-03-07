package test.review.equipmentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.review.equipmentregister.model.Computer;
import test.review.equipmentregister.service.ComputerService;

@RestController
@RequestMapping("computers")
public class ComputerController {
    @Autowired
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping
    public ResponseEntity<Computer> createComputer(@RequestBody Computer computer) {
        Computer createComputer = computerService.createComputer(computer);
        return ResponseEntity.ok(createComputer);
    }

    @PutMapping("{id}")
    public ResponseEntity<Computer> editComputer(@RequestBody Computer computer) {
        Computer foundComputer = computerService.editComputer(computer);
        if (foundComputer == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundComputer);
    }

    @DeleteMapping("{id}")
    public void deleteComputer(@PathVariable Integer id) {
        computerService.deleteComputer(id);
    }
}
