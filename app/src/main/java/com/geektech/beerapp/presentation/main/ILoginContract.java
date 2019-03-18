package com.geektech.beerapp.presentation.main;

import com.geektech.core.CoreMvpContract;

public interface ILoginContract {
    interface View extends CoreMvpContract.View<Presenter> {

        void showLoginSuccess();

        void showLoginError();

        void openMainScreen();
    }

    interface Presenter extends CoreMvpContract.Presenter<View> {
        void onLoginClick(String login, String password);

        void onRestorePassword();
    }
}
