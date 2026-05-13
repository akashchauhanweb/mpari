package com.zepto;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gs0 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                AssetManager assets = context.getAssets();
                Intrinsics.checkNotNull(str);
                InputStream inputStreamOpen = assets.open(str);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                inputStreamOpen.close();
                return new String(bArr, Charsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
