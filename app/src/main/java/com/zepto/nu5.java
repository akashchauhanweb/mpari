package com.zepto;

import android.util.Base64;
import com.nic.mparivahan.APIController;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class nu5 {
    public static final a a = new a(null);
    public static String b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.HashMap a(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.nu5.a.a(java.lang.String):java.util.HashMap");
        }

        public final String b() {
            return nu5.b;
        }
    }

    static {
        byte[] bArrDecode = Base64.decode(APIController.a().getNapixKeyUser(), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        b = new String(bArrDecode, Charsets.UTF_8);
    }
}
