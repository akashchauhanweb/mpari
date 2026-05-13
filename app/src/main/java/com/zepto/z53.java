package com.zepto;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z53 implements xe4, km7 {
    public z53 a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final we4 f;
    public final boolean g;

    public z53(Writer writer, Map map, Map map2, we4 we4Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = we4Var;
        this.g = z;
    }

    @Override // com.zepto.xe4
    public xe4 a(fb2 fb2Var, Object obj) {
        return l(fb2Var.b(), obj);
    }

    @Override // com.zepto.xe4
    public xe4 b(fb2 fb2Var, long j) {
        return k(fb2Var.b(), j);
    }

    @Override // com.zepto.xe4
    public xe4 d(fb2 fb2Var, int i) {
        return j(fb2Var.b(), i);
    }

    public z53 f(int i) throws IOException {
        t();
        this.c.value(i);
        return this;
    }

    public z53 g(long j) throws IOException {
        t();
        this.c.value(j);
        return this;
    }

    public z53 h(Object obj, boolean z) {
        int i = 0;
        if (z && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new e22(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new e22(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            we4 we4Var = (we4) this.d.get(obj.getClass());
            if (we4Var != null) {
                return q(we4Var, obj, z);
            }
            jm7 jm7Var = (jm7) this.e.get(obj.getClass());
            if (jm7Var != null) {
                jm7Var.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f, obj, z);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.c.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                g(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.c.endArray();
        return this;
    }

    @Override // com.zepto.km7
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public z53 c(String str) throws IOException {
        t();
        this.c.value(str);
        return this;
    }

    public z53 j(String str, int i) throws IOException {
        t();
        this.c.name(str);
        return f(i);
    }

    public z53 k(String str, long j) throws IOException {
        t();
        this.c.name(str);
        return g(j);
    }

    public z53 l(String str, Object obj) {
        return this.g ? s(str, obj) : r(str, obj);
    }

    @Override // com.zepto.km7
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public z53 e(boolean z) throws IOException {
        t();
        this.c.value(z);
        return this;
    }

    public z53 n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void p() {
        t();
        this.c.flush();
    }

    public z53 q(we4 we4Var, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        we4Var.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    public final z53 r(String str, Object obj) throws IOException {
        t();
        this.c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    public final z53 s(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        t();
        this.c.name(str);
        return h(obj, false);
    }

    public final void t() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        z53 z53Var = this.a;
        if (z53Var != null) {
            z53Var.t();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }
}
