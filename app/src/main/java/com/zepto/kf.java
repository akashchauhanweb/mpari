package com.zepto;

import android.content.Context;
import android.content.Intent;
import com.zepto.Cif;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends Cif {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return a.a(input);
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Cif.a b(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new Cif.a(MapsKt__MapsKt.emptyMap());
        }
        for (String str : input) {
            if (yy0.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(input.length), 16));
        for (String str2 : input) {
            Pair pair = TuplesKt.to(str2, Boolean.TRUE);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new Cif.a(linkedHashMap);
    }

    @Override // com.zepto.Cif
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return MapsKt__MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return MapsKt__MapsKt.toMap(CollectionsKt___CollectionsKt.zip(ArraysKt___ArraysKt.filterNotNull(stringArrayExtra), arrayList));
        }
        return MapsKt__MapsKt.emptyMap();
    }
}
