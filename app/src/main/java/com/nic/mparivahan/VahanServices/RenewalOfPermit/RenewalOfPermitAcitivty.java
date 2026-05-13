package com.nic.mparivahan.VahanServices.RenewalOfPermit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.VmRegionDetailsDto;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftModel;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftResponse;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftService.RPSaveToDraftService;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.bf;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.r35;
import com.zepto.r75;
import com.zepto.s35;
import com.zepto.t35;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b±\u0001\u0010²\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016JF\u0010\u001c\u001a\u00020\u00032>\u0010\u001b\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00170\u0016j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`\u001a`\u0019R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010I\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\"\u0010M\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010>\"\u0004\bL\u0010@R\"\u0010Q\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010<\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R\"\u0010U\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010<\u001a\u0004\bS\u0010>\"\u0004\bT\u0010@R\"\u0010Y\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010<\u001a\u0004\bW\u0010>\"\u0004\bX\u0010@R\"\u0010]\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010>\"\u0004\b\\\u0010@R\"\u0010a\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010<\u001a\u0004\b_\u0010>\"\u0004\b`\u0010@R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010<\u001a\u0004\bc\u0010>\"\u0004\bd\u0010@R\"\u0010i\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010<\u001a\u0004\bg\u0010>\"\u0004\bh\u0010@R\"\u0010m\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010<\u001a\u0004\bk\u0010>\"\u0004\bl\u0010@R\"\u0010q\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010<\u001a\u0004\bo\u0010>\"\u0004\bp\u0010@R\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001Ra\u0010\u008e\u0001\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00170\u0016j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`\u001a`\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u0092\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010<\u001a\u0005\b\u0090\u0001\u0010>\"\u0005\b\u0091\u0001\u0010@R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009e\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010<\u001a\u0005\b\u009c\u0001\u0010>\"\u0005\b\u009d\u0001\u0010@R&\u0010¢\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010<\u001a\u0005\b \u0001\u0010>\"\u0005\b¡\u0001\u0010@R&\u0010¦\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b£\u0001\u0010<\u001a\u0005\b¤\u0001\u0010>\"\u0005\b¥\u0001\u0010@R)\u0010¬\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010\u009b\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R&\u0010°\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010<\u001a\u0005\b®\u0001\u0010>\"\u0005\b¯\u0001\u0010@¨\u0006³\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RenewalOfPermitAcitivty;", "Lcom/zepto/pq;", "", "", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "region", "Lcom/zepto/bf;", "binding", "L1", "position", "status", "k2", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "reginList", "m1", "C", "Lcom/zepto/bf;", "p1", "()Lcom/zepto/bf;", "P1", "(Lcom/zepto/bf;)V", "Lcom/zepto/t35;", "D", "Lcom/zepto/t35;", "D1", "()Lcom/zepto/t35;", "g2", "(Lcom/zepto/t35;)V", "rpSaveToDraftViewModel", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftService/RPSaveToDraftService;", "E", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftService/RPSaveToDraftService;", "E1", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftService/RPSaveToDraftService;", "h2", "(Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftService/RPSaveToDraftService;)V", "rpsavetodraftService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "V1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "v1", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "permitNo", "H", "x1", "a2", "permitValidFrom", "I", "y1", "b2", "permitValidUpto", "J", "getPeriod", "W1", "period", "K", "getAllotmentOffice", "O1", "allotmentOffice", "L", "w1", "Z1", "permitType", "M", "u1", "X1", "permitCategory", "N", "F1", "i2", "servicesType", "O", "getYearlyMode", "j2", "yearlyMode", "P", "getNatureOfGOods", "S1", "natureOfGOods", "Q", "q1", "Q1", "goods", "R", "getOtherGoods", "U1", "otherGoods", "S", "B1", "e2", "regNo", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "R1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/zepto/r75;", "U", "Lcom/zepto/r75;", "C1", "()Lcom/zepto/r75;", "f2", "(Lcom/zepto/r75;)V", "reginAdapter", "V", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "getRegion", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;", "setRegion", "(Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/VmRegionDetailsDto;)V", "W", "Ljava/util/ArrayList;", "getReginHashArray", "()Ljava/util/ArrayList;", "setReginHashArray", "(Ljava/util/ArrayList;)V", "reginHashArray", "X", "z1", "c2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Z", "s1", "T1", "off_code", "a0", "o1", "N1", "aadhar_name", "b0", "n1", "M1", "aadhar_address", "c0", "G1", "()Z", "setFaceless", "(Z)V", "isFaceless", "d0", "getRegin_code", "setRegin_code", "regin_code", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RenewalOfPermitAcitivty extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bf binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public t35 rpSaveToDraftViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public RPSaveToDraftService rpsavetodraftService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String permitNo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String permitValidFrom;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String permitValidUpto;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String period;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String allotmentOffice;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String permitType;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String permitCategory;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String servicesType;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String yearlyMode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String natureOfGOods;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String goods;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String otherGoods;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String regNo;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public r75 reginAdapter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public VmRegionDetailsDto region;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ArrayList reginHashArray = new ArrayList();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String regin_code = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(RPSaveToDraftResponse rPSaveToDraftResponse) {
            RenewalOfPermitAcitivty.this.t1().dismiss();
            if (rPSaveToDraftResponse.getApiMessage().getStatusCode() != 200) {
                VContant.INSTANCE.N(RenewalOfPermitAcitivty.this, rPSaveToDraftResponse.getApiMessage().getDeveloperMessage().toString());
                return;
            }
            Intent intent = new Intent(RenewalOfPermitAcitivty.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.PERMIT_RENEWAL_CODE);
            intent.putExtra(VContant.PERMIT_RENEWAL_CODE, rPSaveToDraftResponse.getData());
            intent.putExtra(VContant.APP_NO, rPSaveToDraftResponse.getData().getApplNo());
            NrvDetails nrvDetailsA1 = RenewalOfPermitAcitivty.this.A1();
            intent.putExtra("state_code", nrvDetailsA1 != null ? nrvDetailsA1.getState_cd() : null);
            intent.putExtra("rc_number", RenewalOfPermitAcitivty.this.z1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE);
            intent.putExtra("off_code", RenewalOfPermitAcitivty.this.s1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, RenewalOfPermitAcitivty.this.getIsFaceless());
            intent.putExtra("RC", RenewalOfPermitAcitivty.this.z1());
            intent.putExtra("RcDetails", RenewalOfPermitAcitivty.this.A1());
            intent.putExtra(VContant.NEXGEN_addahar_name, RenewalOfPermitAcitivty.this.o1());
            intent.putExtra(VContant.NEXGEN_addahar_address, RenewalOfPermitAcitivty.this.n1());
            RenewalOfPermitAcitivty.this.startActivity(intent);
            RenewalOfPermitAcitivty.this.finishAffinity();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RPSaveToDraftResponse) obj);
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

    public static final void H1(RenewalOfPermitAcitivty this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.r1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void I1(RenewalOfPermitAcitivty this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.z1());
        intent.putExtra("RcDetails", this$0.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.n1());
        this$0.startActivity(intent);
    }

    public static final void J1(RenewalOfPermitAcitivty this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.reginHashArray.size() <= 0 || this$0.p1().d.getText().toString().length() >= 2) {
            try {
                String strX1 = this$0.x1();
                String strY1 = this$0.y1();
                String rc_chasi_no = this$0.A1().getRc_chasi_no();
                String strSubstring = null;
                if (rc_chasi_no != null) {
                    String rc_chasi_no2 = this$0.A1().getRc_chasi_no();
                    Intrinsics.checkNotNull(rc_chasi_no2 != null ? Integer.valueOf(rc_chasi_no2.length()) : null);
                    strSubstring = rc_chasi_no.substring(r8.intValue() - 5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                this$0.D1().i(new RPSaveToDraftModel("", strX1, strY1, "", String.valueOf(strSubstring), 1, this$0.q1(), "", this$0.p1().l.getText().toString(), Integer.parseInt(this$0.s1()), hz0.a.r(), this$0.p1().f.getText().toString(), Integer.parseInt(this$0.u1()), this$0.v1(), Integer.parseInt(this$0.w1()), CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(Integer.parseInt(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE))), "", this$0.regin_code, this$0.B1(), "", "", this$0.F1(), String.valueOf(this$0.A1().getState_cd()), this$0.x1(), this$0.y1()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Toast.makeText(this$0, this$0.r1().b("please_select_the_area", this$0.getString(R.string.please_select_the_area)), 0).show();
        }
        this$0.D1().h().g(this$0, new b(this$0.new a()));
    }

    public static final void K1(RenewalOfPermitAcitivty this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p1().f.setText("");
        this$0.p1().l.setText("");
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final String B1() {
        String str = this.regNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regNo");
        return null;
    }

    public final r75 C1() {
        r75 r75Var = this.reginAdapter;
        if (r75Var != null) {
            return r75Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reginAdapter");
        return null;
    }

    public final t35 D1() {
        t35 t35Var = this.rpSaveToDraftViewModel;
        if (t35Var != null) {
            return t35Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rpSaveToDraftViewModel");
        return null;
    }

    public final RPSaveToDraftService E1() {
        RPSaveToDraftService rPSaveToDraftService = this.rpsavetodraftService;
        if (rPSaveToDraftService != null) {
            return rPSaveToDraftService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rpsavetodraftService");
        return null;
    }

    public final String F1() {
        String str = this.servicesType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("servicesType");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void L1(VmRegionDetailsDto region, bf binding) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.reginHashArray.clear();
        ArrayList<String> region2 = region.getRegion();
        Intrinsics.checkNotNull(region2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ArrayList<Integer> regionCd = region.getRegionCd();
        Intrinsics.checkNotNull(regionCd, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        int size = region2.size();
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            map.clear();
            map.put("Regin", region2.get(i));
            map.put("ReginCd", String.valueOf(regionCd.get(i).intValue()));
            map.put("Status", "0");
            this.reginHashArray.add(map);
        }
        if (region2.size() <= 0) {
            binding.n.setVisibility(8);
        } else {
            f2(new r75(this.reginHashArray, this));
            binding.n.setAdapter(C1());
        }
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.allotmentOffice = str;
    }

    public final void P1(bf bfVar) {
        Intrinsics.checkNotNullParameter(bfVar, "<set-?>");
        this.binding = bfVar;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goods = str;
    }

    public final void R1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.natureOfGOods = str;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otherGoods = str;
    }

    public final void V1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.period = str;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permitCategory = str;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permitNo = str;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permitType = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permitValidFrom = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permitValidUpto = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void d2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.regNo = str;
    }

    public final void f2(r75 r75Var) {
        Intrinsics.checkNotNullParameter(r75Var, "<set-?>");
        this.reginAdapter = r75Var;
    }

    public final void g2(t35 t35Var) {
        Intrinsics.checkNotNullParameter(t35Var, "<set-?>");
        this.rpSaveToDraftViewModel = t35Var;
    }

    public final void h2(RPSaveToDraftService rPSaveToDraftService) {
        Intrinsics.checkNotNullParameter(rPSaveToDraftService, "<set-?>");
        this.rpsavetodraftService = rPSaveToDraftService;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.servicesType = str;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.yearlyMode = str;
    }

    public void k2(int position, int status) {
        try {
            ((HashMap) this.reginHashArray.get(position)).replace("Status", String.valueOf(status));
            C1().j();
            m1(this.reginHashArray);
        } catch (Exception unused) {
        }
    }

    public final void m1(ArrayList reginList) {
        Intrinsics.checkNotNullParameter(reginList, "reginList");
        int size = reginList.size();
        int i = 0;
        String str = "";
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt__StringsJVMKt.equals$default((String) ((HashMap) reginList.get(i2)).get("Status"), VContant.MAINSCREEN, false, 2, null)) {
                i++;
                str = str + "\n " + ((String) ((HashMap) reginList.get(i2)).get("Regin"));
                this.regin_code = ((String) ((HashMap) reginList.get(i2)).get("ReginCd")) + ',' + this.regin_code;
            }
        }
        if (i <= 0) {
            p1().p.setText("");
            return;
        }
        p1().p.setText("Total number of selected area : " + i + " \n" + str);
    }

    public final String n1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bf bfVarC = bf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bfVarC, "inflate(...)");
        P1(bfVarC);
        setContentView(p1().b());
        h2(RPSaveToDraftService.INSTANCE.a(this));
        ta3.a.T2(this, p1());
        V1(new ProgressDialog(this));
        R1(new wa3(this));
        t1().setMessage(r1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        String stringExtra = getIntent().getStringExtra("permitNo");
        Intrinsics.checkNotNull(stringExtra);
        Y1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("permitValidFrom");
        Intrinsics.checkNotNull(stringExtra2);
        a2(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra("permitValidUpto");
        Intrinsics.checkNotNull(stringExtra3);
        b2(stringExtra3);
        String stringExtra4 = getIntent().getStringExtra("permitType");
        Intrinsics.checkNotNull(stringExtra4);
        Z1(stringExtra4);
        String stringExtra5 = getIntent().getStringExtra("permitCategory");
        Intrinsics.checkNotNull(stringExtra5);
        X1(stringExtra5);
        String stringExtra6 = getIntent().getStringExtra("yearlyMode");
        Intrinsics.checkNotNull(stringExtra6);
        j2(stringExtra6);
        String stringExtra7 = getIntent().getStringExtra("period");
        Intrinsics.checkNotNull(stringExtra7);
        W1(stringExtra7);
        String stringExtra8 = getIntent().getStringExtra("allotOffice");
        Intrinsics.checkNotNull(stringExtra8);
        O1(stringExtra8);
        String stringExtra9 = getIntent().getStringExtra("serviceType");
        Intrinsics.checkNotNull(stringExtra9);
        i2(stringExtra9);
        String stringExtra10 = getIntent().getStringExtra("natureOfGoods");
        Intrinsics.checkNotNull(stringExtra10);
        S1(stringExtra10);
        String stringExtra11 = getIntent().getStringExtra("goods");
        Intrinsics.checkNotNull(stringExtra11);
        Q1(stringExtra11);
        String stringExtra12 = getIntent().getStringExtra("otherGoods");
        Intrinsics.checkNotNull(stringExtra12);
        U1(stringExtra12);
        String stringExtra13 = getIntent().getStringExtra("regNo");
        Intrinsics.checkNotNull(stringExtra13);
        e2(stringExtra13);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        d2((NrvDetails) serializableExtra);
        T1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        N1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        c2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("region");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.VmRegionDetailsDto");
        this.region = (VmRegionDetailsDto) serializableExtra2;
        p1().n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        try {
            VmRegionDetailsDto vmRegionDetailsDto = this.region;
            Intrinsics.checkNotNull(vmRegionDetailsDto);
            if (vmRegionDetailsDto.getRegion() != null) {
                VmRegionDetailsDto vmRegionDetailsDto2 = this.region;
                Intrinsics.checkNotNull(vmRegionDetailsDto2);
                ArrayList<String> region = vmRegionDetailsDto2.getRegion();
                Integer numValueOf = region != null ? Integer.valueOf(region.size()) : null;
                Intrinsics.checkNotNull(numValueOf);
                if (numValueOf.intValue() > 0) {
                    VmRegionDetailsDto vmRegionDetailsDto3 = this.region;
                    Intrinsics.checkNotNull(vmRegionDetailsDto3);
                    L1(vmRegionDetailsDto3, p1());
                } else {
                    p1().c.setVisibility(8);
                    p1().e.setVisibility(8);
                }
            } else {
                p1().c.setVisibility(8);
                p1().e.setVisibility(8);
            }
        } catch (Exception unused) {
        }
        g2((t35) new z(this, new r35(new s35(E1()))).a(t35.class));
        p1().r.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitAcitivty.H1(this.a, view);
            }
        });
        p1().s.setText(r1().b("vehicle_no", "Vehicle No.:") + ' ' + z1());
        p1().t.setText(r1().b("view_vehicle_details", "View Vehicle Details"));
        p1().t.setPaintFlags(8 | p1().t.getPaintFlags());
        p1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitAcitivty.I1(this.a, view);
            }
        });
        p1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitAcitivty.J1(this.a, view);
            }
        });
        p1().o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitAcitivty.K1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final bf p1() {
        bf bfVar = this.binding;
        if (bfVar != null) {
            return bfVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String q1() {
        String str = this.goods;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goods");
        return null;
    }

    public final wa3 r1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String s1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.permitCategory;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitCategory");
        return null;
    }

    public final String v1() {
        String str = this.permitNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitNo");
        return null;
    }

    public final String w1() {
        String str = this.permitType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitType");
        return null;
    }

    public final String x1() {
        String str = this.permitValidFrom;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitValidFrom");
        return null;
    }

    public final String y1() {
        String str = this.permitValidUpto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitValidUpto");
        return null;
    }

    public final String z1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }
}
