package com.geektech.beerapp.presentation.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.geektech.beerapp.R;
import com.geektech.beerapp.data.beers.IBeerDataSource;
import com.geektech.beerapp.data.beers.remote.BeerRemoteDataSource;
import com.geektech.beerapp.model.BeerEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new BeerRemoteDataSource().getBeers(new IBeerDataSource.BeersCallback() {
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
