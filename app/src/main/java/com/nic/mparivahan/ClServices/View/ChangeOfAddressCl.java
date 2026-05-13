package com.nic.mparivahan.ClServices.View;

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
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServices.View.ChangeOfAddressCl;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import com.zepto.c7;
import com.zepto.d86;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.xh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b´\u0001\u0010µ\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u001c\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010L\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR\"\u0010P\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\"\u0010T\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010X\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010?\u001a\u0004\bV\u0010A\"\u0004\bW\u0010CR\"\u0010\\\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010CR\"\u0010h\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010A\"\u0004\bg\u0010CR\u0016\u0010j\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010?R \u0010o\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010l\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR \u0010q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010l\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR \u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010r\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010nR \u0010v\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010r\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010nR \u0010y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010w\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010nR \u0010{\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010w\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010nR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0087\u0001\u001a\u00020|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010~\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0006\b\u0086\u0001\u0010\u0082\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R&\u0010§\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010?\u001a\u0005\b¥\u0001\u0010A\"\u0005\b¦\u0001\u0010CR&\u0010«\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010?\u001a\u0005\b©\u0001\u0010A\"\u0005\bª\u0001\u0010CR&\u0010¯\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010?\u001a\u0005\b\u00ad\u0001\u0010A\"\u0005\b®\u0001\u0010CR&\u0010³\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010?\u001a\u0005\b±\u0001\u0010A\"\u0005\b²\u0001\u0010C¨\u0006¶\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/ChangeOfAddressCl;", "Lcom/zepto/pq;", "", "U2", "C2", "W1", "X1", "", "message", "d3", "E2", "fromWhere", "X2", "Y2", "Z1", "a2", "b2", "c2", "villaOrTown", "h2", "t2", "Z2", "f3", "Landroid/content/Context;", "context", "a3", "", "D2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/c7;", "C", "Lcom/zepto/c7;", "m2", "()Lcom/zepto/c7;", "l3", "(Lcom/zepto/c7;)V", "mBinding", "D", "Landroid/content/Context;", "p2", "()Landroid/content/Context;", "o3", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "r2", "()Landroid/app/ProgressDialog;", "q3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "y2", "()Lcom/zepto/wa3;", "u3", "(Lcom/zepto/wa3;)V", "session", "G", "Ljava/lang/String;", "i2", "()Ljava/lang/String;", "i3", "(Ljava/lang/String;)V", "dlValue", "H", "j2", "j3", "dobValue", "I", "k2", "k3", "fatherName", "J", "e2", "g3", "clName", "K", "f2", "h3", "clPhoto", "L", "v2", "r3", "rtoCode", "M", "z2", "v3", "stateCode", "N", "A2", "w3", "stateName", "O", "q2", "p3", "Mobile_no", "P", "w2", "s3", "rtoName", "Q", "isCurrentOrPermanentAddress", "", "Lcom/nic/mparivahan/dlservices/data/model/DistrictsMasterItem;", "R", "Ljava/util/List;", "mCurrDistList", "S", "mPermDistList", "Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "T", "mCurrTalukaList", "U", "mPermTalukaList", "Lcom/nic/mparivahan/dlservices/data/model/VillageOrTownMasterItem;", "V", "mCurrVillageOrTownList", "W", "mPermVillageOrTownList", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "X", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "u2", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "Y", "s2", "setPermanentAdd", "permanentAdd", "Lcom/zepto/xh0;", "Z", "Lcom/zepto/xh0;", "viewModel", "Lcom/zepto/kl0;", "a0", "Lcom/zepto/kl0;", "n2", "()Lcom/zepto/kl0;", "m3", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "b0", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "o2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "n3", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Lcom/zepto/wl5;", "c0", "Lcom/zepto/wl5;", "x2", "()Lcom/zepto/wl5;", "t3", "(Lcom/zepto/wl5;)V", "sarathiSession", "d0", "d2", "setAddress", "address", "e0", "l2", "setIssuing_authority", "issuing_authority", "f0", "B2", "setValidity", "validity", "g0", "g2", "setCl_Status", "cl_Status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeOfAddressCl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeOfAddressCl.kt\ncom/nic/mparivahan/ClServices/View/ChangeOfAddressCl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1165:1\n1855#2,2:1166\n1855#2,2:1168\n1855#2,2:1170\n1855#2,2:1172\n1855#2,2:1174\n1855#2,2:1176\n1855#2,2:1178\n*S KotlinDebug\n*F\n+ 1 ChangeOfAddressCl.kt\ncom/nic/mparivahan/ClServices/View/ChangeOfAddressCl\n*L\n679#1:1166,2\n734#1:1168,2\n736#1:1170,2\n790#1:1172,2\n794#1:1174,2\n946#1:1176,2\n948#1:1178,2\n*E\n"})
public final class ChangeOfAddressCl extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public c7 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String stateName;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public List mCurrDistList;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public List mPermDistList;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public List mCurrTalukaList;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public List mPermTalukaList;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public List mCurrVillageOrTownList;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public List mPermVillageOrTownList;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public xh0 viewModel;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String isCurrentOrPermanentAddress = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String cl_Status = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DistResponse distResponse) {
            try {
                ChangeOfAddressCl.this.r2().dismiss();
                if (Intrinsics.areEqual(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    ChangeOfAddressCl.this.mCurrDistList = distResponse.getDistMaster();
                    ChangeOfAddressCl.this.mPermDistList = distResponse.getDistMaster();
                } else {
                    ChangeOfAddressCl changeOfAddressCl = ChangeOfAddressCl.this;
                    changeOfAddressCl.d3(changeOfAddressCl.y2().b("no_details", ChangeOfAddressCl.this.getString(R.string.unable_to_get_details)));
                }
            } catch (Exception unused) {
                ChangeOfAddressCl changeOfAddressCl2 = ChangeOfAddressCl.this;
                changeOfAddressCl2.d3(changeOfAddressCl2.y2().b("service_is_not_present", ChangeOfAddressCl.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DistResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(TalukaResponse talukaResponse) {
            try {
                ChangeOfAddressCl.this.r2().dismiss();
                if (!Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "01")) {
                        ChangeOfAddressCl changeOfAddressCl = ChangeOfAddressCl.this;
                        changeOfAddressCl.d3(changeOfAddressCl.y2().b("no_taluka_found", ""));
                    } else {
                        ChangeOfAddressCl changeOfAddressCl2 = ChangeOfAddressCl.this;
                        changeOfAddressCl2.d3(changeOfAddressCl2.y2().b("no_details", ChangeOfAddressCl.this.getString(R.string.unable_to_get_details)));
                    }
                } else if (Intrinsics.areEqual(ChangeOfAddressCl.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    ChangeOfAddressCl.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                } else {
                    ChangeOfAddressCl.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                ChangeOfAddressCl changeOfAddressCl3 = ChangeOfAddressCl.this;
                changeOfAddressCl3.d3(changeOfAddressCl3.y2().b("service_is_not_present", ChangeOfAddressCl.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TalukaResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(VillageOrTownResponse villageOrTownResponse) {
            try {
                ChangeOfAddressCl.this.r2().dismiss();
                if (Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(ChangeOfAddressCl.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                        ChangeOfAddressCl.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                        return;
                    } else {
                        ChangeOfAddressCl.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                        return;
                    }
                }
                if (Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "01")) {
                    ChangeOfAddressCl.this.d3("No Taluka / Block found for selected District");
                } else {
                    ChangeOfAddressCl.this.d3("No Village/Town found for selected Taluka/Block");
                }
            } catch (Exception unused) {
                ChangeOfAddressCl changeOfAddressCl = ChangeOfAddressCl.this;
                changeOfAddressCl.d3(changeOfAddressCl.y2().b("service_is_not_present", ChangeOfAddressCl.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VillageOrTownResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
        public final void a(ServiceSubmitResponse serviceSubmitResponse) {
            String str = "Something went wrong,Please try after some time!";
            String cl_Status = "service_is_not_present";
            Log.d("addResponse", serviceSubmitResponse.toString());
            try {
                if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        ChangeOfAddressCl changeOfAddressCl = ChangeOfAddressCl.this;
                        changeOfAddressCl.d3(changeOfAddressCl.y2().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                        str = str;
                    } else {
                        try {
                            Intent intent = new Intent(ChangeOfAddressCl.this, (Class<?>) ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", ChangeOfAddressCl.this.i2());
                            intent.putExtra("dobValue", ChangeOfAddressCl.this.j2());
                            intent.putExtra("fatherName", ChangeOfAddressCl.this.k2());
                            intent.putExtra("clName", ChangeOfAddressCl.this.e2());
                            intent.putExtra("clPhoto", ChangeOfAddressCl.this.f2());
                            intent.putExtra("stateCode", ChangeOfAddressCl.this.z2());
                            intent.putExtra("rtoCode", ChangeOfAddressCl.this.v2());
                            intent.putExtra("rtoName", ChangeOfAddressCl.this.w2());
                            intent.putExtra("Mobile_no", ChangeOfAddressCl.this.q2());
                            intent.putExtra("address", ChangeOfAddressCl.this.getAddress()).toString();
                            intent.putExtra("issuing_authority", ChangeOfAddressCl.this.getIssuing_authority()).toString();
                            intent.putExtra("validity", ChangeOfAddressCl.this.getValidity()).toString();
                            cl_Status = ChangeOfAddressCl.this.getCl_Status();
                            intent.putExtra("cl_Status", cl_Status).toString();
                            ChangeOfAddressCl.this.startActivity(intent);
                            str = intent;
                        } catch (Exception unused) {
                        }
                    }
                } else if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    ChangeOfAddressCl.this.d3(serviceSubmitResponse.getStatus_desc());
                    str = str;
                } else {
                    ChangeOfAddressCl changeOfAddressCl2 = ChangeOfAddressCl.this;
                    changeOfAddressCl2.d3(changeOfAddressCl2.y2().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    str = str;
                }
            } catch (Exception unused2) {
                ChangeOfAddressCl changeOfAddressCl3 = ChangeOfAddressCl.this;
                changeOfAddressCl3.d3(changeOfAddressCl3.y2().b(cl_Status, str));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ServiceSubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements d86.b {
        public e() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            DistrictsMasterItem districtsMasterItem;
            DistrictsMasterItem districtsMasterItem2;
            String str2 = ChangeOfAddressCl.this.isCurrentOrPermanentAddress;
            xh0 xh0Var = null;
            if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                List list = ChangeOfAddressCl.this.mCurrDistList;
                String distCode = (list == null || (districtsMasterItem2 = (DistrictsMasterItem) list.get(i)) == null) ? null : districtsMasterItem2.getDistCode();
                ChangeOfAddressCl.this.m2().x.setText(str);
                ChangeOfAddressCl.this.m2().x.setContentDescription(distCode);
                ChangeOfAddressCl.this.getPresentAdd().setDistrict(distCode);
                ChangeOfAddressCl.this.Z1();
                if (distCode != null) {
                    ChangeOfAddressCl changeOfAddressCl = ChangeOfAddressCl.this;
                    changeOfAddressCl.r2().dismiss();
                    xh0 xh0Var2 = changeOfAddressCl.viewModel;
                    if (xh0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var2;
                    }
                    xh0Var.n(changeOfAddressCl.z2(), distCode);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                List list2 = ChangeOfAddressCl.this.mPermDistList;
                String distCode2 = (list2 == null || (districtsMasterItem = (DistrictsMasterItem) list2.get(i)) == null) ? null : districtsMasterItem.getDistCode();
                ChangeOfAddressCl.this.m2().E.setText(str);
                ChangeOfAddressCl.this.m2().E.setContentDescription(distCode2);
                ChangeOfAddressCl.this.getPermanentAdd().setDistrict(distCode2);
                ChangeOfAddressCl.this.b2();
                if (distCode2 != null) {
                    ChangeOfAddressCl changeOfAddressCl2 = ChangeOfAddressCl.this;
                    changeOfAddressCl2.r2().dismiss();
                    xh0 xh0Var3 = changeOfAddressCl2.viewModel;
                    if (xh0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var3;
                    }
                    xh0Var.n(changeOfAddressCl2.z2(), distCode2);
                }
            }
        }
    }

    public static final class f implements d86.b {
        public final /* synthetic */ Ref.ObjectRef b;

        public f(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            String subDistcode = null;
            if (Intrinsics.areEqual(ChangeOfAddressCl.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = ChangeOfAddressCl.this.mCurrTalukaList;
                if (list != null && (talukaMasterItem2 = (TalukaMasterItem) list.get(i)) != null) {
                    subDistcode = talukaMasterItem2.getSubDistcode();
                }
                ChangeOfAddressCl.this.m2().w.setText(str);
                ChangeOfAddressCl.this.m2().w.setContentDescription(subDistcode);
                ChangeOfAddressCl.this.getPresentAdd().setSubDistrict(subDistcode);
                ChangeOfAddressCl.this.h2((String) this.b.element);
                ChangeOfAddressCl.this.m2().M.setText(((Object) ChangeOfAddressCl.this.m2().w.getText()) + ", " + ((Object) ChangeOfAddressCl.this.m2().x.getText()) + ", " + ((Object) ChangeOfAddressCl.this.m2().y.getText()));
                return;
            }
            List list2 = ChangeOfAddressCl.this.mPermTalukaList;
            if (list2 != null && (talukaMasterItem = (TalukaMasterItem) list2.get(i)) != null) {
                subDistcode = talukaMasterItem.getSubDistcode();
            }
            ChangeOfAddressCl.this.m2().D.setText(str);
            ChangeOfAddressCl.this.m2().D.setContentDescription(subDistcode);
            ChangeOfAddressCl.this.getPermanentAdd().setSubDistrict(subDistcode);
            ChangeOfAddressCl.this.t2((String) this.b.element);
            ChangeOfAddressCl.this.m2().A.setText(((Object) ChangeOfAddressCl.this.m2().D.getText()) + ", " + ((Object) ChangeOfAddressCl.this.m2().E.getText()) + ", " + ((Object) ChangeOfAddressCl.this.m2().F.getText()));
        }
    }

    public static final class g implements d86.b {
        public g() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            String villageCode = null;
            if (Intrinsics.areEqual(ChangeOfAddressCl.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = ChangeOfAddressCl.this.mCurrVillageOrTownList;
                if (list != null && (villageOrTownMasterItem2 = (VillageOrTownMasterItem) list.get(i)) != null) {
                    villageCode = villageOrTownMasterItem2.getVillageCode();
                }
                ChangeOfAddressCl.this.m2().L.setText(str);
                ChangeOfAddressCl.this.m2().L.setContentDescription(villageCode);
                ChangeOfAddressCl.this.getPresentAdd().setVillageOrTown(villageCode);
                return;
            }
            List list2 = ChangeOfAddressCl.this.mPermVillageOrTownList;
            if (list2 != null && (villageOrTownMasterItem = (VillageOrTownMasterItem) list2.get(i)) != null) {
                villageCode = villageOrTownMasterItem.getVillageCode();
            }
            ChangeOfAddressCl.this.m2().G.setText(str);
            ChangeOfAddressCl.this.m2().G.setContentDescription(villageCode);
            ChangeOfAddressCl.this.getPermanentAdd().setVillageOrTown(villageCode);
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    private final void C2() {
        c7 c7VarX = c7.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c7VarX, "inflate(...)");
        l3(c7VarX);
        setContentView(m2().m());
        o3(this);
        u3(new wa3(p2()));
        t3(new wl5(p2()));
        q3(new ProgressDialog(p2()));
        r2().setMessage(y2().b("label_challan_please_wait", getString(R.string.please_wait)));
        r2().setCancelable(false);
        r2().setCanceledOnTouchOutside(false);
        try {
            j3(String.valueOf(getIntent().getStringExtra("dobValue")));
            i3(String.valueOf(getIntent().getStringExtra("dlValue")));
            k3(String.valueOf(getIntent().getStringExtra("fatherName")));
            g3(String.valueOf(getIntent().getStringExtra("clName")));
            h3(String.valueOf(getIntent().getStringExtra("clPhoto")));
            r3(String.valueOf(getIntent().getStringExtra("rtoCode")));
            s3(String.valueOf(getIntent().getStringExtra("rtoName")));
            v3(String.valueOf(getIntent().getStringExtra("stateCode")));
            w3(String.valueOf(getIntent().getStringExtra("stateName")));
            p3(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            m2().y.setText(A2());
            m2().F.setText(A2());
            m2().j0.setText(y2().b("CL_NO", "CL No.") + ' ' + i2());
            m2().W.g.setText(x2().k());
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
            String strF2 = f2();
            if (strF2 == null || strF2.length() == 0) {
                m2().W.f.setVisibility(8);
            } else {
                m2().W.f.setVisibility(0);
                m2().W.b.setImageBitmap(kt6.a(f2()));
            }
        } catch (Exception unused) {
        }
        n3(ClInter.INSTANCE.a(p2()));
        m3((kl0) new z(this, new sn0(new jl0(o2()))).a(kl0.class));
    }

    public static final void F2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Y2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void G2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Z2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void H2(ChangeOfAddressCl this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        if (i == R.id.town_rb) {
            this$0.h2("U");
        } else {
            if (i != R.id.village_rb) {
                return;
            }
            this$0.h2("R");
        }
    }

    public static final void I2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            return;
        }
        Toast.makeText(this$0.p2(), "Please Check Your Internet connection", 1).show();
    }

    public static final void J2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.X2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void K2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Y2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void L2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Z2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void M2(ChangeOfAddressCl this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mPermTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        switch (i) {
            case R.id.dl_permanent_town_rb /* 2131362708 */:
                this$0.t2("U");
                break;
            case R.id.dl_permanent_village_rb /* 2131362709 */:
                this$0.t2("R");
                break;
        }
    }

    public static final void N2(ChangeOfAddressCl this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (z) {
                this$0.f3();
                this$0.m2().F.setEnabled(false);
                this$0.m2().E.setEnabled(false);
                this$0.m2().D.setEnabled(false);
                this$0.m2().G.setEnabled(false);
                this$0.m2().A.setEnabled(false);
                this$0.m2().z.setEnabled(false);
                this$0.m2().C.setEnabled(false);
                this$0.m2().B.setEnabled(false);
            } else {
                this$0.m2().F.setEnabled(true);
                this$0.m2().E.setEnabled(true);
                this$0.m2().D.setEnabled(true);
                this$0.m2().G.setEnabled(true);
                this$0.m2().A.setEnabled(true);
                this$0.m2().z.setEnabled(true);
                this$0.m2().C.setEnabled(true);
                this$0.m2().B.setEnabled(true);
                this$0.permanentAdd = new DlAddress("", "", "", "", "", "", "", "");
                this$0.m2().E.setText("");
                this$0.m2().D.setText("");
                this$0.m2().G.setText("");
                this$0.m2().A.setText("");
                this$0.m2().z.setText("");
                this$0.m2().C.setText("");
                this$0.m2().B.setText("");
            }
            this$0.m2().z(this$0.permanentAdd);
            this$0.m2().a();
        } catch (Exception unused) {
        }
    }

    public static final void O2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", this$0.i2());
            intent.putExtra("dobValue", this$0.j2());
            intent.putExtra("fatherName", this$0.k2());
            intent.putExtra("clName", this$0.e2());
            intent.putExtra("clPhoto", this$0.f2());
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void P2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void R2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else if (this$0.D2()) {
            this$0.a3(this$0.p2(), this$0.y2().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
        }
    }

    public static final void S2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            return;
        }
        Toast.makeText(this$0.p2(), "Please Check Your Internet connection", 1).show();
    }

    public static final void T2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.X2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.p2(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    private final void U2() {
        m2().X.g.setText(x2().k());
        m2().X.h.setPaintFlags(m2().X.h.getPaintFlags() | 8);
        m2().X.h.setText(StringsKt__StringsKt.trim((CharSequence) i2().toString()).toString());
        m2().X.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.V2(this.a, view);
            }
        });
    }

    public static final void V2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", this$0.i2());
            intent.putExtra("dobValue", this$0.j2());
            intent.putExtra("fatherName", this$0.k2());
            intent.putExtra("clName", this$0.e2());
            intent.putExtra("clPhoto", this$0.f2());
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void W2(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Y1(ChangeOfAddressCl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r2().dismiss();
        String strB = this$0.y2().b("label_unable_details", this$0.getString(R.string.unable_to_get_details));
        Intrinsics.checkNotNull(strB);
        this$0.d3(strB);
    }

    private final void a3(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(y2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y2().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(y2().b("radio_dl_serv_no", "Cancel"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.b3(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ng0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.c3(this.a, view);
            }
        });
        dialog.show();
    }

    public static final void b3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void c3(ChangeOfAddressCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        kl0 kl0VarN2 = this$0.n2();
        String strZ2 = this$0.z2();
        String strV2 = this$0.v2();
        String string = this$0.m2().z.getText().toString();
        String string2 = this$0.m2().O.getText().toString();
        String string3 = this$0.m2().A.getText().toString();
        String string4 = this$0.m2().N.getText().toString();
        String string5 = this$0.m2().z.getText().toString();
        String string6 = this$0.m2().C.getText().toString();
        String string7 = this$0.m2().M.getText().toString();
        String string8 = this$0.m2().N.getText().toString();
        String district = this$0.permanentAdd.getDistrict();
        Intrinsics.checkNotNull(district);
        String villageOrTown = this$0.permanentAdd.getVillageOrTown();
        Intrinsics.checkNotNull(villageOrTown);
        String district2 = this$0.presentAdd.getDistrict();
        Intrinsics.checkNotNull(district2);
        String villageOrTown2 = this$0.presentAdd.getVillageOrTown();
        Intrinsics.checkNotNull(villageOrTown2);
        String subDistrict = this$0.permanentAdd.getSubDistrict();
        Intrinsics.checkNotNull(subDistrict);
        String subDistrict2 = this$0.presentAdd.getSubDistrict();
        Intrinsics.checkNotNull(subDistrict2);
        kl0VarN2.h(this$0, strZ2, strV2, string, string2, string3, string4, string5, string6, string7, string8, district, villageOrTown, district2, villageOrTown2, subDistrict, subDistrict2, "553", this$0.i2(), this$0.j2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.e3(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void e3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A2() {
        String str = this.stateName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateName");
        return null;
    }

    /* JADX INFO: renamed from: B2, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    public final boolean D2() {
        Editable text = m2().y.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, y2().b("select_state", getString(R.string.select_state)), 0).show();
            return false;
        }
        Editable text2 = m2().x.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this, y2().b("select_district", getString(R.string.select_district)), 0).show();
            return false;
        }
        Editable text3 = m2().w.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, y2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
            return false;
        }
        Editable text4 = m2().M.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this, y2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
            return false;
        }
        Editable text5 = m2().N.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, y2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
            return false;
        }
        if (m2().N.getText().length() < 6) {
            Toast.makeText(this, y2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        Editable text6 = m2().F.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, y2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        Editable text7 = m2().E.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, y2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
            return false;
        }
        Editable text8 = m2().D.getText();
        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
        if (text8.length() == 0) {
            Toast.makeText(this, y2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
            return false;
        }
        Editable text9 = m2().A.getText();
        Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
        if (text9.length() == 0) {
            Toast.makeText(this, y2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
            return false;
        }
        Editable text10 = m2().B.getText();
        Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
        if (text10.length() == 0) {
            Toast.makeText(this, y2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        if (m2().B.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, y2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    public final void E2() {
        m2().C0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.O2(this.a, view);
            }
        });
        m2().X.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.P2(this.a, view);
            }
        });
        m2().W.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.Q2(this.a, view);
            }
        });
        m2().h0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.R2(this.a, view);
            }
        });
        m2().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.S2(this.a, view);
            }
        });
        m2().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.T2(this.a, view);
            }
        });
        m2().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.F2(this.a, view);
            }
        });
        m2().L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ig0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.G2(this.a, view);
            }
        });
        m2().E0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.jg0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                ChangeOfAddressCl.H2(this.a, radioGroup, i);
            }
        });
        m2().F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.I2(this.a, view);
            }
        });
        m2().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.J2(this.a, view);
            }
        });
        m2().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.K2(this.a, view);
            }
        });
        m2().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.L2(this.a, view);
            }
        });
        m2().J.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.ug0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                ChangeOfAddressCl.M2(this.a, radioGroup, i);
            }
        });
        m2().g0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.vg0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChangeOfAddressCl.N2(this.a, compoundButton, z);
            }
        });
    }

    public final void W1() {
        this.viewModel = (xh0) new z(this).a(xh0.class);
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), y2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        xh0 xh0Var = this.viewModel;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.g(z2());
    }

    public final void X1() {
        xh0 xh0Var = this.viewModel;
        xh0 xh0Var2 = null;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.h().g(this, new h(new a()));
        xh0 xh0Var3 = this.viewModel;
        if (xh0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var3 = null;
        }
        xh0Var3.k().g(this, new h(new b()));
        xh0 xh0Var4 = this.viewModel;
        if (xh0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            xh0Var2 = xh0Var4;
        }
        xh0Var2.l().g(this, new h(new c()));
        n2().l().g(this, new mf4() { // from class: com.zepto.og0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressCl.Y1(this.a, (String) obj);
            }
        });
        n2().s().g(this, new h(new d()));
    }

    public final void X2(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.mCurrDistList;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.mPermDistList;
                if (list2 != null) {
                    for (DistrictsMasterItem districtsMasterItem2 : list2) {
                        arrayList.add(String.valueOf(districtsMasterItem2 != null ? districtsMasterItem2.getDistName() : null));
                    }
                }
            }
            d86 d86VarA = d86.INSTANCE.a("Select Districts", arrayList);
            d86VarA.k2(I0(), "DistPicker");
            d86VarA.n2(new e());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y2(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            ArrayList arrayList = new ArrayList();
            String str = "R";
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<TalukaMasterItem> list = this.mCurrTalukaList;
                if (list != null) {
                    for (TalukaMasterItem talukaMasterItem : list) {
                        arrayList.add(String.valueOf(talukaMasterItem != null ? talukaMasterItem.getSubDistname() : null));
                    }
                }
                T t = str;
                if (m2().i0.isChecked()) {
                    t = "U";
                }
                objectRef.element = t;
            } else {
                List<TalukaMasterItem> list2 = this.mPermTalukaList;
                if (list2 != null) {
                    for (TalukaMasterItem talukaMasterItem2 : list2) {
                        arrayList.add(String.valueOf(talukaMasterItem2 != null ? talukaMasterItem2.getSubDistname() : null));
                    }
                }
                T t2 = str;
                if (m2().H.isChecked()) {
                    t2 = "U";
                }
                objectRef.element = t2;
            }
            d86 d86VarA = d86.INSTANCE.a("Select Taluka", arrayList);
            d86VarA.k2(I0(), "TalukaPicker");
            d86VarA.n2(new f(objectRef));
        } catch (Exception unused) {
        }
    }

    public final void Z1() {
        m2().w.setText("");
        m2().w.setHint(y2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        a2();
        a2();
    }

    public final void Z2(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.mCurrVillageOrTownList;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.mPermVillageOrTownList;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            d86 d86VarA = d86.INSTANCE.a("Select Village/Town", arrayList);
            d86VarA.k2(I0(), "VillageTownPicker");
            d86VarA.n2(new g());
        } catch (Exception unused) {
        }
    }

    public final void a2() {
        m2().L.setText("");
        m2().L.setHint(y2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mCurrVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    public final void b2() {
        m2().D.setText("");
        m2().D.setHint(y2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mPermTalukaList = CollectionsKt__CollectionsKt.emptyList();
        c2();
    }

    public final void c2() {
        m2().G.setText("");
        m2().G.setHint(y2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mPermVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: d2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final String e2() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    public final String f2() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final void f3() {
        try {
            m2().E.setText(m2().x.getText());
            m2().D.setText(m2().w.getText());
            m2().G.setText(m2().L.getText());
            m2().z.setText(m2().K.getText());
            m2().C.setText(m2().O.getText());
            m2().A.setText(m2().M.getText());
            m2().B.setText(m2().N.getText());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g2, reason: from getter */
    public final String getCl_Status() {
        return this.cl_Status;
    }

    public final void g3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void h2(String villaOrTown) {
        try {
            String string = m2().w.getContentDescription().toString();
            a2();
            r2().dismiss();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.o(z2(), m2().x.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    public final void h3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final String i2() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final void i3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final String j2() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final void j3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final String k2() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    public final void k3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    /* JADX INFO: renamed from: l2, reason: from getter */
    public final String getIssuing_authority() {
        return this.issuing_authority;
    }

    public final void l3(c7 c7Var) {
        Intrinsics.checkNotNullParameter(c7Var, "<set-?>");
        this.mBinding = c7Var;
    }

    public final c7 m2() {
        c7 c7Var = this.mBinding;
        if (c7Var != null) {
            return c7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final void m3(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final kl0 n2() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final void n3(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final ClInter o2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final void o3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C2();
        W1();
        X1();
        E2();
        U2();
        ta3.a.x(this, m2());
        m2().X.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressCl.W2(this.a, view);
            }
        });
    }

    public final Context p2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void p3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final String q2() {
        String str = this.Mobile_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
        return null;
    }

    public final void q3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final ProgressDialog r2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void r3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final DlAddress getPermanentAdd() {
        return this.permanentAdd;
    }

    public final void s3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void t2(String villaOrTown) {
        try {
            String string = m2().D.getContentDescription().toString();
            c2();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.o(z2(), m2().E.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    public final void t3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    /* JADX INFO: renamed from: u2, reason: from getter */
    public final DlAddress getPresentAdd() {
        return this.presentAdd;
    }

    public final void u3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String v2() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final void v3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final String w2() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final void w3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateName = str;
    }

    public final wl5 x2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 y2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final String z2() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }
}
