package com.zepto;

import com.zepto.hg6;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class tu4 implements ru4 {
    public static final hg6.b e = hg6.b.e;
    public final ThreadLocal a;
    public final String b;
    public final Key c;
    public final int d;

    public class a extends ThreadLocal {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) m22.c.a(tu4.this.b);
                mac.init(tu4.this.c);
                return mac;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public tu4(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.a = aVar;
        if (!e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.d = 20;
                break;
            case "HMACSHA224":
                this.d = 28;
                break;
            case "HMACSHA256":
                this.d = 32;
                break;
            case "HMACSHA384":
                this.d = 48;
                break;
            case "HMACSHA512":
                this.d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // com.zepto.ru4
    public byte[] a(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.a.get()).doFinal(), i);
    }
}
