package com.hellochengkai.demo.dagger2demo;

import android.content.Context;
import android.util.Log;

import dagger.Component;

/**
 * Created by chengkai on 18-12-25.
 */

public class UserStory {

    private static final String TAG = "UserStory";

    public UserStory() {

    }

    public void register() {
        Log.e(TAG,"UserManager--->register");
    }
}
