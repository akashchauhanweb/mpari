package com.zepto;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class b45 extends KeyFactorySpi implements fy {
    public PrivateKey a(sv4 sv4Var) {
        c45 c45VarD = c45.D(sv4Var.T());
        return new n20(c45VarD.O(), c45VarD.z(), c45VarD.P(), c45VarD.B(), c45VarD.a0(), c45VarD.T());
    }

    public PublicKey b(o86 o86Var) {
        e45 e45VarP = e45.P(o86Var.O());
        return new o20(e45VarP.O(), e45VarP.z(), e45VarP.D(), e45VarP.B());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof d45) {
            return new n20((d45) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(sv4.B(u0.d0(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof f45) {
            return new o20((f45) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(o86.B(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof n20) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (d45.class.isAssignableFrom(cls)) {
                n20 n20Var = (n20) key;
                return new d45(n20Var.c(), n20Var.a(), n20Var.d(), n20Var.b(), n20Var.f(), n20Var.e());
            }
        } else {
            if (!(key instanceof o20)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (f45.class.isAssignableFrom(cls)) {
                o20 o20Var = (o20) key;
                return new f45(o20Var.d(), o20Var.a(), o20Var.c(), o20Var.b());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof n20) || (key instanceof o20)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
