package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dl4 {
    public static final a e = new a(null);
    public static final String f = "NexGenPagging";
    public static final String g = "PageId";
    public static final String h = "StateMaster";
    public static final String i = "BloodMaster";
    public static final String j = "Banner";
    public static final String k = "isngmp";
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

    public dl4(Context context) {
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

    public final SharedPreferences.Editor a() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final int b() {
        return d().getInt(k, 1);
    }

    public final int c() {
        return d().getInt(g, 0);
    }

    public final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final String e() {
        return String.valueOf(d().getString(h, "0"));
    }

    public final void f(int i2) {
        a().putInt(k, i2);
        a().commit();
    }

    public final void g(int i2) {
        a().putInt(g, i2);
        a().commit();
    }

    public final void h(String stateMaster) {
        Intrinsics.checkNotNullParameter(stateMaster, "stateMaster");
        a().putString(j, stateMaster);
        a().commit();
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

    public final void l(String stateMaster) {
        Intrinsics.checkNotNullParameter(stateMaster, "stateMaster");
        a().putString(h, stateMaster);
        a().commit();
    }
}
