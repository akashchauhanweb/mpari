package com.zepto;

import ai.protectt.app.security.common.helper.AppBlackListingSharedPreferenceHelper;
import ai.protectt.app.security.common.helper.RuleConfigSharedPreferenceHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l06 {
    public static final a e = new a(null);
    public static l06 f;
    public final String a = "SharePrefSingleton";
    public HashMap b = new HashMap();
    public List c = new ArrayList();
    public String d = "";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l06 a() {
            if (l06.f == null) {
                l06.f = new l06();
            }
            l06 l06Var = l06.f;
            Intrinsics.checkNotNull(l06Var);
            return l06Var;
        }
    }

    public final String c() {
        try {
            if (this.d.length() == 0) {
                this.d = new ru5().g();
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
        return this.d;
    }

    public final List d() {
        try {
            if (this.c.isEmpty()) {
                this.c = AppBlackListingSharedPreferenceHelper.f.a().k();
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
        return this.c;
    }

    public final List e() {
        try {
            if (this.b.isEmpty()) {
                RuleConfigSharedPreferenceHelper ruleConfigSharedPreferenceHelperA = RuleConfigSharedPreferenceHelper.f.a();
                Intrinsics.checkNotNull(ruleConfigSharedPreferenceHelperA);
                HashMap mapH = ruleConfigSharedPreferenceHelperA.h();
                mo5.a.l(true);
                if (mapH != null && !mapH.isEmpty()) {
                    this.b = mapH;
                }
            }
            Collection collectionValues = this.b.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "getAllRulesSingleton.values");
            return CollectionsKt___CollectionsKt.toMutableList(collectionValues);
        } catch (Exception e2) {
            nn3.a.b(this.a, e2.toString(), e2);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public final List f() {
        try {
            List listE = e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (Intrinsics.areEqual(((if5) obj).getDefaultValue(), "Y")) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public final HashMap g() {
        return this.b;
    }

    public final y60 h(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            return AppBlackListingSharedPreferenceHelper.f.a().l(packageName);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            return null;
        }
    }

    public final if5 i(int i) {
        try {
            return (if5) this.b.get(Integer.valueOf(i));
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            return null;
        }
    }
}
