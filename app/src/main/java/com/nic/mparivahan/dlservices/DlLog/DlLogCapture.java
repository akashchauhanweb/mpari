package com.nic.mparivahan.dlservices.DlLog;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.mt6;
import com.zepto.s44;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J~\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/dlservices/DlLog/DlLogCapture;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "sarlogAadhar4", "sarlogApplCat", "sarlogApplDate", "", "sarlogApplNo", "", "sarlogCtzId", "sarlogDlDob", "sarlogDlNumber", "sarlog_eKYC", "sarlog_eSign", "sarlogGender", "sarlogMobileNo", "", "sarlogOrgDonor", "sarlogPurCd", "sarlogRtoCd", "sarlogStateCd", "", "r", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlLogCapture extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, String sarlogAadhar4, String sarlogApplCat, String sarlogApplDate, long j, int i, String sarlogDlDob, String sarlogDlNumber, String sarlog_eKYC, String sarlog_eSign, String sarlogGender, String sarlogMobileNo, boolean z, String sarlogPurCd, String sarlogRtoCd, String sarlogStateCd) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sarlogAadhar4, "sarlogAadhar4");
            Intrinsics.checkNotNullParameter(sarlogApplCat, "sarlogApplCat");
            Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
            Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
            Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
            Intrinsics.checkNotNullParameter(sarlog_eKYC, "sarlog_eKYC");
            Intrinsics.checkNotNullParameter(sarlog_eSign, "sarlog_eSign");
            Intrinsics.checkNotNullParameter(sarlogGender, "sarlogGender");
            Intrinsics.checkNotNullParameter(sarlogMobileNo, "sarlogMobileNo");
            Intrinsics.checkNotNullParameter(sarlogPurCd, "sarlogPurCd");
            Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
            Intrinsics.checkNotNullParameter(sarlogStateCd, "sarlogStateCd");
            androidx.work.b bVarA = new b.a().b("sarlogAadhar4", sarlogAadhar4).b("sarlogApplCat", sarlogApplCat).b("sarlogApplDate", sarlogApplDate).b("sarlogApplNo", Long.valueOf(j)).b("sarlogCtzId", Integer.valueOf(i)).b("sarlogDlDob", sarlogDlDob).b("sarlogDlNumber", sarlogDlNumber).b("sarlog_eKYC", sarlog_eKYC).b("sarlog_eSign", sarlog_eSign).b("sarlogGender", sarlogGender).b("sarlogMobileNo", sarlogMobileNo).b("sarlogOrgDonor", Boolean.valueOf(z)).b("sarlogPurCd", sarlogPurCd).b("sarlogRtoCd", sarlogRtoCd).b("sarlogStateCd", sarlogStateCd).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(DlLogCapture.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Log.d("valiii", String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DlLogCapture(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(String.valueOf(f().m("sarlogAadhar4")), String.valueOf(f().m("sarlogApplCat")), String.valueOf(f().m("sarlogApplDate")), f().l("sarlogApplNo", 0L), f().j("sarlogCtzId", 0), String.valueOf(f().m("sarlogDlDob")), String.valueOf(f().m("sarlogDlNumber")), String.valueOf(f().m("sarlog_eKYC")), String.valueOf(f().m("sarlog_eSign")), String.valueOf(f().m("sarlogGender")), String.valueOf(f().m("sarlogMobileNo")), f().h("sarlogOrgDonor", false), String.valueOf(f().m("sarlogPurCd")), String.valueOf(f().m("sarlogRtoCd")), String.valueOf(f().m("sarlogStateCd")));
        } catch (Exception unused) {
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    public final void r(String sarlogAadhar4, String sarlogApplCat, String sarlogApplDate, long sarlogApplNo, int sarlogCtzId, String sarlogDlDob, String sarlogDlNumber, String sarlog_eKYC, String sarlog_eSign, String sarlogGender, String sarlogMobileNo, boolean sarlogOrgDonor, String sarlogPurCd, String sarlogRtoCd, String sarlogStateCd) {
        Intrinsics.checkNotNullParameter(sarlogAadhar4, "sarlogAadhar4");
        Intrinsics.checkNotNullParameter(sarlogApplCat, "sarlogApplCat");
        Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
        Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
        Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
        Intrinsics.checkNotNullParameter(sarlog_eKYC, "sarlog_eKYC");
        Intrinsics.checkNotNullParameter(sarlog_eSign, "sarlog_eSign");
        Intrinsics.checkNotNullParameter(sarlogGender, "sarlogGender");
        Intrinsics.checkNotNullParameter(sarlogMobileNo, "sarlogMobileNo");
        Intrinsics.checkNotNullParameter(sarlogPurCd, "sarlogPurCd");
        Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
        Intrinsics.checkNotNullParameter(sarlogStateCd, "sarlogStateCd");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        DlLogInterface dlLogInterfaceA = DlLogInterface.INSTANCE.a(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.B(sarlogAadhar4, sarlogApplCat, sarlogApplDate, sarlogApplNo, sarlogCtzId, sarlogDlDob, sarlogDlNumber, sarlog_eKYC, sarlog_eSign, sarlogGender, sarlogMobileNo, sarlogOrgDonor, sarlogPurCd, sarlogRtoCd, sarlogStateCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        dlLogInterfaceA.saveSarathiLog(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf));
    }
}
