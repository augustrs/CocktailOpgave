package com.example.cocktailopgave;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CocktailRepository {
    private List<Cocktail> cocktailList;

    public CocktailRepository(List<Cocktail> cocktailList) {
        this.cocktailList = cocktailList;
    }

    public CocktailRepository() {
        createCocktails();
    }

    private void createCocktails() {
        cocktailList = new ArrayList<>();
        cocktailList.add(new Cocktail("Vodka Cola", 12, 30, List.of("vodka", "cola")));
        cocktailList.add(new Cocktail("Rom Cola", 14, 25, List.of("rom", "cola")));
        cocktailList.add(new Cocktail("White Russian", 18, 80, List.of("sødmælk", "vodka")));

    }
    public List<Cocktail> getCocktailList() {

        return cocktailList;
    }

    public List<Cocktail> findWithIngredient(String ingredient) {
        List<Cocktail> resultList = new ArrayList<>();
        for (Cocktail cocktail : cocktailList) {
            if (cocktail.getIngredients().contains(ingredient)) {
                resultList.add(cocktail);
            }
        }
        return resultList;
    }
}
