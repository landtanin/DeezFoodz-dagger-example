package com.raywenderlich.android.deezfoodz.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tanin on 23/11/2017.
 */

/**
 *  Tell Dagger that AppComponent is a singleton component interface for the app. The @Component annotation takes a list of modules as an input
 */
@Singleton
@Component(modules = {AppModule.class})
public class AppComponent {
}
