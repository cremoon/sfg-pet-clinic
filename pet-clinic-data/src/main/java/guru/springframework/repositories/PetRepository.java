package guru.springframework.repositories;

import guru.springframework.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maikbartels on 2020.07.24
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
