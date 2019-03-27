package com.geektech.beerapp.presentation.beerdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geektech.beerapp.R;

public class BeerDetailsActivity extends AppCompatActivity
    implements IBeerDetailsContract.View {

    private IBeerDetailsContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_details);

        mPresenter = new BeerDetailsPresenter();

        mPresenter.attachView(this);
    }

    @Override
    public void attachPresenter(IBeerDetailsContract.Presenter presenter) {

    }

    @Override
    public void finishView() {

    }
}
