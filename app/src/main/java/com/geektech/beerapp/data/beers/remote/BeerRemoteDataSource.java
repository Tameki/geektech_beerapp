package com.geektech.beerapp.data.beers.remote;

import com.geektech.beerapp.data.beers.IBeerDataSource;
import com.geektech.beerapp.model.BeerEntity;
import com.geektech.core.CoreCallback;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class BeerRemoteDataSource implements IBeerRemoteDataSource {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.punkapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    BeerNetworkClient client = retrofit.create(BeerNetworkClient.class);

    @Override
    public void getBeers(final IBeerDataSource.BeersCallback callback) {
        Call<List<BeerEntity>> call = client.getBeers(50);

        call.enqueue(new CoreCallback<List<BeerEntity>>() {
            @Override
            public void onSuccess(List<BeerEntity> result) {
                callback.onSuccess(result);
            }

            @Override
            public void onFailure(String message) {
                callback.onFailure(message);
            }
        });
    }

    private interface BeerNetworkClient {
        @GET("v2/beers")
        Call<List<BeerEntity>> getBeers(
                @Query("per_page") int perPage
        );
    }
}
