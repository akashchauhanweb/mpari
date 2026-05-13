package com.zepto;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.ul2;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class of1 implements tl2, ul2 {
    public final nx4 a;
    public final Context b;
    public final nx4 c;
    public final Set d;
    public final Executor e;

    public of1(final Context context, final String str, Set set, nx4 nx4Var, Executor executor) {
        this(new nx4() { // from class: com.zepto.nf1
            @Override // com.zepto.nx4
            public final Object get() {
                return of1.j(context, str);
            }
        }, set, executor, nx4Var, context);
    }

    public static ut0 g() {
        final ky4 ky4VarA = ky4.a(v30.class, Executor.class);
        return ut0.f(of1.class, tl2.class, ul2.class).b(hi1.j(Context.class)).b(hi1.j(hc2.class)).b(hi1.l(rl2.class)).b(hi1.k(vr6.class)).b(hi1.i(ky4VarA)).e(new iu0() { // from class: com.zepto.kf1
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return of1.h(ky4VarA, cu0Var);
            }
        }).d();
    }

    public static /* synthetic */ of1 h(ky4 ky4Var, cu0 cu0Var) {
        return new of1((Context) cu0Var.a(Context.class), ((hc2) cu0Var.a(hc2.class)).n(), cu0Var.c(rl2.class), cu0Var.g(vr6.class), (Executor) cu0Var.f(ky4Var));
    }

    public static /* synthetic */ vl2 j(Context context, String str) {
        return new vl2(context, str);
    }

    @Override // com.zepto.tl2
    public Task a() {
        return vs6.a(this.b) ^ true ? gd6.e("") : gd6.c(this.e, new Callable() { // from class: com.zepto.lf1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.i();
            }
        });
    }

    @Override // com.zepto.ul2
    public synchronized ul2.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        vl2 vl2Var = (vl2) this.a.get();
        if (!vl2Var.i(jCurrentTimeMillis)) {
            return ul2.a.NONE;
        }
        vl2Var.g();
        return ul2.a.GLOBAL;
    }

    public final /* synthetic */ String i() {
        String string;
        synchronized (this) {
            try {
                vl2 vl2Var = (vl2) this.a.get();
                List listC = vl2Var.c();
                vl2Var.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < listC.size(); i++) {
                    wl2 wl2Var = (wl2) listC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", wl2Var.c());
                    jSONObject.put("dates", new JSONArray((Collection) wl2Var.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", VContant.APPLICATION_SCREEN);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public final /* synthetic */ Void k() {
        synchronized (this) {
            ((vl2) this.a.get()).k(System.currentTimeMillis(), ((vr6) this.c.get()).a());
        }
        return null;
    }

    public Task l() {
        if (this.d.size() > 0 && !(!vs6.a(this.b))) {
            return gd6.c(this.e, new Callable() { // from class: com.zepto.mf1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.k();
                }
            });
        }
        return gd6.e(null);
    }

    public of1(nx4 nx4Var, Set set, Executor executor, nx4 nx4Var2, Context context) {
        this.a = nx4Var;
        this.d = set;
        this.e = executor;
        this.c = nx4Var2;
        this.b = context;
    }
}
