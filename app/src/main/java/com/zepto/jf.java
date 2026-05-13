package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.zepto.Cif;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class jf extends Cif {
    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type;
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Cif.a b(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
