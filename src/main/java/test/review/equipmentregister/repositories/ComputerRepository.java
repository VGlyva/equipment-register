package test.review.equipmentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.review.equipmentregister.model.Computer;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {
    List<Computer> findComputerByName(String name);
}
