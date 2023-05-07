package com.harrypotterthingy.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Potion {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private BrewingStatus brewingStatus = BrewingStatus.BREW;
    @OneToOne
    private Student student;
    @ManyToMany
    private Set<Ingredient> ingredients;
    @ManyToOne
    private Recipe recipe;

    public Potion(String name, Student student, Set<Ingredient> ingredients) {
        this.name = name;
        this.student = student;
        this.ingredients = ingredients;
    }
}
