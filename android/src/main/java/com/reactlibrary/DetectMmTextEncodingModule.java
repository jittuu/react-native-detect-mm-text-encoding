package com.reactlibrary;

import android.graphics.Paint;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class DetectMmTextEncodingModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public DetectMmTextEncodingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "DetectMmTextEncoding";
    }

    @ReactMethod
    public void isUnicode(Callback callback) {
        Paint paint = new Paint();
        Boolean isUni = paint.measureText("က") == paint.measureText("က္က");

        callback.invoke(isUni);
    }
}
