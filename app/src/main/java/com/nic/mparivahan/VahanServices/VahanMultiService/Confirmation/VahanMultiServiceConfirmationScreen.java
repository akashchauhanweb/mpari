package com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Model.DoorStepReq;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.VahanDoorStep;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.MultiServiceFeesDetailsScreen;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.hz0;
import com.zepto.jm3;
import com.zepto.ky3;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\"\u0010\u0017\u001a\u00020\u00112\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0015R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R6\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u00105\u001a\u0004\bP\u00107\"\u0004\bQ\u00109¨\u0006U"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Confirmation/VahanMultiServiceConfirmationScreen;", "Lcom/zepto/pq;", "", "z1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "n1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiServiceList", "u1", "Lcom/zepto/ky3;", "C", "Lcom/zepto/ky3;", "s1", "()Lcom/zepto/ky3;", "C1", "(Lcom/zepto/ky3;)V", "binding", "D", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "E", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "F", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "G", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "B1", "(Ljava/lang/String;)V", "aadhar_name", "H", "q1", "A1", "aadhar_address", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "E1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "D1", "(Lcom/zepto/wa3;)V", "languageKeySession", "K", "getAuthType", "setAuthType", "authType", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanMultiServiceConfirmationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ky3 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String authType = "M";

    public static final void o1(Dialog d, VahanMultiServiceConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void w1(VahanMultiServiceConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n1(this$0, "Are you sure you want to leave?");
    }

    public static final void x1(VahanMultiServiceConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1();
    }

    public static final void y1(VahanMultiServiceConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) MultiServiceFeesDetailsScreen.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
            intent.putExtra("RcDetails", this$0.v1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void z1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void C1(ky3 ky3Var) {
        Intrinsics.checkNotNullParameter(ky3Var, "<set-?>");
        this.binding = ky3Var;
    }

    public final void D1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void E1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void n1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceConfirmationScreen.o1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceConfirmationScreen.p1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        n1(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiservice_confirmation);
        ky3 ky3VarC = ky3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ky3VarC, "inflate(...)");
        C1(ky3VarC);
        setContentView(s1().b());
        ta3.a.t2(this, s1());
        D1(new wa3(this));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        E1((NrvDetails) serializableExtra);
        B1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        A1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        if (this.isFaceless) {
            this.authType = "A";
        }
        try {
            ws6 ws6Var = new ws6(this);
            MultiServiceDraft multiServiceDraft = this.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft);
            String applNo = multiServiceDraft.getApplNo();
            String str = this.authType;
            String rc_off_cd = v1().getRc_off_cd();
            Intrinsics.checkNotNull(rc_off_cd);
            VahanDoorStep.INSTANCE.a(this, new DoorStepReq(applNo, str, Integer.parseInt(rc_off_cd), hz0.a.r(), VContant.INSTANCE.k(this.multiServiceList), String.valueOf(v1().getRc_regn_no()), String.valueOf(v1().getState_cd()), "DF", Integer.parseInt(ws6Var.k())));
        } catch (Exception unused) {
        }
        ArrayList arrayList = this.multiServiceList;
        if (arrayList == null || !arrayList.contains(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            s1().d.i.setText(u1(this.multiServiceList));
        } else {
            s1().d.i.setText(t1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)"));
        }
        TextView textView = s1().b;
        StringBuilder sb = new StringBuilder();
        sb.append("Application for ");
        sb.append(u1(this.multiServiceList));
        sb.append(" saved successfully in draft with application no.");
        MultiServiceDraft multiServiceDraft2 = this.multiServiceobj;
        Intrinsics.checkNotNull(multiServiceDraft2);
        sb.append(multiServiceDraft2.getApplNo());
        textView.setText(sb.toString());
        jm3.a.b(s1().d.i.getText().toString(), s1().b.getText().toString(), this);
        s1().d.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceConfirmationScreen.w1(this.a, view);
            }
        });
        s1().d.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceConfirmationScreen.x1(this.a, view);
            }
        });
        s1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceConfirmationScreen.y1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final String q1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final ky3 s1() {
        ky3 ky3Var = this.binding;
        if (ky3Var != null) {
            return ky3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String u1(ArrayList multiServiceList) {
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(multiServiceList);
        if (multiServiceList.size() > 0) {
            int size = multiServiceList.size();
            for (int i = 0; i < size; i++) {
                Object obj = multiServiceList.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList.add(VContant.INSTANCE.C(this, (String) obj));
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
