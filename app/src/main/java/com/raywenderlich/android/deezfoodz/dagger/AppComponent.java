package com.raywenderlich.android.deezfoodz.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tanin on 23/11/2017.
 */

@Singleton
@Component(modules = {AppModule.class})
public class AppComponent {
}
