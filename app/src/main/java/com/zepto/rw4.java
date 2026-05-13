package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.nic.mparivahan.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rw4 {
    public final int a;
    public View b;
    public a.C0001a c;
    public Dialog d;

    public rw4(Context context, int i, boolean z) {
        TextView textView;
        this.a = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.progress, (ViewGroup) null);
        this.b = viewInflate;
        if (viewInflate != null && (textView = (TextView) viewInflate.findViewById(R.id.text)) != null) {
            textView.setText(i);
        }
        Intrinsics.checkNotNull(context);
        a.C0001a c0001a = new a.C0001a(context);
        this.c = c0001a;
        c0001a.p(this.b);
        androidx.appcompat.app.a aVarA = this.c.a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
        this.d = aVarA;
        aVarA.setCancelable(z);
    }

    public final void a() {
        if (this.d.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void b() {
        this.d.show();
    }
}
