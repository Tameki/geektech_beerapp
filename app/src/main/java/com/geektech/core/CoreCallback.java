package com.geektech.core;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class CoreCallback<T> implements Callback<T> {
    public abstract void onSuccess(T result);
    public abstract void onFailure(String message);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            if (response.body() != null) {
                onSuccess(response.body());
            } else {
                onFailure("Body is empty");
            }
        } else {
            onFailure("Response code " + response.code());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onFailure(t.getMessage());
    }
}
