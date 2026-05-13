package com.zepto;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.zepto.ae4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ce4 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static Bundle a(ae4.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(e85 e85Var) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(e85[] e85VarArr) {
        if (e85VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[e85VarArr.length];
        for (int i = 0; i < e85VarArr.length; i++) {
            e85 e85Var = e85VarArr[i];
            bundleArr[i] = b(null);
        }
        return bundleArr;
    }
}
