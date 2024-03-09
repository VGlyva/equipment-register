package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.model.TV;

import java.util.List;

public interface TvRepository extends JpaRepository<TV, Integer> {
    List<TV> findComputerByCategoryIgnoreCase(String category);
    List<TV> findComputerByTechnologyIgnoreCase(String technology);
}
