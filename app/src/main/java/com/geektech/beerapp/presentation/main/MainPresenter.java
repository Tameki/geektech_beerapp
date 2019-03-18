package com.geektech.beerapp.presentation.main;

public class MainPresenter implements ILoginContract.Presenter {

    private ILoginContract.View mView = null;

    @Override
    public void onLoginClick(String login, String password) {
        if (mView != null) {
            if (login == "login") {
                mView.showLoginSuccess();
            } else {
                mView.showLoginError();
            }
        }
    }

    @Override
    public void onRestorePassword() {
        //TODO: Restore password logic
    }

    @Override
    public void attachView(ILoginContract.View view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
