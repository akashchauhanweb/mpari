package com.nic.mparivahan.Echallan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final C0051a a = new C0051a(null);

    /* JADX INFO: renamed from: com.nic.mparivahan.Echallan.a$a, reason: collision with other inner class name */
    public static final class C0051a {
        public C0051a() {
        }

        public /* synthetic */ C0051a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            try {
                String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date));
                Intrinsics.checkNotNull(str);
                return str;
            } catch (ParseException e) {
                e.printStackTrace();
                return date;
            }
        }
    }
}
