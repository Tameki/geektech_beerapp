package com.geektech.beerapp.model;

public class BeerEntity {

    private int id;

    private String name;

    private String description;

    private String imageUrl;

    //region Constructors

    public BeerEntity() {
    }

    public BeerEntity(
            int id,
            String name,
            String description,
            String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    ///endregion

    //region Getters/Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    //endregion

}
