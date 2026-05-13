package com.zepto;

import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class ze1 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String currentTime, String data) {
            Intrinsics.checkNotNullParameter(currentTime, "currentTime");
            Intrinsics.checkNotNullParameter(data, "data");
            tu5.a aVar = tu5.a;
            byte[] bArrDecode = Base64.getDecoder().decode(data);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            return String.valueOf(aVar.a(currentTime, new String(bArrDecode, Charsets.UTF_8)));
        }
    }
}
