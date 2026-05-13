package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;

/* JADX INFO: loaded from: classes.dex */
public final class s63 extends ri2 implements bt3 {
    private static final s63 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile ql4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private s80 value_ = s80.e;

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

        public b t(qj4 qj4Var) {
            l();
            ((s63) this.e).d0(qj4Var);
            return this;
        }

        public b u(String str) {
            l();
            ((s63) this.e).e0(str);
            return this;
        }

        public b v(s80 s80Var) {
            l();
            ((s63) this.e).f0(s80Var);
            return this;
        }

        public b() {
            super(s63.DEFAULT_INSTANCE);
        }
    }

    static {
        s63 s63Var = new s63();
        DEFAULT_INSTANCE = s63Var;
        ri2.Q(s63.class, s63Var);
    }

    public static s63 Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b) DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(s80 s80Var) {
        s80Var.getClass();
        this.value_ = s80Var;
    }

    public qj4 Z() {
        qj4 qj4VarA = qj4.a(this.outputPrefixType_);
        return qj4VarA == null ? qj4.UNRECOGNIZED : qj4VarA;
    }

    public String a0() {
        return this.typeUrl_;
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
    }

    public s80 b0() {
        return this.value_;
    }

    public final void d0(qj4 qj4Var) {
        this.outputPrefixType_ = qj4Var.b();
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
                return new s63();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (s63.class) {
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
