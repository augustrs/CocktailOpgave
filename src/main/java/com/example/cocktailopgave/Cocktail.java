package com.example.cocktailopgave;

import java.util.List;

public class Cocktail {
    private String name;
    private double alcoholPercentage;
    private double pris;
    private List<String> ingredients;



    public Cocktail(String name, double alcoholPercentage, double pris,List<String> ingredients) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.pris = pris;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPris() {
        return pris;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
