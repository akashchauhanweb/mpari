package com.zepto;

import com.zepto.m08;
import com.zepto.u08;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wx4 {
    public static Map a;

    public static class b extends g {
        public b() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            byte[] bArrJ0 = q0.i0(o86Var.O()).j0();
            if (vk4.a(bArrJ0, 0) == 1) {
                return ha3.a(wx.h(bArrJ0, 4, bArrJ0.length));
            }
            if (bArrJ0.length == 64) {
                bArrJ0 = wx.h(bArrJ0, 4, bArrJ0.length);
            }
            return yk2.a(bArrJ0);
        }
    }

    public static class c extends g {
        public c() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            or3 or3VarD = or3.D(o86Var.O());
            return new pr3(or3VarD.O(), or3VarD.P(), or3VarD.B(), qt6.c(or3VarD.z().z()));
        }
    }

    public static class d extends g {
        public d() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            return new k14(o86Var.D().h0());
        }
    }

    public static class e extends g {
        public e() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            return new hy4(qt6.e(o86Var.z()), o86Var.D().k0());
        }
    }

    public static class f extends g {
        public f() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            return new qg5(o86Var.D().h0(), qt6.g(ng5.z(o86Var.z().D())));
        }
    }

    public static abstract class g {
        public g() {
        }

        public abstract gy a(o86 o86Var, Object obj);
    }

    public static class h extends g {
        public h() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            u08.b bVarF;
            e08 e08VarB = e08.B(o86Var.z().D());
            if (e08VarB != null) {
                p0 p0VarZ = e08VarB.D().z();
                t08 t08VarZ = t08.z(o86Var.O());
                bVarF = new u08.b(new q08(e08VarB.z(), qt6.b(p0VarZ))).g(t08VarZ.B()).h(t08VarZ.D());
            } else {
                byte[] bArrJ0 = q0.i0(o86Var.O()).j0();
                bVarF = new u08.b(q08.k(vk4.a(bArrJ0, 0))).f(bArrJ0);
            }
            return bVarF.e();
        }
    }

    public static class i extends g {
        public i() {
            super();
        }

        @Override // com.zepto.wx4.g
        public gy a(o86 o86Var, Object obj) {
            m08.b bVarF;
            h08 h08VarB = h08.B(o86Var.z().D());
            if (h08VarB != null) {
                p0 p0VarZ = h08VarB.O().z();
                t08 t08VarZ = t08.z(o86Var.O());
                bVarF = new m08.b(new i08(h08VarB.z(), h08VarB.D(), qt6.b(p0VarZ))).g(t08VarZ.B()).h(t08VarZ.D());
            } else {
                byte[] bArrJ0 = q0.i0(o86Var.O()).j0();
                bVarF = new m08.b(i08.i(vk4.a(bArrJ0, 0))).f(bArrJ0);
            }
            return bVarF.e();
        }
    }

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(hk4.X, new e());
        a.put(hk4.Y, new e());
        a.put(hk4.r, new f());
        a.put(hk4.v, new d());
        a.put(hk4.w, new h());
        a.put(hk4.F, new i());
        a.put(k13.a, new h());
        a.put(k13.b, new i());
        a.put(gk4.I0, new b());
        a.put(hk4.n, new c());
    }

    public static gy a(o86 o86Var) {
        return b(o86Var, null);
    }

    public static gy b(o86 o86Var, Object obj) throws IOException {
        eo eoVarZ = o86Var.z();
        g gVar = (g) a.get(eoVarZ.z());
        if (gVar != null) {
            return gVar.a(o86Var, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + eoVarZ.z());
    }
}
