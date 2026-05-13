package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.zepto.ue5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a90 {
    public a90(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ue5.a aVar = ue5.a;
        if (aVar.a(context) || s12.g(context) || s12.m(context)) {
            l8.p((Activity) context);
            return;
        }
        Log.e("isRootedDevice---", String.valueOf(aVar.a(context)));
        Log.e("checkfire=-----", String.valueOf(s12.g(context)));
        Log.e("isRunningOnEmulator=----", String.valueOf(s12.m(context)));
    }
}
