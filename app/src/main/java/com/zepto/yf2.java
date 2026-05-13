package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.h;
import com.zepto.cm5;
import com.zepto.l8;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class yf2 extends zt0 implements l8.f {
    public boolean x;
    public boolean y;
    public final cg2 v = cg2.b(new a());
    public final androidx.lifecycle.m w = new androidx.lifecycle.m(this);
    public boolean z = true;

    public class a extends eg2 implements kg4, fh4, vg4, xg4, dr7, gg4, qf, em5, tg2, ps3 {
        public a() {
            super(yf2.this);
        }

        @Override // com.zepto.ps3
        public void G(ws3 ws3Var) {
            yf2.this.G(ws3Var);
        }

        @Override // com.zepto.ps3
        public void H(ws3 ws3Var) {
            yf2.this.H(ws3Var);
        }

        @Override // com.zepto.fh4
        public void N(ux0 ux0Var) {
            yf2.this.N(ux0Var);
        }

        @Override // com.zepto.vg4
        public void O(ux0 ux0Var) {
            yf2.this.O(ux0Var);
        }

        @Override // com.zepto.fh4
        public void P(ux0 ux0Var) {
            yf2.this.P(ux0Var);
        }

        @Override // com.zepto.qf
        public pf R() {
            return yf2.this.R();
        }

        @Override // com.zepto.xg4
        public void T(ux0 ux0Var) {
            yf2.this.T(ux0Var);
        }

        @Override // com.zepto.kg4
        public void Y(ux0 ux0Var) {
            yf2.this.Y(ux0Var);
        }

        @Override // com.zepto.tg2
        public void a(mg2 mg2Var, sf2 sf2Var) {
            yf2.this.Q0(sf2Var);
        }

        @Override // com.zepto.dr7
        public cr7 b0() {
            return yf2.this.b0();
        }

        @Override // com.zepto.bg2
        public View c(int i) {
            return yf2.this.findViewById(i);
        }

        @Override // com.zepto.bg2
        public boolean d() {
            Window window = yf2.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // com.zepto.df3
        public androidx.lifecycle.h g0() {
            return yf2.this.w;
        }

        @Override // com.zepto.eg2
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            yf2.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // com.zepto.vg4
        public void h0(ux0 ux0Var) {
            yf2.this.h0(ux0Var);
        }

        @Override // com.zepto.eg2
        public LayoutInflater j() {
            return yf2.this.getLayoutInflater().cloneInContext(yf2.this);
        }

        @Override // com.zepto.eg2
        public void l() {
            n();
        }

        @Override // com.zepto.gg4
        public eg4 m() {
            return yf2.this.m();
        }

        public void n() {
            yf2.this.w0();
        }

        @Override // com.zepto.em5
        public cm5 o() {
            return yf2.this.o();
        }

        @Override // com.zepto.eg2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public yf2 i() {
            return yf2.this;
        }

        @Override // com.zepto.kg4
        public void v(ux0 ux0Var) {
            yf2.this.v(ux0Var);
        }

        @Override // com.zepto.xg4
        public void z(ux0 ux0Var) {
            yf2.this.z(ux0Var);
        }
    }

    public yf2() {
        J0();
    }

    private void J0() {
        o().h("android:support:lifecycle", new cm5.c() { // from class: com.zepto.uf2
            @Override // com.zepto.cm5.c
            public final Bundle a() {
                return this.a.K0();
            }
        });
        v(new ux0() { // from class: com.zepto.vf2
            @Override // com.zepto.ux0
            public final void a(Object obj) {
                this.a.L0((Configuration) obj);
            }
        });
        s0(new ux0() { // from class: com.zepto.wf2
            @Override // com.zepto.ux0
            public final void a(Object obj) {
                this.a.M0((Intent) obj);
            }
        });
        r0(new ng4() { // from class: com.zepto.xf2
            @Override // com.zepto.ng4
            public final void a(Context context) {
                this.a.N0(context);
            }
        });
    }

    public static boolean P0(mg2 mg2Var, h.b bVar) {
        boolean zP0 = false;
        for (sf2 sf2Var : mg2Var.v0()) {
            if (sf2Var != null) {
                if (sf2Var.F() != null) {
                    zP0 |= P0(sf2Var.u(), bVar);
                }
                jh2 jh2Var = sf2Var.U;
                if (jh2Var != null && jh2Var.g0().b().b(h.b.STARTED)) {
                    sf2Var.U.f(bVar);
                    zP0 = true;
                }
                if (sf2Var.T.b().b(h.b.STARTED)) {
                    sf2Var.T.o(bVar);
                    zP0 = true;
                }
            }
        }
        return zP0;
    }

    public final View H0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.v.n(view, str, context, attributeSet);
    }

    public mg2 I0() {
        return this.v.l();
    }

    public final /* synthetic */ Bundle K0() {
        O0();
        this.w.i(h.a.ON_STOP);
        return new Bundle();
    }

    public final /* synthetic */ void L0(Configuration configuration) {
        this.v.m();
    }

    public final /* synthetic */ void M0(Intent intent) {
        this.v.m();
    }

    public final /* synthetic */ void N0(Context context) {
        this.v.a(null);
    }

    public void O0() {
        while (P0(I0(), h.b.CREATED)) {
        }
    }

    public void Q0(sf2 sf2Var) {
    }

    public void R0() {
        this.w.i(h.a.ON_RESUME);
        this.v.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (k0(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.x);
            printWriter.print(" mResumed=");
            printWriter.print(this.y);
            printWriter.print(" mStopped=");
            printWriter.print(this.z);
            if (getApplication() != null) {
                gm3.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.v.l().V(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.zepto.l8.f
    public final void l(int i) {
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.v.m();
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w.i(h.a.ON_CREATE);
        this.v.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewH0 = H0(view, str, context, attributeSet);
        return viewH0 == null ? super.onCreateView(view, str, context, attributeSet) : viewH0;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.v.f();
        this.w.i(h.a.ON_DESTROY);
    }

    @Override // com.zepto.zt0, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.v.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.y = false;
        this.v.g();
        this.w.i(h.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        R0();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.v.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.v.m();
        super.onResume();
        this.y = true;
        this.v.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.v.m();
        super.onStart();
        this.z = false;
        if (!this.x) {
            this.x = true;
            this.v.c();
        }
        this.v.k();
        this.w.i(h.a.ON_START);
        this.v.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.v.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.z = true;
        O0();
        this.v.j();
        this.w.i(h.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewH0 = H0(null, str, context, attributeSet);
        return viewH0 == null ? super.onCreateView(str, context, attributeSet) : viewH0;
    }
}
