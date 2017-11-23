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

    /**
     * The @Provides annotation tells Dagger that the method provides a certain type of dependency,
     * in this case, a Context object. When a part of the app requests that Dagger inject a Context,
     * the @Provides annotation tells Dagger where to find it.
     *
     * The @Singleton annotation tells Dagger that there should only be a singleton instance of that dependency
     * and removes a lot of the boilerplate singleton code for you.
     *
     * @return
     */
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }

}
