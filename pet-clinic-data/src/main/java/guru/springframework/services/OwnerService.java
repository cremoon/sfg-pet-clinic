package guru.springframework.services;

import guru.springframework.model.Owner;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.20
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
