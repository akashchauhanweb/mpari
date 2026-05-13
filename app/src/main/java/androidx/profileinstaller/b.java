package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import com.zepto.d22;
import com.zepto.ow4;
import com.zepto.pj1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public final AssetManager a;
    public final Executor b;
    public final c.InterfaceC0021c c;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public pj1[] j;
    public byte[] k;
    public boolean i = false;
    public final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0021c interfaceC0021c, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = interfaceC0021c;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    public static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
        }
        return null;
    }

    public static boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        switch (i) {
        }
        return false;
    }

    public final b b(pj1[] pj1VarArr, byte[] bArr) {
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.b(9, e);
        } catch (IOException e2) {
            this.c.b(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.b(8, e3);
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.j = ow4.q(inputStreamH, ow4.o(inputStreamH, ow4.b), bArr, pj1VarArr);
            inputStreamH.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.e.canWrite()) {
            this.i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.b(6, e);
            return null;
        } catch (IOException e2) {
            this.c.b(7, e2);
            return null;
        }
    }

    public final /* synthetic */ void g(int i, Object obj) {
        this.c.b(i, obj);
    }

    public final InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.a(5, null);
            }
            return null;
        }
    }

    public b i() {
        b bVarB;
        c();
        if (this.d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.a);
        if (inputStreamF != null) {
            this.j = j(inputStreamF);
        }
        pj1[] pj1VarArr = this.j;
        return (pj1VarArr == null || !k() || (bVarB = b(pj1VarArr, this.d)) == null) ? this : bVarB;
    }

    public final pj1[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        pj1[] pj1VarArrW = ow4.w(inputStream, ow4.o(inputStream, ow4.a), this.f);
                        try {
                            inputStream.close();
                            return pj1VarArrW;
                        } catch (IOException e) {
                            this.c.b(7, e);
                            return pj1VarArrW;
                        }
                    } catch (IOException e2) {
                        this.c.b(7, e2);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.b(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.b(7, e4);
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.b(7, e5);
            }
            throw th;
        }
    }

    public final void l(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: com.zepto.gj1
            @Override // java.lang.Runnable
            public final void run() {
                this.c.g(i, obj);
            }
        });
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        pj1[] pj1VarArr = this.j;
        byte[] bArr = this.d;
        if (pj1VarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.c.b(7, e);
            } catch (IllegalStateException e2) {
                this.c.b(8, e2);
            }
            try {
                ow4.E(byteArrayOutputStream, bArr);
                if (!ow4.B(byteArrayOutputStream, bArr, pj1VarArr)) {
                    this.c.b(5, null);
                    this.j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    try {
                        d22.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                l(6, e);
                return false;
            } catch (IOException e2) {
                l(7, e2);
                return false;
            }
        } finally {
            this.k = null;
            this.j = null;
        }
    }
}
