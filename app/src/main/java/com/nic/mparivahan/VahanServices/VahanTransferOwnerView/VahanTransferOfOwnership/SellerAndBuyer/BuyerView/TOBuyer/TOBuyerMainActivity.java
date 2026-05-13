package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.DataX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerModel.TOFetchApplicationDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerMainActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService.TOBuyerApplicationService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gd1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.oa6;
import com.zepto.pa6;
import com.zepto.pb6;
import com.zepto.pg;
import com.zepto.pq;
import com.zepto.qa6;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bt\u0010uJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u00102\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R$\u0010[\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010s\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r¨\u0006v"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerMainActivity;", "Lcom/zepto/pq;", "", "toString", "n1", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/pg;", "C", "Lcom/zepto/pg;", "r1", "()Lcom/zepto/pg;", "F1", "(Lcom/zepto/pg;)V", "binding", "Lcom/zepto/pa6;", "D", "Lcom/zepto/pa6;", "x1", "()Lcom/zepto/pa6;", "M1", "(Lcom/zepto/pa6;)V", "viewModelPurposeTO", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;", "K1", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;)V", "retrofitServicePurposeTO", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "F", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "", "G", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "H", "Ljava/lang/String;", "u1", "()Ljava/lang/String;", "I1", "(Ljava/lang/String;)V", "rc_number", "I", "p1", "D1", "aadhar_name", "J", "o1", "C1", "aadhar_address", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "languageSession", "Landroid/app/ProgressDialog;", "L", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "H1", "(Landroid/app/ProgressDialog;)V", "pDialog", "M", "q1", "E1", "applNo", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "N", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "getToBuyerObject", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;", "L1", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/TOBuyerApplication/TOBuyerModel/TOFetchApplicationDetails;)V", "ToBuyerObject", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "O", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "getGetAddharrdetails", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "Ljava/util/ArrayList;", "P", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TOBuyerMainActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public pg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public pa6 viewModelPurposeTO;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TOBuyerApplicationService retrofitServicePurposeTO;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String applNo;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TOFetchApplicationDetails ToBuyerObject;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public DoAadhaarResponse getAddharrdetails;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(TOFetchApplicationDetails tOFetchApplicationDetails) {
            TransferOwnershipDto transferOwnershipDto;
            TransferOwnershipDto transferOwnershipDto2;
            TransferOwnershipDto transferOwnershipDto3;
            TransferOwnershipDto transferOwnershipDto4;
            TransferOwnershipDto transferOwnershipDto5;
            TransferOwnershipDto transferOwnershipDto6;
            TransferOwnershipDto transferOwnershipDto7;
            TransferOwnershipDto transferOwnershipDto8;
            TransferOwnershipDto transferOwnershipDto9;
            TransferOwnershipDto transferOwnershipDto10;
            try {
                TOBuyerMainActivity.this.L1(tOFetchApplicationDetails);
                TextView textView = TOBuyerMainActivity.this.r1().l;
                TOBuyerMainActivity tOBuyerMainActivity = TOBuyerMainActivity.this;
                DataX data = tOFetchApplicationDetails.getData();
                String emailId = null;
                textView.setText(tOBuyerMainActivity.n1(String.valueOf((data == null || (transferOwnershipDto10 = data.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto10.getReason())));
                TextView textView2 = TOBuyerMainActivity.this.r1().n;
                TOBuyerMainActivity tOBuyerMainActivity2 = TOBuyerMainActivity.this;
                DataX data2 = tOFetchApplicationDetails.getData();
                textView2.setText(tOBuyerMainActivity2.n1(String.valueOf((data2 == null || (transferOwnershipDto9 = data2.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto9.getOwnerCodeDesc())));
                TextView textView3 = TOBuyerMainActivity.this.r1().h;
                TOBuyerMainActivity tOBuyerMainActivity3 = TOBuyerMainActivity.this;
                DataX data3 = tOFetchApplicationDetails.getData();
                textView3.setText(tOBuyerMainActivity3.n1(String.valueOf((data3 == null || (transferOwnershipDto8 = data3.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto8.getOwnerCategoryDesc())));
                TextView textView4 = TOBuyerMainActivity.this.r1().j;
                TOBuyerMainActivity tOBuyerMainActivity4 = TOBuyerMainActivity.this;
                DataX data4 = tOFetchApplicationDetails.getData();
                textView4.setText(tOBuyerMainActivity4.n1(String.valueOf((data4 == null || (transferOwnershipDto7 = data4.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto7.getOwnerName())));
                TextView textView5 = TOBuyerMainActivity.this.r1().d;
                TOBuyerMainActivity tOBuyerMainActivity5 = TOBuyerMainActivity.this;
                DataX data5 = tOFetchApplicationDetails.getData();
                textView5.setText(tOBuyerMainActivity5.n1(String.valueOf((data5 == null || (transferOwnershipDto6 = data5.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto6.getFatherName())));
                TextView textView6 = TOBuyerMainActivity.this.r1().u;
                TOBuyerMainActivity tOBuyerMainActivity6 = TOBuyerMainActivity.this;
                DataX data6 = tOFetchApplicationDetails.getData();
                textView6.setText(tOBuyerMainActivity6.n1(String.valueOf((data6 == null || (transferOwnershipDto5 = data6.getTransferOwnershipDto()) == null) ? null : Long.valueOf(transferOwnershipDto5.getSaleAmmount()))));
                TextView textView7 = TOBuyerMainActivity.this.r1().w;
                TOBuyerMainActivity tOBuyerMainActivity7 = TOBuyerMainActivity.this;
                DataX data7 = tOFetchApplicationDetails.getData();
                textView7.setText(tOBuyerMainActivity7.n1(String.valueOf((data7 == null || (transferOwnershipDto4 = data7.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto4.getSaleDate())));
                TextView textView8 = TOBuyerMainActivity.this.r1().f;
                TOBuyerMainActivity tOBuyerMainActivity8 = TOBuyerMainActivity.this;
                DataX data8 = tOFetchApplicationDetails.getData();
                textView8.setText(tOBuyerMainActivity8.n1(String.valueOf((data8 == null || (transferOwnershipDto3 = data8.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto3.getMobileNo())));
                EditText editText = TOBuyerMainActivity.this.r1().p;
                TOBuyerMainActivity tOBuyerMainActivity9 = TOBuyerMainActivity.this;
                DataX data9 = tOFetchApplicationDetails.getData();
                editText.setText(tOBuyerMainActivity9.n1(String.valueOf((data9 == null || (transferOwnershipDto2 = data9.getTransferOwnershipDto()) == null) ? null : transferOwnershipDto2.getPanNo())));
                EditText editText2 = TOBuyerMainActivity.this.r1().b;
                TOBuyerMainActivity tOBuyerMainActivity10 = TOBuyerMainActivity.this;
                DataX data10 = tOFetchApplicationDetails.getData();
                if (data10 != null && (transferOwnershipDto = data10.getTransferOwnershipDto()) != null) {
                    emailId = transferOwnershipDto.getEmailId();
                }
                editText2.setText(tOBuyerMainActivity10.n1(String.valueOf(emailId)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TOFetchApplicationDetails) obj);
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

    public static final void A1(TOBuyerMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.r1().b.length() > 0 && !mt6.a.u(this$0.r1().b.getText().toString())) {
            Toast.makeText(this$0, this$0.s1().b("label_log_entr_valid_email", this$0.getString(R.string.label_log_entr_valid_email)), 1).show();
            return;
        }
        if (!this$0.isFaceless) {
            new pb6(this$0).g(this$0.r1(), this$0.q1(), "M", this$0.ToBuyerObject);
            Intent intent = new Intent(this$0, (Class<?>) AddressDetailToBuyer.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
            intent.putExtra("stateCd", this$0.v1().getState_cd());
            intent.putExtra("off_code", this$0.v1().getRc_off_cd());
            intent.putExtra(VContant.NEXGEN_isFACELESS, false);
            intent.putExtra("RcDetails", this$0.v1());
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            this$0.startActivity(intent);
            return;
        }
        new pb6(this$0).d(this$0.r1(), this$0.q1(), "A", this$0.ToBuyerObject);
        Intent intent2 = new Intent(this$0, (Class<?>) AadhaarAddressTO.class);
        intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent2.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
        intent2.putExtra("stateCd", this$0.v1().getState_cd());
        intent2.putExtra("off_code", this$0.v1().getRc_off_cd());
        intent2.putExtra(VContant.NEXGEN_isFACELESS, false);
        intent2.putExtra("RcDetails", this$0.v1());
        intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        intent2.putExtra("AadhaarDetails", this$0.getAddharrdetails);
        this$0.startActivity(intent2);
    }

    public static final void B1(TOBuyerMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().j.setText("");
        this$0.r1().d.setText("");
        this$0.r1().u.setText("");
        this$0.r1().p.setText("");
        this$0.r1().b.setText("");
        this$0.r1().f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n1(String toString) {
        return (toString.equals("null") || toString.equals("nul") || gd1.a.m(toString)) ? "" : toString;
    }

    public static final void y1(TOBuyerMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.u1());
        intent.putExtra("RcDetails", this$0.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        this$0.startActivity(intent);
    }

    public static final void z1(TOBuyerMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.s1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public final void C1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.applNo = str;
    }

    public final void F1(pg pgVar) {
        Intrinsics.checkNotNullParameter(pgVar, "<set-?>");
        this.binding = pgVar;
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void H1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void J1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void K1(TOBuyerApplicationService tOBuyerApplicationService) {
        Intrinsics.checkNotNullParameter(tOBuyerApplicationService, "<set-?>");
        this.retrofitServicePurposeTO = tOBuyerApplicationService;
    }

    public final void L1(TOFetchApplicationDetails tOFetchApplicationDetails) {
        this.ToBuyerObject = tOFetchApplicationDetails;
    }

    public final void M1(pa6 pa6Var) {
        Intrinsics.checkNotNullParameter(pa6Var, "<set-?>");
        this.viewModelPurposeTO = pa6Var;
    }

    public final String o1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pg pgVarC = pg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pgVarC, "inflate(...)");
        F1(pgVarC);
        setContentView(r1().b());
        K1(TOBuyerApplicationService.INSTANCE.a(this));
        G1(new wa3(this));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        J1((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        MultiServiceDraftTO multiServiceDraftTO = this.multiServiceobj;
        E1(String.valueOf(multiServiceDraftTO != null ? multiServiceDraftTO.getApplNo() : null));
        I1(String.valueOf(v1().getRc_regn_no()));
        try {
            DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
            this.getAddharrdetails = doAadhaarResponse;
            Log.e("getAddharrdetails-ToBuyerMain", String.valueOf(doAadhaarResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
        r1().y.i.setText(String.valueOf(s1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        r1().y.e.setVisibility(0);
        r1().y.e.setText(u1());
        SpannableString spannableString = new SpannableString(u1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        r1().y.e.setText(spannableString);
        r1().y.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerMainActivity.y1(this.a, view);
            }
        });
        G1(new wa3(this));
        if (new vh7(this).b()) {
            r1().s.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = r1().s.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        H1(new ProgressDialog(this));
        t1().setMessage(s1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        M1((pa6) new z(this, new qa6(new oa6(w1()))).a(pa6.class));
        try {
            x1().g(q1(), false, "", "");
        } catch (Exception unused) {
        }
        r1().y.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerMainActivity.z1(this.a, view);
            }
        });
        x1().h().g(this, new b(new a()));
        r1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerMainActivity.A1(this.a, view);
            }
        });
        r1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TOBuyerMainActivity.B1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final String q1() {
        String str = this.applNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applNo");
        return null;
    }

    public final pg r1() {
        pg pgVar = this.binding;
        if (pgVar != null) {
            return pgVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
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
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final TOBuyerApplicationService w1() {
        TOBuyerApplicationService tOBuyerApplicationService = this.retrofitServicePurposeTO;
        if (tOBuyerApplicationService != null) {
            return tOBuyerApplicationService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServicePurposeTO");
        return null;
    }

    public final pa6 x1() {
        pa6 pa6Var = this.viewModelPurposeTO;
        if (pa6Var != null) {
            return pa6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelPurposeTO");
        return null;
    }
}
