package com.geektech.beerapp.data.beers.remote;

import com.geektech.beerapp.data.beers.IBeerDataSource;

public interface IBeerRemoteDataSource {

    void getBeers(IBeerDataSource.BeersCallback callback);
}