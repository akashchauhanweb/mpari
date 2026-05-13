package com.zepto;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dd6 implements Iterable {
    public final ArrayList c = new ArrayList();
    public final Context e;

    public interface a {
        Intent V();
    }

    public dd6(Context context) {
        this.e = context;
    }

    public static dd6 u(Context context) {
        return new dd6(context);
    }

    public void B() {
        D(null);
    }

    public void D(Bundle bundle) {
        if (this.c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.c.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (yy0.l(this.e, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.e.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.c.iterator();
    }

    public dd6 j(Intent intent) {
        this.c.add(intent);
        return this;
    }

    public dd6 m(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.e.getPackageManager());
        }
        if (component != null) {
            r(component);
        }
        j(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dd6 n(Activity activity) {
        Intent intentV = activity instanceof a ? ((a) activity).V() : null;
        if (intentV == null) {
            intentV = v24.a(activity);
        }
        if (intentV != null) {
            ComponentName component = intentV.getComponent();
            if (component == null) {
                component = intentV.resolveActivity(this.e.getPackageManager());
            }
            r(component);
            j(intentV);
        }
        return this;
    }

    public dd6 r(ComponentName componentName) {
        int size = this.c.size();
        try {
            Intent intentB = v24.b(this.e, componentName);
            while (intentB != null) {
                this.c.add(size, intentB);
                intentB = v24.b(this.e, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public Intent w(int i) {
        return (Intent) this.c.get(i);
    }

    public int z() {
        return this.c.size();
    }
}
