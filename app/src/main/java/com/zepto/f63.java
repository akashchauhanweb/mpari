package com.zepto;

import com.zepto.at3;
import com.zepto.ri2;
import com.zepto.x03;

/* JADX INFO: loaded from: classes.dex */
public final class f63 extends ri2 implements bt3 {
    private static final f63 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile ql4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
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

        public b t(c cVar) {
            l();
            ((f63) this.e).d0(cVar);
            return this;
        }

        public b u(String str) {
            l();
            ((f63) this.e).e0(str);
            return this;
        }

        public b v(s80 s80Var) {
            l();
            ((f63) this.e).f0(s80Var);
            return this;
        }

        public b() {
            super(f63.DEFAULT_INSTANCE);
        }
    }

    public enum c implements x03.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public static final x03.b k = new a();
        public final int c;

        public class a implements x03.b {
        }

        c(int i) {
            this.c = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int b() {
            if (this != UNRECOGNIZED) {
                return this.c;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        f63 f63Var = new f63();
        DEFAULT_INSTANCE = f63Var;
        ri2.Q(f63.class, f63Var);
    }

    public static f63 Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b) DEFAULT_INSTANCE.p();
    }

    public c Z() {
        c cVarA = c.a(this.keyMaterialType_);
        return cVarA == null ? c.UNRECOGNIZED : cVarA;
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

    public final void d0(c cVar) {
        this.keyMaterialType_ = cVar.b();
    }

    @Override // com.zepto.at3
    public /* bridge */ /* synthetic */ at3.a e() {
        return super.H();
    }

    public final void e0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void f0(s80 s80Var) {
        s80Var.getClass();
        this.value_ = s80Var;
    }

    @Override // com.zepto.ri2
    public final Object s(ri2.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.a[dVar.ordinal()]) {
            case 1:
                return new f63();
            case 2:
                return new b(aVar);
            case 3:
                return ri2.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ql4 bVar = PARSER;
                if (bVar == null) {
                    synchronized (f63.class) {
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
