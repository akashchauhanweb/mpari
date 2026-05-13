package com.zepto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kt6 {
    public static Bitmap a(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }

    public static boolean c(String str) {
        if (str == null) {
            return true;
        }
        return str.equals("");
    }

    public static boolean d(Object obj) {
        if (obj == null || obj == "null") {
            return false;
        }
        if (obj instanceof Collection) {
            return !((Collection) obj).isEmpty();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (c(str) || str.equalsIgnoreCase("null")) {
                return false;
            }
        }
        return true;
    }
}
