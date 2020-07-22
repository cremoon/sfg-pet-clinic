package guru.springframework.services.map;

import guru.springframework.model.Speciality;
import guru.springframework.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.22
 */
@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
