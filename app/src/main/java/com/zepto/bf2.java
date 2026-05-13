package com.zepto;

import com.zepto.ds2;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bf2 extends lc5 {
    public final List a;
    public final List b;
    public static final b d = new b(null);
    public static final ls3 c = ls3.g.a("application/x-www-form-urlencoded");

    public static final class a {
        public final List a;
        public final List b;
        public final Charset c;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.a;
            ds2.b bVar = ds2.l;
            list.add(ds2.b.b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91, null));
            this.b.add(ds2.b.b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91, null));
            return this;
        }

        public final a b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List list = this.a;
            ds2.b bVar = ds2.l;
            list.add(ds2.b.b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.c, 83, null));
            this.b.add(ds2.b.b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.c, 83, null));
            return this;
        }

        public final bf2 c() {
            return new bf2(this.a, this.b);
        }

        public a(Charset charset) {
            this.c = charset;
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bf2(List encodedNames, List encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.a = et6.P(encodedNames);
        this.b = et6.P(encodedValues);
    }

    public final long a(z70 z70Var, boolean z) throws EOFException {
        u70 u70VarC;
        if (z) {
            u70VarC = new u70();
        } else {
            Intrinsics.checkNotNull(z70Var);
            u70VarC = z70Var.c();
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                u70VarC.J(38);
            }
            u70VarC.l0((String) this.a.get(i));
            u70VarC.J(61);
            u70VarC.l0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jL0 = u70VarC.L0();
        u70VarC.d();
        return jL0;
    }

    @Override // com.zepto.lc5
    public long contentLength() {
        return a(null, true);
    }

    @Override // com.zepto.lc5
    public ls3 contentType() {
        return c;
    }

    @Override // com.zepto.lc5
    public void writeTo(z70 sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
