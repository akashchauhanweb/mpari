package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vm1 extends np {
    public final Application e;
    public ms3 f;
    public ms3 g;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(GetMobDetailsResponse getMobDetailsResponse) {
            ((ms3) this.receiver).m(getMobDetailsResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetMobDetailsResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(DlUpdateMobResponse dlUpdateMobResponse) {
            ((ms3) this.receiver).m(dlUpdateMobResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlUpdateMobResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm1(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.e = app;
        this.f = new ms3();
        this.g = new ms3();
    }

    public final String g(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (ParseException unused) {
            return "";
        }
    }

    public final ms3 h() {
        return this.f;
    }

    public final ms3 i() {
        return this.g;
    }

    public final void j(String p2Dob, String p3Type, boolean z, String p1DlNumber) {
        Intrinsics.checkNotNullParameter(p2Dob, "p2Dob");
        Intrinsics.checkNotNullParameter(p3Type, "p3Type");
        Intrinsics.checkNotNullParameter(p1DlNumber, "p1DlNumber");
        try {
            this.f.n(new tm1(this.e, g(p2Dob), p3Type, z, p1DlNumber).b(), new b(new a(this.f)));
        } catch (Exception unused) {
        }
    }

    public final void k(String p2Dob, String p3Type, String p4OldMob, boolean z, String p1DlNumber, String p5NewMob) {
        Intrinsics.checkNotNullParameter(p2Dob, "p2Dob");
        Intrinsics.checkNotNullParameter(p3Type, "p3Type");
        Intrinsics.checkNotNullParameter(p4OldMob, "p4OldMob");
        Intrinsics.checkNotNullParameter(p1DlNumber, "p1DlNumber");
        Intrinsics.checkNotNullParameter(p5NewMob, "p5NewMob");
        try {
            this.g.n(new gs1(this.e, g(p2Dob), p3Type, p4OldMob, z, p1DlNumber, p5NewMob).b(), new b(new c(this.g)));
        } catch (Exception unused) {
        }
    }
}
