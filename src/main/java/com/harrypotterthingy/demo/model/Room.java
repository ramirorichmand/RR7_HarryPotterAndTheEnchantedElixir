package com.harrypotterthingy.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private Integer capacity;
    @OneToMany
    private Set<Student> residents;


}
