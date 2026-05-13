package com.zepto;

import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v50 {
    public static final void a(TextView textView, String str) {
        if (b(str)) {
            if (textView != null) {
                textView.setTextColor(-16711936);
            }
            if (textView == null) {
                return;
            }
            textView.setText("Not Expired");
            return;
        }
        if (textView != null) {
            textView.setTextColor(-65536);
        }
        if (textView == null) {
            return;
        }
        textView.setText("Expired");
    }

    public static final boolean b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            return new Date().before(new SimpleDateFormat("MMM dd, yyyy").parse(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void c(ImageView view, String imageBase64) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageBase64, "imageBase64");
        if (imageBase64.length() > 0) {
            byte[] bytes = imageBase64.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDecode = Base64.decode(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            view.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        }
    }
}
