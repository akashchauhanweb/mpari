package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;
import com.zepto.x03;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a73 extends ri2 implements bt3 {
    private static final a73 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile ql4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private x03.d key_ = ri2.t();
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
            ((a73) this.e).X(cVar);
            return this;
        }

        public c u(int i) {
            return ((a73) this.e).Z(i);
        }

        public int v() {
            return ((a73) this.e).a0();
        }

        public List x() {
            return Collections.unmodifiableList(((a73) this.e).b0());
        }

        public b y(int i) {
            l();
            ((a73) this.e).g0(i);
            return this;
        }

        public b() {
            super(a73.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends ri2 implements bt3 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ql4 PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private f63 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

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

            public a t(f63 f63Var) {
                l();
                ((c) this.e).f0(f63Var);
                return this;
            }

            public a u(int i) {
                l();
                ((c) this.e).g0(i);
                return this;
            }

            public a v(qj4 qj4Var) {
                l();
                ((c) this.e).h0(qj4Var);
                return this;
            }

            public a x(q63 q63Var) {
                l();
                ((c) this.e).i0(q63Var);
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

        public static a e0() {
            return (a) DEFAULT_INSTANCE.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(qj4 qj4Var) {
            this.outputPrefixType_ = qj4Var.b();
        }

        public f63 Z() {
            f63 f63Var = this.keyData_;
            return f63Var == null ? f63.Y() : f63Var;
        }

        public int a0() {
            return this.keyId_;
        }

        @Override // com.zepto.bt3
        public /* bridge */ /* synthetic */ at3 b() {
            return super.v();
        }

        public qj4 b0() {
            qj4 qj4VarA = qj4.a(this.outputPrefixType_);
            return qj4VarA == null ? qj4.UNRECOGNIZED : qj4VarA;
        }

        public q63 c0() {
            q63 q63VarA = q63.a(this.status_);
            return q63VarA == null ? q63.UNRECOGNIZED : q63VarA;
        }

        public boolean d0() {
            return this.keyData_ != null;
        }

        @Override // com.zepto.at3
        public /* bridge */ /* synthetic */ at3.a e() {
            return super.H();
        }

        public final void f0(f63 f63Var) {
            f63Var.getClass();
            this.keyData_ = f63Var;
        }

        public final void g0(int i) {
            this.keyId_ = i;
        }

        public final void i0(q63 q63Var) {
            this.status_ = q63Var.b();
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
                    return ri2.I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        a73 a73Var = new a73();
        DEFAULT_INSTANCE = a73Var;
        ri2.Q(a73.class, a73Var);
    }

    public static b d0() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public static a73 e0(InputStream inputStream, g72 g72Var) {
        return (a73) ri2.L(DEFAULT_INSTANCE, inputStream, g72Var);
    }

    public static a73 f0(byte[] bArr, g72 g72Var) {
        return (a73) ri2.M(DEFAULT_INSTANCE, bArr, g72Var);
    }

    public final void X(c cVar) {
        cVar.getClass();
        Y();
        this.key_.add(cVar);
    }

    public final void Y() {
        x03.d dVar = this.key_;
        if (dVar.X()) {
            return;
        }
        this.key_ = ri2.G(dVar);
    }

    public c Z(int i) {
        return (c) this.key_.get(i);
    }

    public int a0() {
        return this.key_.size();
    }

    @Override // com.zepto.bt3
    public /* bridge */ /* synthetic */ at3 b() {
        return super.v();
    }

    public List b0() {
        return this.key_;
    }

    public int c0() {
        return this.primaryKeyId_;
    }

    @Override // com.zepto.at3
    public /* bridge */ /* synthetic */ at3.a e() {
        return super.H();
    }

    public final void g0(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // com.zepto.ri2
    public final Object s(ri2.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new a73();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (a73.class) {
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
