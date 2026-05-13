package com.zepto;

import android.graphics.drawable.Drawable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b46 {
    public Date a;
    public Drawable b;

    public b46(Date date, Drawable color) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(color, "color");
        this.a = date;
        this.b = color;
    }

    public final Drawable a() {
        return this.b;
    }

    public final Date b() {
        return this.a;
    }
}
