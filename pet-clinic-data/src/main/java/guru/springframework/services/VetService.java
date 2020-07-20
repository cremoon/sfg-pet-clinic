package guru.springframework.services;

import guru.springframework.model.Vet;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.20
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
