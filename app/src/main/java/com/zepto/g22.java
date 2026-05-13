package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g22 extends ri2 implements bt3 {
    private static final g22 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile ql4 PARSER;
    private s80 encryptedKeyset_ = s80.e;
    private c73 keysetInfo_;

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
            ((g22) this.e).a0(s80Var);
            return this;
        }

        public b u(c73 c73Var) {
            l();
            ((g22) this.e).b0(c73Var);
            return this;
        }

        public b() {
            super(g22.DEFAULT_INSTANCE);
        }
    }

    static {
        g22 g22Var = new g22();
        DEFAULT_INSTANCE = g22Var;
        ri2.Q(g22.class, g22Var);
    }

    public static b Y() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static g22 Z(InputStream inputStream, g72 g72Var) {
        return (g22) ri2.L(DEFAULT_INSTANCE, inputStream, g72Var);
    }

    public s80 X() {
        return this.encryptedKeyset_;
    }

    public final void a0(s80 s80Var) {
        s80Var.getClass();
        this.encryptedKeyset_ = s80Var;
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
    }

    public final void b0(c73 c73Var) {
        c73Var.getClass();
        this.keysetInfo_ = c73Var;
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
                return new g22();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (g22.class) {
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
