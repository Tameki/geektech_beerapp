package com.geektech.beerapp.presentation.beers;

import com.geektech.beerapp.data.beers.IBeerDataSource;
import com.geektech.beerapp.model.BeerEntity;

import java.util.ArrayList;
import java.util.List;

public class BeersPresenter implements IBeersContract.Presenter {

    IBeersContract.View view;
    IBeerDataSource beerDataSource;

    public BeersPresenter(IBeerDataSource beerDataSource) {

    }

    @Override
    public void onBeerClick(int position) {

    }

    @Override
    public void getBeers() {
        beerDataSource.getBeers(new IBeerDataSource.BeersCallback() {
            @Override
            public void onSuccess(List<BeerEntity> beers) {
                view.showBeers(beers);
            }

            @Override
            public void onFailure(String message) {

            }
        });
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
