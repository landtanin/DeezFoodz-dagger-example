package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenter;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenter;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tanin on 23/11/2017.
 */

@Module
public class PresenterModule {

    /**
     * specifying that a FoodzPresenter will be provided, and that the presenter returned will be the concrete implementation FoodzPresenterImpl.
     * @return
     */
    @Provides
    @Singleton
    FoodzPresenter provideFoodzPresenter() {
        return new FoodzPresenterImpl();
    }

    @Provides
    @Singleton
    FoodPresenter provideFoodPresenter() {
        return new FoodPresenterImpl();
    }

}
