package guru.springframework.repositories;

import guru.springframework.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maikbartels on 2020.07.24
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String name);
}
