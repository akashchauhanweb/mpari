package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.SelectedCovDetailsScreen;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.zepto.a02;
import com.zepto.cc2;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qv5;
import com.zepto.qz1;
import com.zepto.t93;
import com.zepto.ta3;
import com.zepto.tz1;
import com.zepto.w01;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wl5;
import com.zepto.zz1;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b°\u0001\u0010±\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0003J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R&\u00103\u001a\u0012\u0012\u0004\u0012\u0002010+j\b\u0012\u0004\u0012\u000201`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00108R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00108R\u0016\u0010C\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00108R\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00108R\u0016\u0010G\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00105R\u0016\u0010I\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00108R\u0016\u0010K\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00108R\u0016\u0010M\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00108R\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020N0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010/R\u0016\u0010R\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00108R\u0016\u0010T\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00108R\u0016\u0010V\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00108R\u0016\u0010W\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00108R\u0016\u0010Y\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00108R\u0016\u0010[\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00108R\u0016\u0010]\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u00108R\u0016\u0010_\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u00108R\u0016\u0010a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00108R\u0016\u0010c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00108R\u0016\u0010e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u00108R\u0016\u0010g\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u00108R\u0016\u0010i\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u00108R\u0016\u0010k\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u00108R\u0016\u0010m\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u00108R\u0016\u0010o\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u00108R\u0016\u0010q\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u00108R\u0016\u0010s\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u00108R\u0016\u0010u\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u00108R\u0016\u0010w\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u00108R\u0016\u0010y\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u00108R\u0016\u0010{\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u00108R\u0016\u0010}\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u00108R\u0016\u0010\u007f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u00108R\u0018\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u00108R\u0018\u0010\u0083\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u00108R\u0018\u0010\u0085\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u00108R\u0018\u0010\u0087\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u00108R\u0018\u0010\u0089\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u00108R\u0018\u0010\u008b\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u00108R\u0018\u0010\u008d\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u00108R\u0018\u0010\u008f\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u00108R\u0018\u0010\u0091\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u00108R\u0018\u0010\u0093\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u00108R\u0018\u0010\u0095\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u00108R\u0018\u0010\u0097\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u00108R\u0018\u0010\u0099\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u00108R\u0018\u0010\u009b\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u00108R\u0018\u0010\u009d\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u00108R\u0018\u0010\u009f\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u00102R\u0018\u0010¡\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u00102R(\u0010§\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b¢\u0001\u0010!\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001¨\u0006²\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/editlearnerlicence/Activity/SelectedCovDetailsScreen;", "Lcom/zepto/pq;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "s1", "C1", "w1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "r1", "I1", "", "id", "", "text", "F1", "v1", "Lcom/zepto/qz1;", "C", "Lcom/zepto/qz1;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "pDialog", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "session", "Lcom/zepto/zz1;", "F", "Lcom/zepto/zz1;", "editLearnerVM", "Lcom/nic/mparivahan/LLServices/editlearnerlicence/Service/EditLearnerServices;", "G", "Lcom/nic/mparivahan/LLServices/editlearnerlicence/Service/EditLearnerServices;", "service", "Ljava/util/ArrayList;", "Lcom/zepto/w01;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "covDetails", "Lcom/zepto/qv5;", "I", "selectedCovList", "J", "Z", "willingToDonate", "K", "Ljava/lang/String;", "licenseFromState", "L", "licenceFromRTO", "M", "jurisdiction", "N", "licenceFromRTOCode", "O", "applicationNo", "P", "reference", "Q", "applDate", "R", "allowNewAddr", "S", "applCatg", "T", "bioId", "U", "allClassOfVehicles", "Lcom/zepto/t93;", "V", "llRefDetails", "W", "applicantFName", "X", "applicantMName", "Y", "applicantLName", "fullName", "a0", "relationship", "b0", "relationFName", "c0", "relationMName", "d0", "relationLName", "e0", "gender", "f0", "dob", "g0", "placeOfBirth", "h0", "countryCd", "i0", "eduQualificationCd", "j0", "bloodGroupCd", "k0", "phoneNo", "l0", "emailId", "m0", "applicantMobileNo", "n0", "emergencyContactNo", "o0", "idMark1", "p0", "idMark2", "q0", "presHouseNo", "r0", "presStreet", "s0", "presLocation", "t0", "presVillageOrTown", "u0", "presSubDistrict", "v0", "presDistrict", "w0", "presState", "x0", "presPincode", "y0", "perHouseNo", "z0", "perStreet", "A0", "perLocation", "B0", "permVillageOrTown", "C0", "perSubDistrict", "D0", "perDistrict", "E0", "perState", "F0", "perPinCode", "G0", "permanentAdd", "H0", "stayMonths", "I0", "stayYears", "J0", "presVillTown", "K0", "premVillTown", "L0", "t1", "()Lcom/zepto/wa3;", "D1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "M0", "Lcom/zepto/wl5;", "u1", "()Lcom/zepto/wl5;", "E1", "(Lcom/zepto/wl5;)V", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SelectedCovDetailsScreen extends pq implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public qz1 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public zz1 editLearnerVM;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public EditLearnerServices service;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean willingToDonate;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public int presVillTown;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public int premVillTown;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean allowNewAddr;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList covDetails = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList selectedCovList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String licenseFromState = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String licenceFromRTO = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String jurisdiction = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String licenceFromRTOCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String applicationNo = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String reference = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String applDate = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String applCatg = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String bioId = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String allClassOfVehicles = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ArrayList llRefDetails = new ArrayList();

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String applicantFName = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String applicantMName = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String applicantLName = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String fullName = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String relationship = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String relationFName = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String relationMName = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String relationLName = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String gender = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String placeOfBirth = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String countryCd = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String eduQualificationCd = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String bloodGroupCd = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String phoneNo = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String emailId = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String applicantMobileNo = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String emergencyContactNo = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String idMark1 = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String idMark2 = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public String permanentAdd = "";

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public String stayMonths = "";

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public String stayYears = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(cc2 cc2Var) {
            ProgressDialog progressDialog = SelectedCovDetailsScreen.this.pDialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog3 = SelectedCovDetailsScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog3 = null;
                }
                if (progressDialog3.isShowing()) {
                    ProgressDialog progressDialog4 = SelectedCovDetailsScreen.this.pDialog;
                    if (progressDialog4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    } else {
                        progressDialog2 = progressDialog4;
                    }
                    progressDialog2.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
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

    public static final void A1(SelectedCovDetailsScreen this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewFindViewById = this$0.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RadioButton radioButton = (RadioButton) viewFindViewById;
        if (Intrinsics.areEqual(radioButton.getText(), "Yes")) {
            this$0.willingToDonate = true;
        } else if (Intrinsics.areEqual(radioButton.getText(), "No")) {
            this$0.willingToDonate = false;
        }
    }

    public static final void B1(SelectedCovDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) EditLearnerAppScreen.class));
        this$0.finish();
    }

    private final void C1() {
        int size = this.covDetails.size();
        int i = 0;
        while (true) {
            qz1 qz1Var = null;
            if (i >= size) {
                break;
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            textView.setId(((w01) this.covDetails.get(i)).d());
            textView.setText(((w01) this.covDetails.get(i)).c());
            linearLayout.addView(textView);
            qz1 qz1Var2 = this.binding;
            if (qz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qz1Var = qz1Var2;
            }
            qz1Var.x.addView(linearLayout);
            i++;
        }
        int size2 = this.selectedCovList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            CheckBox checkBox = new CheckBox(this);
            checkBox.setId(((qv5) this.selectedCovList.get(i2)).c());
            checkBox.setText(((qv5) this.selectedCovList.get(i2)).d());
            checkBox.setChecked(true);
            checkBox.setEnabled(this.selectedCovList.size() != 1);
            if (this.selectedCovList.size() == 1) {
                checkBox.setOnCheckedChangeListener(null);
            } else {
                checkBox.setOnCheckedChangeListener(this);
            }
            linearLayout2.addView(checkBox);
            qz1 qz1Var3 = this.binding;
            if (qz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qz1Var3 = null;
            }
            qz1Var3.D.addView(linearLayout2);
        }
    }

    public static final void G1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void H1(Dialog dialog, SelectedCovDetailsScreen this$0, int i, String text, CompoundButton buttonView, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(buttonView, "$buttonView");
        dialog.dismiss();
        this$0.v1(i, text, buttonView);
    }

    public static final void J1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void s1() {
        this.willingToDonate = getIntent().getBooleanExtra("willingToDonate", false);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("covDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        this.covDetails = parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("selectedCovDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra2);
        this.selectedCovList = parcelableArrayListExtra2;
        String stringExtra = getIntent().getStringExtra("licenseFromState");
        Intrinsics.checkNotNull(stringExtra);
        this.licenseFromState = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("licenceFromRTO");
        Intrinsics.checkNotNull(stringExtra2);
        this.licenceFromRTO = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("jurisdiction");
        Intrinsics.checkNotNull(stringExtra3);
        this.jurisdiction = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("licenceFromRTOCode");
        Intrinsics.checkNotNull(stringExtra4);
        this.licenceFromRTOCode = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicationNo");
        Intrinsics.checkNotNull(stringExtra5);
        this.applicationNo = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        Intrinsics.checkNotNull(stringExtra6);
        this.reference = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("applDate");
        Intrinsics.checkNotNull(stringExtra7);
        this.applDate = stringExtra7;
        this.allowNewAddr = getIntent().getBooleanExtra("allowNewAddr", false);
        String stringExtra8 = getIntent().getStringExtra("applCatg");
        Intrinsics.checkNotNull(stringExtra8);
        this.applCatg = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("bioId");
        Intrinsics.checkNotNull(stringExtra9);
        this.bioId = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("allClassOfVehicles");
        Intrinsics.checkNotNull(stringExtra10);
        this.allClassOfVehicles = stringExtra10;
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("llRefDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra3);
        this.llRefDetails = parcelableArrayListExtra3;
        String stringExtra11 = getIntent().getStringExtra("applicantFName");
        Intrinsics.checkNotNull(stringExtra11);
        this.applicantFName = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("applicantMName");
        Intrinsics.checkNotNull(stringExtra12);
        this.applicantMName = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("applicantLName");
        Intrinsics.checkNotNull(stringExtra13);
        this.applicantLName = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("fullName");
        Intrinsics.checkNotNull(stringExtra14);
        this.fullName = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("relationship");
        Intrinsics.checkNotNull(stringExtra15);
        this.relationship = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("relationFName");
        Intrinsics.checkNotNull(stringExtra16);
        this.relationFName = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("relationMName");
        Intrinsics.checkNotNull(stringExtra17);
        this.relationMName = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("relationLName");
        Intrinsics.checkNotNull(stringExtra18);
        this.relationLName = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("gender");
        Intrinsics.checkNotNull(stringExtra19);
        this.gender = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra20);
        this.dob = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("placeOfBirth");
        Intrinsics.checkNotNull(stringExtra21);
        this.placeOfBirth = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("country");
        Intrinsics.checkNotNull(stringExtra22);
        this.countryCd = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("educationQualification");
        Intrinsics.checkNotNull(stringExtra23);
        this.eduQualificationCd = stringExtra23;
        String stringExtra24 = getIntent().getStringExtra("bloodGroup");
        Intrinsics.checkNotNull(stringExtra24);
        this.bloodGroupCd = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("mobileNo");
        Intrinsics.checkNotNull(stringExtra25);
        this.phoneNo = stringExtra25;
        String stringExtra26 = getIntent().getStringExtra("emailId");
        Intrinsics.checkNotNull(stringExtra26);
        this.emailId = stringExtra26;
        String stringExtra27 = getIntent().getStringExtra("applicantMobileNo");
        Intrinsics.checkNotNull(stringExtra27);
        this.applicantMobileNo = stringExtra27;
        String stringExtra28 = getIntent().getStringExtra("emergencyContactNo");
        Intrinsics.checkNotNull(stringExtra28);
        this.emergencyContactNo = stringExtra28;
        String stringExtra29 = getIntent().getStringExtra("identificationMark1");
        Intrinsics.checkNotNull(stringExtra29);
        this.idMark1 = stringExtra29;
        String stringExtra30 = getIntent().getStringExtra("identificationMark2");
        Intrinsics.checkNotNull(stringExtra30);
        this.idMark2 = stringExtra30;
        String stringExtra31 = getIntent().getStringExtra("presHouseNo");
        Intrinsics.checkNotNull(stringExtra31);
        this.presHouseNo = stringExtra31;
        String stringExtra32 = getIntent().getStringExtra("presStreet");
        Intrinsics.checkNotNull(stringExtra32);
        this.presStreet = stringExtra32;
        String stringExtra33 = getIntent().getStringExtra("presLocation");
        Intrinsics.checkNotNull(stringExtra33);
        this.presLocation = stringExtra33;
        String stringExtra34 = getIntent().getStringExtra("presVillageOrTown");
        Intrinsics.checkNotNull(stringExtra34);
        this.presVillageOrTown = stringExtra34;
        String stringExtra35 = getIntent().getStringExtra("presSubDistrict");
        Intrinsics.checkNotNull(stringExtra35);
        this.presSubDistrict = stringExtra35;
        Log.e("Pre Sub Dist", stringExtra35);
        String stringExtra36 = getIntent().getStringExtra("presDistrict");
        Intrinsics.checkNotNull(stringExtra36);
        this.presDistrict = stringExtra36;
        this.presVillTown = getIntent().getIntExtra("presVillTown", 0);
        String stringExtra37 = getIntent().getStringExtra("presState");
        Intrinsics.checkNotNull(stringExtra37);
        this.presState = stringExtra37;
        String stringExtra38 = getIntent().getStringExtra("presPincode");
        Intrinsics.checkNotNull(stringExtra38);
        this.presPincode = stringExtra38;
        String stringExtra39 = getIntent().getStringExtra("perHouseNo");
        Intrinsics.checkNotNull(stringExtra39);
        this.perHouseNo = stringExtra39;
        String stringExtra40 = getIntent().getStringExtra("perStreet");
        Intrinsics.checkNotNull(stringExtra40);
        this.perStreet = stringExtra40;
        String stringExtra41 = getIntent().getStringExtra("perLocation");
        Intrinsics.checkNotNull(stringExtra41);
        this.perLocation = stringExtra41;
        String stringExtra42 = getIntent().getStringExtra("permVillageOrTown");
        Intrinsics.checkNotNull(stringExtra42);
        this.permVillageOrTown = stringExtra42;
        String stringExtra43 = getIntent().getStringExtra("perSubDistrict");
        Intrinsics.checkNotNull(stringExtra43);
        this.perSubDistrict = stringExtra43;
        String stringExtra44 = getIntent().getStringExtra("perDistrict");
        Intrinsics.checkNotNull(stringExtra44);
        this.perDistrict = stringExtra44;
        String stringExtra45 = getIntent().getStringExtra("perState");
        Intrinsics.checkNotNull(stringExtra45);
        this.perState = stringExtra45;
        String stringExtra46 = getIntent().getStringExtra("perPinCode");
        Intrinsics.checkNotNull(stringExtra46);
        this.perPinCode = stringExtra46;
        String stringExtra47 = getIntent().getStringExtra("stayMonths");
        Intrinsics.checkNotNull(stringExtra47);
        this.stayMonths = stringExtra47;
        String stringExtra48 = getIntent().getStringExtra("stayYears");
        Intrinsics.checkNotNull(stringExtra48);
        this.stayYears = stringExtra48;
        this.premVillTown = getIntent().getIntExtra("premVillTown", 0);
        C1();
        qz1 qz1Var = null;
        if (this.willingToDonate) {
            qz1 qz1Var2 = this.binding;
            if (qz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qz1Var2 = null;
            }
            qz1Var2.B.setChecked(false);
            qz1 qz1Var3 = this.binding;
            if (qz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qz1Var = qz1Var3;
            }
            qz1Var.L.setChecked(true);
            return;
        }
        qz1 qz1Var4 = this.binding;
        if (qz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var4 = null;
        }
        qz1Var4.B.setChecked(true);
        qz1 qz1Var5 = this.binding;
        if (qz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qz1Var = qz1Var5;
        }
        qz1Var.L.setChecked(false);
    }

    private final void w1() {
        this.session = new wa3(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.pDialog = progressDialog;
        wa3 wa3Var = this.session;
        qz1 qz1Var = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        progressDialog.setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.pDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.pDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        qz1 qz1Var2 = this.binding;
        if (qz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var2 = null;
        }
        qz1Var2.z.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedCovDetailsScreen.x1(this.a, view);
            }
        });
        qz1 qz1Var3 = this.binding;
        if (qz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var3 = null;
        }
        qz1Var3.z.f.setText(u1().k());
        qz1 qz1Var4 = this.binding;
        if (qz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var4 = null;
        }
        qz1Var4.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedCovDetailsScreen.y1(this.a, view);
            }
        });
        qz1 qz1Var5 = this.binding;
        if (qz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var5 = null;
        }
        qz1Var5.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedCovDetailsScreen.z1(this.a, view);
            }
        });
        qz1 qz1Var6 = this.binding;
        if (qz1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var6 = null;
        }
        qz1Var6.K.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.nv5
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                SelectedCovDetailsScreen.A1(this.a, radioGroup, i);
            }
        });
        qz1 qz1Var7 = this.binding;
        if (qz1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qz1Var = qz1Var7;
        }
        qz1Var.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ov5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedCovDetailsScreen.B1(this.a, view);
            }
        });
    }

    public static final void x1(SelectedCovDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void y1(SelectedCovDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I1();
    }

    public static final void z1(SelectedCovDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qz1 qz1Var = this$0.binding;
        if (qz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var = null;
        }
        if (qz1Var.F.isChecked()) {
            this$0.r1();
        } else {
            Toast.makeText(this$0, "Please select term & Condition", 0).show();
        }
    }

    public final void D1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void E1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void F1(final int id, final String text, final CompoundButton buttonView) {
        try {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_alert_unselect_vehicle_class);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View viewFindViewById = dialog.findViewById(R.id.tv_title);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView = (MyTextView) viewFindViewById;
            View viewFindViewById2 = dialog.findViewById(R.id.confirmTv);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView2 = (MyTextView) viewFindViewById2;
            myTextView2.setText(t1().b("button_proceed", getString(R.string.proceed)));
            View viewFindViewById3 = dialog.findViewById(R.id.cancelTv);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView3 = (MyTextView) viewFindViewById3;
            myTextView3.setText(t1().b("button_cancel", getString(R.string.cancel)));
            View viewFindViewById4 = dialog.findViewById(R.id.msgTv);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView4 = (MyTextView) viewFindViewById4;
            if (this.selectedCovList.size() > 1) {
                myTextView4.setText(t1().b("sure_to_deselect", "Are you sure you want to deselect the vehicle class?"));
                myTextView2.setVisibility(0);
            } else {
                myTextView4.setText(t1().b("cant_deselect_all_vehicle", "You can't deselect all vehicle class."));
                myTextView2.setVisibility(8);
            }
            myTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectedCovDetailsScreen.G1(dialog, view);
                }
            });
            myTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jv5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectedCovDetailsScreen.H1(dialog, this, id, text, buttonView, view);
                }
            });
            wa3 wa3Var = this.session;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var = null;
            }
            myTextView.setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
            dialog.show();
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setLayout(-1, -2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void I1() {
        try {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_show_vehicle_info);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View viewFindViewById = dialog.findViewById(R.id.txtVehicleExplanation);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ((TextView) viewFindViewById).setText(t1().b("ll_info_explanation", getString(R.string.vehicle_explaination)));
            View viewFindViewById2 = dialog.findViewById(R.id.txtVehicleExplanation1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ((TextView) viewFindViewById2).setText(t1().b("ll_info_non_transport", getString(R.string.non_transport_explaination)));
            View viewFindViewById3 = dialog.findViewById(R.id.txtVehicleExplanation2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ((TextView) viewFindViewById3).setText(t1().b("ll_info_transport", getString(R.string.transport_explaination)));
            View viewFindViewById4 = dialog.findViewById(R.id.txtVehicleExplanation3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ((TextView) viewFindViewById4).setText(t1().b("ll_info_light_motor", getString(R.string.light_vehicle_explaination)));
            View viewFindViewById5 = dialog.findViewById(R.id.txtVehicleExplanation4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            ((TextView) viewFindViewById5).setText(t1().b("ll_info_medium_motor", getString(R.string.medium_vehicle_explaination)));
            View viewFindViewById6 = dialog.findViewById(R.id.txtVehicleExplanation5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            ((TextView) viewFindViewById6).setText(t1().b("ll_info_heavy_motor", getString(R.string.heavy_vehicle_explaination)));
            View viewFindViewById7 = dialog.findViewById(R.id.closeIv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            ((ImageView) viewFindViewById7).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pv5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectedCovDetailsScreen.J1(dialog, view);
                }
            });
            dialog.show();
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setLayout(-1, -2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked || this.selectedCovList.size() <= 1) {
            return;
        }
        Intrinsics.checkNotNull(buttonView);
        F1(buttonView.getId(), buttonView.getText().toString(), buttonView);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qz1 qz1VarX = qz1.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(qz1VarX, "inflate(...)");
        this.binding = qz1VarX;
        zz1 zz1Var = null;
        if (qz1VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1VarX = null;
        }
        setContentView(qz1VarX.m());
        this.service = EditLearnerServices.INSTANCE.a(this);
        ta3.a aVar = ta3.a;
        qz1 qz1Var = this.binding;
        if (qz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var = null;
        }
        aVar.K0(this, qz1Var);
        D1(new wa3(this));
        E1(new wl5(this));
        EditLearnerServices editLearnerServices = this.service;
        if (editLearnerServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            editLearnerServices = null;
        }
        this.editLearnerVM = (zz1) new z(this, new a02(new tz1(editLearnerServices))).a(zz1.class);
        s1();
        w1();
        zz1 zz1Var2 = this.editLearnerVM;
        if (zz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
        } else {
            zz1Var = zz1Var2;
        }
        zz1Var.k().g(this, new b(new a()));
    }

    public final void r1() {
        zz1 zz1Var;
        zz1 zz1Var2;
        try {
            ProgressDialog progressDialog = this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            if (this.llRefDetails.size() <= 0) {
                zz1 zz1Var3 = this.editLearnerVM;
                if (zz1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
                    zz1Var2 = null;
                } else {
                    zz1Var2 = zz1Var3;
                }
                zz1Var2.g(this.licenseFromState, this.licenceFromRTOCode, this.jurisdiction, this.applicantFName, this.applicantMName, this.applicantLName, this.fullName, this.relationship, this.relationFName, this.relationMName, this.relationLName, "", this.gender, this.dob, this.placeOfBirth, this.countryCd, this.eduQualificationCd, this.bloodGroupCd, this.phoneNo, this.applicantMobileNo, this.emailId, this.emergencyContactNo, this.idMark1, this.idMark2, this.applicationNo, this.presState, this.presDistrict, this.presSubDistrict, String.valueOf(this.presVillTown), this.presVillageOrTown, this.presHouseNo, this.presStreet, this.presLocation, this.presPincode, this.perState, this.perDistrict, this.perSubDistrict, String.valueOf(this.premVillTown), this.permVillageOrTown, this.perHouseNo, this.perStreet, this.perLocation, this.perPinCode, this.stayYears, this.stayMonths, this.reference, "", "", "", this.bioId, this.allClassOfVehicles, "", this.selectedCovList, String.valueOf(this.willingToDonate), String.valueOf(this.allowNewAddr), this.applCatg, this.applDate, "");
                return;
            }
            try {
                zz1 zz1Var4 = this.editLearnerVM;
                if (zz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editLearnerVM");
                    zz1Var = null;
                } else {
                    zz1Var = zz1Var4;
                }
                zz1Var.g(this.licenseFromState, this.licenceFromRTOCode, this.jurisdiction, this.applicantFName, this.applicantMName, this.applicantLName, this.fullName, this.relationship, this.relationFName, this.relationMName, this.relationLName, "", this.gender, this.dob, this.placeOfBirth, this.countryCd, this.eduQualificationCd, this.bloodGroupCd, this.phoneNo, this.applicantMobileNo, this.emailId, this.emergencyContactNo, this.idMark1, this.idMark2, this.applicationNo, this.presState, this.presDistrict, this.presSubDistrict, String.valueOf(this.presVillTown), this.presVillageOrTown, this.presHouseNo, this.presStreet, this.presLocation, this.presPincode, this.perState, this.perDistrict, this.perSubDistrict, String.valueOf(this.premVillTown), this.permVillageOrTown, this.perHouseNo, this.perStreet, this.perLocation, this.perPinCode, this.stayYears, this.stayMonths, this.reference, "", ((t93) this.llRefDetails.get(0)).e(), ((t93) this.llRefDetails.get(0)).d(), this.bioId, this.allClassOfVehicles, "", this.selectedCovList, String.valueOf(this.willingToDonate), String.valueOf(this.allowNewAddr), this.applCatg, this.applDate, ((t93) this.llRefDetails.get(0)).c());
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final wa3 t1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final wl5 u1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void v1(int id, String text, CompoundButton buttonView) {
        int size = this.covDetails.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((w01) this.covDetails.get(i2)).d() == id) {
                this.covDetails.remove(i2);
            }
        }
        if (this.selectedCovList.size() > 1) {
            int size2 = this.selectedCovList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (((qv5) this.selectedCovList.get(i)).c() == id) {
                    this.selectedCovList.remove(i);
                    this.covDetails.add(new w01(id, text));
                    break;
                }
                i++;
            }
        }
        qz1 qz1Var = this.binding;
        qz1 qz1Var2 = null;
        if (qz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qz1Var = null;
        }
        qz1Var.D.removeAllViews();
        qz1 qz1Var3 = this.binding;
        if (qz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qz1Var2 = qz1Var3;
        }
        qz1Var2.x.removeAllViews();
        C1();
    }
}
