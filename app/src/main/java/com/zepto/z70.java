package com.zepto;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface z70 extends d36, WritableByteChannel {
    long H(y46 y46Var);

    z70 J(int i);

    z70 O(byte[] bArr);

    z70 R();

    z70 a(byte[] bArr, int i, int i2);

    u70 c();

    @Override // com.zepto.d36, java.io.Flushable
    void flush();

    z70 h0(t80 t80Var);

    z70 k(long j);

    z70 l0(String str);

    z70 n0(long j);

    z70 t(int i);

    z70 writeInt(int i);
}
