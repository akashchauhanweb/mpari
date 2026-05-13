package com.zepto;

import android.content.Context;
import android.content.Intent;
import com.zepto.Cif;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lf extends Cif {
    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return kf.a.a(new String[]{input});
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Cif.a b(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (yy0.a(context, input) == 0) {
            return new Cif.a(Boolean.TRUE);
        }
        return null;
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }
}
