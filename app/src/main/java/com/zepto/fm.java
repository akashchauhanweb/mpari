package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;

/* JADX INFO: loaded from: classes.dex */
public final class fm extends ri2 implements bt3 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final fm DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile ql4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private jm aesCtrKey_;
    private bn2 hmacKey_;
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

        public b t(jm jmVar) {
            l();
            ((fm) this.e).d0(jmVar);
            return this;
        }

        public b u(bn2 bn2Var) {
            l();
            ((fm) this.e).e0(bn2Var);
            return this;
        }

        public b v(int i) {
            l();
            ((fm) this.e).f0(i);
            return this;
        }

        public b() {
            super(fm.DEFAULT_INSTANCE);
        }
    }

    static {
        fm fmVar = new fm();
        DEFAULT_INSTANCE = fmVar;
        ri2.Q(fm.class, fmVar);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static fm c0(s80 s80Var, g72 g72Var) {
        return (fm) ri2.K(DEFAULT_INSTANCE, s80Var, g72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i) {
        this.version_ = i;
    }

    public jm Y() {
        jm jmVar = this.aesCtrKey_;
        return jmVar == null ? jm.Y() : jmVar;
    }

    public bn2 Z() {
        bn2 bn2Var = this.hmacKey_;
        return bn2Var == null ? bn2.Y() : bn2Var;
    }

    public int a0() {
        return this.version_;
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
    }

    public final void d0(jm jmVar) {
        jmVar.getClass();
        this.aesCtrKey_ = jmVar;
    }

    @Override // com.zepto.at3
    public /* bridge */ /* synthetic */ at3.a e() {
        return super.H();
    }

    public final void e0(bn2 bn2Var) {
        bn2Var.getClass();
        this.hmacKey_ = bn2Var;
    }

    @Override // com.zepto.ri2
    public final Object s(ri2.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new fm();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (fm.class) {
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
