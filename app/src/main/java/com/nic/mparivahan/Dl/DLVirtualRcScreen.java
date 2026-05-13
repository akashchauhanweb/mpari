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
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLVirtualRcScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.Dlcov;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ImpoundDlSuccessModel;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.zepto.ey4;
import com.zepto.gd1;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k;
import com.zepto.k18;
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
import com.zepto.ws6;
import com.zepto.x8;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001b\u001a\u00020\u0004H\u0007J\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006J\u001a\u0010\"\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010A\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u00108R\"\u0010E\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\"\u0010I\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u00104\u001a\u0004\bG\u00106\"\u0004\bH\u00108R\"\u0010M\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bK\u00106\"\u0004\bL\u00108R\"\u0010Q\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00104\u001a\u0004\bO\u00106\"\u0004\bP\u00108R\"\u0010U\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00104\u001a\u0004\bS\u00106\"\u0004\bT\u00108R\"\u0010Y\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u00104\u001a\u0004\bW\u00106\"\u0004\bX\u00108R\"\u0010]\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u00104\u001a\u0004\b[\u00106\"\u0004\b\\\u00108R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\"\u0010p\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u00104\u001a\u0004\br\u00106\"\u0004\bs\u00108R\"\u0010x\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u00104\u001a\u0004\bv\u00106\"\u0004\bw\u00108R#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010{\u001a\u0005\b\u008a\u0001\u0010}\"\u0005\b\u008b\u0001\u0010\u007fR&\u0010\u0090\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010{\u001a\u0005\b\u008e\u0001\u0010}\"\u0005\b\u008f\u0001\u0010\u007fR)\u0010\u0097\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010\u009b\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010`\u001a\u0005\b\u0099\u0001\u0010b\"\u0005\b\u009a\u0001\u0010dR*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R&\u0010·\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0001\u0010.\u001a\u0005\bµ\u0001\u00100\"\u0005\b¶\u0001\u00102R*\u0010¾\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010\u009d\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u001a\u0010Â\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001a\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ñ\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/DLVirtualRcScreen;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "mDldetobj", "", "G2", "", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "mContext", "Landroid/graphics/Bitmap;", "bitmap", "mText", "r1", "encodedImage", "q1", "QRImg", "appIcon", "X1", "myCodeText", "s1", "context", "message", "H2", "e2", "change_color", "Landroid/widget/TextView;", "textView", "o1", "d1", "p1", "b2", "mobileNumber", "W1", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "C", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "u1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "f2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "D", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "G1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "q2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "E", "Landroid/widget/TextView;", "x1", "()Landroid/widget/TextView;", "h2", "(Landroid/widget/TextView;)V", "dlStatusTxt", "F", "H1", "r2", "ownerName", "G", "O1", "y2", "relationName", "H", "C1", "m2", "issueDate", "I", "T1", "D2", "validTill", "J", "S1", "C2", "transportValididty", "K", "t1", "d2", "bloodGroup", "L", "P1", "z2", "rtoName", "M", "Q1", "A2", "rtoNameText", "N", "A1", "k2", "dobText", "Landroid/widget/ImageView;", "O", "Landroid/widget/ImageView;", "I1", "()Landroid/widget/ImageView;", "s2", "(Landroid/widget/ImageView;)V", "owner_image", "P", "L1", "v2", "qrImg", "Q", "Landroid/graphics/Bitmap;", "K1", "()Landroid/graphics/Bitmap;", "u2", "(Landroid/graphics/Bitmap;)V", "qrBmp", "R", "z1", "j2", "dl_text", "S", "V1", "F2", "vehicleClass", "Landroid/widget/LinearLayout;", "T", "Landroid/widget/LinearLayout;", "B1", "()Landroid/widget/LinearLayout;", "l2", "(Landroid/widget/LinearLayout;)V", "img_back", "Lcom/zepto/o45;", "U", "Lcom/zepto/o45;", "M1", "()Lcom/zepto/o45;", "w2", "(Lcom/zepto/o45;)V", "rcImpoundModel", "V", "U1", "E2", "valid_licence_linear", "W", "D1", "n2", "ll_valid_till", "X", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "g2", "(Ljava/lang/String;)V", "dlNumber", "Y", "N1", "x2", "referesh", "Lcom/zepto/is1;", "Z", "Lcom/zepto/is1;", "F1", "()Lcom/zepto/is1;", "p2", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "a0", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "E1", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "o2", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Landroid/app/ProgressDialog;", "b0", "Landroid/app/ProgressDialog;", "J1", "()Landroid/app/ProgressDialog;", "t2", "(Landroid/app/ProgressDialog;)V", "pDialog", "c0", "y1", "i2", "dl_data", "", "d0", "getFlag", "()Z", "setFlag", "(Z)V", "Flag", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "e0", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "rcImpoundService", "Lcom/zepto/x8;", "f0", "Lcom/zepto/x8;", "binding", "Lcom/zepto/wa3;", "g0", "Lcom/zepto/wa3;", "R1", "()Lcom/zepto/wa3;", "B2", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLVirtualRcScreen extends pq {

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
    public x8 binding;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ImpoundDlSuccessModel impoundDlSuccessModel) {
            if (DLVirtualRcScreen.this.J1().isShowing()) {
                DLVirtualRcScreen.this.J1().dismiss();
            }
            try {
                int size = impoundDlSuccessModel.getResult().size();
                for (int i = 0; i < size; i++) {
                    if (StringsKt__StringsJVMKt.equals(impoundDlSuccessModel.getResult().get(i).getImpound_type(), "document", true)) {
                        x8 x8Var = DLVirtualRcScreen.this.binding;
                        if (x8Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            x8Var = null;
                        }
                        x8Var.g0.setVisibility(0);
                    }
                    StringsKt__StringsJVMKt.equals(impoundDlSuccessModel.getResult().get(i).getImpound_type(), "vehicle", true);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ImpoundDlSuccessModel) obj);
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
            if (DLVirtualRcScreen.this.J1().isShowing()) {
                DLVirtualRcScreen.this.J1().dismiss();
                x8 x8Var = DLVirtualRcScreen.this.binding;
                if (x8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x8Var = null;
                }
                x8Var.g0.setVisibility(8);
            }
            DLVirtualRcScreen dLVirtualRcScreen = DLVirtualRcScreen.this;
            dLVirtualRcScreen.b2(dLVirtualRcScreen, dLVirtualRcScreen.R1().b(va3.a.O(), "No Vehicle or Seizure Document impound against the searched DL number."));
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
        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                DLVirtualRcScreen.this.J1().dismiss();
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                    DLVirtualRcScreen dLVirtualRcScreen = DLVirtualRcScreen.this;
                    DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(dLVirtualRcScreen);
                    Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                    dLVirtualRcScreen.f2(databaseHelperD0);
                    DLVirtualRcScreen.this.u1().T0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno(), dLServiceResponseModleV1.getDldetobj().get(0));
                    DLVirtualRcScreen.this.e2();
                    DLVirtualRcScreen dLVirtualRcScreen2 = DLVirtualRcScreen.this;
                    dLVirtualRcScreen2.H2(dLVirtualRcScreen2, dLVirtualRcScreen2.R1().b(va3.a.l(), "Virtual DL Successfully Updated!"));
                } else {
                    DLVirtualRcScreen dLVirtualRcScreen3 = DLVirtualRcScreen.this;
                    dLVirtualRcScreen3.H2(dLVirtualRcScreen3, dLVirtualRcScreen3.R1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                DLVirtualRcScreen dLVirtualRcScreen4 = DLVirtualRcScreen.this;
                dLVirtualRcScreen4.H2(dLVirtualRcScreen4, dLVirtualRcScreen4.R1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            try {
                DLVirtualRcScreen.this.J1().dismiss();
                Log.e("Track", "111");
                DLVirtualRcScreen dLVirtualRcScreen = DLVirtualRcScreen.this;
                dLVirtualRcScreen.H2(dLVirtualRcScreen, dLVirtualRcScreen.R1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (Intrinsics.areEqual(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                DLVirtualRcScreen.this.F1().j(StringsKt__StringsKt.trim((CharSequence) DLVirtualRcScreen.this.y1().getDlobj().getDlLicno().toString()).toString(), k18.a.b(StringsKt__StringsKt.trim((CharSequence) DLVirtualRcScreen.this.y1().getBioObj().getBioDob().toString()).toString()), DLVirtualRcScreen.this);
            } else if (DLVirtualRcScreen.this.J1().isShowing()) {
                DLVirtualRcScreen.this.J1().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateDocSuccessResponse) obj);
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
            if (DLVirtualRcScreen.this.J1().isShowing()) {
                DLVirtualRcScreen.this.J1().dismiss();
            }
            DLVirtualRcScreen dLVirtualRcScreen = DLVirtualRcScreen.this;
            dLVirtualRcScreen.H2(dLVirtualRcScreen, dLVirtualRcScreen.R1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
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

    private final void G2(DldetobjX mDldetobj) {
        try {
            Bitmap bitmapS1 = s1(k.a(v1(mDldetobj), APIController.a().EcQr001()));
            Intrinsics.checkNotNull(bitmapS1);
            u2(bitmapS1);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bc1), 80, 80, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            L1().setImageBitmap(r1(this, X1(K1(), bitmapCreateScaledBitmap), "DL No : " + w1()));
        } catch (Exception unused) {
            Toast.makeText(getApplicationContext(), getString(R.string.qr_generate_failed), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Y1(DLVirtualRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Z1(DLVirtualRcScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.J1().isShowing()) {
                this$0.J1().dismiss();
            }
            this$0.J1().show();
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this$0);
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            this$0.f2(databaseHelperD0);
            DldetobjX dldetails = ((DLDocument) this$0.u1().z0().get(0)).getDldetails();
            Intrinsics.checkNotNull(dldetails);
            this$0.i2(dldetails);
            String string = StringsKt__StringsKt.trim((CharSequence) this$0.y1().getDlobj().getDlLicno()).toString();
            String string2 = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(this$0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("did", string2);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            jSONObject.put("dl_no", string);
            this$0.M1().i(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void a2(DLVirtualRcScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (com.nic.mparivahan.a.a.a(this$0)) {
                this$0.J1().show();
                DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this$0);
                Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                this$0.f2(databaseHelperD0);
                DldetobjX dldetails = ((DLDocument) this$0.u1().z0().get(0)).getDldetails();
                Intrinsics.checkNotNull(dldetails);
                this$0.i2(dldetails);
                String strB0 = this$0.u1().B0(StringsKt__StringsKt.trim((CharSequence) this$0.y1().getDlobj().getDlLicno()).toString());
                is1 is1VarF1 = this$0.F1();
                Intrinsics.checkNotNull(strB0);
                is1VarF1.E(strB0, "DL", k18.a.a(StringsKt__StringsKt.trim((CharSequence) this$0.y1().getBioObj().getBioDob()).toString()), this$0);
            } else {
                Toast.makeText(this$0, this$0.getString(R.string.kindly_check_your_internet_connection), 0).show();
            }
        } catch (Exception unused) {
            this$0.J1().dismiss();
        }
    }

    public static final void c2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final String v1(DldetobjX mDldetobj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            jSONObject.put("dn", w1());
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

    public final TextView A1() {
        TextView textView = this.dobText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobText");
        return null;
    }

    public final void A2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rtoNameText = textView;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.img_back;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("img_back");
        return null;
    }

    public final void B2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final TextView C1() {
        TextView textView = this.issueDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("issueDate");
        return null;
    }

    public final void C2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.transportValididty = textView;
    }

    public final LinearLayout D1() {
        LinearLayout linearLayout = this.ll_valid_till;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_valid_till");
        return null;
    }

    public final void D2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.validTill = textView;
    }

    public final DlService E1() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final void E2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.valid_licence_linear = linearLayout;
    }

    public final is1 F1() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final void F2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vehicleClass = textView;
    }

    public final DldetobjX G1() {
        DldetobjX dldetobjX = this.mDldetobj;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDldetobj");
        return null;
    }

    public final TextView H1() {
        TextView textView = this.ownerName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ownerName");
        return null;
    }

    public final void H2(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(R1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(R1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLVirtualRcScreen.I2(dialog, view);
            }
        });
        dialog.show();
    }

    public final ImageView I1() {
        ImageView imageView = this.owner_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("owner_image");
        return null;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final Bitmap K1() {
        Bitmap bitmap = this.qrBmp;
        if (bitmap != null) {
            return bitmap;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qrBmp");
        return null;
    }

    public final ImageView L1() {
        ImageView imageView = this.qrImg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("qrImg");
        return null;
    }

    public final o45 M1() {
        o45 o45Var = this.rcImpoundModel;
        if (o45Var != null) {
            return o45Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcImpoundModel");
        return null;
    }

    public final ImageView N1() {
        ImageView imageView = this.referesh;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("referesh");
        return null;
    }

    public final TextView O1() {
        TextView textView = this.relationName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relationName");
        return null;
    }

    public final TextView P1() {
        TextView textView = this.rtoName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final TextView Q1() {
        TextView textView = this.rtoNameText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoNameText");
        return null;
    }

    public final wa3 R1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final TextView S1() {
        TextView textView = this.transportValididty;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transportValididty");
        return null;
    }

    public final TextView T1() {
        TextView textView = this.validTill;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("validTill");
        return null;
    }

    public final LinearLayout U1() {
        LinearLayout linearLayout = this.valid_licence_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valid_licence_linear");
        return null;
    }

    public final TextView V1() {
        TextView textView = this.vehicleClass;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicleClass");
        return null;
    }

    public final String W1(String mobileNumber) {
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        if (mobileNumber.length() < 10) {
            return "NA";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("******");
        String strSubstring = mobileNumber.substring(mobileNumber.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public final Bitmap X1(Bitmap QRImg, Bitmap appIcon) {
        Intrinsics.checkNotNullParameter(QRImg, "QRImg");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(QRImg.getWidth(), QRImg.getHeight(), QRImg.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(QRImg, new Matrix(), null);
        canvas.drawBitmap(appIcon, (QRImg.getWidth() - appIcon.getWidth()) / 2, (QRImg.getHeight() - appIcon.getHeight()) / 2, (Paint) null);
        return bitmapCreateBitmap;
    }

    public final void b2(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(R1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(R1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ac1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLVirtualRcScreen.c2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void d2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bloodGroup = textView;
    }

    public final void e2() throws Throwable {
        try {
            DldetobjX dldetobjXY0 = u1().y0();
            Intrinsics.checkNotNullExpressionValue(dldetobjXY0, "getDLDetails(...)");
            q2(dldetobjXY0);
            if (G1().getBioObj().getBioFullName() != null) {
                H1().setText(G1().getBioObj().getBioFullName());
            } else {
                H1().setText("NA");
            }
            if (G1().getBioObj().getBioSwdFullName() != null) {
                O1().setText(G1().getBioObj().getBioSwdFullName());
            } else {
                O1().setText("NA");
            }
            gd1.a aVar = gd1.a;
            DlobjX dlobj = G1().getDlobj();
            if (aVar.m(dlobj != null ? dlobj.getDlOldLicno() : null)) {
                x8 x8Var = this.binding;
                if (x8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x8Var = null;
                }
                x8Var.h.setVisibility(8);
            } else {
                x8 x8Var2 = this.binding;
                if (x8Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x8Var2 = null;
                }
                TextView textView = x8Var2.p;
                DlobjX dlobj2 = G1().getDlobj();
                textView.setText(dlobj2 != null ? dlobj2.getDlOldLicno() : null);
            }
            if (G1().getDlobj().getDlIssuedt() != null) {
                C1().setText(k18.a.f(G1().getDlobj().getDlIssuedt().toString()));
            } else {
                C1().setText("NA");
            }
            if (G1().getBioObj().getBioDob() != null) {
                A1().setText(k18.a.f(G1().getBioObj().getBioDob()));
            } else {
                A1().setText("NA");
            }
            if (G1().getBioObj().getBioBloodGroup() != null) {
                t1().setText(StringsKt__StringsKt.trim((CharSequence) G1().getBioObj().getBioBloodGroup()).toString());
            } else {
                t1().setText("NA");
            }
            if (G1().getBioObj().getBioMobileNo() != null) {
                x8 x8Var3 = this.binding;
                if (x8Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x8Var3 = null;
                }
                x8Var3.x.setText(W1(G1().getBioObj().getBioMobileNo()));
            } else {
                x8 x8Var4 = this.binding;
                if (x8Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x8Var4 = null;
                }
                x8Var4.x.setText("NA");
            }
            if (!aVar.m(G1().getDlobj().getOmRtoFullname())) {
                Q1().setText(G1().getDlobj().getOmRtoFullname());
            } else if (!aVar.m(G1().getDlobj().getOlaName())) {
                Q1().setText(G1().getDlobj().getOlaName());
            }
            if (!aVar.m(G1().getDlobj().getOmRtoFullname())) {
                P1().setText(G1().getDlobj().getDlRtoCode());
            }
            if (G1().getDlobj().getDlNtValdtoDt() == null) {
                D1().setVisibility(8);
            } else {
                D1().setVisibility(0);
                if (aVar.n(G1().getDlobj().getDlNtValdtoDt().toString()) && aVar.f(G1().getDlobj().getDlNtValdtoDt().toString()) && this.Flag) {
                    o1(p1(G1().getDlobj().getDlNtValdtoDt().toString()), T1());
                } else {
                    T1().setText(k18.a.f(G1().getDlobj().getDlNtValdtoDt().toString()));
                }
            }
            if (G1().getDlobj().getDlTrValdtoDt() == null) {
                U1().setVisibility(8);
            } else {
                U1().setVisibility(0);
                if (aVar.n(String.valueOf(G1().getDlobj().getDlTrValdtoDt())) && aVar.f(String.valueOf(G1().getDlobj().getDlTrValdtoDt())) && this.Flag) {
                    o1(p1(String.valueOf(G1().getDlobj().getDlTrValdtoDt())), S1());
                } else {
                    S1().setText(k18.a.f(String.valueOf(G1().getDlobj().getDlTrValdtoDt())));
                }
            }
            BioImgObjX bioImgObj = G1().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                I1().setImageResource(R.drawable.ic_no_pic);
            } else {
                ImageView imageViewI1 = I1();
                BioImgObjX bioImgObj2 = G1().getBioImgObj();
                imageViewI1.setImageBitmap(q1(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            if (G1().getDlobj().getDlStatus() != null) {
                if (Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "A") || Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "Active")) {
                    x1().setText("Active");
                    x1().setTextColor(-16711936);
                } else if (Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "V")) {
                    x1().setText("ACTIVE");
                    x1().setTextColor(-16711936);
                } else if (Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "C") || Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "Cancelled")) {
                    x1().setText("Cancelled");
                    x1().setTextColor(-65536);
                } else if (Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "Suspended") || Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "S")) {
                    x1().setText("Suspended");
                    x1().setTextColor(-65536);
                } else if (Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "Rejected") || Intrinsics.areEqual(G1().getDlobj().getDlStatus(), "R")) {
                    x1().setText("Rejected");
                    x1().setTextColor(-65536);
                }
            }
            try {
                String str = "";
                List<Dlcov> dlcovs = G1().getDlcovs();
                int size = dlcovs.size();
                for (int i = 0; i < size; i++) {
                    str = str + dlcovs.get(i).getCovabbrv() + ", ";
                }
                if (!gd1.a.m(str)) {
                    TextView textViewV1 = V1();
                    String strSubstring = StringsKt__StringsKt.trim((CharSequence) str).toString().substring(0, str.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    textViewV1.setText(strSubstring);
                }
            } catch (Exception unused) {
            }
            g2(G1().getDlobj().getDlLicno());
            z1().setText(w1());
            if (G1() != null) {
                G2(G1());
            }
        } catch (Exception unused2) {
        }
    }

    public final void f2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlNumber = str;
    }

    public final void h2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlStatusTxt = textView;
    }

    public final void i2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dl_data = dldetobjX;
    }

    public final void j2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dl_text = textView;
    }

    public final void k2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dobText = textView;
    }

    public final void l2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.img_back = linearLayout;
    }

    public final void m2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.issueDate = textView;
    }

    public final void n2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_valid_till = linearLayout;
    }

    public final void o1(String change_color, TextView textView) {
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

    public final void o2(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        x8 x8VarC = x8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(x8VarC, "inflate(...)");
        this.binding = x8VarC;
        x8 x8Var = null;
        if (x8VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x8VarC = null;
        }
        setContentView(x8VarC.b());
        ta3.a aVar = ta3.a;
        x8 x8Var2 = this.binding;
        if (x8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x8Var2 = null;
        }
        aVar.A0(this, x8Var2);
        B2(new wa3(this));
        o2(DlService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.dl_status_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        h2((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.driver_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        r2((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.relation_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        y2((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.issue_date_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        m2((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.valid_till_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        D2((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.transport_validity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        C2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.blood_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        d2((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.rto_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        z2((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.rto_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        A2((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.dob_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        k2((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.owner_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        s2((ImageView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.qr_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        v2((ImageView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.dl_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        j2((TextView) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.vehicle_class_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        F2((TextView) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        l2((LinearLayout) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.referesh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        x2((ImageView) viewFindViewById16);
        if (getIntent() != null) {
            this.Flag = getIntent().getBooleanExtra("Flag", false);
        }
        t2(new ProgressDialog(this));
        J1().setMessage("Please wait...");
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        p2((is1) new z(this, new js1(new jp1(E1()))).a(is1.class));
        this.rcImpoundService = RcImpoundService.INSTANCE.a(this);
        RcImpoundService rcImpoundService = this.rcImpoundService;
        if (rcImpoundService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rcImpoundService");
            rcImpoundService = null;
        }
        w2((o45) new z(this, new q45(new p45(rcImpoundService))).a(o45.class));
        B1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLVirtualRcScreen.Y1(this.a, view);
            }
        });
        x8 x8Var3 = this.binding;
        if (x8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x8Var3 = null;
        }
        x8Var3.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLVirtualRcScreen.Z1(this.a, view);
            }
        });
        M1().h().g(this, new g(new a()));
        M1().g().g(this, new g(new b()));
        N1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                DLVirtualRcScreen.a2(this.a, view);
            }
        });
        F1().n().g(this, new g(new c()));
        F1().o().g(this, new g(new d()));
        View viewFindViewById17 = findViewById(R.id.valid_licence_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        E2((LinearLayout) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.ll_valid_till);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        n2((LinearLayout) viewFindViewById18);
        f2(new DatabaseHelper(this));
        if (this.Flag) {
            x8 x8Var4 = this.binding;
            if (x8Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                x8Var = x8Var4;
            }
            x8Var.g.setText("DL Details with Alerts");
        }
        e2();
        F1().y().g(this, new g(new e()));
        F1().x().g(this, new g(new f()));
    }

    public final String p1(String d1) {
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

    public final void p2(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final Bitmap q1(String encodedImage) {
        try {
            byte[] bArrDecode = Base64.decode(encodedImage, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void q2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.mDldetobj = dldetobjX;
    }

    public final Bitmap r1(Context mContext, Bitmap bitmap, String mText) {
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

    public final void r2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.ownerName = textView;
    }

    public final Bitmap s1(String myCodeText) throws oz7 {
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

    public final void s2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.owner_image = imageView;
    }

    public final TextView t1() {
        TextView textView = this.bloodGroup;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodGroup");
        return null;
    }

    public final void t2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final DatabaseHelper u1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final void u2(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
        this.qrBmp = bitmap;
    }

    public final void v2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.qrImg = imageView;
    }

    public final String w1() {
        String str = this.dlNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlNumber");
        return null;
    }

    public final void w2(o45 o45Var) {
        Intrinsics.checkNotNullParameter(o45Var, "<set-?>");
        this.rcImpoundModel = o45Var;
    }

    public final TextView x1() {
        TextView textView = this.dlStatusTxt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlStatusTxt");
        return null;
    }

    public final void x2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.referesh = imageView;
    }

    public final DldetobjX y1() {
        DldetobjX dldetobjX = this.dl_data;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_data");
        return null;
    }

    public final void y2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.relationName = textView;
    }

    public final TextView z1() {
        TextView textView = this.dl_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_text");
        return null;
    }

    public final void z2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rtoName = textView;
    }
}
