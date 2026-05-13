package com.nic.mparivahan.VahanServices.AlterationOfVehicle;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.AOVModel;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.ApiMessage;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.VmFuel;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftReponse;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftRequest;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVSaveToDraftService;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVServices;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.ch;
import com.zepto.gd1;
import com.zepto.mf4;
import com.zepto.o;
import com.zepto.p;
import com.zepto.pq;
import com.zepto.q;
import com.zepto.r;
import com.zepto.s;
import com.zepto.t;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.xd6;
import com.zepto.yy0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\br\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\r\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010a\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010T\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\"\u0010e\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010T\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR\"\u0010i\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010T\u001a\u0004\bg\u0010V\"\u0004\bh\u0010XR\"\u0010m\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010T\u001a\u0004\bk\u0010V\"\u0004\bl\u0010XR\"\u0010q\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010u\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010T\u001a\u0004\bs\u0010V\"\u0004\bt\u0010XR\"\u0010y\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010T\u001a\u0004\bw\u0010V\"\u0004\bx\u0010XR\"\u0010}\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010T\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR$\u0010\u0081\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010T\u001a\u0004\b\u007f\u0010V\"\u0005\b\u0080\u0001\u0010XR&\u0010\u0085\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010T\u001a\u0005\b\u0083\u0001\u0010V\"\u0005\b\u0084\u0001\u0010XR&\u0010\u0089\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010T\u001a\u0005\b\u0087\u0001\u0010V\"\u0005\b\u0088\u0001\u0010XR&\u0010\u008d\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010T\u001a\u0005\b\u008b\u0001\u0010V\"\u0005\b\u008c\u0001\u0010XR&\u0010\u0091\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010T\u001a\u0005\b\u008f\u0001\u0010V\"\u0005\b\u0090\u0001\u0010XR&\u0010\u0095\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010T\u001a\u0005\b\u0093\u0001\u0010V\"\u0005\b\u0094\u0001\u0010XR&\u0010\u0099\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010T\u001a\u0005\b\u0097\u0001\u0010V\"\u0005\b\u0098\u0001\u0010XR&\u0010\u009d\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010T\u001a\u0005\b\u009b\u0001\u0010V\"\u0005\b\u009c\u0001\u0010XR&\u0010¡\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010T\u001a\u0005\b\u009f\u0001\u0010V\"\u0005\b \u0001\u0010XR&\u0010¥\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¢\u0001\u0010T\u001a\u0005\b£\u0001\u0010V\"\u0005\b¤\u0001\u0010XR&\u0010©\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¦\u0001\u0010T\u001a\u0005\b§\u0001\u0010V\"\u0005\b¨\u0001\u0010XR&\u0010\u00ad\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bª\u0001\u0010T\u001a\u0005\b«\u0001\u0010V\"\u0005\b¬\u0001\u0010XR&\u0010±\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010T\u001a\u0005\b¯\u0001\u0010V\"\u0005\b°\u0001\u0010XR&\u0010µ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b²\u0001\u0010T\u001a\u0005\b³\u0001\u0010V\"\u0005\b´\u0001\u0010XR&\u0010¹\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¶\u0001\u0010T\u001a\u0005\b·\u0001\u0010V\"\u0005\b¸\u0001\u0010XR&\u0010½\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bº\u0001\u0010T\u001a\u0005\b»\u0001\u0010V\"\u0005\b¼\u0001\u0010XR*\u0010Å\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R&\u0010É\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÆ\u0001\u0010T\u001a\u0005\bÇ\u0001\u0010V\"\u0005\bÈ\u0001\u0010XR&\u0010Í\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÊ\u0001\u0010T\u001a\u0005\bË\u0001\u0010V\"\u0005\bÌ\u0001\u0010XR&\u0010Ñ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÎ\u0001\u0010T\u001a\u0005\bÏ\u0001\u0010V\"\u0005\bÐ\u0001\u0010XR)\u0010×\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010\u0096\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R0\u0010ß\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ø\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R0\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ø\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010Ú\u0001\u001a\u0006\bá\u0001\u0010Ü\u0001\"\u0006\bâ\u0001\u0010Þ\u0001¨\u0006æ\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/VahanAlterationOfVehicle;", "Lcom/zepto/pq;", "", "toString", "t1", "u1", "v1", "", "m2", "", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVModel/VmFuel;", "vmFuel", "fuel", "w1", "(Ljava/util/List;Ljava/lang/Integer;)I", "it", "", "Y2", "onBackPressed", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/ch;", "C", "Lcom/zepto/ch;", "F1", "()Lcom/zepto/ch;", "v2", "(Lcom/zepto/ch;)V", "binding", "Lcom/zepto/t;", "D", "Lcom/zepto/t;", "B1", "()Lcom/zepto/t;", "r2", "(Lcom/zepto/t;)V", "aovDataViewModel", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVServices;", "E", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVServices;", "A1", "()Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVServices;", "q2", "(Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVServices;)V", "aovDataService", "Lcom/zepto/s;", "F", "Lcom/zepto/s;", "D1", "()Lcom/zepto/s;", "t2", "(Lcom/zepto/s;)V", "aovSaveToDraftViewModel", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVSaveToDraftService;", "G", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVSaveToDraftService;", "C1", "()Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVSaveToDraftService;", "s2", "(Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVServices/AOVSaveToDraftService;)V", "aovSaveToDraftService", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "Q1", "()Lcom/zepto/wa3;", "H2", "(Lcom/zepto/wa3;)V", "languageKeySession", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "V1", "()Landroid/app/ProgressDialog;", "M2", "(Landroid/app/ProgressDialog;)V", "pDialog", "J", "Ljava/lang/String;", "G1", "()Ljava/lang/String;", "w2", "(Ljava/lang/String;)V", "body_type", "K", "Y1", "P2", "seating_capacity", "L", "a2", "R2", "standing_capacity", "M", "Z1", "Q2", "sleeper_capacity", "N", "S1", "J2", "no_of_cylinders", "O", "b2", "S2", "unladen_weight", "P", "P1", "G2", "laden_weight", "Q", "O1", "F2", "horse_power", "R", "getFuel_spinner", "C2", "fuel_spinner", "S", "H1", "x2", "color", "T", "g2", "W2", "wheelbase", "U", "I1", "y2", "cubic_capacity", "V", "z1", "p2", "ac_fitted_spinner", "W", "E1", "u2", "audio_fitted_spinner", "X", "f2", "V2", "video_fitted_spinner", "Y", "N1", "E2", "height", "Z", "R1", "I2", "length", "a0", "h2", "X2", "width", "b0", "L1", "B2", "fuelCode", "c0", "J1", "z2", "fitupto", "d0", "K1", "A2", "floorArea", "e0", "M1", "D2", "gcw", "f0", "U1", "L2", "opdt", "g0", "d2", "T2", "vchCat", "h0", "e2", "U2", "vchClass", "i0", "W1", "N2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "j0", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "X1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "k0", "T1", "K2", "off_code", "l0", "y1", "o2", "aadhar_name", "m0", "x1", "n2", "aadhar_address", "n0", "i2", "()Z", "setFaceless", "(Z)V", "isFaceless", "Ljava/util/ArrayList;", "o0", "Ljava/util/ArrayList;", "getVCode", "()Ljava/util/ArrayList;", "setVCode", "(Ljava/util/ArrayList;)V", "vCode", "p0", "c2", "setVDesc", "vDesc", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanAlterationOfVehicle extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ch binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public t aovDataViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public AOVServices aovDataService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public s aovSaveToDraftViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public AOVSaveToDraftService aovSaveToDraftService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String body_type;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String seating_capacity;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String standing_capacity;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String sleeper_capacity;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String no_of_cylinders;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String unladen_weight;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String laden_weight;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String horse_power;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String fuel_spinner;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String color;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String wheelbase;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String cubic_capacity;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String ac_fitted_spinner;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String audio_fitted_spinner;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String video_fitted_spinner;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String height;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String length;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String width;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String fuelCode;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String fitupto;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String floorArea;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String gcw;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String opdt;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String vchCat;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String vchClass;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public ArrayList vCode = new ArrayList();

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public ArrayList vDesc = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(AOVModel aOVModel) {
            try {
                VahanAlterationOfVehicle.this.V1().dismiss();
                ApiMessage apiMessage = aOVModel.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    return;
                }
                VahanAlterationOfVehicle vahanAlterationOfVehicle = VahanAlterationOfVehicle.this;
                vahanAlterationOfVehicle.z2(vahanAlterationOfVehicle.t1(String.valueOf(aOVModel.getData().getOwnerInfo().getFitupto())));
                VahanAlterationOfVehicle vahanAlterationOfVehicle2 = VahanAlterationOfVehicle.this;
                vahanAlterationOfVehicle2.A2(vahanAlterationOfVehicle2.v1(String.valueOf(aOVModel.getData().getOwnerInfo().getFloorarea())));
                VahanAlterationOfVehicle vahanAlterationOfVehicle3 = VahanAlterationOfVehicle.this;
                vahanAlterationOfVehicle3.D2(vahanAlterationOfVehicle3.v1(String.valueOf(aOVModel.getData().getOwnerInfo().getGcw())));
                VahanAlterationOfVehicle.this.L2(String.valueOf(aOVModel.getData().getOwnerInfo().getOpdt()));
                VahanAlterationOfVehicle.this.T2(String.valueOf(aOVModel.getData().getOwnerInfo().getVchcatg()));
                VahanAlterationOfVehicle vahanAlterationOfVehicle4 = VahanAlterationOfVehicle.this;
                vahanAlterationOfVehicle4.U2(vahanAlterationOfVehicle4.v1(String.valueOf(aOVModel.getData().getOwnerInfo().getVhclass())));
                VahanAlterationOfVehicle.this.F1().f.setText(VahanAlterationOfVehicle.this.t1(String.valueOf(aOVModel.getData().getOwnerInfo().getBodytype())));
                VahanAlterationOfVehicle.this.F1().C.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getSeatcap())));
                VahanAlterationOfVehicle.this.F1().E.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getSleepercap())));
                gd1.a aVar = gd1.a;
                if (aVar.m(String.valueOf(aOVModel.getData().getOwnerInfo().getSeatcap()))) {
                    VahanAlterationOfVehicle.this.F1().C.setText("0");
                }
                if (aVar.m(String.valueOf(aOVModel.getData().getOwnerInfo().getSleepercap()))) {
                    VahanAlterationOfVehicle.this.F1().E.setText("0");
                }
                VahanAlterationOfVehicle.this.F1().G.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getStandcap())));
                VahanAlterationOfVehicle.this.F1().w.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getNocyl())));
                VahanAlterationOfVehicle.this.F1().J.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getUnldwt())));
                VahanAlterationOfVehicle.this.F1().s.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getLdwt())));
                VahanAlterationOfVehicle.this.F1().q.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getHp())));
                ArrayList vDesc = VahanAlterationOfVehicle.this.getVDesc();
                vDesc.add(0, "Select Fuel");
                VahanAlterationOfVehicle.this.F1().m.setAdapter((SpinnerAdapter) new xd6(VahanAlterationOfVehicle.this, vDesc));
                VahanAlterationOfVehicle.this.F1().m.setSelection(VahanAlterationOfVehicle.this.w1(aOVModel.getData().getVmFuel(), aOVModel.getData().getOwnerInfo().getFuel()));
                VahanAlterationOfVehicle.this.F1().i.setText(VahanAlterationOfVehicle.this.t1(String.valueOf(aOVModel.getData().getOwnerInfo().getColor())));
                VahanAlterationOfVehicle.this.F1().P.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getWheelbase())));
                VahanAlterationOfVehicle.this.F1().k.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getCubiccap())));
                VahanAlterationOfVehicle.this.m2(String.valueOf(aOVModel.getData().getOwnerInfo().getAcfitted()));
                ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf("Yes", "No");
                if (arrayListArrayListOf != null) {
                    arrayListArrayListOf.add(0, "Select Ac Fitted");
                }
                VahanAlterationOfVehicle.this.F1().b.setAdapter((SpinnerAdapter) new xd6(VahanAlterationOfVehicle.this, arrayListArrayListOf));
                Spinner spinner = VahanAlterationOfVehicle.this.F1().b;
                VahanAlterationOfVehicle vahanAlterationOfVehicle5 = VahanAlterationOfVehicle.this;
                String acfitted = aOVModel.getData().getOwnerInfo().getAcfitted();
                Intrinsics.checkNotNull(acfitted);
                spinner.setSelection(vahanAlterationOfVehicle5.m2(acfitted));
                ArrayList arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf("Yes", "No");
                if (arrayListArrayListOf2 != null) {
                    arrayListArrayListOf2.add(0, "Select Audio Fitted");
                }
                VahanAlterationOfVehicle.this.F1().d.setAdapter((SpinnerAdapter) new xd6(VahanAlterationOfVehicle.this, arrayListArrayListOf2));
                Spinner spinner2 = VahanAlterationOfVehicle.this.F1().d;
                VahanAlterationOfVehicle vahanAlterationOfVehicle6 = VahanAlterationOfVehicle.this;
                String audiofitted = aOVModel.getData().getOwnerInfo().getAudiofitted();
                Intrinsics.checkNotNull(audiofitted);
                spinner2.setSelection(vahanAlterationOfVehicle6.m2(audiofitted));
                ArrayList arrayListArrayListOf3 = CollectionsKt__CollectionsKt.arrayListOf("Yes", "No");
                if (arrayListArrayListOf3 != null) {
                    arrayListArrayListOf3.add(0, "Select Video Fitted");
                }
                VahanAlterationOfVehicle.this.F1().N.setAdapter((SpinnerAdapter) new xd6(VahanAlterationOfVehicle.this, arrayListArrayListOf3));
                Spinner spinner3 = VahanAlterationOfVehicle.this.F1().N;
                VahanAlterationOfVehicle vahanAlterationOfVehicle7 = VahanAlterationOfVehicle.this;
                String videofitted = aOVModel.getData().getOwnerInfo().getVideofitted();
                Intrinsics.checkNotNull(videofitted);
                spinner3.setSelection(vahanAlterationOfVehicle7.m2(videofitted));
                VahanAlterationOfVehicle.this.F1().o.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getHeight())));
                VahanAlterationOfVehicle.this.F1().u.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getLength())));
                VahanAlterationOfVehicle.this.F1().R.setText(VahanAlterationOfVehicle.this.u1(String.valueOf(aOVModel.getData().getOwnerInfo().getWidth())));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AOVModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
            super(1);
        }

        public final void invoke(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strValueOf = String.valueOf(charSequence);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strValueOf.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (Intrinsics.areEqual(strValueOf, upperCase)) {
                return;
            }
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase2 = strValueOf.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            VahanAlterationOfVehicle.this.F1().f.setText(upperCase2);
            VahanAlterationOfVehicle.this.F1().f.setSelection(VahanAlterationOfVehicle.this.F1().f.length());
        }
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strValueOf = String.valueOf(charSequence);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strValueOf.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (Intrinsics.areEqual(strValueOf, upperCase)) {
                return;
            }
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase2 = strValueOf.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            VahanAlterationOfVehicle.this.F1().i.setText(upperCase2);
            VahanAlterationOfVehicle.this.F1().i.setSelection(VahanAlterationOfVehicle.this.F1().i.length());
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            VahanAlterationOfVehicle vahanAlterationOfVehicle = VahanAlterationOfVehicle.this;
            vahanAlterationOfVehicle.C2(vahanAlterationOfVehicle.F1().m.getSelectedItem().toString());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            VahanAlterationOfVehicle vahanAlterationOfVehicle = VahanAlterationOfVehicle.this;
            vahanAlterationOfVehicle.p2(String.valueOf(vahanAlterationOfVehicle.F1().b.getSelectedItem().toString().charAt(0)));
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
            VahanAlterationOfVehicle vahanAlterationOfVehicle = VahanAlterationOfVehicle.this;
            vahanAlterationOfVehicle.u2(String.valueOf(vahanAlterationOfVehicle.F1().d.getSelectedItem().toString().charAt(0)));
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
            VahanAlterationOfVehicle vahanAlterationOfVehicle = VahanAlterationOfVehicle.this;
            vahanAlterationOfVehicle.V2(String.valueOf(vahanAlterationOfVehicle.F1().N.getSelectedItem().toString().charAt(0)));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(AOVSaveToDraftReponse aOVSaveToDraftReponse) {
            VahanAlterationOfVehicle.this.V1().dismiss();
            com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.ApiMessage apiMessage = aOVSaveToDraftReponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                VahanAlterationOfVehicle vahanAlterationOfVehicle = VahanAlterationOfVehicle.this;
                com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.ApiMessage apiMessage2 = aOVSaveToDraftReponse.getApiMessage();
                vahanAlterationOfVehicle.Y2(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
                return;
            }
            Intent intent = new Intent(VahanAlterationOfVehicle.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.ALTERATION_CODE);
            intent.putExtra(VContant.ALTERATION_CODE, aOVSaveToDraftReponse.getData());
            Data data = aOVSaveToDraftReponse.getData();
            intent.putExtra(VContant.APP_NO, data != null ? data.getApplNo() : null);
            intent.putExtra("state_code", VahanAlterationOfVehicle.this.X1().getState_cd());
            intent.putExtra("rc_number", VahanAlterationOfVehicle.this.W1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.ALTERATION_PURPOSE_CODE);
            intent.putExtra("off_code", VahanAlterationOfVehicle.this.T1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanAlterationOfVehicle.this.getIsFaceless());
            intent.putExtra("RC", VahanAlterationOfVehicle.this.W1());
            intent.putExtra("RcDetails", VahanAlterationOfVehicle.this.X1());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanAlterationOfVehicle.this.y1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanAlterationOfVehicle.this.x1());
            VahanAlterationOfVehicle.this.startActivity(intent);
            VahanAlterationOfVehicle.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AOVSaveToDraftReponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanAlterationOfVehicle.this.V1().dismiss();
        }
    }

    public static final class k implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public k(Function1 function) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.av6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAlterationOfVehicle.Z2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAlterationOfVehicle.a3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void j2(VahanAlterationOfVehicle this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.W1());
        intent.putExtra("RcDetails", this$0.X1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
        this$0.startActivity(intent);
    }

    public static final void k2(VahanAlterationOfVehicle this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.Q1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void l2(VahanAlterationOfVehicle this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.F1().f.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterbodyType", this$0.getString(R.string.altVh_PlsEnterbodyType)), 1).show();
            return;
        }
        Editable text2 = this$0.F1().C.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterseatCap", this$0.getString(R.string.altVh_PlsEnterseatCap)), 1).show();
            return;
        }
        Editable text3 = this$0.F1().G.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterstandCap", this$0.getString(R.string.altVh_PlsEnterstandCap)), 1).show();
            return;
        }
        Editable text4 = this$0.F1().E.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlssleeperCap", this$0.getString(R.string.altVh_PlssleeperCap)), 1).show();
            return;
        }
        Editable text5 = this$0.F1().w.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnternoCylnd", this$0.getString(R.string.altVh_PlsEnternoCylnd)), 1).show();
            return;
        }
        Editable text6 = this$0.F1().J.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterUnladenWght", this$0.getString(R.string.altVh_PlsEnterUnladenWght)), 1).show();
            return;
        }
        Editable text7 = this$0.F1().s.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterLadenWght", this$0.getString(R.string.altVh_PlsEnterLadenWght)), 1).show();
            return;
        }
        CharSequence text8 = this$0.F1().q.getText();
        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
        if (text8.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterHorsePower", this$0.getString(R.string.altVh_PlsEnterHorsePower)), 1).show();
            return;
        }
        if (this$0.F1().m.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterFuel", this$0.getString(R.string.altVh_PlsEnterFuel)), 1).show();
            return;
        }
        Editable text9 = this$0.F1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
        if (text9.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterColor", this$0.getString(R.string.altVh_PlsEnterColor)), 1).show();
            return;
        }
        Editable text10 = this$0.F1().P.getText();
        Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
        if (text10.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterWhlbase", this$0.getString(R.string.altVh_PlsEnterWhlbase)), 1).show();
            return;
        }
        Editable text11 = this$0.F1().k.getText();
        Intrinsics.checkNotNullExpressionValue(text11, "getText(...)");
        if (text11.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterCubicCap", this$0.getString(R.string.altVh_PlsEnterCubicCap)), 1).show();
            return;
        }
        if (this$0.F1().b.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterAcFitted", this$0.getString(R.string.altVh_PlsEnterAcFitted)), 1).show();
            return;
        }
        if (this$0.F1().d.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterAudioFitted", this$0.getString(R.string.altVh_PlsEnterAudioFitted)), 1).show();
            return;
        }
        if (this$0.F1().N.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterVideoFitted", this$0.getString(R.string.altVh_PlsEnterVideoFitted)), 1).show();
            return;
        }
        Editable text12 = this$0.F1().o.getText();
        Intrinsics.checkNotNullExpressionValue(text12, "getText(...)");
        if (text12.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterHeigthmm", this$0.getString(R.string.altVh_PlsEnterHeigthmm)), 1).show();
            return;
        }
        Editable text13 = this$0.F1().u.getText();
        Intrinsics.checkNotNullExpressionValue(text13, "getText(...)");
        if (text13.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterLengthmm", this$0.getString(R.string.altVh_PlsEnterLengthmm)), 1).show();
            return;
        }
        Editable text14 = this$0.F1().R.getText();
        Intrinsics.checkNotNullExpressionValue(text14, "getText(...)");
        if (text14.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("altVh_PlsEnterWidthmm", this$0.getString(R.string.altVh_PlsEnterWidthmm)), 1).show();
            return;
        }
        this$0.P2(this$0.F1().C.getText().toString());
        this$0.R2(this$0.F1().G.getText().toString());
        this$0.Q2(this$0.F1().E.getText().toString());
        this$0.J2(this$0.F1().w.getText().toString());
        this$0.S2(this$0.F1().J.getText().toString());
        this$0.G2(this$0.F1().s.getText().toString());
        this$0.F2(this$0.F1().q.getText().toString());
        this$0.x2(this$0.F1().i.getText().toString());
        this$0.W2(this$0.F1().P.getText().toString());
        this$0.y2(this$0.F1().k.getText().toString());
        this$0.p2(String.valueOf(this$0.F1().b.getSelectedItem().toString().charAt(0)));
        this$0.u2(String.valueOf(this$0.F1().d.getSelectedItem().toString().charAt(0)));
        this$0.V2(String.valueOf(this$0.F1().N.getSelectedItem().toString().charAt(0)));
        this$0.E2(this$0.F1().o.getText().toString());
        this$0.I2(this$0.F1().u.getText().toString());
        this$0.X2(this$0.F1().R.getText().toString());
        this$0.w2(this$0.F1().f.getText().toString());
        this$0.F1().m.setOnItemSelectedListener(this$0.new e());
        this$0.F1().b.setOnItemSelectedListener(this$0.new f());
        this$0.F1().d.setOnItemSelectedListener(this$0.new g());
        this$0.F1().N.setOnItemSelectedListener(this$0.new h());
        try {
            AOVSaveToDraftRequest aOVSaveToDraftRequest = new AOVSaveToDraftRequest(this$0.z1().toString(), "", this$0.E1().toString(), this$0.G1(), String.valueOf(this$0.X1().getRc_chasi_no()), this$0.H1(), Double.parseDouble(this$0.I1()), String.valueOf(this$0.X1().getRc_eng_no()), this$0.J1(), Double.parseDouble(this$0.K1()), Double.parseDouble(this$0.L1()), Double.parseDouble(this$0.M1()), Double.parseDouble(this$0.N1()), Double.parseDouble(this$0.O1()), Double.parseDouble(this$0.P1()), Double.parseDouble(this$0.R1()), Double.parseDouble(this$0.S1()), Integer.parseInt(this$0.T1()), this$0.U1(), String.valueOf(this$0.X1().getRc_regn_no()), Double.parseDouble(this$0.Y1()), Double.parseDouble(this$0.Z1()), Double.parseDouble(this$0.a2()), String.valueOf(this$0.X1().getState_cd()), (int) Double.parseDouble(this$0.b2()), this$0.d2(), Integer.parseInt(this$0.e2()), this$0.f2(), Double.parseDouble(this$0.g2()), Double.parseDouble(this$0.h2()));
            this$0.V1().show();
            this$0.D1().g(aOVSaveToDraftRequest);
        } catch (Exception unused) {
        }
    }

    public final AOVServices A1() {
        AOVServices aOVServices = this.aovDataService;
        if (aOVServices != null) {
            return aOVServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aovDataService");
        return null;
    }

    public final void A2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.floorArea = str;
    }

    public final t B1() {
        t tVar = this.aovDataViewModel;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aovDataViewModel");
        return null;
    }

    public final void B2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fuelCode = str;
    }

    public final AOVSaveToDraftService C1() {
        AOVSaveToDraftService aOVSaveToDraftService = this.aovSaveToDraftService;
        if (aOVSaveToDraftService != null) {
            return aOVSaveToDraftService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aovSaveToDraftService");
        return null;
    }

    public final void C2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fuel_spinner = str;
    }

    public final s D1() {
        s sVar = this.aovSaveToDraftViewModel;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aovSaveToDraftViewModel");
        return null;
    }

    public final void D2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gcw = str;
    }

    public final String E1() {
        String str = this.audio_fitted_spinner;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audio_fitted_spinner");
        return null;
    }

    public final void E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.height = str;
    }

    public final ch F1() {
        ch chVar = this.binding;
        if (chVar != null) {
            return chVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void F2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.horse_power = str;
    }

    public final String G1() {
        String str = this.body_type;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("body_type");
        return null;
    }

    public final void G2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.laden_weight = str;
    }

    public final String H1() {
        String str = this.color;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("color");
        return null;
    }

    public final void H2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final String I1() {
        String str = this.cubic_capacity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cubic_capacity");
        return null;
    }

    public final void I2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.length = str;
    }

    public final String J1() {
        String str = this.fitupto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitupto");
        return null;
    }

    public final void J2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.no_of_cylinders = str;
    }

    public final String K1() {
        String str = this.floorArea;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("floorArea");
        return null;
    }

    public final void K2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final String L1() {
        String str = this.fuelCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fuelCode");
        return null;
    }

    public final void L2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.opdt = str;
    }

    public final String M1() {
        String str = this.gcw;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gcw");
        return null;
    }

    public final void M2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final String N1() {
        String str = this.height;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("height");
        return null;
    }

    public final void N2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final String O1() {
        String str = this.horse_power;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("horse_power");
        return null;
    }

    public final void O2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final String P1() {
        String str = this.laden_weight;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("laden_weight");
        return null;
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.seating_capacity = str;
    }

    public final wa3 Q1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleeper_capacity = str;
    }

    public final String R1() {
        String str = this.length;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("length");
        return null;
    }

    public final void R2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.standing_capacity = str;
    }

    public final String S1() {
        String str = this.no_of_cylinders;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("no_of_cylinders");
        return null;
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unladen_weight = str;
    }

    public final String T1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vchCat = str;
    }

    public final String U1() {
        String str = this.opdt;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("opdt");
        return null;
    }

    public final void U2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vchClass = str;
    }

    public final ProgressDialog V1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.video_fitted_spinner = str;
    }

    public final String W1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final void W2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wheelbase = str;
    }

    public final NrvDetails X1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final void X2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.width = str;
    }

    public final String Y1() {
        String str = this.seating_capacity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seating_capacity");
        return null;
    }

    public final String Z1() {
        String str = this.sleeper_capacity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sleeper_capacity");
        return null;
    }

    public final String a2() {
        String str = this.standing_capacity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("standing_capacity");
        return null;
    }

    public final String b2() {
        String str = this.unladen_weight;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unladen_weight");
        return null;
    }

    /* JADX INFO: renamed from: c2, reason: from getter */
    public final ArrayList getVDesc() {
        return this.vDesc;
    }

    public final String d2() {
        String str = this.vchCat;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vchCat");
        return null;
    }

    public final String e2() {
        String str = this.vchClass;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vchClass");
        return null;
    }

    public final String f2() {
        String str = this.video_fitted_spinner;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("video_fitted_spinner");
        return null;
    }

    public final String g2() {
        String str = this.wheelbase;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wheelbase");
        return null;
    }

    public final String h2() {
        String str = this.width;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("width");
        return null;
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final int m2(String toString) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        arrayList.add(0, "Y");
        arrayList.add(1, "N");
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3++;
            if (((String) it.next()).equals(toString)) {
                i2 = i3;
            }
        }
        return i2;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, Q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ch chVarC = ch.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(chVarC, "inflate(...)");
        v2(chVarC);
        setContentView(F1().b());
        getWindow().addFlags(128);
        ta3.a.D(this, F1());
        q2(AOVServices.INSTANCE.a(this));
        s2(AOVSaveToDraftService.INSTANCE.a(this));
        M2(new ProgressDialog(this));
        V1().setCancelable(false);
        V1().setCanceledOnTouchOutside(false);
        H2(new wa3(this));
        V1().setMessage(Q1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        K2(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        o2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        n2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        N2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O2((NrvDetails) serializableExtra);
        F1().L.setText(Q1().b("vehicle_no", "Vehicle No.:") + ' ' + W1());
        F1().M.setText(Q1().b("view_vehicle_details", "View Vehicle Details"));
        F1().M.setPaintFlags(F1().M.getPaintFlags() | 8);
        F1().M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAlterationOfVehicle.j2(this.a, view);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "Yes");
        arrayList.add(1, "No");
        new ArrayList();
        arrayList.add(0, "Y");
        arrayList.add(1, "N");
        H2(new wa3(this));
        Q1().b("altVh_ServiceName", getString(R.string.alteration_of_vehicle));
        F1().I.i.setText(Q1().b("altVh_ServiceName", getString(R.string.alteration_of_vehicle)));
        F1().I.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAlterationOfVehicle.k2(this.a, view);
            }
        });
        r2((t) new z(this, new o(new p(A1()))).a(t.class));
        t2((s) new z(this, new q(new r(C1()))).a(s.class));
        try {
            V1().show();
            B1().i(W1(), T1(), VContant.ALTERATION_PURPOSE_CODE, String.valueOf(X1().getState_cd()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        B1().h().g(this, new k(new a()));
        B1().g().g(this, new k(b.c));
        F1().f.addTextChangedListener(new c());
        F1().i.addTextChangedListener(new d());
        F1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAlterationOfVehicle.l2(this.a, view);
            }
        });
        D1().i().g(this, new k(new i()));
        D1().h().g(this, new k(new j()));
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, Q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ac_fitted_spinner = str;
    }

    public final void q2(AOVServices aOVServices) {
        Intrinsics.checkNotNullParameter(aOVServices, "<set-?>");
        this.aovDataService = aOVServices;
    }

    public final void r2(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.aovDataViewModel = tVar;
    }

    public final void s2(AOVSaveToDraftService aOVSaveToDraftService) {
        Intrinsics.checkNotNullParameter(aOVSaveToDraftService, "<set-?>");
        this.aovSaveToDraftService = aOVSaveToDraftService;
    }

    public final String t1(String toString) {
        return (toString.equals("null") || toString.equals("nul")) ? "" : toString;
    }

    public final void t2(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.aovSaveToDraftViewModel = sVar;
    }

    public final String u1(String toString) {
        return (toString.equals("null") || toString.equals("nul") || gd1.a.m(toString)) ? "0" : toString;
    }

    public final void u2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.audio_fitted_spinner = str;
    }

    public final String v1(String toString) {
        return (toString.equals("null") || toString.equals("nul")) ? "0" : toString;
    }

    public final void v2(ch chVar) {
        Intrinsics.checkNotNullParameter(chVar, "<set-?>");
        this.binding = chVar;
    }

    public final int w1(List vmFuel, Integer fuel) {
        Iterator it = vmFuel.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            VmFuel vmFuel2 = (VmFuel) it.next();
            i3++;
            this.vCode.add(Integer.valueOf(vmFuel2.getCode()));
            this.vDesc.add(vmFuel2.getDescr());
            if (Integer.valueOf(vmFuel2.getCode()).equals(fuel)) {
                B2(String.valueOf(vmFuel2.getCode()));
                i2 = i3;
            }
        }
        return i2;
    }

    public final void w2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.body_type = str;
    }

    public final String x1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final void x2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final String y1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final void y2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cubic_capacity = str;
    }

    public final String z1() {
        String str = this.ac_fitted_spinner;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ac_fitted_spinner");
        return null;
    }

    public final void z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fitupto = str;
    }
}
