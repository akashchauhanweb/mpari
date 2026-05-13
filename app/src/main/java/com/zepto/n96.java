package com.zepto;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface n96 extends Closeable {
    boolean L();

    boolean V();

    void Y();

    void a0(String str, Object[] objArr);

    String b();

    void b0();

    int c0(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    void f();

    void g();

    boolean isOpen();

    List l();

    Cursor o(q96 q96Var, CancellationSignal cancellationSignal);

    void r(String str);

    Cursor r0(String str);

    Cursor y(q96 q96Var);

    r96 z(String str);
}
