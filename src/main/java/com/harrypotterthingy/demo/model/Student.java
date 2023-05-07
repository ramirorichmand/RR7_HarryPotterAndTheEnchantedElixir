package com.harrypotterthingy.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private HouseType houseType;
    private PetType petType;

    public Student(String name, HouseType houseType, PetType petType) {
        this.name = name;
        this.houseType = houseType;
        this.petType = petType;
    }
}
