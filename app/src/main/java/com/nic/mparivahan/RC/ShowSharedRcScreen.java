package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ImpoundRcSuccessModel;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.ShowSharedRcScreen;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.ey4;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.k;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.o45;
import com.zepto.oz7;
import com.zepto.p45;
import com.zepto.p80;
import com.zepto.pq;
import com.zepto.q45;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.v12;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xh;
import com.zepto.yy0;
import com.zepto.z22;
import com.zepto.z30;
import java.util.Hashtable;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0006J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010v\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010z\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010q\u001a\u0004\bx\u0010s\"\u0004\by\u0010uR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0086\u0001\u001a\u00020{8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010}\u001a\u0005\b\u0084\u0001\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R%\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010q\u001a\u0005\b\u0088\u0001\u0010s\"\u0005\b\u0089\u0001\u0010u¨\u0006\u008c\u0001"}, d2 = {"Lcom/nic/mparivahan/RC/ShowSharedRcScreen;", "Lcom/zepto/pq;", "", "K1", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "rcdetails", "", "y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/xh;", "binding", "rc_number", "T1", "Landroid/graphics/Bitmap;", "QRImg", "appIcon", "E1", "myCodeText", "q1", "Landroid/content/Context;", "mContext", "bitmap", "mText", "p1", "context", "message", "L1", "C", "Lcom/zepto/xh;", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "r1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "N1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "E", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "B1", "()Lcom/nic/mparivahan/RC/Model/NrvDetails;", "W1", "(Lcom/nic/mparivahan/RC/Model/NrvDetails;)V", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "x1", "()Landroid/widget/ImageView;", "S1", "(Landroid/widget/ImageView;)V", "qrImg", "G", "Landroid/graphics/Bitmap;", "w1", "()Landroid/graphics/Bitmap;", "R1", "(Landroid/graphics/Bitmap;)V", "qrBmp", "Lcom/zepto/a55;", "H", "Lcom/zepto/a55;", "u1", "()Lcom/zepto/a55;", "P1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "I", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "t1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "O1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/o45;", "K", "Lcom/zepto/o45;", "z1", "()Lcom/zepto/o45;", "U1", "(Lcom/zepto/o45;)V", "rcImpoundModel", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "L", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "rcImpoundService", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "X1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/ws6;", "N", "Lcom/zepto/ws6;", "D1", "()Lcom/zepto/ws6;", "Y1", "(Lcom/zepto/ws6;)V", "sessionManager", "O", "Ljava/lang/String;", "getRecordId", "()Ljava/lang/String;", "setRecordId", "(Ljava/lang/String;)V", "RecordId", "P", "getDocId", "setDocId", "DocId", "", "Q", "Z", "getFlag", "()Z", "setFlag", "(Z)V", "flag", "R", "s1", "setFlag_clicked", "flag_clicked", "S", "A1", "V1", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ShowSharedRcScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public xh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ImageView qrImg;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Bitmap qrBmp;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public o45 rcImpoundModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public RcImpoundService rcImpoundService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String RecordId = "0";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String DocId = "0";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean flag;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean flag_clicked;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String rc_number;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ImpoundRcSuccessModel impoundRcSuccessModel) {
            if (ShowSharedRcScreen.this.v1().isShowing()) {
                ShowSharedRcScreen.this.v1().dismiss();
            }
            xh xhVar = ShowSharedRcScreen.this.binding;
            if (xhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar = null;
            }
            xhVar.u.setVisibility(8);
            xh xhVar2 = ShowSharedRcScreen.this.binding;
            if (xhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar2 = null;
            }
            xhVar2.T0.setVisibility(8);
            xh xhVar3 = ShowSharedRcScreen.this.binding;
            if (xhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar3 = null;
            }
            xhVar3.t0.setVisibility(8);
            int size = impoundRcSuccessModel.getResult().size();
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals(impoundRcSuccessModel.getResult().get(i).getImpound_type(), "document", true)) {
                    xh xhVar4 = ShowSharedRcScreen.this.binding;
                    if (xhVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xhVar4 = null;
                    }
                    xhVar4.t0.setVisibility(0);
                    TextView textView = new TextView(ShowSharedRcScreen.this);
                    textView.setTextColor(yy0.c(ShowSharedRcScreen.this, R.color.red_new));
                    textView.setTextSize(13.0f);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView.setGravity(8388613);
                    textView.setText(impoundRcSuccessModel.getResult().get(i).getDocument());
                    xh xhVar5 = ShowSharedRcScreen.this.binding;
                    if (xhVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xhVar5 = null;
                    }
                    xhVar5.L0.addView(textView);
                }
                if (StringsKt__StringsJVMKt.equals(impoundRcSuccessModel.getResult().get(i).getImpound_type(), "vehicle", true)) {
                    xh xhVar6 = ShowSharedRcScreen.this.binding;
                    if (xhVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xhVar6 = null;
                    }
                    xhVar6.T0.setVisibility(0);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ImpoundRcSuccessModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

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
        public final void invoke(String str) {
            if (ShowSharedRcScreen.this.v1().isShowing()) {
                ShowSharedRcScreen.this.v1().dismiss();
            }
            xh xhVar = ShowSharedRcScreen.this.binding;
            xh xhVar2 = null;
            if (xhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar = null;
            }
            xhVar.u.setVisibility(0);
            xh xhVar3 = ShowSharedRcScreen.this.binding;
            if (xhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar3 = null;
            }
            xhVar3.T0.setVisibility(8);
            xh xhVar4 = ShowSharedRcScreen.this.binding;
            if (xhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xhVar2 = xhVar4;
            }
            xhVar2.t0.setVisibility(8);
            ShowSharedRcScreen showSharedRcScreen = ShowSharedRcScreen.this;
            showSharedRcScreen.L1(showSharedRcScreen, showSharedRcScreen.C1().b(va3.a.P(), "No Vehicle or Seizure Document impound against the searched RC number."));
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

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
        public final void a(RcModelsDet rcModelsDet) {
            ShowSharedRcScreen.this.v1().dismiss();
            xh xhVar = null;
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true)) {
                if (rcModelsDet.getNrvDetails() != null) {
                    xh xhVar2 = ShowSharedRcScreen.this.binding;
                    if (xhVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xhVar2 = null;
                    }
                    xhVar2.T.setVisibility(0);
                    ShowSharedRcScreen.this.W1(rcModelsDet.getNrvDetails());
                    xh xhVar3 = ShowSharedRcScreen.this.binding;
                    if (xhVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xhVar3 = null;
                    }
                    xhVar3.g0.setText(ShowSharedRcScreen.this.B1().getRc_regn_no());
                    ShowSharedRcScreen showSharedRcScreen = ShowSharedRcScreen.this;
                    xh xhVar4 = showSharedRcScreen.binding;
                    if (xhVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        xhVar = xhVar4;
                    }
                    showSharedRcScreen.T1(xhVar, ShowSharedRcScreen.this.B1(), String.valueOf(ShowSharedRcScreen.this.B1().getRc_regn_no()));
                    if (ShowSharedRcScreen.this.getFlag_clicked()) {
                        ShowSharedRcScreen showSharedRcScreen2 = ShowSharedRcScreen.this;
                        showSharedRcScreen2.L1(showSharedRcScreen2, showSharedRcScreen2.C1().b(va3.a.b1(), "Virtual RC successfully updated!"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NR090", true)) {
                xh xhVar5 = ShowSharedRcScreen.this.binding;
                if (xhVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xhVar = xhVar5;
                }
                xhVar.T.setVisibility(4);
                ShowSharedRcScreen.this.v1().dismiss();
                hz0.a.Q(ShowSharedRcScreen.this, rcModelsDet.getStatusDesc(), 1);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NR091", true)) {
                xh xhVar6 = ShowSharedRcScreen.this.binding;
                if (xhVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xhVar = xhVar6;
                }
                xhVar.T.setVisibility(4);
                ShowSharedRcScreen.this.v1().dismiss();
                hz0.a.Q(ShowSharedRcScreen.this, rcModelsDet.getStatusDesc(), 2);
                return;
            }
            if (gd1.a.m(rcModelsDet.getStatusDesc())) {
                xh xhVar7 = ShowSharedRcScreen.this.binding;
                if (xhVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xhVar = xhVar7;
                }
                xhVar.T.setVisibility(4);
                return;
            }
            xh xhVar8 = ShowSharedRcScreen.this.binding;
            if (xhVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xhVar = xhVar8;
            }
            xhVar.T.setVisibility(4);
            ShowSharedRcScreen showSharedRcScreen3 = ShowSharedRcScreen.this;
            showSharedRcScreen3.L1(showSharedRcScreen3, rcModelsDet.getStatusDesc());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RcModelsDet) obj);
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
        public final void invoke(String str) {
            ShowSharedRcScreen.this.v1().dismiss();
            ShowSharedRcScreen showSharedRcScreen = ShowSharedRcScreen.this;
            showSharedRcScreen.L1(showSharedRcScreen, showSharedRcScreen.C1().b(va3.a.D(), "Unable to get the details, Please try after some times"));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(MyRcDeletResponse myRcDeletResponse) throws Throwable {
            if (!Intrinsics.areEqual(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                    ShowSharedRcScreen.this.v1().dismiss();
                    hz0.a.Q(ShowSharedRcScreen.this, myRcDeletResponse.getStatusDesc(), 1);
                    return;
                } else if (!StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                    ShowSharedRcScreen.this.v1().dismiss();
                    return;
                } else {
                    ShowSharedRcScreen.this.v1().dismiss();
                    hz0.a.Q(ShowSharedRcScreen.this, myRcDeletResponse.getStatusDesc(), 2);
                    return;
                }
            }
            try {
                DatabaseHelper databaseHelperR1 = ShowSharedRcScreen.this.r1();
                xh xhVar = ShowSharedRcScreen.this.binding;
                if (xhVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xhVar = null;
                }
                String strC0 = databaseHelperR1.C0(xhVar.g0.getText().toString());
                a55 a55VarU1 = ShowSharedRcScreen.this.u1();
                String strK = ShowSharedRcScreen.this.D1().k();
                Intrinsics.checkNotNull(strC0);
                a55VarU1.o(strK, strC0, ShowSharedRcScreen.this);
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((MyRcDeletResponse) obj);
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
        public final void invoke(String str) {
            if (ShowSharedRcScreen.this.v1().isShowing()) {
                ShowSharedRcScreen.this.v1().dismiss();
            }
            ShowSharedRcScreen showSharedRcScreen = ShowSharedRcScreen.this;
            showSharedRcScreen.L1(showSharedRcScreen, showSharedRcScreen.C1().b(va3.a.D(), "Unable to get the details, Please try after some times"));
        }
    }

    public static final class g implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
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

    public static final void F1(ShowSharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void G1(ShowSharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void H1(ShowSharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    public static final void I1(ShowSharedRcScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.flag_clicked = true;
            if (this$0.flag) {
                this$0.v1().show();
                a55 a55VarU1 = this$0.u1();
                String str = this$0.RecordId;
                Intrinsics.checkNotNull(str);
                String str2 = this$0.DocId;
                Intrinsics.checkNotNull(str2);
                a55VarU1.n(str, str2, this$0);
                return;
            }
            this$0.v1().show();
            DatabaseHelper databaseHelperR1 = this$0.r1();
            xh xhVar = this$0.binding;
            if (xhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar = null;
            }
            String strC0 = databaseHelperR1.C0(xhVar.g0.getText().toString());
            a55 a55VarU12 = this$0.u1();
            Intrinsics.checkNotNull(strC0);
            a55VarU12.a0(strC0, "RC", this$0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void J1(ShowSharedRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.v1().isShowing()) {
                this$0.v1().dismiss();
            }
            this$0.v1().show();
            String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(this$0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rc_no", StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.B1().getRc_regn_no())).toString());
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            this$0.z1().j(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void K1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
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

    public final wa3 C1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 D1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final Bitmap E1(Bitmap QRImg, Bitmap appIcon) {
        Intrinsics.checkNotNullParameter(QRImg, "QRImg");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(QRImg.getWidth(), QRImg.getHeight(), QRImg.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(QRImg, new Matrix(), null);
        canvas.drawBitmap(appIcon, (QRImg.getWidth() - appIcon.getWidth()) / 2, (QRImg.getHeight() - appIcon.getHeight()) / 2, (Paint) null);
        return bitmapCreateBitmap;
    }

    public final void L1(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(C1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(C1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowSharedRcScreen.M1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void N1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void O1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void P1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void Q1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R1(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
        this.qrBmp = bitmap;
    }

    public final void S1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.qrImg = imageView;
    }

    public final void T1(xh binding, NrvDetails rcdetails, String rc_number) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        try {
            binding.P.setText(rcdetails.getRc_owner_name());
            binding.n0.setText(rcdetails.getRc_f_name());
            binding.j.setText(rcdetails.getRc_chasi_no());
            binding.n.setText(rcdetails.getRc_eng_no());
            binding.Z.setText(rcdetails.getRc_maker_desc());
            binding.l0.setText(rcdetails.getRc_regn_dt());
            binding.c.setText(rcdetails.getRc_present_address());
            gd1.a aVar = gd1.a;
            if (aVar.m(rcdetails.getRc_tax_upto())) {
                binding.x0.setText("NA");
            } else {
                binding.x0.setText(rcdetails.getRc_tax_upto());
            }
            binding.Q0.setText(rcdetails.getRc_vch_catg());
            binding.S0.setText(rcdetails.getRc_vh_class_desc());
            binding.t.setText(rcdetails.getRc_fuel_desc());
            binding.l.setText(rcdetails.getRc_color());
            binding.s0.setText(rcdetails.getRc_seat_cap());
            binding.v0.setText(rcdetails.getRc_stand_cap());
            binding.B.setText(rcdetails.getRc_insurance_upto());
            binding.r.setText(rcdetails.getRc_fit_upto());
            if (aVar.m(rcdetails.getRc_norms_desc())) {
                binding.f0.setVisibility(0);
                binding.e0.setText("Not Available|Applicable");
            } else {
                binding.e0.setText(rcdetails.getRc_norms_desc());
            }
            if (aVar.m(rcdetails.getRc_pucc_no())) {
                binding.U.setText("NA");
            } else {
                binding.U.setText(rcdetails.getRc_pucc_no());
            }
            if (aVar.m(rcdetails.getRc_pucc_upto())) {
                binding.X.setText("NA");
            } else {
                binding.X.setText(rcdetails.getRc_pucc_upto());
            }
            binding.p0.setText(rcdetails.getRc_registered_at());
            if (kt6.d(rcdetails.getRc_maker_model())) {
                binding.b0.setText(rcdetails.getRc_maker_model());
            } else {
                binding.b0.setText("NA");
            }
            if (kt6.d(rcdetails.getRc_insurance_comp())) {
                binding.x.setText(rcdetails.getRc_insurance_comp());
            } else {
                binding.x.setText("NA");
            }
            if (kt6.d(rcdetails.getRc_insurance_policy_no())) {
                binding.y.setText(rcdetails.getRc_insurance_policy_no());
            } else {
                binding.y.setText("NA");
            }
            if (aVar.m(rcdetails.getRc_financer())) {
                binding.p.setText("NA");
            } else {
                binding.p.setText(rcdetails.getRc_financer());
            }
            if (aVar.m(rcdetails.getRc_blacklist_status())) {
                binding.C.setVisibility(8);
            } else {
                binding.C.setVisibility(0);
                binding.J0.setText(rcdetails.getRc_blacklist_status());
            }
            if (aVar.m(rcdetails.getRc_np_no())) {
                binding.G.setVisibility(8);
            } else {
                binding.G0.setText(rcdetails.getRc_np_no());
                CharSequence text = binding.G0.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    binding.G.setVisibility(8);
                } else {
                    binding.G.setVisibility(0);
                }
            }
            if (aVar.m(rcdetails.getRc_np_upto())) {
                binding.H.setVisibility(8);
            } else {
                binding.H0.setText(rcdetails.getRc_np_upto());
                CharSequence text2 = binding.H0.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                if (text2.length() == 0) {
                    binding.H.setVisibility(8);
                } else {
                    binding.H.setVisibility(0);
                }
            }
            if (aVar.m(rcdetails.getRc_permit_valid_upto())) {
                binding.I.setVisibility(8);
            } else {
                binding.I0.setText(rcdetails.getRc_permit_valid_upto());
                CharSequence text3 = binding.I0.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                if (text3.length() == 0) {
                    binding.I.setVisibility(8);
                } else {
                    binding.I.setVisibility(0);
                }
            }
            if (aVar.m(rcdetails.getRc_mobile_no())) {
                binding.K.setText("NA");
            } else {
                binding.K.setText(rcdetails.getRc_mobile_no());
            }
            try {
                Bitmap bitmapQ1 = q1(k.a(y1(rcdetails), APIController.a().EcQr001()));
                Intrinsics.checkNotNull(bitmapQ1);
                R1(bitmapQ1);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bc1), 80, 80, true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                x1().setImageBitmap(p1(this, E1(w1(), bitmapCreateScaledBitmap), "RC No : " + rc_number));
            } catch (Exception unused) {
                Toast.makeText(getApplicationContext(), getString(R.string.qr_generate_failed), 1).show();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void U1(o45 o45Var) {
        Intrinsics.checkNotNullParameter(o45Var, "<set-?>");
        this.rcImpoundModel = o45Var;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void W1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void X1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void Y1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        xh xhVarC = xh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xhVarC, "inflate(...)");
        this.binding = xhVarC;
        xh xhVar = null;
        if (xhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xhVarC = null;
        }
        setContentView(xhVarC.b());
        ta3.a aVar = ta3.a;
        xh xhVar2 = this.binding;
        if (xhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xhVar2 = null;
        }
        aVar.c3(this, xhVar2);
        X1(new wa3(this));
        N1(new DatabaseHelper(this));
        O1(RcService.INSTANCE.a(this));
        this.rcImpoundService = RcImpoundService.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.rc_qr_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        S1((ImageView) viewFindViewById);
        Q1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        Y1(new ws6(this));
        P1((a55) new z(this, new b55(new s45(t1()))).a(a55.class));
        RcImpoundService rcImpoundService = this.rcImpoundService;
        if (rcImpoundService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rcImpoundService");
            rcImpoundService = null;
        }
        U1((o45) new z(this, new q45(new p45(rcImpoundService))).a(o45.class));
        xh xhVar3 = this.binding;
        if (xhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xhVar3 = null;
        }
        xhVar3.T.setVisibility(4);
        try {
            if (getIntent() != null) {
                this.flag = getIntent().getBooleanExtra("ShareRecivedFlag", false);
                V1(String.valueOf(getIntent().getStringExtra("RcNumber")));
                if (this.flag) {
                    this.RecordId = String.valueOf(getIntent().getStringExtra("RecordId"));
                    this.DocId = String.valueOf(getIntent().getStringExtra("DocId"));
                    v1().show();
                    a55 a55VarU1 = u1();
                    String str = this.RecordId;
                    Intrinsics.checkNotNull(str);
                    String str2 = this.DocId;
                    Intrinsics.checkNotNull(str2);
                    a55VarU1.n(str, str2, this);
                } else {
                    try {
                        v1().show();
                        String strC0 = r1().C0(A1());
                        a55 a55VarU12 = u1();
                        String strK = D1().k();
                        Intrinsics.checkNotNull(strC0);
                        a55VarU12.o(strK, strC0, this);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            xh xhVar4 = this.binding;
            if (xhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xhVar4 = null;
            }
            xhVar4.q0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShowSharedRcScreen.F1(this.a, view);
                }
            });
        } catch (Error unused) {
        }
        u1().R().g(this, new g(new c()));
        u1().S().g(this, new g(new d()));
        xh xhVar5 = this.binding;
        if (xhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xhVar5 = null;
        }
        xhVar5.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowSharedRcScreen.G1(this.a, view);
            }
        });
        xh xhVar6 = this.binding;
        if (xhVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xhVar6 = null;
        }
        xhVar6.M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowSharedRcScreen.H1(this.a, view);
            }
        });
        xh xhVar7 = this.binding;
        if (xhVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xhVar7 = null;
        }
        xhVar7.j0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                ShowSharedRcScreen.I1(this.a, view);
            }
        });
        u1().U().g(this, new g(new e()));
        u1().T().g(this, new g(new f()));
        xh xhVar8 = this.binding;
        if (xhVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            xhVar = xhVar8;
        }
        xhVar.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowSharedRcScreen.J1(this.a, view);
            }
        });
        z1().l().g(this, new g(new a()));
        z1().k().g(this, new g(new b()));
    }

    public final Bitmap p1(Context mContext, Bitmap bitmap, String mText) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(mText, "mText");
        float f2 = mContext.getResources().getDisplayMetrics().density;
        Bitmap.Config config = bitmap.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
        Canvas canvas = new Canvas(bitmap.copy(config, true));
        Paint paint = new Paint(1);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setTextSize(7 * f2);
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -12303292);
        paint.getTextBounds(mText, 0, mText.length(), new Rect());
        canvas.drawText(mText, bitmap.getWidth() / 5, 10 * f2, paint);
        return bitmap;
    }

    public final Bitmap q1(String myCodeText) throws oz7 {
        Hashtable hashtable = new Hashtable();
        hashtable.put(v12.a, z22.g);
        p80 p80VarA = new ey4().a(myCodeText, z30.b, 384, 384, hashtable);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(384, 384, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        for (int i = 0; i < 384; i++) {
            for (int i2 = 0; i2 < 384; i2++) {
                bitmapCreateBitmap.setPixel(i2, i, p80VarA.b(i, i2) == 0 ? -16777216 : -1);
            }
        }
        return bitmapCreateBitmap;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final boolean getFlag_clicked() {
        return this.flag_clicked;
    }

    public final RcService t1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 u1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
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

    public final Bitmap w1() {
        Bitmap bitmap = this.qrBmp;
        if (bitmap != null) {
            return bitmap;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qrBmp");
        return null;
    }

    public final ImageView x1() {
        ImageView imageView = this.qrImg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qrImg");
        return null;
    }

    public final String y1(NrvDetails rcdetails) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 0);
            jSONObject.put("rn", rcdetails.getRc_regn_no());
            jSONObject.put("rd", rcdetails.getRc_regn_dt());
            jSONObject.put("on", rcdetails.getRc_owner_name());
            jSONObject.put("fn", rcdetails.getRc_f_name());
            jSONObject.put("en", rcdetails.getRc_eng_no());
            jSONObject.put("cn", rcdetails.getRc_chasi_no());
            jSONObject.put("vt", rcdetails.getRc_vh_class_desc());
            jSONObject.put("ft", rcdetails.getRc_fuel_desc());
            jSONObject.put("iv", rcdetails.getRc_insurance_upto());
            jSONObject.put("ipn", rcdetails.getRc_insurance_policy_no());
            jSONObject.put("fv", rcdetails.getRc_fit_upto());
            jSONObject.put("pv", rcdetails.getRc_permit_valid_upto());
            jSONObject.put("tv", rcdetails.getRc_tax_upto());
            jSONObject.put("c", rcdetails.getRc_color());
            jSONObject.put("sc", rcdetails.getRc_seat_cap());
            jSONObject.put("stc", rcdetails.getRc_stand_cap());
            jSONObject.put("slc", rcdetails.getRc_sleeper_cap());
            jSONObject.put("nc", rcdetails.getRc_no_cyl());
            jSONObject.put("mm", rcdetails.getRc_manu_month_yr());
            jSONObject.put("uw", rcdetails.getRc_unld_wt());
            jSONObject.put("lw", rcdetails.getRc_gvw());
            jSONObject.put("rat", rcdetails.getRc_registered_at());
            jSONObject.put("s", rcdetails.getRc_status_as_on());
            jSONObject.put("pc_no", rcdetails.getRc_pucc_no());
            jSONObject.put("pc_v", rcdetails.getRc_pucc_upto());
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final o45 z1() {
        o45 o45Var = this.rcImpoundModel;
        if (o45Var != null) {
            return o45Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcImpoundModel");
        return null;
    }
}
