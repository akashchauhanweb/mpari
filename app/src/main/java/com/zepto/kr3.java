package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class kr3 extends KeyFactorySpi implements fy {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            sv4 sv4VarB = sv4.B(u0.d0(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!hk4.n.a0(sv4VarB.D().z())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                mr3 mr3VarO = mr3.O(sv4VarB.T());
                return new g20(new nr3(mr3VarO.T(), mr3VarO.P(), mr3VarO.B(), mr3VarO.D(), mr3VarO.a0(), rt6.b(mr3VarO.z()).b()));
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            o86 o86VarB = o86.B(u0.d0(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!hk4.n.a0(o86VarB.z().z())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                or3 or3VarD = or3.D(o86VarB.O());
                return new h20(new pr3(or3VarD.O(), or3VarD.P(), or3VarD.B(), rt6.b(or3VarD.z()).b()));
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
            }
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) {
        return null;
    }
}
