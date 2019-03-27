package com.geektech.beerapp.presentation.beers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeersActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment)
                .commit();

        mPresenter = new BeersPresenter();
        mPresenter.attachView(fragment);
    }

}
