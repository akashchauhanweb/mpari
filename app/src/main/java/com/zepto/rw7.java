package com.zepto;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import com.zepto.rw7;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class rw7 {
    public final e a;

    public static class a extends e {
        public final Window a;
        public final View b;

        public a(Window window, View view) {
            this.a = window;
            this.b = view;
        }

        public static /* synthetic */ void f(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // com.zepto.rw7.e
        public void d(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    i(i2);
                }
            }
        }

        public void g(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void h(int i) {
            this.a.addFlags(i);
        }

        public final void i(int i) {
            if (i == 1) {
                j(4);
                k(1024);
                return;
            }
            if (i == 2) {
                j(2);
                return;
            }
            if (i != 8) {
                return;
            }
            final View viewFindViewById = this.b;
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = this.a.getCurrentFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.a.findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: com.zepto.qw7
                @Override // java.lang.Runnable
                public final void run() {
                    rw7.a.f(viewFindViewById);
                }
            });
        }

        public void j(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void k(int i) {
            this.a.clearFlags(i);
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // com.zepto.rw7.e
        public boolean a() {
            return (this.a.getDecorView().getSystemUiVisibility() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0;
        }

        @Override // com.zepto.rw7.e
        public void c(boolean z) {
            if (!z) {
                j(ConstantsKt.DEFAULT_BUFFER_SIZE);
                return;
            }
            k(67108864);
            h(IntCompanionObject.MIN_VALUE);
            g(ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // com.zepto.rw7.e
        public void b(boolean z) {
            if (!z) {
                j(16);
                return;
            }
            k(134217728);
            h(IntCompanionObject.MIN_VALUE);
            g(16);
        }
    }

    public static class d extends e {
        public final rw7 a;
        public final WindowInsetsController b;
        public final w26 c;
        public Window d;

        public d(Window window, rw7 rw7Var) {
            this(window.getInsetsController(), rw7Var);
            this.d = window;
        }

        @Override // com.zepto.rw7.e
        public boolean a() {
            return (this.b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // com.zepto.rw7.e
        public void b(boolean z) {
            if (z) {
                if (this.d != null) {
                    e(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.d != null) {
                    f(16);
                }
                this.b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // com.zepto.rw7.e
        public void c(boolean z) {
            if (z) {
                if (this.d != null) {
                    e(ConstantsKt.DEFAULT_BUFFER_SIZE);
                }
                this.b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.d != null) {
                    f(ConstantsKt.DEFAULT_BUFFER_SIZE);
                }
                this.b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // com.zepto.rw7.e
        public void d(int i) {
            Window window = this.d;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.b.show(i);
        }

        public void e(int i) {
            View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void f(int i) {
            View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, rw7 rw7Var) {
            this.c = new w26();
            this.b = windowInsetsController;
            this.a = rw7Var;
        }
    }

    public static class e {
        public abstract boolean a();

        public abstract void b(boolean z);

        public abstract void c(boolean z);

        public abstract void d(int i);
    }

    public rw7(WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, this);
    }

    public static rw7 e(WindowInsetsController windowInsetsController) {
        return new rw7(windowInsetsController);
    }

    public boolean a() {
        return this.a.a();
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(int i) {
        this.a.d(i);
    }

    public rw7(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(window, this);
        } else {
            this.a = new c(window, view);
        }
    }
}
