package com.geektech.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    public static void showShort(Context context, String message) {
        showToast(context, message, Toast.LENGTH_SHORT);
    }

    public static void showLong(Context context, String message) {
        showToast(context, message, Toast.LENGTH_LONG);
    }

    private static void showToast(Context context, String message, int length) {
        Toast.makeText(context, message, length).show();
    }

}
