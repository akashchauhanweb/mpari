package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class v82 {
    public static final a d = new a(null);
    public static final String e = "NexGenFcm";
    public static final String f = "FireBaseToken";
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public v82(Context context) {
        if (context != null) {
            e(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(e, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            g(sharedPreferences);
        }
        SharedPreferences.Editor editorEdit = c().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        f(editorEdit);
    }

    public final String a() {
        return String.valueOf(c().getString(f, "0"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final void d(String device) {
        Intrinsics.checkNotNullParameter(device, "device");
        b().putString(f, device);
        b().commit();
    }

    public final void e(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void f(SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "<set-?>");
        this.b = editor;
    }

    public final void g(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.a = sharedPreferences;
    }
}
