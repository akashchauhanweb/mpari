package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;

/* JADX INFO: loaded from: classes.dex */
public final class qm extends ri2 implements bt3 {
    private static final qm DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile ql4 PARSER;
    private int keySize_;
    private tm params_;

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

        public b t(int i) {
            l();
            ((qm) this.e).b0(i);
            return this;
        }

        public b u(tm tmVar) {
            l();
            ((qm) this.e).c0(tmVar);
            return this;
        }

        public b() {
            super(qm.DEFAULT_INSTANCE);
        }
    }

    static {
        qm qmVar = new qm();
        DEFAULT_INSTANCE = qmVar;
        ri2.Q(qm.class, qmVar);
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static qm a0(s80 s80Var, g72 g72Var) {
        return (qm) ri2.K(DEFAULT_INSTANCE, s80Var, g72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(tm tmVar) {
        tmVar.getClass();
        this.params_ = tmVar;
    }

    public int X() {
        return this.keySize_;
    }

    public tm Y() {
        tm tmVar = this.params_;
        return tmVar == null ? tm.W() : tmVar;
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
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
                return new qm();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (qm.class) {
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
