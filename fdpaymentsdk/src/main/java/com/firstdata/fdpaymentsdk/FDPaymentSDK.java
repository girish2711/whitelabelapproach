package com.firstdata.fdpaymentsdk;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.util.Log;

public class FDPaymentSDK {

    private String feature = null;
    private Context applicationContext;
    private Activity hostActivity;
    private ThemeManagerListener themeManagerListener;

    public FDPaymentRegistrationDelegate sdkDelegate;

    public FDPaymentSDK(ThemeManagerListener thmListener, Context cntx, Activity acty) {
        themeManagerListener = thmListener;
        applicationContext = cntx;
        hostActivity = acty;
    }

    public void renderSDKFeature() {
        if (registered) {

        } else {
            Log.e(FDPaymentSDK.class.toString(), "Hello we are using this feature:" + feature);

            FDRegistrationFragment registration = new FDRegistrationFragment();
            FragmentManager fm = hostActivity.getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(themeManagerListener.getRegistrationFragmentView(), registration);
            ft.commit();

        }
    }
}
