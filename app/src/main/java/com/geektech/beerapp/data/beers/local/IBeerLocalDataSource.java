package com.geektech.beerapp.data.beers.local;

import com.geektech.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerLocalDataSource {
    List<BeerEntity> loadBeers();

    void setBeers(List<BeerEntity> beers);
}
