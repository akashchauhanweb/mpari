package com.zepto;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class jq3 {
    public final d a;
    public final iq3 b;
    public final View c;

    public static class b implements d {
        public OnBackInvokedCallback a;

        public b() {
        }

        @Override // com.zepto.jq3.d
        public void a(iq3 iq3Var, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(iq3Var);
                this.a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? DurationKt.NANOS_IN_MILLIS : 0, onBackInvokedCallbackC);
            }
        }

        @Override // com.zepto.jq3.d
        public void b(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }

        public OnBackInvokedCallback c(final iq3 iq3Var) {
            Objects.requireNonNull(iq3Var);
            return new OnBackInvokedCallback() { // from class: com.zepto.lq3
                public final void onBackInvoked() {
                    iq3Var.b();
                }
            };
        }

        public boolean d() {
            return this.a != null;
        }
    }

    public static class c extends b {

        public class a implements OnBackAnimationCallback {
            public final /* synthetic */ iq3 a;

            public a(iq3 iq3Var) {
                this.a = iq3Var;
            }

            public void onBackCancelled() {
                if (c.this.d()) {
                    this.a.d();
                }
            }

            public void onBackInvoked() {
                this.a.b();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (c.this.d()) {
                    this.a.c(new n30(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (c.this.d()) {
                    this.a.a(new n30(backEvent));
                }
            }
        }

        public c() {
            super();
        }

        @Override // com.zepto.jq3.b
        public OnBackInvokedCallback c(iq3 iq3Var) {
            return new a(iq3Var);
        }
    }

    public interface d {
        void a(iq3 iq3Var, View view, boolean z);

        void b(View view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jq3(View view) {
        this((iq3) view, view);
    }

    public static d a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new c();
        }
        if (i >= 33) {
            return new b();
        }
        return null;
    }

    public boolean b() {
        return this.a != null;
    }

    public void c() {
        d(false);
    }

    public final void d(boolean z) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(this.b, this.c, z);
        }
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.a;
        if (dVar != null) {
            dVar.b(this.c);
        }
    }

    public jq3(iq3 iq3Var, View view) {
        this.a = a();
        this.b = iq3Var;
        this.c = view;
    }
}
