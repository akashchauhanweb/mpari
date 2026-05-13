package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;
import com.zepto.x03;

/* JADX INFO: loaded from: classes.dex */
public final class c73 extends ri2 implements bt3 {
    private static final c73 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile ql4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private x03.d keyInfo_ = ri2.t();
    private int primaryKeyId_;

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

        public b t(c cVar) {
            l();
            ((c73) this.e).X(cVar);
            return this;
        }

        public b u(int i) {
            l();
            ((c73) this.e).b0(i);
            return this;
        }

        public b() {
            super(c73.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends ri2 implements bt3 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ql4 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends ri2.a implements bt3 {
            public /* synthetic */ a(a aVar) {
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

            public a t(int i) {
                l();
                ((c) this.e).b0(i);
                return this;
            }

            public a u(qj4 qj4Var) {
                l();
                ((c) this.e).c0(qj4Var);
                return this;
            }

            public a v(q63 q63Var) {
                l();
                ((c) this.e).d0(q63Var);
                return this;
            }

            public a x(String str) {
                l();
                ((c) this.e).e0(str);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            ri2.Q(c.class, cVar);
        }

        public static a a0() {
            return (a) DEFAULT_INSTANCE.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(qj4 qj4Var) {
            this.outputPrefixType_ = qj4Var.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(q63 q63Var) {
            this.status_ = q63Var.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int Z() {
            return this.keyId_;
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
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return ri2.I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    ql4 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (c.class) {
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

    static {
        c73 c73Var = new c73();
        DEFAULT_INSTANCE = c73Var;
        ri2.Q(c73.class, c73Var);
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i) {
        this.primaryKeyId_ = i;
    }

    public final void X(c cVar) {
        cVar.getClass();
        Y();
        this.keyInfo_.add(cVar);
    }

    public final void Y() {
        x03.d dVar = this.keyInfo_;
        if (dVar.X()) {
            return;
        }
        this.keyInfo_ = ri2.G(dVar);
    }

    public c Z(int i) {
        return (c) this.keyInfo_.get(i);
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
                return new c73();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (c73.class) {
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
