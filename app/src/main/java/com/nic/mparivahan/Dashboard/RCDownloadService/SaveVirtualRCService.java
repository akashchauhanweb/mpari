package com.nic.mparivahan.Dashboard.RCDownloadService;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MparCitizenDocInfo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.cq;
import com.zepto.gd1;
import com.zepto.hs1;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.s14;
import com.zepto.s44;
import com.zepto.tu5;
import com.zepto.ws6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/Dashboard/RCDownloadService/SaveVirtualRCService;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Lcom/nic/mparivahan/RC/Model/GetVirtualDocDetails;", "virtualdetails", "", "s", "", "dl", "doc", "Landroid/content/Context;", "context", "r", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SaveVirtualRCService extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.Dashboard.RCDownloadService.SaveVirtualRCService$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, GetVirtualDocDetails list) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(list, "list");
            try {
                androidx.work.b bVarA = new b.a().b("RC", new Gson().toJson(list)).a();
                Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
                iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(SaveVirtualRCService.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(Ref.ObjectRef objectRef, Context context, String str, String str2) {
            this.a = objectRef;
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Intrinsics.checkNotNullParameter(call, "call");
            new DatabaseHelper(this.b).Q0(this.d, null, this.c, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLWithoutdobModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                DLWithoutdobModel dLWithoutdobModel = (DLWithoutdobModel) objFromJson;
                if (gd1.a.m(dLWithoutdobModel.getDlobj().getDlLicno())) {
                    new DatabaseHelper(this.b).Q0(this.d, null, this.c, null);
                    return;
                }
                DatabaseHelper databaseHelper = new DatabaseHelper(this.b);
                String string = StringsKt__StringsKt.trim((CharSequence) dLWithoutdobModel.getDlobj().getDlLicno()).toString();
                String str2 = this.c;
                BioObj bioObj = dLWithoutdobModel.getBioObj();
                databaseHelper.Q0(string, null, str2, bioObj != null ? bioObj.getBioDob() : null);
            } catch (Exception e) {
                e.printStackTrace();
                new DatabaseHelper(this.b).Q0(this.d, null, this.c, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveVirtualRCService(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            GetVirtualDocDetails getVirtualDocDetails = (GetVirtualDocDetails) new Gson().fromJson(String.valueOf(f().m("RC")), GetVirtualDocDetails.class);
            Intrinsics.checkNotNull(getVirtualDocDetails);
            s(getVirtualDocDetails);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("eRRO", Unit.INSTANCE.toString());
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void r(String dl, String doc, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(doc, "doc");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        DlService dlServiceA = DlService.INSTANCE.a(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, null, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        dlServiceA.getDlDetailsWitoutDOB(s14.a.u() + APIController.a().GetLicenceDetails(), aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new b(objectRef, context, doc, dl));
    }

    public final void s(GetVirtualDocDetails virtualdetails) {
        Intrinsics.checkNotNullParameter(virtualdetails, "virtualdetails");
        cq cqVar = new cq(this.context);
        String str = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Intrinsics.checkNotNull(str);
        cqVar.h(str);
        DatabaseHelper databaseHelper = new DatabaseHelper(this.context);
        ArrayList<MparCitizenDocInfo> mparCitizenDocInfo = virtualdetails.getMparCitizenDocInfo();
        if (mparCitizenDocInfo.size() > 0) {
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this.context);
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            databaseHelperD0.k0();
            databaseHelperD0.close();
        }
        int size = mparCitizenDocInfo.size();
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) mparCitizenDocInfo.get(i).getDocType()).toString(), "RC", true)) {
                databaseHelper.R0(mparCitizenDocInfo.get(i).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i).getDocId()), null, 0);
                RCDownloads.INSTANCE.a(this.context, String.valueOf(mparCitizenDocInfo.get(i).getDocId()));
            }
            if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) mparCitizenDocInfo.get(i).getDocType()).toString(), "DL", true)) {
                gd1.a aVar = gd1.a;
                if (aVar.m(mparCitizenDocInfo.get(i).getDocDob())) {
                    r(mparCitizenDocInfo.get(i).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i).getDocId()), this.context);
                } else {
                    String docNumber = mparCitizenDocInfo.get(i).getDocNumber();
                    if (aVar.m(mparCitizenDocInfo.get(i).getDocDob()) || StringsKt__StringsJVMKt.equals(mparCitizenDocInfo.get(i).getDocDob(), "null", true)) {
                        r(docNumber, String.valueOf(mparCitizenDocInfo.get(i).getDocId()), this.context);
                    } else {
                        databaseHelper.O0(docNumber, null, String.valueOf(mparCitizenDocInfo.get(i).getDocId()), mparCitizenDocInfo.get(i).getDocDob());
                    }
                }
            }
        }
    }
}
