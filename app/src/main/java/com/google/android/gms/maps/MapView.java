package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zepto.g78;
import com.zepto.ug1;

/* JADX INFO: loaded from: classes.dex */
public class MapView extends FrameLayout {
    public final g78 a;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new g78(this, context, GoogleMapOptions.g(context, attributeSet));
        setClickable(true);
    }

    public void a(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.a.c(bundle);
            if (this.a.b() == null) {
                ug1.d(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
