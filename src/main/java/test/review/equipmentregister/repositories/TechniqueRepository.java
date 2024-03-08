package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.entity.Technique;

import java.util.List;

public interface TechniqueRepository extends JpaRepository<Technique,Integer> {
    Technique findComputerByNameIgnoreCase(String name);
    List<Technique> findByPriceBetween(int min, int max);
}
