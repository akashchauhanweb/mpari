package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.zepto.ay7;
import com.zepto.bz7;
import com.zepto.e43;
import com.zepto.jx7;
import com.zepto.jy7;
import com.zepto.kx7;
import com.zepto.mg4;
import com.zepto.nx0;
import com.zepto.pe2;
import com.zepto.rn3;
import com.zepto.uc6;
import com.zepto.x52;
import com.zepto.yy7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a implements mg4, x52 {
    public static final String k = rn3.i("SystemFgDispatcher");
    public Context a;
    public jy7 b;
    public final uc6 c;
    public final Object d = new Object();
    public ay7 e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final jx7 i;
    public b j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0032a implements Runnable {
        public final /* synthetic */ String c;

        public RunnableC0032a(String str) {
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            yy7 yy7VarG = a.this.b.k().g(this.c);
            if (yy7VarG == null || !yy7VarG.i()) {
                return;
            }
            synchronized (a.this.d) {
                a.this.g.put(bz7.a(yy7VarG), yy7VarG);
                a aVar = a.this;
                a.this.h.put(bz7.a(yy7VarG), kx7.b(aVar.i, yy7VarG, aVar.c.d(), a.this));
            }
        }
    }

    public interface b {
        void b(int i);

        void c(int i, int i2, Notification notification);

        void d(int i, Notification notification);

        void stop();
    }

    public a(Context context) {
        this.a = context;
        jy7 jy7VarI = jy7.i(context);
        this.b = jy7VarI;
        this.c = jy7VarI.o();
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new jx7(this.b.m());
        this.b.k().e(this);
    }

    public static Intent e(Context context, ay7 ay7Var, pe2 pe2Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", pe2Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pe2Var.a());
        intent.putExtra("KEY_NOTIFICATION", pe2Var.b());
        intent.putExtra("KEY_WORKSPEC_ID", ay7Var.b());
        intent.putExtra("KEY_GENERATION", ay7Var.a());
        return intent;
    }

    public static Intent f(Context context, ay7 ay7Var, pe2 pe2Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", ay7Var.b());
        intent.putExtra("KEY_GENERATION", ay7Var.a());
        intent.putExtra("KEY_NOTIFICATION_ID", pe2Var.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pe2Var.a());
        intent.putExtra("KEY_NOTIFICATION", pe2Var.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // com.zepto.mg4
    public void b(yy7 yy7Var, nx0 nx0Var) {
        if (nx0Var instanceof nx0.b) {
            String str = yy7Var.a;
            rn3.e().a(k, "Constraints unmet for WorkSpec " + str);
            this.b.s(bz7.a(yy7Var));
        }
    }

    @Override // com.zepto.x52
    public void d(ay7 ay7Var, boolean z) {
        Map.Entry entry;
        synchronized (this.d) {
            try {
                e43 e43Var = ((yy7) this.g.remove(ay7Var)) != null ? (e43) this.h.remove(ay7Var) : null;
                if (e43Var != null) {
                    e43Var.d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pe2 pe2Var = (pe2) this.f.remove(ay7Var);
        if (ay7Var.equals(this.e)) {
            if (this.f.size() > 0) {
                Iterator it = this.f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.e = (ay7) entry.getKey();
                if (this.j != null) {
                    pe2 pe2Var2 = (pe2) entry.getValue();
                    this.j.c(pe2Var2.c(), pe2Var2.a(), pe2Var2.b());
                    this.j.b(pe2Var2.c());
                }
            } else {
                this.e = null;
            }
        }
        b bVar = this.j;
        if (pe2Var == null || bVar == null) {
            return;
        }
        rn3.e().a(k, "Removing Notification (id: " + pe2Var.c() + ", workSpecId: " + ay7Var + ", notificationType: " + pe2Var.a());
        bVar.b(pe2Var.c());
    }

    public final void h(Intent intent) {
        rn3.e().f(k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.b.e(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        ay7 ay7Var = new ay7(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        rn3.e().a(k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.j == null) {
            return;
        }
        this.f.put(ay7Var, new pe2(intExtra, notification, intExtra2));
        if (this.e == null) {
            this.e = ay7Var;
            this.j.c(intExtra, intExtra2, notification);
            return;
        }
        this.j.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((pe2) ((Map.Entry) it.next()).getValue()).a();
        }
        pe2 pe2Var = (pe2) this.f.get(this.e);
        if (pe2Var != null) {
            this.j.c(pe2Var.c(), iA, pe2Var.b());
        }
    }

    public final void j(Intent intent) {
        rn3.e().f(k, "Started foreground service " + intent);
        this.c.c(new RunnableC0032a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent) {
        rn3.e().f(k, "Stopping foreground service");
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void l() {
        this.j = null;
        synchronized (this.d) {
            try {
                Iterator it = this.h.values().iterator();
                while (it.hasNext()) {
                    ((e43) it.next()).d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.k().p(this);
    }

    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    public void n(b bVar) {
        if (this.j != null) {
            rn3.e().c(k, "A callback already exists.");
        } else {
            this.j = bVar;
        }
    }
}
