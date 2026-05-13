package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.zepto.b15;
import com.zepto.bh4;
import com.zepto.cg4;
import com.zepto.dh2;
import com.zepto.dq7;
import com.zepto.fq3;
import com.zepto.g15;
import com.zepto.gs4;
import com.zepto.jz4;
import com.zepto.lz1;
import com.zepto.m15;
import com.zepto.p05;
import com.zepto.qv7;
import com.zepto.qz2;
import com.zepto.qz4;
import com.zepto.sj1;
import com.zepto.tr;
import com.zepto.wb0;
import com.zepto.wq3;
import com.zepto.ww3;
import com.zepto.xy4;
import com.zepto.yd1;
import com.zepto.zq3;
import com.zepto.zr7;
import com.zepto.zz4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d<S> extends sj1 {
    public static final Object V0 = "CONFIRM_BUTTON_TAG";
    public static final Object W0 = "CANCEL_BUTTON_TAG";
    public static final Object X0 = "TOGGLE_BUTTON_TAG";
    public c A0;
    public int B0;
    public CharSequence C0;
    public boolean D0;
    public int E0;
    public int F0;
    public CharSequence G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public int L0;
    public CharSequence M0;
    public TextView N0;
    public TextView O0;
    public CheckableImageButton P0;
    public wq3 Q0;
    public Button R0;
    public boolean S0;
    public CharSequence T0;
    public CharSequence U0;
    public final LinkedHashSet t0 = new LinkedHashSet();
    public final LinkedHashSet u0 = new LinkedHashSet();
    public final LinkedHashSet v0 = new LinkedHashSet();
    public final LinkedHashSet w0 = new LinkedHashSet();
    public int x0;
    public gs4 y0;
    public com.google.android.material.datepicker.a z0;

    public class a implements cg4 {
        public final /* synthetic */ int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public a(int i, View view, int i2) {
            this.a = i;
            this.b = view;
            this.c = i2;
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            int i = qv7Var.f(qv7.m.d()).b;
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + i;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.c + i, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return qv7Var;
        }
    }

    public class b extends bh4 {
        public b() {
        }
    }

    public static Drawable m2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, tr.b(context, qz4.b));
        stateListDrawable.addState(new int[0], tr.b(context, qz4.c));
        return stateListDrawable;
    }

    private yd1 o2() {
        wb0.a(t().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    public static CharSequence p2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    public static int s2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(jz4.K);
        int i = ww3.f().g;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(jz4.M) * i) + ((i - 1) * resources.getDimensionPixelOffset(jz4.P));
    }

    public static boolean v2(Context context) {
        return z2(context, R.attr.windowFullscreen);
    }

    public static boolean x2(Context context) {
        return z2(context, xy4.Q);
    }

    public static boolean z2(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(fq3.d(context, xy4.x, c.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final void A2() {
        int iT2 = t2(F1());
        o2();
        c cVarL2 = c.l2(null, iT2, this.z0, null);
        this.A0 = cVarL2;
        gs4 gs4VarX1 = cVarL2;
        if (this.E0 == 1) {
            o2();
            gs4VarX1 = zq3.X1(null, iT2, this.z0);
        }
        this.y0 = gs4VarX1;
        C2();
        B2(r2());
        dh2 dh2VarN = u().n();
        dh2VarN.o(zz4.z, this.y0);
        dh2VarN.j();
        this.y0.V1(new b());
    }

    public void B2(String str) {
        this.O0.setContentDescription(q2());
        this.O0.setText(str);
    }

    @Override // com.zepto.sj1, com.zepto.sf2
    public final void C0(Bundle bundle) {
        super.C0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        wb0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.z0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        wb0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.B0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.E0 = bundle.getInt("INPUT_MODE_KEY");
        this.F0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.H0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.J0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.L0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.C0;
        if (text == null) {
            text = F1().getResources().getText(this.B0);
        }
        this.T0 = text;
        this.U0 = p2(text);
    }

    public final void C2() {
        this.N0.setText((this.E0 == 1 && w2()) ? this.U0 : this.T0);
    }

    public final void D2(CheckableImageButton checkableImageButton) {
        this.P0.setContentDescription(this.E0 == 1 ? checkableImageButton.getContext().getString(b15.r) : checkableImageButton.getContext().getString(b15.t));
    }

    @Override // com.zepto.sf2
    public final View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.D0 ? p05.B : p05.A, viewGroup);
        Context context = viewInflate.getContext();
        if (this.D0) {
            viewInflate.findViewById(zz4.z).setLayoutParams(new LinearLayout.LayoutParams(s2(context), -2));
        } else {
            viewInflate.findViewById(zz4.A).setLayoutParams(new LinearLayout.LayoutParams(s2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(zz4.G);
        this.O0 = textView;
        dq7.s0(textView, 1);
        this.P0 = (CheckableImageButton) viewInflate.findViewById(zz4.H);
        this.N0 = (TextView) viewInflate.findViewById(zz4.I);
        u2(context);
        this.R0 = (Button) viewInflate.findViewById(zz4.d);
        o2();
        throw null;
    }

    @Override // com.zepto.sj1, com.zepto.sf2
    public final void Y0(Bundle bundle) {
        super.Y0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.z0);
        c cVar = this.A0;
        ww3 ww3VarG2 = cVar == null ? null : cVar.g2();
        if (ww3VarG2 != null) {
            bVar.b(ww3VarG2.i);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.B0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.C0);
        bundle.putInt("INPUT_MODE_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.F0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.G0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.H0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.K0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.L0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.M0);
    }

    @Override // com.zepto.sj1, com.zepto.sf2
    public void Z0() {
        super.Z0();
        Window window = h2().getWindow();
        if (this.D0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.Q0);
            n2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = V().getDimensionPixelOffset(jz4.O);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.Q0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new qz2(h2(), rect));
        }
        A2();
    }

    @Override // com.zepto.sj1, com.zepto.sf2
    public void a1() {
        this.y0.W1();
        super.a1();
    }

    @Override // com.zepto.sj1
    public final Dialog d2(Bundle bundle) {
        Dialog dialog = new Dialog(F1(), t2(F1()));
        Context context = dialog.getContext();
        this.D0 = v2(context);
        int i = xy4.x;
        int i2 = g15.u;
        this.Q0 = new wq3(context, null, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, m15.c3, i, i2);
        int color = typedArrayObtainStyledAttributes.getColor(m15.d3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.Q0.M(context);
        this.Q0.W(ColorStateList.valueOf(color));
        this.Q0.V(dq7.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void n2(Window window) {
        if (this.S0) {
            return;
        }
        View viewFindViewById = G1().findViewById(zz4.i);
        lz1.a(window, true, zr7.d(viewFindViewById), null);
        dq7.E0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.S0 = true;
    }

    @Override // com.zepto.sj1, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.zepto.sj1, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) h0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final String q2() {
        o2();
        F1();
        throw null;
    }

    public String r2() {
        o2();
        v();
        throw null;
    }

    public final int t2(Context context) {
        int i = this.x0;
        if (i != 0) {
            return i;
        }
        o2();
        throw null;
    }

    public final void u2(Context context) {
        this.P0.setTag(X0);
        this.P0.setImageDrawable(m2(context));
        this.P0.setChecked(this.E0 != 0);
        dq7.q0(this.P0, null);
        D2(this.P0);
        this.P0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y2(view);
            }
        });
    }

    public final boolean w2() {
        return V().getConfiguration().orientation == 2;
    }

    public final /* synthetic */ void y2(View view) {
        o2();
        throw null;
    }
}
