package com.zepto;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vv4 {
    public static final a e = new a(null);
    public static final Map f = new HashMap();
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (vv4.f) {
                try {
                    Map map = vv4.f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }
    }

    public vv4(String name, File lockDir, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.a = z;
        File file = new File(lockDir, name + ".lck");
        this.b = file;
        a aVar = e;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        this.c = aVar.b(absolutePath);
    }

    public static /* synthetic */ void c(vv4 vv4Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vv4Var.a;
        }
        vv4Var.b(z);
    }

    public final void b(boolean z) {
        this.c.lock();
        if (z) {
            try {
                File parentFile = this.b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.b).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
