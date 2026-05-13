package com.zepto;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nf extends Cif {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, t03 input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public gf c(int i, Intent intent) {
        return new gf(i, intent);
    }
}
