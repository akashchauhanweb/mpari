package com.zepto;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface lz0 {
    public static final a b = new a(null);
    public static final lz0 a = new a.C0103a();

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.lz0$a$a, reason: collision with other inner class name */
        public static final class C0103a implements lz0 {
            @Override // com.zepto.lz0
            public void a(ds2 url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // com.zepto.lz0
            public List b(ds2 url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(ds2 ds2Var, List list);

    List b(ds2 ds2Var);
}
