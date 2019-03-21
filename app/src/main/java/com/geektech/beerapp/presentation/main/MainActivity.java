package com.geektech.beerapp.presentation.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.geektech.beerapp.BeerApp;
import com.geektech.beerapp.R;
import com.geektech.util.Logger;

public class MainActivity extends AppCompatActivity
    implements ILoginContract.View {

    private ILoginContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter();

        mPresenter.attachView(this);

        Logger.d("Beers amount " + BeerApp.beerRepository.getBeers().size());

        mPresenter.onLoginClick("Name", "Pass");
    }

    public void showLoginSuccess() {

    }

    @Override
    public void openMainScreen() {

    }

    @Override
    public void showLoginError() {
        Toast.makeText(this, "Login error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void attachPresenter(ILoginContract.Presenter presenter) {

    }

    @Override
    public void finishView() {
        finish();
    }
}
