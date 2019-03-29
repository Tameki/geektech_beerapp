package com.geektech.beerapp.data.beers;

import com.geektech.beerapp.data.beers.local.IBeerLocalDataSource;
import com.geektech.beerapp.data.beers.remote.IBeerRemoteDataSource;
import com.geektech.beerapp.model.BeerEntity;

import java.util.List;

public class BeerRepository implements IBeerDataSource {

    private IBeerLocalDataSource mLocal;
    private IBeerRemoteDataSource mRemote;

    public BeerRepository(
            IBeerLocalDataSource local,
            IBeerRemoteDataSource remote) {
        mLocal = local;
        mRemote = remote;
    }

    @Override
    public List<BeerEntity> getBeers() {
        //TODO: Pass callback to RemoteDataSource
        return mLocal.loadBeers();
    }

    @Override
    public BeerEntity getBeer(int id) {
        return null;
    }
}
