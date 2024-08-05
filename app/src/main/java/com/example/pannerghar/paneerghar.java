package com.example.pannerghar;

public class paneerghar {
    private String recipe_text;
    private int card_image;

    public paneerghar(String recipe_text, int card_image) {
        this.recipe_text = recipe_text;
        this.card_image = card_image;
    }

    public String getRecipe_text() {
        return recipe_text;
    }

    public void setRecipe_text(String recipe_text) {
        this.recipe_text = recipe_text;
    }

    public int getCard_image() {
        return card_image;
    }

    public void setCard_image(int card_image) {
        this.card_image = card_image;
    }
}
