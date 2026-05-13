package com.nic.mparivahan.DLServicesAuth.View;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DLServicesAuth.Model.DLResWithODob;
import com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;
import com.zepto.ja;
import com.zepto.k18;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yy0;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J.\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\tJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tJ\u0010\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0007R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010?\u001a\n 8*\u0004\u0018\u000107078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010r\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010x\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010q\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010q\u001a\u0004\bz\u0010u\"\u0004\b{\u0010wR%\u0010\u0082\u0001\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b}\u0010%\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010q\u001a\u0005\b\u0084\u0001\u0010u\"\u0005\b\u0085\u0001\u0010wR*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u0092\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010q\u001a\u0005\b\u0090\u0001\u0010u\"\u0005\b\u0091\u0001\u0010w¨\u0006\u0095\u0001"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/View/DlServicesMainScreen;", "Lcom/zepto/o40;", "", "n2", "o2", "s2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "F2", "J2", "fdate", "X1", "Y1", "Ljava/util/ArrayList;", "multiList", "T1", "Landroid/content/Context;", "context", "", "checkedValue", "P1", "inputDate", "W1", "nt_valitade", "tr_valitade", "", "V2", "W2", "h2", "date", "U1", "V1", "Lcom/zepto/wl5;", "F", "Lcom/zepto/wl5;", "sarthiSession", "Lcom/zepto/ja;", "G", "Lcom/zepto/ja;", "Z1", "()Lcom/zepto/ja;", "G2", "(Lcom/zepto/ja;)V", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "H", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "b2", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "I2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "I", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "i2", "()Landroid/app/ProgressDialog;", "Q2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/nr1;", "K", "Lcom/zepto/nr1;", "d2", "()Lcom/zepto/nr1;", "L2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "L", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "j2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "R2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "M", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "c2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "K2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Landroid/widget/EditText;", "N", "Landroid/widget/EditText;", "f2", "()Landroid/widget/EditText;", "N2", "(Landroid/widget/EditText;)V", "dl_number", "Landroid/widget/TextView;", "O", "Landroid/widget/TextView;", "e2", "()Landroid/widget/TextView;", "M2", "(Landroid/widget/TextView;)V", "dl_dob", "P", "Ljava/lang/String;", "formated_date", "Q", "k2", "()Ljava/lang/String;", "S2", "(Ljava/lang/String;)V", "rto_code", "R", "m2", "U2", "select_Value", "S", "l2", "()Lcom/zepto/wl5;", "T2", "(Lcom/zepto/wl5;)V", "sahi_session", "T", "a2", "H2", "bioRecGenesis", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "g2", "()Lcom/zepto/wa3;", "O2", "(Lcom/zepto/wa3;)V", "langSession", "V", "getMultiCheck", "P2", "multiCheck", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlServicesMainScreen extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ja binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public EditText dl_number;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView dl_dob;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String rto_code;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String select_Value;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String multiCheck = "valid";

    public static final class a extends SimpleDateFormat {
        public a(Locale locale) {
            super("dd-MMM-yyyy", locale);
        }

        @Override // java.text.SimpleDateFormat, java.text.DateFormat
        public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(toAppendTo, "toAppendTo");
            Intrinsics.checkNotNullParameter(pos, "pos");
            StringBuffer stringBuffer = super.format(date, toAppendTo, pos);
            int iIndexOf = stringBuffer.indexOf("Sep");
            if (iIndexOf != -1) {
                stringBuffer.replace(iIndexOf, iIndexOf + 3, "Sept");
            }
            Intrinsics.checkNotNull(stringBuffer);
            return stringBuffer;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                DlServicesMainScreen.this.H2(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioRecGenesis());
                String bioApplicantCatg = dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioApplicantCatg();
                if (bioApplicantCatg == null || bioApplicantCatg.length() == 0) {
                    DlServicesMainScreen.this.l2().o("0");
                } else {
                    wl5 wl5VarL2 = DlServicesMainScreen.this.l2();
                    String bioApplicantCatg2 = dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioApplicantCatg();
                    Intrinsics.checkNotNull(bioApplicantCatg2);
                    wl5VarL2.o(StringsKt__StringsKt.trim((CharSequence) bioApplicantCatg2).toString());
                }
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 0 && dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 1) {
                    DlServicesMainScreen.this.i2().dismiss();
                    DlServicesMainScreen dlServicesMainScreen = DlServicesMainScreen.this;
                    String strB = dlServicesMainScreen.g2().b("no_details", DlServicesMainScreen.this.getString(R.string.no_Details_are_avail));
                    Intrinsics.checkNotNull(strB);
                    dlServicesMainScreen.F2(strB);
                    return;
                }
                wl5 wl5Var = DlServicesMainScreen.this.sarthiSession;
                if (wl5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
                    wl5Var = null;
                }
                if (Intrinsics.areEqual(wl5Var.b(), "204")) {
                    DlServicesMainScreen.this.i2().dismiss();
                    DlServicesMainScreen.this.K2(dLServiceResponseModleV1.getDldetobj().get(0));
                    try {
                        Intent intent = new Intent(DlServicesMainScreen.this, (Class<?>) MobUpdateAdhar.class);
                        intent.putExtra("DLDetails", DlServicesMainScreen.this.c2());
                        intent.putExtra("DL", DlServicesMainScreen.this.c2().getBioObj().getBioDlno());
                        DlServicesMainScreen dlServicesMainScreen2 = DlServicesMainScreen.this;
                        intent.putExtra("dob", dlServicesMainScreen2.X1(dlServicesMainScreen2.c2().getBioObj().getBioDob()));
                        DlServicesMainScreen.this.startActivity(intent);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (!Intrinsics.areEqual(DlServicesMainScreen.this.m2(), "0")) {
                    DlServicesMainScreen.this.K2(dLServiceResponseModleV1.getDldetobj().get(0));
                    nr1 nr1VarD2 = DlServicesMainScreen.this.d2();
                    DlServicesMainScreen dlServicesMainScreen3 = DlServicesMainScreen.this;
                    nr1VarD2.x(dlServicesMainScreen3, dlServicesMainScreen3.f2().getText().toString(), DlServicesMainScreen.this.e2().getText().toString());
                    return;
                }
                if (DlServicesMainScreen.this.b2().z0() != null) {
                    DlServicesMainScreen.this.Z1().I.setVisibility(0);
                    ArrayList arrayListZ0 = DlServicesMainScreen.this.b2().z0();
                    DlServicesMainScreen.this.K2(dLServiceResponseModleV1.getDldetobj().get(0));
                    String docnumber = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
                    Intrinsics.checkNotNull(docnumber);
                    String string = StringsKt__StringsKt.trim((CharSequence) docnumber).toString();
                    String dob = ((DLDocument) arrayListZ0.get(0)).getDob();
                    Intrinsics.checkNotNull(dob);
                    if (Intrinsics.areEqual(string, StringsKt__StringsKt.trim((CharSequence) dob).toString())) {
                        nr1 nr1VarD22 = DlServicesMainScreen.this.d2();
                        DlServicesMainScreen dlServicesMainScreen4 = DlServicesMainScreen.this;
                        String docnumber2 = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
                        Intrinsics.checkNotNull(docnumber2);
                        String string2 = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.trim((CharSequence) docnumber2).toString()).toString();
                        DlServicesMainScreen dlServicesMainScreen5 = DlServicesMainScreen.this;
                        DldetobjX dldetails = ((DLDocument) dlServicesMainScreen5.b2().z0().get(0)).getDldetails();
                        Intrinsics.checkNotNull(dldetails);
                        nr1VarD22.x(dlServicesMainScreen4, string2, dlServicesMainScreen5.V1(StringsKt__StringsKt.trim((CharSequence) dldetails.getBioObj().getBioDob()).toString()));
                        return;
                    }
                    nr1 nr1VarD23 = DlServicesMainScreen.this.d2();
                    DlServicesMainScreen dlServicesMainScreen6 = DlServicesMainScreen.this;
                    String docnumber3 = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
                    Intrinsics.checkNotNull(docnumber3);
                    String string3 = StringsKt__StringsKt.trim((CharSequence) docnumber3).toString();
                    DlServicesMainScreen dlServicesMainScreen7 = DlServicesMainScreen.this;
                    String dob2 = ((DLDocument) arrayListZ0.get(0)).getDob();
                    Intrinsics.checkNotNull(dob2);
                    nr1VarD23.x(dlServicesMainScreen6, string3, dlServicesMainScreen7.V1(dob2));
                }
            } catch (Exception unused2) {
                DlServicesMainScreen.this.i2().dismiss();
                DlServicesMainScreen dlServicesMainScreen8 = DlServicesMainScreen.this;
                String strB2 = dlServicesMainScreen8.g2().b("kindly_etner_correct_details", DlServicesMainScreen.this.getString(R.string.kindly_enter_correct_Details));
                Intrinsics.checkNotNull(strB2);
                dlServicesMainScreen8.F2(strB2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            DlServicesMainScreen.this.i2().dismiss();
            DlServicesMainScreen dlServicesMainScreen = DlServicesMainScreen.this;
            String strB = dlServicesMainScreen.g2().b("label_went_wrong", DlServicesMainScreen.this.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            dlServicesMainScreen.F2(strB);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:316:0x067d A[Catch: Exception -> 0x09b9, TryCatch #0 {Exception -> 0x09b9, blocks: (B:3:0x0004, B:5:0x001a, B:7:0x0022, B:9:0x0028, B:12:0x0030, B:15:0x0037, B:16:0x004b, B:18:0x0051, B:20:0x0059, B:22:0x005f, B:27:0x006b, B:30:0x0072, B:31:0x0082, B:33:0x0088, B:35:0x0090, B:37:0x0096, B:40:0x009e, B:43:0x00a5, B:44:0x00b9, B:46:0x00bf, B:48:0x00c7, B:50:0x00cd, B:53:0x00d5, B:56:0x00dc, B:57:0x00f0, B:59:0x00f6, B:61:0x00fe, B:63:0x0104, B:66:0x010c, B:69:0x0113, B:70:0x0127, B:72:0x012d, B:74:0x0135, B:76:0x013b, B:79:0x0143, B:82:0x014a, B:83:0x015e, B:85:0x0164, B:87:0x016c, B:89:0x0172, B:94:0x017e, B:97:0x0185, B:98:0x0195, B:100:0x019b, B:102:0x01a3, B:104:0x01a9, B:107:0x01b1, B:110:0x01b8, B:111:0x01cc, B:113:0x01d2, B:115:0x01da, B:117:0x01e0, B:120:0x01e8, B:123:0x01ef, B:124:0x0203, B:127:0x020b, B:130:0x0213, B:132:0x0219, B:134:0x0226, B:136:0x0232, B:138:0x0238, B:140:0x0240, B:145:0x024b, B:148:0x0252, B:150:0x0258, B:152:0x0260, B:154:0x0266, B:156:0x026e, B:159:0x028d, B:161:0x0293, B:164:0x029a, B:166:0x02a6, B:169:0x02b3, B:171:0x02b9, B:172:0x02c2, B:175:0x02cc, B:176:0x02d0, B:178:0x02dc, B:179:0x02e8, B:181:0x02f0, B:182:0x02f4, B:185:0x0304, B:188:0x0328, B:190:0x032e, B:192:0x0336, B:194:0x033c, B:197:0x0344, B:200:0x034b, B:201:0x0354, B:202:0x0364, B:203:0x0382, B:205:0x038a, B:206:0x038e, B:208:0x039a, B:211:0x03be, B:213:0x03c4, B:215:0x03cc, B:217:0x03d2, B:220:0x03da, B:223:0x03e1, B:224:0x03ea, B:225:0x0406, B:226:0x0424, B:228:0x042c, B:229:0x0430, B:231:0x043c, B:234:0x0460, B:236:0x0466, B:238:0x046e, B:240:0x0474, B:243:0x047c, B:246:0x0483, B:247:0x048c, B:248:0x04a8, B:249:0x04c8, B:251:0x04d0, B:252:0x04d4, B:254:0x04e0, B:257:0x0504, B:259:0x050a, B:261:0x0512, B:263:0x0518, B:266:0x0520, B:269:0x0527, B:270:0x0530, B:271:0x054c, B:272:0x056c, B:274:0x0574, B:275:0x0578, B:277:0x0584, B:280:0x05a8, B:282:0x05ae, B:284:0x05b6, B:286:0x05bc, B:289:0x05c4, B:292:0x05cb, B:293:0x05d6, B:294:0x05f2, B:295:0x0612, B:297:0x061a, B:298:0x061e, B:300:0x062a, B:303:0x064e, B:305:0x0654, B:307:0x065c, B:309:0x0662, B:312:0x066a, B:315:0x0671, B:316:0x067d, B:318:0x069f, B:320:0x06a5, B:322:0x06ad, B:324:0x06b3, B:327:0x06bb, B:330:0x06c2, B:331:0x06e0, B:332:0x071f, B:334:0x0727, B:335:0x072b, B:337:0x0737, B:340:0x075b, B:342:0x0761, B:344:0x0769, B:346:0x076f, B:349:0x0777, B:352:0x077e, B:353:0x0787, B:354:0x07a3, B:355:0x07c3, B:357:0x07cb, B:358:0x07cf, B:360:0x07db, B:363:0x07ff, B:365:0x0805, B:367:0x080d, B:369:0x0813, B:372:0x081b, B:375:0x0822, B:376:0x082b, B:377:0x0847, B:378:0x0867, B:380:0x086f, B:381:0x0873, B:383:0x087f, B:385:0x08a1, B:387:0x08a7, B:389:0x08af, B:391:0x08b5, B:394:0x08bd, B:397:0x08c4, B:398:0x08db, B:400:0x08fd, B:402:0x0903, B:404:0x090b, B:406:0x0911, B:409:0x0919, B:412:0x0920, B:413:0x0937, B:157:0x027a, B:158:0x0284, B:414:0x0945, B:416:0x0952, B:418:0x095e, B:419:0x096c, B:420:0x098f, B:422:0x0995, B:425:0x099c, B:426:0x09a9), top: B:430:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:331:0x06e0 A[Catch: Exception -> 0x09b9, TryCatch #0 {Exception -> 0x09b9, blocks: (B:3:0x0004, B:5:0x001a, B:7:0x0022, B:9:0x0028, B:12:0x0030, B:15:0x0037, B:16:0x004b, B:18:0x0051, B:20:0x0059, B:22:0x005f, B:27:0x006b, B:30:0x0072, B:31:0x0082, B:33:0x0088, B:35:0x0090, B:37:0x0096, B:40:0x009e, B:43:0x00a5, B:44:0x00b9, B:46:0x00bf, B:48:0x00c7, B:50:0x00cd, B:53:0x00d5, B:56:0x00dc, B:57:0x00f0, B:59:0x00f6, B:61:0x00fe, B:63:0x0104, B:66:0x010c, B:69:0x0113, B:70:0x0127, B:72:0x012d, B:74:0x0135, B:76:0x013b, B:79:0x0143, B:82:0x014a, B:83:0x015e, B:85:0x0164, B:87:0x016c, B:89:0x0172, B:94:0x017e, B:97:0x0185, B:98:0x0195, B:100:0x019b, B:102:0x01a3, B:104:0x01a9, B:107:0x01b1, B:110:0x01b8, B:111:0x01cc, B:113:0x01d2, B:115:0x01da, B:117:0x01e0, B:120:0x01e8, B:123:0x01ef, B:124:0x0203, B:127:0x020b, B:130:0x0213, B:132:0x0219, B:134:0x0226, B:136:0x0232, B:138:0x0238, B:140:0x0240, B:145:0x024b, B:148:0x0252, B:150:0x0258, B:152:0x0260, B:154:0x0266, B:156:0x026e, B:159:0x028d, B:161:0x0293, B:164:0x029a, B:166:0x02a6, B:169:0x02b3, B:171:0x02b9, B:172:0x02c2, B:175:0x02cc, B:176:0x02d0, B:178:0x02dc, B:179:0x02e8, B:181:0x02f0, B:182:0x02f4, B:185:0x0304, B:188:0x0328, B:190:0x032e, B:192:0x0336, B:194:0x033c, B:197:0x0344, B:200:0x034b, B:201:0x0354, B:202:0x0364, B:203:0x0382, B:205:0x038a, B:206:0x038e, B:208:0x039a, B:211:0x03be, B:213:0x03c4, B:215:0x03cc, B:217:0x03d2, B:220:0x03da, B:223:0x03e1, B:224:0x03ea, B:225:0x0406, B:226:0x0424, B:228:0x042c, B:229:0x0430, B:231:0x043c, B:234:0x0460, B:236:0x0466, B:238:0x046e, B:240:0x0474, B:243:0x047c, B:246:0x0483, B:247:0x048c, B:248:0x04a8, B:249:0x04c8, B:251:0x04d0, B:252:0x04d4, B:254:0x04e0, B:257:0x0504, B:259:0x050a, B:261:0x0512, B:263:0x0518, B:266:0x0520, B:269:0x0527, B:270:0x0530, B:271:0x054c, B:272:0x056c, B:274:0x0574, B:275:0x0578, B:277:0x0584, B:280:0x05a8, B:282:0x05ae, B:284:0x05b6, B:286:0x05bc, B:289:0x05c4, B:292:0x05cb, B:293:0x05d6, B:294:0x05f2, B:295:0x0612, B:297:0x061a, B:298:0x061e, B:300:0x062a, B:303:0x064e, B:305:0x0654, B:307:0x065c, B:309:0x0662, B:312:0x066a, B:315:0x0671, B:316:0x067d, B:318:0x069f, B:320:0x06a5, B:322:0x06ad, B:324:0x06b3, B:327:0x06bb, B:330:0x06c2, B:331:0x06e0, B:332:0x071f, B:334:0x0727, B:335:0x072b, B:337:0x0737, B:340:0x075b, B:342:0x0761, B:344:0x0769, B:346:0x076f, B:349:0x0777, B:352:0x077e, B:353:0x0787, B:354:0x07a3, B:355:0x07c3, B:357:0x07cb, B:358:0x07cf, B:360:0x07db, B:363:0x07ff, B:365:0x0805, B:367:0x080d, B:369:0x0813, B:372:0x081b, B:375:0x0822, B:376:0x082b, B:377:0x0847, B:378:0x0867, B:380:0x086f, B:381:0x0873, B:383:0x087f, B:385:0x08a1, B:387:0x08a7, B:389:0x08af, B:391:0x08b5, B:394:0x08bd, B:397:0x08c4, B:398:0x08db, B:400:0x08fd, B:402:0x0903, B:404:0x090b, B:406:0x0911, B:409:0x0919, B:412:0x0920, B:413:0x0937, B:157:0x027a, B:158:0x0284, B:414:0x0945, B:416:0x0952, B:418:0x095e, B:419:0x096c, B:420:0x098f, B:422:0x0995, B:425:0x099c, B:426:0x09a9), top: B:430:0x0004 }] */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.DlservicesValidationdto r17) {
            /*
                Method dump skipped, instruction units count: 2524
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen.d.a(com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$DlservicesValidationdto):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DLEligibleMasterData.DlservicesValidationdto) obj);
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
            DlServicesMainScreen dlServicesMainScreen = DlServicesMainScreen.this;
            String strB = dlServicesMainScreen.g2().b("label_went_wrong", DlServicesMainScreen.this.getString(R.string.unable_to_get_details));
            Intrinsics.checkNotNull(strB);
            dlServicesMainScreen.F2(strB);
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(DLResWithODob dLResWithODob) {
            try {
                if (dLResWithODob.getErrorcd() == 1) {
                    DlServicesMainScreen.this.d2().k(DlServicesMainScreen.this, StringsKt__StringsKt.trim((CharSequence) dLResWithODob.getDlobj().getDlLicno().toString()).toString(), dLResWithODob.getBioObj().getBioDob().toString());
                } else {
                    DlServicesMainScreen.this.i2().dismiss();
                    DlServicesMainScreen dlServicesMainScreen = DlServicesMainScreen.this;
                    String strB = dlServicesMainScreen.g2().b("no_details", DlServicesMainScreen.this.getString(R.string.no_Details_are_avail));
                    Intrinsics.checkNotNull(strB);
                    dlServicesMainScreen.F2(strB);
                }
            } catch (Exception unused) {
                DlServicesMainScreen.this.i2().dismiss();
                DlServicesMainScreen dlServicesMainScreen2 = DlServicesMainScreen.this;
                String strB2 = dlServicesMainScreen2.g2().b("label_went_wrong", DlServicesMainScreen.this.getString(R.string.unable_to_get_details));
                Intrinsics.checkNotNull(strB2);
                dlServicesMainScreen2.F2(strB2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DLResWithODob) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            DlServicesMainScreen dlServicesMainScreen = DlServicesMainScreen.this;
            String strB = dlServicesMainScreen.g2().b("label_went_wrong", DlServicesMainScreen.this.getString(R.string.unable_to_get_details));
            Intrinsics.checkNotNull(strB);
            dlServicesMainScreen.F2(strB);
        }
    }

    public static final class h extends Lambda implements Function1 {
        public static final h c = new h();

        public h() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
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

    public static final void A2(DlServicesMainScreen this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.o1();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void B2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void C2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wl5 wl5Var = this$0.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        if (Intrinsics.areEqual(wl5Var.b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            final Dialog dialog = new Dialog(this$0);
            dialog.setContentView(R.layout.layout_multi);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
            Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
            textView.setText(this$0.g2().b("btn_ok", "OK"));
            ((TextView) viewFindViewById5).setText(this$0.g2().b("title_dl_services", "Driving Licence Services"));
            ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dr1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DlServicesMainScreen.D2(dialog, view2);
                }
            });
            ((TextView) viewFindViewById4).setText(R.string.multi_string_serial);
            ((TextView) viewFindViewById3).setText(this$0.g2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + '\n' + this$0.g2().b("check_dl_serv_renewal_dl", "Renewal of DL") + '\n' + this$0.g2().b("check_dl_serv_change_addr", "Change of Address in DL") + '\n' + this$0.g2().b("check_dl_serv_replacement_dl", "Replacement of DL") + '\n' + this$0.g2().b("hill_region_title", "Endorsement to Drive in Hill Region") + '\n' + this$0.g2().b("change_name_dl", "Change of Name in DL") + '\n' + this$0.g2().b("change_birth_dl", "Change of Date of Birth in DL") + '\n' + this$0.g2().b("label_international_driv_permit", "International Driving Permit"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.er1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DlServicesMainScreen.E2(dialog, view2);
                }
            });
            Window window2 = dialog.getWindow();
            Intrinsics.checkNotNull(window2);
            window2.setGravity(48);
            window2.setLayout(-2, -2);
            dialog.show();
        }
    }

    public static final void D2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Q1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void R1(Dialog d2, DlServicesMainScreen this$0, ArrayList multiList, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(multiList, "$multiList");
        d2.dismiss();
        wl5 wl5VarL2 = this$0.l2();
        String strB = this$0.g2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
        Intrinsics.checkNotNull(strB);
        wl5VarL2.t(strB, "537");
        this$0.T1(multiList);
    }

    private final void n2() throws Throwable {
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        I2(databaseHelperD0);
        this.sarthiSession = new wl5(this);
        ta3.a.x0(this, Z1());
        R2(DlServiceInt.INSTANCE.a(this));
        MyTextView myTextView = Z1().Q;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        myTextView.setText(wl5Var.k());
        J2();
        Q2(new ProgressDialog(this));
        i2().setMessage(g2().b("label_challan_please_wait", getString(R.string.please_wait)));
        i2().setCancelable(false);
        i2().setCanceledOnTouchOutside(false);
    }

    private final void o2() {
        d2().o().g(this, new i(new b()));
        d2().p().g(this, new i(new c()));
        d2().l().g(this, new mf4() { // from class: com.zepto.fr1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServicesMainScreen.p2(this.a, (DlLastRtoDetailsDto) obj);
            }
        });
        d2().m().g(this, new mf4() { // from class: com.zepto.gr1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServicesMainScreen.q2(this.a, (String) obj);
            }
        });
        d2().t().g(this, new mf4() { // from class: com.zepto.hr1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServicesMainScreen.r2(this.a, (String) obj);
            }
        });
        d2().r().g(this, new i(new d()));
        d2().s().g(this, new i(new e()));
        d2().n().g(this, new i(new f()));
        d2().q().g(this, new i(new g()));
    }

    public static final void p2(DlServicesMainScreen this$0, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i2().dismiss();
        try {
            if (Intrinsics.areEqual(dlLastRtoDetailsDto.getStatus_code(), "00") && Intrinsics.areEqual(dlLastRtoDetailsDto.getStatus_desc(), "success")) {
                List<Result> result = dlLastRtoDetailsDto.getResult();
                if (result != null) {
                    String rtoCode = result.get(0).getRtoCode();
                    Intrinsics.checkNotNull(rtoCode);
                    this$0.S2(rtoCode);
                    if (Intrinsics.areEqual(this$0.l2().n(), "DL")) {
                        this$0.d2().g(this$0, String.valueOf(result.get(0).getDlno()), String.valueOf(result.get(0).getApplDateOfBirth()), "DL3", "G");
                    } else {
                        this$0.d2().g(this$0, String.valueOf(result.get(0).getDlno()), String.valueOf(result.get(0).getApplDateOfBirth()), this$0.k2(), "G");
                    }
                }
            } else {
                this$0.i2().dismiss();
                this$0.F2(dlLastRtoDetailsDto.getReqStatus().toString());
            }
        } catch (Exception unused) {
            this$0.i2().dismiss();
            String strB = this$0.g2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            this$0.F2(strB);
        }
    }

    public static final void q2(DlServicesMainScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.i2().dismiss();
            String string = new JSONObject(str.toString()).getString("Result");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this$0.F2(string);
        } catch (Exception unused) {
            String strB = this$0.g2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            this$0.F2(strB);
        }
    }

    public static final void r2(DlServicesMainScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strB = this$0.g2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
        Intrinsics.checkNotNull(strB);
        this$0.F2(strB);
    }

    private final void s2() {
        Z1().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ir1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                DlServicesMainScreen.y2(this.a, view);
            }
        });
        Z1().R.setLayoutManager(new LinearLayoutManager(this, 1, false));
        View viewFindViewById = findViewById(R.id.dl_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        N2((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.dl_dob);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        M2((TextView) viewFindViewById2);
        L2((nr1) new z(this, new rq1(new lr1(j2(), this))).a(nr1.class));
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.jr1
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                DlServicesMainScreen.z2(this.a, datePicker, i2, i3, i4);
            }
        };
        Z1().F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.A2(this.a, onDateSetListener, view);
            }
        });
        Z1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.t2(this.a, view);
            }
        });
        if (b2().z0() != null) {
            Z1().J.setVisibility(0);
            Z1().K.setVisibility(0);
            Z1().N.setVisibility(8);
            Z1().C.setVisibility(8);
            Z1().B.setVisibility(8);
            Z1().z.setVisibility(8);
            Z1().x.setVisibility(0);
        } else {
            Z1().J.setVisibility(8);
            Z1().K.setVisibility(0);
            Z1().N.setVisibility(0);
            Z1().C.setVisibility(0);
            Z1().B.setVisibility(0);
            Z1().z.setVisibility(0);
            Z1().x.setVisibility(8);
        }
        Z1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.u2(this.a, view);
            }
        });
        Z1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.v2(this.a, view);
            }
        });
        Z1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.w2(this.a, view);
            }
        });
        Z1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.x2(this.a, view);
            }
        });
    }

    public static final void t2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Z1().C.setVisibility(0);
        this$0.Z1().B.setVisibility(0);
        this$0.Z1().x.setVisibility(8);
        this$0.Z1().I.setVisibility(8);
        this$0.Z1().y.setBackgroundResource(R.drawable.other_new_shape_grey);
        this$0.Z1().A.setBackgroundResource(R.drawable.button_style);
        this$0.Z1().A.setTextColor(yy0.c(this$0, R.color.white));
        this$0.Z1().y.setTextColor(yy0.c(this$0, R.color.black));
        this$0.Z1().N.setVisibility(0);
    }

    public static final void u2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Z1().C.setVisibility(8);
        this$0.Z1().B.setVisibility(8);
        this$0.Z1().x.setVisibility(0);
        if (this$0.b2().z0() != null) {
            this$0.Z1().z.setVisibility(8);
            this$0.Z1().I.setVisibility(0);
            this$0.Z1().y.setBackgroundResource(R.drawable.button_style);
            this$0.Z1().A.setBackgroundResource(R.drawable.other_new_shape_grey);
            this$0.Z1().y.setTextColor(yy0.c(this$0, R.color.white));
            this$0.Z1().A.setTextColor(yy0.c(this$0, R.color.black));
            this$0.Z1().N.setVisibility(8);
            this$0.Z1().x.setVisibility(0);
            return;
        }
        this$0.Z1().z.setVisibility(8);
        this$0.Z1().x.setVisibility(8);
        this$0.Z1().I.setVisibility(8);
        this$0.Z1().y.setBackgroundResource(R.drawable.button_style);
        this$0.Z1().A.setBackgroundResource(R.drawable.other_new_shape_grey);
        this$0.Z1().y.setTextColor(yy0.c(this$0, R.color.white));
        this$0.Z1().A.setTextColor(yy0.c(this$0, R.color.black));
        this$0.Z1().N.setVisibility(8);
    }

    public static final void v2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Z1().H.setText("");
        this$0.Z1().F.setText("");
    }

    public static final void w2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void x2(DlServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.g2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        this$0.U2(VContant.MAINSCREEN);
        Editable text = this$0.f2().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.g2().b("please_enter_dl_details", this$0.getString(R.string.please_enter_dl_details)), 1).show();
            return;
        }
        if (this$0.f2().getText().length() < 10) {
            Toast.makeText(this$0, this$0.g2().b("dl_validation_msg", this$0.getString(R.string.validate_message_dl)), 1).show();
            return;
        }
        CharSequence text2 = this$0.e2().getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this$0, this$0.g2().b("please_enter_bd", this$0.getString(R.string.please_enter_bd)), 1).show();
            return;
        }
        try {
            this$0.i2().show();
        } catch (Exception unused) {
        }
        nr1 nr1VarD2 = this$0.d2();
        String string = this$0.f2().getText().toString();
        String strX1 = this$0.X1(this$0.e2().getText().toString());
        Intrinsics.checkNotNull(strX1);
        nr1VarD2.k(this$0, string, strX1);
    }

    public static final void y2(DlServicesMainScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.U2("0");
            try {
                ArrayList arrayListZ0 = this$0.b2().z0();
                if (arrayListZ0 != null) {
                    this$0.i2().show();
                    String dob = ((DLDocument) arrayListZ0.get(0)).getDob();
                    if (dob == null || dob.length() == 0) {
                        this$0.i2().dismiss();
                        String strB = this$0.g2().b("label_went_wrong", this$0.getString(R.string.unable_to_get_details));
                        Intrinsics.checkNotNull(strB);
                        this$0.F2(strB);
                    } else {
                        String docnumber = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
                        Intrinsics.checkNotNull(docnumber);
                        String string = StringsKt__StringsKt.trim((CharSequence) docnumber).toString();
                        String dob2 = ((DLDocument) arrayListZ0.get(0)).getDob();
                        Intrinsics.checkNotNull(dob2);
                        if (Intrinsics.areEqual(string, StringsKt__StringsKt.trim((CharSequence) dob2).toString())) {
                            nr1 nr1VarD2 = this$0.d2();
                            String docnumber2 = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
                            Intrinsics.checkNotNull(docnumber2);
                            String string2 = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.trim((CharSequence) docnumber2).toString()).toString();
                            DldetobjX dldetails = ((DLDocument) this$0.b2().z0().get(0)).getDldetails();
                            Intrinsics.checkNotNull(dldetails);
                            nr1VarD2.k(this$0, string2, this$0.V1(StringsKt__StringsKt.trim((CharSequence) dldetails.getBioObj().getBioDob()).toString()));
                        } else {
                            nr1 nr1VarD22 = this$0.d2();
                            String docnumber3 = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
                            Intrinsics.checkNotNull(docnumber3);
                            String string3 = StringsKt__StringsKt.trim((CharSequence) docnumber3).toString();
                            String dob3 = ((DLDocument) arrayListZ0.get(0)).getDob();
                            Intrinsics.checkNotNull(dob3);
                            nr1VarD22.k(this$0, string3, this$0.V1(dob3));
                        }
                    }
                }
            } catch (Exception unused) {
                Toast.makeText(this$0, "Service temporarily unavailable, Please try again later.", 0).show();
            }
        }
    }

    public static final void z2(DlServicesMainScreen this$0, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i2);
        this$0.cal.set(2, i3);
        this$0.cal.set(5, i4);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        this$0.formated_date = str3 + '-' + str2 + '-' + str;
        this$0.Z1().F.setText(str + '-' + str2 + '-' + str3);
    }

    public final void F2(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = g2().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = g2().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, h.c, 16, null);
    }

    public final void G2(ja jaVar) {
        Intrinsics.checkNotNullParameter(jaVar, "<set-?>");
        this.binding = jaVar;
    }

    public final void H2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bioRecGenesis = str;
    }

    public final void I2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void J2() throws Throwable {
        if (b2().z0() == null) {
            Z1().I.setVisibility(8);
            return;
        }
        Z1().I.setVisibility(0);
        ArrayList arrayListZ0 = b2().z0();
        if (arrayListZ0 == null || arrayListZ0.size() <= 0) {
            return;
        }
        Z1().E.setText(((DLDocument) arrayListZ0.get(0)).getDocnumber());
    }

    public final void K2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void L2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void M2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dl_dob = textView;
    }

    public final void N2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dl_number = editText;
    }

    public final void O2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void P1(Context context, String message, int checkedValue, final ArrayList multiList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiList, "multiList");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_pop1);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.process);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.sarathi_popup_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(g2().b("nex_parivahan", "NextGen mParivahan"));
        textView2.setText(g2().b("button_proceed", context.getString(R.string.Proceed)));
        textView.setText(g2().b("button_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById3).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ar1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.Q1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.br1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.R1(dialog, this, multiList, view);
            }
        });
        dialog.show();
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.multiCheck = str;
    }

    public final void Q2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_code = str;
    }

    public final void T1(ArrayList multiList) {
        Intrinsics.checkNotNullParameter(multiList, "multiList");
        try {
            Intent intent = new Intent(this, (Class<?>) DlServiceListActivity.class);
            intent.putExtra("DL", c2().getDlobj().getDlLicno());
            c2().getBioObj().setBioDob(String.valueOf(Y1(c2().getBioObj().getBioDob())));
            intent.putExtra("dob", c2().getBioObj().getBioDob());
            intent.putExtra("DLDetails", c2());
            intent.putExtra("bioRecGenesis", a2());
            intent.putExtra("multiList", multiList);
            intent.putExtra("multiCheck", this.multiCheck);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void T2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final String U1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("MMM dd, yyyy").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public final void U2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.select_Value = str;
    }

    public final String V1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MMM-yyyy").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return U1(date);
        }
    }

    public final boolean V2(String nt_valitade, String tr_valitade) {
        if (nt_valitade == null || nt_valitade.length() == 0 || (tr_valitade != null && !StringsKt__StringsJVMKt.isBlank(tr_valitade))) {
            nt_valitade = ((nt_valitade != null && nt_valitade.length() != 0) || tr_valitade == null || tr_valitade.length() == 0) ? (nt_valitade == null || nt_valitade.length() == 0 || tr_valitade == null || tr_valitade.length() == 0) ? null : k18.a.j(nt_valitade, tr_valitade) : tr_valitade;
        }
        Log.e("f_validity-> ", String.valueOf(nt_valitade));
        Intrinsics.checkNotNull(nt_valitade);
        if (StringsKt__StringsKt.contains$default((CharSequence) nt_valitade, (CharSequence) "Sep", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) nt_valitade, (CharSequence) "sep", false, 2, (Object) null)) {
            nt_valitade = W1(nt_valitade);
        }
        try {
            k18.a aVar = k18.a;
            LocalDate localDate = LocalDate.parse(aVar.a(String.valueOf(nt_valitade)));
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            return aVar.d(localDate.minusDays(0L).toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public final String W1(String inputDate) {
        Intrinsics.checkNotNullParameter(inputDate, "inputDate");
        try {
            Locale locale = Locale.ENGLISH;
            return new a(locale).format(new SimpleDateFormat("dd-MMM-yyyy", locale).parse(inputDate));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return inputDate;
        }
    }

    public final boolean W2(String nt_valitade, String tr_valitade) {
        if (nt_valitade == null || nt_valitade.length() == 0 || (tr_valitade != null && !StringsKt__StringsJVMKt.isBlank(tr_valitade))) {
            nt_valitade = ((nt_valitade != null && nt_valitade.length() != 0) || tr_valitade == null || tr_valitade.length() == 0) ? (nt_valitade == null || nt_valitade.length() == 0 || tr_valitade == null || tr_valitade.length() == 0) ? null : k18.a.j(nt_valitade, tr_valitade) : tr_valitade;
        }
        try {
            k18.a aVar = k18.a;
            LocalDate localDate = LocalDate.parse(aVar.a(String.valueOf(nt_valitade)));
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            return aVar.e(localDate.minusMonths(12L).toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public final String X1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final String Y1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final ja Z1() {
        ja jaVar = this.binding;
        if (jaVar != null) {
            return jaVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String a2() {
        String str = this.bioRecGenesis;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bioRecGenesis");
        return null;
    }

    public final DatabaseHelper b2() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final DldetobjX c2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final nr1 d2() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final TextView e2() {
        TextView textView = this.dl_dob;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_dob");
        return null;
    }

    public final EditText f2() {
        EditText editText = this.dl_number;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_number");
        return null;
    }

    public final wa3 g2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final String h2(String nt_valitade, String tr_valitade) {
        return (nt_valitade == null || nt_valitade.length() == 0 || !(tr_valitade == null || StringsKt__StringsJVMKt.isBlank(tr_valitade))) ? ((nt_valitade != null && nt_valitade.length() != 0) || tr_valitade == null || tr_valitade.length() == 0) ? (nt_valitade == null || nt_valitade.length() == 0 || tr_valitade == null || tr_valitade.length() == 0) ? "null" : k18.a.j(nt_valitade, tr_valitade).toString() : tr_valitade.toString() : nt_valitade.toString();
    }

    public final ProgressDialog i2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt j2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String k2() {
        String str = this.rto_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_code");
        return null;
    }

    public final wl5 l2() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final String m2() {
        String str = this.select_Value;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("select_Value");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_servcies_main_view_screen);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        G2((ja) lq7VarF);
        T2(new wl5(this));
        O2(new wa3(this));
        n2();
        s2();
        o2();
        Z1().L.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.B2(this.a, view);
            }
        });
        Z1().L.h.setVisibility(8);
        wl5 wl5Var = this.sarthiSession;
        wl5 wl5Var2 = null;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        if (Intrinsics.areEqual(wl5Var.b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            TextView textView = Z1().L.g;
            String strB = g2().b("dl_services", getString(R.string.dl_services));
            Intrinsics.checkNotNull(strB);
            textView.setText(strB);
            Z1().L.g.setPaintFlags(8 | Z1().L.g.getPaintFlags());
        } else {
            TextView textView2 = Z1().L.g;
            wl5 wl5Var3 = this.sarthiSession;
            if (wl5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            } else {
                wl5Var2 = wl5Var3;
            }
            textView2.setText(wl5Var2.k());
            Z1().L.f.setVisibility(8);
        }
        Z1().L.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServicesMainScreen.C2(this.a, view);
            }
        });
    }
}
