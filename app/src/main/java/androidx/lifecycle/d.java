package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.df3;
import com.zepto.rf1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k {
    public final rf1 c;
    public final k e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            try {
                iArr[h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public d(rf1 defaultLifecycleObserver, k kVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.c = defaultLifecycleObserver;
        this.e = kVar;
    }

    @Override // androidx.lifecycle.k
    public void e(df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.a[event.ordinal()]) {
            case 1:
                this.c.g(source);
                break;
            case 2:
                this.c.b(source);
                break;
            case 3:
                this.c.h(source);
                break;
            case 4:
                this.c.d(source);
                break;
            case 5:
                this.c.f(source);
                break;
            case 6:
                this.c.a(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.e;
        if (kVar != null) {
            kVar.e(source, event);
        }
    }
}
