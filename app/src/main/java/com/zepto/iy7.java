package com.zepto;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iy7 {
    public static iy7 c(Context context) {
        return jy7.i(context);
    }

    public static void d(Context context, androidx.work.a aVar) {
        jy7.d(context, aVar);
    }

    public final nh4 a(uy7 uy7Var) {
        return b(Collections.singletonList(uy7Var));
    }

    public abstract nh4 b(List list);
}
