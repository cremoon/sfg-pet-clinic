package guru.springframework.repositories;

import guru.springframework.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maikbartels on 2020.07.24
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
