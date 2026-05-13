package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import com.zepto.bz7;
import com.zepto.jx7;
import com.zepto.rn3;
import com.zepto.xq0;
import com.zepto.yy7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final String f = rn3.i("ConstraintsCmdHandler");
    public final Context a;
    public final xq0 b;
    public final int c;
    public final d d;
    public final jx7 e;

    public b(Context context, xq0 xq0Var, int i, d dVar) {
        this.a = context;
        this.b = xq0Var;
        this.c = i;
        this.d = dVar;
        this.e = new jx7(dVar.g().m());
    }

    public void a() {
        List<yy7> listU = this.d.g().n().H().u();
        ConstraintProxy.a(this.a, listU);
        ArrayList<yy7> arrayList = new ArrayList(listU.size());
        long jA = this.b.a();
        for (yy7 yy7Var : listU) {
            if (jA >= yy7Var.c() && (!yy7Var.i() || this.e.a(yy7Var))) {
                arrayList.add(yy7Var);
            }
        }
        for (yy7 yy7Var2 : arrayList) {
            String str = yy7Var2.a;
            Intent intentB = a.b(this.a, bz7.a(yy7Var2));
            rn3.e().a(f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.d.f().a().execute(new d.b(this.d, intentB, this.c));
        }
    }
}
