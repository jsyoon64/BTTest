package com.jsyoon.slepgrassdbg.utils;

import java.text.SimpleDateFormat;

/**
 * Created by sash0k on 12.12.13.
 * Общие константы
 */
public class Const {
    static final String TAG = "SPP_TERMINAL";

    // Intent request codes
    static final int REQUEST_CONNECT_DEVICE = 1;
    static final int REQUEST_ENABLE_BT = 2;

    // Message types sent from the DeviceConnector Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    private static final String CRC_OK = "#FFFF00";
    private static final String CRC_BAD = "#FF0000";

    public static final SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss.SSS");
}
