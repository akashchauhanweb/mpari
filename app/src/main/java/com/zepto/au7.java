package com.zepto;

import android.content.Context;
import com.zepto.fk1;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class au7 {
    private static final String DEFAULT_CACHE_DIR = "volley";

    public class a implements fk1.d {
        private File cacheDir = null;
        final /* synthetic */ Context val$appContext;

        public a(Context context) {
            this.val$appContext = context;
        }

        @Override // com.zepto.fk1.d
        public File get() {
            if (this.cacheDir == null) {
                this.cacheDir = new File(this.val$appContext.getCacheDir(), au7.DEFAULT_CACHE_DIR);
            }
            return this.cacheDir;
        }
    }

    public static tc5 newRequestQueue(Context context, u40 u40Var) {
        return newRequestQueue(context, u40Var == null ? new f50((u40) new fs2()) : new f50(u40Var));
    }

    @Deprecated
    public static tc5 newRequestQueue(Context context, cs2 cs2Var) {
        if (cs2Var == null) {
            return newRequestQueue(context, (u40) null);
        }
        return newRequestQueue(context, new f50(cs2Var));
    }

    private static tc5 newRequestQueue(Context context, t34 t34Var) {
        tc5 tc5Var = new tc5(new fk1(new a(context.getApplicationContext())), t34Var);
        tc5Var.start();
        return tc5Var;
    }

    public static tc5 newRequestQueue(Context context) {
        return newRequestQueue(context, (u40) null);
    }
}
