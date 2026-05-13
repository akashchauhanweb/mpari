package com.nic.mparivahan.Citizen.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Citizen.Activities.AccidentReportActivity;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.Name;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.Citizen.Models.VerifyVehicleResponseModel;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.bi2;
import com.zepto.dl4;
import com.zepto.f6;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.ki2;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.of4;
import com.zepto.ok0;
import com.zepto.pq;
import com.zepto.qm3;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.uf4;
import com.zepto.vf4;
import com.zepto.wa3;
import com.zepto.wm3;
import com.zepto.ws6;
import com.zepto.yy0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 µ\u00012\u00020\u0001:\u0002¶\u0001B\t¢\u0006\u0006\b³\u0001\u0010´\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0003J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0003J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0015J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eJ\u0016\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$J/\u0010-\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020/J\u000e\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0011J\u001e\u00108\u001a\u0012\u0012\u0004\u0012\u00020\r06j\b\u0012\u0004\u0012\u00020\r`72\u0006\u0010%\u001a\u00020$R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010C\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010^\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R2\u0010f\u001a\u0012\u0012\u0004\u0012\u00020_06j\b\u0012\u0004\u0012\u00020_`78\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010Y\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010}\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010Y\u001a\u0004\b{\u0010[\"\u0004\b|\u0010]R$\u0010\u0081\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010Y\u001a\u0004\b\u007f\u0010[\"\u0005\b\u0080\u0001\u0010]R&\u0010\u0085\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010Y\u001a\u0005\b\u0083\u0001\u0010[\"\u0005\b\u0084\u0001\u0010]R&\u0010\u0089\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010Y\u001a\u0005\b\u0087\u0001\u0010[\"\u0005\b\u0088\u0001\u0010]R&\u0010\u008d\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010Y\u001a\u0005\b\u008b\u0001\u0010[\"\u0005\b\u008c\u0001\u0010]R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R&\u0010¡\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010Y\u001a\u0005\b\u009f\u0001\u0010[\"\u0005\b \u0001\u0010]R&\u0010¥\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010Y\u001a\u0005\b£\u0001\u0010[\"\u0005\b¤\u0001\u0010]R9\u0010®\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\t0\t0¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R9\u0010²\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\t0\t0¦\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010©\u0001\u001a\u0006\b°\u0001\u0010«\u0001\"\u0006\b±\u0001\u0010\u00ad\u0001¨\u0006·\u0001"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/AccidentReportActivity;", "Lcom/zepto/pq;", "", "F2", "p2", "B2", "H1", "G2", "G1", "Landroid/content/Intent;", "it", "d2", "A2", "", "message", "l2", "n2", "Landroid/net/Uri;", "uri", "O1", "J1", "D1", "s2", "D2", "H2", "I1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "", "lat", "lang", "Q1", "Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "Y1", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Ljava/io/InputStream;", "inputStream", "", "K1", "contentUri", "", "b2", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "L1", "Lcom/zepto/f6;", "C", "Lcom/zepto/f6;", "binding", "D", "Landroid/content/Context;", "R1", "()Landroid/content/Context;", "t2", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/ws6;", "E", "Lcom/zepto/ws6;", "V1", "()Lcom/zepto/ws6;", "x2", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/vf4;", "F", "Lcom/zepto/vf4;", "S1", "()Lcom/zepto/vf4;", "u2", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "G", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "mOffenceInterface", "H", "Ljava/lang/String;", "T1", "()Ljava/lang/String;", "v2", "(Ljava/lang/String;)V", "myLocation", "Lcom/nic/mparivahan/Citizen/Models/Name;", "I", "Ljava/util/ArrayList;", "W1", "()Ljava/util/ArrayList;", "y2", "(Ljava/util/ArrayList;)V", "stateList", "J", "X1", "z2", "stateValue", "Landroid/widget/EditText;", "K", "Landroid/widget/EditText;", "M1", "()Landroid/widget/EditText;", "q2", "(Landroid/widget/EditText;)V", "evLocation", "L", "Landroid/widget/TextView;", "N1", "()Landroid/widget/TextView;", "r2", "(Landroid/widget/TextView;)V", "evTime", "M", "getImgType", "setImgType", "imgType", "N", "getUploadedImgPath", "setUploadedImgPath", "uploadedImgPath", "O", "getImageFileName", "setImageFileName", "imageFileName", "P", "getUploadedVideoPath", "setUploadedVideoPath", "uploadedVideoPath", "Q", "getVideoFileName", "setVideoFileName", "videoFileName", "", "R", "Z", "getRcVerified", "()Z", "w2", "(Z)V", "rcVerified", "Lcom/zepto/wa3;", "S", "Lcom/zepto/wa3;", "U1", "()Lcom/zepto/wa3;", "setSession", "(Lcom/zepto/wa3;)V", "session", "T", "getStat_Name", "setStat_Name", "stat_Name", "U", "getVideoType", "setVideoType", "videoType", "Lcom/zepto/of;", "kotlin.jvm.PlatformType", "V", "Lcom/zepto/of;", "getGetImageLauncher", "()Lcom/zepto/of;", "setGetImageLauncher", "(Lcom/zepto/of;)V", "getImageLauncher", "W", "getGetVideoLauncher", "setGetVideoLauncher", "getVideoLauncher", "<init>", "()V", "X", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAccidentReportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccidentReportActivity.kt\ncom/nic/mparivahan/Citizen/Activities/AccidentReportActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1027:1\n1#2:1028\n*E\n"})
public final class AccidentReportActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public f6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String myLocation;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList stateList;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String stateValue;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public EditText evLocation;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView evTime;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean rcVerified;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public of getImageLauncher;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public of getVideoLauncher;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String imgType = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String uploadedImgPath = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String imageFileName = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String uploadedVideoPath = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String videoFileName = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String stat_Name = "NA";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String videoType = "";

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            AccidentReportActivity accidentReportActivity = AccidentReportActivity.this;
            accidentReportActivity.z2(i == 0 ? "Select State" : ((Name) accidentReportActivity.W1().get(i)).getStateCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(VerifyVehicleResponseModel verifyVehicleResponseModel) {
            f6 f6Var = AccidentReportActivity.this.binding;
            f6 f6Var2 = null;
            if (f6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var = null;
            }
            f6Var.b.setVisibility(8);
            try {
                if (StringsKt__StringsJVMKt.equals(verifyVehicleResponseModel.getStatusCode(), "NP001", true)) {
                    f6 f6Var3 = AccidentReportActivity.this.binding;
                    if (f6Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        f6Var2 = f6Var3;
                    }
                    f6Var2.b.setVisibility(8);
                    AccidentReportActivity.this.w2(true);
                    AccidentReportActivity.this.F2();
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(verifyVehicleResponseModel.getStatusCode(), "NR005", true)) {
                    f6 f6Var4 = AccidentReportActivity.this.binding;
                    if (f6Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        f6Var2 = f6Var4;
                    }
                    f6Var2.b.setVisibility(8);
                    AccidentReportActivity.this.w2(false);
                    AccidentReportActivity.this.l2(verifyVehicleResponseModel.getStatusDesc());
                    return;
                }
                f6 f6Var5 = AccidentReportActivity.this.binding;
                if (f6Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    f6Var2 = f6Var5;
                }
                f6Var2.b.setVisibility(8);
                AccidentReportActivity.this.w2(false);
                AccidentReportActivity.this.l2(verifyVehicleResponseModel.getStatusDesc());
            } catch (Exception unused) {
                AccidentReportActivity accidentReportActivity = AccidentReportActivity.this;
                accidentReportActivity.l2(accidentReportActivity.U1().b("vehicle_not_found", "Vehicle Data Not Found"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VerifyVehicleResponseModel) obj);
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
            f6 f6Var = AccidentReportActivity.this.binding;
            if (f6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var = null;
            }
            f6Var.b.setVisibility(8);
            AccidentReportActivity.this.w2(false);
            AccidentReportActivity accidentReportActivity = AccidentReportActivity.this;
            accidentReportActivity.l2(accidentReportActivity.U1().b("vehicle_not_found", "Vehicle Data Not Found"));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(SubmitOffenceReport submitOffenceReport) {
            try {
                f6 f6Var = AccidentReportActivity.this.binding;
                f6 f6Var2 = null;
                if (f6Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var = null;
                }
                f6Var.b.setVisibility(8);
                if (!Intrinsics.areEqual(submitOffenceReport.getStatusCode(), "ACCD001")) {
                    AccidentReportActivity.this.l2(submitOffenceReport.getStatusDesc());
                    return;
                }
                f6 f6Var3 = AccidentReportActivity.this.binding;
                if (f6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    f6Var2 = f6Var3;
                }
                f6Var2.t.setSelection(0);
                AccidentReportActivity.this.n2("Accident Report has been submitted successfully");
            } catch (Exception unused) {
                AccidentReportActivity.this.l2("Something went wrong, Please try after some time!");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitOffenceReport) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            f6 f6Var = AccidentReportActivity.this.binding;
            if (f6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var = null;
            }
            f6Var.b.setVisibility(8);
            AccidentReportActivity.this.l2("Something went wrong, Please try after some time!");
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(GetStated getStated) {
            f6 f6Var = null;
            try {
                if (!StringsKt__StringsJVMKt.equals(getStated.getStatusCode(), "MSTR001", true)) {
                    f6 f6Var2 = AccidentReportActivity.this.binding;
                    if (f6Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        f6Var2 = null;
                    }
                    f6Var2.b.setVisibility(8);
                    return;
                }
                f6 f6Var3 = AccidentReportActivity.this.binding;
                if (f6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var3 = null;
                }
                f6Var3.b.setVisibility(8);
                AccidentReportActivity.this.y2(getStated.getStates());
                ArrayList arrayListW1 = AccidentReportActivity.this.W1();
                String string = AccidentReportActivity.this.getResources().getString(R.string.select_state);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayListW1.add(0, new Name(string, "0", false));
                AccidentReportActivity accidentReportActivity = AccidentReportActivity.this;
                ok0 ok0Var = new ok0(accidentReportActivity, accidentReportActivity.W1());
                f6 f6Var4 = AccidentReportActivity.this.binding;
                if (f6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var4 = null;
                }
                f6Var4.t.setAdapter((SpinnerAdapter) ok0Var);
            } catch (Exception e) {
                f6 f6Var5 = AccidentReportActivity.this.binding;
                if (f6Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    f6Var = f6Var5;
                }
                f6Var.b.setVisibility(8);
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetStated) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            f6 f6Var = AccidentReportActivity.this.binding;
            if (f6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var = null;
            }
            f6Var.b.setVisibility(8);
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

    public static final class j extends qm3 {
        public j() {
        }

        @Override // com.zepto.qm3
        public void b(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            super.b(locationResult);
            for (Location location : locationResult.c()) {
                AccidentReportActivity.this.Q1(location.getLatitude(), location.getLongitude());
            }
        }
    }

    public AccidentReportActivity() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.x4
            @Override // com.zepto.hf
            public final void a(Object obj) {
                AccidentReportActivity.P1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getImageLauncher = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.y4
            @Override // com.zepto.hf
            public final void a(Object obj) {
                AccidentReportActivity.c2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getVideoLauncher = ofVarB02;
    }

    public static final void C2(AccidentReportActivity this$0, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 == 0) {
            this$0.G1();
        } else if (i2 == 1) {
            this$0.G2();
        } else {
            if (i2 != 2) {
                return;
            }
            this$0.H1();
        }
    }

    public static final void E1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E2(AccidentReportActivity this$0, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 == 0) {
            this$0.p2();
        } else if (i2 == 1) {
            this$0.H2();
        } else {
            if (i2 != 2) {
                return;
            }
            this$0.I1();
        }
    }

    public static final void F1(Dialog d2, AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public static final void P1(AccidentReportActivity this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            Intent intentC = gfVar.c();
            String str = this$0.imgType;
            if (Intrinsics.areEqual(str, "camera")) {
                if (intentC != null) {
                    this$0.A2(intentC);
                }
            } else {
                if (!Intrinsics.areEqual(str, "gallery") || intentC == null) {
                    return;
                }
                this$0.d2(intentC);
            }
        }
    }

    public static final void Z1(Calendar calendar, AccidentReportActivity this$0, TimePicker timePicker, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        calendar.set(11, i2);
        calendar.set(12, i3);
        this$0.N1().setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    public static final void a2(View view) {
    }

    public static final void c2(AccidentReportActivity this$0, gf gfVar) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            Intent intentC = gfVar.c();
            f6 f6Var = null;
            Uri data = intentC != null ? intentC.getData() : null;
            if (data != null) {
                try {
                    lValueOf = Long.valueOf(this$0.b2(data));
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                lValueOf = null;
            }
            if (!gd1.a.m(String.valueOf(lValueOf))) {
                Intrinsics.checkNotNull(lValueOf);
                if (((int) lValueOf.longValue()) <= 8000000) {
                    f6 f6Var2 = this$0.binding;
                    if (f6Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        f6Var = f6Var2;
                    }
                    f6Var.l.setImageResource(R.drawable.video_uploaded);
                    this$0.J1(data);
                    StringBuilder sb = new StringBuilder();
                    String lastPathSegment = data.getLastPathSegment();
                    Intrinsics.checkNotNull(lastPathSegment);
                    sb.append(lastPathSegment);
                    sb.append('.');
                    sb.append(this$0.O1(data));
                    this$0.videoFileName = sb.toString();
                    return;
                }
            }
            this$0.l2(this$0.U1().b("cs_note", "Video size must be equal or less than 8mb"));
        }
    }

    public static final void e2(AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void f2(AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) AccidentDashboardActivity.class));
        this$0.finish();
    }

    public static final void g2(AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) AccidentHistoryActivity.class));
        this$0.finish();
    }

    public static final void h2(View view) {
    }

    public static final void i2(AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        f6 f6Var = this$0.binding;
        f6 f6Var2 = null;
        if (f6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var = null;
        }
        Editable text = f6Var.i.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() != 0) {
            f6 f6Var3 = this$0.binding;
            if (f6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var3 = null;
            }
            if (f6Var3.i.getText().length() >= 4) {
                f6 f6Var4 = this$0.binding;
                if (f6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var4 = null;
                }
                if (!new Regex("[a-zA-Z0-9]*").matches(f6Var4.i.getText().toString())) {
                    f6 f6Var5 = this$0.binding;
                    if (f6Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        f6Var2 = f6Var5;
                    }
                    f6Var2.i.requestFocus();
                    this$0.l2(this$0.U1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"));
                    return;
                }
                Editable text2 = this$0.M1().getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                if (text2.length() == 0) {
                    this$0.M1().requestFocus();
                    this$0.D1();
                    return;
                }
                if (Intrinsics.areEqual(this$0.X1(), this$0.getResources().getString(R.string.select_state))) {
                    this$0.l2(this$0.U1().b("label_log_sel_state", "Please select state"));
                    return;
                }
                f6 f6Var6 = this$0.binding;
                if (f6Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var6 = null;
                }
                Editable text3 = f6Var6.e.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                if (text3.length() == 0) {
                    this$0.l2(this$0.U1().b("enter_comments", "Please enter comments"));
                    return;
                }
                if (!this$0.L1(this$0).contains(this$0.stat_Name)) {
                    f6 f6Var7 = this$0.binding;
                    if (f6Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        f6Var7 = null;
                    }
                    f6Var7.u.setAlpha(0.5f);
                    f6 f6Var8 = this$0.binding;
                    if (f6Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        f6Var8 = null;
                    }
                    f6Var8.u.setEnabled(false);
                    f6 f6Var9 = this$0.binding;
                    if (f6Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        f6Var2 = f6Var9;
                    }
                    f6Var2.i.setEnabled(false);
                    this$0.l2(this$0.U1().b("reportAcc_availMsg", "Report accident service service is not available in ") + this$0.stat_Name);
                    return;
                }
                f6 f6Var10 = this$0.binding;
                if (f6Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var10 = null;
                }
                f6Var10.i.setEnabled(true);
                String string = Settings.Secure.getString(this$0.R1().getContentResolver(), "android_id");
                f6 f6Var11 = this$0.binding;
                if (f6Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var11 = null;
                }
                f6Var11.b.setVisibility(0);
                vf4 vf4VarS1 = this$0.S1();
                f6 f6Var12 = this$0.binding;
                if (f6Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    f6Var2 = f6Var12;
                }
                String string2 = f6Var2.i.getText().toString();
                long j2 = Long.parseLong(this$0.V1().k());
                String strL = this$0.V1().l();
                Intrinsics.checkNotNull(string);
                vf4VarS1.b0(string2, j2, strL, string, this$0.V1().e());
                return;
            }
        }
        f6 f6Var13 = this$0.binding;
        if (f6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            f6Var2 = f6Var13;
        }
        f6Var2.i.requestFocus();
        this$0.l2(this$0.U1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"));
    }

    public static final void j2(AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 31 || this$0.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != -1) {
            this$0.D2();
        } else {
            this$0.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 10003);
        }
        Unit unit = Unit.INSTANCE;
    }

    public static final void k2(AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 31) {
            this$0.B2();
        } else if (this$0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
        } else {
            this$0.B2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.m2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void m2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void o2(Dialog d2, AccidentReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        f6 f6Var = this$0.binding;
        f6 f6Var2 = null;
        if (f6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var = null;
        }
        f6Var.i.setText("");
        f6 f6Var3 = this$0.binding;
        if (f6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var3 = null;
        }
        f6Var3.t.setPrompt("Select State");
        f6 f6Var4 = this$0.binding;
        if (f6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var4 = null;
        }
        f6Var4.t.setSelection(0);
        f6 f6Var5 = this$0.binding;
        if (f6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            f6Var2 = f6Var5;
        }
        f6Var2.e.setText("");
    }

    public final void A2(Intent it) {
        Bundle extras = it.getExtras();
        f6 f6Var = null;
        Bitmap bitmap = (Bitmap) (extras != null ? extras.get("data") : null);
        f6 f6Var2 = this.binding;
        if (f6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            f6Var = f6Var2;
        }
        f6Var.k.setImageResource(R.drawable.uploaded_img);
        Intrinsics.checkNotNull(bitmap);
        this.uploadedImgPath = st6.f(bitmap);
        this.imageFileName = "img_" + System.currentTimeMillis() + ".jpg";
    }

    public final void B2() {
        Log.v("Image Popup", "test");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        builder.setItems(this.uploadedImgPath.length() > 0 ? StringsKt__StringsJVMKt.equals(this.stat_Name, "odisha", true) ? new String[]{"Capture photo from camera", "Remove photo"} : new String[]{"Select photo from gallery", "Capture photo from camera", "Remove photo"} : StringsKt__StringsJVMKt.equals(this.stat_Name, "odisha", true) ? new String[]{"Capture photo from camera"} : new String[]{"Capture photo from camera"}, new DialogInterface.OnClickListener() { // from class: com.zepto.g5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccidentReportActivity.C2(this.a, dialogInterface, i2);
            }
        });
        builder.show();
    }

    public final void D1() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.enable_gps_location);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_allow);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.E1(dialog, view);
            }
        });
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.F1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void D2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        builder.setItems(this.uploadedVideoPath.length() > 0 ? new String[]{"Select video from gallery", "Capture video from camera", "Remove photo"} : new String[]{"Select video from gallery", "Capture video from camera"}, new DialogInterface.OnClickListener() { // from class: com.zepto.f5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AccidentReportActivity.E2(this.a, dialogInterface, i2);
            }
        });
        builder.show();
    }

    public final void F2() {
        try {
            f6 f6Var = this.binding;
            f6 f6Var2 = null;
            if (f6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var = null;
            }
            f6Var.b.setVisibility(0);
            String string = Settings.Secure.getString(R1().getContentResolver(), "android_id");
            Object systemService = getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (!((LocationManager) systemService).isProviderEnabled("gps")) {
                D1();
                return;
            }
            ki2 ki2Var = new ki2(this);
            if (T1() == null) {
                D1();
                return;
            }
            if (Intrinsics.areEqual(T1(), getResources().getString(R.string.location_not_find))) {
                f6 f6Var3 = this.binding;
                if (f6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var3 = null;
                }
                f6Var3.b.setVisibility(0);
                vf4 vf4VarS1 = S1();
                String strK = V1().k();
                String string2 = M1().getText().toString();
                String strValueOf = String.valueOf(ki2Var.f);
                String string3 = M1().getText().toString();
                String strValueOf2 = String.valueOf(ki2Var.g);
                f6 f6Var4 = this.binding;
                if (f6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    f6Var4 = null;
                }
                String string4 = f6Var4.i.getText().toString();
                f6 f6Var5 = this.binding;
                if (f6Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    f6Var2 = f6Var5;
                }
                String string5 = f6Var2.e.getText().toString();
                String strX1 = X1();
                String strN = V1().n();
                String str = this.uploadedImgPath;
                String str2 = this.imageFileName;
                String str3 = this.uploadedVideoPath;
                String str4 = this.videoFileName;
                boolean z = this.rcVerified;
                String strL = V1().l();
                Intrinsics.checkNotNull(string);
                vf4VarS1.Y(strK, VContant.MAINSCREEN, string2, strValueOf, string3, strValueOf2, string4, string5, strX1, strN, str, str2, str3, str4, z, strL, string, V1().e());
                return;
            }
            f6 f6Var6 = this.binding;
            if (f6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var6 = null;
            }
            f6Var6.b.setVisibility(0);
            vf4 vf4VarS12 = S1();
            String strK2 = V1().k();
            String strT1 = T1();
            String strValueOf3 = String.valueOf(ki2Var.f);
            String string6 = M1().getText().toString();
            String strValueOf4 = String.valueOf(ki2Var.g);
            f6 f6Var7 = this.binding;
            if (f6Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var7 = null;
            }
            String string7 = f6Var7.i.getText().toString();
            f6 f6Var8 = this.binding;
            if (f6Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                f6Var2 = f6Var8;
            }
            String string8 = f6Var2.e.getText().toString();
            String strX12 = X1();
            String strN2 = V1().n();
            String str5 = this.uploadedImgPath;
            String str6 = this.imageFileName;
            String str7 = this.uploadedVideoPath;
            String str8 = this.videoFileName;
            boolean z2 = this.rcVerified;
            String strL2 = V1().l();
            Intrinsics.checkNotNull(string);
            vf4VarS12.Y(strK2, VContant.MAINSCREEN, strT1, strValueOf3, string6, strValueOf4, string7, string8, strX12, strN2, str5, str6, str7, str8, z2, strL2, string, V1().e());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void G1() {
        try {
            this.imgType = "gallery";
            this.getImageLauncher.a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
        } catch (Exception unused) {
        }
    }

    public final void G2() {
        if (st6.d(this)) {
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.getImageLauncher.a(getIntent());
        }
    }

    public final void H1() {
        this.uploadedImgPath = "";
        this.imageFileName = "";
        f6 f6Var = this.binding;
        if (f6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var = null;
        }
        f6Var.k.setImageResource(R.drawable.ic_photo_add);
    }

    public final void H2() {
        this.videoType = "videoType";
        this.imgType = "";
        if (st6.d(this)) {
            setIntent(new Intent("android.media.action.VIDEO_CAPTURE"));
            getIntent().putExtra("android.intent.extra.sizeLimit", 8388608L);
            getIntent().putExtra("return-data", true);
            getIntent().putExtra("android.intent.extra.videoQuality", 0);
            this.getVideoLauncher.a(getIntent());
        }
    }

    public final void I1() {
        this.uploadedVideoPath = "";
        this.videoFileName = "";
        f6 f6Var = this.binding;
        if (f6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var = null;
        }
        f6Var.l.setImageResource(R.drawable.ic_video_add);
    }

    public final void J1(Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            Intrinsics.checkNotNull(inputStreamOpenInputStream);
            byte[] bArrK1 = K1(inputStreamOpenInputStream);
            Intrinsics.checkNotNull(bArrK1);
            String strEncodeToString = Base64.encodeToString(bArrK1, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            this.uploadedVideoPath = strEncodeToString;
            this.uploadedVideoPath = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strEncodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final byte[] K1(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public final ArrayList L1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            Object objFromJson = new Gson().fromJson(new dl4(context).e().toString(), (Class<Object>) StateMaster.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            ArrayList<State> states = ((StateMaster) objFromJson).getStates();
            Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
            int size = states.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (states.get(i2).isSentinal()) {
                    arrayList.add(states.get(i2).getName());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final EditText M1() {
        EditText editText = this.evLocation;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evLocation");
        return null;
    }

    public final TextView N1() {
        TextView textView = this.evTime;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evTime");
        return null;
    }

    public final String O1(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton(...)");
        Intrinsics.checkNotNull(uri);
        return singleton.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    public final void Q1(double lat, double lang) {
        try {
            List<Address> fromLocation = new Geocoder(this, Locale.getDefault()).getFromLocation(lat, lang, 1);
            Intrinsics.checkNotNull(fromLocation);
            String adminArea = fromLocation.get(0).getAdminArea();
            Intrinsics.checkNotNullExpressionValue(adminArea, "getAdminArea(...)");
            this.stat_Name = adminArea;
            if (fromLocation.isEmpty()) {
                String string = getResources().getString(R.string.location_not_find);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                v2(string);
            } else {
                String addressLine = fromLocation.get(0).getAddressLine(0);
                Intrinsics.checkNotNullExpressionValue(addressLine, "getAddressLine(...)");
                v2(addressLine);
                M1().setText(T1());
            }
        } catch (IOException e2) {
            String string2 = getResources().getString(R.string.location_not_find);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            v2(string2);
            e2.printStackTrace();
        }
    }

    public final Context R1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final vf4 S1() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final String T1() {
        String str = this.myLocation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myLocation");
        return null;
    }

    public final wa3 U1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 V1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ArrayList W1() {
        ArrayList arrayList = this.stateList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateList");
        return null;
    }

    public final String X1() {
        String str = this.stateValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateValue");
        return null;
    }

    public final void Y1(TextView textView, Context context) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(context, "context");
        final Calendar calendar = Calendar.getInstance();
        new TimePickerDialog.OnTimeSetListener() { // from class: com.zepto.b5
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i2, int i3) {
                AccidentReportActivity.Z1(calendar, this, timePicker, i2, i3);
            }
        };
        N1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.a2(view);
            }
        });
    }

    public final long b2(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursorQuery = getContentResolver().query(contentUri, null, null, null, null);
        try {
            Intrinsics.checkNotNull(cursorQuery);
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j2 = cursorQuery.getLong(columnIndex);
            CloseableKt.closeFinally(cursorQuery, null);
            return j2;
        } finally {
        }
    }

    public final void d2(Intent it) {
        Bitmap bitmap;
        Uri data = it.getData();
        try {
            if (Build.VERSION.SDK_INT > 27) {
                ContentResolver contentResolver = getContentResolver();
                Intrinsics.checkNotNull(data);
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, data);
                Intrinsics.checkNotNullExpressionValue(sourceCreateSource, "createSource(...)");
                bitmap = ImageDecoder.decodeBitmap(sourceCreateSource);
                Intrinsics.checkNotNull(bitmap);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data);
                Intrinsics.checkNotNull(bitmap);
            }
            f6 f6Var = this.binding;
            if (f6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f6Var = null;
            }
            f6Var.k.setImageResource(R.drawable.uploaded_img);
            this.uploadedImgPath = st6.f(bitmap);
            StringBuilder sb = new StringBuilder();
            String lastPathSegment = data != null ? data.getLastPathSegment() : null;
            Intrinsics.checkNotNull(lastPathSegment);
            sb.append(lastPathSegment);
            sb.append('.');
            sb.append(O1(data));
            this.imageFileName = sb.toString();
        } catch (IOException e2) {
            e2.printStackTrace();
            Toast.makeText(this, "Failed!", 0).show();
        }
    }

    public final void n2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.o2(dialog, this, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        f6 f6VarC = f6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(f6VarC, "inflate(...)");
        this.binding = f6VarC;
        f6 f6Var = null;
        if (f6VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6VarC = null;
        }
        setContentView(f6VarC.b());
        f6 f6Var2 = this.binding;
        if (f6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var2 = null;
        }
        f6Var2.j.g.setText("Report Accident");
        f6 f6Var3 = this.binding;
        if (f6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var3 = null;
        }
        f6Var3.j.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.e2(this.a, view);
            }
        });
        try {
            Object systemService = getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                s2();
            } else {
                D1();
            }
        } catch (Exception unused) {
        }
        t2(this);
        x2(new ws6(this));
        ta3.a aVar = ta3.a;
        f6 f6Var4 = this.binding;
        if (f6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var4 = null;
        }
        aVar.d(this, f6Var4);
        this.mOffenceInterface = OffenceInterface.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.ev_location);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        q2((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.ev_time_picker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        r2((TextView) viewFindViewById2);
        f6 f6Var5 = this.binding;
        if (f6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var5 = null;
        }
        f6Var5.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.f2(this.a, view);
            }
        });
        f6 f6Var6 = this.binding;
        if (f6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var6 = null;
        }
        f6Var6.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.g2(this.a, view);
            }
        });
        f6 f6Var7 = this.binding;
        if (f6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var7 = null;
        }
        f6Var7.b.setVisibility(0);
        f6 f6Var8 = this.binding;
        if (f6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var8 = null;
        }
        f6Var8.f.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        N1().setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        Y1(N1(), R1());
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
            offenceInterface = null;
        }
        u2((vf4) new z(this, new uf4(new of4(offenceInterface))).a(vf4.class));
        f6 f6Var9 = this.binding;
        if (f6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var9 = null;
        }
        f6Var9.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.h2(view);
            }
        });
        f6 f6Var10 = this.binding;
        if (f6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var10 = null;
        }
        f6Var10.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.i2(this.a, view);
            }
        });
        S1().K().g(this, new i(new e()));
        S1().J().g(this, new i(new f()));
        S1().R(VContant.MAINSCREEN);
        S1().z().g(this, new i(new g()));
        S1().r().g(this, new i(new h()));
        f6 f6Var11 = this.binding;
        if (f6Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var11 = null;
        }
        f6Var11.t.setOnItemSelectedListener(new b());
        f6 f6Var12 = this.binding;
        if (f6Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f6Var12 = null;
        }
        f6Var12.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.j2(this.a, view);
            }
        });
        f6 f6Var13 = this.binding;
        if (f6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            f6Var = f6Var13;
        }
        f6Var.k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentReportActivity.k2(this.a, view);
            }
        });
        S1().T().g(this, new i(new c()));
        S1().t().g(this, new i(new d()));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 222) {
            if (!(!(grantResults.length == 0)) || grantResults[0] != 0) {
                Toast.makeText(this, U1().b("go_to_settings", getString(R.string.enable_manual_setting)), 0).show();
                return;
            } else {
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                this.getImageLauncher.a(getIntent());
                return;
            }
        }
        if (requestCode == 10001) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                B2();
                return;
            } else {
                Toast.makeText(this, "Permission denied", 0).show();
                return;
            }
        }
        if (requestCode != 10003) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            D2();
        } else {
            Toast.makeText(this, "Permission denied", 0).show();
        }
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isProviderEnabled("gps")) {
            s2();
        }
    }

    public final void p2() {
        Intent intent = Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted") ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        intent.setType("video/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.sizeLimit", 8388608);
        intent.putExtra("return-data", true);
        this.getVideoLauncher.a(intent);
    }

    public final void q2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.evLocation = editText;
    }

    public final void r2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.evTime = textView;
    }

    public final void s2() {
        bi2 bi2VarA = wm3.a(this);
        Intrinsics.checkNotNullExpressionValue(bi2VarA, "getFusedLocationProviderClient(...)");
        LocationRequest locationRequestR = new LocationRequest().q(600000L).p(600000L).r(100);
        Intrinsics.checkNotNullExpressionValue(locationRequestR, "setPriority(...)");
        if (yy0.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || yy0.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            bi2VarA.e(locationRequestR, new j(), Looper.myLooper());
        }
    }

    public final void t2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void u2(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void v2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.myLocation = str;
    }

    public final void w2(boolean z) {
        this.rcVerified = z;
    }

    public final void x2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void y2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.stateList = arrayList;
    }

    public final void z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateValue = str;
    }
}
