package com.harrypotterthingy.demo.controller;

import com.harrypotterthingy.demo.model.Potion;
import com.harrypotterthingy.demo.service.PotionService;

public class RoomController {
}


import java.util.List;

@RestController
@RequestMapping("/potions")
public class PotionController {
    private final PotionService potionService;

    public PotionController(PotionService potionService) {
        this.potionService = potionService;
    }

    @GetMapping
    public List<Potion> getAllPotions(){
        return potionService.getAllPotions();
    }

    @PostMapping("/brew/{potionId}")
    public void brewPotion(@PathVariable Long potionId) throws StudentNotFound, PotionNotFound {
        potionService.brewPotion(potionId);
    }

    @GetMapping("/brew/{studentId}")
    public List<Potion> getStudentsPotions(@PathVariable Long studentId) throws StudentNotFound {
        return potionService.getStudentsPotions(studentId);
    }

    @PutMapping("/{potionId}/add")
    public Potion addIngredientToPotion(@PathVariable Long potionId, @RequestBody Ingredient ingredient) throws PotionNotFound, StudentNotFound {
        return potionService.addIngredientToPotion(potionId, ingredient);
    }

    @GetMapping("/{potionId}/help")
    public List<Recipe> getRecipesForPotion(@PathVariable Long potionId) throws PotionNotFound {
        return potionService.getRecipesForPotion(potionId);
    }
}