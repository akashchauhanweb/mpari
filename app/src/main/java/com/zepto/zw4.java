package com.zepto;

import com.zepto.f63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zw4 implements sy5 {
    public final String a;
    public final x80 b;
    public final s80 c;
    public final f63.c d;
    public final qj4 e;
    public final Integer f;

    public zw4(String str, s80 s80Var, f63.c cVar, qj4 qj4Var, Integer num) {
        this.a = str;
        this.b = ft6.e(str);
        this.c = s80Var;
        this.d = cVar;
        this.e = qj4Var;
        this.f = num;
    }

    public static zw4 b(String str, s80 s80Var, f63.c cVar, qj4 qj4Var, Integer num) throws GeneralSecurityException {
        if (qj4Var == qj4.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zw4(str, s80Var, cVar, qj4Var, num);
    }

    @Override // com.zepto.sy5
    public x80 a() {
        return this.b;
    }

    public Integer c() {
        return this.f;
    }

    public f63.c d() {
        return this.d;
    }

    public qj4 e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public s80 g() {
        return this.c;
    }
}
