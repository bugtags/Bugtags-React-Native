package com.bugtagsrn.sdk;

import android.app.Application;

import com.bugtags.library.Bugtags;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by kvh on 2018/5/14.
 */

public class BugtagsRN extends ReactContextBaseJavaModule {

    private ReactApplicationContext reactContext;

    public BugtagsRN(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "BugtagsRN";
    }

    @ReactMethod
    public void startWithAppKey(String appKey, int invocationEvent) {
        Bugtags.start(appKey, (Application) reactContext.getApplicationContext(), invocationEvent);
    }

    @ReactMethod
    public void setTrackingCrashes(boolean trackingCrashes) {
        Bugtags.setTrackingCrashes(trackingCrashes);
    }

    @ReactMethod
    public void setUserData(String data, String key) {
        Bugtags.setUserData(key, data);
    }

    @ReactMethod
    public void removeUserDataForKey(String key) {
        Bugtags.removeUserData(key);
    }

    @ReactMethod
    public void removeAllUserData() {
        Bugtags.removeAllUserData();
    }

    @ReactMethod
    public void addUserStep(String content) {
        Bugtags.addUserStep(content);
    }

    @ReactMethod
    public void log(String content) {
        Bugtags.log(content);
    }

    @ReactMethod
    public void sendFeedback(String content) {
        Bugtags.sendFeedback(content);
    }

}
