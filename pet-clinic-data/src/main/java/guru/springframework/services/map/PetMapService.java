package guru.springframework.services.map;

import guru.springframework.model.Pet;
import guru.springframework.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.20
 */
@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
