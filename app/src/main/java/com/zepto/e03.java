package com.zepto;

import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e03 {
    public static final a a = new a(null);
    public static si2 b;
    public static tb6 c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final si2 a(String rc_number, HashMap serviceSelectionHashMap, String off_code, String stateCode, String rc_chassi_val, String flag, String purPode) {
            Intrinsics.checkNotNullParameter(rc_number, "rc_number");
            Intrinsics.checkNotNullParameter(serviceSelectionHashMap, "serviceSelectionHashMap");
            Intrinsics.checkNotNullParameter(off_code, "off_code");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(rc_chassi_val, "rc_chassi_val");
            Intrinsics.checkNotNullParameter(flag, "flag");
            Intrinsics.checkNotNullParameter(purPode, "purPode");
            e(new si2(rc_number, serviceSelectionHashMap, off_code, purPode, stateCode, rc_chassi_val, flag));
            si2 si2VarC = c();
            Intrinsics.checkNotNull(si2VarC, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.ParcelableData.GenrateDataClass");
            return si2VarC;
        }

        public final tb6 b(String rc_number, String off_code, String stateCode, String rc_chassi_val, String flag, String purPode, String mobile_number) {
            Intrinsics.checkNotNullParameter(rc_number, "rc_number");
            Intrinsics.checkNotNullParameter(off_code, "off_code");
            Intrinsics.checkNotNullParameter(stateCode, "stateCode");
            Intrinsics.checkNotNullParameter(rc_chassi_val, "rc_chassi_val");
            Intrinsics.checkNotNullParameter(flag, "flag");
            Intrinsics.checkNotNullParameter(purPode, "purPode");
            Intrinsics.checkNotNullParameter(mobile_number, "mobile_number");
            f(new tb6(rc_number, off_code, purPode, stateCode, rc_chassi_val, flag, mobile_number));
            tb6 tb6VarD = d();
            Intrinsics.checkNotNull(tb6VarD, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.ParcelableData.TODataClass");
            return tb6VarD;
        }

        public final si2 c() {
            return e03.b;
        }

        public final tb6 d() {
            return e03.c;
        }

        public final void e(si2 si2Var) {
            e03.b = si2Var;
        }

        public final void f(tb6 tb6Var) {
            e03.c = tb6Var;
        }
    }
}
