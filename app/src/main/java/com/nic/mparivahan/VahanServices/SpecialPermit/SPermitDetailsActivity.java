package com.nic.mparivahan.VahanServices.SpecialPermit;

import android.R;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data;
import com.nic.mparivahan.VahanServices.SpecialPermit.SPermitDetailsActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.hz0;
import com.zepto.j37;
import com.zepto.lg;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.xd6;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bz\u0010{J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R&\u00105\u001a\u0012\u0012\u0004\u0012\u00020\n01j\b\u0012\u0004\u0012\u00020\n`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010@\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00107R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00107R\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00107R\u0016\u0010F\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00107R\u0016\u0010H\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00107R2\u0010O\u001a\u0012\u0012\u0004\u0012\u00020I01j\b\u0012\u0004\u0012\u00020I`28\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010\\\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u00107\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010h\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u00107\u001a\u0004\bf\u0010Y\"\u0004\bg\u0010[R\"\u0010l\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u00107\u001a\u0004\bj\u0010Y\"\u0004\bk\u0010[R\"\u0010p\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u00107\u001a\u0004\bn\u0010Y\"\u0004\bo\u0010[R\"\u0010t\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010R\u001a\u0004\br\u0010T\"\u0004\bs\u0010VR\"\u0010y\u001a\u0010\u0012\f\u0012\n w*\u0004\u0018\u00010v0v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010x¨\u0006|"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SpecialPermit/SPermitDetailsActivity;", "Lcom/zepto/pq;", "", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "", "message", "G1", "Lcom/zepto/lg;", "C", "Lcom/zepto/lg;", "binding", "Lcom/zepto/o47;", "D", "Lcom/zepto/o47;", "t1", "()Lcom/zepto/o47;", "K1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "E", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "u1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "L1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "x1", "()Landroid/app/ProgressDialog;", "O1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "natureOfGoodsArrayList", "I", "Ljava/lang/String;", "validFromDate", "J", "validUptoDate", "K", "periodModeSelectedValue", "L", "periodCountValue", "M", "selectedServiceType", "N", "allotmentOffice", "O", "routeLength", "P", "selectedGoodsNature", "Q", "selectedGoods", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/VaSplPassengerdto;", "R", "getPassangeList", "()Ljava/util/ArrayList;", "setPassangeList", "(Ljava/util/ArrayList;)V", "passangeList", "", "S", "Z", "isPassangerListAttach", "()Z", "setPassangerListAttach", "(Z)V", "T", "y1", "()Ljava/lang/String;", "P1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "U", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "V", "w1", "N1", "off_code", "W", "s1", "J1", "aadhar_name", "X", "r1", "I1", "aadhar_address", "Y", "F1", "setFaceless", "isFaceless", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lcom/zepto/of;", "getResult", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SPermitDetailsActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public lg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList natureOfGoodsArrayList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String validFromDate = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String validUptoDate = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String periodModeSelectedValue = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String periodCountValue = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String selectedServiceType = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String allotmentOffice = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String routeLength = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String selectedGoodsNature = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String selectedGoods = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList passangeList = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean isPassangerListAttach;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public final of getResult;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            lg lgVar = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            SPermitDetailsActivity sPermitDetailsActivity = SPermitDetailsActivity.this;
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
            sPermitDetailsActivity.selectedGoodsNature = (String) itemAtPosition;
            lg lgVar2 = SPermitDetailsActivity.this.binding;
            if (lgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar2 = null;
            }
            if (lgVar2.D.getSelectedItemPosition() != 0) {
                SPermitDetailsActivity.this.x1().show();
                o47 o47VarT1 = SPermitDetailsActivity.this.t1();
                SPermitDetailsActivity sPermitDetailsActivity2 = SPermitDetailsActivity.this;
                lg lgVar3 = sPermitDetailsActivity2.binding;
                if (lgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lgVar = lgVar3;
                }
                o47VarT1.i(sPermitDetailsActivity2, lgVar.D.getSelectedItem().toString(), "UP");
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            lg lgVar = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            SPermitDetailsActivity sPermitDetailsActivity = SPermitDetailsActivity.this;
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
            sPermitDetailsActivity.selectedGoods = (String) itemAtPosition;
            if (StringsKt__StringsJVMKt.equals(SPermitDetailsActivity.this.selectedGoods, "OTHER", true)) {
                lg lgVar2 = SPermitDetailsActivity.this.binding;
                if (lgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    lgVar2 = null;
                }
                lgVar2.G.setVisibility(0);
                lg lgVar3 = SPermitDetailsActivity.this.binding;
                if (lgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lgVar = lgVar3;
                }
                lgVar.F.setVisibility(0);
                return;
            }
            lg lgVar4 = SPermitDetailsActivity.this.binding;
            if (lgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar4 = null;
            }
            lgVar4.G.setVisibility(8);
            lg lgVar5 = SPermitDetailsActivity.this.binding;
            if (lgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                lgVar = lgVar5;
            }
            lgVar.F.setVisibility(8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(CalValidity calValidity) {
            SPermitDetailsActivity.this.x1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                Object goodsType = calValidity.getData().getGoodsType();
                Intrinsics.checkNotNull(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) goodsType;
                arrayList.add(0, "Select Goods");
                xd6 xd6Var = new xd6(SPermitDetailsActivity.this, arrayList);
                lg lgVar = SPermitDetailsActivity.this.binding;
                if (lgVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    lgVar = null;
                }
                lgVar.z.setAdapter((SpinnerAdapter) xd6Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CalValidity) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (SPermitDetailsActivity.this.x1().isShowing()) {
                SPermitDetailsActivity.this.x1().dismiss();
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (SPermitDetailsActivity.this.x1().isShowing()) {
                SPermitDetailsActivity.this.x1().dismiss();
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SaveDraftSpPermitResponse saveDraftSpPermitResponse) {
            try {
                if (SPermitDetailsActivity.this.x1().isShowing()) {
                    SPermitDetailsActivity.this.x1().dismiss();
                }
                ApiMessage apiMessage = saveDraftSpPermitResponse.getApiMessage();
                Intrinsics.checkNotNull(apiMessage);
                if (apiMessage.getStatusCode() != 200) {
                    if ((saveDraftSpPermitResponse.getApiMessage().getStatusCode() == 400 || saveDraftSpPermitResponse.getApiMessage().getStatusCode() == 404) && saveDraftSpPermitResponse.getApiMessage().getDeveloperMessage().length() > 0) {
                        SPermitDetailsActivity sPermitDetailsActivity = SPermitDetailsActivity.this;
                        sPermitDetailsActivity.G1(sPermitDetailsActivity, saveDraftSpPermitResponse.getApiMessage().getDeveloperMessage());
                        return;
                    }
                    return;
                }
                Intent intent = new Intent(SPermitDetailsActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.SPEICAL_PERMIT_CODE);
                intent.putExtra(VContant.SPEICAL_PERMIT_CODE, saveDraftSpPermitResponse.getData());
                Data data = saveDraftSpPermitResponse.getData();
                intent.putExtra(VContant.APP_NO, data != null ? data.getApplNo() : null);
                NrvDetails nrvDetailsZ1 = SPermitDetailsActivity.this.z1();
                intent.putExtra("state_code", nrvDetailsZ1 != null ? nrvDetailsZ1.getState_cd() : null);
                intent.putExtra("rc_number", SPermitDetailsActivity.this.y1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.SPEICAL_PERMIT_PURPOSE_CODE);
                intent.putExtra("off_code", SPermitDetailsActivity.this.w1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, SPermitDetailsActivity.this.getIsFaceless());
                intent.putExtra("RC", SPermitDetailsActivity.this.y1());
                intent.putExtra("RcDetails", SPermitDetailsActivity.this.z1());
                intent.putExtra(VContant.NEXGEN_addahar_name, SPermitDetailsActivity.this.s1());
                intent.putExtra(VContant.NEXGEN_addahar_address, SPermitDetailsActivity.this.r1());
                SPermitDetailsActivity.this.startActivity(intent);
                SPermitDetailsActivity.this.finishAffinity();
            } catch (Exception e) {
                e.printStackTrace();
                if (SPermitDetailsActivity.this.x1().isShowing()) {
                    SPermitDetailsActivity.this.x1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SaveDraftSpPermitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
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

    public SPermitDetailsActivity() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.zg5
            @Override // com.zepto.hf
            public final void a(Object obj) {
                SPermitDetailsActivity.A1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getResult = ofVarB0;
    }

    public static final void A1(SPermitDetailsActivity this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Calling result...", "Running..");
        if (gfVar.d() == 78) {
            Intent intentC = gfVar.c();
            lg lgVar = null;
            Serializable serializableExtra = intentC != null ? intentC.getSerializableExtra("input") : null;
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto> }");
            ArrayList arrayList = (ArrayList) serializableExtra;
            this$0.passangeList = arrayList;
            if (arrayList.size() > 0) {
                lg lgVar2 = this$0.binding;
                if (lgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lgVar = lgVar2;
                }
                lgVar.w.setText("View & Edit Passenger List");
            }
        }
    }

    private final void B1() {
        String strL = VContant.INSTANCE.L(this, VContant.SPEICAL_PERMIT_PURPOSE_CODE);
        lg lgVar = this.binding;
        lg lgVar2 = null;
        if (lgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar = null;
        }
        lgVar.T.i.setText(strL);
        K1((o47) new z(this, new n47(new j37(u1()))).a(o47.class));
        if (this.validUptoDate != "") {
            lg lgVar3 = this.binding;
            if (lgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar3 = null;
            }
            lgVar3.a0.setText(this.validUptoDate);
        }
        if (this.natureOfGoodsArrayList.size() > 0) {
            this.natureOfGoodsArrayList.add(0, "Select Nature of  Goods");
            ArrayList arrayList = this.natureOfGoodsArrayList;
            Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_spinner_item, arrayList);
            arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            lg lgVar4 = this.binding;
            if (lgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar4 = null;
            }
            lgVar4.D.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        lg lgVar5 = this.binding;
        if (lgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar5 = null;
        }
        lgVar5.D.setOnItemSelectedListener(new a());
        lg lgVar6 = this.binding;
        if (lgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar6 = null;
        }
        lgVar6.z.setOnItemSelectedListener(new b());
        lg lgVar7 = this.binding;
        if (lgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar7 = null;
        }
        lgVar7.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitDetailsActivity.C1(this.a, view);
            }
        });
        lg lgVar8 = this.binding;
        if (lgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar8 = null;
        }
        lgVar8.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitDetailsActivity.D1(this.a, view);
            }
        });
        lg lgVar9 = this.binding;
        if (lgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            lgVar2 = lgVar9;
        }
        lgVar2.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitDetailsActivity.E1(this.a, view);
            }
        });
    }

    public static final void C1(SPermitDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) PassangerResultActivity.class);
        intent.putExtra("PassagerList", this$0.passangeList);
        intent.putExtra("SeatingCap", "4");
        this$0.getResult.a(intent);
    }

    public static final void D1(SPermitDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void E1(SPermitDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lg lgVar = this$0.binding;
        if (lgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar = null;
        }
        if (String.valueOf(lgVar.V.getText()).length() <= 3) {
            Toast.makeText(this$0, this$0.v1().b("pls_enterTempTravelFrom", this$0.getString(com.nic.mparivahan.R.string.please_enter_travel_from)), 1).show();
            return;
        }
        lg lgVar2 = this$0.binding;
        if (lgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar2 = null;
        }
        if (String.valueOf(lgVar2.X.getText()).length() <= 3) {
            Toast.makeText(this$0, this$0.v1().b("pls_enterTempTravelUpto", this$0.getString(com.nic.mparivahan.R.string.please_enter_travel_upto)), 1).show();
            return;
        }
        lg lgVar3 = this$0.binding;
        if (lgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar3 = null;
        }
        if (lgVar3.D.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.v1().b("pls_SelectTempNatureOfGoods", this$0.getString(com.nic.mparivahan.R.string.please_select_nature_good)), 1).show();
            return;
        }
        lg lgVar4 = this$0.binding;
        if (lgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar4 = null;
        }
        if (lgVar4.z.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.v1().b("pls_SelectTempGoods", this$0.getString(com.nic.mparivahan.R.string.please_select_goods)), 1).show();
            return;
        }
        lg lgVar5 = this$0.binding;
        if (lgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar5 = null;
        }
        if (StringsKt__StringsJVMKt.equals(lgVar5.z.getSelectedItem().toString(), "other", true)) {
            lg lgVar6 = this$0.binding;
            if (lgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar6 = null;
            }
            if (String.valueOf(lgVar6.F.getText()).length() < 3) {
                Toast.makeText(this$0, this$0.v1().b("pls_enterTempGoodsDetails", this$0.getString(com.nic.mparivahan.R.string.please_enter_goods_details)), 1).show();
                return;
            }
        }
        lg lgVar7 = this$0.binding;
        if (lgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar7 = null;
        }
        if (lgVar7.J.length() < 4) {
            Toast.makeText(this$0, this$0.getString(com.nic.mparivahan.R.string.please_enter_purpose_of_journey), 1).show();
            return;
        }
        lg lgVar8 = this$0.binding;
        if (lgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVar8 = null;
        }
        if (lgVar8.P.length() < 4) {
            Toast.makeText(this$0, this$0.v1().b("pls_enterTempRouteDesc", this$0.getString(com.nic.mparivahan.R.string.please_enter_valid_route_desc)), 1).show();
            return;
        }
        if (this$0.isPassangerListAttach && this$0.passangeList.size() < 1) {
            Toast.makeText(this$0, this$0.v1().b("pls_AddTempPassenger", this$0.getString(com.nic.mparivahan.R.string.please_add_passanger)), 1).show();
            return;
        }
        try {
            this$0.x1().show();
            String str = this$0.allotmentOffice;
            lg lgVar9 = this$0.binding;
            if (lgVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar9 = null;
            }
            String strValueOf = String.valueOf(lgVar9.F.getText());
            lg lgVar10 = this$0.binding;
            if (lgVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar10 = null;
            }
            String string = lgVar10.D.getSelectedItem().toString();
            lg lgVar11 = this$0.binding;
            if (lgVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar11 = null;
            }
            String string2 = lgVar11.z.getSelectedItem().toString();
            String strR = hz0.a.r();
            String rc_off_cd = this$0.z1().getRc_off_cd();
            Integer numValueOf = rc_off_cd != null ? Integer.valueOf(Integer.parseInt(rc_off_cd)) : null;
            lg lgVar12 = this$0.binding;
            if (lgVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar12 = null;
            }
            String strValueOf2 = String.valueOf(lgVar12.F.getText());
            int i = Integer.parseInt(this$0.periodCountValue);
            VContant.Companion companion = VContant.INSTANCE;
            String strX = companion.x(this$0.periodModeSelectedValue);
            int i2 = Integer.parseInt(VContant.SPEICAL_PERMIT_PURPOSE_CODE);
            lg lgVar13 = this$0.binding;
            if (lgVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar13 = null;
            }
            String strValueOf3 = String.valueOf(lgVar13.J.getText());
            String strY1 = this$0.y1();
            lg lgVar14 = this$0.binding;
            if (lgVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar14 = null;
            }
            String strValueOf4 = String.valueOf(lgVar14.P.getText());
            String strValueOf5 = String.valueOf(this$0.z1().getState_cd());
            lg lgVar15 = this$0.binding;
            if (lgVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar15 = null;
            }
            String strValueOf6 = String.valueOf(lgVar15.V.getText());
            lg lgVar16 = this$0.binding;
            if (lgVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar16 = null;
            }
            String strValueOf7 = String.valueOf(lgVar16.X.getText());
            ArrayList arrayList = this$0.passangeList;
            String strValueOf8 = String.valueOf(companion.p(this$0.validFromDate));
            lg lgVar17 = this$0.binding;
            if (lgVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                lgVar17 = null;
            }
            RequestForSaveAppSpPermit requestForSaveAppSpPermit = new RequestForSaveAppSpPermit(str, "", strValueOf, string, string2, "", strR, numValueOf, strValueOf2, i, strX, i2, strValueOf3, strY1, strValueOf4, strValueOf5, strValueOf6, strValueOf7, arrayList, strValueOf8, lgVar17.a0.getText().toString());
            Gson gson = new Gson();
            o47 o47VarT1 = this$0.t1();
            String json = gson.toJson(requestForSaveAppSpPermit);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            o47VarT1.O(this$0, json);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (this$0.x1().isShowing()) {
                this$0.x1().dismiss();
            }
        }
    }

    public static final void H1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void G1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(com.nic.mparivahan.R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(com.nic.mparivahan.R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(com.nic.mparivahan.R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(com.nic.mparivahan.R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(com.nic.mparivahan.R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitDetailsActivity.H1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void K1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void L1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void O1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void Q1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, v1().b("are_you_sure_you_want_to_leave", getString(com.nic.mparivahan.R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lg lgVarX = lg.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lgVarX, "inflate(...)");
        this.binding = lgVarX;
        lg lgVar = null;
        if (lgVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            lgVarX = null;
        }
        setContentView(lgVarX.m());
        N1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        P1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Q1((NrvDetails) serializableExtra);
        if (getIntent().hasExtra("natureOfGoods")) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("natureOfGoods");
            Intrinsics.checkNotNull(stringArrayListExtra);
            this.natureOfGoodsArrayList = stringArrayListExtra;
        }
        if (getIntent().hasExtra("allotmentOffice")) {
            String stringExtra = getIntent().getStringExtra("allotmentOffice");
            Intrinsics.checkNotNull(stringExtra);
            this.allotmentOffice = stringExtra;
        }
        if (getIntent().hasExtra("validFromDate")) {
            String stringExtra2 = getIntent().getStringExtra("validFromDate");
            Intrinsics.checkNotNull(stringExtra2);
            this.validFromDate = stringExtra2;
        }
        if (getIntent().hasExtra("periodMode")) {
            String stringExtra3 = getIntent().getStringExtra("periodMode");
            Intrinsics.checkNotNull(stringExtra3);
            this.periodModeSelectedValue = stringExtra3;
        }
        if (getIntent().hasExtra("periodCount")) {
            String stringExtra4 = getIntent().getStringExtra("periodCount");
            Intrinsics.checkNotNull(stringExtra4);
            this.periodCountValue = stringExtra4;
        }
        if (getIntent().hasExtra("validUpto")) {
            String stringExtra5 = getIntent().getStringExtra("validUpto");
            Intrinsics.checkNotNull(stringExtra5);
            this.validUptoDate = stringExtra5;
        }
        if (getIntent().hasExtra("serviceType")) {
            String stringExtra6 = getIntent().getStringExtra("serviceType");
            Intrinsics.checkNotNull(stringExtra6);
            this.selectedServiceType = stringExtra6;
        }
        if (getIntent().hasExtra("routeLength")) {
            String stringExtra7 = getIntent().getStringExtra("routeLength");
            Intrinsics.checkNotNull(stringExtra7);
            this.routeLength = stringExtra7;
        }
        if (getIntent().hasExtra("addPassangerEnable")) {
            if (getIntent().getBooleanExtra("addPassangerEnable", false)) {
                this.isPassangerListAttach = true;
                lg lgVar2 = this.binding;
                if (lgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lgVar = lgVar2;
                }
                lgVar.w.setVisibility(0);
            } else {
                this.isPassangerListAttach = false;
                lg lgVar3 = this.binding;
                if (lgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    lgVar = lgVar3;
                }
                lgVar.w.setVisibility(8);
            }
        }
        Log.e("Valid From", this.validFromDate);
        M1(new wa3(this));
        L1(DuplicateFitnessService.INSTANCE.a(this));
        O1(new ProgressDialog(this));
        x1().setMessage(v1().b("label_challan_please_wait", getString(com.nic.mparivahan.R.string.loading_msg)));
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        B1();
        t1().s().g(this, new g(new c()));
        t1().t().g(this, new g(new d()));
        t1().E().g(this, new g(new e()));
        t1().F().g(this, new g(new f()));
    }

    public final String r1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String s1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final o47 t1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService u1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String w1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String y1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
