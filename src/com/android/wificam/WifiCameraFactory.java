package com.android.wificam;

import com.android.camera.CameraModule;
import com.android.camera.WifiCameraClientModule;
import com.android.camera.WifiCameraHostModule;

/**
 * Created by tangsong on 4/13/14.
 */
public class WifiCameraFactory {

    private WifiCameraFactory(){}

    public static CameraModule newInstance(boolean isHost) {
        if (isHost) {
            return new WifiCameraHostModule();
        } else {
            return new WifiCameraClientModule();
        }
    }
}
