package com.hellochengkai.demo.dagger2demo;

import android.util.Log;

/**
 * Created by chengkai on 18-12-25.
 */

public class UserManager {
    private ApiServer apiServer;
    private UserStory userStory;
    private static final String TAG = "UserManager";

    public UserManager(ApiServer apiServer, UserStory userStory) {
        this.apiServer = apiServer;
        this.userStory = userStory;
    }

    /**
     * 管理用户注册
     */
    public void register() {
        Log.e(TAG,"UserManager--->register");
        apiServer.register();
        userStory.register();
    }

}
