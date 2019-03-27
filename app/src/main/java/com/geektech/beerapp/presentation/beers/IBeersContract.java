package com.geektech.beerapp.presentation.beers;

import com.geektech.beerapp.model.BeerEntity;
import com.geektech.core.CoreMvpContract;

import java.util.ArrayList;

public interface IBeersContract {
    interface View extends CoreMvpContract.View<Presenter> {
        void showBeers(ArrayList<BeerEntity> beers);

        void openBeerDetails(int id);
    }

    interface Presenter extends CoreMvpContract.Presenter<View> {
        void onBeerClick(int position);

        void getBeers();
    }
}
