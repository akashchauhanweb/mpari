package com.zepto;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.zepto.ix7;

/* JADX INFO: loaded from: classes.dex */
public class fx7 extends Binder {
    public final a a;

    public interface a {
        Task a(Intent intent);
    }

    public fx7(a aVar) {
        this.a = aVar;
    }

    public void c(final ix7.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.a.a(aVar.a).c(new hw4(), new jg4() { // from class: com.zepto.ex7
            @Override // com.zepto.jg4
            public final void a(Task task) {
                aVar.d();
            }
        });
    }
}
