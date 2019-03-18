package com.geektech.util;

import android.util.Log;

public class Logger {

    private static String TAG = "ololo";


    public static void d(String message) {
        d(message, TAG);
    }

    public static void d(String message, String tag) {
        Log.d(tag, message);
    }








    public static void e(Exception exception) {
        e(exception, TAG);
    }

    public static void e(Exception exception, String tag) {
        e(exception, exception.getMessage(), tag);
    }

    public static void e(Exception exception, String message, String tag) {
        Log.e(tag, message, exception);
    }


}
