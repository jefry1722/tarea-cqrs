package com.example.cqrs.domain.entities;
import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "usersview") // Nombre de la tabla en la base de datos
public class UserView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autogenera el ID
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    protected UserView() {
    }

    // Constructor principal
    public UserView(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age=age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
