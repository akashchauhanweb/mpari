package com.zepto;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface a80 extends y46, ReadableByteChannel {
    String E();

    byte[] G();

    boolean I();

    byte[] K(long j);

    long S();

    long T(d36 d36Var);

    String W(long j);

    boolean Z(long j, t80 t80Var);

    u70 c();

    void j0(long j);

    t80 p();

    t80 q(long j);

    byte readByte();

    int readInt();

    short readShort();

    long s0();

    void skip(long j);

    String t0(Charset charset);

    boolean u(long j);

    InputStream u0();

    int v0(th4 th4Var);
}
