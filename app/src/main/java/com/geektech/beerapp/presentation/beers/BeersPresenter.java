package com.geektech.beerapp.presentation.beers;

import com.geektech.beerapp.data.beers.IBeerDataSource;
import com.geektech.beerapp.model.BeerEntity;

import java.util.ArrayList;

public class BeersPresenter implements IBeersContract.Presenter {

    IBeersContract.View view;


    public BeersPresenter(IBeerDataSource beerDataSource) {
        beerDataSource.getBeers();
    }

    @Override
    public void onBeerClick(int position) {

    }

    @Override
    public void getBeers() {
        ArrayList<BeerEntity> beers = new ArrayList<>();
        beers.add(new BeerEntity());

        view.showBeers(beers);
    }

    @Override
    public void attachView(IBeersContract.View view) {
        this.view = view;
        view.attachPresenter(this);
        getBeers();
    }

    @Override
    public void detachView() {

    }
}
