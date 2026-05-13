package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.c;
import com.zepto.aj6;
import com.zepto.cp6;
import com.zepto.fe2;
import com.zepto.je2;
import com.zepto.lu4;
import com.zepto.sv0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.AbstractC0011c {
    public static final a j = new a();

    public static class a {
        public Typeface a(Context context, je2.b bVar) {
            return je2.a(context, null, new je2.b[]{bVar});
        }

        public je2.a b(Context context, fe2 fe2Var) {
            return je2.b(context, null, fe2Var);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.g {
        public final Context a;
        public final fe2 b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public c.h h;
        public ContentObserver i;
        public Runnable j;

        public b(Context context, fe2 fe2Var, a aVar) {
            lu4.h(context, "Context cannot be null");
            lu4.h(fe2Var, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = fe2Var;
            this.c = aVar;
        }

        @Override // androidx.emoji2.text.c.g
        public void a(c.h hVar) {
            lu4.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = hVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        je2.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            aj6.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.c.a(this.a, bVarE);
                            ByteBuffer byteBufferE = cp6.e(this.a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferE);
                            aj6.b();
                            synchronized (this.d) {
                                try {
                                    c.h hVar = this.h;
                                    if (hVar != null) {
                                        hVar.b(fVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            aj6.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            try {
                                c.h hVar2 = this.h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = sv0.b("emojiCompat");
                        this.g = threadPoolExecutorB;
                        this.f = threadPoolExecutorB;
                    }
                    this.f.execute(new Runnable() { // from class: com.zepto.ge2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.c.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final je2.b e() {
            try {
                je2.a aVarB = this.c.b(this.a, this.b);
                if (aVarB.c() == 0) {
                    je2.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public e(Context context, fe2 fe2Var) {
        super(new b(context, fe2Var, j));
    }

    public e c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
