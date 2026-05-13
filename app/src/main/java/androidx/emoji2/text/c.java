package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.zepto.dp6;
import com.zepto.k12;
import com.zepto.l12;
import com.zepto.lu4;
import com.zepto.qx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static volatile c p;
    public final Set b;
    public final b e;
    public final g f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final boolean j;
    public final int k;
    public final int l;
    public final d m;
    public final ReadWriteLock a = new ReentrantReadWriteLock();
    public volatile int c = 3;
    public final Handler d = new Handler(Looper.getMainLooper());

    public static final class a extends b {
        public volatile androidx.emoji2.text.d b;
        public volatile androidx.emoji2.text.f c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0010a extends h {
            public C0010a() {
            }

            @Override // androidx.emoji2.text.c.h
            public void a(Throwable th) {
                a.this.a.m(th);
            }

            @Override // androidx.emoji2.text.c.h
            public void b(androidx.emoji2.text.f fVar) {
                a.this.d(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public void a() {
            try {
                this.a.f.a(new C0010a());
            } catch (Throwable th) {
                this.a.m(th);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.g);
        }

        public void d(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = fVar;
            androidx.emoji2.text.f fVar2 = this.c;
            i iVar = new i();
            d dVar = this.a.m;
            c cVar = this.a;
            this.b = new androidx.emoji2.text.d(fVar2, iVar, dVar, cVar.h, cVar.i);
            this.a.n();
        }
    }

    public static class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z);

        public abstract void c(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0011c {
        public final g a;
        public boolean b;
        public boolean c;
        public int[] d;
        public Set e;
        public boolean f;
        public int g = -16711936;
        public int h = 0;
        public d i = new androidx.emoji2.text.b();

        public AbstractC0011c(g gVar) {
            lu4.h(gVar, "metadataLoader cannot be null.");
            this.a = gVar;
        }

        public final g a() {
            return this.a;
        }

        public AbstractC0011c b(int i) {
            this.h = i;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class f implements Runnable {
        public final List c;
        public final Throwable e;
        public final int f;

        public f(e eVar, int i) {
            this(Arrays.asList((e) lu4.h(eVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.c.size();
            int i = 0;
            if (this.f != 1) {
                while (i < size) {
                    ((e) this.c.get(i)).a(this.e);
                    i++;
                }
            } else {
                while (i < size) {
                    ((e) this.c.get(i)).b();
                    i++;
                }
            }
        }

        public f(Collection collection, int i) {
            this(collection, i, null);
        }

        public f(Collection collection, int i, Throwable th) {
            lu4.h(collection, "initCallbacks cannot be null");
            this.c = new ArrayList(collection);
            this.f = i;
            this.e = th;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    public static class i {
        public l12 a(k12 k12Var) {
            return new dp6(k12Var);
        }
    }

    public c(AbstractC0011c abstractC0011c) {
        this.g = abstractC0011c.b;
        this.h = abstractC0011c.c;
        this.i = abstractC0011c.d;
        this.j = abstractC0011c.f;
        this.k = abstractC0011c.g;
        this.f = abstractC0011c.a;
        this.l = abstractC0011c.h;
        this.m = abstractC0011c.i;
        qx qxVar = new qx();
        this.b = qxVar;
        Set set = abstractC0011c.e;
        if (set != null && !set.isEmpty()) {
            qxVar.addAll(abstractC0011c.e);
        }
        this.e = new a(this);
        l();
    }

    public static c b() {
        c cVar;
        synchronized (n) {
            cVar = p;
            lu4.i(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return androidx.emoji2.text.d.c(inputConnection, editable, i2, i3, z);
    }

    public static boolean f(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.d(editable, i2, keyEvent);
    }

    public static c g(AbstractC0011c abstractC0011c) {
        c cVar = p;
        if (cVar == null) {
            synchronized (n) {
                try {
                    cVar = p;
                    if (cVar == null) {
                        cVar = new c(abstractC0011c);
                        p = cVar;
                    }
                } finally {
                }
            }
        }
        return cVar;
    }

    public static boolean h() {
        return p != null;
    }

    public int c() {
        return this.k;
    }

    public int d() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.j;
    }

    public final boolean j() {
        return d() == 1;
    }

    public void k() {
        lu4.i(this.l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.a();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void l() {
        this.a.writeLock().lock();
        try {
            if (this.l == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (d() == 0) {
                this.e.a();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i2, int i3) {
        return q(charSequence, i2, i3, IntCompanionObject.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i2, int i3, int i4) {
        return r(charSequence, i2, i3, i4, 0);
    }

    public CharSequence r(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        lu4.i(j(), "Not initialized yet");
        lu4.e(i2, "start cannot be negative");
        lu4.e(i3, "end cannot be negative");
        lu4.e(i4, "maxEmojiCount cannot be negative");
        lu4.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        lu4.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        lu4.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.g : false;
        } else {
            z = true;
        }
        return this.e.b(charSequence, i2, i3, i4, z);
    }

    public void s(e eVar) {
        lu4.h(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new f(eVar, this.c));
            } else {
                this.b.add(eVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void t(e eVar) {
        lu4.h(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(eVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.c(editorInfo);
    }
}
