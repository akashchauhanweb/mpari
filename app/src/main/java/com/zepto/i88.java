package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i88 implements zm8 {
    public static final z68 g = new z68("AssetPackServiceImpl");
    public static final Intent h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String a;
    public final mc8 b;
    public final vf8 c;
    public d88 d;
    public d88 e;
    public final AtomicBoolean f = new AtomicBoolean();

    public i88(Context context, mc8 mc8Var, vf8 vf8Var) {
        this.a = context.getPackageName();
        this.b = mc8Var;
        this.c = vf8Var;
        if (ub8.b(context)) {
            Context contextA = pb8.a(context);
            z68 z68Var = g;
            Intent intent = h;
            gn8 gn8Var = new s78() { // from class: com.zepto.gn8
                @Override // com.zepto.s78
                public final Object a(IBinder iBinder) {
                    return vl8.d(iBinder);
                }
            };
            this.d = new d88(contextA, z68Var, "AssetPackService", intent, gn8Var, null);
            this.e = new d88(pb8.a(context), z68Var, "AssetPackService-keepAlive", intent, gn8Var, null);
        }
        g.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static Bundle i(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    public static pc6 j() {
        g.b("onError(%d)", -11);
        return fd6.b(new ay(-11));
    }

    public static /* bridge */ /* synthetic */ Bundle l(int i, String str, String str2, int i2) {
        Bundle bundleY = y(i, str);
        bundleY.putString("slice_id", str2);
        bundleY.putInt("chunk_number", i2);
        return bundleY;
    }

    public static /* bridge */ /* synthetic */ Bundle o(Map map) {
        Bundle bundleH = h();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleH.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleH;
    }

    public static /* bridge */ /* synthetic */ ArrayList u(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List v(i88 i88Var, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState assetPackState = (AssetPackState) dy.c((Bundle) it.next(), i88Var.b, i88Var.c).a().values().iterator().next();
            if (assetPackState == null) {
                g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (r98.a(assetPackState.d())) {
                arrayList.add(assetPackState.c());
            }
        }
        return arrayList;
    }

    public static Bundle y(int i, String str) {
        Bundle bundleI = i(i);
        bundleI.putString("module_name", str);
        return bundleI;
    }

    @Override // com.zepto.zm8
    public final void a(int i, String str, String str2, int i2) {
        if (this.d == null) {
            throw new bc8("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.d("notifyChunkTransferred", new Object[0]);
        rh8 rh8Var = new rh8();
        this.d.q(new y68(this, rh8Var, i, str, str2, i2, rh8Var), rh8Var);
    }

    @Override // com.zepto.zm8
    public final void b(int i) {
        if (this.d == null) {
            throw new bc8("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.d("notifySessionFailed", new Object[0]);
        rh8 rh8Var = new rh8();
        this.d.q(new h78(this, rh8Var, i, rh8Var), rh8Var);
    }

    @Override // com.zepto.zm8
    public final void c(int i, String str) {
        k(i, str, 10);
    }

    @Override // com.zepto.zm8
    public final pc6 d(Map map) {
        if (this.d == null) {
            return j();
        }
        g.d("syncPacks", new Object[0]);
        rh8 rh8Var = new rh8();
        this.d.q(new v68(this, rh8Var, map, rh8Var), rh8Var);
        return rh8Var.a();
    }

    @Override // com.zepto.zm8
    public final pc6 e(int i, String str, String str2, int i2) {
        if (this.d == null) {
            return j();
        }
        g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        rh8 rh8Var = new rh8();
        this.d.q(new l78(this, rh8Var, i, str, str2, i2, rh8Var), rh8Var);
        return rh8Var.a();
    }

    @Override // com.zepto.zm8
    public final void f(List list) {
        if (this.d == null) {
            return;
        }
        g.d("cancelDownloads(%s)", list);
        rh8 rh8Var = new rh8();
        this.d.q(new s68(this, rh8Var, list, rh8Var), rh8Var);
    }

    @Override // com.zepto.zm8
    public final synchronized void g() {
        if (this.e == null) {
            g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        z68 z68Var = g;
        z68Var.d("keepAlive", new Object[0]);
        if (!this.f.compareAndSet(false, true)) {
            z68Var.d("Service is already kept alive.", new Object[0]);
        } else {
            rh8 rh8Var = new rh8();
            this.e.q(new n78(this, rh8Var, rh8Var), rh8Var);
        }
    }

    public final void k(int i, String str, int i2) {
        if (this.d == null) {
            throw new bc8("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.d("notifyModuleCompleted", new Object[0]);
        rh8 rh8Var = new rh8();
        this.d.q(new c78(this, rh8Var, i, str, rh8Var, i2), rh8Var);
    }
}
