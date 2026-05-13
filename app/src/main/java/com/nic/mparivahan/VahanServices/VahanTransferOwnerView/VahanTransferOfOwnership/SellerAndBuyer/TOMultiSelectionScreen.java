package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.TOMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.i87;
import com.zepto.my3;
import com.zepto.pq;
import com.zepto.rx3;
import com.zepto.sx3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010A\u001a\n :*\u0004\u0018\u000109098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010E\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001b\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001fR\"\u0010I\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010\u001b\u001a\u0004\bG\u0010\u001d\"\u0004\bH\u0010\u001fR\"\u0010M\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010\u001b\u001a\u0004\bK\u0010\u001d\"\u0004\bL\u0010\u001fR\"\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010\u001b\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR\"\u0010T\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR'\u0010w\u001a\u0012\u0012\u0004\u0012\u00020q0pj\b\u0012\u0004\u0012\u00020q`r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\"\u0010{\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010\u001b\u001a\u0004\by\u0010\u001d\"\u0004\bz\u0010\u001fR$\u0010\u0081\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b|\u0010F\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/TOMultiSelectionScreen;", "Lcom/zepto/pq;", "Lcom/zepto/rx3;", "", "I1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "p1", "J0", "C1", "purposeCode", "position", "U", "d0", "C", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "P1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/my3;", "E", "Lcom/zepto/my3;", "u1", "()Lcom/zepto/my3;", "L1", "(Lcom/zepto/my3;)V", "binding", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "x1", "()Landroid/app/ProgressDialog;", "O1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "getState_code", "setState_code", "state_code", "I", "w1", "N1", "off_code", "J", "t1", "K1", "aadhar_name", "K", "s1", "J1", "aadhar_address", "L", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "N", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModel", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "T1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "retrofitService", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ServiceList;", "Lkotlin/collections/ArrayList;", "P", "Ljava/util/ArrayList;", "getServiceListArray", "()Ljava/util/ArrayList;", "serviceListArray", "Q", "getCurrentPurCode", "setCurrentPurCode", "currentPurCode", "R", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "CurrentPosition", "Lcom/zepto/i87;", "S", "Lcom/zepto/i87;", "B1", "()Lcom/zepto/i87;", "S1", "(Lcom/zepto/i87;)V", "selectionAdapter", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TOMultiSelectionScreen extends pq implements rx3 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public my3 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public MultiService retrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int CurrentPosition;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public i87 selectionAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final ArrayList serviceListArray = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String currentPurCode = "0";

    public static final void D1(TOMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.y1());
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        this$0.startActivity(intent);
    }

    public static final void E1(TOMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            int size = this$0.serviceListArray.size();
            for (int i = 0; i < size; i++) {
                if (((ServiceList) this$0.serviceListArray.get(i)).getSelectService()) {
                    arrayList.add(String.valueOf(((ServiceList) this$0.serviceListArray.get(i)).getPurposeCode()));
                }
            }
            if (arrayList.size() <= 0 || this$0.z1().getVTHypthEntity() == null || (!arrayList.contains(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE) && !arrayList.contains(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE))) {
                if (arrayList.size() <= 0 || this$0.z1().getVTHypthEntity() != null) {
                    Toast.makeText(this$0, "As the Vehicle is Hypothicated Please select either HPT OR HPC", 1).show();
                    return;
                }
                int i2 = Integer.parseInt(this$0.w1());
                VContant.Companion companion = VContant.INSTANCE;
                Serializable multiServiceDraftTO = new MultiServiceDraftTO("", "", null, "", null, null, null, null, i2, null, companion.k(arrayList), this$0.y1(), this$0.z1().getState_cd(), "", null, null);
                Intent intent = new Intent();
                StringBuilder sb = new StringBuilder();
                sb.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.");
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                sb.append(companion.s((String) obj, "S"));
                intent.setClass(this$0, Class.forName(sb.toString()));
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO);
                intent.putExtra("RC", this$0.y1());
                intent.putExtra("RcDetails", this$0.z1());
                intent.putExtra("off_code", this$0.w1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
                this$0.startActivity(intent);
                return;
            }
            int i3 = Integer.parseInt(this$0.w1());
            VContant.Companion companion2 = VContant.INSTANCE;
            Serializable multiServiceDraftTO2 = new MultiServiceDraftTO("", "", null, "", null, null, null, null, i3, null, companion2.k(arrayList), this$0.y1(), this$0.z1().getState_cd(), "", null, null);
            Intent intent2 = new Intent();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.");
            Object obj2 = arrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            sb2.append(companion2.s((String) obj2, "S"));
            intent2.setClass(this$0, Class.forName(sb2.toString()));
            intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
            intent2.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO2);
            intent2.putExtra("RC", this$0.y1());
            intent2.putExtra("RcDetails", this$0.z1());
            intent2.putExtra("off_code", this$0.w1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
            intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
            this$0.startActivity(intent2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void F1(TOMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.serviceListArray.clear();
        this$0.C1();
        this$0.B1().j();
    }

    public static final void G1(TOMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p1(this$0, this$0.v1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void H1(TOMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    private final void I1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void q1(Dialog d, TOMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final MultiService A1() {
        MultiService multiService = this.retrofitService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final i87 B1() {
        i87 i87Var = this.selectionAdapter;
        if (i87Var != null) {
            return i87Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectionAdapter");
        return null;
    }

    public final void C1() {
        this.serviceListArray.add(new ServiceList(Integer.parseInt("3"), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE), true));
        if (z1().getVTHypthEntity() != null) {
            Log.e("rcdetails", String.valueOf(z1().getVTHypthEntity()));
            return;
        }
        Log.e("rcdetails", String.valueOf(z1().getVTHypthEntity()));
        this.serviceListArray.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
        this.serviceListArray.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
    }

    public final void J0() {
        C1();
        S1(new i87(this.serviceListArray, this, this));
        u1().g.setAdapter(B1());
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void L1(my3 my3Var) {
        Intrinsics.checkNotNullParameter(my3Var, "<set-?>");
        this.binding = my3Var;
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

    public final void R1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.retrofitService = multiService;
    }

    public final void S1(i87 i87Var) {
        Intrinsics.checkNotNullParameter(i87Var, "<set-?>");
        this.selectionAdapter = i87Var;
    }

    public final void T1(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModel = multiSelectionViewModel;
    }

    @Override // com.zepto.rx3
    public void U(String purposeCode, int position) {
        Intrinsics.checkNotNull(purposeCode);
        this.currentPurCode = purposeCode;
        this.CurrentPosition = position;
        ArrayList arrayList = new ArrayList();
        if (this.serviceListArray.size() > 0) {
            int size = this.serviceListArray.size();
            for (int i = 0; i < size; i++) {
                if (((ServiceList) this.serviceListArray.get(i)).getSelectService()) {
                    arrayList.add(String.valueOf(((ServiceList) this.serviceListArray.get(i)).getPurposeCode()));
                }
            }
            if (arrayList.size() == 0) {
                arrayList.add(this.currentPurCode);
            }
            arrayList.add(this.currentPurCode);
            HashSet hashSet = new HashSet(arrayList);
            arrayList.clear();
            arrayList.addAll(hashSet);
        } else {
            arrayList.add(this.currentPurCode);
        }
        int iIndexOf = this.serviceListArray.indexOf(new ServiceList(Integer.parseInt(this.currentPurCode), false));
        ServiceList serviceList = new ServiceList(Integer.parseInt(this.currentPurCode), true);
        this.serviceListArray.remove(iIndexOf);
        this.serviceListArray.add(iIndexOf, serviceList);
        B1().j();
    }

    @Override // com.zepto.rx3
    public void d0(String purposeCode, int position) {
        Intrinsics.checkNotNull(purposeCode);
        this.serviceListArray.set(this.serviceListArray.indexOf(new ServiceList(Integer.parseInt(purposeCode), true)), new ServiceList(Integer.parseInt(purposeCode), false));
        B1().j();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        p1(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiservicelayout);
        my3 my3VarC = my3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(my3VarC, "inflate(...)");
        L1(my3VarC);
        setContentView(u1().b());
        M1(new wa3(this));
        R1(MultiService.INSTANCE.a(this));
        T1((MultiSelectionViewModel) new z(this, new y67(new sx3(A1()))).a(MultiSelectionViewModel.class));
        O1(new ProgressDialog(this));
        x1().setMessage("Please wait...");
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        P1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Q1((NrvDetails) serializableExtra);
        N1(String.valueOf(getIntent().getStringExtra("off_code")));
        K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        M1(new wa3(this));
        this.state_code = z1().getState_cd();
        u1().f.e.setVisibility(0);
        SpannableString spannableString = new SpannableString(y1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString("Transfer of Ownership \n(Seller)");
        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
        u1().f.i.setText(String.valueOf(v1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        u1().f.e.setText(spannableString);
        u1().g.setLayoutManager(new GridLayoutManager(this, 3));
        u1().f.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ub6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.D1(this.a, view);
            }
        });
        J0();
        u1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.E1(this.a, view);
            }
        });
        u1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.F1(this.a, view);
            }
        });
        u1().f.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.G1(this.a, view);
            }
        });
        u1().f.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.H1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        p1(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.q1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ac6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOMultiSelectionScreen.r1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String s1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String t1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final my3 u1() {
        my3 my3Var = this.binding;
        if (my3Var != null) {
            return my3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
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
