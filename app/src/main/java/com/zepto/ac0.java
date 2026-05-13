package com.zepto;

import com.zepto.dc0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 extends tl {
    public final dc0 a;
    public final ou5 b;
    public final x80 c;
    public final Integer d;

    public ac0(dc0 dc0Var, ou5 ou5Var, x80 x80Var, Integer num) {
        this.a = dc0Var;
        this.b = ou5Var;
        this.c = x80Var;
        this.d = num;
    }

    public static ac0 a(dc0.a aVar, ou5 ou5Var, Integer num) throws GeneralSecurityException {
        dc0.a aVar2 = dc0.a.d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ou5Var.b() == 32) {
            dc0 dc0VarA = dc0.a(aVar);
            return new ac0(dc0VarA, ou5Var, b(dc0VarA, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ou5Var.b());
    }

    public static x80 b(dc0 dc0Var, Integer num) {
        if (dc0Var.b() == dc0.a.d) {
            return x80.a(new byte[0]);
        }
        if (dc0Var.b() == dc0.a.c) {
            return x80.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (dc0Var.b() == dc0.a.b) {
            return x80.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + dc0Var.b());
    }
}
