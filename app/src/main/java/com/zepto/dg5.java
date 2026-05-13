package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg5 {
    public static final a a = new a(null);
    public static String b = "";
    public static String c = "";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return dg5.b;
        }

        public final String b() {
            return dg5.c;
        }

        public final void c(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            dg5.b = str;
        }

        public final void d(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            dg5.c = str;
        }
    }
}
