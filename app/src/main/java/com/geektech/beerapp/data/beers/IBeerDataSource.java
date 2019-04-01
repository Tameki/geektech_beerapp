package com.geektech.beerapp.data.beers;

import android.support.annotation.Nullable;

import com.geektech.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerDataSource {
    void getBeers(BeersCallback callback);

    @Nullable
    BeerEntity getBeer(int id);

    interface BeersCallback{
        void onSuccess(List<BeerEntity> beers);

        void onFailure(String message);
    }
}
