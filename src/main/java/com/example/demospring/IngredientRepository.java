package com.example.demospring;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
