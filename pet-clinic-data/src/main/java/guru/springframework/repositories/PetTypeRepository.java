package guru.springframework.repositories;

import guru.springframework.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maikbartels on 2020.07.24
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
