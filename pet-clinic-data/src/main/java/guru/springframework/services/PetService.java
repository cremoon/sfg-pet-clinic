package guru.springframework.services;

import guru.springframework.model.Pet;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.20
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
