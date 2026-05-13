package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseBody;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseMessage;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import com.zepto.bj2;
import com.zepto.cx;
import com.zepto.dx;
import com.zepto.gf2;
import com.zepto.lf2;
import com.zepto.mf2;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.p6;
import com.zepto.q44;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010)R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010_\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010o\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010=\u001a\u0004\bm\u0010?\"\u0004\bn\u0010AR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006z"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/view/ApplicationStatusActivity;", "Lcom/zepto/o40;", "", "c2", "e2", "U1", "", "visible", "y2", "R1", "", "message", "pdfUrl", "k2", "o2", "m2", "q2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "i2", "Lcom/zepto/p6;", "F", "Lcom/zepto/p6;", "W1", "()Lcom/zepto/p6;", "u2", "(Lcom/zepto/p6;)V", "mBinding", "Ljava/util/Calendar;", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "Ljava/lang/String;", "dateformate", "I", "appNo", "J", "dob", "Lcom/zepto/cx;", "K", "Lcom/zepto/cx;", "appStatusVM", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "L", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "T1", "()Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "s2", "(Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;)V", "appInfoService", "Lcom/zepto/wl5;", "M", "Lcom/zepto/wl5;", "b2", "()Lcom/zepto/wl5;", "B2", "(Lcom/zepto/wl5;)V", "sarthiSession", "N", "title_name", "Lcom/zepto/mf2;", "O", "Lcom/zepto/mf2;", "Z1", "()Lcom/zepto/mf2;", "x2", "(Lcom/zepto/mf2;)V", "mFormsVM", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "P", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "Y1", "()Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "w2", "(Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;)V", "mFormsInterface", "Lcom/zepto/yk1;", "Q", "Lcom/zepto/yk1;", "viewModel", "R", "Landroid/content/Context;", "X1", "()Landroid/content/Context;", "v2", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/wa3;", "S", "Lcom/zepto/wa3;", "V1", "()Lcom/zepto/wa3;", "t2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/sw4;", "T", "Lcom/zepto/sw4;", "mProgressApplication", "U", "getSarathiSession", "A2", "sarathiSession", "Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "V", "Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "a2", "()Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "z2", "(Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;)V", "respBody", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nApplicationStatusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationStatusActivity.kt\ncom/nic/mparivahan/Sarathithreeservices/view/ApplicationStatusActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,845:1\n1#2:846\n*E\n"})
public final class ApplicationStatusActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public p6 mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dateformate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String appNo;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public cx appStatusVM;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public GetApplStatusService appInfoService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String title_name;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public mf2 mFormsVM;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public FormsInterface mFormsInterface;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ResponseBody respBody;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetApplInfoResponse getApplInfoResponse) {
            ResponseMessage responseMessage;
            Integer statusCode;
            String str;
            String str2;
            String str3;
            ApplicationStatusActivity.this.y2(false);
            try {
                ApplicationStatusActivity applicationStatusActivity = ApplicationStatusActivity.this;
                ResponseBody responseBody = getApplInfoResponse.getResponseBody();
                Intrinsics.checkNotNull(responseBody);
                applicationStatusActivity.z2(responseBody);
                responseMessage = getApplInfoResponse.getResponseMessage();
            } catch (Exception unused) {
                ApplicationStatusActivity applicationStatusActivity2 = ApplicationStatusActivity.this;
                applicationStatusActivity2.i2(applicationStatusActivity2.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", "Record not found"));
                return;
            }
            if (responseMessage != null && (statusCode = responseMessage.getStatusCode()) != null && statusCode.intValue() == 200) {
                String str4 = ApplicationStatusActivity.this.title_name;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("title_name");
                    str4 = null;
                }
                if (Intrinsics.areEqual(str4, "Withdraw Services")) {
                    Intent intent = new Intent();
                    intent.setClass(ApplicationStatusActivity.this, WithdrawDetailsActivity.class);
                    String str5 = ApplicationStatusActivity.this.appNo;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appNo");
                        str5 = null;
                    }
                    intent.putExtra("app_no", str5);
                    String str6 = ApplicationStatusActivity.this.dob;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dob");
                        str3 = null;
                    } else {
                        str3 = str6;
                    }
                    intent.putExtra("dob", str3);
                    ApplicationStatusActivity.this.startActivity(intent);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(ApplicationStatusActivity.this.b2().b(), "1002", true)) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        String str7 = ApplicationStatusActivity.this.appNo;
                        if (str7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appNo");
                            str7 = null;
                        }
                        sb.append(str7);
                        sb.append('-');
                        String str8 = ApplicationStatusActivity.this.dob;
                        if (str8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dob");
                            str8 = null;
                        }
                        sb.append(str8);
                        Log.d("android.util.Base64", sb.toString());
                        String str9 = ApplicationStatusActivity.this.appNo;
                        if (str9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appNo");
                            str9 = null;
                        }
                        Charset charsetForName = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                        byte[] bytes = str9.getBytes(charsetForName);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        String strEncodeToString = Base64.encodeToString(bytes, 0);
                        String str10 = ApplicationStatusActivity.this.dob;
                        if (str10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dob");
                            str = null;
                        } else {
                            str = str10;
                        }
                        Charset charsetForName2 = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                        byte[] bytes2 = str.getBytes(charsetForName2);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                        String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                        if (!q44.a.a(ApplicationStatusActivity.this)) {
                            ApplicationStatusActivity applicationStatusActivity3 = ApplicationStatusActivity.this;
                            Toast.makeText(applicationStatusActivity3, applicationStatusActivity3.V1().b("label_log_check_internet", ApplicationStatusActivity.this.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                            return;
                        } else {
                            mf2 mf2VarZ1 = ApplicationStatusActivity.this.Z1();
                            Intrinsics.checkNotNull(strEncodeToString);
                            Intrinsics.checkNotNull(strEncodeToString2);
                            mf2VarZ1.i(strEncodeToString, strEncodeToString2);
                            return;
                        }
                    } catch (Exception unused2) {
                        ApplicationStatusActivity applicationStatusActivity4 = ApplicationStatusActivity.this;
                        applicationStatusActivity4.i2(applicationStatusActivity4.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", "Record not found"));
                        return;
                    }
                }
                if (StringsKt__StringsJVMKt.equals(ApplicationStatusActivity.this.b2().b(), "1001", true)) {
                    try {
                        String str11 = ApplicationStatusActivity.this.appNo;
                        if (str11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appNo");
                            str11 = null;
                        }
                        Charset charsetForName3 = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName3, "forName(charsetName)");
                        byte[] bytes3 = str11.getBytes(charsetForName3);
                        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                        String strEncodeToString3 = Base64.encodeToString(bytes3, 0);
                        String str12 = ApplicationStatusActivity.this.dob;
                        if (str12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dob");
                            str12 = null;
                        }
                        Charset charsetForName4 = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName4, "forName(charsetName)");
                        byte[] bytes4 = str12.getBytes(charsetForName4);
                        Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                        String strEncodeToString4 = Base64.encodeToString(bytes4, 0);
                        if (!q44.a.a(ApplicationStatusActivity.this)) {
                            ApplicationStatusActivity applicationStatusActivity5 = ApplicationStatusActivity.this;
                            Toast.makeText(applicationStatusActivity5, applicationStatusActivity5.V1().b("label_log_check_internet", ApplicationStatusActivity.this.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                            return;
                        } else {
                            mf2 mf2VarZ12 = ApplicationStatusActivity.this.Z1();
                            Intrinsics.checkNotNull(strEncodeToString3);
                            Intrinsics.checkNotNull(strEncodeToString4);
                            mf2VarZ12.h(strEncodeToString3, strEncodeToString4);
                            return;
                        }
                    } catch (Exception unused3) {
                        ApplicationStatusActivity applicationStatusActivity6 = ApplicationStatusActivity.this;
                        applicationStatusActivity6.i2(applicationStatusActivity6.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", "Record not found"));
                        return;
                    }
                }
                if (!StringsKt__StringsJVMKt.equals(ApplicationStatusActivity.this.b2().b(), "1000", true)) {
                    if (!StringsKt__StringsJVMKt.equals(ApplicationStatusActivity.this.b2().b(), "902", true)) {
                        Intent intent2 = new Intent();
                        intent2.setClass(ApplicationStatusActivity.this, ApplicationDetailsActivity.class);
                        String str13 = ApplicationStatusActivity.this.appNo;
                        if (str13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appNo");
                            str13 = null;
                        }
                        intent2.putExtra("app_no", str13);
                        String str14 = ApplicationStatusActivity.this.dob;
                        if (str14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dob");
                            str2 = null;
                        } else {
                            str2 = str14;
                        }
                        intent2.putExtra("dob", str2);
                        intent2.putExtra("respBody", ApplicationStatusActivity.this.a2());
                        ApplicationStatusActivity.this.startActivity(intent2);
                        return;
                    }
                    try {
                        if (!q44.a.a(ApplicationStatusActivity.this)) {
                            ApplicationStatusActivity applicationStatusActivity7 = ApplicationStatusActivity.this;
                            Toast.makeText(applicationStatusActivity7, applicationStatusActivity7.V1().b("label_log_check_internet", ApplicationStatusActivity.this.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                            return;
                        }
                        yk1 yk1Var = ApplicationStatusActivity.this.viewModel;
                        if (yk1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            yk1Var = null;
                        }
                        String str15 = ApplicationStatusActivity.this.appNo;
                        if (str15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appNo");
                            str15 = null;
                        }
                        String str16 = ApplicationStatusActivity.this.dob;
                        if (str16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dob");
                            str16 = null;
                        }
                        yk1Var.g(str15, str16);
                        return;
                    } catch (Exception unused4) {
                        ApplicationStatusActivity applicationStatusActivity8 = ApplicationStatusActivity.this;
                        applicationStatusActivity8.i2(applicationStatusActivity8.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", "Record not found"));
                        return;
                    }
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String str17 = ApplicationStatusActivity.this.appNo;
                    if (str17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appNo");
                        str17 = null;
                    }
                    sb2.append(str17);
                    sb2.append('-');
                    String str18 = ApplicationStatusActivity.this.dob;
                    if (str18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dob");
                        str18 = null;
                    }
                    sb2.append(str18);
                    Log.d("android.util.Base64", sb2.toString());
                    String str19 = ApplicationStatusActivity.this.appNo;
                    if (str19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appNo");
                        str19 = null;
                    }
                    Charset charsetForName5 = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(charsetForName5, "forName(charsetName)");
                    byte[] bytes5 = str19.getBytes(charsetForName5);
                    Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
                    String strEncodeToString5 = Base64.encodeToString(bytes5, 0);
                    String str20 = ApplicationStatusActivity.this.dob;
                    if (str20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dob");
                        str20 = null;
                    }
                    Charset charsetForName6 = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(charsetForName6, "forName(charsetName)");
                    byte[] bytes6 = str20.getBytes(charsetForName6);
                    Intrinsics.checkNotNullExpressionValue(bytes6, "this as java.lang.String).getBytes(charset)");
                    String strEncodeToString6 = Base64.encodeToString(bytes6, 0);
                    if (!q44.a.a(ApplicationStatusActivity.this)) {
                        ApplicationStatusActivity applicationStatusActivity9 = ApplicationStatusActivity.this;
                        Toast.makeText(applicationStatusActivity9, applicationStatusActivity9.getString(R.string.no_internet), 1).show();
                        return;
                    } else {
                        mf2 mf2VarZ13 = ApplicationStatusActivity.this.Z1();
                        Intrinsics.checkNotNull(strEncodeToString5);
                        Intrinsics.checkNotNull(strEncodeToString6);
                        mf2VarZ13.g(strEncodeToString5, strEncodeToString6);
                        return;
                    }
                } catch (Exception unused5) {
                    ApplicationStatusActivity applicationStatusActivity10 = ApplicationStatusActivity.this;
                    applicationStatusActivity10.i2(applicationStatusActivity10.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", "Record not found"));
                    return;
                }
                ApplicationStatusActivity applicationStatusActivity22 = ApplicationStatusActivity.this;
                applicationStatusActivity22.i2(applicationStatusActivity22.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", "Record not found"));
                return;
            }
            ApplicationStatusActivity applicationStatusActivity11 = ApplicationStatusActivity.this;
            Context contextX1 = applicationStatusActivity11.X1();
            ResponseMessage responseMessage2 = getApplInfoResponse.getResponseMessage();
            applicationStatusActivity11.i2(contextX1, responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetApplInfoResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(FormsPojo formsPojo) {
            if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                ApplicationStatusActivity applicationStatusActivity = ApplicationStatusActivity.this;
                applicationStatusActivity.k2(applicationStatusActivity.V1().b("label_form_download", ApplicationStatusActivity.this.getString(R.string.form1_download)), formsPojo.getForm_report());
            } else {
                ApplicationStatusActivity applicationStatusActivity2 = ApplicationStatusActivity.this;
                applicationStatusActivity2.i2(applicationStatusActivity2.X1(), formsPojo.getStatus_desc());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(FormsPojo formsPojo) {
            if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                ApplicationStatusActivity applicationStatusActivity = ApplicationStatusActivity.this;
                applicationStatusActivity.o2(applicationStatusActivity.V1().b("label_form2_download", ApplicationStatusActivity.this.getString(R.string.form2_download)), formsPojo.getForm_report());
            } else {
                ApplicationStatusActivity applicationStatusActivity2 = ApplicationStatusActivity.this;
                applicationStatusActivity2.i2(applicationStatusActivity2.X1(), formsPojo.getStatus_desc());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(FormsPojo formsPojo) {
            if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                ApplicationStatusActivity applicationStatusActivity = ApplicationStatusActivity.this;
                applicationStatusActivity.m2(applicationStatusActivity.V1().b("label_form1_download", ApplicationStatusActivity.this.getString(R.string.form1a_download)), formsPojo.getForm_report());
            } else {
                ApplicationStatusActivity applicationStatusActivity2 = ApplicationStatusActivity.this;
                applicationStatusActivity2.i2(applicationStatusActivity2.X1(), formsPojo.getStatus_desc());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("Reportdets")) {
                        String string = jSONObject.getString("Reportdets");
                        ApplicationStatusActivity applicationStatusActivity = ApplicationStatusActivity.this;
                        String strB = applicationStatusActivity.V1().b("app_slip_saved", "Appointment Receipt is saved successfully in storage");
                        Intrinsics.checkNotNull(string);
                        applicationStatusActivity.q2(strB, string);
                    }
                } catch (Exception e) {
                    ApplicationStatusActivity applicationStatusActivity2 = ApplicationStatusActivity.this;
                    applicationStatusActivity2.i2(applicationStatusActivity2.X1(), ApplicationStatusActivity.this.V1().b("record_error_msg", ApplicationStatusActivity.this.getString(R.string.unable_to_get_details)));
                    e.printStackTrace();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public ApplicationStatusActivity() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.cal = calendar;
    }

    private final void R1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.yw
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                ApplicationStatusActivity.S1(this.a, datePicker, i, i2, i3);
            }
        }, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void S1(ApplicationStatusActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) charSequence) + '-' + ((String) charSequence2) + '-' + ((String) charSequence3);
        this$0.dateformate = str;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        TextView textView = this$0.W1().b;
        String str3 = this$0.dateformate;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void c2() {
        W1().g.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.d2(this.a, view);
            }
        });
        this.appStatusVM = (cx) new z(this, new dx(new bj2(T1()))).a(cx.class);
        B2(new wl5(this));
        this.title_name = b2().k();
        AppCompatTextView appCompatTextView = W1().m;
        String str = this.title_name;
        yk1 yk1Var = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title_name");
            str = null;
        }
        appCompatTextView.setText(str);
        W1().g.f.setText(b2().k());
        String str2 = this.title_name;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title_name");
            str2 = null;
        }
        if (Intrinsics.areEqual(str2, "Dispose Application")) {
            W1().k.setVisibility(0);
            W1().j.setVisibility(0);
            W1().c.setHint(V1().b("label_dl_serv_appl_no", ""));
            W1().b.setHint(getString(R.string.enter_date));
        } else {
            W1().k.setVisibility(8);
            W1().j.setVisibility(8);
        }
        U1();
        Z1().k().g(this, new f(new b()));
        Z1().m().g(this, new f(new c()));
        Z1().l().g(this, new f(new d()));
        yk1 yk1Var2 = this.viewModel;
        if (yk1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            yk1Var = yk1Var2;
        }
        yk1Var.j().g(this, new f(new e()));
    }

    public static final void d2(ApplicationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void e2() {
        W1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.f2(this.a, view);
            }
        });
        W1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.g2(this.a, view);
            }
        });
        W1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.h2(this.a, view);
            }
        });
    }

    public static final void f2(ApplicationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1();
    }

    public static final void g2(ApplicationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (StringsKt__StringsJVMKt.equals(this$0.b2().b(), "901", true)) {
            if (Intrinsics.areEqual(this$0.W1().c.getText().toString(), "")) {
                Toast.makeText(this$0, this$0.V1().b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
                return;
            }
            if (Intrinsics.areEqual(this$0.W1().b.getText().toString(), "")) {
                Toast.makeText(this$0, this$0.V1().b("edit_dl_serv_dob", this$0.getString(R.string.enter_dob)), 1).show();
                return;
            }
            if (!q44.a.a(this$0)) {
                Toast.makeText(this$0, this$0.V1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                return;
            }
            Intent intent = new Intent(this$0, (Class<?>) ReprintReceipt.class);
            intent.putExtra("app_no", this$0.W1().c.getText().toString());
            intent.putExtra("app_dob", this$0.W1().b.getText().toString());
            this$0.startActivity(intent);
            return;
        }
        this$0.appNo = this$0.W1().c.getText().toString();
        this$0.dob = this$0.W1().b.getText().toString();
        String str = this$0.appNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str = null;
        }
        if (Intrinsics.areEqual(str, "")) {
            Toast.makeText(this$0, this$0.V1().b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
            return;
        }
        String str3 = this$0.dob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
            str3 = null;
        }
        if (Intrinsics.areEqual(str3, "")) {
            Toast.makeText(this$0, this$0.V1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        if (st6.e(this$0)) {
            if (!q44.a.a(this$0)) {
                Toast.makeText(this$0, this$0.V1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                return;
            }
            this$0.y2(true);
            cx cxVar = this$0.appStatusVM;
            if (cxVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
                cxVar = null;
            }
            String str4 = this$0.appNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
                str4 = null;
            }
            String str5 = this$0.dob;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dob");
            } else {
                str2 = str5;
            }
            cxVar.g(this$0, str4, str2);
        }
    }

    public static final void h2(ApplicationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void j2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(V1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(V1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.l2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public static final void l2(Dialog d2, ApplicationStatusActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str2 = this$0.appNo;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append('_');
            sb.append(jCurrentTimeMillis);
            sb.append(".pdf");
            File file2 = new File(str + sb.toString());
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append("/mParivahan_doc/");
            String str4 = this$0.appNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append('_');
            sb2.append(jCurrentTimeMillis);
            sb2.append(".pdf");
            Uri uriF = FileProvider.f(this$0.X1(), "com.nic.mparivahan.provider", new File(sb2.toString()));
            Log.e("create pdf uri path==>", "" + uriF);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void n2(Dialog d2, ApplicationStatusActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str2 = this$0.appNo;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append('_');
            sb.append(jCurrentTimeMillis);
            sb.append(".pdf");
            File file2 = new File(str + sb.toString());
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append("/mParivahan_doc/");
            String str4 = this$0.appNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append('_');
            sb2.append(jCurrentTimeMillis);
            sb2.append(".pdf");
            Uri uriF = FileProvider.f(this$0.X1(), "com.nic.mparivahan.provider", new File(sb2.toString()));
            Log.e("create pdf uri path==>", "" + uriF);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void p2(Dialog d2, ApplicationStatusActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str2 = this$0.appNo;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append('_');
            sb.append(jCurrentTimeMillis);
            sb.append(".pdf");
            File file2 = new File(str + sb.toString());
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append("/mParivahan_doc/");
            String str4 = this$0.appNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append('_');
            sb2.append(jCurrentTimeMillis);
            sb2.append(".pdf");
            Uri uriF = FileProvider.f(this$0.X1(), "com.nic.mparivahan.provider", new File(sb2.toString()));
            Log.e("create pdf uri path==>", "" + uriF);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void r2(Dialog d2, ApplicationStatusActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str2 = this$0.appNo;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
                str2 = null;
            }
            sb.append(str2);
            sb.append('_');
            sb.append(jCurrentTimeMillis);
            sb.append(".pdf");
            File file2 = new File(str + sb.toString());
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb2.append("/mParivahan_doc/");
            String str4 = this$0.appNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
            } else {
                str3 = str4;
            }
            sb2.append(str3);
            sb2.append('_');
            sb2.append(jCurrentTimeMillis);
            sb2.append(".pdf");
            Uri uriF = FileProvider.f(this$0.X1(), "com.nic.mparivahan.provider", new File(sb2.toString()));
            Log.e("create pdf uri path==>", "" + uriF);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y2(boolean visible) {
        if (visible) {
            try {
                this.mProgressApplication = new sw4(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e2) {
                e2.printStackTrace();
                return;
            }
        }
        sw4 sw4Var = this.mProgressApplication;
        if (sw4Var != null) {
            if (visible) {
                sw4Var.b();
            } else {
                sw4Var.a();
            }
        }
    }

    public final void A2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void B2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final GetApplStatusService T1() {
        GetApplStatusService getApplStatusService = this.appInfoService;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appInfoService");
        return null;
    }

    public final void U1() {
        cx cxVar = this.appStatusVM;
        if (cxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
            cxVar = null;
        }
        cxVar.j().g(this, new f(new a()));
    }

    public final wa3 V1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final p6 W1() {
        p6 p6Var = this.mBinding;
        if (p6Var != null) {
            return p6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context X1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final FormsInterface Y1() {
        FormsInterface formsInterface = this.mFormsInterface;
        if (formsInterface != null) {
            return formsInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final mf2 Z1() {
        mf2 mf2Var = this.mFormsVM;
        if (mf2Var != null) {
            return mf2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsVM");
        return null;
    }

    public final ResponseBody a2() {
        ResponseBody responseBody = this.respBody;
        if (responseBody != null) {
            return responseBody;
        }
        Intrinsics.throwUninitializedPropertyAccessException("respBody");
        return null;
    }

    public final wl5 b2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void i2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(V1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(V1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.j2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void m2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(V1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(V1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.n2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public final void o2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(V1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(V1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.p2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        p6 p6VarC = p6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(p6VarC, "inflate(...)");
        u2(p6VarC);
        setContentView(W1().b());
        ta3.a.I(this, W1());
        v2(this);
        A2(new wl5(X1()));
        t2(new wa3(this));
        s2(GetApplStatusService.INSTANCE.a(X1()));
        w2(FormsInterface.INSTANCE.a(X1()));
        x2((mf2) new z(this, new lf2(new gf2(Y1()))).a(mf2.class));
        this.viewModel = (yk1) new z(this).a(yk1.class);
        c2();
        e2();
    }

    public final void q2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(V1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(V1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationStatusActivity.r2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public final void s2(GetApplStatusService getApplStatusService) {
        Intrinsics.checkNotNullParameter(getApplStatusService, "<set-?>");
        this.appInfoService = getApplStatusService;
    }

    public final void t2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void u2(p6 p6Var) {
        Intrinsics.checkNotNullParameter(p6Var, "<set-?>");
        this.mBinding = p6Var;
    }

    public final void v2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void w2(FormsInterface formsInterface) {
        Intrinsics.checkNotNullParameter(formsInterface, "<set-?>");
        this.mFormsInterface = formsInterface;
    }

    public final void x2(mf2 mf2Var) {
        Intrinsics.checkNotNullParameter(mf2Var, "<set-?>");
        this.mFormsVM = mf2Var;
    }

    public final void z2(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "<set-?>");
        this.respBody = responseBody;
    }
}
