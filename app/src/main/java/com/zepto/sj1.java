package com.zepto;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class sj1 extends sf2 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler d0;
    public boolean m0;
    public Dialog o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public Runnable e0 = new a();
    public DialogInterface.OnCancelListener f0 = new b();
    public DialogInterface.OnDismissListener g0 = new c();
    public int h0 = 0;
    public int i0 = 0;
    public boolean j0 = true;
    public boolean k0 = true;
    public int l0 = -1;
    public mf4 n0 = new d();
    public boolean s0 = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            sj1.this.g0.onDismiss(sj1.this.o0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (sj1.this.o0 != null) {
                sj1 sj1Var = sj1.this;
                sj1Var.onCancel(sj1Var.o0);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (sj1.this.o0 != null) {
                sj1 sj1Var = sj1.this;
                sj1Var.onDismiss(sj1Var.o0);
            }
        }
    }

    public class d implements mf4 {
        public d() {
        }

        @Override // com.zepto.mf4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df3 df3Var) {
            if (df3Var == null || !sj1.this.k0) {
                return;
            }
            View viewG1 = sj1.this.G1();
            if (viewG1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (sj1.this.o0 != null) {
                if (mg2.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + sj1.this.o0);
                }
                sj1.this.o0.setContentView(viewG1);
            }
        }
    }

    public class e extends bg2 {
        public final /* synthetic */ bg2 a;

        public e(bg2 bg2Var) {
            this.a = bg2Var;
        }

        @Override // com.zepto.bg2
        public View c(int i) {
            return this.a.d() ? this.a.c(i) : sj1.this.e2(i);
        }

        @Override // com.zepto.bg2
        public boolean d() {
            return this.a.d() || sj1.this.f2();
        }
    }

    @Override // com.zepto.sf2
    public void C0(Bundle bundle) {
        super.C0(bundle);
        this.d0 = new Handler();
        this.k0 = this.y == 0;
        if (bundle != null) {
            this.h0 = bundle.getInt("android:style", 0);
            this.i0 = bundle.getInt("android:theme", 0);
            this.j0 = bundle.getBoolean("android:cancelable", true);
            this.k0 = bundle.getBoolean("android:showsDialog", this.k0);
            this.l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // com.zepto.sf2
    public void J0() {
        super.J0();
        Dialog dialog = this.o0;
        if (dialog != null) {
            this.p0 = true;
            dialog.setOnDismissListener(null);
            this.o0.dismiss();
            if (!this.q0) {
                onDismiss(this.o0);
            }
            this.o0 = null;
            this.s0 = false;
        }
    }

    @Override // com.zepto.sf2
    public void K0() {
        super.K0();
        if (!this.r0 && !this.q0) {
            this.q0 = true;
        }
        j0().l(this.n0);
    }

    @Override // com.zepto.sf2
    public LayoutInflater L0(Bundle bundle) {
        LayoutInflater layoutInflaterL0 = super.L0(bundle);
        if (this.k0 && !this.m0) {
            g2(bundle);
            if (mg2.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.o0;
            return dialog != null ? layoutInflaterL0.cloneInContext(dialog.getContext()) : layoutInflaterL0;
        }
        if (mg2.J0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.k0) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterL0;
    }

    @Override // com.zepto.sf2
    public void Y0(Bundle bundle) {
        super.Y0(bundle);
        Dialog dialog = this.o0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.h0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.i0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.l0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void Y1() {
        a2(false, false, false);
    }

    @Override // com.zepto.sf2
    public void Z0() {
        super.Z0();
        Dialog dialog = this.o0;
        if (dialog != null) {
            this.p0 = false;
            dialog.show();
            View decorView = this.o0.getWindow().getDecorView();
            ur7.a(decorView, this);
            xr7.a(decorView, this);
            wr7.a(decorView, this);
        }
    }

    public void Z1() {
        a2(true, false, false);
    }

    @Override // com.zepto.sf2
    public void a1() {
        super.a1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void a2(boolean z, boolean z2, boolean z3) {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        this.r0 = false;
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.o0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.d0.getLooper()) {
                    onDismiss(this.o0);
                } else {
                    this.d0.post(this.e0);
                }
            }
        }
        this.p0 = true;
        if (this.l0 >= 0) {
            if (z3) {
                N().e1(this.l0, 1);
            } else {
                N().b1(this.l0, 1, z);
            }
            this.l0 = -1;
            return;
        }
        dh2 dh2VarN = N().n();
        dh2VarN.s(true);
        dh2VarN.n(this);
        if (z3) {
            dh2VarN.j();
        } else if (z) {
            dh2VarN.i();
        } else {
            dh2VarN.h();
        }
    }

    public Dialog b2() {
        return this.o0;
    }

    @Override // com.zepto.sf2
    public void c1(Bundle bundle) {
        Bundle bundle2;
        super.c1(bundle);
        if (this.o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o0.onRestoreInstanceState(bundle2);
    }

    public int c2() {
        return this.i0;
    }

    public Dialog d2(Bundle bundle) {
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new fu0(F1(), c2());
    }

    public View e2(int i) {
        Dialog dialog = this.o0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean f2() {
        return this.s0;
    }

    public final void g2(Bundle bundle) {
        if (this.k0 && !this.s0) {
            try {
                this.m0 = true;
                Dialog dialogD2 = d2(bundle);
                this.o0 = dialogD2;
                if (this.k0) {
                    j2(dialogD2, this.h0);
                    Context contextV = v();
                    if (contextV instanceof Activity) {
                        this.o0.setOwnerActivity((Activity) contextV);
                    }
                    this.o0.setCancelable(this.j0);
                    this.o0.setOnCancelListener(this.f0);
                    this.o0.setOnDismissListener(this.g0);
                    this.s0 = true;
                } else {
                    this.o0 = null;
                }
                this.m0 = false;
            } catch (Throwable th) {
                this.m0 = false;
                throw th;
            }
        }
    }

    @Override // com.zepto.sf2
    public bg2 h() {
        return new e(super.h());
    }

    public final Dialog h2() {
        Dialog dialogB2 = b2();
        if (dialogB2 != null) {
            return dialogB2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void i2(boolean z) {
        this.k0 = z;
    }

    @Override // com.zepto.sf2
    public void j1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.j1(layoutInflater, viewGroup, bundle);
        if (this.I != null || this.o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o0.onRestoreInstanceState(bundle2);
    }

    public void j2(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void k2(mg2 mg2Var, String str) {
        this.q0 = false;
        this.r0 = true;
        dh2 dh2VarN = mg2Var.n();
        dh2VarN.s(true);
        dh2VarN.e(this, str);
        dh2VarN.h();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.p0) {
            return;
        }
        if (mg2.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        a2(true, true, false);
    }

    @Override // com.zepto.sf2
    public void w0(Bundle bundle) {
        super.w0(bundle);
    }

    @Override // com.zepto.sf2
    public void z0(Context context) {
        super.z0(context);
        j0().h(this.n0);
        if (this.r0) {
            return;
        }
        this.q0 = false;
    }
}
