package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class gk1 implements Closeable, Flushable {
    public long c;
    public final File e;
    public final File f;
    public final File g;
    public long h;
    public z70 i;
    public final LinkedHashMap j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public final bd6 s;
    public final e t;
    public final tb2 u;
    public final File v;
    public final int w;
    public final int x;
    public static final a J = new a(null);
    public static final String y = "journal";
    public static final String z = "journal.tmp";
    public static final String A = "journal.bkp";
    public static final String B = "libcore.io.DiskLruCache";
    public static final String C = VContant.MAINSCREEN;
    public static final long D = -1;
    public static final Regex E = new Regex("[a-z0-9_-]{1,120}");
    public static final String F = "CLEAN";
    public static final String G = "DIRTY";
    public static final String H = "REMOVE";
    public static final String I = "READ";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b {
        public final boolean[] a;
        public boolean b;
        public final c c;
        public final /* synthetic */ gk1 d;

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                this.e = i;
            }

            public final void a(IOException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                synchronized (b.this.d) {
                    b.this.c();
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return Unit.INSTANCE;
            }
        }

        public b(gk1 gk1Var, c entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.d = gk1Var;
            this.c = entry;
            this.a = entry.g() ? null : new boolean[gk1Var.z0()];
        }

        public final void a() {
            synchronized (this.d) {
                try {
                    if (!(!this.b)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (Intrinsics.areEqual(this.c.b(), this)) {
                        this.d.U(this, false);
                    }
                    this.b = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    if (!(!this.b)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (Intrinsics.areEqual(this.c.b(), this)) {
                        this.d.U(this, true);
                    }
                    this.b = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (Intrinsics.areEqual(this.c.b(), this)) {
                if (this.d.m) {
                    this.d.U(this, false);
                } else {
                    this.c.q(true);
                }
            }
        }

        public final c d() {
            return this.c;
        }

        public final boolean[] e() {
            return this.a;
        }

        public final d36 f(int i) {
            synchronized (this.d) {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!Intrinsics.areEqual(this.c.b(), this)) {
                    return zf4.b();
                }
                if (!this.c.g()) {
                    boolean[] zArr = this.a;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i] = true;
                }
                try {
                    return new n82(this.d.y0().c((File) this.c.c().get(i)), new a(i));
                } catch (FileNotFoundException unused) {
                    return zf4.b();
                }
            }
        }
    }

    public final class c {
        public final long[] a;
        public final List b;
        public final List c;
        public boolean d;
        public boolean e;
        public b f;
        public int g;
        public long h;
        public final String i;
        public final /* synthetic */ gk1 j;

        public static final class a extends pf2 {
            public boolean c;
            public final /* synthetic */ y46 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y46 y46Var, y46 y46Var2) {
                super(y46Var2);
                this.f = y46Var;
            }

            @Override // com.zepto.pf2, com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.c) {
                    return;
                }
                this.c = true;
                synchronized (c.this.j) {
                    try {
                        c.this.n(r1.f() - 1);
                        if (c.this.f() == 0 && c.this.i()) {
                            c cVar = c.this;
                            cVar.j.I0(cVar);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(gk1 gk1Var, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.j = gk1Var;
            this.i = key;
            this.a = new long[gk1Var.z0()];
            this.b = new ArrayList();
            this.c = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int iZ0 = gk1Var.z0();
            for (int i = 0; i < iZ0; i++) {
                sb.append(i);
                this.b.add(new File(gk1Var.x0(), sb.toString()));
                sb.append(".tmp");
                this.c.add(new File(gk1Var.x0(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final List a() {
            return this.b;
        }

        public final b b() {
            return this.f;
        }

        public final List c() {
            return this.c;
        }

        public final String d() {
            return this.i;
        }

        public final long[] e() {
            return this.a;
        }

        public final int f() {
            return this.g;
        }

        public final boolean g() {
            return this.d;
        }

        public final long h() {
            return this.h;
        }

        public final boolean i() {
            return this.e;
        }

        public final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final y46 k(int i) {
            y46 y46VarB = this.j.y0().b((File) this.b.get(i));
            if (this.j.m) {
                return y46VarB;
            }
            this.g++;
            return new a(y46VarB, y46VarB);
        }

        public final void l(b bVar) {
            this.f = bVar;
        }

        public final void m(List strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.j.z0()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i = 0; i < size; i++) {
                    this.a[i] = Long.parseLong((String) strings.get(i));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i) {
            this.g = i;
        }

        public final void o(boolean z) {
            this.d = z;
        }

        public final void p(long j) {
            this.h = j;
        }

        public final void q(boolean z) {
            this.e = z;
        }

        public final d r() {
            gk1 gk1Var = this.j;
            if (et6.h && !Thread.holdsLock(gk1Var)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(gk1Var);
                throw new AssertionError(sb.toString());
            }
            if (!this.d) {
                return null;
            }
            if (!this.j.m && (this.f != null || this.e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.a.clone();
            try {
                int iZ0 = this.j.z0();
                for (int i = 0; i < iZ0; i++) {
                    arrayList.add(k(i));
                }
                return new d(this.j, this.i, this.h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    et6.j((y46) it.next());
                }
                try {
                    this.j.I0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(z70 writer) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j : this.a) {
                writer.J(32).n0(j);
            }
        }
    }

    public final class d implements Closeable {
        public final String c;
        public final long e;
        public final List f;
        public final long[] g;
        public final /* synthetic */ gk1 h;

        public d(gk1 gk1Var, String key, long j, List sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.h = gk1Var;
            this.c = key;
            this.e = j;
            this.f = sources;
            this.g = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                et6.j((y46) it.next());
            }
        }

        public final b d() {
            return this.h.e0(this.c, this.e);
        }

        public final y46 e(int i) {
            return (y46) this.f.get(i);
        }
    }

    public static final class e extends oc6 {
        public e(String str) {
            super(str, false, 2, null);
        }

        @Override // com.zepto.oc6
        public long f() {
            synchronized (gk1.this) {
                if (!gk1.this.n || gk1.this.p0()) {
                    return -1L;
                }
                try {
                    gk1.this.K0();
                } catch (IOException unused) {
                    gk1.this.p = true;
                }
                try {
                    if (gk1.this.B0()) {
                        gk1.this.G0();
                        gk1.this.k = 0;
                    }
                } catch (IOException unused2) {
                    gk1.this.q = true;
                    gk1.this.i = zf4.c(zf4.b());
                }
                return -1L;
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(IOException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            gk1 gk1Var = gk1.this;
            if (!et6.h || Thread.holdsLock(gk1Var)) {
                gk1.this.l = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(gk1Var);
            throw new AssertionError(sb.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return Unit.INSTANCE;
        }
    }

    public gk1(tb2 fileSystem, File directory, int i, int i2, long j, cd6 taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.u = fileSystem;
        this.v = directory;
        this.w = i;
        this.x = i2;
        this.c = j;
        this.j = new LinkedHashMap(0, 0.75f, true);
        this.s = taskRunner.i();
        this.t = new e(et6.i + " Cache");
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.e = new File(directory, y);
        this.f = new File(directory, z);
        this.g = new File(directory, A);
    }

    public static /* synthetic */ b k0(gk1 gk1Var, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = D;
        }
        return gk1Var.e0(str, j);
    }

    public final synchronized void A0() {
        try {
            if (et6.h && !Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
            if (this.n) {
                return;
            }
            if (this.u.f(this.g)) {
                if (this.u.f(this.e)) {
                    this.u.a(this.g);
                } else {
                    this.u.g(this.g, this.e);
                }
            }
            this.m = et6.C(this.u, this.g);
            if (this.u.f(this.e)) {
                try {
                    E0();
                    D0();
                    this.n = true;
                    return;
                } catch (IOException e2) {
                    is4.c.g().k("DiskLruCache " + this.v + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                    try {
                        d0();
                        this.o = false;
                        G0();
                        this.n = true;
                    } catch (Throwable th) {
                        this.o = false;
                        throw th;
                    }
                }
            }
            G0();
            this.n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean B0() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final z70 C0() {
        return zf4.c(new n82(this.u.e(this.e), new f()));
    }

    public final void D0() {
        this.u.a(this.f);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            c cVar = (c) next;
            int i = 0;
            if (cVar.b() == null) {
                int i2 = this.x;
                while (i < i2) {
                    this.h += cVar.e()[i];
                    i++;
                }
            } else {
                cVar.l(null);
                int i3 = this.x;
                while (i < i3) {
                    this.u.a((File) cVar.a().get(i));
                    this.u.a((File) cVar.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void E0() {
        a80 a80VarD = zf4.d(this.u.b(this.e));
        try {
            String strE = a80VarD.E();
            String strE2 = a80VarD.E();
            String strE3 = a80VarD.E();
            String strE4 = a80VarD.E();
            String strE5 = a80VarD.E();
            if ((!Intrinsics.areEqual(B, strE)) || (!Intrinsics.areEqual(C, strE2)) || (!Intrinsics.areEqual(String.valueOf(this.w), strE3)) || (!Intrinsics.areEqual(String.valueOf(this.x), strE4)) || strE5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strE + ", " + strE2 + ", " + strE4 + ", " + strE5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    F0(a80VarD.E());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (a80VarD.I()) {
                        this.i = C0();
                    } else {
                        G0();
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(a80VarD, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void F0(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = H;
            if (iIndexOf$default == str2.length() && StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null)) {
                this.j.remove(strSubstring);
                return;
            }
        } else {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c cVar = (c) this.j.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.j.put(strSubstring, cVar);
        }
        if (iIndexOf$default2 != -1) {
            String str3 = F;
            if (iIndexOf$default == str3.length() && StringsKt__StringsJVMKt.startsWith$default(str, str3, false, 2, null)) {
                int i2 = iIndexOf$default2 + 1;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring2 = str.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str4 = G;
            if (iIndexOf$default == str4.length() && StringsKt__StringsJVMKt.startsWith$default(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = I;
            if (iIndexOf$default == str5.length() && StringsKt__StringsJVMKt.startsWith$default(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void G0() {
        try {
            z70 z70Var = this.i;
            if (z70Var != null) {
                z70Var.close();
            }
            z70 z70VarC = zf4.c(this.u.c(this.f));
            try {
                z70VarC.l0(B).J(10);
                z70VarC.l0(C).J(10);
                z70VarC.n0(this.w).J(10);
                z70VarC.n0(this.x).J(10);
                z70VarC.J(10);
                for (c cVar : this.j.values()) {
                    if (cVar.b() != null) {
                        z70VarC.l0(G).J(32);
                        z70VarC.l0(cVar.d());
                        z70VarC.J(10);
                    } else {
                        z70VarC.l0(F).J(32);
                        z70VarC.l0(cVar.d());
                        cVar.s(z70VarC);
                        z70VarC.J(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(z70VarC, null);
                if (this.u.f(this.e)) {
                    this.u.g(this.e, this.g);
                }
                this.u.g(this.f, this.e);
                this.u.a(this.g);
                this.i = C0();
                this.l = false;
                this.q = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean H0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        A0();
        P();
        L0(key);
        c cVar = (c) this.j.get(key);
        if (cVar == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(cVar, "lruEntries[key] ?: return false");
        boolean zI0 = I0(cVar);
        if (zI0 && this.h <= this.c) {
            this.p = false;
        }
        return zI0;
    }

    public final boolean I0(c entry) {
        z70 z70Var;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.m) {
            if (entry.f() > 0 && (z70Var = this.i) != null) {
                z70Var.l0(G);
                z70Var.J(32);
                z70Var.l0(entry.d());
                z70Var.J(10);
                z70Var.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i = this.x;
        for (int i2 = 0; i2 < i; i2++) {
            this.u.a((File) entry.a().get(i2));
            this.h -= entry.e()[i2];
            entry.e()[i2] = 0;
        }
        this.k++;
        z70 z70Var2 = this.i;
        if (z70Var2 != null) {
            z70Var2.l0(H);
            z70Var2.J(32);
            z70Var2.l0(entry.d());
            z70Var2.J(10);
        }
        this.j.remove(entry.d());
        if (B0()) {
            bd6.j(this.s, this.t, 0L, 2, null);
        }
        return true;
    }

    public final boolean J0() {
        for (c toEvict : this.j.values()) {
            if (!toEvict.i()) {
                Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                I0(toEvict);
                return true;
            }
        }
        return false;
    }

    public final void K0() {
        while (this.h > this.c) {
            if (!J0()) {
                return;
            }
        }
        this.p = false;
    }

    public final void L0(String str) {
        if (E.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    public final synchronized void P() {
        if (!(!this.o)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void U(b editor, boolean z2) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        c cVarD = editor.d();
        if (!Intrinsics.areEqual(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z2 && !cVarD.g()) {
            int i = this.x;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArrE = editor.e();
                Intrinsics.checkNotNull(zArrE);
                if (!zArrE[i2]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.u.f((File) cVarD.c().get(i2))) {
                    editor.a();
                    return;
                }
            }
        }
        int i3 = this.x;
        for (int i4 = 0; i4 < i3; i4++) {
            File file = (File) cVarD.c().get(i4);
            if (!z2 || cVarD.i()) {
                this.u.a(file);
            } else if (this.u.f(file)) {
                File file2 = (File) cVarD.a().get(i4);
                this.u.g(file, file2);
                long j = cVarD.e()[i4];
                long jH = this.u.h(file2);
                cVarD.e()[i4] = jH;
                this.h = (this.h - j) + jH;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            I0(cVarD);
            return;
        }
        this.k++;
        z70 z70Var = this.i;
        Intrinsics.checkNotNull(z70Var);
        if (cVarD.g() || z2) {
            cVarD.o(true);
            z70Var.l0(F).J(32);
            z70Var.l0(cVarD.d());
            cVarD.s(z70Var);
            z70Var.J(10);
            if (z2) {
                long j2 = this.r;
                this.r = 1 + j2;
                cVarD.p(j2);
            }
        } else {
            this.j.remove(cVarD.d());
            z70Var.l0(H).J(32);
            z70Var.l0(cVarD.d());
            z70Var.J(10);
        }
        z70Var.flush();
        if (this.h > this.c || B0()) {
            bd6.j(this.s, this.t, 0L, 2, null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.n && !this.o) {
                Collection collectionValues = this.j.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                Object[] array = collectionValues.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (c cVar : (c[]) array) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                K0();
                z70 z70Var = this.i;
                Intrinsics.checkNotNull(z70Var);
                z70Var.close();
                this.i = null;
                this.o = true;
                return;
            }
            this.o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d0() {
        close();
        this.u.d(this.v);
    }

    public final synchronized b e0(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        A0();
        P();
        L0(key);
        c cVar = (c) this.j.get(key);
        if (j != D && (cVar == null || cVar.h() != j)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.p && !this.q) {
            z70 z70Var = this.i;
            Intrinsics.checkNotNull(z70Var);
            z70Var.l0(G).J(32).l0(key).J(10);
            z70Var.flush();
            if (this.l) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.j.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        bd6.j(this.s, this.t, 0L, 2, null);
        return null;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.n) {
            P();
            K0();
            z70 z70Var = this.i;
            Intrinsics.checkNotNull(z70Var);
            z70Var.flush();
        }
    }

    public final synchronized d m0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        A0();
        P();
        L0(key);
        c cVar = (c) this.j.get(key);
        if (cVar == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(cVar, "lruEntries[key] ?: return null");
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.k++;
        z70 z70Var = this.i;
        Intrinsics.checkNotNull(z70Var);
        z70Var.l0(I).J(32).l0(key).J(10);
        if (B0()) {
            bd6.j(this.s, this.t, 0L, 2, null);
        }
        return dVarR;
    }

    public final boolean p0() {
        return this.o;
    }

    public final File x0() {
        return this.v;
    }

    public final tb2 y0() {
        return this.u;
    }

    public final int z0() {
        return this.x;
    }
}
