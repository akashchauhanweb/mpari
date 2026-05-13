package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.content.Context;
import com.google.gson.Gson;
import com.zepto.id5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 {
    public static final ea0 a = new ea0();
    public static final be5 b = new tf1(600000, 0, 1.0f);
    public static tc5 c;
    public static Context d;

    public final ic5 a(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "api/updatecustRefid");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNull(json);
        return tc5Var.add(new rk2(1, strStringPlus, ks0.class, json, responseListener, errorErrorListener));
    }

    public final ic5 b(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "doAffirmation");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(commonRequest)");
        return tc5Var.add(new rk2(1, strStringPlus, ss1.class, json, responseListener, errorErrorListener));
    }

    public final ic5 c(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5VarNewRequestQueue = au7.newRequestQueue(d);
        Intrinsics.checkNotNullExpressionValue(tc5VarNewRequestQueue, "newRequestQueue(context)");
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "fetchserverconfig");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(commonRequest)");
        return tc5VarNewRequestQueue.add(new rk2(1, strStringPlus, zk2.class, json, responseListener, errorErrorListener));
    }

    public final ic5 d(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "devprops");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNull(json);
        return tc5Var.add(new rk2(1, strStringPlus, ks0.class, json, responseListener, errorErrorListener));
    }

    public final ic5 e(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "handshake");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(commonRequest)");
        return tc5Var.add(new rk2(1, strStringPlus, zk2.class, json, responseListener, errorErrorListener));
    }

    public final void f(Context context, tc5 requestQueue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestQueue, "requestQueue");
        d = context;
        requestQueue.getCache().clear();
        c = requestQueue;
    }

    public final ic5 g(js0 commonRequest, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(commonRequest, "commonRequest");
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), hs.a.a());
        String json = new Gson().toJson(commonRequest);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(commonRequest)");
        return tc5Var.add(new rk2(1, strStringPlus, p75.class, json, responseListener, errorErrorListener));
    }

    public final ic5 h(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "validatedevice");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNull(json);
        return tc5Var.add(new rk2(1, strStringPlus, os4.class, json, responseListener, errorErrorListener));
    }

    public final ic5 i(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "api/rulesconfig");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNull(json);
        return tc5Var.add(new rk2(1, strStringPlus, jf5.class, json, responseListener, errorErrorListener));
    }

    public final synchronized ic5 j(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        tc5 tc5Var;
        String strStringPlus;
        String json;
        try {
            Intrinsics.checkNotNullParameter(responseListener, "responseListener");
            Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
            tc5Var = c;
            if (tc5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
                tc5Var = null;
            }
            strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "api/rulesresult");
            json = new Gson().toJson(js0Var);
            Intrinsics.checkNotNull(json);
        } catch (Throwable th) {
            throw th;
        }
        return tc5Var.add(new rk2(1, strStringPlus, ks0.class, json, responseListener, errorErrorListener));
    }

    public final ic5 k(js0 js0Var, id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        String strStringPlus = Intrinsics.stringPlus(NativeInteractor.a.u(), "api/skipalert");
        String json = new Gson().toJson(js0Var);
        Intrinsics.checkNotNull(json);
        return tc5Var.add(new rk2(1, strStringPlus, jf5.class, json, responseListener, errorErrorListener));
    }

    public final ic5 l(id5.b responseListener, id5.a errorErrorListener) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(errorErrorListener, "errorErrorListener");
        tc5 tc5Var = c;
        if (tc5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestQueue");
            tc5Var = null;
        }
        return tc5Var.add(new rk2(1, Intrinsics.stringPlus(NativeInteractor.a.u(), "statuscheck"), zk2.class, "", responseListener, errorErrorListener));
    }
}
