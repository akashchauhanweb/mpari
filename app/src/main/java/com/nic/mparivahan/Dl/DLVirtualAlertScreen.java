package com.nic.mparivahan.Dl;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLVirtualAlertScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.Dlcov;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.zepto.ey4;
import com.zepto.gd1;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k;
import com.zepto.k18;
import com.zepto.ls1;
import com.zepto.mf4;
import com.zepto.o45;
import com.zepto.oz7;
import com.zepto.p45;
import com.zepto.p80;
import com.zepto.pq;
import com.zepto.q45;
import com.zepto.ta3;
import com.zepto.v12;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.yy0;
import com.zepto.z22;
import com.zepto.z30;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001b\u001a\u00020\u0004H\u0007J\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010>\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\"\u0010B\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\"\u0010F\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00105R\"\u0010J\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u00103\"\u0004\bI\u00105R\"\u0010N\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\"\u0010R\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u00101\u001a\u0004\bP\u00103\"\u0004\bQ\u00105R\"\u0010V\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u00101\u001a\u0004\bT\u00103\"\u0004\bU\u00105R\"\u0010Z\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u00101\u001a\u0004\bX\u00103\"\u0004\bY\u00105R\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\"\u0010m\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u00101\u001a\u0004\bo\u00103\"\u0004\bp\u00105R\"\u0010u\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u00101\u001a\u0004\bs\u00103\"\u0004\bt\u00105R\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010x\u001a\u0005\b\u0087\u0001\u0010z\"\u0005\b\u0088\u0001\u0010|R&\u0010\u008d\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010x\u001a\u0005\b\u008b\u0001\u0010z\"\u0005\b\u008c\u0001\u0010|R)\u0010\u0094\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010\u0098\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010]\u001a\u0005\b\u0096\u0001\u0010_\"\u0005\b\u0097\u0001\u0010aR*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R&\u0010´\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b±\u0001\u0010+\u001a\u0005\b²\u0001\u0010-\"\u0005\b³\u0001\u0010/R*\u0010»\u0001\u001a\u00030µ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u009a\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010¿\u0001\u001a\u00030¼\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010Ã\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ë\u0001\u001a\u00030Ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001¨\u0006Î\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/DLVirtualAlertScreen;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "mDldetobj", "", "y2", "", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "mContext", "Landroid/graphics/Bitmap;", "bitmap", "mText", "o1", "encodedImage", "n1", "QRImg", "appIcon", "S1", "myCodeText", "p1", "context", "message", "z2", "W1", "change_color", "Landroid/widget/TextView;", "textView", "l1", "d1", "m1", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "C", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "r1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "X1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "D", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "D1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "i2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "E", "Landroid/widget/TextView;", "u1", "()Landroid/widget/TextView;", "Z1", "(Landroid/widget/TextView;)V", "dlStatusTxt", "F", "E1", "j2", "ownerName", "G", "K1", "q2", "relationName", "H", "z1", "e2", "issueDate", "I", "P1", "v2", "validTill", "J", "O1", "u2", "transportValididty", "K", "q1", "V1", "bloodGroup", "L", "L1", "r2", "rtoName", "M", "M1", "s2", "rtoNameText", "N", "x1", "c2", "dobText", "Landroid/widget/ImageView;", "O", "Landroid/widget/ImageView;", "F1", "()Landroid/widget/ImageView;", "k2", "(Landroid/widget/ImageView;)V", "owner_image", "P", "I1", "n2", "qrImg", "Q", "Landroid/graphics/Bitmap;", "H1", "()Landroid/graphics/Bitmap;", "m2", "(Landroid/graphics/Bitmap;)V", "qrBmp", "R", "w1", "b2", "dl_text", "S", "R1", "x2", "vehicleClass", "Landroid/widget/LinearLayout;", "T", "Landroid/widget/LinearLayout;", "y1", "()Landroid/widget/LinearLayout;", "d2", "(Landroid/widget/LinearLayout;)V", "img_back", "Lcom/zepto/o45;", "U", "Lcom/zepto/o45;", "getRcImpoundModel", "()Lcom/zepto/o45;", "o2", "(Lcom/zepto/o45;)V", "rcImpoundModel", "V", "Q1", "w2", "valid_licence_linear", "W", "A1", "f2", "ll_valid_till", "X", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "dlNumber", "Y", "J1", "p2", "referesh", "Lcom/zepto/is1;", "Z", "Lcom/zepto/is1;", "C1", "()Lcom/zepto/is1;", "h2", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "a0", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "B1", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "g2", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Landroid/app/ProgressDialog;", "b0", "Landroid/app/ProgressDialog;", "G1", "()Landroid/app/ProgressDialog;", "l2", "(Landroid/app/ProgressDialog;)V", "pDialog", "c0", "v1", "a2", "dl_data", "", "d0", "getFlag", "()Z", "setFlag", "(Z)V", "Flag", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "e0", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "rcImpoundService", "Lcom/zepto/ls1;", "f0", "Lcom/zepto/ls1;", "binding", "Lcom/zepto/wa3;", "g0", "Lcom/zepto/wa3;", "N1", "()Lcom/zepto/wa3;", "t2", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLVirtualAlertScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DldetobjX mDldetobj;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView dlStatusTxt;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView ownerName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView relationName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView issueDate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView validTill;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView transportValididty;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView bloodGroup;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView rtoName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView rtoNameText;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView dobText;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ImageView owner_image;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView qrImg;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public Bitmap qrBmp;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public TextView dl_text;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public TextView vehicleClass;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public LinearLayout img_back;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public o45 rcImpoundModel;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public LinearLayout valid_licence_linear;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public LinearLayout ll_valid_till;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String dlNumber;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ImageView referesh;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public DldetobjX dl_data;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public boolean Flag;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public RcImpoundService rcImpoundService;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public ls1 binding;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends Lambda implements Function1 {
        public a() {
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
        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                DLVirtualAlertScreen.this.G1().dismiss();
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                    DLVirtualAlertScreen dLVirtualAlertScreen = DLVirtualAlertScreen.this;
                    DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(dLVirtualAlertScreen);
                    Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                    dLVirtualAlertScreen.X1(databaseHelperD0);
                    DLVirtualAlertScreen.this.r1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    DLVirtualAlertScreen.this.W1();
                    DLVirtualAlertScreen dLVirtualAlertScreen2 = DLVirtualAlertScreen.this;
                    dLVirtualAlertScreen2.z2(dLVirtualAlertScreen2, dLVirtualAlertScreen2.N1().b(va3.a.j(), "Driving Licence alert successfully updated!"));
                } else {
                    DLVirtualAlertScreen dLVirtualAlertScreen3 = DLVirtualAlertScreen.this;
                    dLVirtualAlertScreen3.z2(dLVirtualAlertScreen3, dLVirtualAlertScreen3.N1().b(va3.a.D(), "Unable to update the Alert, Please try after some time!"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                DLVirtualAlertScreen dLVirtualAlertScreen4 = DLVirtualAlertScreen.this;
                dLVirtualAlertScreen4.z2(dLVirtualAlertScreen4, dLVirtualAlertScreen4.N1().b(va3.a.D(), "Unable to update the Alert, Please try after some time!"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            try {
                DLVirtualAlertScreen.this.G1().dismiss();
                DLVirtualAlertScreen dLVirtualAlertScreen = DLVirtualAlertScreen.this;
                dLVirtualAlertScreen.z2(dLVirtualAlertScreen, dLVirtualAlertScreen.N1().b(va3.a.D(), "Unable to update the Alert, Please try after some time!"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (Intrinsics.areEqual(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                DLVirtualAlertScreen.this.C1().j(StringsKt__StringsKt.trim((CharSequence) DLVirtualAlertScreen.this.v1().getDlobj().getDlLicno().toString()).toString(), k18.a.b(StringsKt__StringsKt.trim((CharSequence) DLVirtualAlertScreen.this.v1().getBioObj().getBioDob().toString()).toString()), DLVirtualAlertScreen.this);
            } else if (DLVirtualAlertScreen.this.G1().isShowing()) {
                DLVirtualAlertScreen.this.G1().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateDocSuccessResponse) obj);
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
            if (DLVirtualAlertScreen.this.G1().isShowing()) {
                DLVirtualAlertScreen.this.G1().dismiss();
            }
            DLVirtualAlertScreen dLVirtualAlertScreen = DLVirtualAlertScreen.this;
            dLVirtualAlertScreen.z2(dLVirtualAlertScreen, dLVirtualAlertScreen.N1().b(va3.a.D(), "Unable to update the Alert, Please try after some time!"));
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    public static final void A2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void T1(DLVirtualAlertScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void U1(DLVirtualAlertScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!com.nic.mparivahan.a.a.a(this$0)) {
                Toast.makeText(this$0, this$0.N1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            this$0.G1().show();
            DldetobjX dldetails = ((DLDocument) this$0.r1().z0().get(0)).getDldetails();
            Intrinsics.checkNotNull(dldetails);
            this$0.a2(dldetails);
            String strB0 = this$0.r1().B0(StringsKt__StringsKt.trim((CharSequence) this$0.v1().getDlobj().getDlLicno()).toString());
            if (strB0.equals("0")) {
                strB0 = this$0.r1().B0(new Regex("\\s").replace(this$0.w1().getText().toString(), ""));
            }
            is1 is1VarC1 = this$0.C1();
            Intrinsics.checkNotNull(strB0);
            is1VarC1.E(strB0, "DL", k18.a.a(StringsKt__StringsKt.trim((CharSequence) this$0.v1().getBioObj().getBioDob()).toString()), this$0);
        } catch (Exception unused) {
            this$0.G1().dismiss();
        }
    }

    public final LinearLayout A1() {
        LinearLayout linearLayout = this.ll_valid_till;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_valid_till");
        return null;
    }

    public final DlService B1() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final is1 C1() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final DldetobjX D1() {
        DldetobjX dldetobjX = this.mDldetobj;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDldetobj");
        return null;
    }

    public final TextView E1() {
        TextView textView = this.ownerName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ownerName");
        return null;
    }

    public final ImageView F1() {
        ImageView imageView = this.owner_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("owner_image");
        return null;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final Bitmap H1() {
        Bitmap bitmap = this.qrBmp;
        if (bitmap != null) {
            return bitmap;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qrBmp");
        return null;
    }

    public final ImageView I1() {
        ImageView imageView = this.qrImg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qrImg");
        return null;
    }

    public final ImageView J1() {
        ImageView imageView = this.referesh;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("referesh");
        return null;
    }

    public final TextView K1() {
        TextView textView = this.relationName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relationName");
        return null;
    }

    public final TextView L1() {
        TextView textView = this.rtoName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final TextView M1() {
        TextView textView = this.rtoNameText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoNameText");
        return null;
    }

    public final wa3 N1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final TextView O1() {
        TextView textView = this.transportValididty;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transportValididty");
        return null;
    }

    public final TextView P1() {
        TextView textView = this.validTill;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("validTill");
        return null;
    }

    public final LinearLayout Q1() {
        LinearLayout linearLayout = this.valid_licence_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valid_licence_linear");
        return null;
    }

    public final TextView R1() {
        TextView textView = this.vehicleClass;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicleClass");
        return null;
    }

    public final Bitmap S1(Bitmap QRImg, Bitmap appIcon) {
        Intrinsics.checkNotNullParameter(QRImg, "QRImg");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(QRImg.getWidth(), QRImg.getHeight(), QRImg.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(QRImg, new Matrix(), null);
        canvas.drawBitmap(appIcon, (QRImg.getWidth() - appIcon.getWidth()) / 2, (QRImg.getHeight() - appIcon.getHeight()) / 2, (Paint) null);
        return bitmapCreateBitmap;
    }

    public final void V1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bloodGroup = textView;
    }

    public final void W1() throws Throwable {
        try {
            DldetobjX dldetobjXY0 = r1().y0();
            Intrinsics.checkNotNullExpressionValue(dldetobjXY0, "getDLDetails(...)");
            i2(dldetobjXY0);
            if (D1().getBioObj().getBioFullName() != null) {
                E1().setText(D1().getBioObj().getBioFullName());
            } else {
                E1().setText("NA");
            }
            if (D1().getBioObj().getBioSwdFullName() != null) {
                K1().setText(D1().getBioObj().getBioSwdFullName());
            } else {
                K1().setText("NA");
            }
            if (D1().getDlobj().getDlIssuedt() != null) {
                z1().setText(k18.a.f(D1().getDlobj().getDlIssuedt().toString()));
            } else {
                z1().setText("NA");
            }
            if (D1().getBioObj().getBioDob() != null) {
                x1().setText(k18.a.f(D1().getBioObj().getBioDob()));
            } else {
                x1().setText("NA");
            }
            if (D1().getBioObj().getBioBloodGroup() != null) {
                q1().setText(D1().getBioObj().getBioBloodGroup());
            } else {
                q1().setText("NA");
            }
            if (D1().getDlobj().getOlacode() != null) {
                L1().setText(D1().getDlobj().getOlacode());
            } else {
                L1().setText("NA");
            }
            if (D1().getDlobj().getOlaName() != null) {
                M1().setText(D1().getDlobj().getOlaName());
            } else {
                M1().setText("NA");
            }
            if (D1().getDlobj().getDlNtValdtoDt() == null) {
                A1().setVisibility(8);
            } else {
                A1().setVisibility(0);
                gd1.a aVar = gd1.a;
                if (aVar.n(D1().getDlobj().getDlNtValdtoDt().toString()) && aVar.f(D1().getDlobj().getDlNtValdtoDt().toString()) && this.Flag) {
                    l1(m1(D1().getDlobj().getDlNtValdtoDt().toString()), P1());
                } else {
                    P1().setText(k18.a.f(D1().getDlobj().getDlNtValdtoDt().toString()));
                }
            }
            if (D1().getDlobj().getDlTrValdtoDt() == null) {
                Q1().setVisibility(8);
            } else {
                Q1().setVisibility(0);
                gd1.a aVar2 = gd1.a;
                if (aVar2.n(String.valueOf(D1().getDlobj().getDlTrValdtoDt())) && aVar2.f(String.valueOf(D1().getDlobj().getDlTrValdtoDt())) && this.Flag) {
                    l1(m1(String.valueOf(D1().getDlobj().getDlTrValdtoDt())), O1());
                } else {
                    O1().setText(k18.a.f(String.valueOf(D1().getDlobj().getDlTrValdtoDt())));
                }
            }
            BioImgObjX bioImgObj = D1().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                F1().setImageResource(R.drawable.ic_no_pic);
            } else {
                ImageView imageViewF1 = F1();
                BioImgObjX bioImgObj2 = D1().getBioImgObj();
                imageViewF1.setImageBitmap(n1(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            if (D1().getDlobj().getDlStatus() != null) {
                if (Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "A") || Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "Active")) {
                    u1().setText("Active");
                    u1().setTextColor(-16711936);
                } else if (Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "V")) {
                    u1().setText("ACTIVE");
                    u1().setTextColor(-16711936);
                } else if (Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "C") || Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "Cancelled")) {
                    u1().setText("Cancelled");
                    u1().setTextColor(-65536);
                } else if (Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "Suspended") || Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "S")) {
                    u1().setText("Suspended");
                    u1().setTextColor(-65536);
                } else if (Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "Rejected") || Intrinsics.areEqual(D1().getDlobj().getDlStatus(), "R")) {
                    u1().setText("Rejected");
                    u1().setTextColor(-65536);
                }
            }
            try {
                String str = "";
                List<Dlcov> dlcovs = D1().getDlcovs();
                int size = dlcovs.size();
                for (int i = 0; i < size; i++) {
                    str = str + dlcovs.get(i).getCovabbrv() + ", ";
                }
                if (!gd1.a.m(str)) {
                    TextView textViewR1 = R1();
                    String strSubstring = StringsKt__StringsKt.trim((CharSequence) str).toString().substring(0, str.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    textViewR1.setText(strSubstring);
                }
            } catch (Exception unused) {
            }
            Y1(D1().getDlobj().getDlLicno());
            w1().setText(t1());
            if (D1() != null) {
                y2(D1());
            }
        } catch (Exception unused2) {
        }
    }

    public final void X1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlNumber = str;
    }

    public final void Z1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlStatusTxt = textView;
    }

    public final void a2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dl_data = dldetobjX;
    }

    public final void b2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dl_text = textView;
    }

    public final void c2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dobText = textView;
    }

    public final void d2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.img_back = linearLayout;
    }

    public final void e2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.issueDate = textView;
    }

    public final void f2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_valid_till = linearLayout;
    }

    public final void g2(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final void h2(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final void i2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.mDldetobj = dldetobjX;
    }

    public final void j2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.ownerName = textView;
    }

    public final void k2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.owner_image = imageView;
    }

    public final void l1(String change_color, TextView textView) {
        Intrinsics.checkNotNullParameter(change_color, "change_color");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expired", true)) {
            textView.setText(change_color);
            textView.setTextColor(yy0.c(this, R.color.danger));
        }
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expiring", true)) {
            textView.setText(change_color);
            textView.setTextColor(yy0.c(this, R.color.vehicle_fit));
        }
    }

    public final void l2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final String m1(String d1) {
        try {
            Date date = new Date();
            Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(d1);
            if (date2.before(date)) {
                return "Expired on " + d1;
            }
            if (!date2.after(date)) {
                return "Expired on " + d1;
            }
            if (gd1.a.k(d1) > 30) {
                return "";
            }
            return "Expiring on " + d1;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return "Expiring on" + d1;
        } catch (Exception e3) {
            e3.printStackTrace();
            return String.valueOf(d1);
        }
    }

    public final void m2(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
        this.qrBmp = bitmap;
    }

    public final Bitmap n1(String encodedImage) {
        try {
            byte[] bArrDecode = Base64.decode(encodedImage, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void n2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.qrImg = imageView;
    }

    public final Bitmap o1(Context mContext, Bitmap bitmap, String mText) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(mText, "mText");
        float f = mContext.getResources().getDisplayMetrics().density;
        Bitmap.Config config = bitmap.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
        Canvas canvas = new Canvas(bitmap.copy(config, true));
        Paint paint = new Paint(1);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setTextSize(7 * f);
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -12303292);
        paint.getTextBounds(mText, 0, mText.length(), new Rect());
        canvas.drawText(mText, bitmap.getWidth() / 5, 10 * f, paint);
        return bitmap;
    }

    public final void o2(o45 o45Var) {
        Intrinsics.checkNotNullParameter(o45Var, "<set-?>");
        this.rcImpoundModel = o45Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        ls1 ls1VarC = ls1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ls1VarC, "inflate(...)");
        this.binding = ls1VarC;
        ls1 ls1Var = null;
        if (ls1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ls1VarC = null;
        }
        setContentView(ls1VarC.b());
        ta3.a aVar = ta3.a;
        ls1 ls1Var2 = this.binding;
        if (ls1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ls1Var2 = null;
        }
        aVar.z0(this, ls1Var2);
        t2(new wa3(this));
        g2(DlService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.dl_status_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Z1((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.driver_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        j2((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.relation_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        q2((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.issue_date_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        e2((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.valid_till_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        v2((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.transport_validity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        u2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.blood_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        V1((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.rto_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        r2((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.rto_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        s2((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.dob_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        c2((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.owner_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        k2((ImageView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.qr_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        n2((ImageView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.dl_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        b2((TextView) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.vehicle_class_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        x2((TextView) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        d2((LinearLayout) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.referesh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        p2((ImageView) viewFindViewById16);
        if (getIntent() != null) {
            this.Flag = getIntent().getBooleanExtra("Flag", false);
        }
        l2(new ProgressDialog(this));
        G1().setMessage("Please wait...");
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        h2((is1) new z(this, new js1(new jp1(B1()))).a(is1.class));
        this.rcImpoundService = RcImpoundService.INSTANCE.a(this);
        RcImpoundService rcImpoundService = this.rcImpoundService;
        if (rcImpoundService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rcImpoundService");
            rcImpoundService = null;
        }
        o2((o45) new z(this, new q45(new p45(rcImpoundService))).a(o45.class));
        y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ub1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLVirtualAlertScreen.T1(this.a, view);
            }
        });
        J1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                DLVirtualAlertScreen.U1(this.a, view);
            }
        });
        C1().n().g(this, new e(new a()));
        C1().o().g(this, new e(new b()));
        View viewFindViewById17 = findViewById(R.id.valid_licence_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        w2((LinearLayout) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.ll_valid_till);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        f2((LinearLayout) viewFindViewById18);
        X1(new DatabaseHelper(this));
        if (this.Flag) {
            ls1 ls1Var3 = this.binding;
            if (ls1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ls1Var = ls1Var3;
            }
            ls1Var.h.setText("DL Details with Alerts");
        }
        W1();
        C1().y().g(this, new e(new c()));
        C1().x().g(this, new e(new d()));
    }

    public final Bitmap p1(String myCodeText) throws oz7 {
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

    public final void p2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.referesh = imageView;
    }

    public final TextView q1() {
        TextView textView = this.bloodGroup;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodGroup");
        return null;
    }

    public final void q2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.relationName = textView;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final void r2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rtoName = textView;
    }

    public final String s1(DldetobjX mDldetobj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            jSONObject.put("dn", t1());
            jSONObject.put("on", mDldetobj.getBioObj().getBioFullName());
            jSONObject.put("fn", mDldetobj.getBioObj().getBioSwdFname());
            jSONObject.put("a1", mDldetobj.getBioObj().getBioPermAdd1());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final void s2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rtoNameText = textView;
    }

    public final String t1() {
        String str = this.dlNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlNumber");
        return null;
    }

    public final void t2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final TextView u1() {
        TextView textView = this.dlStatusTxt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlStatusTxt");
        return null;
    }

    public final void u2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.transportValididty = textView;
    }

    public final DldetobjX v1() {
        DldetobjX dldetobjX = this.dl_data;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_data");
        return null;
    }

    public final void v2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.validTill = textView;
    }

    public final TextView w1() {
        TextView textView = this.dl_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_text");
        return null;
    }

    public final void w2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.valid_licence_linear = linearLayout;
    }

    public final TextView x1() {
        TextView textView = this.dobText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobText");
        return null;
    }

    public final void x2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vehicleClass = textView;
    }

    public final LinearLayout y1() {
        LinearLayout linearLayout = this.img_back;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("img_back");
        return null;
    }

    public final void y2(DldetobjX mDldetobj) {
        try {
            Bitmap bitmapP1 = p1(k.a(s1(mDldetobj), APIController.a().EcQr001()));
            Intrinsics.checkNotNull(bitmapP1);
            m2(bitmapP1);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bc1), 80, 80, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            I1().setImageBitmap(o1(this, S1(H1(), bitmapCreateScaledBitmap), "DL No : " + t1()));
        } catch (Exception unused) {
            Toast.makeText(getApplicationContext(), getString(R.string.qr_generate_failed), 1).show();
        }
    }

    public final TextView z1() {
        TextView textView = this.issueDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("issueDate");
        return null;
    }

    public final void z2(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLVirtualAlertScreen.A2(dialog, view);
            }
        });
        dialog.show();
    }
}
