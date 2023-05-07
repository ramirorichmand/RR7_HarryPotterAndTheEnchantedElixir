package com.harrypotterthingy.demo.data_sample;


import com.harrypotterthingy.demo.model.*;
import com.harrypotterthingy.demo.repository.IngredientRepository;
import com.harrypotterthingy.demo.repository.PotionRepository;
import com.harrypotterthingy.demo.repository.RecipeRepository;
import com.harrypotterthingy.demo.repository.StudentRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class DataIntialiser {

    @Bean
    ApplicationRunner runner(PotionRepository potionRepository,
                             StudentRepository studentRepository,
                             RecipeRepository recipeRepository,
                             IngredientRepository ingredientRepository) {

        return args -> {
            Ingredient salt = new Ingredient("Salt");
            Ingredient pepper = new Ingredient("Pepper");
            Ingredient vinegar = new Ingredient("Vinegar");
            ingredientRepository.save(salt);
            ingredientRepository.save(pepper);
            ingredientRepository.save(vinegar);
    }

}
