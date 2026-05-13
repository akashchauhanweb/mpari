package com.zepto;

import com.zepto.k08;
import com.zepto.s08;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rv4 {
    public static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = vk4.h(bArr, i * 2);
        }
        return sArr;
    }

    public static gy b(sv4 sv4Var) throws IOException {
        p0 p0VarZ = sv4Var.D().z();
        if (p0VarZ.o0(m20.W)) {
            return new gy4(qt6.e(sv4Var.D()), q0.i0(sv4Var.T()).j0());
        }
        if (p0VarZ.a0(m20.s)) {
            return new pg5(q0.i0(sv4Var.T()).j0(), qt6.g(ng5.z(sv4Var.D().D())));
        }
        if (p0VarZ.a0(m20.f0)) {
            return new j14(a(q0.i0(sv4Var.T()).j0()));
        }
        if (p0VarZ.a0(gk4.I0)) {
            byte[] bArrJ0 = q0.i0(sv4Var.T()).j0();
            x xVarO = sv4Var.O();
            if (vk4.a(bArrJ0, 0) == 1) {
                if (xVarO == null) {
                    return ga3.e(wx.h(bArrJ0, 4, bArrJ0.length));
                }
                byte[] bArrK0 = xVarO.k0();
                return ga3.f(wx.h(bArrJ0, 4, bArrJ0.length), wx.h(bArrK0, 4, bArrK0.length));
            }
            if (xVarO == null) {
                return xk2.a(wx.h(bArrJ0, 4, bArrJ0.length));
            }
            return xk2.b(wx.h(bArrJ0, 4, bArrJ0.length), xVarO.k0());
        }
        if (p0VarZ.a0(m20.w)) {
            e08 e08VarB = e08.B(sv4Var.D().D());
            p0 p0VarZ2 = e08VarB.D().z();
            r08 r08VarB = r08.B(sv4Var.T());
            try {
                s08.b bVarO = new s08.b(new q08(e08VarB.z(), qt6.b(p0VarZ2))).l(r08VarB.getIndex()).q(r08VarB.a0()).p(r08VarB.T()).n(r08VarB.O()).o(r08VarB.P());
                if (r08VarB.d0() != 0) {
                    bVarO.m(r08VarB.D());
                }
                if (r08VarB.z() != null) {
                    bVarO.k(((x20) v08.f(r08VarB.z(), x20.class)).h(p0VarZ2));
                }
                return bVarO.j();
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
            }
        }
        if (!p0VarZ.a0(hk4.F)) {
            if (!p0VarZ.a0(hk4.n)) {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
            mr3 mr3VarO = mr3.O(sv4Var.T());
            return new nr3(mr3VarO.T(), mr3VarO.P(), mr3VarO.B(), mr3VarO.D(), mr3VarO.a0(), qt6.c(mr3VarO.z().z()));
        }
        h08 h08VarB = h08.B(sv4Var.D().D());
        p0 p0VarZ3 = h08VarB.O().z();
        try {
            j08 j08VarD = j08.D(sv4Var.T());
            k08.b bVarP = new k08.b(new i08(h08VarB.z(), h08VarB.D(), qt6.b(p0VarZ3))).m(j08VarD.B()).r(j08VarD.d0()).q(j08VarD.a0()).o(j08VarD.P()).p(j08VarD.T());
            if (j08VarD.e0() != 0) {
                bVarP.n(j08VarD.O());
            }
            if (j08VarD.z() != null) {
                bVarP.l(((y20) v08.f(j08VarD.z(), y20.class)).f(p0VarZ3));
            }
            return bVarP.k();
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }
}
