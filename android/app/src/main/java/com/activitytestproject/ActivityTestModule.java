package com.activitytestproject;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ActivityTestModule extends ReactContextBaseJavaModule {

    ActivityTestModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "ActivityTest";
    }

    @ReactMethod
    public void start() {
        Activity activity = this.getCurrentActivity();
        Intent intent = new Intent(activity, TestActivity.class);
        activity.startActivity(intent);
    }
}
