package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.model.TV;

public interface TvRepository extends JpaRepository<TV, Integer> {
}
