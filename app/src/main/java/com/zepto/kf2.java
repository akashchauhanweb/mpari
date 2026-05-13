package com.zepto;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class kf2 {
    public static final char[] f = {'x', 'm', 'l', 'n', 's'};
    public static final char[] g = {Typography.amp, 'l', 't', ';'};
    public static final char[] h = {Typography.amp, 'g', 't', ';'};
    public static final char[] i = {Typography.amp, 'q', 'u', 'o', 't', ';'};
    public static final char[] j = {Typography.amp, 'a', 'p', 'o', 's', ';'};
    public static final char[] k = {Typography.amp, 'a', 'm', 'p', ';'};
    public static final char[] l = {Typography.less, '!', '-', '-', ' '};
    public static final char[] m = {' ', '-', '-', Typography.greater};
    public kj4 a = new kj4();
    public ky2 b;
    public Writer c;
    public String d;
    public a e;

    public enum a {
        COMMENT,
        START,
        TEXT,
        END
    }

    public kf2(Writer writer, hf2 hf2Var) {
        this.c = new BufferedWriter(writer, 1024);
        this.b = new ky2(hf2Var);
        this.d = hf2Var.b();
    }

    public final void a(char c) {
        this.a.a(c);
    }

    public final void b(String str) {
        this.a.b(str);
    }

    public final void c(char[] cArr) {
        this.a.c(cArr);
    }

    public final void d(String str) throws IOException {
        k("<![CDATA[");
        k(str);
        k("]]>");
    }

    public final void e(char c) throws IOException {
        char[] cArrI = i(c);
        if (cArrI != null) {
            m(cArrI);
        } else {
            j(c);
        }
    }

    public final void f(String str) throws IOException {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            e(str.charAt(i2));
        }
    }

    public void g() throws IOException {
        this.a.e(this.c);
        this.a.d();
        this.c.flush();
    }

    public final boolean h(String str) {
        return str == null || str.length() == 0;
    }

    public final char[] i(char c) {
        if (c == '\"') {
            return i;
        }
        if (c == '<') {
            return g;
        }
        if (c == '>') {
            return h;
        }
        if (c == '&') {
            return k;
        }
        if (c != '\'') {
            return null;
        }
        return j;
    }

    public final void j(char c) throws IOException {
        this.a.e(this.c);
        this.a.d();
        this.c.write(c);
    }

    public final void k(String str) throws IOException {
        this.a.e(this.c);
        this.a.d();
        this.c.write(str);
    }

    public final void l(String str, String str2) throws IOException {
        this.a.e(this.c);
        this.a.d();
        if (!h(str2)) {
            this.c.write(str2);
            this.c.write(58);
        }
        this.c.write(str);
    }

    public final void m(char[] cArr) throws IOException {
        this.a.e(this.c);
        this.a.d();
        this.c.write(cArr);
    }

    public void n(String str, String str2, String str3) throws t94, IOException {
        if (this.e != a.START) {
            throw new t94("Start element required");
        }
        j(' ');
        l(str, str3);
        j('=');
        j(Typography.quote);
        f(str2);
        j(Typography.quote);
    }

    public void o(String str) {
        String strE = this.b.e();
        if (this.e == a.START) {
            a(Typography.greater);
        }
        if (strE != null) {
            b(strE);
            c(l);
            b(str);
            c(m);
        }
        this.e = a.COMMENT;
    }

    public void p(String str, String str2) throws IOException {
        String strC = this.b.c();
        a aVar = this.e;
        a aVar2 = a.START;
        if (aVar == aVar2) {
            j('/');
            j(Typography.greater);
        } else {
            if (aVar != a.TEXT) {
                k(strC);
            }
            if (this.e != aVar2) {
                j(Typography.less);
                j('/');
                l(str, str2);
                j(Typography.greater);
            }
        }
        this.e = a.END;
    }

    public void q(String str, String str2) throws t94, IOException {
        if (this.e != a.START) {
            throw new t94("Start element required");
        }
        j(' ');
        m(f);
        if (!h(str2)) {
            j(':');
            k(str2);
        }
        j('=');
        j(Typography.quote);
        f(str);
        j(Typography.quote);
    }

    public void r() throws IOException {
        String str = this.d;
        if (str != null) {
            k(str);
            k("\n");
        }
    }

    public void s(String str, String str2) throws IOException {
        String strD = this.b.d();
        a aVar = this.e;
        a aVar2 = a.START;
        if (aVar == aVar2) {
            a(Typography.greater);
        }
        g();
        b(strD);
        a(Typography.less);
        if (!h(str2)) {
            b(str2);
            a(':');
        }
        b(str);
        this.e = aVar2;
    }

    public void t(String str, lw3 lw3Var) throws IOException {
        if (this.e == a.START) {
            j(Typography.greater);
        }
        if (lw3Var == lw3.DATA) {
            d(str);
        } else {
            f(str);
        }
        this.e = a.TEXT;
    }
}
