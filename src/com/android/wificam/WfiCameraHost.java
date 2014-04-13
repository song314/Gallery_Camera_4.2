package com.android.wificam;

import android.hardware.Camera;
import android.util.Log;

/**
 * Created by tangsong on 4/13/14.
 */
public class WfiCameraHost implements IWifiCameraHost , Camera.PreviewCallback{

    private static final String TAG = WfiCameraHost.class.getSimpleName();

    @Override
    public void addPreviewData(byte[] data) {

    }

    @Override
    public void onPreviewFrame(byte[] bytes, Camera camera) {
        Log.i(TAG, "preview data : " + bytes);
    }

}
