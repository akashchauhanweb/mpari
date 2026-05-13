package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;

/* JADX INFO: loaded from: classes.dex */
public final class g73 extends ri2 implements bt3 {
    private static final g73 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ql4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h73 params_;
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

        public b t(h73 h73Var) {
            l();
            ((g73) this.e).b0(h73Var);
            return this;
        }

        public b u(int i) {
            l();
            ((g73) this.e).c0(i);
            return this;
        }

        public b() {
            super(g73.DEFAULT_INSTANCE);
        }
    }

    static {
        g73 g73Var = new g73();
        DEFAULT_INSTANCE = g73Var;
        ri2.Q(g73.class, g73Var);
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static g73 a0(s80 s80Var, g72 g72Var) {
        return (g73) ri2.K(DEFAULT_INSTANCE, s80Var, g72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i) {
        this.version_ = i;
    }

    public h73 X() {
        h73 h73Var = this.params_;
        return h73Var == null ? h73.V() : h73Var;
    }

    public int Y() {
        return this.version_;
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
    }

    public final void b0(h73 h73Var) {
        h73Var.getClass();
        this.params_ = h73Var;
    }

    @Override // com.zepto.at3
    public /* bridge */ /* synthetic */ at3.a e() {
        return super.H();
    }

    @Override // com.zepto.ri2
    public final Object s(ri2.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new g73();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (g73.class) {
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
