package guru.springframework.repositories;

import guru.springframework.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maikbartels on 2020.07.24
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
