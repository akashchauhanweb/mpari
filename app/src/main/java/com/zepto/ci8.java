package com.zepto;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ci8 extends wm8 {
    public final int a;

    public ci8(byte[] bArr) {
        iu4.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.zepto.cn8
    public final vw2 a() {
        return hf4.p0(j());
    }

    public final boolean equals(Object obj) {
        vw2 vw2VarA;
        if (obj != null && (obj instanceof cn8)) {
            try {
                cn8 cn8Var = (cn8) obj;
                if (cn8Var.k0() == this.a && (vw2VarA = cn8Var.a()) != null) {
                    return Arrays.equals(j(), (byte[]) hf4.j(vw2VarA));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] j();

    @Override // com.zepto.cn8
    public final int k0() {
        return this.a;
    }
}
