package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wa3 {
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public Context c;

    public wa3(Context context) {
        if (context != null) {
            e(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("language_key", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            this.a = sharedPreferences;
        }
    }

    public final void a() {
        SharedPreferences.Editor editorClear;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null || (editorClear = editorEdit.clear()) == null) {
            return;
        }
        editorClear.apply();
    }

    public final String b(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(str, str2);
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString("TempLangCode", "english");
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString("LangCode", "english");
    }

    public final void e(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.c = context;
    }

    public final void f(String str) {
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editor = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        this.b = editorEdit;
        if (editorEdit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefsEditor");
            editorEdit = null;
        }
        editorEdit.putString("LangCode", str);
        SharedPreferences.Editor editor2 = this.b;
        if (editor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefsEditor");
        } else {
            editor = editor2;
        }
        editor.apply();
    }

    public final void g(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editor = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        this.b = editorEdit;
        if (editorEdit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefsEditor");
            editorEdit = null;
        }
        editorEdit.putString(str, str2);
        SharedPreferences.Editor editor2 = this.b;
        if (editor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefsEditor");
        } else {
            editor = editor2;
        }
        editor.apply();
    }

    public final void h(String str) {
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editor = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        this.b = editorEdit;
        if (editorEdit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefsEditor");
            editorEdit = null;
        }
        editorEdit.putString("TempLangCode", str);
        SharedPreferences.Editor editor2 = this.b;
        if (editor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefsEditor");
        } else {
            editor = editor2;
        }
        editor.apply();
    }
}
