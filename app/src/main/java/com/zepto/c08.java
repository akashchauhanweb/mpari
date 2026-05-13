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
public class c08 extends KeyFactorySpi implements fy {
    public PrivateKey a(sv4 sv4Var) {
        return new t20(sv4Var);
    }

    public PublicKey b(o86 o86Var) {
        return new u20(o86Var);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(sv4.B(u0.d0(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(o86.B(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof t20) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof u20)) {
                throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof t20) || (key instanceof u20)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
