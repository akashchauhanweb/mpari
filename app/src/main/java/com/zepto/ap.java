package com.zepto;

import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ap implements cp3 {
    @Override // com.zepto.cp3
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // com.zepto.cp3
    public bp3 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new cl2(el2.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // com.zepto.cp3
    public int c() {
        return 1073741823;
    }
}
