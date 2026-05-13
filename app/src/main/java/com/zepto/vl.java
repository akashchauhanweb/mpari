package com.zepto;

import com.zepto.dv4;
import com.zepto.tw3;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class vl implements ev4 {
    public static final Logger a = Logger.getLogger(vl.class.getName());
    public static final vl b = new vl();

    public static class b implements rl {
        public final dv4 a;
        public final tw3.a b;
        public final tw3.a c;

        @Override // com.zepto.rl
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = y80.a(this.a.e().b(), ((rl) this.a.e().g()).a(bArr, bArr2));
                this.b.b(this.a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e) {
                this.b.a();
                throw e;
            }
        }

        @Override // com.zepto.rl
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (dv4.c cVar : this.a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrB = ((rl) cVar.g()).b(bArrCopyOfRange, bArr2);
                        this.c.b(cVar.d(), bArrCopyOfRange.length);
                        return bArrB;
                    } catch (GeneralSecurityException e) {
                        vl.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (dv4.c cVar2 : this.a.h()) {
                try {
                    byte[] bArrB2 = ((rl) cVar2.g()).b(bArr, bArr2);
                    this.c.b(cVar2.d(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.c.a();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(dv4 dv4Var) {
            this.a = dv4Var;
            if (!dv4Var.i()) {
                tw3.a aVar = vw3.a;
                this.b = aVar;
                this.c = aVar;
            } else {
                tw3 tw3VarA = py3.b().a();
                uw3 uw3VarA = vw3.a(dv4Var);
                this.b = tw3VarA.a(uw3VarA, "aead", "encrypt");
                this.c = tw3VarA.a(uw3VarA, "aead", "decrypt");
            }
        }
    }

    public static void e() {
        u75.n(b);
    }

    @Override // com.zepto.ev4
    public Class a() {
        return rl.class;
    }

    @Override // com.zepto.ev4
    public Class c() {
        return rl.class;
    }

    @Override // com.zepto.ev4
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rl b(dv4 dv4Var) {
        return new b(dv4Var);
    }
}
