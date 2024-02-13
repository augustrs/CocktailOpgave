package com.example.cocktailopgave;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CocktailController {

    CocktailService cocktailService;
    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("cocktails")
    public String getCocktailList(@RequestParam(required = false) String ingredient, Model model) {
        List<Cocktail> cocktailList;
        if(ingredient != null && !ingredient.isEmpty()) {
            cocktailList = cocktailService.findWithIngredient(ingredient);
            model.addAttribute("ingredient", ingredient);
        }
        else  {
         cocktailList = cocktailService.getCocktailList();
        }
        model.addAttribute("cocktailList",cocktailList);
        return "showCocktailsFilter";
    }
}
