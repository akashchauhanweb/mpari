package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zepto.d05;
import com.zepto.dx3;
import com.zepto.le1;
import com.zepto.u15;
import com.zepto.yy1;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.IntCompanionObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final int[] f = {0, 4, 8};
    public static SparseIntArray g = new SparseIntArray();
    public static SparseIntArray h = new SparseIntArray();
    public String a = "";
    public int b = 0;
    public HashMap c = new HashMap();
    public boolean d = true;
    public HashMap e = new HashMap();

    public static class a {
        public int a;
        public String b;
        public final C0008d c = new C0008d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap g = new HashMap();
        public C0007a h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C0007a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.o = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            bVar.v = bVar2.x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.x = bVar2.P;
            bVar.z = bVar2.R;
            bVar.G = bVar2.y;
            bVar.H = bVar2.z;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.a0 = bVar2.n0;
            bVar.b0 = bVar2.o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.U = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.S = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.W = bVar2.g0;
            bVar.Z = bVar2.G;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.m0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar2.q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void d(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.o;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.v;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.n0 = bVar.a0;
            bVar2.o0 = bVar.b0;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.Q;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.U;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.S;
            bVar2.f0 = bVar.V;
            bVar2.g0 = bVar.W;
            bVar2.m0 = bVar.c0;
            bVar2.P = bVar.x;
            bVar2.R = bVar.z;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.q0 = bVar.d0;
            bVar2.L = bVar.getMarginEnd();
            this.e.M = bVar.getMarginStart();
        }
    }

    public static class b {
        public static SparseIntArray r0;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = IntCompanionObject.MIN_VALUE;
        public int P = IntCompanionObject.MIN_VALUE;
        public int Q = IntCompanionObject.MIN_VALUE;
        public int R = IntCompanionObject.MIN_VALUE;
        public int S = IntCompanionObject.MIN_VALUE;
        public int T = IntCompanionObject.MIN_VALUE;
        public int U = IntCompanionObject.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(u15.X5, 24);
            r0.append(u15.Y5, 25);
            r0.append(u15.a6, 28);
            r0.append(u15.b6, 29);
            r0.append(u15.g6, 35);
            r0.append(u15.f6, 34);
            r0.append(u15.H5, 4);
            r0.append(u15.G5, 3);
            r0.append(u15.E5, 1);
            r0.append(u15.m6, 6);
            r0.append(u15.n6, 7);
            r0.append(u15.O5, 17);
            r0.append(u15.P5, 18);
            r0.append(u15.Q5, 19);
            r0.append(u15.A5, 90);
            r0.append(u15.m5, 26);
            r0.append(u15.c6, 31);
            r0.append(u15.d6, 32);
            r0.append(u15.N5, 10);
            r0.append(u15.M5, 9);
            r0.append(u15.q6, 13);
            r0.append(u15.t6, 16);
            r0.append(u15.r6, 14);
            r0.append(u15.o6, 11);
            r0.append(u15.s6, 15);
            r0.append(u15.p6, 12);
            r0.append(u15.j6, 38);
            r0.append(u15.V5, 37);
            r0.append(u15.U5, 39);
            r0.append(u15.i6, 40);
            r0.append(u15.T5, 20);
            r0.append(u15.h6, 36);
            r0.append(u15.L5, 5);
            r0.append(u15.W5, 91);
            r0.append(u15.e6, 91);
            r0.append(u15.Z5, 91);
            r0.append(u15.F5, 91);
            r0.append(u15.D5, 91);
            r0.append(u15.p5, 23);
            r0.append(u15.r5, 27);
            r0.append(u15.t5, 30);
            r0.append(u15.u5, 8);
            r0.append(u15.q5, 33);
            r0.append(u15.s5, 2);
            r0.append(u15.n5, 22);
            r0.append(u15.o5, 21);
            r0.append(u15.k6, 41);
            r0.append(u15.R5, 42);
            r0.append(u15.C5, 41);
            r0.append(u15.B5, 42);
            r0.append(u15.u6, 76);
            r0.append(u15.I5, 61);
            r0.append(u15.K5, 62);
            r0.append(u15.J5, 63);
            r0.append(u15.l6, 69);
            r0.append(u15.S5, 70);
            r0.append(u15.y5, 71);
            r0.append(u15.w5, 72);
            r0.append(u15.x5, 73);
            r0.append(u15.z5, 74);
            r0.append(u15.v5, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u15.l5);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.r = d.m(typedArrayObtainStyledAttributes, index, this.r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = d.m(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = d.m(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.x = d.m(typedArrayObtainStyledAttributes, index, this.x);
                        break;
                    case 10:
                        this.w = d.m(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = d.m(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.k = d.m(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = d.m(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 29:
                        this.m = d.m(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = d.m(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = d.m(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.o = d.m(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 35:
                        this.n = d.m(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.n(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.n(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.B = d.m(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.h0 = typedArrayObtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case 73:
                                        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case 74:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case Base64.mimeLineLength /* 76 */:
                                        this.q0 = typedArrayObtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case 77:
                                        this.s = d.m(typedArrayObtainStyledAttributes, index, this.s);
                                        break;
                                    case 78:
                                        this.t = d.m(typedArrayObtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case 83:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 84:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 85:
                                        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 87:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 88:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 89:
                                        this.m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.i = typedArrayObtainStyledAttributes.getBoolean(index, this.i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(u15.G6, 1);
            o.append(u15.I6, 2);
            o.append(u15.M6, 3);
            o.append(u15.F6, 4);
            o.append(u15.E6, 5);
            o.append(u15.D6, 6);
            o.append(u15.H6, 7);
            o.append(u15.L6, 8);
            o.append(u15.K6, 9);
            o.append(u15.J6, 10);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u15.C6);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.d = yy1.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = d.m(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = typedArrayObtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                            } else {
                                this.m = -1;
                            }
                        } else {
                            this.m = typedArrayObtainStyledAttributes.getInteger(index, this.n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0008d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(C0008d c0008d) {
            this.a = c0008d.a;
            this.b = c0008d.b;
            this.d = c0008d.d;
            this.e = c0008d.e;
            this.c = c0008d.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u15.X6);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u15.Z6) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == u15.Y6) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = d.f[this.b];
                } else if (index == u15.b7) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == u15.a7) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(u15.w7, 1);
            o.append(u15.x7, 2);
            o.append(u15.y7, 3);
            o.append(u15.u7, 4);
            o.append(u15.v7, 5);
            o.append(u15.q7, 6);
            o.append(u15.r7, 7);
            o.append(u15.s7, 8);
            o.append(u15.t7, 9);
            o.append(u15.z7, 10);
            o.append(u15.A7, 11);
            o.append(u15.B7, 12);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u15.p7);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = d.m(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        g.append(u15.A0, 25);
        g.append(u15.B0, 26);
        g.append(u15.D0, 29);
        g.append(u15.E0, 30);
        g.append(u15.K0, 36);
        g.append(u15.J0, 35);
        g.append(u15.h0, 4);
        g.append(u15.g0, 3);
        g.append(u15.c0, 1);
        g.append(u15.e0, 91);
        g.append(u15.d0, 92);
        g.append(u15.T0, 6);
        g.append(u15.U0, 7);
        g.append(u15.o0, 17);
        g.append(u15.p0, 18);
        g.append(u15.q0, 19);
        g.append(u15.Y, 99);
        g.append(u15.u, 27);
        g.append(u15.F0, 32);
        g.append(u15.G0, 33);
        g.append(u15.n0, 10);
        g.append(u15.m0, 9);
        g.append(u15.X0, 13);
        g.append(u15.a1, 16);
        g.append(u15.Y0, 14);
        g.append(u15.V0, 11);
        g.append(u15.Z0, 15);
        g.append(u15.W0, 12);
        g.append(u15.N0, 40);
        g.append(u15.y0, 39);
        g.append(u15.x0, 41);
        g.append(u15.M0, 42);
        g.append(u15.w0, 20);
        g.append(u15.L0, 37);
        g.append(u15.l0, 5);
        g.append(u15.z0, 87);
        g.append(u15.I0, 87);
        g.append(u15.C0, 87);
        g.append(u15.f0, 87);
        g.append(u15.b0, 87);
        g.append(u15.z, 24);
        g.append(u15.B, 28);
        g.append(u15.N, 31);
        g.append(u15.O, 8);
        g.append(u15.A, 34);
        g.append(u15.C, 2);
        g.append(u15.x, 23);
        g.append(u15.y, 21);
        g.append(u15.O0, 95);
        g.append(u15.r0, 96);
        g.append(u15.w, 22);
        g.append(u15.D, 43);
        g.append(u15.Q, 44);
        g.append(u15.L, 45);
        g.append(u15.M, 46);
        g.append(u15.K, 60);
        g.append(u15.I, 47);
        g.append(u15.J, 48);
        g.append(u15.E, 49);
        g.append(u15.F, 50);
        g.append(u15.G, 51);
        g.append(u15.H, 52);
        g.append(u15.P, 53);
        g.append(u15.P0, 54);
        g.append(u15.s0, 55);
        g.append(u15.Q0, 56);
        g.append(u15.t0, 57);
        g.append(u15.R0, 58);
        g.append(u15.u0, 59);
        g.append(u15.i0, 61);
        g.append(u15.k0, 62);
        g.append(u15.j0, 63);
        g.append(u15.R, 64);
        g.append(u15.k1, 65);
        g.append(u15.X, 66);
        g.append(u15.l1, 67);
        g.append(u15.d1, 79);
        g.append(u15.v, 38);
        g.append(u15.c1, 68);
        g.append(u15.S0, 69);
        g.append(u15.v0, 70);
        g.append(u15.b1, 97);
        g.append(u15.V, 71);
        g.append(u15.T, 72);
        g.append(u15.U, 73);
        g.append(u15.W, 74);
        g.append(u15.S, 75);
        g.append(u15.e1, 76);
        g.append(u15.H0, 77);
        g.append(u15.m1, 78);
        g.append(u15.a0, 80);
        g.append(u15.Z, 81);
        g.append(u15.f1, 82);
        g.append(u15.j1, 83);
        g.append(u15.i1, 84);
        g.append(u15.h1, 85);
        g.append(u15.g1, 86);
        SparseIntArray sparseIntArray = h;
        int i = u15.q4;
        sparseIntArray.append(i, 6);
        h.append(i, 7);
        h.append(u15.l3, 27);
        h.append(u15.t4, 13);
        h.append(u15.w4, 16);
        h.append(u15.u4, 14);
        h.append(u15.r4, 11);
        h.append(u15.v4, 15);
        h.append(u15.s4, 12);
        h.append(u15.k4, 40);
        h.append(u15.d4, 39);
        h.append(u15.c4, 41);
        h.append(u15.j4, 42);
        h.append(u15.b4, 20);
        h.append(u15.i4, 37);
        h.append(u15.V3, 5);
        h.append(u15.e4, 87);
        h.append(u15.h4, 87);
        h.append(u15.f4, 87);
        h.append(u15.S3, 87);
        h.append(u15.R3, 87);
        h.append(u15.q3, 24);
        h.append(u15.s3, 28);
        h.append(u15.E3, 31);
        h.append(u15.F3, 8);
        h.append(u15.r3, 34);
        h.append(u15.t3, 2);
        h.append(u15.o3, 23);
        h.append(u15.p3, 21);
        h.append(u15.l4, 95);
        h.append(u15.W3, 96);
        h.append(u15.n3, 22);
        h.append(u15.u3, 43);
        h.append(u15.H3, 44);
        h.append(u15.C3, 45);
        h.append(u15.D3, 46);
        h.append(u15.B3, 60);
        h.append(u15.z3, 47);
        h.append(u15.A3, 48);
        h.append(u15.v3, 49);
        h.append(u15.w3, 50);
        h.append(u15.x3, 51);
        h.append(u15.y3, 52);
        h.append(u15.G3, 53);
        h.append(u15.m4, 54);
        h.append(u15.X3, 55);
        h.append(u15.n4, 56);
        h.append(u15.Y3, 57);
        h.append(u15.o4, 58);
        h.append(u15.Z3, 59);
        h.append(u15.U3, 62);
        h.append(u15.T3, 63);
        h.append(u15.I3, 64);
        h.append(u15.H4, 65);
        h.append(u15.O3, 66);
        h.append(u15.I4, 67);
        h.append(u15.z4, 79);
        h.append(u15.m3, 38);
        h.append(u15.A4, 98);
        h.append(u15.y4, 68);
        h.append(u15.p4, 69);
        h.append(u15.a4, 70);
        h.append(u15.M3, 71);
        h.append(u15.K3, 72);
        h.append(u15.L3, 73);
        h.append(u15.N3, 74);
        h.append(u15.J3, 75);
        h.append(u15.B4, 76);
        h.append(u15.g4, 77);
        h.append(u15.J4, 78);
        h.append(u15.Q3, 80);
        h.append(u15.P3, 81);
        h.append(u15.C4, 82);
        h.append(u15.G4, 83);
        h.append(u15.F4, 84);
        h.append(u15.E4, 85);
        h.append(u15.D4, 86);
        h.append(u15.x4, 97);
    }

    public static int m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.a0 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.b0 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L4e
            r4.d = r2
            r4.n0 = r5
            goto L70
        L4e:
            r4.e = r2
            r4.o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.C0007a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.C0007a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            o(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void o(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    p(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0007a) {
                        ((a.C0007a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f2;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i == 0) {
                            bVar3.d = 0;
                            bVar3.W = f2;
                        } else {
                            bVar3.e = 0;
                            bVar3.V = f2;
                        }
                    } else if (obj instanceof a.C0007a) {
                        a.C0007a c0007a = (a.C0007a) obj;
                        if (i == 0) {
                            c0007a.b(23, 0);
                            c0007a.a(39, f2);
                        } else {
                            c0007a.b(21, 0);
                            c0007a.a(40, f2);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i == 0) {
                            bVar5.d = 0;
                            bVar5.f0 = fMax;
                            bVar5.Z = 2;
                        } else {
                            bVar5.e = 0;
                            bVar5.g0 = fMax;
                            bVar5.a0 = 2;
                        }
                    } else if (obj instanceof a.C0007a) {
                        a.C0007a c0007a2 = (a.C0007a) obj;
                        if (i == 0) {
                            c0007a2.b(23, 0);
                            c0007a2.b(54, 2);
                        } else {
                            c0007a2.b(21, 0);
                            c0007a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void p(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            fAbs = i == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i;
    }

    public static void r(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0007a c0007a = new a.C0007a();
        aVar.h = c0007a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (h.get(index)) {
                case 2:
                    c0007a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 5:
                    c0007a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0007a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 7:
                    c0007a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.F));
                    break;
                case 8:
                    c0007a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 11:
                    c0007a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 12:
                    c0007a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 13:
                    c0007a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 14:
                    c0007a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 15:
                    c0007a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 16:
                    c0007a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 17:
                    c0007a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    c0007a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    c0007a.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    c0007a.a(20, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 21:
                    c0007a.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    c0007a.b(22, f[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0007a.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    c0007a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 27:
                    c0007a.b(27, typedArray.getInt(index, aVar.e.G));
                    break;
                case 28:
                    c0007a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 31:
                    c0007a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 34:
                    c0007a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 37:
                    c0007a.a(37, typedArray.getFloat(index, aVar.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0007a.b(38, resourceId);
                    break;
                case 39:
                    c0007a.a(39, typedArray.getFloat(index, aVar.e.W));
                    break;
                case 40:
                    c0007a.a(40, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 41:
                    c0007a.b(41, typedArray.getInt(index, aVar.e.X));
                    break;
                case 42:
                    c0007a.b(42, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 43:
                    c0007a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    c0007a.d(44, true);
                    c0007a.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    c0007a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    c0007a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    c0007a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    c0007a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    c0007a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    c0007a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    c0007a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0007a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    c0007a.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    c0007a.b(54, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 55:
                    c0007a.b(55, typedArray.getInt(index, aVar.e.a0));
                    break;
                case 56:
                    c0007a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 57:
                    c0007a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 58:
                    c0007a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 59:
                    c0007a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.e0));
                    break;
                case 60:
                    c0007a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0007a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.C));
                    break;
                case 63:
                    c0007a.a(63, typedArray.getFloat(index, aVar.e.D));
                    break;
                case 64:
                    c0007a.b(64, m(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0007a.c(65, typedArray.getString(index));
                    } else {
                        c0007a.c(65, yy1.c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0007a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0007a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0007a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0007a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0007a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0007a.b(72, typedArray.getInt(index, aVar.e.h0));
                    break;
                case 73:
                    c0007a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.i0));
                    break;
                case 74:
                    c0007a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0007a.d(75, typedArray.getBoolean(index, aVar.e.p0));
                    break;
                case Base64.mimeLineLength /* 76 */:
                    c0007a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    c0007a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0007a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0007a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0007a.d(80, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 81:
                    c0007a.d(81, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 82:
                    c0007a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0007a.b(83, m(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0007a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0007a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0007a.b(89, aVar.d.n);
                        c cVar = aVar.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            c0007a.b(88, -2);
                        }
                    } else if (i2 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0007a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0007a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0007a.b(88, -2);
                        } else {
                            aVar.d.m = -1;
                            c0007a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        c0007a.b(88, aVar.d.m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 93:
                    c0007a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 94:
                    c0007a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.U));
                    break;
                case 95:
                    n(c0007a, typedArray, index, 0);
                    break;
                case 96:
                    n(c0007a, typedArray, index, 1);
                    break;
                case 97:
                    c0007a.b(97, typedArray.getInt(index, aVar.e.q0));
                    break;
                case 98:
                    if (dx3.y) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                    }
                    break;
                case 99:
                    c0007a.d(99, typedArray.getBoolean(index, aVar.e.i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + le1.a(childAt));
            } else {
                if (this.d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.e.j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.e.h0);
                                aVar2.setMargin(aVar.e.i0);
                                aVar2.setAllowsGoneWidget(aVar.e.p0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = h(aVar2, str);
                                        aVar2.setReferencedIds(aVar.e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z) {
                                androidx.constraintlayout.widget.b.c(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0008d c0008d = aVar.c;
                            if (c0008d.c == 0) {
                                childAt.setVisibility(c0008d.b);
                            }
                            childAt.setAlpha(aVar.c.d);
                            childAt.setRotation(aVar.f.b);
                            childAt.setRotationX(aVar.f.c);
                            childAt.setRotationY(aVar.f.d);
                            childAt.setScaleX(aVar.f.e);
                            childAt.setScaleY(aVar.f.f);
                            e eVar = aVar.f;
                            if (eVar.i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f.i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(aVar.f.g);
                                }
                                if (!Float.isNaN(aVar.f.h)) {
                                    childAt.setPivotY(aVar.f.h);
                                }
                            }
                            childAt.setTranslationX(aVar.f.j);
                            childAt.setTranslationY(aVar.f.k);
                            childAt.setTranslationZ(aVar.f.l);
                            e eVar2 = aVar.f;
                            if (eVar2.m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = (a) this.e.get(num);
            if (aVar3 != null) {
                if (aVar3.e.j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.e;
                    int[] iArr2 = bVar3.k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.l0;
                        if (str2 != null) {
                            bVar3.k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.e.k0);
                        }
                    }
                    aVar4.setType(aVar3.e.h0);
                    aVar4.setMargin(aVar3.e.i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.o();
                    aVar3.b(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, bVarGenerateDefaultLayoutParams);
                }
                if (aVar3.e.a) {
                    View eVar3 = new androidx.constraintlayout.widget.e(constraintLayout.getContext());
                    eVar3.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(eVar3, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.e.containsKey(Integer.valueOf(id))) {
                this.e.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = androidx.constraintlayout.widget.b.a(this.c, childAt);
                aVar.d(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                e eVar2 = aVar.f;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.e.p0 = aVar2.getAllowsGoneWidget();
                    aVar.e.k0 = aVar2.getReferencedIds();
                    aVar.e.h0 = aVar2.getType();
                    aVar.e.i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(int i, int i2, int i3, float f2) {
        b bVar = j(i).e;
        bVar.B = i2;
        bVar.C = i3;
        bVar.D = f2;
    }

    public final int[] h(View view, String str) {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = d05.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public final a i(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? u15.k3 : u15.t);
        q(context, aVar, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a j(int i) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            this.e.put(Integer.valueOf(i), new a());
        }
        return (a) this.e.get(Integer.valueOf(i));
    }

    public void k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.e.a = true;
                    }
                    this.e.put(Integer.valueOf(aVarI.a), aVarI);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void q(Context context, a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            r(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != u15.v && u15.N != index && u15.O != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (g.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.r = m(typedArray, index, bVar.r);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.q = m(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = m(typedArray, index, bVar4.p);
                    break;
                case 5:
                    aVar.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.x = m(typedArray, index, bVar8.x);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.w = m(typedArray, index, bVar9.w);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    C0008d c0008d = aVar.c;
                    c0008d.b = typedArray.getInt(index, c0008d.b);
                    C0008d c0008d2 = aVar.c;
                    c0008d2.b = f[c0008d2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.e;
                    bVar23.j = m(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = aVar.e;
                    bVar24.k = m(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.e;
                    bVar27.l = m(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.m = m(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.u = m(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.v = m(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.o = m(typedArray, index, bVar33.o);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.n = m(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    C0008d c0008d3 = aVar.c;
                    c0008d3.d = typedArray.getFloat(index, c0008d3.d);
                    break;
                case 44:
                    e eVar = aVar.f;
                    eVar.m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = aVar.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = aVar.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case 53:
                    e eVar10 = aVar.f;
                    eVar10.l = typedArray.getDimension(index, eVar10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case 60:
                    e eVar11 = aVar.f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.B = m(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.d;
                    cVar.b = m(typedArray, index, cVar.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                    } else {
                        aVar.d.d = yy1.c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    C0008d c0008d4 = aVar.c;
                    c0008d4.e = typedArray.getFloat(index, c0008d4.e);
                    break;
                case 69:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case Base64.mimeLineLength /* 76 */:
                    c cVar3 = aVar.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    aVar.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0008d c0008d5 = aVar.c;
                    c0008d5.c = typedArray.getInt(index, c0008d5.c);
                    break;
                case 79:
                    c cVar4 = aVar.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    c cVar5 = aVar.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    e eVar12 = aVar.f;
                    eVar12.i = m(typedArray, index, eVar12.i);
                    break;
                case 84:
                    c cVar6 = aVar.d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    c cVar7 = aVar.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                        }
                    } else if (i2 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                        } else {
                            aVar.d.m = -1;
                        }
                    } else {
                        c cVar9 = aVar.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.s = m(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.t = m(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    n(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    n(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }
}
