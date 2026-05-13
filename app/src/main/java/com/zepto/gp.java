package com.zepto;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gp extends Handler {
    public static final gp a = new gp();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        fp fpVar = fp.c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iB = hp.b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        fpVar.a(loggerName, iB, message, record.getThrown());
    }
}
