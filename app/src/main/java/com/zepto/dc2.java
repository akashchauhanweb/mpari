package com.zepto;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;

/* JADX INFO: loaded from: classes.dex */
public class dc2 extends sj1 {
    public final Handler t0 = new Handler(Looper.getMainLooper());
    public final Runnable u0 = new a();
    public l60 v0;
    public int w0;
    public int x0;
    public ImageView y0;
    public TextView z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dc2.this.q2();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dc2.this.v0.c0(true);
        }
    }

    public class c implements mf4 {
        public c() {
        }

        @Override // com.zepto.mf4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            dc2 dc2Var = dc2.this;
            dc2Var.t0.removeCallbacks(dc2Var.u0);
            dc2.this.s2(num.intValue());
            dc2.this.t2(num.intValue());
            dc2 dc2Var2 = dc2.this;
            dc2Var2.t0.postDelayed(dc2Var2.u0, 2000L);
        }
    }

    public class d implements mf4 {
        public d() {
        }

        @Override // com.zepto.mf4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            dc2 dc2Var = dc2.this;
            dc2Var.t0.removeCallbacks(dc2Var.u0);
            dc2.this.u2(charSequence);
            dc2 dc2Var2 = dc2.this;
            dc2Var2.t0.postDelayed(dc2Var2.u0, 2000L);
        }
    }

    public static class e {
        public static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    public static class f {
        public static int a() {
            return zy4.v;
        }
    }

    private void l2() {
        l60 l60VarE = k60.e(this, o2());
        this.v0 = l60VarE;
        l60VarE.t().g(this, new c());
        this.v0.r().g(this, new d());
    }

    private boolean o2() {
        return t().getBoolean("host_activity", true);
    }

    public static dc2 p2(boolean z) {
        dc2 dc2Var = new dc2();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z);
        dc2Var.L1(bundle);
        return dc2Var;
    }

    @Override // com.zepto.sj1, com.zepto.sf2
    public void C0(Bundle bundle) {
        super.C0(bundle);
        l2();
        this.w0 = n2(f.a());
        this.x0 = n2(R.attr.textColorSecondary);
    }

    @Override // com.zepto.sf2
    public void S0() {
        super.S0();
        this.t0.removeCallbacksAndMessages(null);
    }

    @Override // com.zepto.sf2
    public void X0() {
        super.X0();
        this.v0.Z(0);
        this.v0.a0(1);
        this.v0.Y(c0(v05.c));
    }

    @Override // com.zepto.sj1
    public Dialog d2(Bundle bundle) {
        a.C0001a c0001a = new a.C0001a(F1());
        c0001a.o(this.v0.y());
        View viewInflate = LayoutInflater.from(c0001a.b()).inflate(m05.a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(c05.d);
        if (textView != null) {
            CharSequence charSequenceX = this.v0.x();
            if (TextUtils.isEmpty(charSequenceX)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceX);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(c05.a);
        if (textView2 != null) {
            CharSequence charSequenceQ = this.v0.q();
            if (TextUtils.isEmpty(charSequenceQ)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceQ);
            }
        }
        this.y0 = (ImageView) viewInflate.findViewById(c05.c);
        this.z0 = (TextView) viewInflate.findViewById(c05.b);
        c0001a.h(yz.d(this.v0.g()) ? c0(v05.a) : this.v0.w(), new b());
        c0001a.p(viewInflate);
        androidx.appcompat.app.a aVarA = c0001a.a();
        aVarA.setCanceledOnTouchOutside(false);
        return aVarA;
    }

    public final Drawable m2(int i, int i2) {
        int i3;
        Context contextV = v();
        if (contextV == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i == 0 && i2 == 1) {
            i3 = nz4.b;
        } else if (i == 1 && i2 == 2) {
            i3 = nz4.a;
        } else if (i == 2 && i2 == 1) {
            i3 = nz4.b;
        } else {
            if (i != 1 || i2 != 3) {
                return null;
            }
            i3 = nz4.b;
        }
        return yy0.e(contextV, i3);
    }

    public final int n2(int i) {
        Context contextV = v();
        if (contextV == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextV.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = contextV.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // com.zepto.sj1, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.v0.W(true);
    }

    public void q2() {
        Context contextV = v();
        if (contextV == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.v0.a0(1);
            this.v0.Y(contextV.getString(v05.c));
        }
    }

    public final boolean r2(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    public void s2(int i) {
        int iS;
        Drawable drawableM2;
        if (this.y0 == null || (drawableM2 = m2((iS = this.v0.s()), i)) == null) {
            return;
        }
        this.y0.setImageDrawable(drawableM2);
        if (r2(iS, i)) {
            e.a(drawableM2);
        }
        this.v0.Z(i);
    }

    public void t2(int i) {
        TextView textView = this.z0;
        if (textView != null) {
            textView.setTextColor(i == 2 ? this.w0 : this.x0);
        }
    }

    public void u2(CharSequence charSequence) {
        TextView textView = this.z0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
