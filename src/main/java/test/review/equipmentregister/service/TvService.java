package test.review.equipmentregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import test.review.equipmentregister.model.TV;
import test.review.equipmentregister.repositories.TvRepository;

import java.util.List;

@Service
public class TvService {
    @Autowired
    private final TvRepository tvRepository;

    public TvService(TvRepository tvRepository) {
        this.tvRepository = tvRepository;
    }
    public List<TV> getByCategory(String category) {
        return tvRepository.findComputerByCategoryIgnoreCase(category);
    }
    public List<TV> getByTechnology(String technology) {
        return tvRepository.findComputerByTechnologyIgnoreCase(technology);
    }
    public TV createTv(TV tv) {
        return tvRepository.save(tv);
    }
    public TV editTv(TV tv) {
        return tvRepository.save(tv);
    }
    public ResponseEntity<?> deleteTV(Integer id) {
        tvRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
