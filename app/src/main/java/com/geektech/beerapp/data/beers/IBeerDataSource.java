package com.geektech.beerapp.data.beers;

import com.geektech.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerDataSource {
    List<BeerEntity> getBeers();

    BeerEntity getBeer(int id);
}
