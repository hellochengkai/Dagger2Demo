package com.hellochengkai.demo.dagger2demo;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by chengkai on 18-12-25.
 */

@Module
public class UserModule {
    private static final String TAG = "UserModule";

    Context context;

    public UserModule(Context context) {
        this.context = context;
    }

    @Named("A")
    @Provides
    public ApiServer provideApiServer(){
        Log.e(TAG,"provideApiServer--->start A");
        return new ApiServer();
    }

    @Provides
    public UserStory provideUserStory(){
        Log.e(TAG,"provideUserStory--->start");
        return new UserStory();
    }


    @Provides
    public UserManager provideUserManager(@Named("A") ApiServer apiServer,UserStory userStory){
        Log.e(TAG, "provideUserManager: --->start");
        return new UserManager(apiServer,userStory);
    }
}
