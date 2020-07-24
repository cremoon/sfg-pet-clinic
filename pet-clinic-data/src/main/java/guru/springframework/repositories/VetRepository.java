package guru.springframework.repositories;

import guru.springframework.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maikbartels on 2020.07.24
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
