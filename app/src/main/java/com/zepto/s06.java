package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s06 {
    public static final a m = new a(null);
    public static s06 n;
    public Context a;
    public final String b;
    public SharedPreferences c;
    public final SharedPreferences d;
    public final SharedPreferences.Editor e;
    public final d06 f;
    public SharedPreferences.Editor g;
    public String h;
    public String i;
    public String j;
    public ni0 k;
    public String l;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s06 a() {
            return s06.n;
        }

        public final s06 b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (a() == null) {
                c(new s06(context));
            }
            s06 s06VarA = a();
            Intrinsics.checkNotNull(s06VarA);
            return s06VarA;
        }

        public final void c(s06 s06Var) {
            s06.n = s06Var;
        }
    }

    public s06(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = "SharedPreferenceHelper";
        SharedPreferences sharedPreferences = context.getSharedPreferences("encryptsecretkey_new", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.c = sharedPreferences;
        SharedPreferences sharedPreferences2 = this.a.getSharedPreferences("skipAlert", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.d = sharedPreferences2;
        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "alertSharedPreferences.edit()");
        this.e = editorEdit;
        this.f = d06.b.a();
        SharedPreferences.Editor editorEdit2 = this.c.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit2, "encryptedSharedPreferences.edit()");
        this.g = editorEdit2;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = "";
    }

    public final void A() {
        R("app_protectt_handshake", Boolean.TRUE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void B(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File("/data/data/" + ((Object) context.getPackageName()) + "/shared_prefs/secretkey.xml");
        nn3 nn3Var = nn3.a;
        nn3Var.f("SharedTest", Intrinsics.stringPlus("Come outside", Boolean.valueOf(file.exists())));
        if (file.exists()) {
            nn3Var.f("SharedTest", Intrinsics.stringPlus("Come inside", Boolean.valueOf(file.exists())));
            SharedPreferences sharedPreferences = context.getSharedPreferences("secretkey", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ODE_PRIVATE\n            )");
            Map<String, ?> objShard = sharedPreferences.getAll();
            if (objShard == null || objShard.isEmpty()) {
                nn3Var.f("SharedPrefTest", Intrinsics.stringPlus("sharedPreferences", Boolean.valueOf(objShard == null || objShard.isEmpty())));
                return;
            }
            Intrinsics.checkNotNullExpressionValue(objShard, "objShard");
            for (Map.Entry<String, ?> entry : objShard.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    switch (key.hashCode()) {
                        case -1903835493:
                            if (key.equals("app_protectt_handshake")) {
                                Object value = entry.getValue();
                                Intrinsics.checkNotNull(value);
                                if (Intrinsics.areEqual(value, Boolean.TRUE)) {
                                    A();
                                }
                            }
                            break;
                        case -1054103339:
                            if (key.equals("app_protectt_listMobileSessionID") && String.valueOf(entry.getValue()).length() > 0) {
                                jz5[] array = (jz5[]) new Gson().fromJson(String.valueOf(entry.getValue()), jz5[].class);
                                Intrinsics.checkNotNullExpressionValue(array, "array");
                                M(ArraysKt___ArraysKt.toMutableList(array));
                            }
                            break;
                        case 179240059:
                            if (key.equals("app_protectt_custRefIdAPI") && String.valueOf(entry.getValue()).length() > 0) {
                                W(String.valueOf(entry.getValue()));
                            }
                            break;
                        case 557813156:
                            if (key.equals("client_secret") && String.valueOf(entry.getValue()).length() > 0) {
                                R(entry.getKey().toString(), String.valueOf(entry.getValue()));
                            }
                            break;
                    }
                }
            }
            sharedPreferences.edit().clear().apply();
            if (file.delete()) {
                return;
            }
            nn3.c(nn3.a, this.b, Intrinsics.stringPlus("Failed to delete SharedPreferences file: ", file.getAbsolutePath()), null, 4, null);
        }
    }

    public final void C(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.e.putString(d(key), d(value));
        this.e.apply();
    }

    public final void D(zy zyVar) {
        nn3.a.f(this.b, Intrinsics.stringPlus("verifyCertificateChain:-", new Gson().toJson(zyVar)));
        if (zyVar != null) {
            String json = new Gson().toJson(zyVar);
            Intrinsics.checkNotNullExpressionValue(json, "json");
            R("app_protectt_Device_Total_Info", json);
        }
    }

    public final void E(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ru5 ru5Var = new ru5();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        S(ru5Var.f("app_protectt_Base_Url", nativeInteractor.b1()), new ru5().f(url, nativeInteractor.b1()));
    }

    public final void F(String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        R("app_protectt_BlockListApp", appName);
    }

    public final void G(ni0 ni0Var) {
        String json = new Gson().toJson(ni0Var);
        Intrinsics.checkNotNullExpressionValue(json, "json");
        R("app_protectt_imageFileChannelDetials", json);
    }

    public final void H(String clientSecret) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        R("client_secret", clientSecret);
    }

    public final void I(String str) {
        Intrinsics.checkNotNull(str);
        R("app_protectt_dateTimeForRuleConfigAPI", str);
    }

    public final void J(String details) {
        Intrinsics.checkNotNullParameter(details, "details");
        R("app_protectt_Device_Info_v2", details);
    }

    public final void K(String devInfo) {
        Intrinsics.checkNotNullParameter(devInfo, "devInfo");
        if (Intrinsics.areEqual(devInfo, "[]")) {
            return;
        }
        R("app_protectt_Device_Info", devInfo);
    }

    public final void L(String str) {
        String strF = eg5.a.f();
        Intrinsics.checkNotNull(str);
        R(strF, str);
    }

    public final void M(List list) {
        try {
            String json = new Gson().toJson(list);
            Intrinsics.checkNotNullExpressionValue(json, "json");
            R("app_protectt_listMobileSessionID", json);
        } catch (Exception e) {
            nn3.c(nn3.a, this.b, e.toString(), null, 4, null);
        }
    }

    public final void N() {
        R("app_protectt_props", Boolean.TRUE);
    }

    public final void O(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        R("app_protectt_ssl_pub_date", date);
    }

    public final void P(String pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        R("app_protectt_ssl_pub_key", pubKey);
    }

    public final void Q(String trust) {
        Intrinsics.checkNotNullParameter(trust, "trust");
        R("app_protectt_server_trust", trust);
    }

    public final void R(String str, Object obj) {
        if (obj instanceof String) {
            this.g.putString(d(str), d((String) obj));
        } else if (!(obj instanceof Integer) && !(obj instanceof Boolean) && !(obj instanceof Long)) {
            return;
        } else {
            this.g.putString(d(str), d(obj.toString()));
        }
        this.g.apply();
    }

    public final void S(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.g.putString(key, value);
        this.g.apply();
    }

    public final void T(String str) {
        Intrinsics.checkNotNull(str);
        R("app_protectt_threatDetectedFlag", str);
    }

    public final void U(String str) {
        Intrinsics.checkNotNull(str);
        R("app_protectt_threatDetectedReasion", str);
    }

    public final void V(String str) {
        Intrinsics.checkNotNull(str);
        R("app_protectt_uniqueMobileSessionID", str);
    }

    public final void W(String str) {
        Intrinsics.checkNotNull(str);
        R("app_protectt_custRefIdAPI", str);
    }

    public final String c(String str) {
        return this.f.c(str, l06.e.a().c());
    }

    public final String d(String str) {
        return this.f.d(str, l06.e.a().c());
    }

    public final int e() {
        return Integer.parseInt(k("app_protectt_appversioncode", 13).toString());
    }

    public final zy f() {
        try {
            return (zy) new Gson().fromJson(k("app_protectt_Device_Total_Info", "").toString(), zy.class);
        } catch (Exception e) {
            nn3.c(nn3.a, this.b, e.toString(), null, 4, null);
            return null;
        }
    }

    public final String g() {
        return k("app_protectt_BlockListApp", "").toString();
    }

    public final ni0 h() {
        ni0 ni0Var = this.k;
        if (ni0Var != null) {
            return ni0Var;
        }
        try {
            ni0 ni0Var2 = (ni0) new Gson().fromJson(k("app_protectt_imageFileChannelDetials", "").toString(), ni0.class);
            this.k = ni0Var2;
            return ni0Var2;
        } catch (Exception e) {
            nn3 nn3Var = nn3.a;
            String name = s06.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "this.javaClass.name");
            nn3Var.b(name, e.toString(), e);
            return null;
        }
    }

    public final String i() {
        if (this.h.length() == 0) {
            this.h = k("client_secret", "").toString();
        }
        return this.h;
    }

    public final String j() {
        return k("app_protectt_dateTimeForRuleConfigAPI", "").toString();
    }

    public final Object k(String str, Object obj) {
        String string = this.c.getString(d(str), obj.toString());
        if (string == null || string.length() == 0 || Intrinsics.areEqual(string, obj.toString())) {
            return obj;
        }
        String strC = c(string);
        return (strC.length() == 0 || Intrinsics.areEqual(strC, obj)) ? obj : strC;
    }

    public final String l() {
        return k("app_protectt_Device_Info_v2", "").toString();
    }

    public final String m() {
        return k("app_protectt_Device_Info", "").toString();
    }

    public final boolean n() {
        return Boolean.parseBoolean(k("app_protectt_handshake", Boolean.FALSE).toString());
    }

    public final String o() {
        return k(eg5.a.f(), "").toString();
    }

    public final List p() {
        ArrayList arrayList = new ArrayList();
        try {
            String json = new Gson().toJson(arrayList);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(defaultList)");
            String string = k("app_protectt_listMobileSessionID", json).toString();
            nn3 nn3Var = nn3.a;
            String name = s06.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "this.javaClass.name");
            nn3Var.f(name, Intrinsics.stringPlus("getListMSID json : ", string));
            jz5[] array = (jz5[]) new Gson().fromJson(string, jz5[].class);
            Intrinsics.checkNotNullExpressionValue(array, "array");
            return ArraysKt___ArraysKt.toMutableList(array);
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public final boolean q() {
        return Boolean.parseBoolean(k("app_protectt_props", Boolean.FALSE).toString());
    }

    public final String r() {
        return k("app_protectt_ssl_pub_date", "").toString();
    }

    public final String s() {
        return k("app_protectt_ssl_pub_key", "").toString();
    }

    public final String t() {
        String str = this.l;
        return str.length() == 0 ? k("app_protectt_server_trust", "").toString() : str;
    }

    public final String u(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return String.valueOf(this.c.getString(key, ""));
    }

    public final String v() {
        if (this.j.length() == 0) {
            this.j = k("app_protectt_threatDetectedFlag", "online").toString();
        }
        return this.j;
    }

    public final String w() {
        return k("app_protectt_threatDetectedReasion", "this is online flow").toString();
    }

    public final String x() {
        if (this.i.length() == 0) {
            this.i = k("app_protectt_uniqueMobileSessionID", "").toString();
        }
        return this.i;
    }

    public final String y() {
        return k("app_protectt_custRefIdAPI", "").toString();
    }

    public final String z(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Map<String, ?> all = this.d.getAll();
        return ((all.keySet().isEmpty() ^ true) && all.keySet().contains(d(id))) ? c(String.valueOf(all.get(d(id)))) : "";
    }
}
