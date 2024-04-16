package Lab_2.demo.repositories;

import Lab_2.demo.models.Portfolio;
import org.springframework.data.repository.CrudRepository;

public interface Portfolio_Repository extends CrudRepository<Portfolio, Long> {
}
