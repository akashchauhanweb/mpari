package com.zepto;

import java.security.interfaces.RSAPublicKey;
import javax.crypto.SecretKey;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public class w35 extends v35 implements n33 {
    public final RSAPublicKey h;

    public w35(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // com.zepto.n33
    public m33 b(o33 o33Var, byte[] bArr, byte[] bArr2) throws f33 {
        h40 h40VarD;
        l33 l33VarA = p33.a(o33Var);
        SecretKey secretKeyD = d(o33Var.g());
        if (l33VarA.equals(l33.g)) {
            h40VarD = h40.d(u35.a(this.h, secretKeyD, e().d()));
        } else if (l33VarA.equals(l33.h)) {
            h40VarD = h40.d(x35.a(this.h, secretKeyD, e().d()));
        } else if (l33VarA.equals(l33.i)) {
            h40VarD = h40.d(y35.a(this.h, secretKeyD, 256, e().d()));
        } else if (l33VarA.equals(l33.j)) {
            h40VarD = h40.d(y35.a(this.h, secretKeyD, 384, e().d()));
        } else {
            if (!l33VarA.equals(l33.k)) {
                throw new f33(go.c(l33VarA, v35.f));
            }
            h40VarD = h40.d(y35.a(this.h, secretKeyD, ConstantsKt.MINIMUM_BLOCK_SIZE, e().d()));
        }
        return jy0.b(o33Var, bArr, bArr2, secretKeyD, h40VarD, e());
    }

    public w35(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        super(secretKey);
        if (rSAPublicKey == null) {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
        this.h = rSAPublicKey;
    }
}
