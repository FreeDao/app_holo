package com.alex.util;


/**
 * Created by changxuebo on 14-7-5.
 */
public class GlobalContext extends org.holoeverywhere.app.Application {

    private static GlobalContext mGlobalConext = null;

    public static GlobalContext getInstance() {
        return mGlobalConext;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mGlobalConext = this;

    }
}
