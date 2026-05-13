package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class hp3 implements ep5 {
    public static final zs3 b = new a();
    public final zs3 a;

    public class a implements zs3 {
        @Override // com.zepto.zs3
        public ys3 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.zepto.zs3
        public boolean b(Class cls) {
            return false;
        }
    }

    public static class b implements zs3 {
        public zs3[] a;

        public b(zs3... zs3VarArr) {
            this.a = zs3VarArr;
        }

        @Override // com.zepto.zs3
        public ys3 a(Class cls) {
            for (zs3 zs3Var : this.a) {
                if (zs3Var.b(cls)) {
                    return zs3Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.zepto.zs3
        public boolean b(Class cls) {
            for (zs3 zs3Var : this.a) {
                if (zs3Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public hp3() {
        this(b());
    }

    public static zs3 b() {
        return new b(qi2.c(), c());
    }

    public static zs3 c() {
        try {
            return (zs3) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    public static boolean d(ys3 ys3Var) {
        return ys3Var.b() == bx4.PROTO2;
    }

    public static dp5 e(Class cls, ys3 ys3Var) {
        return ri2.class.isAssignableFrom(cls) ? d(ys3Var) ? et3.T(cls, ys3Var, w84.b(), rf3.b(), mp5.L(), j72.b(), op3.b()) : et3.T(cls, ys3Var, w84.b(), rf3.b(), mp5.L(), null, op3.b()) : d(ys3Var) ? et3.T(cls, ys3Var, w84.a(), rf3.a(), mp5.G(), j72.a(), op3.a()) : et3.T(cls, ys3Var, w84.a(), rf3.a(), mp5.H(), null, op3.a());
    }

    @Override // com.zepto.ep5
    public dp5 a(Class cls) {
        mp5.I(cls);
        ys3 ys3VarA = this.a.a(cls);
        return ys3VarA.a() ? ri2.class.isAssignableFrom(cls) ? ft3.m(mp5.L(), j72.b(), ys3VarA.c()) : ft3.m(mp5.G(), j72.a(), ys3VarA.c()) : e(cls, ys3VarA);
    }

    public hp3(zs3 zs3Var) {
        this.a = (zs3) x03.b(zs3Var, "messageInfoFactory");
    }
}
