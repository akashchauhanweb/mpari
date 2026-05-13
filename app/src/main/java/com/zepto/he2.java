package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.zepto.je2;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class he2 {
    public static final no3 a = new no3(16);
    public static final ExecutorService b = oc5.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final w26 d = new w26();

    public class a implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ fe2 c;
        public final /* synthetic */ int d;

        public a(String str, Context context, fe2 fe2Var, int i) {
            this.a = str;
            this.b = context;
            this.c = fe2Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return he2.c(this.a, this.b, this.c, this.d);
        }
    }

    public class b implements ux0 {
        public final /* synthetic */ ka0 a;

        public b(ka0 ka0Var) {
            this.a = ka0Var;
        }

        @Override // com.zepto.ux0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    public class c implements Callable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ fe2 c;
        public final /* synthetic */ int d;

        public c(String str, Context context, fe2 fe2Var, int i) {
            this.a = str;
            this.b = context;
            this.c = fe2Var;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return he2.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements ux0 {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.zepto.ux0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            synchronized (he2.c) {
                try {
                    w26 w26Var = he2.d;
                    ArrayList arrayList = (ArrayList) w26Var.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    w26Var.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((ux0) arrayList.get(i)).a(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        public boolean a() {
            return this.b == 0;
        }

        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    public static String a(fe2 fe2Var, int i) {
        return fe2Var.d() + "-" + i;
    }

    public static int b(je2.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        je2.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i = 0;
            for (je2.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, fe2 fe2Var, int i) {
        no3 no3Var = a;
        Typeface typeface = (Typeface) no3Var.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            je2.a aVarE = ee2.e(context, fe2Var, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = wo6.b(context, null, aVarE.b(), i);
            if (typefaceB == null) {
                return new e(-3);
            }
            no3Var.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, fe2 fe2Var, int i, Executor executor, ka0 ka0Var) {
        String strA = a(fe2Var, i);
        Typeface typeface = (Typeface) a.c(strA);
        if (typeface != null) {
            ka0Var.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(ka0Var);
        synchronized (c) {
            try {
                w26 w26Var = d;
                ArrayList arrayList = (ArrayList) w26Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                w26Var.put(strA, arrayList2);
                c cVar = new c(strA, context, fe2Var, i);
                if (executor == null) {
                    executor = b;
                }
                oc5.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, fe2 fe2Var, ka0 ka0Var, int i, int i2) {
        String strA = a(fe2Var, i);
        Typeface typeface = (Typeface) a.c(strA);
        if (typeface != null) {
            ka0Var.b(new e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            e eVarC = c(strA, context, fe2Var, i);
            ka0Var.b(eVarC);
            return eVarC.a;
        }
        try {
            e eVar = (e) oc5.c(b, new a(strA, context, fe2Var, i), i2);
            ka0Var.b(eVar);
            return eVar.a;
        } catch (InterruptedException unused) {
            ka0Var.b(new e(-3));
            return null;
        }
    }
}
