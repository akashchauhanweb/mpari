package com.zepto;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class dy {
    public static dy c(Bundle bundle, mc8 mc8Var, vf8 vf8Var) {
        return d(bundle, mc8Var, vf8Var, new ArrayList(), new o98() { // from class: com.zepto.q98
            @Override // com.zepto.o98
            public final int a(int i, String str) {
                return i;
            }
        });
    }

    public static dy d(Bundle bundle, mc8 mc8Var, vf8 vf8Var, List list, o98 o98Var) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            map.put(str, AssetPackState.i(bundle, str, mc8Var, vf8Var, o98Var));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            map.put(str2, AssetPackState.h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
        }
        return new ba8(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map a();

    public abstract long b();
}
