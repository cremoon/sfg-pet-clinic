package guru.springframework.model;

import java.io.Serializable;

/**
 * Created by maikbartels on 2020.07.20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
