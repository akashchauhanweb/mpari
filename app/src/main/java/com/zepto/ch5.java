package com.zepto;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ch5 implements o96, fh1 {
    public final Context c;
    public final String e;
    public final File f;
    public final Callable g;
    public final int h;
    public final o96 i;
    public ud1 j;
    public boolean k;

    public ch5(Context context, String str, File file, Callable callable, int i, o96 delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.c = context;
        this.e = str;
        this.f = file;
        this.g = callable;
        this.h = i;
        this.i = delegate;
    }

    @Override // com.zepto.o96, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.k = false;
    }

    public final void d(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.e != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.c.getAssets().open(this.e));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.g;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.c.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        zb2.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        e(intermediateFile, z);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final void e(File file, boolean z) {
        ud1 ud1Var = this.j;
        if (ud1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            ud1Var = null;
        }
        ud1Var.getClass();
    }

    @Override // com.zepto.o96
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // com.zepto.fh1
    public o96 getDelegate() {
        return this.i;
    }

    public final void j(ud1 databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.j = databaseConfiguration;
    }

    public final void m(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databaseFile = this.c.getDatabasePath(databaseName);
        ud1 ud1Var = this.j;
        ud1 ud1Var2 = null;
        if (ud1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            ud1Var = null;
        }
        boolean z2 = ud1Var.s;
        File filesDir = this.c.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
        vv4 vv4Var = new vv4(databaseName, filesDir, z2);
        try {
            vv4.c(vv4Var, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    d(databaseFile, z);
                    vv4Var.d();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int iC = n41.c(databaseFile);
                if (iC == this.h) {
                    vv4Var.d();
                    return;
                }
                ud1 ud1Var3 = this.j;
                if (ud1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    ud1Var2 = ud1Var3;
                }
                if (ud1Var2.a(iC, this.h)) {
                    vv4Var.d();
                    return;
                }
                if (this.c.deleteDatabase(databaseName)) {
                    try {
                        d(databaseFile, z);
                    } catch (IOException e2) {
                        Log.w("ROOM", "Unable to copy database file.", e2);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                vv4Var.d();
                return;
            } catch (IOException e3) {
                Log.w("ROOM", "Unable to read database version.", e3);
                vv4Var.d();
                return;
            }
        } catch (Throwable th) {
            vv4Var.d();
            throw th;
        }
        vv4Var.d();
        throw th;
    }

    @Override // com.zepto.o96
    public n96 o0() {
        if (!this.k) {
            m(true);
            this.k = true;
        }
        return getDelegate().o0();
    }

    @Override // com.zepto.o96
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
