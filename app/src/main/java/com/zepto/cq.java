package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cq {
    public static final a e = new a(null);
    public static final String f = "NexGenTimer";
    public static final String g = "TimerDate";
    public static final String h = "DeviceDate";
    public static final String i = "ImagerTimer";
    public static final String j = "LanguageTimer";
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;
    public int d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cq(Context context) {
        if (context != null) {
            i(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f, this.d);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            k(sharedPreferences);
        }
        SharedPreferences.Editor editorEdit = d().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        j(editorEdit);
    }

    public final String a() {
        return String.valueOf(d().getString(h, "0"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final String c() {
        return String.valueOf(d().getString(j, "0"));
    }

    public final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final void e() {
        b().clear();
        b().commit();
    }

    public final void f(String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        b().putString(i, time);
        b().commit();
    }

    public final void g(String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        b().putString(j, time);
        b().commit();
    }

    public final void h(String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        b().putString(g, time);
        b().commit();
    }

    public final void i(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void j(SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "<set-?>");
        this.b = editor;
    }

    public final void k(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.a = sharedPreferences;
    }
}
