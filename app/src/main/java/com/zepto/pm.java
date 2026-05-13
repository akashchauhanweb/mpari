package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;

/* JADX INFO: loaded from: classes.dex */
public final class pm extends ri2 implements bt3 {
    private static final pm DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ql4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private s80 keyValue_ = s80.e;
    private tm params_;
    private int version_;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ri2.d.values().length];
            a = iArr;
            try {
                iArr[ri2.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ri2.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ri2.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ri2.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ri2.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ri2.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ri2.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends ri2.a implements bt3 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.zepto.at3.a
        public /* bridge */ /* synthetic */ at3 D() {
            return super.i();
        }

        @Override // com.zepto.bt3
        public /* bridge */ /* synthetic */ at3 b() {
            return super.p();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.k();
        }

        public b t(s80 s80Var) {
            l();
            ((pm) this.e).d0(s80Var);
            return this;
        }

        public b u(tm tmVar) {
            l();
            ((pm) this.e).e0(tmVar);
            return this;
        }

        public b v(int i) {
            l();
            ((pm) this.e).f0(i);
            return this;
        }

        public b() {
            super(pm.DEFAULT_INSTANCE);
        }
    }

    static {
        pm pmVar = new pm();
        DEFAULT_INSTANCE = pmVar;
        ri2.Q(pm.class, pmVar);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static pm c0(s80 s80Var, g72 g72Var) {
        return (pm) ri2.K(DEFAULT_INSTANCE, s80Var, g72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(s80 s80Var) {
        s80Var.getClass();
        this.keyValue_ = s80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i) {
        this.version_ = i;
    }

    public s80 Y() {
        return this.keyValue_;
    }

    public tm Z() {
        tm tmVar = this.params_;
        return tmVar == null ? tm.W() : tmVar;
    }

    public int a0() {
        return this.version_;
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
    }

    @Override // com.zepto.at3
    public /* bridge */ /* synthetic */ at3.a e() {
        return super.H();
    }

    public final void e0(tm tmVar) {
        tmVar.getClass();
        this.params_ = tmVar;
    }

    @Override // com.zepto.ri2
    public final Object s(ri2.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new pm();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (pm.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new ri2.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
