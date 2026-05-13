package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class tx3 {
    public static final a a = new a(null);
    public static String b = "0";
    public static String c = "0";
    public static boolean d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return tx3.d;
        }

        public final String b() {
            return tx3.c;
        }

        public final String c() {
            return tx3.b;
        }

        public final void d(boolean z) {
            tx3.d = z;
        }

        public final void e(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            tx3.c = str;
        }

        public final void f(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            tx3.b = str;
        }
    }
}
