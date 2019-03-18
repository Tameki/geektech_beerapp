package com.geektech.core;

public interface CoreMvpContract {
    interface View<T extends Presenter> {
        void attachPresenter(T presenter);

        void finishView();
    }

    interface Presenter<T extends View> {
        void attachView(T view);

        void detachView();
    }
}
