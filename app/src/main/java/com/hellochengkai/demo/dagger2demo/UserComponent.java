package com.hellochengkai.demo.dagger2demo;

import dagger.Component;

/**
 * Created by chengkai on 18-12-25.
 */

@Component(modules = {UserModule.class,UserModulePro.class})
public interface UserComponent {
    void inject(MainActivity mainActivity);
}
