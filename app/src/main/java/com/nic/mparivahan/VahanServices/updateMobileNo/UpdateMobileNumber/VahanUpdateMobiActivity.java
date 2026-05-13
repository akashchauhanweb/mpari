package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileUpdated;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.ApiMessage;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.Data;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.UpdateModelVehDetails;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.VtOwnerIdentitificationEntity;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.mh;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vq6;
import com.zepto.wa3;
import com.zepto.wq6;
import com.zepto.yy0;
import com.zepto.zq6;
import java.util.Calendar;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\ba\u0010bJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0015J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00100\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b>\u0010-\"\u0004\b?\u0010/R\"\u0010D\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010+\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010`\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/VahanUpdateMobiActivity;", "Lcom/zepto/pq;", "", "A1", "I1", "K1", "", "V1", "Landroid/content/Context;", "context", "", "it", "S1", "H1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/zepto/mh;", "C", "Lcom/zepto/mh;", "binding", "Lcom/zepto/wq6;", "D", "Lcom/zepto/wq6;", "z1", "()Lcom/zepto/wq6;", "R1", "(Lcom/zepto/wq6;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "dialog", "G", "Ljava/lang/String;", "getRegistrationDateEtString", "()Ljava/lang/String;", "setRegistrationDateEtString", "(Ljava/lang/String;)V", "registrationDateEtString", "H", "getRegistrationUptoEtString", "setRegistrationUptoEtString", "registrationUptoEtString", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "languageSession", "J", "getOff_code", "setOff_code", "off_code", "K", "getAadhar_name", "setAadhar_name", "aadhar_name", "L", "getAadhar_address", "setAadhar_address", "aadhar_address", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "Lcom/zepto/ld7;", "N", "Lcom/zepto/ld7;", "getVahanViewModle", "()Lcom/zepto/ld7;", "Q1", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/UpdateModelVehDetails;", "O", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/UpdateModelVehDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/UpdateModelVehDetails;", "O1", "(Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/UpdateModelVehDetails;)V", "updateMobile", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanUpdateMobiActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public mh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wq6 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public UpdateMobileUpdated retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public UpdateModelVehDetails updateMobile;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String registrationDateEtString = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String registrationUptoEtString = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String off_code = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_name = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_address = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = VahanUpdateMobiActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanUpdateMobiActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanUpdateMobiActivity vahanUpdateMobiActivity = VahanUpdateMobiActivity.this;
            vahanUpdateMobiActivity.S1(vahanUpdateMobiActivity, str);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(UpdateModelVehDetails updateModelVehDetails) {
            ApiMessage apiMessage;
            Integer statusCode;
            UpdateModelVehDetails updateMobile;
            ApiMessage apiMessage2;
            Integer statusCode2;
            Data data;
            ProgressDialog progressDialog = null;
            if (updateModelVehDetails != null && (apiMessage = updateModelVehDetails.getApiMessage()) != null && (statusCode = apiMessage.getStatusCode()) != null && statusCode.intValue() == 200) {
                gd1.a aVar = gd1.a;
                Data data2 = updateModelVehDetails.getData();
                List<OwnerDetailEntity> ownerDetailEntity = data2 != null ? data2.getOwnerDetailEntity() : null;
                Intrinsics.checkNotNull(ownerDetailEntity);
                if (!aVar.m(ownerDetailEntity.get(0).getRegn_no())) {
                    Data data3 = updateModelVehDetails.getData();
                    List<OwnerDetailEntity> ownerDetailEntity2 = data3 != null ? data3.getOwnerDetailEntity() : null;
                    Intrinsics.checkNotNull(ownerDetailEntity2);
                    if (!aVar.m(ownerDetailEntity2.get(0).getState_cd())) {
                        ProgressDialog progressDialog2 = VahanUpdateMobiActivity.this.dialog;
                        if (progressDialog2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            progressDialog2 = null;
                        }
                        if (progressDialog2.isShowing()) {
                            ProgressDialog progressDialog3 = VahanUpdateMobiActivity.this.dialog;
                            if (progressDialog3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                                progressDialog3 = null;
                            }
                            progressDialog3.dismiss();
                        }
                        mh mhVar = VahanUpdateMobiActivity.this.binding;
                        if (mhVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            mhVar = null;
                        }
                        String strValueOf = String.valueOf(mhVar.c.getText());
                        VahanUpdateMobiActivity.this.O1(updateModelVehDetails);
                        String regn_no = updateModelVehDetails.getData().getOwnerDetailEntity().get(0).getRegn_no();
                        if (regn_no == null || regn_no.length() == 0 || (updateMobile = VahanUpdateMobiActivity.this.getUpdateMobile()) == null || (apiMessage2 = updateMobile.getApiMessage()) == null || (statusCode2 = apiMessage2.getStatusCode()) == null || statusCode2.intValue() != 200) {
                            return;
                        }
                        Log.e("off_code", String.valueOf(updateModelVehDetails.getData().getOwnerDetailEntity().get(0).getOff_cd()));
                        Intent intent = new Intent(VahanUpdateMobiActivity.this, (Class<?>) VahanValidateUpdateMobileActivity.class);
                        UpdateModelVehDetails updateMobile2 = VahanUpdateMobiActivity.this.getUpdateMobile();
                        Intrinsics.checkNotNull(updateMobile2);
                        Data data4 = updateMobile2.getData();
                        intent.putExtra("isAadharEnable", data4 != null ? Boolean.valueOf(data4.getRenderAdharDtls()) : null);
                        intent.putExtra("RC", updateModelVehDetails.getData().getOwnerDetailEntity().get(0).getRegn_no());
                        intent.putExtra("OwnerDetails", new Gson().toJson(updateModelVehDetails.getData().getOwnerDetailEntity()));
                        String strSubstring = strValueOf.substring(strValueOf.length() - 5, strValueOf.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        intent.putExtra("chassiNo", strSubstring);
                        intent.putExtra("off_code", updateModelVehDetails.getData().getOwnerDetailEntity().get(0).getOff_cd());
                        UpdateModelVehDetails updateMobile3 = VahanUpdateMobiActivity.this.getUpdateMobile();
                        Intrinsics.checkNotNull(updateMobile3);
                        Data data5 = updateMobile3.getData();
                        intent.putExtra(VContant.NEXGEN_isFACELESS, data5 != null ? Boolean.valueOf(data5.getRenderAdharDtls()) : null);
                        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                        UpdateModelVehDetails updateMobile4 = VahanUpdateMobiActivity.this.getUpdateMobile();
                        Intrinsics.checkNotNull(updateMobile4);
                        Data data6 = updateMobile4.getData();
                        if ((data6 != null ? data6.getOwnerDetailEntity() : null) != null) {
                            UpdateModelVehDetails updateMobile5 = VahanUpdateMobiActivity.this.getUpdateMobile();
                            Intrinsics.checkNotNull(updateMobile5);
                            Data data7 = updateMobile5.getData();
                            Intrinsics.checkNotNull(data7 != null ? data7.getOwnerDetailEntity() : null);
                            if (!r8.isEmpty()) {
                                UpdateModelVehDetails updateMobile6 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                List<OwnerDetailEntity> ownerDetailEntity3 = (updateMobile6 == null || (data = updateMobile6.getData()) == null) ? null : data.getOwnerDetailEntity();
                                Intrinsics.checkNotNull(ownerDetailEntity3);
                                OwnerDetailEntity ownerDetailEntity4 = ownerDetailEntity3.get(0);
                                intent.putExtra("regNo", ownerDetailEntity4 != null ? ownerDetailEntity4.getRegn_no() : null);
                                UpdateModelVehDetails updateMobile7 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile7);
                                Data data8 = updateMobile7.getData();
                                List<OwnerDetailEntity> ownerDetailEntity5 = data8 != null ? data8.getOwnerDetailEntity() : null;
                                Intrinsics.checkNotNull(ownerDetailEntity5);
                                intent.putExtra("stateCd", ownerDetailEntity5.get(0).getState_cd());
                                UpdateModelVehDetails updateMobile8 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile8);
                                Data data9 = updateMobile8.getData();
                                List<OwnerDetailEntity> ownerDetailEntity6 = data9 != null ? data9.getOwnerDetailEntity() : null;
                                Intrinsics.checkNotNull(ownerDetailEntity6);
                                intent.putExtra("stateName", ownerDetailEntity6.get(0).getState_name());
                                UpdateModelVehDetails updateMobile9 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile9);
                                Data data10 = updateMobile9.getData();
                                List<OwnerDetailEntity> ownerDetailEntity7 = data10 != null ? data10.getOwnerDetailEntity() : null;
                                Intrinsics.checkNotNull(ownerDetailEntity7);
                                intent.putExtra("ownerName", ownerDetailEntity7.get(0).getOwner_name());
                            }
                        }
                        UpdateModelVehDetails updateMobile10 = VahanUpdateMobiActivity.this.getUpdateMobile();
                        Intrinsics.checkNotNull(updateMobile10);
                        Data data11 = updateMobile10.getData();
                        if ((data11 != null ? data11.getVtOwnerIdentitificationEntity() : null) != null) {
                            UpdateModelVehDetails updateMobile11 = VahanUpdateMobiActivity.this.getUpdateMobile();
                            Intrinsics.checkNotNull(updateMobile11);
                            Data data12 = updateMobile11.getData();
                            List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity = data12 != null ? data12.getVtOwnerIdentitificationEntity() : null;
                            Intrinsics.checkNotNull(vtOwnerIdentitificationEntity);
                            if (vtOwnerIdentitificationEntity.size() > 0) {
                                UpdateModelVehDetails updateMobile12 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile12);
                                Data data13 = updateMobile12.getData();
                                List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity2 = data13 != null ? data13.getVtOwnerIdentitificationEntity() : null;
                                Intrinsics.checkNotNull(vtOwnerIdentitificationEntity2);
                                vtOwnerIdentitificationEntity2.get(0).getMobileNo();
                                UpdateModelVehDetails updateMobile13 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile13);
                                Data data14 = updateMobile13.getData();
                                List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity3 = data14 != null ? data14.getVtOwnerIdentitificationEntity() : null;
                                Intrinsics.checkNotNull(vtOwnerIdentitificationEntity3);
                                intent.putExtra("mobileNo", String.valueOf(vtOwnerIdentitificationEntity3.get(0).getMobileNo()));
                                UpdateModelVehDetails updateMobile14 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile14);
                                Data data15 = updateMobile14.getData();
                                List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity4 = data15 != null ? data15.getVtOwnerIdentitificationEntity() : null;
                                Intrinsics.checkNotNull(vtOwnerIdentitificationEntity4);
                                if (vtOwnerIdentitificationEntity4.get(0).getAadharNo() != null) {
                                    UpdateModelVehDetails updateMobile15 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                    Intrinsics.checkNotNull(updateMobile15);
                                    Data data16 = updateMobile15.getData();
                                    List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity5 = data16 != null ? data16.getVtOwnerIdentitificationEntity() : null;
                                    Intrinsics.checkNotNull(vtOwnerIdentitificationEntity5);
                                    intent.putExtra("aadharNo", vtOwnerIdentitificationEntity5.get(0).getAadharNo());
                                } else {
                                    intent.putExtra("aadharNo", "");
                                }
                                UpdateModelVehDetails updateMobile16 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                Intrinsics.checkNotNull(updateMobile16);
                                Data data17 = updateMobile16.getData();
                                List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity6 = data17 != null ? data17.getVtOwnerIdentitificationEntity() : null;
                                Intrinsics.checkNotNull(vtOwnerIdentitificationEntity6);
                                if (vtOwnerIdentitificationEntity6.get(0).getEmailId() != null) {
                                    UpdateModelVehDetails updateMobile17 = VahanUpdateMobiActivity.this.getUpdateMobile();
                                    Intrinsics.checkNotNull(updateMobile17);
                                    Data data18 = updateMobile17.getData();
                                    List<VtOwnerIdentitificationEntity> vtOwnerIdentitificationEntity7 = data18 != null ? data18.getVtOwnerIdentitificationEntity() : null;
                                    Intrinsics.checkNotNull(vtOwnerIdentitificationEntity7);
                                    intent.putExtra("emailId", vtOwnerIdentitificationEntity7.get(0).getEmailId());
                                } else {
                                    intent.putExtra("emailId", "");
                                }
                            }
                        }
                        VahanUpdateMobiActivity.this.startActivity(intent);
                        return;
                    }
                }
            }
            ProgressDialog progressDialog4 = VahanUpdateMobiActivity.this.dialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog4 = null;
            }
            if (progressDialog4.isShowing()) {
                ProgressDialog progressDialog5 = VahanUpdateMobiActivity.this.dialog;
                if (progressDialog5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog5;
                }
                progressDialog.dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateModelVehDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    private final void A1() {
        mh mhVar = this.binding;
        mh mhVar2 = null;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        this.registrationDateEtString = String.valueOf(mhVar.i.getText());
        mh mhVar3 = this.binding;
        if (mhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar3 = null;
        }
        this.registrationUptoEtString = String.valueOf(mhVar3.m.getText());
        R1((wq6) new z(this, new zq6(new vq6(w1()))).a(wq6.class));
        mh mhVar4 = this.binding;
        if (mhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar4 = null;
        }
        mhVar4.i.setFocusable(0);
        mh mhVar5 = this.binding;
        if (mhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar5 = null;
        }
        mhVar5.m.setFocusable(0);
        mh mhVar6 = this.binding;
        if (mhVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar6 = null;
        }
        mhVar6.n.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.B1(this.a, view);
            }
        });
        mh mhVar7 = this.binding;
        if (mhVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar7 = null;
        }
        mhVar7.n.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ii7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.C1(this.a, view);
            }
        });
        mh mhVar8 = this.binding;
        if (mhVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar8 = null;
        }
        mhVar8.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ji7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.D1(this.a, view);
            }
        });
        mh mhVar9 = this.binding;
        if (mhVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar9 = null;
        }
        mhVar9.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ki7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.E1(this.a, view);
            }
        });
        z1().g().g(this, new c(new a()));
        mh mhVar10 = this.binding;
        if (mhVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar10 = null;
        }
        mhVar10.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.li7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.F1(this.a, view);
            }
        });
        z1().h().g(this, new c(new b()));
        mh mhVar11 = this.binding;
        if (mhVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mhVar2 = mhVar11;
        }
        mhVar2.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.G1(this.a, view);
            }
        });
    }

    public static final void B1(VahanUpdateMobiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
        VContant.INSTANCE.K(this$0);
    }

    public static final void C1(VahanUpdateMobiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    public static final void D1(VahanUpdateMobiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.V1()) {
            ProgressDialog progressDialog = this$0.dialog;
            mh mhVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            wq6 wq6VarZ1 = this$0.z1();
            mh mhVar2 = this$0.binding;
            if (mhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar2 = null;
            }
            String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(mhVar2.h.getText())).toString();
            mh mhVar3 = this$0.binding;
            if (mhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar3 = null;
            }
            String string2 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(mhVar3.c.getText())).toString();
            mh mhVar4 = this$0.binding;
            if (mhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar = mhVar4;
            }
            wq6VarZ1.l(string, string2, StringsKt__StringsKt.trim((CharSequence) String.valueOf(mhVar.e.getText())).toString(), this$0.registrationDateEtString, this$0.registrationUptoEtString);
        }
    }

    public static final void E1(VahanUpdateMobiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(VahanUpdateMobiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    public static final void G1(VahanUpdateMobiActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    private final void H1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void I1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.oi7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                VahanUpdateMobiActivity.J1(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J1(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, VahanUpdateMobiActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationDateEtString = sb3.toString();
        mh mhVar = this$0.binding;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        AppCompatEditText appCompatEditText = mhVar.i;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatEditText.setText(sb4.toString());
    }

    private final void K1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ni7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                VahanUpdateMobiActivity.L1(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L1(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, VahanUpdateMobiActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationUptoEtString = sb3.toString();
        mh mhVar = this$0.binding;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        AppCompatEditText appCompatEditText = mhVar.m;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatEditText.setText(sb4.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(wa3Var.b("btn_ok", "ok"));
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.T1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanUpdateMobiActivity.U1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean V1() {
        mh mhVar = this.binding;
        mh mhVar2 = null;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        Editable text = mhVar.h.getText();
        if (text != null && text.length() == 0) {
            mh mhVar3 = this.binding;
            if (mhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar3 = null;
            }
            mhVar3.h.setError(v1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no)));
            mh mhVar4 = this.binding;
            if (mhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar4;
            }
            mhVar2.h.requestFocus();
            return false;
        }
        mh mhVar5 = this.binding;
        if (mhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar5 = null;
        }
        if (String.valueOf(mhVar5.h.getText()).length() < 4) {
            mh mhVar6 = this.binding;
            if (mhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar6 = null;
            }
            mhVar6.h.setError(v1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 character with no special character"));
            mh mhVar7 = this.binding;
            if (mhVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar7;
            }
            mhVar2.h.requestFocus();
            return false;
        }
        mh mhVar8 = this.binding;
        if (mhVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar8 = null;
        }
        Editable text2 = mhVar8.c.getText();
        if (text2 != null && text2.length() == 0) {
            mh mhVar9 = this.binding;
            if (mhVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar9 = null;
            }
            mhVar9.c.setError(v1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no)));
            mh mhVar10 = this.binding;
            if (mhVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar10;
            }
            mhVar2.c.requestFocus();
            return false;
        }
        mh mhVar11 = this.binding;
        if (mhVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar11 = null;
        }
        if (String.valueOf(mhVar11.c.getText()).length() < 5) {
            mh mhVar12 = this.binding;
            if (mhVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar12 = null;
            }
            mhVar12.c.setError(v1().b("INVALID_CHASSI", getString(R.string.invalid_chassis_no)));
            mh mhVar13 = this.binding;
            if (mhVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar13;
            }
            mhVar2.c.requestFocus();
            return false;
        }
        mh mhVar14 = this.binding;
        if (mhVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar14 = null;
        }
        Editable text3 = mhVar14.e.getText();
        if (text3 != null && text3.length() == 0) {
            mh mhVar15 = this.binding;
            if (mhVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar15 = null;
            }
            mhVar15.e.setError(v1().b("label_challan_enter_engine_no", getString(R.string.invalid_chassis_no)));
            mh mhVar16 = this.binding;
            if (mhVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar16;
            }
            mhVar2.e.requestFocus();
            return false;
        }
        mh mhVar17 = this.binding;
        if (mhVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar17 = null;
        }
        if (String.valueOf(mhVar17.e.getText()).length() < 5) {
            mh mhVar18 = this.binding;
            if (mhVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar18 = null;
            }
            mhVar18.e.setError(v1().b("INVALID_ENGINE", getString(R.string.invalid_engine_no)));
            mh mhVar19 = this.binding;
            if (mhVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar19;
            }
            mhVar2.e.requestFocus();
            return false;
        }
        mh mhVar20 = this.binding;
        if (mhVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar20 = null;
        }
        Editable text4 = mhVar20.i.getText();
        if (text4 != null && text4.length() == 0) {
            mh mhVar21 = this.binding;
            if (mhVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mhVar21 = null;
            }
            mhVar21.i.setError(v1().b("REG_DATE", getString(R.string.please_enter_reg_date)));
            mh mhVar22 = this.binding;
            if (mhVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mhVar2 = mhVar22;
            }
            mhVar2.i.requestFocus();
            return false;
        }
        mh mhVar23 = this.binding;
        if (mhVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar23 = null;
        }
        Editable text5 = mhVar23.m.getText();
        if (text5 == null || text5.length() != 0) {
            return true;
        }
        mh mhVar24 = this.binding;
        if (mhVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar24 = null;
        }
        mhVar24.m.setError(v1().b("REG_UPTO", getString(R.string.please_enter_reg_upto)));
        mh mhVar25 = this.binding;
        if (mhVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mhVar2 = mhVar25;
        }
        mhVar2.m.requestFocus();
        return false;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void N1(UpdateMobileUpdated updateMobileUpdated) {
        Intrinsics.checkNotNullParameter(updateMobileUpdated, "<set-?>");
        this.retrofitService = updateMobileUpdated;
    }

    public final void O1(UpdateModelVehDetails updateModelVehDetails) {
        this.updateMobile = updateModelVehDetails;
    }

    public final void P1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void Q1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final void R1(wq6 wq6Var) {
        Intrinsics.checkNotNullParameter(wq6Var, "<set-?>");
        this.viewModel = wq6Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        VContant.INSTANCE.K(this);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_update_mobile);
        mh mhVarC = mh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(mhVarC, "inflate(...)");
        this.binding = mhVarC;
        ProgressDialog progressDialog = null;
        if (mhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVarC = null;
        }
        setContentView(mhVarC.b());
        getWindow().addFlags(128);
        ta3.a aVar = ta3.a;
        mh mhVar = this.binding;
        if (mhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mhVar = null;
        }
        aVar.W2(this, mhVar);
        M1(new wa3(this));
        N1(UpdateMobileUpdated.INSTANCE.a(this));
        P1(VahanProService.INSTANCE.a(this));
        Q1((ld7) new z(this, new kd7(new jd7(y1()))).a(ld7.class));
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.dialog = progressDialog2;
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog = progressDialog4;
        }
        progressDialog.setMessage(v1().b("label_challan_please_wait", "Please wait..."));
        A1();
    }

    public final wa3 v1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final UpdateMobileUpdated w1() {
        UpdateMobileUpdated updateMobileUpdated = this.retrofitService;
        if (updateMobileUpdated != null) {
            return updateMobileUpdated;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final UpdateModelVehDetails getUpdateMobile() {
        return this.updateMobile;
    }

    public final VahanProService y1() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final wq6 z1() {
        wq6 wq6Var = this.viewModel;
        if (wq6Var != null) {
            return wq6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
