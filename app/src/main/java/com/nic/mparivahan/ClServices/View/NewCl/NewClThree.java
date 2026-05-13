package com.nic.mparivahan.ClServices.View.NewCl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.NewClPojo;
import com.nic.mparivahan.ClServices.View.NewCl.NewClThree;
import com.nic.mparivahan.R;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wd;
import com.zepto.wl5;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\b¢\u0001\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bé\u0001\u0010ê\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010C\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\"\u0010G\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00106\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\"\u0010K\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00106\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R\"\u0010O\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u00106\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\"\u0010S\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:R\"\u0010W\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R\"\u0010[\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00106\u001a\u0004\bY\u00108\"\u0004\bZ\u0010:R\"\u0010_\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u00106\u001a\u0004\b]\u00108\"\u0004\b^\u0010:R\"\u0010c\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u00106\u001a\u0004\ba\u00108\"\u0004\bb\u0010:R\"\u0010g\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u00106\u001a\u0004\be\u00108\"\u0004\bf\u0010:R\"\u0010k\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u00106\u001a\u0004\bi\u00108\"\u0004\bj\u0010:R\"\u0010o\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u00106\u001a\u0004\bm\u00108\"\u0004\bn\u0010:R\"\u0010s\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u00106\u001a\u0004\bq\u00108\"\u0004\br\u0010:R\"\u0010w\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u00106\u001a\u0004\bu\u00108\"\u0004\bv\u0010:R\"\u0010{\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u00106\u001a\u0004\by\u00108\"\u0004\bz\u0010:R\"\u0010\u007f\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u00106\u001a\u0004\b}\u00108\"\u0004\b~\u0010:R&\u0010\u0083\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u00106\u001a\u0005\b\u0081\u0001\u00108\"\u0005\b\u0082\u0001\u0010:R&\u0010\u0087\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u00106\u001a\u0005\b\u0085\u0001\u00108\"\u0005\b\u0086\u0001\u0010:R(\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u00106\u001a\u0005\b\u0089\u0001\u00108\"\u0005\b\u008a\u0001\u0010:R(\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u00106\u001a\u0005\b\u008d\u0001\u00108\"\u0005\b\u008e\u0001\u0010:R(\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u00106\u001a\u0005\b\u0091\u0001\u00108\"\u0005\b\u0092\u0001\u0010:R(\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u00106\u001a\u0005\b\u0095\u0001\u00108\"\u0005\b\u0096\u0001\u0010:R(\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u00106\u001a\u0005\b\u0099\u0001\u00108\"\u0005\b\u009a\u0001\u0010:R(\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u00106\u001a\u0005\b\u009d\u0001\u00108\"\u0005\b\u009e\u0001\u0010:R(\u0010£\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u00106\u001a\u0005\b¡\u0001\u00108\"\u0005\b¢\u0001\u0010:R(\u0010§\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u00106\u001a\u0005\b¥\u0001\u00108\"\u0005\b¦\u0001\u0010:R(\u0010«\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u00106\u001a\u0005\b©\u0001\u00108\"\u0005\bª\u0001\u0010:R(\u0010¯\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u00106\u001a\u0005\b\u00ad\u0001\u00108\"\u0005\b®\u0001\u0010:R(\u0010³\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u00106\u001a\u0005\b±\u0001\u00108\"\u0005\b²\u0001\u0010:R(\u0010·\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b´\u0001\u00106\u001a\u0005\bµ\u0001\u00108\"\u0005\b¶\u0001\u0010:R(\u0010»\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u00106\u001a\u0005\b¹\u0001\u00108\"\u0005\bº\u0001\u0010:R(\u0010¿\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u00106\u001a\u0005\b½\u0001\u00108\"\u0005\b¾\u0001\u0010:R(\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÀ\u0001\u00106\u001a\u0005\bÁ\u0001\u00108\"\u0005\bÂ\u0001\u0010:R(\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u00106\u001a\u0005\bÅ\u0001\u00108\"\u0005\bÆ\u0001\u0010:R(\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÈ\u0001\u00106\u001a\u0005\bÉ\u0001\u00108\"\u0005\bÊ\u0001\u0010:R(\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÌ\u0001\u00106\u001a\u0005\bÍ\u0001\u00108\"\u0005\bÎ\u0001\u0010:R*\u0010×\u0001\u001a\u00030Ð\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R4\u0010è\u0001\u001a\r á\u0001*\u0005\u0018\u00010à\u00010à\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001¨\u0006ë\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/NewCl/NewClThree;", "Lcom/zepto/pq;", "", "M1", "K1", "", "message", "R1", "", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/wd;", "C", "Lcom/zepto/wd;", "x1", "()Lcom/zepto/wd;", "e2", "(Lcom/zepto/wd;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "A1", "()Landroid/content/Context;", "h2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "k2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "I1", "()Lcom/zepto/wa3;", "r2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "H1", "()Lcom/zepto/wl5;", "q2", "(Lcom/zepto/wl5;)V", "sarathiSession", "H", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "Z1", "(Ljava/lang/String;)V", "clFirstName", "I", "u1", "setClMiddleName", "clMiddleName", "J", "t1", "a2", "clLastName", "K", "w1", "d2", "clRelation", "L", "C1", "l2", "relFirstName", "M", "E1", "n2", "relMiddleName", "N", "D1", "m2", "relLastName", "O", "p1", "U1", "appGender", "P", "o1", "T1", "appDob", "Q", "r1", "X1", "clEdu", "R", "q1", "W1", "clBlood", "S", "getClPhone", "c2", "clPhone", "T", "getClEmail", "Y1", "clEmail", "U", "v1", "b2", "clMobile", "V", "getClAlterMobile", "V1", "clAlterMobile", "W", "getMark1", "i2", "mark1", "X", "getMark2", "j2", "mark2", "Y", "J1", "s2", "state_code", "Z", "F1", "o2", "rto_code", "a0", "G1", "p2", "rto_name", "b0", "getPerHouseNo", "setPerHouseNo", "perHouseNo", "c0", "getPerStreet", "setPerStreet", "perStreet", "d0", "getPerLocation", "setPerLocation", "perLocation", "e0", "getPermVillageOrTown", "setPermVillageOrTown", "permVillageOrTown", "f0", "getPerSubDistrict", "setPerSubDistrict", "perSubDistrict", "g0", "getPerDistrict", "setPerDistrict", "perDistrict", "h0", "getPerState", "setPerState", "perState", "i0", "getPerPinCode", "setPerPinCode", "perPinCode", "j0", "getPresHouseNo", "setPresHouseNo", "presHouseNo", "k0", "getPresStreet", "setPresStreet", "presStreet", "l0", "getPresLocation", "setPresLocation", "presLocation", "m0", "getPresVillageOrTown", "setPresVillageOrTown", "presVillageOrTown", "n0", "getPresSubDistrict", "setPresSubDistrict", "presSubDistrict", "o0", "getPresDistrict", "setPresDistrict", "presDistrict", "p0", "getPresState", "setPresState", "presState", "q0", "getPresPincode", "setPresPincode", "presPincode", "r0", "getPresVillageOrTownName", "setPresVillageOrTownName", "presVillageOrTownName", "s0", "getPermVillageOrTownName", "setPermVillageOrTownName", "permVillageOrTownName", "Lcom/zepto/kl0;", "t0", "Lcom/zepto/kl0;", "y1", "()Lcom/zepto/kl0;", "f2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "u0", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "z1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "g2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "v0", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewClThree extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public wd mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String clFirstName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String clLastName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clRelation;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String relFirstName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String relMiddleName;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String relLastName;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String appGender;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String appDob;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String clEdu;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String clBlood;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String clPhone;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String clEmail;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String clMobile;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String clAlterMobile;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String mark1;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String mark2;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String rto_code;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String rto_name;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String clMiddleName = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String presVillageOrTownName = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String permVillageOrTownName = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public final void a(NewClPojo newClPojo) {
            String str = "Something went wrong,Please try after some time!";
            String strV1 = "service_is_not_present";
            NewClThree.this.B1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(newClPojo.getStatus_code(), "00", true)) {
                    String applicationNo = newClPojo.getNewCLAcknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        NewClThree newClThree = NewClThree.this;
                        newClThree.R1(newClThree.I1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                        str = str;
                    } else {
                        try {
                            Intent intent = new Intent(NewClThree.this, (Class<?>) NewClSubmitScreen.class);
                            intent.putExtra("appNumber", newClPojo.getNewCLAcknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", newClPojo.getNewCLAcknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dobValue", NewClThree.this.o1());
                            intent.putExtra("fatherName", newClPojo.getNewCLAcknowledgement().get(0).getFatherName());
                            intent.putExtra("clName", NewClThree.this.s1() + ' ' + NewClThree.this.getClMiddleName() + ' ' + NewClThree.this.t1());
                            intent.putExtra("stateCode", NewClThree.this.J1());
                            intent.putExtra("rtoCode", NewClThree.this.F1());
                            intent.putExtra("rtoName", NewClThree.this.G1());
                            strV1 = NewClThree.this.v1();
                            intent.putExtra("Mobile_no", strV1);
                            NewClThree.this.startActivity(intent);
                            str = intent;
                        } catch (Exception unused) {
                        }
                    }
                } else if (StringsKt__StringsJVMKt.equals(newClPojo.getStatus_code(), "01", true)) {
                    NewClThree.this.R1(newClPojo.getStatus_desc());
                    str = str;
                } else {
                    NewClThree newClThree2 = NewClThree.this;
                    newClThree2.R1(newClThree2.I1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    str = str;
                }
            } catch (Exception unused2) {
                NewClThree newClThree3 = NewClThree.this;
                newClThree3.R1(newClThree3.I1().b(strV1, str));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NewClPojo) obj);
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

    private final void K1() {
        h2(this);
        r2(new wa3(A1()));
        q2(new wl5(A1()));
        k2(new ProgressDialog(A1()));
        B1().setMessage(I1().b("label_challan_please_wait", getString(R.string.please_wait)));
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        x1().H.g.setText(H1().k());
        g2(ClInter.INSTANCE.a(A1()));
        f2((kl0) new z(this, new sn0(new jl0(z1()))).a(kl0.class));
        s2(String.valueOf(getIntent().getStringExtra("state_code")));
        o2(String.valueOf(getIntent().getStringExtra("rto_code")));
        p2(String.valueOf(getIntent().getStringExtra("rto_name")));
        Z1(String.valueOf(getIntent().getStringExtra("clFirstName")));
        if (StringsKt__StringsJVMKt.equals$default(getIntent().getStringExtra("clMiddleName"), "", false, 2, null)) {
            this.clMiddleName = "";
        } else {
            this.clMiddleName = String.valueOf(getIntent().getStringExtra("clMiddleName"));
        }
        a2(String.valueOf(getIntent().getStringExtra("clLastName")));
        d2(String.valueOf(getIntent().getStringExtra("clRelation")));
        l2(String.valueOf(getIntent().getStringExtra("relFirstName")));
        n2(String.valueOf(getIntent().getStringExtra("relMiddleName")));
        m2(String.valueOf(getIntent().getStringExtra("relLastName")));
        T1(String.valueOf(getIntent().getStringExtra("appDob")));
        X1(String.valueOf(getIntent().getStringExtra("clEdu")));
        W1(String.valueOf(getIntent().getStringExtra("clBlood")));
        c2(String.valueOf(getIntent().getStringExtra("clPhone")));
        Y1(String.valueOf(getIntent().getStringExtra("clEmail")));
        b2(String.valueOf(getIntent().getStringExtra("clMobile")));
        V1(String.valueOf(getIntent().getStringExtra("clAlterMobile")));
        i2(String.valueOf(getIntent().getStringExtra("mark1")));
        j2(String.valueOf(getIntent().getStringExtra("mark2")));
        U1(String.valueOf(getIntent().getStringExtra("appGender")));
        this.presHouseNo = String.valueOf(getIntent().getStringExtra("presHouseNo"));
        this.presStreet = String.valueOf(getIntent().getStringExtra("presStreet"));
        this.presLocation = String.valueOf(getIntent().getStringExtra("presLocation"));
        this.presVillageOrTown = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
        this.presSubDistrict = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
        this.presDistrict = String.valueOf(getIntent().getStringExtra("presDistrict"));
        this.presState = String.valueOf(getIntent().getStringExtra("presState"));
        this.presPincode = String.valueOf(getIntent().getStringExtra("presPincode"));
        this.perHouseNo = String.valueOf(getIntent().getStringExtra("perHouseNo"));
        this.perStreet = String.valueOf(getIntent().getStringExtra("perStreet"));
        this.perLocation = String.valueOf(getIntent().getStringExtra("perLocation"));
        this.permVillageOrTown = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
        this.perSubDistrict = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
        this.perDistrict = String.valueOf(getIntent().getStringExtra("perDistrict"));
        this.perState = String.valueOf(getIntent().getStringExtra("perState"));
        this.perPinCode = String.valueOf(getIntent().getStringExtra("perPinCode"));
        this.presVillageOrTownName = String.valueOf(getIntent().getStringExtra("presVillageOrTownName"));
        this.permVillageOrTownName = String.valueOf(getIntent().getStringExtra("permVillageOrTownName"));
    }

    private final boolean L1() {
        Editable text = x1().C.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, I1().b("enter_institute_name", getString(R.string.enter_institute_name)), 0).show();
            return false;
        }
        if (x1().C.getText().length() < 3) {
            Toast.makeText(this, I1().b("enter_valid_institute_name", getString(R.string.enter_valid_institute_name)), 0).show();
            return false;
        }
        Editable text2 = x1().y.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this, I1().b("enter_certificate_number", getString(R.string.enter_certificate_number)), 0).show();
            return false;
        }
        if (x1().y.getText().length() < 3) {
            Toast.makeText(this, I1().b("enter_valid_certificate_name", getString(R.string.enter_valid_certificate_name)), 0).show();
            return false;
        }
        Editable text3 = x1().E.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, I1().b("place_of_issue", getString(R.string.place_of_issue)), 0).show();
            return false;
        }
        if (x1().E.getText().length() < 3) {
            Toast.makeText(this, I1().b("valid_place_of_issue", getString(R.string.valid_place_of_issue)), 0).show();
            return false;
        }
        CharSequence text4 = x1().G.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this, I1().b("enter_issue_date", getString(R.string.enter_issue_date)), 0).show();
            return false;
        }
        Editable text5 = x1().D.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, I1().b("enter_certification_no", getString(R.string.enter_certification_no)), 0).show();
            return false;
        }
        if (x1().D.getText().length() < 3) {
            Toast.makeText(this, I1().b("valid_cert_number", getString(R.string.valid_cert_number)), 0).show();
            return false;
        }
        Editable text6 = x1().A.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, I1().b("enter_doctor_name", getString(R.string.enter_doctor_name)), 0).show();
            return false;
        }
        if (x1().A.getText().length() < 3) {
            Toast.makeText(this, I1().b("valid_enter_doctor_name", getString(R.string.valid_enter_doctor_name)), 0).show();
            return false;
        }
        Editable text7 = x1().z.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, I1().b("clinic_name", getString(R.string.clinic_name)), 0).show();
            return false;
        }
        if (x1().z.getText().length() < 3) {
            Toast.makeText(this, I1().b("valid_clinic_name", getString(R.string.valid_clinic_name)), 0).show();
            return false;
        }
        if (x1().x.isChecked()) {
            return true;
        }
        Toast.makeText(this, I1().b("confirm_declaration", getString(R.string.confirm_declaration)), 0).show();
        return false;
    }

    private final void M1() {
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.b64
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NewClThree.N1(this.a, datePicker, i, i2, i3);
            }
        };
        x1().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClThree.O1(this.a, onDateSetListener, view);
            }
        });
        x1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClThree.P1(this.a, view);
            }
        });
    }

    public static final void N1(NewClThree this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.x1().G.setText(((String) charSequence) + '-' + ((String) charSequence2) + '-' + ((String) charSequence3));
    }

    public static final void O1(NewClThree this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void P1(NewClThree this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.L1()) {
            try {
                this$0.B1().show();
                kl0 kl0VarY1 = this$0.y1();
                String strJ1 = this$0.J1();
                String strF1 = this$0.F1();
                String str = this$0.presState;
                Intrinsics.checkNotNull(str);
                String str2 = this$0.perState;
                Intrinsics.checkNotNull(str2);
                String str3 = this$0.presDistrict;
                Intrinsics.checkNotNull(str3);
                String str4 = this$0.perDistrict;
                Intrinsics.checkNotNull(str4);
                String str5 = this$0.presSubDistrict;
                Intrinsics.checkNotNull(str5);
                String str6 = this$0.perSubDistrict;
                Intrinsics.checkNotNull(str6);
                String str7 = this$0.presHouseNo;
                Intrinsics.checkNotNull(str7);
                String str8 = this$0.perHouseNo;
                Intrinsics.checkNotNull(str8);
                String str9 = this$0.presStreet;
                Intrinsics.checkNotNull(str9);
                String str10 = this$0.perStreet;
                Intrinsics.checkNotNull(str10);
                String str11 = this$0.presPincode;
                Intrinsics.checkNotNull(str11);
                String str12 = this$0.perPinCode;
                Intrinsics.checkNotNull(str12);
                String str13 = this$0.presVillageOrTown;
                Intrinsics.checkNotNull(str13);
                String str14 = this$0.permVillageOrTown;
                Intrinsics.checkNotNull(str14);
                String str15 = this$0.presVillageOrTownName;
                Intrinsics.checkNotNull(str15);
                String str16 = this$0.permVillageOrTownName;
                Intrinsics.checkNotNull(str16);
                kl0VarY1.u(this$0, strJ1, strF1, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, this$0.s1(), this$0.clMiddleName, this$0.t1(), this$0.w1(), this$0.C1(), this$0.E1(), this$0.D1(), this$0.p1(), this$0.o1(), this$0.r1(), this$0.q1(), this$0.v1());
            } catch (Exception unused) {
            }
        }
    }

    public static final void Q1(NewClThree this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(I1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(I1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClThree.S1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final Context A1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String C1() {
        String str = this.relFirstName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relFirstName");
        return null;
    }

    public final String D1() {
        String str = this.relLastName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relLastName");
        return null;
    }

    public final String E1() {
        String str = this.relMiddleName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relMiddleName");
        return null;
    }

    public final String F1() {
        String str = this.rto_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_code");
        return null;
    }

    public final String G1() {
        String str = this.rto_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_name");
        return null;
    }

    public final wl5 H1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 I1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final String J1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appDob = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appGender = str;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clAlterMobile = str;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clBlood = str;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clEdu = str;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clEmail = str;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clFirstName = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clLastName = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clMobile = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhone = str;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clRelation = str;
    }

    public final void e2(wd wdVar) {
        Intrinsics.checkNotNullParameter(wdVar, "<set-?>");
        this.mBinding = wdVar;
    }

    public final void f2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void g2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void h2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mark1 = str;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mark2 = str;
    }

    public final void k2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relFirstName = str;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relLastName = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relMiddleName = str;
    }

    public final String o1() {
        String str = this.appDob;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appDob");
        return null;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_code = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wd wdVarX = wd.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wdVarX, "inflate(...)");
        e2(wdVarX);
        setContentView(x1().m());
        K1();
        M1();
        ta3.a.x1(this, x1());
        y1().r().g(this, new b(new a()));
        x1().H.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClThree.Q1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.appGender;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appGender");
        return null;
    }

    public final void p2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_name = str;
    }

    public final String q1() {
        String str = this.clBlood;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clBlood");
        return null;
    }

    public final void q2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final String r1() {
        String str = this.clEdu;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clEdu");
        return null;
    }

    public final void r2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String s1() {
        String str = this.clFirstName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clFirstName");
        return null;
    }

    public final void s2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final String t1() {
        String str = this.clLastName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clLastName");
        return null;
    }

    /* JADX INFO: renamed from: u1, reason: from getter */
    public final String getClMiddleName() {
        return this.clMiddleName;
    }

    public final String v1() {
        String str = this.clMobile;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clMobile");
        return null;
    }

    public final String w1() {
        String str = this.clRelation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clRelation");
        return null;
    }

    public final wd x1() {
        wd wdVar = this.mBinding;
        if (wdVar != null) {
            return wdVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final kl0 y1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter z1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }
}
