package com.zepto;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ug1 {
    public ze3 a;
    public Bundle b;
    public LinkedList c;
    public final og4 d = new m18(this);

    public static void d(FrameLayout frameLayout) {
        xj2 xj2VarL = xj2.l();
        Context context = frameLayout.getContext();
        int iF = xj2VarL.f(context);
        String strD = r28.d(context, iF);
        String strC = r28.c(context, iF);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strD);
        linearLayout.addView(textView);
        Intent intentA = xj2VarL.a(context, iF, null);
        if (intentA != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strC);
            linearLayout.addView(button);
            button.setOnClickListener(new q38(context, intentA));
        }
    }

    public abstract void a(og4 og4Var);

    public ze3 b() {
        return this.a;
    }

    public void c(Bundle bundle) {
        i(bundle, new s28(this, bundle));
    }

    public final void i(Bundle bundle, d48 d48Var) {
        ze3 ze3Var = this.a;
        if (ze3Var != null) {
            d48Var.a(ze3Var);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(d48Var);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }
}
