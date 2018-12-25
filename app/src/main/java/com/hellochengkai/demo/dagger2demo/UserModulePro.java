package com.hellochengkai.demo.dagger2demo;

import android.util.Log;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chengkai on 18-12-25.
 */

@Module
public class UserModulePro {

    String tag;

    public UserModulePro(String tag) {
        this.tag = tag;
    }

    private static final String TAG = "UserModulePro";
    @Named("B")
    @Provides
    public ApiServer provideApiServer()
    {
        Log.e(TAG, "provideApiServer: ---> start B" + tag);
        return new ApiServer();
    }
}
