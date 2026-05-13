package com.nic.mparivahan.VahanServices.VahanMultiService;

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
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.g87;
import com.zepto.gz3;
import com.zepto.mf4;
import com.zepto.my3;
import com.zepto.pq;
import com.zepto.rx3;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J&\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0016j\b\u0012\u0004\u0012\u00020\u0011`\u0017J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\u001a\u0010\u001e\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u001a\u0010\u001f\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J.\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0016j\b\u0012\u0004\u0012\u00020\u0011`\u00172\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020!0\u0016j\b\u0012\u0004\u0012\u00020!`\u0017R\"\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010I\u001a\n B*\u0004\u0018\u00010A0A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010M\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010'\"\u0004\bL\u0010)R\"\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010%\u001a\u0004\bO\u0010'\"\u0004\bP\u0010)R\"\u0010U\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010%\u001a\u0004\bS\u0010'\"\u0004\bT\u0010)R\"\u0010Y\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010%\u001a\u0004\bW\u0010'\"\u0004\bX\u0010)R\"\u0010\\\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR'\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020!0\u0016j\b\u0012\u0004\u0012\u00020!`\u00178\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\"\u0010\u007f\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010%\u001a\u0004\b}\u0010'\"\u0004\b~\u0010)R(\u0010\u0085\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0080\u0001\u0010N\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/VahanMultiSelectionScreen;", "Lcom/zepto/pq;", "Lcom/zepto/rx3;", "", "R1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "t1", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rcdetails", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "selectedPurCodeList", "S1", "J0", "I1", "purposeCode", "position", "U", "d0", "e2", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/ServiceList;", "serviceListArray", "y1", "C", "Ljava/lang/String;", "D1", "()Ljava/lang/String;", "Z1", "(Ljava/lang/String;)V", "rc_number", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "Lcom/zepto/my3;", "E", "Lcom/zepto/my3;", "z1", "()Lcom/zepto/my3;", "V1", "(Lcom/zepto/my3;)V", "binding", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "C1", "()Landroid/app/ProgressDialog;", "Y1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "getState_code", "setState_code", "state_code", "I", "B1", "X1", "off_code", "J", "x1", "U1", "aadhar_name", "K", "w1", "T1", "aadhar_address", "L", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "W1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "N", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "b2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "retrofitService", "P", "Ljava/util/ArrayList;", "getServiceListArray", "()Ljava/util/ArrayList;", "Q", "getCurrentPurCode", "setCurrentPurCode", "currentPurCode", "R", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "CurrentPosition", "Lcom/zepto/g87;", "S", "Lcom/zepto/g87;", "G1", "()Lcom/zepto/g87;", "c2", "(Lcom/zepto/g87;)V", "selectionAdapter", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanMultiSelectionScreen extends pq implements rx3 {

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
    public g87 selectionAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final ArrayList serviceListArray = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String currentPurCode = "0";

    public static final void J1(VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.D1());
        intent.putExtra("RcDetails", this$0.E1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.x1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.w1());
        this$0.startActivity(intent);
    }

    public static final void K1(VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.y1(this$0.serviceListArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void L1(VahanMultiSelectionScreen this$0, MultiSelectionResp multiSelectionResp) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1().dismiss();
        ApiMessage apiMessage = multiSelectionResp.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            ApiMessage apiMessage2 = multiSelectionResp.getApiMessage();
            this$0.e2(this$0, apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
        } else if (this$0.serviceListArray.size() > 0) {
            try {
                int iIndexOf = this$0.serviceListArray.indexOf(new ServiceList(Integer.parseInt(this$0.currentPurCode), false));
                ServiceList serviceList = new ServiceList(Integer.parseInt(this$0.currentPurCode), true);
                this$0.serviceListArray.remove(iIndexOf);
                this$0.serviceListArray.add(iIndexOf, serviceList);
                this$0.G1().j();
            } catch (Exception unused) {
            }
        }
    }

    public static final void M1(VahanMultiSelectionScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1().dismiss();
        if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
            this$0.e2(this$0, str);
        } else {
            this$0.e2(this$0, "Unable to select the service, Try try after sometime!");
        }
    }

    public static final void N1(VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            int size = this$0.serviceListArray.size();
            for (int i = 0; i < size; i++) {
                if (((ServiceList) this$0.serviceListArray.get(i)).getSelectService()) {
                    arrayList.add(String.valueOf(((ServiceList) this$0.serviceListArray.get(i)).getPurposeCode()));
                }
            }
            if (arrayList.size() <= 0) {
                Log.e("test", "Not working ...");
                return;
            }
            HashSet hashSet = new HashSet(arrayList);
            arrayList.clear();
            arrayList.addAll(hashSet);
            Log.e("Test", this$0.B1().toString());
            int i2 = Integer.parseInt(this$0.B1());
            VContant.Companion companion = VContant.INSTANCE;
            Serializable multiServiceDraft = new MultiServiceDraft("", null, null, null, null, i2, null, companion.k(arrayList), this$0.D1(), this$0.E1().getState_cd(), null);
            Intent intent = new Intent();
            if (((String) arrayList.get(0)).equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                StringBuilder sb = new StringBuilder();
                sb.append("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip.");
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                sb.append(companion.r((String) obj));
                intent.setClass(this$0, Class.forName(sb.toString()));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.");
                Object obj2 = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                sb2.append(companion.r((String) obj2));
                intent.setClass(this$0, Class.forName(sb2.toString()));
            }
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraft);
            intent.putExtra("RC", this$0.D1());
            intent.putExtra("RcDetails", this$0.E1());
            intent.putExtra("off_code", this$0.B1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.x1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.w1());
            this$0.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void O1(VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.serviceListArray.clear();
        this$0.I1();
        this$0.G1().j();
    }

    public static final void P1(VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1(this$0, this$0.A1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void Q1(VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1();
    }

    private final void R1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void f2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void u1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void v1(Dialog d, VahanMultiSelectionScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public final wa3 A1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String B1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String D1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails E1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final MultiService F1() {
        MultiService multiService = this.retrofitService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final g87 G1() {
        g87 g87Var = this.selectionAdapter;
        if (g87Var != null) {
            return g87Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectionAdapter");
        return null;
    }

    public final MultiSelectionViewModel H1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModel;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void I1() {
        this.serviceListArray.add(new ServiceList(Integer.parseInt("3"), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt("4"), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE), false));
        this.serviceListArray.add(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
        if (E1().getVTHypthEntity() == null) {
            this.serviceListArray.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
            this.serviceListArray.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
        }
    }

    public final void J0() {
        I1();
        c2(new g87(this.serviceListArray, this, this));
        z1().g.setAdapter(G1());
    }

    public final void S1(NrvDetails rcdetails, ArrayList selectedPurCodeList) {
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        Intrinsics.checkNotNullParameter(selectedPurCodeList, "selectedPurCodeList");
        if (selectedPurCodeList.size() > 0) {
            String rc_off_cd = rcdetails.getRc_off_cd();
            MultiSelectRequest multiSelectRequest = new MultiSelectRequest("", rc_off_cd != null ? Integer.parseInt(rc_off_cd) : 0, "", selectedPurCodeList, String.valueOf(rcdetails.getRc_regn_no()), String.valueOf(rcdetails.getState_cd()));
            C1().show();
            H1().u(multiSelectRequest);
        }
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
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
        S1(E1(), arrayList);
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void V1(my3 my3Var) {
        Intrinsics.checkNotNullParameter(my3Var, "<set-?>");
        this.binding = my3Var;
    }

    public final void W1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void b2(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.retrofitService = multiService;
    }

    public final void c2(g87 g87Var) {
        Intrinsics.checkNotNullParameter(g87Var, "<set-?>");
        this.selectionAdapter = g87Var;
    }

    @Override // com.zepto.rx3
    public void d0(String purposeCode, int position) {
        Intrinsics.checkNotNull(purposeCode);
        this.serviceListArray.set(this.serviceListArray.indexOf(new ServiceList(Integer.parseInt(purposeCode), true)), new ServiceList(Integer.parseInt(purposeCode), false));
        G1().j();
    }

    public final void d2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModel = multiSelectionViewModel;
    }

    public final void e2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.f2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        t1(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiservicelayout);
        my3 my3VarC = my3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(my3VarC, "inflate(...)");
        V1(my3VarC);
        setContentView(z1().b());
        W1(new wa3(this));
        b2(MultiService.INSTANCE.a(this));
        d2((MultiSelectionViewModel) new z(this, new y67(new sx3(F1()))).a(MultiSelectionViewModel.class));
        Y1(new ProgressDialog(this));
        C1().setMessage("Please wait...");
        C1().setCancelable(false);
        C1().setCanceledOnTouchOutside(false);
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra);
        X1(String.valueOf(getIntent().getStringExtra("off_code")));
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        T1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        W1(new wa3(this));
        this.state_code = E1().getState_cd();
        z1().f.e.setVisibility(0);
        SpannableString spannableString = new SpannableString(D1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        ta3.a.u2(this, z1());
        z1().f.e.setText(spannableString);
        z1().g.setLayoutManager(new GridLayoutManager(this, 3));
        z1().f.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.J1(this.a, view);
            }
        });
        z1().f.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.K1(this.a, view);
            }
        });
        J0();
        H1().n().g(this, new mf4() { // from class: com.zepto.x77
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiSelectionScreen.L1(this.a, (MultiSelectionResp) obj);
            }
        });
        H1().o().g(this, new mf4() { // from class: com.zepto.y77
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiSelectionScreen.M1(this.a, (String) obj);
            }
        });
        z1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.N1(this.a, view);
            }
        });
        z1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.O1(this.a, view);
            }
        });
        z1().f.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.P1(this.a, view);
            }
        });
        z1().f.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.Q1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        t1(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void t1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.v1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiSelectionScreen.u1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String w1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String x1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final ArrayList y1(ArrayList serviceListArray) {
        Intrinsics.checkNotNullParameter(serviceListArray, "serviceListArray");
        ArrayList arrayList = new ArrayList();
        if (serviceListArray.size() > 0) {
            int size = serviceListArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(String.valueOf(((ServiceList) serviceListArray.get(i)).getPurposeCode()));
            }
        }
        return arrayList;
    }

    public final my3 z1() {
        my3 my3Var = this.binding;
        if (my3Var != null) {
            return my3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}
