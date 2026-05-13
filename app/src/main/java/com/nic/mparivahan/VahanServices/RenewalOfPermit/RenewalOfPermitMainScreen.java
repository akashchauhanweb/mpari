package com.nic.mparivahan.VahanServices.RenewalOfPermit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.TempDetailsModel;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.RPDataModel;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataServices.RPDataService;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.cf;
import com.zepto.j37;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o35;
import com.zepto.o47;
import com.zepto.p35;
import com.zepto.pq;
import com.zepto.q35;
import com.zepto.ta3;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010L\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR\"\u0010P\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\"\u0010T\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010X\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010?\u001a\u0004\bV\u0010A\"\u0004\bW\u0010CR\"\u0010\\\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010CR\"\u0010h\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010A\"\u0004\bg\u0010CR\"\u0010l\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010?\u001a\u0004\bj\u0010A\"\u0004\bk\u0010CR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010x\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010?\u001a\u0004\bv\u0010A\"\u0004\bw\u0010CR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010?\u001a\u0005\b\u0082\u0001\u0010A\"\u0005\b\u0083\u0001\u0010CR&\u0010\u0088\u0001\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010?\u001a\u0005\b\u0086\u0001\u0010A\"\u0005\b\u0087\u0001\u0010CR&\u0010\u008c\u0001\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010?\u001a\u0005\b\u008a\u0001\u0010A\"\u0005\b\u008b\u0001\u0010CR)\u0010\u008e\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RenewalOfPermitMainScreen;", "Lcom/zepto/pq;", "", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/cf;", "C", "Lcom/zepto/cf;", "n1", "()Lcom/zepto/cf;", "N1", "(Lcom/zepto/cf;)V", "binding", "Lcom/zepto/q35;", "D", "Lcom/zepto/q35;", "D1", "()Lcom/zepto/q35;", "d2", "(Lcom/zepto/q35;)V", "rpDataViewModel", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataServices/RPDataService;", "E", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataServices/RPDataService;", "C1", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataServices/RPDataService;", "c2", "(Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataServices/RPDataService;)V", "rpDataService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "V1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/o47;", "G", "Lcom/zepto/o47;", "o1", "()Lcom/zepto/o47;", "O1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "H", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "p1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "P1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "", "I", "Ljava/lang/String;", "z1", "()Ljava/lang/String;", "Z1", "(Ljava/lang/String;)V", "pmtNo", "J", "F1", "g2", "validFrom", "K", "G1", "h2", "validUpto", "L", "y1", "Y1", "permitType", "M", "x1", "X1", "permitCategory", "N", "H1", "i2", "yearlyMode", "O", "w1", "W1", "period", "P", "E1", "f2", "servicesType", "Q", "s1", "S1", "natureOfGOods", "R", "q1", "Q1", "goods", "S", "u1", "U1", "office", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "R1", "(Lcom/zepto/wa3;)V", "languageKeySession", "U", "A1", "a2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "V", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "b2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "W", "t1", "T1", "off_code", "X", "m1", "M1", "aadhar_name", "Y", "l1", "L1", "aadhar_address", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/RPDataModel;", "a0", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/RPDataModel;", "getRpModel", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/RPDataModel;", "e2", "(Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPDataModel/RPDataModel;)V", "rpModel", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RenewalOfPermitMainScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public cf binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public q35 rpDataViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public RPDataService rpDataService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String pmtNo;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String validFrom;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String validUpto;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String permitType;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String permitCategory;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String yearlyMode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String period;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String servicesType;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String natureOfGOods;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String goods;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String office;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public RPDataModel rpModel;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(CalValidity calValidity) {
            RenewalOfPermitMainScreen.this.v1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                Data data = calValidity.getData();
                Object goodsType = data != null ? data.getGoodsType() : null;
                Intrinsics.checkNotNull(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) goodsType;
                arrayList.add(0, "Select Goods");
                RenewalOfPermitMainScreen.this.n1().e.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CalValidity) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(TempDetailsModel tempDetailsModel) {
            Log.e("tempRenew223", "entered in temp");
            try {
                RenewalOfPermitMainScreen.this.v1().dismiss();
                ApiMessage apiMessage = tempDetailsModel.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    return;
                }
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data = tempDetailsModel.getData();
                ArrayList<String> natureOfGoods = data != null ? data.getNatureOfGoods() : null;
                if (natureOfGoods != null) {
                    natureOfGoods.add(0, "Select Nature of Goods");
                }
                RenewalOfPermitMainScreen.this.n1().h.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, natureOfGoods));
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data2 = tempDetailsModel.getData();
                if ((data2 != null ? data2.getGoodsType() : null) == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0, "Select Goods");
                    RenewalOfPermitMainScreen.this.n1().e.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList));
                } else {
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data3 = tempDetailsModel.getData();
                    Object goodsType = data3 != null ? data3.getGoodsType() : null;
                    Intrinsics.checkNotNull(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ArrayList arrayList2 = (ArrayList) goodsType;
                    arrayList2.add(0, "Select Goods");
                    RenewalOfPermitMainScreen.this.n1().e.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TempDetailsModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            RenewalOfPermitMainScreen.this.v1().dismiss();
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(RPDataModel rPDataModel) {
            try {
                RenewalOfPermitMainScreen.this.v1().dismiss();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.ApiMessage apiMessage = rPDataModel.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    VContant.Companion companion = VContant.INSTANCE;
                    RenewalOfPermitMainScreen renewalOfPermitMainScreen = RenewalOfPermitMainScreen.this;
                    com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.ApiMessage apiMessage2 = rPDataModel.getApiMessage();
                    companion.P(renewalOfPermitMainScreen, apiMessage2 != null ? apiMessage2.getMessage() : null);
                    RenewalOfPermitMainScreen.this.n1().g.setEnabled(false);
                    RenewalOfPermitMainScreen.this.n1().x.setEnabled(false);
                    return;
                }
                RenewalOfPermitMainScreen.this.e2(rPDataModel);
                RenewalOfPermitMainScreen renewalOfPermitMainScreen2 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data = rPDataModel.getData();
                renewalOfPermitMainScreen2.Z1(String.valueOf(data != null ? data.getPmtNo() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen3 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data2 = rPDataModel.getData();
                renewalOfPermitMainScreen3.g2(String.valueOf(data2 != null ? data2.getValidFrom() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen4 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data3 = rPDataModel.getData();
                renewalOfPermitMainScreen4.h2(String.valueOf(data3 != null ? data3.getValidUpto() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen5 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data4 = rPDataModel.getData();
                renewalOfPermitMainScreen5.Y1(String.valueOf(data4 != null ? Integer.valueOf(data4.getPmtType()) : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen6 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data5 = rPDataModel.getData();
                renewalOfPermitMainScreen6.X1(String.valueOf(data5 != null ? Integer.valueOf(data5.getPmtCatg()) : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen7 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data6 = rPDataModel.getData();
                renewalOfPermitMainScreen7.i2(String.valueOf(data6 != null ? data6.getPeriodMode() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen8 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data7 = rPDataModel.getData();
                renewalOfPermitMainScreen8.W1(String.valueOf(data7 != null ? Integer.valueOf(data7.getPeriod()) : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen9 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data8 = rPDataModel.getData();
                renewalOfPermitMainScreen9.U1(String.valueOf(data8 != null ? data8.getAllotmentOffice() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen10 = RenewalOfPermitMainScreen.this;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data9 = rPDataModel.getData();
                renewalOfPermitMainScreen10.f2(String.valueOf(data9 != null ? Integer.valueOf(data9.getServiceType()) : null));
                EditText editText = RenewalOfPermitMainScreen.this.n1().o;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data10 = rPDataModel.getData();
                editText.setText(data10 != null ? data10.getPmtNo() : null);
                EditText editText2 = RenewalOfPermitMainScreen.this.n1().s;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data11 = rPDataModel.getData();
                editText2.setText(data11 != null ? data11.getValidFrom() : null);
                EditText editText3 = RenewalOfPermitMainScreen.this.n1().u;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data12 = rPDataModel.getData();
                editText3.setText(data12 != null ? data12.getValidUpto() : null);
                TextView textView = RenewalOfPermitMainScreen.this.n1().k;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data13 = rPDataModel.getData();
                textView.setText(String.valueOf(data13 != null ? Integer.valueOf(data13.getPeriod()) : null));
                ArrayList arrayList = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data14 = rPDataModel.getData();
                arrayList.add(0, String.valueOf(data14 != null ? data14.getPermitTypeDescr() : null));
                RenewalOfPermitMainScreen.this.n1().r.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList));
                ArrayList arrayList2 = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data15 = rPDataModel.getData();
                arrayList2.add(0, String.valueOf(data15 != null ? data15.getPermitCatgDescr() : null));
                RenewalOfPermitMainScreen.this.n1().n.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList2));
                ArrayList arrayList3 = new ArrayList();
                VContant.Companion companion2 = VContant.INSTANCE;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data16 = rPDataModel.getData();
                arrayList3.add(0, companion2.y(String.valueOf(data16 != null ? data16.getPeriodMode() : null)));
                RenewalOfPermitMainScreen.this.n1().L.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList3));
                TextView textView2 = RenewalOfPermitMainScreen.this.n1().k;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data17 = rPDataModel.getData();
                textView2.setText(String.valueOf(data17 != null ? Integer.valueOf(data17.getPeriod()) : null));
                ArrayList arrayList4 = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data18 = rPDataModel.getData();
                arrayList4.add(0, String.valueOf(data18 != null ? data18.getAllotmentOffice() : null));
                RenewalOfPermitMainScreen.this.n1().c.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList4));
                ArrayList arrayList5 = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data19 = rPDataModel.getData();
                arrayList5.add(0, String.valueOf(data19 != null ? data19.getServiceTypeDescr() : null));
                RenewalOfPermitMainScreen.this.n1().F.setAdapter((SpinnerAdapter) new xd6(RenewalOfPermitMainScreen.this, arrayList5));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RPDataModel) obj);
            return Unit.INSTANCE;
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
            RenewalOfPermitMainScreen.this.v1().dismiss();
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            RenewalOfPermitMainScreen renewalOfPermitMainScreen = RenewalOfPermitMainScreen.this;
            renewalOfPermitMainScreen.S1(renewalOfPermitMainScreen.n1().h.getSelectedItem().toString());
            if (RenewalOfPermitMainScreen.this.n1().h.getSelectedItemPosition() != 0) {
                RenewalOfPermitMainScreen.this.v1().show();
                o47 o47VarO1 = RenewalOfPermitMainScreen.this.o1();
                RenewalOfPermitMainScreen renewalOfPermitMainScreen2 = RenewalOfPermitMainScreen.this;
                o47VarO1.i(renewalOfPermitMainScreen2, renewalOfPermitMainScreen2.n1().h.getSelectedItem().toString(), String.valueOf(RenewalOfPermitMainScreen.this.B1().getState_cd()));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            RenewalOfPermitMainScreen renewalOfPermitMainScreen = RenewalOfPermitMainScreen.this;
            renewalOfPermitMainScreen.Q1(renewalOfPermitMainScreen.n1().e.getSelectedItem().toString());
            if (StringsKt__StringsJVMKt.equals(RenewalOfPermitMainScreen.this.q1(), "other", true)) {
                RenewalOfPermitMainScreen.this.n1().d.setVisibility(0);
            } else {
                RenewalOfPermitMainScreen.this.n1().d.setVisibility(8);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h implements AdapterView.OnItemSelectedListener {
        public h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            RenewalOfPermitMainScreen renewalOfPermitMainScreen = RenewalOfPermitMainScreen.this;
            renewalOfPermitMainScreen.U1(renewalOfPermitMainScreen.n1().c.getSelectedItem().toString());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    public static final void I1(RenewalOfPermitMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.r1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void J1(RenewalOfPermitMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.A1());
        intent.putExtra("RcDetails", this$0.B1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.l1());
        this$0.startActivity(intent);
    }

    public static final void K1(RenewalOfPermitMainScreen this$0, View view) {
        com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1().h.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.r1().b("please_select_nature_of_goods", this$0.getString(R.string.please_select_nature_of_goods)), 0).show();
            return;
        }
        if (this$0.n1().e.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.r1().b("please_select_nature_of_goods", this$0.getString(R.string.please_select_nature_of_goods)), 0).show();
            return;
        }
        if (StringsKt__StringsJVMKt.equals(this$0.n1().e.getSelectedItem().toString(), "other", true) && this$0.n1().d.length() < 3) {
            Toast.makeText(this$0, this$0.r1().b("please_enter_goods_details", this$0.getString(R.string.please_enter_goods_details)), 0).show();
            return;
        }
        try {
            String strZ1 = this$0.z1();
            if (strZ1 != null && !StringsKt__StringsJVMKt.isBlank(strZ1)) {
                this$0.S1(this$0.n1().h.getSelectedItem().toString());
                this$0.Q1(this$0.n1().e.getSelectedItem().toString());
                Intent intent = new Intent(this$0, (Class<?>) RenewalOfPermitAcitivty.class);
                intent.putExtra("permitNo", this$0.z1());
                intent.putExtra("permitValidFrom", this$0.F1());
                intent.putExtra("permitValidUpto", this$0.G1());
                intent.putExtra("permitType", this$0.y1());
                intent.putExtra("permitCategory", this$0.x1());
                intent.putExtra("yearlyMode", this$0.H1());
                intent.putExtra("period", this$0.w1());
                intent.putExtra("allotOffice", this$0.u1());
                intent.putExtra("serviceType", this$0.E1());
                intent.putExtra("natureOfGoods", this$0.s1());
                intent.putExtra("goods", this$0.q1());
                RPDataModel rPDataModel = this$0.rpModel;
                intent.putExtra("region", (rPDataModel == null || (data = rPDataModel.getData()) == null) ? null : data.getVmRegionDetailsDto());
                intent.putExtra("RcDetails", this$0.B1());
                intent.putExtra("RC", this$0.A1());
                intent.putExtra("RcDetails", this$0.B1());
                intent.putExtra("off_code", this$0.t1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                if (StringsKt__StringsJVMKt.equals(this$0.q1(), "other", true)) {
                    intent.putExtra("otherGoods", this$0.n1().d.getText().toString());
                } else {
                    intent.putExtra("otherGoods", " ");
                }
                intent.putExtra("regNo", this$0.B1().getRc_regn_no());
                this$0.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    public final String A1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails B1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final RPDataService C1() {
        RPDataService rPDataService = this.rpDataService;
        if (rPDataService != null) {
            return rPDataService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rpDataService");
        return null;
    }

    public final q35 D1() {
        q35 q35Var = this.rpDataViewModel;
        if (q35Var != null) {
            return q35Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rpDataViewModel");
        return null;
    }

    public final String E1() {
        String str = this.servicesType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("servicesType");
        return null;
    }

    public final String F1() {
        String str = this.validFrom;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("validFrom");
        return null;
    }

    public final String G1() {
        String str = this.validUpto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("validUpto");
        return null;
    }

    public final String H1() {
        String str = this.yearlyMode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("yearlyMode");
        return null;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void N1(cf cfVar) {
        Intrinsics.checkNotNullParameter(cfVar, "<set-?>");
        this.binding = cfVar;
    }

    public final void O1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void P1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
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
        this.office = str;
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
        this.permitType = str;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pmtNo = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void b2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void c2(RPDataService rPDataService) {
        Intrinsics.checkNotNullParameter(rPDataService, "<set-?>");
        this.rpDataService = rPDataService;
    }

    public final void d2(q35 q35Var) {
        Intrinsics.checkNotNullParameter(q35Var, "<set-?>");
        this.rpDataViewModel = q35Var;
    }

    public final void e2(RPDataModel rPDataModel) {
        this.rpModel = rPDataModel;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.servicesType = str;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validFrom = str;
    }

    public final void h2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validUpto = str;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.yearlyMode = str;
    }

    public final String l1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final cf n1() {
        cf cfVar = this.binding;
        if (cfVar != null) {
            return cfVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final o47 o1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cf cfVarC = cf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cfVarC, "inflate(...)");
        N1(cfVarC);
        setContentView(n1().b());
        c2(RPDataService.INSTANCE.a(this));
        P1(DuplicateFitnessService.INSTANCE.a(this));
        R1(new wa3(this));
        ta3.a.S2(this, n1());
        V1(new ProgressDialog(this));
        v1().setMessage(r1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        T1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        L1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        a2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        b2((NrvDetails) serializableExtra);
        n1().d.setVisibility(0);
        n1().I.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitMainScreen.I1(this.a, view);
            }
        });
        R1(new wa3(this));
        n1().J.setText(r1().b("vehicle_no", "Vehicle No.:") + ' ' + A1());
        n1().K.setText(r1().b("view_vehicle_details", "View Vehicle Details"));
        n1().K.setPaintFlags(n1().K.getPaintFlags() | 8);
        n1().K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitMainScreen.J1(this.a, view);
            }
        });
        d2((q35) new z(this, new o35(new p35(C1()))).a(q35.class));
        O1((o47) new z(this, new n47(new j37(p1()))).a(o47.class));
        try {
            v1().show();
            o1().N(this, A1(), B1().getState_cd(), String.valueOf(B1().getRc_off_cd()));
            D1().g(A1(), String.valueOf(B1().getState_cd()), String.valueOf(B1().getRc_off_cd()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        o1().J().g(this, new i(new b()));
        o1().K().g(this, new i(new c()));
        D1().i().g(this, new i(new d()));
        D1().h().g(this, new i(new e()));
        n1().h.setOnItemSelectedListener(new f());
        n1().e.setOnItemSelectedListener(new g());
        n1().c.setOnItemSelectedListener(new h());
        o1().s().g(this, new i(new a()));
        n1().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfPermitMainScreen.K1(this.a, view);
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

    public final DuplicateFitnessService p1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
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
        String str = this.natureOfGOods;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("natureOfGOods");
        return null;
    }

    public final String t1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final String u1() {
        String str = this.office;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("office");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String w1() {
        String str = this.period;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("period");
        return null;
    }

    public final String x1() {
        String str = this.permitCategory;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitCategory");
        return null;
    }

    public final String y1() {
        String str = this.permitType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitType");
        return null;
    }

    public final String z1() {
        String str = this.pmtNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pmtNo");
        return null;
    }
}
