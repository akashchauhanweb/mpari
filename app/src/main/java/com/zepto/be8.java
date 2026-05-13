package com.zepto;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class be8 {
    public static final z68 g = new z68("ExtractorSessionStoreView");
    public final s98 a;
    public final lc8 b;
    public final mc8 c;
    public final lc8 d;
    public final Map e = new HashMap();
    public final ReentrantLock f = new ReentrantLock();

    public be8(s98 s98Var, lc8 lc8Var, mc8 mc8Var, lc8 lc8Var2) {
        this.a = s98Var;
        this.b = lc8Var;
        this.c = mc8Var;
        this.d = lc8Var2;
    }

    public static String q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new bc8("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    public static List r(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final /* synthetic */ Boolean a(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        if (((vd8) this.e.get(numValueOf)).c.d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!r98.c(r0.c.d, bundle.getInt(v88.a("status", q(bundle)))));
    }

    public final /* synthetic */ Boolean b(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(numValueOf)) {
            vd8 vd8VarO = o(i);
            int i2 = bundle.getInt(v88.a("status", vd8VarO.c.a));
            td8 td8Var = vd8VarO.c;
            int i3 = td8Var.d;
            if (r98.c(i3, i2)) {
                g.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i3));
                td8 td8Var2 = vd8VarO.c;
                String str = td8Var2.a;
                int i4 = td8Var2.d;
                if (i4 == 4) {
                    ((zm8) this.b.a()).c(i, str);
                } else if (i4 == 5) {
                    ((zm8) this.b.a()).b(i);
                } else if (i4 == 6) {
                    ((zm8) this.b.a()).f(Arrays.asList(str));
                }
            } else {
                td8Var.d = i2;
                if (r98.d(i2)) {
                    l(i);
                    this.c.c(vd8VarO.c.a);
                } else {
                    for (xd8 xd8Var : td8Var.f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(v88.b("chunk_intents", vd8VarO.c.a, xd8Var.a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    ((gd8) xd8Var.d.get(i5)).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strQ = q(bundle);
            long j = bundle.getLong(v88.a("pack_version", strQ));
            String string = bundle.getString(v88.a("pack_version_tag", strQ), "");
            int i6 = bundle.getInt(v88.a("status", strQ));
            long j2 = bundle.getLong(v88.a("total_bytes_to_download", strQ));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(v88.a("slice_ids", strQ));
            ArrayList arrayList = new ArrayList();
            for (String str2 : r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(v88.b("chunk_intents", strQ, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = r(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new gd8(z));
                    z = true;
                }
                String string2 = bundle.getString(v88.b("uncompressed_hash_sha256", strQ, str2));
                long j3 = bundle.getLong(v88.b("uncompressed_size", strQ, str2));
                int i7 = bundle.getInt(v88.b("patch_format", strQ, str2), 0);
                arrayList.add(i7 != 0 ? new xd8(str2, string2, j3, arrayList2, 0, i7) : new xd8(str2, string2, j3, arrayList2, bundle.getInt(v88.b("compression_format", strQ, str2), 0), 0));
                z = true;
            }
            this.e.put(Integer.valueOf(i), new vd8(i, bundle.getInt("app_version_code"), new td8(strQ, j, i6, j2, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public final /* synthetic */ Object c(String str, int i, long j) {
        vd8 vd8Var = (vd8) s(Arrays.asList(str)).get(str);
        if (vd8Var == null || r98.d(vd8Var.c.d)) {
            g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.a.d(str, i, j);
        vd8Var.c.d = 4;
        return null;
    }

    public final /* synthetic */ Object d(int i, int i2) {
        o(i).c.d = 5;
        return null;
    }

    public final /* synthetic */ Object e(int i) {
        vd8 vd8VarO = o(i);
        td8 td8Var = vd8VarO.c;
        if (!r98.d(td8Var.d)) {
            throw new bc8(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        this.a.d(td8Var.a, vd8VarO.b, td8Var.b);
        td8 td8Var2 = vd8VarO.c;
        int i2 = td8Var2.d;
        if (i2 != 5 && i2 != 6) {
            return null;
        }
        this.a.e(td8Var2.a, vd8VarO.b, td8Var2.b);
        return null;
    }

    public final Map f() {
        return this.e;
    }

    public final /* synthetic */ Map g(List list) {
        HashMap map = new HashMap();
        for (vd8 vd8Var : this.e.values()) {
            String str = vd8Var.c.a;
            if (list.contains(str)) {
                vd8 vd8Var2 = (vd8) map.get(str);
                if ((vd8Var2 == null ? -1 : vd8Var2.a) < vd8Var.a) {
                    map.put(str, vd8Var);
                }
            }
        }
        return map;
    }

    public final void h() {
        this.f.lock();
    }

    public final void i(final String str, final int i, final long j) {
        p(new zd8() { // from class: com.zepto.cd8
            @Override // com.zepto.zd8
            public final Object a() {
                this.a.c(str, i, j);
                return null;
            }
        });
    }

    public final void j() {
        this.f.unlock();
    }

    public final void k(final int i, int i2) {
        final int i3 = 5;
        p(new zd8(i, i3) { // from class: com.zepto.vc8
            public final /* synthetic */ int b;

            @Override // com.zepto.zd8
            public final Object a() {
                this.a.d(this.b, 5);
                return null;
            }
        });
    }

    public final void l(final int i) {
        p(new zd8() { // from class: com.zepto.uc8
            @Override // com.zepto.zd8
            public final Object a() {
                this.a.e(i);
                return null;
            }
        });
    }

    public final boolean m(final Bundle bundle) {
        return ((Boolean) p(new zd8() { // from class: com.zepto.yc8
            @Override // com.zepto.zd8
            public final Object a() {
                return this.a.a(bundle);
            }
        })).booleanValue();
    }

    public final boolean n(final Bundle bundle) {
        return ((Boolean) p(new zd8() { // from class: com.zepto.ad8
            @Override // com.zepto.zd8
            public final Object a() {
                return this.a.b(bundle);
            }
        })).booleanValue();
    }

    public final vd8 o(int i) {
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        vd8 vd8Var = (vd8) map.get(numValueOf);
        if (vd8Var != null) {
            return vd8Var;
        }
        throw new bc8(String.format("Could not find session %d while trying to get it", numValueOf), i);
    }

    public final Object p(zd8 zd8Var) {
        try {
            this.f.lock();
            return zd8Var.a();
        } finally {
            this.f.unlock();
        }
    }

    public final Map s(final List list) {
        return (Map) p(new zd8() { // from class: com.zepto.fd8
            @Override // com.zepto.zd8
            public final Object a() {
                return this.a.g(list);
            }
        });
    }
}
