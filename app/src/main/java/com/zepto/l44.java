package com.zepto;

import android.net.NetworkInfo;
import com.zepto.ds4;
import com.zepto.k90;
import com.zepto.kc5;
import com.zepto.pc5;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class l44 extends pc5 {
    public final sw1 a;
    public final f76 b;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends IOException {
        public final int c;
        public final int e;

        public b(int i, int i2) {
            super("HTTP " + i);
            this.c = i;
            this.e = i2;
        }
    }

    public l44(sw1 sw1Var, f76 f76Var) {
        this.a = sw1Var;
        this.b = f76Var;
    }

    public static kc5 j(jc5 jc5Var, int i) {
        k90 k90VarA;
        if (i == 0) {
            k90VarA = null;
        } else if (k44.a(i)) {
            k90VarA = k90.o;
        } else {
            k90.a aVar = new k90.a();
            if (!k44.b(i)) {
                aVar.d();
            }
            if (!k44.c(i)) {
                aVar.e();
            }
            k90VarA = aVar.a();
        }
        kc5.a aVarJ = new kc5.a().j(jc5Var.d.toString());
        if (k90VarA != null) {
            aVarJ.c(k90VarA);
        }
        return aVarJ.b();
    }

    @Override // com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        String scheme = jc5Var.d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.zepto.pc5
    public int e() {
        return 2;
    }

    @Override // com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) throws a, b {
        ld5 ld5VarA = this.a.a(j(jc5Var, i));
        nd5 nd5VarD = ld5VarA.d();
        if (!ld5VarA.d0()) {
            nd5VarD.close();
            throw new b(ld5VarA.n(), jc5Var.c);
        }
        ds4.e eVar = ld5VarA.j() == null ? ds4.e.NETWORK : ds4.e.DISK;
        if (eVar == ds4.e.DISK && nd5VarD.contentLength() == 0) {
            nd5VarD.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == ds4.e.NETWORK && nd5VarD.contentLength() > 0) {
            this.b.f(nd5VarD.contentLength());
        }
        return new pc5.a(nd5VarD.source(), eVar);
    }

    @Override // com.zepto.pc5
    public boolean h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.zepto.pc5
    public boolean i() {
        return true;
    }
}
