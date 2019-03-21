package com.geektech.beerapp.data.beers.local;

import com.geektech.beerapp.model.BeerEntity;

import java.util.ArrayList;
import java.util.List;

public class BeerLocalDataSource implements IBeerLocalDataSource {
    
    @Override
    public List<BeerEntity> loadBeers() {
        List<BeerEntity> beers = new ArrayList();

        beers.add(new BeerEntity());
        beers.add(new BeerEntity());
        beers.add(new BeerEntity());
        beers.add(new BeerEntity());
        beers.add(new BeerEntity());
        beers.add(new BeerEntity());
        beers.add(new BeerEntity());

        return beers;
    }

    @Override
    public void setBeers(List<BeerEntity> beers) {

    }
}
