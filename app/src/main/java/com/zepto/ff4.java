package com.zepto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ff4 extends no6 {
    public static final po6 c = b(ei6.c);
    public final Gson a;
    public final hi6 b;

    public class a implements po6 {
        public final /* synthetic */ hi6 c;

        public a(hi6 hi6Var) {
            this.c = hi6Var;
        }

        @Override // com.zepto.po6
        public no6 a(Gson gson, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Object.class) {
                return new ff4(gson, this.c, aVar);
            }
            return null;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v53.values().length];
            a = iArr;
            try {
                iArr[v53.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v53.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v53.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[v53.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[v53.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[v53.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public /* synthetic */ ff4(Gson gson, hi6 hi6Var, a aVar) {
        this(gson, hi6Var);
    }

    public static po6 a(hi6 hi6Var) {
        return hi6Var == ei6.c ? c : b(hi6Var);
    }

    private static po6 b(hi6 hi6Var) {
        return new a(hi6Var);
    }

    public final Object c(s53 s53Var, v53 v53Var) throws IOException {
        int i = b.a[v53Var.ordinal()];
        if (i == 3) {
            return s53Var.E0();
        }
        if (i == 4) {
            return this.b.a(s53Var);
        }
        if (i == 5) {
            return Boolean.valueOf(s53Var.p0());
        }
        if (i == 6) {
            s53Var.C0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + v53Var);
    }

    public final Object d(s53 s53Var, v53 v53Var) throws IOException {
        int i = b.a[v53Var.ordinal()];
        if (i == 1) {
            s53Var.d();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        s53Var.e();
        return new of3();
    }

    @Override // com.zepto.no6
    public Object read(s53 s53Var) throws IOException {
        v53 v53VarG0 = s53Var.G0();
        Object objD = d(s53Var, v53VarG0);
        if (objD == null) {
            return c(s53Var, v53VarG0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (s53Var.d0()) {
                String strA0 = objD instanceof Map ? s53Var.A0() : null;
                v53 v53VarG02 = s53Var.G0();
                Object objD2 = d(s53Var, v53VarG02);
                boolean z = objD2 != null;
                if (objD2 == null) {
                    objD2 = c(s53Var, v53VarG02);
                }
                if (objD instanceof List) {
                    ((List) objD).add(objD2);
                } else {
                    ((Map) objD).put(strA0, objD2);
                }
                if (z) {
                    arrayDeque.addLast(objD);
                    objD = objD2;
                }
            } else {
                if (objD instanceof List) {
                    s53Var.w();
                } else {
                    s53Var.B();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.zepto.no6
    public void write(b63 b63Var, Object obj) throws IOException {
        if (obj == null) {
            b63Var.m0();
            return;
        }
        no6 adapter = this.a.getAdapter(obj.getClass());
        if (!(adapter instanceof ff4)) {
            adapter.write(b63Var, obj);
        } else {
            b63Var.m();
            b63Var.B();
        }
    }

    public ff4(Gson gson, hi6 hi6Var) {
        this.a = gson;
        this.b = hi6Var;
    }
}
