package com.zepto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface ay4 {
    public static final a b = new a(null);
    public static final ay4 a = new a.C0066a();

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.ay4$a$a, reason: collision with other inner class name */
        public static final class C0066a implements ay4 {
            @Override // com.zepto.ay4
            public boolean a(int i, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // com.zepto.ay4
            public boolean b(int i, List responseHeaders, boolean z) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // com.zepto.ay4
            public boolean c(int i, a80 source, int i2, boolean z) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i2);
                return true;
            }

            @Override // com.zepto.ay4
            public void d(int i, y22 errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    boolean a(int i, List list);

    boolean b(int i, List list, boolean z);

    boolean c(int i, a80 a80Var, int i2, boolean z);

    void d(int i, y22 y22Var);
}
