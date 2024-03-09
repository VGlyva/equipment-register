package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.entity.Technique;
import test.review.equipmentregister.repositories.TechniqueRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TechniqueService {
    @Autowired
    private final TechniqueRepository techniqueRepository;

    public TechniqueService(TechniqueRepository techniqueRepository) {
        this.techniqueRepository = techniqueRepository;
    }

    public List<Technique> getAll() {
        return techniqueRepository.findAll();
    }

    public Technique findSameName(String name) {
        return techniqueRepository.findComputerByNameIgnoreCase(name);
    }

    public List<Technique> findAllByType(String t) {
        return techniqueRepository.findAll()
                .stream()
                .filter(e -> e.getTypeOfEquipment().equals(t))
                .collect(Collectors.toList());

    }

    public List<Technique> findAllByColor(String color) {
        return techniqueRepository.findAll()
                .stream()
                .filter(e -> e.getColor().equals(color))
                .collect(Collectors.toList());

    }

    public List<Technique> findByPriceBetween(Integer min, Integer max) {
        return techniqueRepository.findByPriceBetween(min, max);
    }
    public List<Technique> sortByAlphabet() {
        return techniqueRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(Technique::getName))
                .collect(Collectors.toList());
    }
    public List<Technique> sortByPrice() {
        return techniqueRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(Technique::getPrice))
                .collect(Collectors.toList());
    }

}
