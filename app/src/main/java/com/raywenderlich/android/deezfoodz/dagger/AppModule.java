package com.raywenderlich.android.deezfoodz.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tanin on 23/11/2017.
 */

/**
 * The @Module annotation tells Dagger that the AppModule class will provide dependencies for a part of the application.
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {

        this.application = application;

    }

    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }

}
