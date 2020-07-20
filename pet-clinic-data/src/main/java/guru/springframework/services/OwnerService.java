package guru.springframework.services;

import guru.springframework.model.Owner;

/**
 * Created by maikbartels on 2020.07.20
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
