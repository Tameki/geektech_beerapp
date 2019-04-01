package com.geektech.beerapp.presentation.beers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.beerapp.R;
import com.geektech.beerapp.model.BeerEntity;

import java.util.List;

public class BeersFragment extends Fragment
    implements IBeersContract.View {

    private IBeersContract.Presenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate (
                R.layout.fragment_beers,
                container,
                false
        );

        return view;
    }

    @Override
    public void showBeers(List<BeerEntity> beers) {

    }

    @Override
    public void openBeerDetails(int id) {

    }

    @Override
    public void attachPresenter(IBeersContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void finishView() {

    }
}
