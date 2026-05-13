package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.zepto.cz0;
import com.zepto.nx;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public final Executor a;
    public final Map b = new nx();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public interface InterfaceC0042a {
        Task start();
    }

    public a(Executor executor) {
        this.a = executor;
    }

    public synchronized Task b(final String str, InterfaceC0042a interfaceC0042a) {
        Task task = (Task) this.b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskI = interfaceC0042a.start().i(this.a, new cz0() { // from class: com.zepto.nc5
            @Override // com.zepto.cz0
            public final Object a(Task task2) {
                return this.a.c(str, task2);
            }
        });
        this.b.put(str, taskI);
        return taskI;
    }

    public final /* synthetic */ Task c(String str, Task task) {
        synchronized (this) {
            this.b.remove(str);
        }
        return task;
    }
}
