package com.zepto;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class kj4 {
    public StringBuilder a = new StringBuilder();

    public void a(char c) {
        this.a.append(c);
    }

    public void b(String str) {
        this.a.append(str);
    }

    public void c(char[] cArr) {
        this.a.append(cArr, 0, cArr.length);
    }

    public void d() {
        this.a.setLength(0);
    }

    public void e(Writer writer) throws IOException {
        writer.append((CharSequence) this.a);
    }
}
