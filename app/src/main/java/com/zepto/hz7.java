package com.zepto;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class hz7 {
    public static final String a = rn3.i("WorkerFactory");

    public class a extends hz7 {
        @Override // com.zepto.hz7
        public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static hz7 c() {
        return new a();
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        androidx.work.c cVarA = a(context, str, workerParameters);
        if (cVarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            } catch (Throwable th) {
                rn3.e().d(a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    cVarA = (androidx.work.c) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    rn3.e().d(a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (cVarA == null || !cVarA.k()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
