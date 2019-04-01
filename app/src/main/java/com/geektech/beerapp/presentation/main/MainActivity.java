package com.geektech.beerapp.presentation.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.geektech.beerapp.BeerApp;
import com.geektech.beerapp.R;
import com.geektech.beerapp.data.beers.IBeerDataSource;
import com.geektech.beerapp.model.BeerEntity;
import com.geektech.beerapp.presentation.beers.BeersFragment;
import com.geektech.beerapp.presentation.beers.BeersPresenter;
import com.geektech.beerapp.presentation.beers.IBeersContract;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment)
                .commit();



        mPresenter = new BeersPresenter(BeerApp.beerRepository);
        mPresenter.attachView(fragment);

        BeerApp.beerRepository.getBeers(
                new IBeerDataSource.BeersCallback() {
                    @Override
                    public void onSuccess(List<BeerEntity> beers) {
                        Log.d("ololo", "Beers response " + beers.size());
                        for (BeerEntity beerEntity : beers) {
                            Log.d("ololo", beerEntity.toString());
                        }
                    }

                    @Override
                    public void onFailure(String message) {
                        Log.d("ololo", message);
                    }
                });
    }
}
