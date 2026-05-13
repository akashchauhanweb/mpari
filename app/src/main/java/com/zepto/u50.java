package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class u50 implements e73 {
    public final InputStream a;

    public u50(InputStream inputStream) {
        this.a = inputStream;
    }

    public static e73 b(byte[] bArr) {
        return new u50(new ByteArrayInputStream(bArr));
    }

    @Override // com.zepto.e73
    public g22 a() throws IOException {
        try {
            return g22.Z(this.a, g72.b());
        } finally {
            this.a.close();
        }
    }

    @Override // com.zepto.e73
    public a73 read() throws IOException {
        try {
            return a73.e0(this.a, g72.b());
        } finally {
            this.a.close();
        }
    }
}
