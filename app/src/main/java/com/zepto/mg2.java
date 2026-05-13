package com.zepto;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.h;
import com.zepto.bh2;
import com.zepto.cm5;
import com.zepto.dh2;
import com.zepto.t03;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class mg2 {
    public static boolean S;
    public of D;
    public of E;
    public of F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public pg2 P;
    public bh2.c Q;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public eg4 g;
    public ArrayList m;
    public eg2 v;
    public bg2 w;
    public sf2 x;
    public sf2 y;
    public final ArrayList a = new ArrayList();
    public final zg2 c = new zg2();
    public final fg2 f = new fg2(this);
    public final dg4 h = new b(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final gg2 n = new gg2(this);
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public final ux0 p = new ux0() { // from class: com.zepto.hg2
        @Override // com.zepto.ux0
        public final void a(Object obj) {
            this.a.S0((Configuration) obj);
        }
    };
    public final ux0 q = new ux0() { // from class: com.zepto.ig2
        @Override // com.zepto.ux0
        public final void a(Object obj) {
            this.a.T0((Integer) obj);
        }
    };
    public final ux0 r = new ux0() { // from class: com.zepto.jg2
        @Override // com.zepto.ux0
        public final void a(Object obj) {
            this.a.U0((hy3) obj);
        }
    };
    public final ux0 s = new ux0() { // from class: com.zepto.kg2
        @Override // com.zepto.ux0
        public final void a(Object obj) {
            this.a.V0((hs4) obj);
        }
    };
    public final ws3 t = new c();
    public int u = -1;
    public dg2 z = null;
    public dg2 A = new d();
    public k56 B = null;
    public k56 C = new e();
    public ArrayDeque G = new ArrayDeque();
    public Runnable R = new f();

    public class a implements hf {
        public a() {
        }

        @Override // com.zepto.hf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) mg2.this.G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.c;
            int i2 = kVar.e;
            sf2 sf2VarI = mg2.this.c.i(str);
            if (sf2VarI != null) {
                sf2VarI.W0(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends dg4 {
        public b(boolean z) {
            super(z);
        }

        @Override // com.zepto.dg4
        public void d() {
            mg2.this.F0();
        }
    }

    public class c implements ws3 {
        public c() {
        }

        @Override // com.zepto.ws3
        public boolean a(MenuItem menuItem) {
            return mg2.this.I(menuItem);
        }

        @Override // com.zepto.ws3
        public void b(Menu menu) {
            mg2.this.J(menu);
        }

        @Override // com.zepto.ws3
        public void c(Menu menu, MenuInflater menuInflater) {
            mg2.this.B(menu, menuInflater);
        }

        @Override // com.zepto.ws3
        public void d(Menu menu) {
            mg2.this.N(menu);
        }
    }

    public class d extends dg2 {
        public d() {
        }

        @Override // com.zepto.dg2
        public sf2 a(ClassLoader classLoader, String str) {
            return mg2.this.w0().b(mg2.this.w0().f(), str, null);
        }
    }

    public class e implements k56 {
        public e() {
        }

        @Override // com.zepto.k56
        public i56 a(ViewGroup viewGroup) {
            return new ig1(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mg2.this.Z(true);
        }
    }

    public class g implements tg2 {
        public final /* synthetic */ sf2 a;

        public g(sf2 sf2Var) {
            this.a = sf2Var;
        }

        @Override // com.zepto.tg2
        public void a(mg2 mg2Var, sf2 sf2Var) {
            this.a.A0(sf2Var);
        }
    }

    public class h implements hf {
        public h() {
        }

        @Override // com.zepto.hf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(gf gfVar) {
            k kVar = (k) mg2.this.G.pollLast();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.c;
            int i = kVar.e;
            sf2 sf2VarI = mg2.this.c.i(str);
            if (sf2VarI != null) {
                sf2VarI.x0(i, gfVar.d(), gfVar.c());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class i implements hf {
        public i() {
        }

        @Override // com.zepto.hf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(gf gfVar) {
            k kVar = (k) mg2.this.G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.c;
            int i = kVar.e;
            sf2 sf2VarI = mg2.this.c.i(str);
            if (sf2VarI != null) {
                sf2VarI.x0(i, gfVar.d(), gfVar.c());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class j extends Cif {
        @Override // com.zepto.Cif
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, t03 t03Var) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentC = t03Var.c();
            if (intentC != null && (bundleExtra = intentC.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentC.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentC.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    t03Var = new t03.a(t03Var.f()).b(null).c(t03Var.e(), t03Var.d()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", t03Var);
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // com.zepto.Cif
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public gf c(int i, Intent intent) {
            return new gf(i, intent);
        }
    }

    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public String c;
        public int e;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(String str, int i) {
            this.c = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
            parcel.writeInt(this.e);
        }

        public k(Parcel parcel) {
            this.c = parcel.readString();
            this.e = parcel.readInt();
        }
    }

    public interface l {
        void a(sf2 sf2Var, boolean z);

        void b();

        void c(sf2 sf2Var, boolean z);
    }

    public interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class n implements m {
        public final String a;
        public final int b;
        public final int c;

        public n(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // com.zepto.mg2.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            sf2 sf2Var = mg2.this.y;
            if (sf2Var == null || this.b >= 0 || this.a != null || !sf2Var.u().d1()) {
                return mg2.this.g1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    public class o implements m {
        public final String a;

        public o(String str) {
            this.a = str;
        }

        @Override // com.zepto.mg2.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return mg2.this.l1(arrayList, arrayList2, this.a);
        }
    }

    public class p implements m {
        public final String a;

        public p(String str) {
            this.a = str;
        }

        @Override // com.zepto.mg2.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return mg2.this.q1(arrayList, arrayList2, this.a);
        }
    }

    public static sf2 D0(View view) {
        Object tag = view.getTag(h05.a);
        if (tag instanceof sf2) {
            return (sf2) tag;
        }
        return null;
    }

    public static boolean J0(int i2) {
        return S || Log.isLoggable("FragmentManager", i2);
    }

    public static void b0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        while (i2 < i3) {
            o30 o30Var = (o30) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                o30Var.t(-1);
                o30Var.z();
            } else {
                o30Var.t(1);
                o30Var.y();
            }
            i2++;
        }
    }

    public static mg2 j0(View view) {
        yf2 yf2Var;
        sf2 sf2VarK0 = k0(view);
        if (sf2VarK0 != null) {
            if (sf2VarK0.n0()) {
                return sf2VarK0.u();
            }
            throw new IllegalStateException("The Fragment " + sf2VarK0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                yf2Var = null;
                break;
            }
            if (context instanceof yf2) {
                yf2Var = (yf2) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (yf2Var != null) {
            return yf2Var.I0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static sf2 k0(View view) {
        while (view != null) {
            sf2 sf2VarD0 = D0(view);
            if (sf2VarD0 != null) {
                return sf2VarD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static int n1(int i2) {
        int i3 = 4097;
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 8194) {
            i3 = 8197;
            if (i2 == 8197) {
                return 4100;
            }
            if (i2 == 4099) {
                return 4099;
            }
            if (i2 != 4100) {
                return 0;
            }
        }
        return i3;
    }

    public void A() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(1);
    }

    public sf2 A0() {
        return this.y;
    }

    public boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null && N0(sf2Var) && sf2Var.i1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sf2Var);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                sf2 sf2Var2 = (sf2) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(sf2Var2)) {
                    sf2Var2.I0();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public k56 B0() {
        k56 k56Var = this.B;
        if (k56Var != null) {
            return k56Var;
        }
        sf2 sf2Var = this.x;
        return sf2Var != null ? sf2Var.t.B0() : this.C;
    }

    public void C() {
        this.K = true;
        Z(true);
        W();
        r();
        R(-1);
        Object obj = this.v;
        if (obj instanceof fh4) {
            ((fh4) obj).N(this.q);
        }
        Object obj2 = this.v;
        if (obj2 instanceof kg4) {
            ((kg4) obj2).Y(this.p);
        }
        Object obj3 = this.v;
        if (obj3 instanceof vg4) {
            ((vg4) obj3).h0(this.r);
        }
        Object obj4 = this.v;
        if (obj4 instanceof xg4) {
            ((xg4) obj4).z(this.s);
        }
        Object obj5 = this.v;
        if ((obj5 instanceof ps3) && this.x == null) {
            ((ps3) obj5).H(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.h();
            this.g = null;
        }
        of ofVar = this.D;
        if (ofVar != null) {
            ofVar.c();
            this.E.c();
            this.F.c();
        }
    }

    public bh2.c C0() {
        return this.Q;
    }

    public void D() {
        R(1);
    }

    public void E(boolean z) {
        if (z && (this.v instanceof fh4)) {
            y1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null) {
                sf2Var.o1();
                if (z) {
                    sf2Var.v.E(true);
                }
            }
        }
    }

    public cr7 E0(sf2 sf2Var) {
        return this.P.o(sf2Var);
    }

    public void F(boolean z, boolean z2) {
        if (z2 && (this.v instanceof vg4)) {
            y1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null) {
                sf2Var.p1(z);
                if (z2) {
                    sf2Var.v.F(z, true);
                }
            }
        }
    }

    public void F0() {
        Z(true);
        if (this.h.g()) {
            d1();
        } else {
            this.g.k();
        }
    }

    public void G(sf2 sf2Var) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tg2) it.next()).a(this, sf2Var);
        }
    }

    public void G0(sf2 sf2Var) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + sf2Var);
        }
        if (sf2Var.A) {
            return;
        }
        sf2Var.A = true;
        sf2Var.O = true ^ sf2Var.O;
        v1(sf2Var);
    }

    public void H() {
        for (sf2 sf2Var : this.c.l()) {
            if (sf2Var != null) {
                sf2Var.M0(sf2Var.o0());
                sf2Var.v.H();
            }
        }
    }

    public void H0(sf2 sf2Var) {
        if (sf2Var.l && K0(sf2Var)) {
            this.H = true;
        }
    }

    public boolean I(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null && sf2Var.q1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean I0() {
        return this.K;
    }

    public void J(Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null) {
                sf2Var.r1(menu);
            }
        }
    }

    public final void K(sf2 sf2Var) {
        if (sf2Var == null || !sf2Var.equals(e0(sf2Var.f))) {
            return;
        }
        sf2Var.v1();
    }

    public final boolean K0(sf2 sf2Var) {
        return (sf2Var.E && sf2Var.F) || sf2Var.v.o();
    }

    public void L() {
        R(5);
    }

    public final boolean L0() {
        sf2 sf2Var = this.x;
        if (sf2Var == null) {
            return true;
        }
        return sf2Var.n0() && this.x.N().L0();
    }

    public void M(boolean z, boolean z2) {
        if (z2 && (this.v instanceof xg4)) {
            y1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null) {
                sf2Var.t1(z);
                if (z2) {
                    sf2Var.v.M(z, true);
                }
            }
        }
    }

    public boolean M0(sf2 sf2Var) {
        if (sf2Var == null) {
            return false;
        }
        return sf2Var.o0();
    }

    public boolean N(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null && N0(sf2Var) && sf2Var.u1(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean N0(sf2 sf2Var) {
        if (sf2Var == null) {
            return true;
        }
        return sf2Var.q0();
    }

    public void O() {
        z1();
        K(this.y);
    }

    public boolean O0(sf2 sf2Var) {
        if (sf2Var == null) {
            return true;
        }
        mg2 mg2Var = sf2Var.t;
        return sf2Var.equals(mg2Var.A0()) && O0(mg2Var.x);
    }

    public void P() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(7);
    }

    public boolean P0(int i2) {
        return this.u >= i2;
    }

    public void Q() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(5);
    }

    public boolean Q0() {
        return this.I || this.J;
    }

    public final void R(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            X0(i2, false);
            Iterator it = s().iterator();
            while (it.hasNext()) {
                ((i56) it.next()).n();
            }
            this.b = false;
            Z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public void S() {
        this.J = true;
        this.P.r(true);
        R(4);
    }

    public final /* synthetic */ void S0(Configuration configuration) {
        if (L0()) {
            y(configuration, false);
        }
    }

    public void T() {
        R(2);
    }

    public final /* synthetic */ void T0(Integer num) {
        if (L0() && num.intValue() == 80) {
            E(false);
        }
    }

    public final void U() {
        if (this.L) {
            this.L = false;
            x1();
        }
    }

    public final /* synthetic */ void U0(hy3 hy3Var) {
        if (L0()) {
            F(hy3Var.a(), false);
        }
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                sf2 sf2Var = (sf2) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(sf2Var.toString());
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                o30 o30Var = (o30) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(o30Var.toString());
                o30Var.w(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        m mVar = (m) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final /* synthetic */ void V0(hs4 hs4Var) {
        if (L0()) {
            M(hs4Var.a(), false);
        }
    }

    public final void W() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            ((i56) it.next()).n();
        }
    }

    public void W0(sf2 sf2Var, Intent intent, int i2, Bundle bundle) {
        if (this.D == null) {
            this.v.k(sf2Var, intent, i2, bundle);
            return;
        }
        this.G.addLast(new k(sf2Var.f, i2));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.a(intent);
    }

    public void X(m mVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(mVar);
                    r1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void X0(int i2, boolean z) {
        eg2 eg2Var;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.u) {
            this.u = i2;
            this.c.t();
            x1();
            if (this.H && (eg2Var = this.v) != null && this.u == 7) {
                eg2Var.l();
                this.H = false;
            }
        }
    }

    public final void Y(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            p();
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public void Y0() {
        if (this.v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.r(false);
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null) {
                sf2Var.v0();
            }
        }
    }

    public boolean Z(boolean z) {
        Y(z);
        boolean z2 = false;
        while (n0(this.M, this.N)) {
            z2 = true;
            this.b = true;
            try {
                i1(this.M, this.N);
            } finally {
                q();
            }
        }
        z1();
        U();
        this.c.b();
        return z2;
    }

    public void Z0(FragmentContainerView fragmentContainerView) {
        View view;
        for (yg2 yg2Var : this.c.k()) {
            sf2 sf2VarK = yg2Var.k();
            if (sf2VarK.y == fragmentContainerView.getId() && (view = sf2VarK.I) != null && view.getParent() == null) {
                sf2VarK.H = fragmentContainerView;
                yg2Var.b();
            }
        }
    }

    public void a0(m mVar, boolean z) {
        if (z && (this.v == null || this.K)) {
            return;
        }
        Y(z);
        if (mVar.a(this.M, this.N)) {
            this.b = true;
            try {
                i1(this.M, this.N);
            } finally {
                q();
            }
        }
        z1();
        U();
        this.c.b();
    }

    public void a1(yg2 yg2Var) {
        sf2 sf2VarK = yg2Var.k();
        if (sf2VarK.J) {
            if (this.b) {
                this.L = true;
            } else {
                sf2VarK.J = false;
                yg2Var.m();
            }
        }
    }

    public void b1(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            X(new n(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public final void c0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ArrayList arrayList3;
        boolean z = ((o30) arrayList.get(i2)).r;
        ArrayList arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.c.o());
        sf2 sf2VarA0 = A0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            o30 o30Var = (o30) arrayList.get(i4);
            sf2VarA0 = !((Boolean) arrayList2.get(i4)).booleanValue() ? o30Var.A(this.O, sf2VarA0) : o30Var.D(this.O, sf2VarA0);
            z2 = z2 || o30Var.i;
        }
        this.O.clear();
        if (!z && this.u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator it = ((o30) arrayList.get(i5)).c.iterator();
                while (it.hasNext()) {
                    sf2 sf2Var = ((dh2.a) it.next()).b;
                    if (sf2Var != null && sf2Var.t != null) {
                        this.c.r(u(sf2Var));
                    }
                }
            }
        }
        b0(arrayList, arrayList2, i2, i3);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
        if (z2 && (arrayList3 = this.m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m0((o30) it2.next()));
            }
            for (l lVar : this.m) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    lVar.c((sf2) it3.next(), zBooleanValue);
                }
            }
            for (l lVar2 : this.m) {
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    lVar2.a((sf2) it4.next(), zBooleanValue);
                }
            }
        }
        for (int i6 = i2; i6 < i3; i6++) {
            o30 o30Var2 = (o30) arrayList.get(i6);
            if (zBooleanValue) {
                for (int size = o30Var2.c.size() - 1; size >= 0; size--) {
                    sf2 sf2Var2 = ((dh2.a) o30Var2.c.get(size)).b;
                    if (sf2Var2 != null) {
                        u(sf2Var2).m();
                    }
                }
            } else {
                Iterator it5 = o30Var2.c.iterator();
                while (it5.hasNext()) {
                    sf2 sf2Var3 = ((dh2.a) it5.next()).b;
                    if (sf2Var3 != null) {
                        u(sf2Var3).m();
                    }
                }
            }
        }
        X0(this.u, true);
        for (i56 i56Var : t(arrayList, i2, i3)) {
            i56Var.v(zBooleanValue);
            i56Var.t();
            i56Var.k();
        }
        while (i2 < i3) {
            o30 o30Var3 = (o30) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && o30Var3.v >= 0) {
                o30Var3.v = -1;
            }
            o30Var3.C();
            i2++;
        }
        if (z2) {
            j1();
        }
    }

    public void c1(String str, int i2) {
        X(new n(str, -1, i2), false);
    }

    public boolean d0() {
        boolean Z = Z(true);
        l0();
        return Z;
    }

    public boolean d1() {
        return f1(null, -1, 0);
    }

    public sf2 e0(String str) {
        return this.c.f(str);
    }

    public boolean e1(int i2, int i3) {
        if (i2 >= 0) {
            return f1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public final int f0(String str, int i2, boolean z) {
        ArrayList arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            o30 o30Var = (o30) this.d.get(size);
            if ((str != null && str.equals(o30Var.B())) || (i2 >= 0 && i2 == o30Var.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            o30 o30Var2 = (o30) this.d.get(size - 1);
            if ((str == null || !str.equals(o30Var2.B())) && (i2 < 0 || i2 != o30Var2.v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final boolean f1(String str, int i2, int i3) {
        Z(false);
        Y(true);
        sf2 sf2Var = this.y;
        if (sf2Var != null && i2 < 0 && str == null && sf2Var.u().d1()) {
            return true;
        }
        boolean zG1 = g1(this.M, this.N, str, i2, i3);
        if (zG1) {
            this.b = true;
            try {
                i1(this.M, this.N);
            } finally {
                q();
            }
        }
        z1();
        U();
        this.c.b();
        return zG1;
    }

    public void g(o30 o30Var) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(o30Var);
    }

    public sf2 g0(int i2) {
        return this.c.g(i2);
    }

    public boolean g1(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int iF0 = f0(str, i2, (i3 & 1) != 0);
        if (iF0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iF0; size--) {
            arrayList.add((o30) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public yg2 h(sf2 sf2Var) {
        String str = sf2Var.R;
        if (str != null) {
            bh2.f(sf2Var, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + sf2Var);
        }
        yg2 yg2VarU = u(sf2Var);
        sf2Var.t = this;
        this.c.r(yg2VarU);
        if (!sf2Var.B) {
            this.c.a(sf2Var);
            sf2Var.m = false;
            if (sf2Var.I == null) {
                sf2Var.O = false;
            }
            if (K0(sf2Var)) {
                this.H = true;
            }
        }
        return yg2VarU;
    }

    public sf2 h0(String str) {
        return this.c.h(str);
    }

    public void h1(sf2 sf2Var) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + sf2Var + " nesting=" + sf2Var.s);
        }
        boolean z = !sf2Var.p0();
        if (!sf2Var.B || z) {
            this.c.u(sf2Var);
            if (K0(sf2Var)) {
                this.H = true;
            }
            sf2Var.m = true;
            v1(sf2Var);
        }
    }

    public void i(tg2 tg2Var) {
        this.o.add(tg2Var);
    }

    public sf2 i0(String str) {
        return this.c.i(str);
    }

    public final void i1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((o30) arrayList.get(i2)).r) {
                if (i3 != i2) {
                    c0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((o30) arrayList.get(i3)).r) {
                        i3++;
                    }
                }
                c0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            c0(arrayList, arrayList2, i3, size);
        }
    }

    public void j(l lVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(lVar);
    }

    public final void j1() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                ((l) this.m.get(i2)).b();
            }
        }
    }

    public int k() {
        return this.i.getAndIncrement();
    }

    public void k1(String str) {
        X(new o(str), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(eg2 eg2Var, bg2 bg2Var, sf2 sf2Var) {
        String str;
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = eg2Var;
        this.w = bg2Var;
        this.x = sf2Var;
        if (sf2Var != null) {
            i(new g(sf2Var));
        } else if (eg2Var instanceof tg2) {
            i((tg2) eg2Var);
        }
        if (this.x != null) {
            z1();
        }
        if (eg2Var instanceof gg4) {
            gg4 gg4Var = (gg4) eg2Var;
            eg4 eg4VarM = gg4Var.m();
            this.g = eg4VarM;
            df3 df3Var = gg4Var;
            if (sf2Var != null) {
                df3Var = sf2Var;
            }
            eg4VarM.h(df3Var, this.h);
        }
        if (sf2Var != null) {
            this.P = sf2Var.t.q0(sf2Var);
        } else if (eg2Var instanceof dr7) {
            this.P = pg2.m(((dr7) eg2Var).b0());
        } else {
            this.P = new pg2(false);
        }
        this.P.r(Q0());
        this.c.A(this.P);
        Object obj = this.v;
        if ((obj instanceof em5) && sf2Var == null) {
            cm5 cm5VarO = ((em5) obj).o();
            cm5VarO.h("android:support:fragments", new cm5.c() { // from class: com.zepto.lg2
                @Override // com.zepto.cm5.c
                public final Bundle a() {
                    return this.a.R0();
                }
            });
            Bundle bundleB = cm5VarO.b("android:support:fragments");
            if (bundleB != null) {
                m1(bundleB);
            }
        }
        Object obj2 = this.v;
        if (obj2 instanceof qf) {
            pf pfVarR = ((qf) obj2).R();
            if (sf2Var != null) {
                str = sf2Var.f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.D = pfVarR.i(str2 + "StartActivityForResult", new mf(), new h());
            this.E = pfVarR.i(str2 + "StartIntentSenderForResult", new j(), new i());
            this.F = pfVarR.i(str2 + "RequestPermissions", new kf(), new a());
        }
        Object obj3 = this.v;
        if (obj3 instanceof kg4) {
            ((kg4) obj3).v(this.p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof fh4) {
            ((fh4) obj4).P(this.q);
        }
        Object obj5 = this.v;
        if (obj5 instanceof vg4) {
            ((vg4) obj5).O(this.r);
        }
        Object obj6 = this.v;
        if (obj6 instanceof xg4) {
            ((xg4) obj6).T(this.s);
        }
        Object obj7 = this.v;
        if ((obj7 instanceof ps3) && sf2Var == null) {
            ((ps3) obj7).G(this.t);
        }
    }

    public final void l0() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            ((i56) it.next()).o();
        }
    }

    public boolean l1(ArrayList arrayList, ArrayList arrayList2, String str) {
        q30 q30Var = (q30) this.j.remove(str);
        if (q30Var == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o30 o30Var = (o30) it.next();
            if (o30Var.w) {
                Iterator it2 = o30Var.c.iterator();
                while (it2.hasNext()) {
                    sf2 sf2Var = ((dh2.a) it2.next()).b;
                    if (sf2Var != null) {
                        map.put(sf2Var.f, sf2Var);
                    }
                }
            }
        }
        Iterator it3 = q30Var.c(this, map).iterator();
        while (true) {
            boolean z = false;
            while (it3.hasNext()) {
                if (((o30) it3.next()).a(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public void m(sf2 sf2Var) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + sf2Var);
        }
        if (sf2Var.B) {
            sf2Var.B = false;
            if (sf2Var.l) {
                return;
            }
            this.c.a(sf2Var);
            if (J0(2)) {
                Log.v("FragmentManager", "add from attach: " + sf2Var);
            }
            if (K0(sf2Var)) {
                this.H = true;
            }
        }
    }

    public final Set m0(o30 o30Var) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < o30Var.c.size(); i2++) {
            sf2 sf2Var = ((dh2.a) o30Var.c.get(i2)).b;
            if (sf2Var != null && o30Var.i) {
                hashSet.add(sf2Var);
            }
        }
        return hashSet;
    }

    public void m1(Parcelable parcelable) {
        yg2 yg2Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.v.f().getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.v.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.c.x(map);
        og2 og2Var = (og2) bundle3.getParcelable("state");
        if (og2Var == null) {
            return;
        }
        this.c.v();
        Iterator it = og2Var.c.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.c.B((String) it.next(), null);
            if (bundleB != null) {
                sf2 sf2VarK = this.P.k(((xg2) bundleB.getParcelable("state")).e);
                if (sf2VarK != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + sf2VarK);
                    }
                    yg2Var = new yg2(this.n, this.c, sf2VarK, bundleB);
                } else {
                    yg2Var = new yg2(this.n, this.c, this.v.f().getClassLoader(), t0(), bundleB);
                }
                sf2 sf2VarK2 = yg2Var.k();
                sf2VarK2.b = bundleB;
                sf2VarK2.t = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + sf2VarK2.f + "): " + sf2VarK2);
                }
                yg2Var.o(this.v.f().getClassLoader());
                this.c.r(yg2Var);
                yg2Var.s(this.u);
            }
        }
        for (sf2 sf2Var : this.P.n()) {
            if (!this.c.c(sf2Var.f)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + sf2Var + " that was not found in the set of active Fragments " + og2Var.c);
                }
                this.P.q(sf2Var);
                sf2Var.t = this;
                yg2 yg2Var2 = new yg2(this.n, this.c, sf2Var);
                yg2Var2.s(1);
                yg2Var2.m();
                sf2Var.m = true;
                yg2Var2.m();
            }
        }
        this.c.w(og2Var.e);
        if (og2Var.f != null) {
            this.d = new ArrayList(og2Var.f.length);
            int i2 = 0;
            while (true) {
                p30[] p30VarArr = og2Var.f;
                if (i2 >= p30VarArr.length) {
                    break;
                }
                o30 o30VarD = p30VarArr[i2].d(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + o30VarD.v + "): " + o30VarD);
                    PrintWriter printWriter = new PrintWriter(new on3("FragmentManager"));
                    o30VarD.x("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(o30VarD);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(og2Var.g);
        String str3 = og2Var.h;
        if (str3 != null) {
            sf2 sf2VarE0 = e0(str3);
            this.y = sf2VarE0;
            K(sf2VarE0);
        }
        ArrayList arrayList = og2Var.i;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.j.put((String) arrayList.get(i3), (q30) og2Var.j.get(i3));
            }
        }
        this.G = new ArrayDeque(og2Var.k);
    }

    public dh2 n() {
        return new o30(this);
    }

    public final boolean n0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            try {
                int size = this.a.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= ((m) this.a.get(i2)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.a.clear();
                this.v.g().removeCallbacks(this.R);
            }
        }
    }

    public boolean o() {
        boolean zK0 = false;
        for (sf2 sf2Var : this.c.l()) {
            if (sf2Var != null) {
                zK0 = K0(sf2Var);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    public List o0() {
        return this.c.l();
    }

    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public Bundle R0() {
        p30[] p30VarArr;
        int size;
        Bundle bundle = new Bundle();
        l0();
        W();
        Z(true);
        this.I = true;
        this.P.r(true);
        ArrayList arrayListY = this.c.y();
        HashMap mapM = this.c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.c.z();
            ArrayList arrayList = this.d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                p30VarArr = null;
            } else {
                p30VarArr = new p30[size];
                for (int i2 = 0; i2 < size; i2++) {
                    p30VarArr[i2] = new p30((o30) this.d.get(i2));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2));
                    }
                }
            }
            og2 og2Var = new og2();
            og2Var.c = arrayListY;
            og2Var.e = arrayListZ;
            og2Var.f = p30VarArr;
            og2Var.g = this.i.get();
            sf2 sf2Var = this.y;
            if (sf2Var != null) {
                og2Var.h = sf2Var.f;
            }
            og2Var.i.addAll(this.j.keySet());
            og2Var.j.addAll(this.j.values());
            og2Var.k = new ArrayList(this.G);
            bundle.putParcelable("state", og2Var);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void p() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public int p0() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void p1(String str) {
        X(new p(str), false);
    }

    public final void q() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final pg2 q0(sf2 sf2Var) {
        return this.P.l(sf2Var);
    }

    public boolean q1(ArrayList arrayList, ArrayList arrayList2, String str) {
        int i2;
        int iF0 = f0(str, -1, true);
        if (iF0 < 0) {
            return false;
        }
        for (int i3 = iF0; i3 < this.d.size(); i3++) {
            o30 o30Var = (o30) this.d.get(i3);
            if (!o30Var.r) {
                y1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + o30Var + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i4 = iF0; i4 < this.d.size(); i4++) {
            o30 o30Var2 = (o30) this.d.get(i4);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (dh2.a aVar : o30Var2.c) {
                sf2 sf2Var = aVar.b;
                if (sf2Var != null) {
                    if (!aVar.c || (i2 = aVar.a) == 1 || i2 == 2 || i2 == 8) {
                        hashSet.add(sf2Var);
                        hashSet2.add(sf2Var);
                    }
                    int i5 = aVar.a;
                    if (i5 == 1 || i5 == 2) {
                        hashSet3.add(sf2Var);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb.append(" in ");
                sb.append(o30Var2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                y1(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            sf2 sf2Var2 = (sf2) arrayDeque.removeFirst();
            if (sf2Var2.C) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(hashSet.contains(sf2Var2) ? "direct reference to retained " : "retained child ");
                sb2.append("fragment ");
                sb2.append(sf2Var2);
                y1(new IllegalArgumentException(sb2.toString()));
            }
            for (sf2 sf2Var3 : sf2Var2.v.o0()) {
                if (sf2Var3 != null) {
                    arrayDeque.addLast(sf2Var3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((sf2) it.next()).f);
        }
        ArrayList arrayList4 = new ArrayList(this.d.size() - iF0);
        for (int i6 = iF0; i6 < this.d.size(); i6++) {
            arrayList4.add(null);
        }
        q30 q30Var = new q30(arrayList3, arrayList4);
        for (int size = this.d.size() - 1; size >= iF0; size--) {
            o30 o30Var3 = (o30) this.d.remove(size);
            o30 o30Var4 = new o30(o30Var3);
            o30Var4.u();
            arrayList4.set(size - iF0, new p30(o30Var4));
            o30Var3.w = true;
            arrayList.add(o30Var3);
            arrayList2.add(Boolean.TRUE);
        }
        this.j.put(str, q30Var);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r5 = this;
            com.zepto.eg2 r0 = r5.v
            boolean r1 = r0 instanceof com.zepto.dr7
            if (r1 == 0) goto L11
            com.zepto.zg2 r0 = r5.c
            com.zepto.pg2 r0 = r0.p()
            boolean r0 = r0.p()
            goto L27
        L11:
            android.content.Context r0 = r0.f()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L29
            com.zepto.eg2 r0 = r5.v
            android.content.Context r0 = r0.f()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ 1
        L27:
            if (r0 == 0) goto L5c
        L29:
            java.util.Map r0 = r5.j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()
            com.zepto.q30 r1 = (com.zepto.q30) r1
            java.util.List r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.zepto.zg2 r3 = r5.c
            com.zepto.pg2 r3 = r3.p()
            r4 = 0
            r3.i(r2, r4)
            goto L45
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.mg2.r():void");
    }

    public bg2 r0() {
        return this.w;
    }

    public void r1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.g().removeCallbacks(this.R);
                    this.v.g().post(this.R);
                    z1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set s() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((yg2) it.next()).k().H;
            if (viewGroup != null) {
                hashSet.add(i56.s(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    public final ViewGroup s0(sf2 sf2Var) {
        ViewGroup viewGroup = sf2Var.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (sf2Var.y > 0 && this.w.d()) {
            View viewC = this.w.c(sf2Var.y);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public void s1(sf2 sf2Var, boolean z) {
        ViewGroup viewGroupS0 = s0(sf2Var);
        if (viewGroupS0 == null || !(viewGroupS0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupS0).setDrawDisappearingViewsLast(!z);
    }

    public final Set t(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((o30) arrayList.get(i2)).c.iterator();
            while (it.hasNext()) {
                sf2 sf2Var = ((dh2.a) it.next()).b;
                if (sf2Var != null && (viewGroup = sf2Var.H) != null) {
                    hashSet.add(i56.r(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public dg2 t0() {
        dg2 dg2Var = this.z;
        if (dg2Var != null) {
            return dg2Var;
        }
        sf2 sf2Var = this.x;
        return sf2Var != null ? sf2Var.t.t0() : this.A;
    }

    public void t1(sf2 sf2Var, h.b bVar) {
        if (sf2Var.equals(e0(sf2Var.f)) && (sf2Var.u == null || sf2Var.t == this)) {
            sf2Var.S = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + sf2Var + " is not an active fragment of FragmentManager " + this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sf2 sf2Var = this.x;
        if (sf2Var != null) {
            sb.append(sf2Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            eg2 eg2Var = this.v;
            if (eg2Var != null) {
                sb.append(eg2Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public yg2 u(sf2 sf2Var) {
        yg2 yg2VarN = this.c.n(sf2Var.f);
        if (yg2VarN != null) {
            return yg2VarN;
        }
        yg2 yg2Var = new yg2(this.n, this.c, sf2Var);
        yg2Var.o(this.v.f().getClassLoader());
        yg2Var.s(this.u);
        return yg2Var;
    }

    public zg2 u0() {
        return this.c;
    }

    public void u1(sf2 sf2Var) {
        if (sf2Var == null || (sf2Var.equals(e0(sf2Var.f)) && (sf2Var.u == null || sf2Var.t == this))) {
            sf2 sf2Var2 = this.y;
            this.y = sf2Var;
            K(sf2Var2);
            K(this.y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + sf2Var + " is not an active fragment of FragmentManager " + this);
    }

    public void v(sf2 sf2Var) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + sf2Var);
        }
        if (sf2Var.B) {
            return;
        }
        sf2Var.B = true;
        if (sf2Var.l) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + sf2Var);
            }
            this.c.u(sf2Var);
            if (K0(sf2Var)) {
                this.H = true;
            }
            v1(sf2Var);
        }
    }

    public List v0() {
        return this.c.o();
    }

    public final void v1(sf2 sf2Var) {
        ViewGroup viewGroupS0 = s0(sf2Var);
        if (viewGroupS0 == null || sf2Var.w() + sf2Var.z() + sf2Var.P() + sf2Var.R() <= 0) {
            return;
        }
        int i2 = h05.c;
        if (viewGroupS0.getTag(i2) == null) {
            viewGroupS0.setTag(i2, sf2Var);
        }
        ((sf2) viewGroupS0.getTag(i2)).O1(sf2Var.O());
    }

    public void w() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(4);
    }

    public eg2 w0() {
        return this.v;
    }

    public void w1(sf2 sf2Var) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + sf2Var);
        }
        if (sf2Var.A) {
            sf2Var.A = false;
            sf2Var.O = !sf2Var.O;
        }
    }

    public void x() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(0);
    }

    public LayoutInflater.Factory2 x0() {
        return this.f;
    }

    public final void x1() {
        Iterator it = this.c.k().iterator();
        while (it.hasNext()) {
            a1((yg2) it.next());
        }
    }

    public void y(Configuration configuration, boolean z) {
        if (z && (this.v instanceof kg4)) {
            y1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null) {
                sf2Var.f1(configuration);
                if (z) {
                    sf2Var.v.y(configuration, true);
                }
            }
        }
    }

    public gg2 y0() {
        return this.n;
    }

    public final void y1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new on3("FragmentManager"));
        eg2 eg2Var = this.v;
        if (eg2Var != null) {
            try {
                eg2Var.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            V("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public boolean z(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (sf2 sf2Var : this.c.o()) {
            if (sf2Var != null && sf2Var.g1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public sf2 z0() {
        return this.x;
    }

    public final void z1() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    this.h.j(p0() > 0 && O0(this.x));
                } else {
                    this.h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
