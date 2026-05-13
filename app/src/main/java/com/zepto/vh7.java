package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vh7 {
    public static final a e = new a(null);
    public static final String f = "Vahan_Pagging";
    public static final String g = VContant.SERVICE_NAME;
    public static final String h = "Service_Code";
    public static final String i = "txnNo";
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

    public vh7(Context context) {
        if (context != null) {
            i(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f, this.d);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            k(sharedPreferences);
        }
        SharedPreferences.Editor editorEdit = e().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        j(editorEdit);
    }

    public final String a() {
        String string = e().getString(i, " ");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final boolean b() {
        return e().getBoolean("isAppontment", false);
    }

    public final String c() {
        String string = e().getString(h, "");
        if (string == null) {
            string = null;
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final SharedPreferences.Editor d() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            return editor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editor");
        return null;
    }

    public final SharedPreferences e() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final void f(String str) {
        d().putString(i, str);
        d().commit();
    }

    public final void g(boolean z) {
        d().putBoolean("isAppontment", z);
        d().commit();
    }

    public final void h(String name_service, String code_service) {
        Intrinsics.checkNotNullParameter(name_service, "name_service");
        Intrinsics.checkNotNullParameter(code_service, "code_service");
        d().putString(g, name_service);
        d().putString(h, code_service);
        d().commit();
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
