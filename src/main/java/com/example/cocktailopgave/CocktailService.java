package com.example.cocktailopgave;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {

CocktailRepository cocktailRepository;
public CocktailService(CocktailRepository cocktailRepository) {
    this.cocktailRepository=cocktailRepository;
}

public List<Cocktail> getCocktailList() {
    return cocktailRepository.getCocktailList();
}

    public List<Cocktail> findWithIngredient(String ingredient) {
    return cocktailRepository.findWithIngredient(ingredient);
    }
}
