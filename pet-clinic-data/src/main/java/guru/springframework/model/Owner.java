package guru.springframework.model;

import java.util.Set;

/**
 * Created by maikbartels on 2020.07.18
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
