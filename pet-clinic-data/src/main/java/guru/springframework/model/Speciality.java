package guru.springframework.model;

/**
 * Created by maikbartels on 2020.07.22
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
