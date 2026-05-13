package com.zepto;

import com.zepto.cx4;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gx4 implements xe4 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final fb2 g = fb2.a("key").b(iy.b().c(1).a()).a();
    public static final fb2 h = fb2.a("value").b(iy.b().c(2).a()).a();
    public static final we4 i = new we4() { // from class: com.zepto.fx4
        @Override // com.zepto.we4
        public final void a(Object obj, Object obj2) {
            gx4.t((Map.Entry) obj, (xe4) obj2);
        }
    };
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final we4 d;
    public final jx4 e = new jx4(this);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cx4.a.values().length];
            a = iArr;
            try {
                iArr[cx4.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cx4.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cx4.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public gx4(OutputStream outputStream, Map map, Map map2, we4 we4Var) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = we4Var;
    }

    public static ByteBuffer m(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static cx4 r(fb2 fb2Var) {
        cx4 cx4Var = (cx4) fb2Var.c(cx4.class);
        if (cx4Var != null) {
            return cx4Var;
        }
        throw new e22("Field has no @Protobuf config");
    }

    public static int s(fb2 fb2Var) {
        cx4 cx4Var = (cx4) fb2Var.c(cx4.class);
        if (cx4Var != null) {
            return cx4Var.tag();
        }
        throw new e22("Field has no @Protobuf config");
    }

    public static /* synthetic */ void t(Map.Entry entry, xe4 xe4Var) {
        xe4Var.a(g, entry.getKey());
        xe4Var.a(h, entry.getValue());
    }

    @Override // com.zepto.xe4
    public xe4 a(fb2 fb2Var, Object obj) {
        return g(fb2Var, obj, true);
    }

    public xe4 e(fb2 fb2Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        u((s(fb2Var) << 3) | 1);
        this.a.write(m(8).putDouble(d).array());
        return this;
    }

    public xe4 f(fb2 fb2Var, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        u((s(fb2Var) << 3) | 5);
        this.a.write(m(4).putFloat(f2).array());
        return this;
    }

    public xe4 g(fb2 fb2Var, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            u((s(fb2Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            u(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(fb2Var, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                o(i, fb2Var, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return e(fb2Var, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return f(fb2Var, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return k(fb2Var, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return l(fb2Var, ((Boolean) obj).booleanValue(), z);
        }
        if (!(obj instanceof byte[])) {
            we4 we4Var = (we4) this.b.get(obj.getClass());
            if (we4Var != null) {
                return o(we4Var, fb2Var, obj, z);
            }
            jm7 jm7Var = (jm7) this.c.get(obj.getClass());
            return jm7Var != null ? p(jm7Var, fb2Var, obj, z) : obj instanceof yw4 ? d(fb2Var, ((yw4) obj).a()) : obj instanceof Enum ? d(fb2Var, ((Enum) obj).ordinal()) : o(this.d, fb2Var, obj, z);
        }
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == 0) {
            return this;
        }
        u((s(fb2Var) << 3) | 2);
        u(bArr.length);
        this.a.write(bArr);
        return this;
    }

    @Override // com.zepto.xe4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public gx4 d(fb2 fb2Var, int i2) {
        return i(fb2Var, i2, true);
    }

    public gx4 i(fb2 fb2Var, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        cx4 cx4VarR = r(fb2Var);
        int i3 = a.a[cx4VarR.intEncoding().ordinal()];
        if (i3 == 1) {
            u(cx4VarR.tag() << 3);
            u(i2);
        } else if (i3 == 2) {
            u(cx4VarR.tag() << 3);
            u((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            u((cx4VarR.tag() << 3) | 5);
            this.a.write(m(4).putInt(i2).array());
        }
        return this;
    }

    @Override // com.zepto.xe4
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public gx4 b(fb2 fb2Var, long j) {
        return k(fb2Var, j, true);
    }

    public gx4 k(fb2 fb2Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        cx4 cx4VarR = r(fb2Var);
        int i2 = a.a[cx4VarR.intEncoding().ordinal()];
        if (i2 == 1) {
            u(cx4VarR.tag() << 3);
            v(j);
        } else if (i2 == 2) {
            u(cx4VarR.tag() << 3);
            v((j >> 63) ^ (j << 1));
        } else if (i2 == 3) {
            u((cx4VarR.tag() << 3) | 1);
            this.a.write(m(8).putLong(j).array());
        }
        return this;
    }

    public gx4 l(fb2 fb2Var, boolean z, boolean z2) {
        return i(fb2Var, z ? 1 : 0, z2);
    }

    public final long n(we4 we4Var, Object obj) throws IOException {
        te3 te3Var = new te3();
        try {
            OutputStream outputStream = this.a;
            this.a = te3Var;
            try {
                we4Var.a(obj, this);
                this.a = outputStream;
                long jD = te3Var.d();
                te3Var.close();
                return jD;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                te3Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final gx4 o(we4 we4Var, fb2 fb2Var, Object obj, boolean z) throws IOException {
        long jN = n(we4Var, obj);
        if (z && jN == 0) {
            return this;
        }
        u((s(fb2Var) << 3) | 2);
        v(jN);
        we4Var.a(obj, this);
        return this;
    }

    public final gx4 p(jm7 jm7Var, fb2 fb2Var, Object obj, boolean z) {
        this.e.b(fb2Var, z);
        jm7Var.a(obj, this.e);
        return this;
    }

    public gx4 q(Object obj) {
        if (obj == null) {
            return this;
        }
        we4 we4Var = (we4) this.b.get(obj.getClass());
        if (we4Var != null) {
            we4Var.a(obj, this);
            return this;
        }
        throw new e22("No encoder for " + obj.getClass());
    }

    public final void u(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void v(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
