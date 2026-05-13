package com.zepto;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x63 {

    public class a implements SecretKey {
        public final /* synthetic */ SecretKey c;

        public a(SecretKey secretKey) {
            this.c = secretKey;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return "AES";
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.c.getEncoded();
        }

        @Override // java.security.Key
        public String getFormat() {
            return this.c.getFormat();
        }
    }

    public static SecretKey a(SecretKey secretKey) {
        return (secretKey == null || secretKey.getAlgorithm().equals("AES")) ? secretKey : new a(secretKey);
    }
}
