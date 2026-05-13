package com.zepto;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class zb2 {
    public static final void a(ReadableByteChannel input, FileChannel output) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        try {
            output.transferFrom(input, 0L, LongCompanionObject.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
