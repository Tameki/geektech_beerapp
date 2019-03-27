package com.geektech.beerapp.presentation.beerdetails;

import com.geektech.core.CoreMvpContract;

public interface IBeerDetailsContract {
    interface View extends CoreMvpContract.View<Presenter> {

    }

    interface Presenter extends CoreMvpContract.Presenter<View> {

    }
}
