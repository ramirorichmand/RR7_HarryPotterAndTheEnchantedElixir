package com.harrypotterthingy.demo.repository;

import com.harrypotterthingy.demo.model.Potion;
import com.harrypotterthingy.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PotionRepository extends JpaRepository<Potion, Long> {
    List<Potion> getPotionByStudent (Student student);
}
