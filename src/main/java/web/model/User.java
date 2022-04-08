package web.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
