package com.hellochengkai.demo.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("B")
    ApiServer mApiServer;

    @Inject
    UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerUserComponent.builder()
                .userModule(new UserModule(getApplicationContext()))
                .userModulePro(new UserModulePro("hahahah"))
                .build()
                .inject(this);

//        DaggerUserComponent
//                .builder()
//                .userModule(new UserModule(getApplicationContext()))
//                .build()
//                .inject(this);

        userManager.register();
//        mApiServer.register();
    }
}
