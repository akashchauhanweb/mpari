package com.zepto;

import com.zepto.xz7;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class uz7 extends tl {
    public final xz7 a;
    public final ou5 b;
    public final x80 c;
    public final Integer d;

    public uz7(xz7 xz7Var, ou5 ou5Var, x80 x80Var, Integer num) {
        this.a = xz7Var;
        this.b = ou5Var;
        this.c = x80Var;
        this.d = num;
    }

    public static uz7 a(xz7.a aVar, ou5 ou5Var, Integer num) throws GeneralSecurityException {
        xz7.a aVar2 = xz7.a.d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ou5Var.b() == 32) {
            xz7 xz7VarA = xz7.a(aVar);
            return new uz7(xz7VarA, ou5Var, b(xz7VarA, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ou5Var.b());
    }

    public static x80 b(xz7 xz7Var, Integer num) {
        if (xz7Var.b() == xz7.a.d) {
            return x80.a(new byte[0]);
        }
        if (xz7Var.b() == xz7.a.c) {
            return x80.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (xz7Var.b() == xz7.a.b) {
            return x80.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + xz7Var.b());
    }
}
