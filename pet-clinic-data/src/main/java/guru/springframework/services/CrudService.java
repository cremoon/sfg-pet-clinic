package guru.springframework.services;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.20
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
