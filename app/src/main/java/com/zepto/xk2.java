package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xk2 extends fa3 {
    public final int e;
    public final boolean f;
    public List g;
    public List h;
    public final long i;
    public long j;
    public yk2 k;

    public xk2(int i, List list, List list2, long j, long j2, boolean z) {
        super(true);
        this.j = 0L;
        this.e = i;
        this.g = Collections.unmodifiableList(list);
        this.h = Collections.unmodifiableList(list2);
        this.j = j;
        this.i = j2;
        this.f = z;
    }

    public static xk2 a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof xk2) {
            return (xk2) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i = dataInputStream2.readInt();
            long j = dataInputStream2.readLong();
            long j2 = dataInputStream2.readLong();
            boolean z = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(ga3.e(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(ia3.a(obj));
            }
            return new xk2(i, arrayList, arrayList2, j, j2, z);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(x76.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
        }
        try {
            xk2 xk2VarA = a(dataInputStream);
            dataInputStream.close();
            return xk2VarA;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    public static xk2 b(byte[] bArr, byte[] bArr2) throws Throwable {
        xk2 xk2VarA = a(bArr);
        xk2VarA.k = yk2.a(bArr2);
        return xk2VarA;
    }

    public static xk2 f(xk2 xk2Var) {
        try {
            return a(xk2Var.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public int c() {
        return this.e;
    }

    public Object clone() {
        return f(this);
    }

    public synchronized yk2 d() {
        return new yk2(this.e, e().i());
    }

    public ga3 e() {
        return (ga3) this.g.get(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xk2 xk2Var = (xk2) obj;
        if (this.e == xk2Var.e && this.f == xk2Var.f && this.i == xk2Var.i && this.j == xk2Var.j && this.g.equals(xk2Var.g)) {
            return this.h.equals(xk2Var.h);
        }
        return false;
    }

    @Override // com.zepto.fa3, com.zepto.u12
    public synchronized byte[] getEncoded() {
        vu0 vu0VarA;
        try {
            vu0VarA = vu0.f().i(0).i(this.e).j(this.j).j(this.i).a(this.f);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                vu0VarA.c((ga3) it.next());
            }
            Iterator it2 = this.h.iterator();
            while (it2.hasNext()) {
                vu0VarA.c((ia3) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return vu0VarA.b();
    }

    public int hashCode() {
        int iHashCode = ((((((this.e * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        long j = this.i;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
