package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.StateMasterItem;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen;
import com.zepto.d86;
import com.zepto.jc;
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
import java.io.Serializable;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R \u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R \u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010:R \u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010A\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010:R \u0010E\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010A\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010:R \u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010:R \u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010:R\u0016\u0010M\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\"\u0010_\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010L\u001a\u0004\ba\u0010\\\"\u0004\bb\u0010^R\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010LR\u0018\u0010\u0087\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010LR\u0018\u0010\u0089\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010LR\u0018\u0010\u008b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010LR\u0018\u0010\u008d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010LR\u0018\u0010\u008f\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010LR\u0018\u0010\u0091\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010LR\u0018\u0010\u0093\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010LR\u0018\u0010\u0095\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010LR\u0018\u0010\u0097\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010LR\u0018\u0010\u0099\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010LR\u0018\u0010\u009b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010LR\u0018\u0010\u009d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010LR\u0018\u0010\u009f\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010LR\u0018\u0010¡\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010LR\u0018\u0010£\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010LR\u0018\u0010¥\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010LR\u0018\u0010§\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010LR\u0018\u0010©\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010LR\u0018\u0010«\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010LR\u0018\u0010\u00ad\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010LR\u0018\u0010¯\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010LR\u0018\u0010±\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010LR\u0018\u0010³\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010LR\u0018\u0010µ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010LR\u0019\u0010¸\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010?R\u0018\u0010º\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¹\u0001\u0010LR\u0018\u0010¼\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010LR\u0019\u0010¿\u0001\u001a\u00030½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010BR\u0019\u0010Á\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010\u008a\u0001R\u001a\u0010Å\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006È\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LearnerLicenceAddressScreen;", "Lcom/zepto/pq;", "", "i2", "X2", "y2", "s2", "Y1", "Z1", "", "message", "M2", "fromWhere", "J2", "K2", "a2", "b2", "c2", "d2", "e2", "f2", "villaOrTown", "h2", "o2", "L2", "O2", "", "x2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/jc;", "C", "Lcom/zepto/jc;", "binding", "Lcom/zepto/xh0;", "D", "Lcom/zepto/xh0;", "viewModel", "Lcom/zepto/kl0;", "E", "Lcom/zepto/kl0;", "getMClDlViewModel", "()Lcom/zepto/kl0;", "Q2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "F", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "j2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "R2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "", "Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "G", "Ljava/util/List;", "mStateList", "Lcom/nic/mparivahan/dlservices/data/model/DistrictsMasterItem;", "H", "mCurrDistList", "I", "mPermDistList", "Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "J", "mCurrTalukaList", "K", "mPermTalukaList", "Lcom/nic/mparivahan/dlservices/data/model/VillageOrTownMasterItem;", "L", "mCurrVillageOrTownList", "M", "mPermVillageOrTownList", "N", "Ljava/lang/String;", "isCurrentOrPermanentAddress", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "O", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "p2", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "P", "n2", "setPermanentAdd", "permanentAdd", "Q", "g2", "()Ljava/lang/String;", "P2", "(Ljava/lang/String;)V", "currStateCd", "R", "m2", "U2", "perStateCd", "Landroid/content/Context;", "S", "Landroid/content/Context;", "k2", "()Landroid/content/Context;", "S2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "T", "Landroid/app/ProgressDialog;", "l2", "()Landroid/app/ProgressDialog;", "T2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "r2", "()Lcom/zepto/wa3;", "W2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "V", "Lcom/zepto/wl5;", "q2", "()Lcom/zepto/wl5;", "V2", "(Lcom/zepto/wl5;)V", "sarathiSession", "W", "presSelectedVillOrTown", "X", "permSelectedVillOrTown", "Y", "stateCd", "Z", "rtoCd", "a0", "rtoName", "b0", "applicantFName", "c0", "applicantMName", "d0", "applicantLName", "e0", "fullName", "f0", "relationShipCd", "g0", "relationFName", "h0", "relationMName", "i0", "relationLName", "j0", "gender", "k0", "dob", "l0", "placeOfBirth", "m0", "country", "n0", "eduQualification", "o0", "bloodGroup", "p0", "mobileNo", "q0", "emailID", "r0", "altMobileNo", "s0", "idMark1", "t0", "idMark2", "u0", "landlineNo", "", "v0", "enteredAge", "w0", "cmCampDesc", "x0", "cmType", "", "y0", "ekycID", "z0", "haveAadhaarData", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "A0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLearnerLicenceAddressScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnerLicenceAddressScreen.kt\ncom/nic/mparivahan/dlservices/newlearner/LearnerLicenceAddressScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1464:1\n1855#2,2:1465\n1855#2,2:1467\n1855#2,2:1469\n1855#2,2:1471\n1855#2,2:1473\n1855#2,2:1475\n*S KotlinDebug\n*F\n+ 1 LearnerLicenceAddressScreen.kt\ncom/nic/mparivahan/dlservices/newlearner/LearnerLicenceAddressScreen\n*L\n1048#1:1465,2\n1050#1:1467,2\n1109#1:1469,2\n1114#1:1471,2\n1289#1:1473,2\n1291#1:1475,2\n*E\n"})
public final class LearnerLicenceAddressScreen extends pq {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jc binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public xh0 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public List mStateList;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public List mCurrDistList;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public List mPermDistList;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List mCurrTalukaList;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public List mPermTalukaList;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public List mCurrVillageOrTownList;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public List mPermVillageOrTownList;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String currStateCd;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String perStateCd;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public int enteredAge;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public long ekycID;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public boolean haveAadhaarData;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String isCurrentOrPermanentAddress = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String presSelectedVillOrTown = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String permSelectedVillOrTown = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String rtoCd = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String rtoName = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String applicantFName = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String applicantMName = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String applicantLName = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String fullName = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String relationShipCd = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String relationFName = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String relationMName = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String relationLName = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String gender = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String placeOfBirth = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String country = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String eduQualification = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String bloodGroup = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String emailID = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String altMobileNo = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String idMark1 = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String idMark2 = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String landlineNo = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String cmCampDesc = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String cmType = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(StateResponse stateResponse) {
            try {
                LearnerLicenceAddressScreen.this.l2().dismiss();
                if (!Intrinsics.areEqual(stateResponse.getStatusCode(), "00")) {
                    LearnerLicenceAddressScreen learnerLicenceAddressScreen = LearnerLicenceAddressScreen.this;
                    learnerLicenceAddressScreen.M2(learnerLicenceAddressScreen.r2().b("no_details", LearnerLicenceAddressScreen.this.getString(R.string.no_Details_are_avail)));
                    return;
                }
                if (stateResponse.getStateMaster() == null || !(!r0.isEmpty())) {
                    return;
                }
                LearnerLicenceAddressScreen.this.mStateList = stateResponse.getStateMaster();
                ArrayList arrayList = new ArrayList();
                List<StateMasterItem> list = LearnerLicenceAddressScreen.this.mStateList;
                xh0 xh0Var = null;
                if (list != null) {
                    for (StateMasterItem stateMasterItem : list) {
                        arrayList.add(String.valueOf(stateMasterItem != null ? stateMasterItem.getStateName() : null));
                    }
                }
                String stateName = "";
                List list2 = LearnerLicenceAddressScreen.this.mStateList;
                Intrinsics.checkNotNull(list2);
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    String str = LearnerLicenceAddressScreen.this.stateCd;
                    List list3 = LearnerLicenceAddressScreen.this.mStateList;
                    Intrinsics.checkNotNull(list3);
                    Object obj = list3.get(i);
                    Intrinsics.checkNotNull(obj);
                    if (Intrinsics.areEqual(str, ((StateMasterItem) obj).getStateCode())) {
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = LearnerLicenceAddressScreen.this;
                        List list4 = learnerLicenceAddressScreen2.mStateList;
                        Intrinsics.checkNotNull(list4);
                        Object obj2 = list4.get(i);
                        Intrinsics.checkNotNull(obj2);
                        String stateCode = ((StateMasterItem) obj2).getStateCode();
                        Intrinsics.checkNotNull(stateCode);
                        learnerLicenceAddressScreen2.P2(stateCode);
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen3 = LearnerLicenceAddressScreen.this;
                        List list5 = learnerLicenceAddressScreen3.mStateList;
                        Intrinsics.checkNotNull(list5);
                        Object obj3 = list5.get(i);
                        Intrinsics.checkNotNull(obj3);
                        String stateCode2 = ((StateMasterItem) obj3).getStateCode();
                        Intrinsics.checkNotNull(stateCode2);
                        learnerLicenceAddressScreen3.U2(stateCode2);
                        List list6 = LearnerLicenceAddressScreen.this.mStateList;
                        Intrinsics.checkNotNull(list6);
                        Object obj4 = list6.get(i);
                        Intrinsics.checkNotNull(obj4);
                        stateName = ((StateMasterItem) obj4).getStateName();
                        Intrinsics.checkNotNull(stateName);
                        break;
                    }
                    i++;
                }
                jc jcVar = LearnerLicenceAddressScreen.this.binding;
                if (jcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar = null;
                }
                jcVar.z.setText(stateName);
                jc jcVar2 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar2 = null;
                }
                jcVar2.z.setContentDescription(LearnerLicenceAddressScreen.this.g2());
                LearnerLicenceAddressScreen.this.a2();
                String strG2 = LearnerLicenceAddressScreen.this.g2();
                LearnerLicenceAddressScreen learnerLicenceAddressScreen4 = LearnerLicenceAddressScreen.this;
                learnerLicenceAddressScreen4.l2().dismiss();
                xh0 xh0Var2 = learnerLicenceAddressScreen4.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var2 = null;
                }
                xh0Var2.g(strG2);
                jc jcVar3 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar3 = null;
                }
                jcVar3.G.setText(stateName);
                jc jcVar4 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar4 = null;
                }
                jcVar4.G.setContentDescription(LearnerLicenceAddressScreen.this.m2());
                LearnerLicenceAddressScreen.this.d2();
                String strM2 = LearnerLicenceAddressScreen.this.m2();
                LearnerLicenceAddressScreen learnerLicenceAddressScreen5 = LearnerLicenceAddressScreen.this;
                learnerLicenceAddressScreen5.l2().dismiss();
                xh0 xh0Var3 = learnerLicenceAddressScreen5.viewModel;
                if (xh0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    xh0Var = xh0Var3;
                }
                xh0Var.g(strM2);
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen6 = LearnerLicenceAddressScreen.this;
                learnerLicenceAddressScreen6.M2(learnerLicenceAddressScreen6.r2().b("service_is_not_present", LearnerLicenceAddressScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(DistResponse distResponse) {
            String distName;
            String distName2;
            String distCode;
            String distCode2;
            try {
                LearnerLicenceAddressScreen.this.l2().dismiss();
                jc jcVar = null;
                if (!Intrinsics.areEqual(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    LearnerLicenceAddressScreen learnerLicenceAddressScreen = LearnerLicenceAddressScreen.this;
                    learnerLicenceAddressScreen.M2(learnerLicenceAddressScreen.r2().b("no_details", LearnerLicenceAddressScreen.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                LearnerLicenceAddressScreen.this.mCurrDistList = distResponse.getDistMaster();
                LearnerLicenceAddressScreen.this.mPermDistList = distResponse.getDistMaster();
                if (LearnerLicenceAddressScreen.this.haveAadhaarData) {
                    DOEkycX dOEkycX = LearnerLicenceAddressScreen.this.adharData;
                    if (dOEkycX == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adharData");
                        dOEkycX = null;
                    }
                    if (kt6.d(dOEkycX.getDist())) {
                        List list = LearnerLicenceAddressScreen.this.mCurrDistList;
                        Intrinsics.checkNotNull(list);
                        int size = list.size();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            distName = "";
                            if (i2 >= size) {
                                distName2 = "";
                                distCode = distName2;
                                break;
                            }
                            DOEkycX dOEkycX2 = LearnerLicenceAddressScreen.this.adharData;
                            if (dOEkycX2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                dOEkycX2 = null;
                            }
                            String dist = dOEkycX2.getDist();
                            List list2 = LearnerLicenceAddressScreen.this.mCurrDistList;
                            Intrinsics.checkNotNull(list2);
                            Object obj = list2.get(i2);
                            Intrinsics.checkNotNull(obj);
                            if (Intrinsics.areEqual(dist, ((DistrictsMasterItem) obj).getDistName())) {
                                List list3 = LearnerLicenceAddressScreen.this.mCurrDistList;
                                Intrinsics.checkNotNull(list3);
                                Object obj2 = list3.get(i2);
                                Intrinsics.checkNotNull(obj2);
                                distName2 = ((DistrictsMasterItem) obj2).getDistName();
                                Intrinsics.checkNotNull(distName2);
                                List list4 = LearnerLicenceAddressScreen.this.mCurrDistList;
                                Intrinsics.checkNotNull(list4);
                                Object obj3 = list4.get(i2);
                                Intrinsics.checkNotNull(obj3);
                                distCode = ((DistrictsMasterItem) obj3).getDistCode();
                                Intrinsics.checkNotNull(distCode);
                                break;
                            }
                            i2++;
                        }
                        jc jcVar2 = LearnerLicenceAddressScreen.this.binding;
                        if (jcVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            jcVar2 = null;
                        }
                        jcVar2.y.setText(distName2);
                        jc jcVar3 = LearnerLicenceAddressScreen.this.binding;
                        if (jcVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            jcVar3 = null;
                        }
                        jcVar3.y.setContentDescription(distCode);
                        LearnerLicenceAddressScreen.this.getPresentAdd().setDistrict(distCode);
                        LearnerLicenceAddressScreen.this.b2();
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = LearnerLicenceAddressScreen.this;
                        learnerLicenceAddressScreen2.l2().dismiss();
                        xh0 xh0Var = learnerLicenceAddressScreen2.viewModel;
                        if (xh0Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            xh0Var = null;
                        }
                        jc jcVar4 = learnerLicenceAddressScreen2.binding;
                        if (jcVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            jcVar4 = null;
                        }
                        xh0Var.n(jcVar4.z.getContentDescription().toString(), distCode);
                        List list5 = LearnerLicenceAddressScreen.this.mPermDistList;
                        Intrinsics.checkNotNull(list5);
                        int size2 = list5.size();
                        while (true) {
                            if (i >= size2) {
                                distCode2 = "";
                                break;
                            }
                            DOEkycX dOEkycX3 = LearnerLicenceAddressScreen.this.adharData;
                            if (dOEkycX3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                dOEkycX3 = null;
                            }
                            String dist2 = dOEkycX3.getDist();
                            List list6 = LearnerLicenceAddressScreen.this.mPermDistList;
                            Intrinsics.checkNotNull(list6);
                            Object obj4 = list6.get(i);
                            Intrinsics.checkNotNull(obj4);
                            if (Intrinsics.areEqual(dist2, ((DistrictsMasterItem) obj4).getDistName())) {
                                List list7 = LearnerLicenceAddressScreen.this.mCurrDistList;
                                Intrinsics.checkNotNull(list7);
                                Object obj5 = list7.get(i);
                                Intrinsics.checkNotNull(obj5);
                                distName = ((DistrictsMasterItem) obj5).getDistName();
                                Intrinsics.checkNotNull(distName);
                                List list8 = LearnerLicenceAddressScreen.this.mCurrDistList;
                                Intrinsics.checkNotNull(list8);
                                Object obj6 = list8.get(i);
                                Intrinsics.checkNotNull(obj6);
                                distCode2 = ((DistrictsMasterItem) obj6).getDistCode();
                                Intrinsics.checkNotNull(distCode2);
                                break;
                            }
                            i++;
                        }
                        jc jcVar5 = LearnerLicenceAddressScreen.this.binding;
                        if (jcVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            jcVar5 = null;
                        }
                        jcVar5.F.setText(distName);
                        jc jcVar6 = LearnerLicenceAddressScreen.this.binding;
                        if (jcVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            jcVar6 = null;
                        }
                        jcVar6.F.setContentDescription(distCode2);
                        LearnerLicenceAddressScreen.this.getPermanentAdd().setDistrict(distCode2);
                        LearnerLicenceAddressScreen.this.e2();
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen3 = LearnerLicenceAddressScreen.this;
                        learnerLicenceAddressScreen3.l2().dismiss();
                        xh0 xh0Var2 = learnerLicenceAddressScreen3.viewModel;
                        if (xh0Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            xh0Var2 = null;
                        }
                        jc jcVar7 = learnerLicenceAddressScreen3.binding;
                        if (jcVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            jcVar = jcVar7;
                        }
                        xh0Var2.n(jcVar.G.getContentDescription().toString(), distCode2);
                    }
                }
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen4 = LearnerLicenceAddressScreen.this;
                learnerLicenceAddressScreen4.M2(learnerLicenceAddressScreen4.r2().b("service_is_not_present", LearnerLicenceAddressScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DistResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(TalukaResponse talukaResponse) {
            String subDistname;
            String subDistname2;
            String subDistcode;
            String subDistcode2;
            try {
                LearnerLicenceAddressScreen.this.l2().dismiss();
                jc jcVar = null;
                if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(LearnerLicenceAddressScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                        LearnerLicenceAddressScreen.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                    } else {
                        LearnerLicenceAddressScreen.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                    }
                    if (LearnerLicenceAddressScreen.this.haveAadhaarData) {
                        DOEkycX dOEkycX = LearnerLicenceAddressScreen.this.adharData;
                        if (dOEkycX == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adharData");
                            dOEkycX = null;
                        }
                        if (kt6.d(dOEkycX.getSubDist())) {
                            List list = LearnerLicenceAddressScreen.this.mPermTalukaList;
                            Intrinsics.checkNotNull(list);
                            int size = list.size();
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                subDistname = "";
                                if (i2 >= size) {
                                    subDistname2 = "";
                                    subDistcode = subDistname2;
                                    break;
                                }
                                DOEkycX dOEkycX2 = LearnerLicenceAddressScreen.this.adharData;
                                if (dOEkycX2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                    dOEkycX2 = null;
                                }
                                String subDist = dOEkycX2.getSubDist();
                                List list2 = LearnerLicenceAddressScreen.this.mPermTalukaList;
                                Intrinsics.checkNotNull(list2);
                                Object obj = list2.get(i2);
                                Intrinsics.checkNotNull(obj);
                                if (Intrinsics.areEqual(subDist, ((TalukaMasterItem) obj).getSubDistname())) {
                                    List list3 = LearnerLicenceAddressScreen.this.mPermTalukaList;
                                    Intrinsics.checkNotNull(list3);
                                    Object obj2 = list3.get(i2);
                                    Intrinsics.checkNotNull(obj2);
                                    subDistname2 = ((TalukaMasterItem) obj2).getSubDistname();
                                    Intrinsics.checkNotNull(subDistname2);
                                    List list4 = LearnerLicenceAddressScreen.this.mPermTalukaList;
                                    Intrinsics.checkNotNull(list4);
                                    Object obj3 = list4.get(i2);
                                    Intrinsics.checkNotNull(obj3);
                                    subDistcode = ((TalukaMasterItem) obj3).getSubDistcode();
                                    Intrinsics.checkNotNull(subDistcode);
                                    break;
                                }
                                i2++;
                            }
                            jc jcVar2 = LearnerLicenceAddressScreen.this.binding;
                            if (jcVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                jcVar2 = null;
                            }
                            jcVar2.E.setText(subDistname2);
                            jc jcVar3 = LearnerLicenceAddressScreen.this.binding;
                            if (jcVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                jcVar3 = null;
                            }
                            jcVar3.E.setContentDescription(subDistcode);
                            LearnerLicenceAddressScreen.this.getPermanentAdd().setSubDistrict(subDistcode);
                            List list5 = LearnerLicenceAddressScreen.this.mCurrTalukaList;
                            Intrinsics.checkNotNull(list5);
                            int size2 = list5.size();
                            while (true) {
                                if (i >= size2) {
                                    subDistcode2 = "";
                                    break;
                                }
                                DOEkycX dOEkycX3 = LearnerLicenceAddressScreen.this.adharData;
                                if (dOEkycX3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                    dOEkycX3 = null;
                                }
                                String subDist2 = dOEkycX3.getSubDist();
                                List list6 = LearnerLicenceAddressScreen.this.mCurrTalukaList;
                                Intrinsics.checkNotNull(list6);
                                Object obj4 = list6.get(i);
                                Intrinsics.checkNotNull(obj4);
                                if (Intrinsics.areEqual(subDist2, ((TalukaMasterItem) obj4).getSubDistname())) {
                                    List list7 = LearnerLicenceAddressScreen.this.mCurrTalukaList;
                                    Intrinsics.checkNotNull(list7);
                                    Object obj5 = list7.get(i);
                                    Intrinsics.checkNotNull(obj5);
                                    subDistname = ((TalukaMasterItem) obj5).getSubDistname();
                                    Intrinsics.checkNotNull(subDistname);
                                    List list8 = LearnerLicenceAddressScreen.this.mCurrTalukaList;
                                    Intrinsics.checkNotNull(list8);
                                    Object obj6 = list8.get(i);
                                    Intrinsics.checkNotNull(obj6);
                                    subDistcode2 = ((TalukaMasterItem) obj6).getSubDistcode();
                                    Intrinsics.checkNotNull(subDistcode2);
                                    break;
                                }
                                i++;
                            }
                            jc jcVar4 = LearnerLicenceAddressScreen.this.binding;
                            if (jcVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                jcVar4 = null;
                            }
                            jcVar4.x.setText(subDistname);
                            jc jcVar5 = LearnerLicenceAddressScreen.this.binding;
                            if (jcVar5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                jcVar = jcVar5;
                            }
                            jcVar.x.setContentDescription(subDistcode2);
                            LearnerLicenceAddressScreen.this.getPresentAdd().setSubDistrict(subDistcode2);
                        }
                    }
                } else {
                    if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "01")) {
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen = LearnerLicenceAddressScreen.this;
                        learnerLicenceAddressScreen.M2(learnerLicenceAddressScreen.r2().b("no_taluka_found", "No Taluka / Block found for selected District"));
                    } else {
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = LearnerLicenceAddressScreen.this;
                        learnerLicenceAddressScreen2.M2(learnerLicenceAddressScreen2.r2().b("no_details", LearnerLicenceAddressScreen.this.getString(R.string.unable_to_get_details)));
                    }
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen3 = LearnerLicenceAddressScreen.this;
                learnerLicenceAddressScreen3.M2(learnerLicenceAddressScreen3.r2().b("service_is_not_present", LearnerLicenceAddressScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TalukaResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(VillageOrTownResponse villageOrTownResponse) {
            try {
                LearnerLicenceAddressScreen.this.l2().dismiss();
                if (!Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    LearnerLicenceAddressScreen learnerLicenceAddressScreen = LearnerLicenceAddressScreen.this;
                    learnerLicenceAddressScreen.M2(learnerLicenceAddressScreen.r2().b("no_vill_found", "No Village/Town found for selected Taluka/Block"));
                } else if (Intrinsics.areEqual(LearnerLicenceAddressScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    LearnerLicenceAddressScreen.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                } else {
                    LearnerLicenceAddressScreen.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = LearnerLicenceAddressScreen.this;
                learnerLicenceAddressScreen2.M2(learnerLicenceAddressScreen2.r2().b("service_is_not_present", LearnerLicenceAddressScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VillageOrTownResponse) obj);
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
            String str2 = LearnerLicenceAddressScreen.this.isCurrentOrPermanentAddress;
            jc jcVar = null;
            if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                List list = LearnerLicenceAddressScreen.this.mCurrDistList;
                String distCode = (list == null || (districtsMasterItem2 = (DistrictsMasterItem) list.get(i)) == null) ? null : districtsMasterItem2.getDistCode();
                jc jcVar2 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar2 = null;
                }
                jcVar2.y.setText(str);
                jc jcVar3 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar3 = null;
                }
                jcVar3.y.setContentDescription(distCode);
                LearnerLicenceAddressScreen.this.getPresentAdd().setDistrict(distCode);
                LearnerLicenceAddressScreen.this.b2();
                if (distCode != null) {
                    LearnerLicenceAddressScreen learnerLicenceAddressScreen = LearnerLicenceAddressScreen.this;
                    learnerLicenceAddressScreen.l2().dismiss();
                    xh0 xh0Var = learnerLicenceAddressScreen.viewModel;
                    if (xh0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        xh0Var = null;
                    }
                    jc jcVar4 = learnerLicenceAddressScreen.binding;
                    if (jcVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        jcVar = jcVar4;
                    }
                    xh0Var.n(jcVar.z.getContentDescription().toString(), distCode);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                List list2 = LearnerLicenceAddressScreen.this.mPermDistList;
                String distCode2 = (list2 == null || (districtsMasterItem = (DistrictsMasterItem) list2.get(i)) == null) ? null : districtsMasterItem.getDistCode();
                jc jcVar5 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar5 = null;
                }
                jcVar5.F.setText(str);
                jc jcVar6 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar6 = null;
                }
                jcVar6.F.setContentDescription(distCode2);
                LearnerLicenceAddressScreen.this.getPermanentAdd().setDistrict(distCode2);
                LearnerLicenceAddressScreen.this.e2();
                if (distCode2 != null) {
                    LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = LearnerLicenceAddressScreen.this;
                    learnerLicenceAddressScreen2.l2().dismiss();
                    xh0 xh0Var2 = learnerLicenceAddressScreen2.viewModel;
                    if (xh0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        xh0Var2 = null;
                    }
                    jc jcVar7 = learnerLicenceAddressScreen2.binding;
                    if (jcVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        jcVar = jcVar7;
                    }
                    xh0Var2.n(jcVar.G.getContentDescription().toString(), distCode2);
                }
            }
        }
    }

    public static final class f implements d86.b {
        public final /* synthetic */ String b;

        public f(String str) {
            this.b = str;
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            jc jcVar = null;
            jc jcVar2 = null;
            DOEkycX dOEkycX = null;
            jc jcVar3 = null;
            if (!Intrinsics.areEqual(LearnerLicenceAddressScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = LearnerLicenceAddressScreen.this.mPermTalukaList;
                String subDistcode = (list == null || (talukaMasterItem = (TalukaMasterItem) list.get(i)) == null) ? null : talukaMasterItem.getSubDistcode();
                jc jcVar4 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar4 = null;
                }
                jcVar4.E.setText(str);
                jc jcVar5 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar5 = null;
                }
                jcVar5.E.setContentDescription(subDistcode);
                LearnerLicenceAddressScreen.this.getPermanentAdd().setSubDistrict(subDistcode);
                LearnerLicenceAddressScreen.this.o2(this.b);
                jc jcVar6 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar6 = null;
                }
                EditText editText = jcVar6.B;
                StringBuilder sb = new StringBuilder();
                jc jcVar7 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar7 = null;
                }
                sb.append((Object) jcVar7.E.getText());
                sb.append(", ");
                jc jcVar8 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar8 = null;
                }
                sb.append((Object) jcVar8.F.getText());
                sb.append(", ");
                jc jcVar9 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar = jcVar9;
                }
                sb.append((Object) jcVar.G.getText());
                editText.setText(sb.toString());
                return;
            }
            List list2 = LearnerLicenceAddressScreen.this.mCurrTalukaList;
            String subDistcode2 = (list2 == null || (talukaMasterItem2 = (TalukaMasterItem) list2.get(i)) == null) ? null : talukaMasterItem2.getSubDistcode();
            jc jcVar10 = LearnerLicenceAddressScreen.this.binding;
            if (jcVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar10 = null;
            }
            jcVar10.x.setText(str);
            jc jcVar11 = LearnerLicenceAddressScreen.this.binding;
            if (jcVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar11 = null;
            }
            jcVar11.x.setContentDescription(subDistcode2);
            LearnerLicenceAddressScreen.this.getPresentAdd().setSubDistrict(subDistcode2);
            LearnerLicenceAddressScreen.this.h2(this.b);
            if (!LearnerLicenceAddressScreen.this.haveAadhaarData) {
                jc jcVar12 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar12 = null;
                }
                EditText editText2 = jcVar12.N;
                StringBuilder sb2 = new StringBuilder();
                jc jcVar13 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar13 = null;
                }
                sb2.append((Object) jcVar13.x.getText());
                sb2.append(", ");
                jc jcVar14 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar14 = null;
                }
                sb2.append((Object) jcVar14.y.getText());
                sb2.append(", ");
                jc jcVar15 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar3 = jcVar15;
                }
                sb2.append((Object) jcVar3.z.getText());
                editText2.setText(sb2.toString());
                return;
            }
            DOEkycX dOEkycX2 = LearnerLicenceAddressScreen.this.adharData;
            if (dOEkycX2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX2 = null;
            }
            if (kt6.d(dOEkycX2.getLandMark())) {
                jc jcVar16 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar16 = null;
                }
                EditText editText3 = jcVar16.N;
                StringBuilder sb3 = new StringBuilder();
                DOEkycX dOEkycX3 = LearnerLicenceAddressScreen.this.adharData;
                if (dOEkycX3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                    dOEkycX3 = null;
                }
                sb3.append(dOEkycX3.getLandMark());
                sb3.append(", ");
                jc jcVar17 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar17 = null;
                }
                sb3.append((Object) jcVar17.x.getText());
                sb3.append(", ");
                jc jcVar18 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar18 = null;
                }
                sb3.append((Object) jcVar18.y.getText());
                sb3.append(", ");
                jc jcVar19 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar2 = jcVar19;
                }
                sb3.append((Object) jcVar2.z.getText());
                editText3.setText(sb3.toString());
                return;
            }
            jc jcVar20 = LearnerLicenceAddressScreen.this.binding;
            if (jcVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar20 = null;
            }
            EditText editText4 = jcVar20.N;
            StringBuilder sb4 = new StringBuilder();
            jc jcVar21 = LearnerLicenceAddressScreen.this.binding;
            if (jcVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar21 = null;
            }
            sb4.append((Object) jcVar21.x.getText());
            sb4.append(", ");
            DOEkycX dOEkycX4 = LearnerLicenceAddressScreen.this.adharData;
            if (dOEkycX4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX4 = null;
            }
            sb4.append(dOEkycX4.getLocalityIfAny());
            sb4.append(", ");
            DOEkycX dOEkycX5 = LearnerLicenceAddressScreen.this.adharData;
            if (dOEkycX5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX5 = null;
            }
            sb4.append(dOEkycX5.getDist());
            sb4.append(", ");
            DOEkycX dOEkycX6 = LearnerLicenceAddressScreen.this.adharData;
            if (dOEkycX6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
            } else {
                dOEkycX = dOEkycX6;
            }
            sb4.append(dOEkycX.getState());
            editText4.setText(sb4.toString());
        }
    }

    public static final class g implements d86.b {
        public g() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            jc jcVar = null;
            if (Intrinsics.areEqual(LearnerLicenceAddressScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = LearnerLicenceAddressScreen.this.mCurrVillageOrTownList;
                String villageCode = (list == null || (villageOrTownMasterItem2 = (VillageOrTownMasterItem) list.get(i)) == null) ? null : villageOrTownMasterItem2.getVillageCode();
                jc jcVar2 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar2 = null;
                }
                jcVar2.M.setText(str);
                jc jcVar3 = LearnerLicenceAddressScreen.this.binding;
                if (jcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar = jcVar3;
                }
                jcVar.M.setContentDescription(villageCode);
                LearnerLicenceAddressScreen.this.getPresentAdd().setVillageOrTown(villageCode);
                return;
            }
            List list2 = LearnerLicenceAddressScreen.this.mPermVillageOrTownList;
            String villageCode2 = (list2 == null || (villageOrTownMasterItem = (VillageOrTownMasterItem) list2.get(i)) == null) ? null : villageOrTownMasterItem.getVillageCode();
            jc jcVar4 = LearnerLicenceAddressScreen.this.binding;
            if (jcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar4 = null;
            }
            jcVar4.H.setText(str);
            jc jcVar5 = LearnerLicenceAddressScreen.this.binding;
            if (jcVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jcVar = jcVar5;
            }
            jcVar.H.setContentDescription(villageCode2);
            LearnerLicenceAddressScreen.this.getPermanentAdd().setVillageOrTown(villageCode2);
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

    public static final void A2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.K2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.k2(), this$0.r2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void B2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.L2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.k2(), this$0.r2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void C2(LearnerLicenceAddressScreen this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        if (i == R.id.town_rb) {
            this$0.presSelectedVillOrTown = "U";
            this$0.h2("U");
        } else {
            if (i != R.id.village_rb) {
                return;
            }
            this$0.presSelectedVillOrTown = "R";
            this$0.h2("R");
        }
    }

    public static final void D2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.J2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.k2(), this$0.r2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void E2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.K2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.k2(), this$0.r2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void F2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.L2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.k2(), this$0.r2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void G2(LearnerLicenceAddressScreen this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mPermTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        switch (i) {
            case R.id.dl_permanent_town_rb /* 2131362708 */:
                this$0.permSelectedVillOrTown = "U";
                this$0.o2("U");
                break;
            case R.id.dl_permanent_village_rb /* 2131362709 */:
                this$0.permSelectedVillOrTown = "R";
                this$0.o2("R");
                break;
        }
    }

    public static final void H2(LearnerLicenceAddressScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jc jcVar = null;
        try {
            if (z) {
                this$0.O2();
                jc jcVar2 = this$0.binding;
                if (jcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar2 = null;
                }
                jcVar2.G.setEnabled(false);
                jc jcVar3 = this$0.binding;
                if (jcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar3 = null;
                }
                jcVar3.F.setEnabled(false);
                jc jcVar4 = this$0.binding;
                if (jcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar4 = null;
                }
                jcVar4.E.setEnabled(false);
                jc jcVar5 = this$0.binding;
                if (jcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar5 = null;
                }
                jcVar5.H.setEnabled(false);
                jc jcVar6 = this$0.binding;
                if (jcVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar6 = null;
                }
                jcVar6.B.setEnabled(false);
                jc jcVar7 = this$0.binding;
                if (jcVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar7 = null;
                }
                jcVar7.A.setEnabled(false);
                jc jcVar8 = this$0.binding;
                if (jcVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar8 = null;
                }
                jcVar8.D.setEnabled(false);
                jc jcVar9 = this$0.binding;
                if (jcVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar9 = null;
                }
                jcVar9.C.setEnabled(false);
            } else {
                this$0.permanentAdd = new DlAddress("", "", "", "", "", "", "", "");
                jc jcVar10 = this$0.binding;
                if (jcVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar10 = null;
                }
                jcVar10.F.setText("");
                jc jcVar11 = this$0.binding;
                if (jcVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar11 = null;
                }
                jcVar11.E.setText("");
                jc jcVar12 = this$0.binding;
                if (jcVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar12 = null;
                }
                jcVar12.H.setText("");
                jc jcVar13 = this$0.binding;
                if (jcVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar13 = null;
                }
                jcVar13.A.setText("");
                jc jcVar14 = this$0.binding;
                if (jcVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar14 = null;
                }
                jcVar14.D.setText("");
                jc jcVar15 = this$0.binding;
                if (jcVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar15 = null;
                }
                jcVar15.B.setText("");
                jc jcVar16 = this$0.binding;
                if (jcVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar16 = null;
                }
                jcVar16.C.setText("");
                jc jcVar17 = this$0.binding;
                if (jcVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar17 = null;
                }
                jcVar17.G.setEnabled(true);
                jc jcVar18 = this$0.binding;
                if (jcVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar18 = null;
                }
                jcVar18.F.setEnabled(true);
                jc jcVar19 = this$0.binding;
                if (jcVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar19 = null;
                }
                jcVar19.E.setEnabled(true);
                jc jcVar20 = this$0.binding;
                if (jcVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar20 = null;
                }
                jcVar20.H.setEnabled(true);
                jc jcVar21 = this$0.binding;
                if (jcVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar21 = null;
                }
                jcVar21.B.setEnabled(true);
                jc jcVar22 = this$0.binding;
                if (jcVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar22 = null;
                }
                jcVar22.A.setEnabled(true);
                jc jcVar23 = this$0.binding;
                if (jcVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar23 = null;
                }
                jcVar23.D.setEnabled(true);
                jc jcVar24 = this$0.binding;
                if (jcVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar24 = null;
                }
                jcVar24.C.setEnabled(true);
            }
            jc jcVar25 = this$0.binding;
            if (jcVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar25 = null;
            }
            jcVar25.z(this$0.permanentAdd);
            jc jcVar26 = this$0.binding;
            if (jcVar26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jcVar = jcVar26;
            }
            jcVar.a();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void I2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.x2()) {
            DOEkycX dOEkycX = this$0.adharData;
            DOEkycX dOEkycX2 = null;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            Log.d("adhar_pht", dOEkycX.getPht());
            Intent intent = new Intent(this$0, (Class<?>) LearnerLicenseTrainingScreen.class);
            intent.putExtra("stateCd", this$0.stateCd);
            intent.putExtra("rtoCd", this$0.rtoCd);
            intent.putExtra("rtoName", this$0.rtoName);
            intent.putExtra("applicantFName", this$0.applicantFName);
            intent.putExtra("applicantMName", this$0.applicantMName);
            intent.putExtra("applicantLName", this$0.applicantLName);
            intent.putExtra("fullName", this$0.fullName);
            intent.putExtra("relationship", this$0.relationShipCd);
            intent.putExtra("relationFName", this$0.relationFName);
            intent.putExtra("relationMName", this$0.relationMName);
            intent.putExtra("relationLName", this$0.relationLName);
            intent.putExtra("gender", this$0.gender);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("placeOfBirth", this$0.placeOfBirth);
            intent.putExtra("country", this$0.country);
            intent.putExtra("educationQualification", this$0.eduQualification);
            intent.putExtra("bloodGroup", this$0.bloodGroup);
            intent.putExtra("landlineNo", this$0.landlineNo);
            intent.putExtra("emailId", this$0.emailID);
            intent.putExtra("applicantMobileNo", this$0.mobileNo);
            intent.putExtra("altMobileNo", this$0.altMobileNo);
            intent.putExtra("identificationMark1", this$0.idMark1);
            intent.putExtra("identificationMark2", this$0.idMark2);
            intent.putExtra("enteredAge", this$0.enteredAge);
            jc jcVar = this$0.binding;
            if (jcVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar = null;
            }
            intent.putExtra("presHouseNo", jcVar.L.getText().toString());
            jc jcVar2 = this$0.binding;
            if (jcVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar2 = null;
            }
            intent.putExtra("presStreet", jcVar2.P.getText().toString());
            jc jcVar3 = this$0.binding;
            if (jcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar3 = null;
            }
            intent.putExtra("presLocation", jcVar3.N.getText().toString());
            intent.putExtra("presVillageOrTown", this$0.presentAdd.getVillageOrTown());
            intent.putExtra("presSubDistrict", this$0.presentAdd.getSubDistrict());
            intent.putExtra("presDistrict", this$0.presentAdd.getDistrict());
            intent.putExtra("presState", this$0.g2());
            jc jcVar4 = this$0.binding;
            if (jcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar4 = null;
            }
            intent.putExtra("presPincode", jcVar4.O.getText().toString());
            intent.putExtra("preSelectedVillOrTown", this$0.presSelectedVillOrTown);
            jc jcVar5 = this$0.binding;
            if (jcVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar5 = null;
            }
            intent.putExtra("perHouseNo", jcVar5.A.getText().toString());
            jc jcVar6 = this$0.binding;
            if (jcVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar6 = null;
            }
            intent.putExtra("perStreet", jcVar6.D.getText().toString());
            jc jcVar7 = this$0.binding;
            if (jcVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar7 = null;
            }
            intent.putExtra("perLocation", jcVar7.B.getText().toString());
            intent.putExtra("permVillageOrTown", this$0.permanentAdd.getVillageOrTown());
            intent.putExtra("perSubDistrict", this$0.permanentAdd.getSubDistrict());
            intent.putExtra("perDistrict", this$0.permanentAdd.getDistrict());
            intent.putExtra("perState", this$0.m2());
            jc jcVar8 = this$0.binding;
            if (jcVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar8 = null;
            }
            intent.putExtra("perPinCode", jcVar8.O.getText().toString());
            intent.putExtra("permSelectedVillOrTown", this$0.permSelectedVillOrTown);
            intent.putExtra("permanentAdd", this$0.permanentAdd);
            jc jcVar9 = this$0.binding;
            if (jcVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar9 = null;
            }
            intent.putExtra("year", String.valueOf(jcVar9.t0.getText()));
            jc jcVar10 = this$0.binding;
            if (jcVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar10 = null;
            }
            intent.putExtra(" Month: ", String.valueOf(jcVar10.V.getText()));
            intent.putExtra("campDesc", this$0.cmCampDesc);
            intent.putExtra("cmType", this$0.cmType);
            if (this$0.haveAadhaarData) {
                DOEkycX dOEkycX3 = this$0.adharData;
                if (dOEkycX3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                } else {
                    dOEkycX2 = dOEkycX3;
                }
                intent.putExtra("aadharData", dOEkycX2);
                intent.putExtra("ekycId", this$0.ekycID);
                intent.putExtra("dataFromAadhar", this$0.haveAadhaarData);
            }
            this$0.startActivity(intent);
        }
    }

    private final void J2(String fromWhere) {
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
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void K2(String fromWhere) {
        String str;
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            ArrayList arrayList = new ArrayList();
            jc jcVar = null;
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<TalukaMasterItem> list = this.mCurrTalukaList;
                if (list != null) {
                    for (TalukaMasterItem talukaMasterItem : list) {
                        arrayList.add(String.valueOf(talukaMasterItem != null ? talukaMasterItem.getSubDistname() : null));
                    }
                }
                jc jcVar2 = this.binding;
                if (jcVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar = jcVar2;
                }
                str = jcVar.a0.isChecked() ? "U" : "R";
                this.presSelectedVillOrTown = str;
            } else {
                List<TalukaMasterItem> list2 = this.mPermTalukaList;
                if (list2 != null) {
                    for (TalukaMasterItem talukaMasterItem2 : list2) {
                        arrayList.add(String.valueOf(talukaMasterItem2 != null ? talukaMasterItem2.getSubDistname() : null));
                    }
                }
                jc jcVar3 = this.binding;
                if (jcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar = jcVar3;
                }
                str = jcVar.I.isChecked() ? "U" : "R";
                this.permSelectedVillOrTown = str;
            }
            d86 d86VarA = d86.INSTANCE.a("Select Taluka", arrayList);
            d86VarA.k2(I0(), "TalukaPicker");
            d86VarA.n2(new f(str));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void L2(String fromWhere) {
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
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.N2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void O2() {
        try {
            this.permanentAdd = this.presentAdd;
            U2(g2());
            jc jcVar = this.binding;
            jc jcVar2 = null;
            if (jcVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar = null;
            }
            EditText editText = jcVar.G;
            jc jcVar3 = this.binding;
            if (jcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar3 = null;
            }
            editText.setText(jcVar3.z.getText());
            jc jcVar4 = this.binding;
            if (jcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar4 = null;
            }
            EditText editText2 = jcVar4.F;
            jc jcVar5 = this.binding;
            if (jcVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar5 = null;
            }
            editText2.setText(jcVar5.y.getText());
            jc jcVar6 = this.binding;
            if (jcVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar6 = null;
            }
            EditText editText3 = jcVar6.E;
            jc jcVar7 = this.binding;
            if (jcVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar7 = null;
            }
            editText3.setText(jcVar7.x.getText());
            jc jcVar8 = this.binding;
            if (jcVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar8 = null;
            }
            EditText editText4 = jcVar8.H;
            jc jcVar9 = this.binding;
            if (jcVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar9 = null;
            }
            editText4.setText(jcVar9.M.getText());
            jc jcVar10 = this.binding;
            if (jcVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar10 = null;
            }
            EditText editText5 = jcVar10.A;
            jc jcVar11 = this.binding;
            if (jcVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar11 = null;
            }
            editText5.setText(jcVar11.L.getText());
            jc jcVar12 = this.binding;
            if (jcVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar12 = null;
            }
            EditText editText6 = jcVar12.D;
            jc jcVar13 = this.binding;
            if (jcVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar13 = null;
            }
            editText6.setText(jcVar13.P.getText());
            jc jcVar14 = this.binding;
            if (jcVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar14 = null;
            }
            EditText editText7 = jcVar14.B;
            jc jcVar15 = this.binding;
            if (jcVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar15 = null;
            }
            editText7.setText(jcVar15.N.getText());
            jc jcVar16 = this.binding;
            if (jcVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar16 = null;
            }
            EditText editText8 = jcVar16.C;
            jc jcVar17 = this.binding;
            if (jcVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar17 = null;
            }
            editText8.setText(jcVar17.O.getText());
            jc jcVar18 = this.binding;
            if (jcVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar18 = null;
            }
            if (jcVar18.r0.isChecked()) {
                jc jcVar19 = this.binding;
                if (jcVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jcVar2 = jcVar19;
                }
                jcVar2.J.setChecked(true);
            } else {
                jc jcVar20 = this.binding;
                if (jcVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jcVar20 = null;
                }
                if (jcVar20.a0.isChecked()) {
                    jc jcVar21 = this.binding;
                    if (jcVar21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        jcVar2 = jcVar21;
                    }
                    jcVar2.I.setChecked(true);
                }
            }
            this.permSelectedVillOrTown = this.presSelectedVillOrTown;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void X2() {
        jc jcVar = null;
        DOEkycX dOEkycX = null;
        if (!this.haveAadhaarData) {
            jc jcVar2 = this.binding;
            if (jcVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar2 = null;
            }
            jcVar2.X.setEnabled(true);
            jc jcVar3 = this.binding;
            if (jcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar3 = null;
            }
            jcVar3.X.setClickable(true);
            jc jcVar4 = this.binding;
            if (jcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar4 = null;
            }
            jcVar4.A.setFocusable(true);
            jc jcVar5 = this.binding;
            if (jcVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar5 = null;
            }
            jcVar5.B.setFocusable(true);
            jc jcVar6 = this.binding;
            if (jcVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar6 = null;
            }
            jcVar6.D.setFocusable(true);
            jc jcVar7 = this.binding;
            if (jcVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar7 = null;
            }
            jcVar7.C.setFocusable(true);
            jc jcVar8 = this.binding;
            if (jcVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar8 = null;
            }
            jcVar8.F.setFocusable(true);
            jc jcVar9 = this.binding;
            if (jcVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar9 = null;
            }
            jcVar9.F.setEnabled(true);
            jc jcVar10 = this.binding;
            if (jcVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar10 = null;
            }
            jcVar10.E.setFocusable(false);
            jc jcVar11 = this.binding;
            if (jcVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar11 = null;
            }
            jcVar11.E.setEnabled(true);
            jc jcVar12 = this.binding;
            if (jcVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar12 = null;
            }
            jcVar12.J.setClickable(true);
            jc jcVar13 = this.binding;
            if (jcVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar13 = null;
            }
            jcVar13.J.setEnabled(true);
            jc jcVar14 = this.binding;
            if (jcVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar14 = null;
            }
            jcVar14.I.setEnabled(true);
            jc jcVar15 = this.binding;
            if (jcVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar15 = null;
            }
            jcVar15.I.setClickable(true);
            jc jcVar16 = this.binding;
            if (jcVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar16 = null;
            }
            jcVar16.H.setFocusable(true);
            jc jcVar17 = this.binding;
            if (jcVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jcVar = jcVar17;
            }
            jcVar.H.setEnabled(true);
            return;
        }
        jc jcVar18 = this.binding;
        if (jcVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar18 = null;
        }
        jcVar18.X.setEnabled(false);
        jc jcVar19 = this.binding;
        if (jcVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar19 = null;
        }
        jcVar19.X.setClickable(false);
        jc jcVar20 = this.binding;
        if (jcVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar20 = null;
        }
        jcVar20.X.setChecked(false);
        jc jcVar21 = this.binding;
        if (jcVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar21 = null;
        }
        jcVar21.A.setFocusable(false);
        jc jcVar22 = this.binding;
        if (jcVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar22 = null;
        }
        jcVar22.B.setFocusable(false);
        jc jcVar23 = this.binding;
        if (jcVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar23 = null;
        }
        jcVar23.D.setFocusable(false);
        jc jcVar24 = this.binding;
        if (jcVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar24 = null;
        }
        jcVar24.C.setFocusable(false);
        jc jcVar25 = this.binding;
        if (jcVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar25 = null;
        }
        jcVar25.F.setFocusable(false);
        jc jcVar26 = this.binding;
        if (jcVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar26 = null;
        }
        jcVar26.F.setEnabled(false);
        jc jcVar27 = this.binding;
        if (jcVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar27 = null;
        }
        jcVar27.E.setFocusable(false);
        jc jcVar28 = this.binding;
        if (jcVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar28 = null;
        }
        jcVar28.E.setEnabled(false);
        jc jcVar29 = this.binding;
        if (jcVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar29 = null;
        }
        jcVar29.H.setEnabled(false);
        jc jcVar30 = this.binding;
        if (jcVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar30 = null;
        }
        jcVar30.J.setClickable(false);
        jc jcVar31 = this.binding;
        if (jcVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar31 = null;
        }
        jcVar31.J.setEnabled(false);
        jc jcVar32 = this.binding;
        if (jcVar32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar32 = null;
        }
        jcVar32.I.setEnabled(false);
        jc jcVar33 = this.binding;
        if (jcVar33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar33 = null;
        }
        jcVar33.I.setClickable(false);
        jc jcVar34 = this.binding;
        if (jcVar34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar34 = null;
        }
        jcVar34.H.setFocusable(false);
        DOEkycX dOEkycX2 = this.adharData;
        if (dOEkycX2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX2 = null;
        }
        if (kt6.d(dOEkycX2.getHouse())) {
            jc jcVar35 = this.binding;
            if (jcVar35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar35 = null;
            }
            EditText editText = jcVar35.A;
            DOEkycX dOEkycX3 = this.adharData;
            if (dOEkycX3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX3 = null;
            }
            editText.setText(dOEkycX3.getHouse());
            jc jcVar36 = this.binding;
            if (jcVar36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar36 = null;
            }
            EditText editText2 = jcVar36.L;
            DOEkycX dOEkycX4 = this.adharData;
            if (dOEkycX4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX4 = null;
            }
            editText2.setText(dOEkycX4.getHouse());
        }
        DOEkycX dOEkycX5 = this.adharData;
        if (dOEkycX5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX5 = null;
        }
        if (kt6.d(dOEkycX5.getLocalityIfAny())) {
            jc jcVar37 = this.binding;
            if (jcVar37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar37 = null;
            }
            EditText editText3 = jcVar37.D;
            DOEkycX dOEkycX6 = this.adharData;
            if (dOEkycX6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX6 = null;
            }
            editText3.setText(dOEkycX6.getLocalityIfAny());
            jc jcVar38 = this.binding;
            if (jcVar38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar38 = null;
            }
            EditText editText4 = jcVar38.P;
            DOEkycX dOEkycX7 = this.adharData;
            if (dOEkycX7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX7 = null;
            }
            editText4.setText(dOEkycX7.getLocalityIfAny());
        }
        DOEkycX dOEkycX8 = this.adharData;
        if (dOEkycX8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX8 = null;
        }
        if (kt6.d(dOEkycX8.getLandMark())) {
            jc jcVar39 = this.binding;
            if (jcVar39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar39 = null;
            }
            EditText editText5 = jcVar39.B;
            DOEkycX dOEkycX9 = this.adharData;
            if (dOEkycX9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX9 = null;
            }
            editText5.setText(dOEkycX9.getLandMark());
            jc jcVar40 = this.binding;
            if (jcVar40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar40 = null;
            }
            EditText editText6 = jcVar40.N;
            DOEkycX dOEkycX10 = this.adharData;
            if (dOEkycX10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX10 = null;
            }
            editText6.setText(dOEkycX10.getLandMark());
        } else {
            jc jcVar41 = this.binding;
            if (jcVar41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar41 = null;
            }
            EditText editText7 = jcVar41.B;
            StringBuilder sb = new StringBuilder();
            DOEkycX dOEkycX11 = this.adharData;
            if (dOEkycX11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX11 = null;
            }
            sb.append(dOEkycX11.getLocalityIfAny());
            sb.append(", ");
            DOEkycX dOEkycX12 = this.adharData;
            if (dOEkycX12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX12 = null;
            }
            sb.append(dOEkycX12.getDist());
            sb.append(", ");
            DOEkycX dOEkycX13 = this.adharData;
            if (dOEkycX13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX13 = null;
            }
            sb.append(dOEkycX13.getState());
            editText7.setText(sb.toString());
            jc jcVar42 = this.binding;
            if (jcVar42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar42 = null;
            }
            EditText editText8 = jcVar42.N;
            StringBuilder sb2 = new StringBuilder();
            DOEkycX dOEkycX14 = this.adharData;
            if (dOEkycX14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX14 = null;
            }
            sb2.append(dOEkycX14.getLocalityIfAny());
            sb2.append(", ");
            DOEkycX dOEkycX15 = this.adharData;
            if (dOEkycX15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX15 = null;
            }
            sb2.append(dOEkycX15.getDist());
            sb2.append(", ");
            DOEkycX dOEkycX16 = this.adharData;
            if (dOEkycX16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX16 = null;
            }
            sb2.append(dOEkycX16.getState());
            editText8.setText(sb2.toString());
        }
        DOEkycX dOEkycX17 = this.adharData;
        if (dOEkycX17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX17 = null;
        }
        if (kt6.d(dOEkycX17.getPincode())) {
            jc jcVar43 = this.binding;
            if (jcVar43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar43 = null;
            }
            EditText editText9 = jcVar43.C;
            DOEkycX dOEkycX18 = this.adharData;
            if (dOEkycX18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX18 = null;
            }
            editText9.setText(dOEkycX18.getPincode());
            jc jcVar44 = this.binding;
            if (jcVar44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar44 = null;
            }
            EditText editText10 = jcVar44.O;
            DOEkycX dOEkycX19 = this.adharData;
            if (dOEkycX19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
            } else {
                dOEkycX = dOEkycX19;
            }
            editText10.setText(dOEkycX.getPincode());
        }
        this.isCurrentOrPermanentAddress = "dl-renewal-current-address";
    }

    private final void Y1() {
        this.viewModel = (xh0) new z(this).a(xh0.class);
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(k2(), r2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        l2().show();
        xh0 xh0Var = this.viewModel;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.m();
    }

    private final void Z1() {
        xh0 xh0Var = this.viewModel;
        xh0 xh0Var2 = null;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.i().g(this, new h(new a()));
        xh0 xh0Var3 = this.viewModel;
        if (xh0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var3 = null;
        }
        xh0Var3.h().g(this, new h(new b()));
        xh0 xh0Var4 = this.viewModel;
        if (xh0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var4 = null;
        }
        xh0Var4.k().g(this, new h(new c()));
        xh0 xh0Var5 = this.viewModel;
        if (xh0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            xh0Var2 = xh0Var5;
        }
        xh0Var2.l().g(this, new h(new d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.y.setText("");
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.y.setHint(r2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.x.setText("");
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.x.setHint(r2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        c2();
        c2();
    }

    private final void c2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.M.setText("");
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.M.setHint(r2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mCurrVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.F.setText("");
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.F.setHint(r2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.mPermDistList = CollectionsKt__CollectionsKt.emptyList();
        e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.E.setText("");
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.E.setHint(r2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mPermTalukaList = CollectionsKt__CollectionsKt.emptyList();
        f2();
    }

    private final void f2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.H.setText("");
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.H.setHint(r2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mPermVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(String villaOrTown) {
        try {
            jc jcVar = this.binding;
            jc jcVar2 = null;
            if (jcVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar = null;
            }
            String string = jcVar.x.getContentDescription().toString();
            c2();
            l2().dismiss();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            jc jcVar3 = this.binding;
            if (jcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar3 = null;
            }
            String string2 = jcVar3.z.getContentDescription().toString();
            jc jcVar4 = this.binding;
            if (jcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jcVar2 = jcVar4;
            }
            xh0Var.o(string2, jcVar2.y.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void i2() {
        String stringExtra = getIntent().getStringExtra("stateCd");
        Intrinsics.checkNotNull(stringExtra);
        this.stateCd = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("rtoCd");
        Intrinsics.checkNotNull(stringExtra2);
        this.rtoCd = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("rtoName");
        Intrinsics.checkNotNull(stringExtra3);
        this.rtoName = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("applicantFName");
        Intrinsics.checkNotNull(stringExtra4);
        this.applicantFName = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicantMName");
        Intrinsics.checkNotNull(stringExtra5);
        this.applicantMName = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("applicantLName");
        Intrinsics.checkNotNull(stringExtra6);
        this.applicantLName = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("fullName");
        Intrinsics.checkNotNull(stringExtra7);
        this.fullName = stringExtra7;
        String stringExtra8 = getIntent().getStringExtra("relationship");
        Intrinsics.checkNotNull(stringExtra8);
        this.relationShipCd = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("relationFName");
        Intrinsics.checkNotNull(stringExtra9);
        this.relationFName = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("relationMName");
        Intrinsics.checkNotNull(stringExtra10);
        this.relationMName = stringExtra10;
        String stringExtra11 = getIntent().getStringExtra("relationLName");
        Intrinsics.checkNotNull(stringExtra11);
        this.relationLName = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("gender");
        Intrinsics.checkNotNull(stringExtra12);
        this.gender = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra13);
        this.dob = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("placeOfBirth");
        Intrinsics.checkNotNull(stringExtra14);
        this.placeOfBirth = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("country");
        Intrinsics.checkNotNull(stringExtra15);
        this.country = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("educationQualification");
        Intrinsics.checkNotNull(stringExtra16);
        this.eduQualification = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("bloodGroup");
        Intrinsics.checkNotNull(stringExtra17);
        this.bloodGroup = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("applicantMobileNo");
        Intrinsics.checkNotNull(stringExtra18);
        this.mobileNo = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("emailId");
        Intrinsics.checkNotNull(stringExtra19);
        this.emailID = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("altMobileNo");
        Intrinsics.checkNotNull(stringExtra20);
        this.altMobileNo = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("landlineNo");
        Intrinsics.checkNotNull(stringExtra21);
        this.landlineNo = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("identificationMark1");
        Intrinsics.checkNotNull(stringExtra22);
        this.idMark1 = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("identificationMark2");
        Intrinsics.checkNotNull(stringExtra23);
        this.idMark2 = stringExtra23;
        this.enteredAge = getIntent().getIntExtra("enteredAge", 0);
        String stringExtra24 = getIntent().getStringExtra("campDesc");
        Intrinsics.checkNotNull(stringExtra24);
        this.cmCampDesc = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("cmType");
        Intrinsics.checkNotNull(stringExtra25);
        this.cmType = stringExtra25;
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.z.setText(this.stateCd);
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar3;
        }
        jcVar2.G.setText(this.stateCd);
        if (getIntent().hasExtra("dataFromAadhar") && getIntent().getBooleanExtra("dataFromAadhar", false)) {
            Serializable serializableExtra = getIntent().getSerializableExtra("aadharData");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
            this.adharData = (DOEkycX) serializableExtra;
            this.ekycID = getIntent().getLongExtra("ekycId", 0L);
            this.haveAadhaarData = getIntent().getBooleanExtra("dataFromAadhar", false);
        }
        X2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(String villaOrTown) {
        try {
            jc jcVar = this.binding;
            jc jcVar2 = null;
            if (jcVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar = null;
            }
            String string = jcVar.E.getContentDescription().toString();
            f2();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            jc jcVar3 = this.binding;
            if (jcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar3 = null;
            }
            String string2 = jcVar3.G.getContentDescription().toString();
            jc jcVar4 = this.binding;
            if (jcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jcVar2 = jcVar4;
            }
            xh0Var.o(string2, jcVar2.F.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void s2() {
        S2(this);
        W2(new wa3(k2()));
        V2(new wl5(k2()));
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.U.f.setText(q2().k());
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar3 = null;
        }
        jcVar3.U.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.t2(this.a, view);
            }
        });
        T2(new ProgressDialog(k2()));
        l2().setMessage(r2().b("label_challan_please_wait", getString(R.string.please_wait)));
        l2().setCancelable(false);
        l2().setCanceledOnTouchOutside(false);
        R2(ClInter.INSTANCE.a(k2()));
        Q2((kl0) new z(this, new sn0(new jl0(j2()))).a(kl0.class));
        jc jcVar4 = this.binding;
        if (jcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar4 = null;
        }
        jcVar4.S.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.u2(this.a, view);
            }
        });
        jc jcVar5 = this.binding;
        if (jcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar5;
        }
        jcVar2.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.w2(this.a, view);
            }
        });
    }

    public static final void t2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void u2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        jc jcVar = null;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        final PopupWindow popupWindow = new PopupWindow(viewInflate, (int) (((double) this$0.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        TextView textView = (TextView) viewInflate.findViewById(R.id.infoMessageTv);
        ((ImageView) viewInflate.findViewById(R.id.closeIv)).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LearnerLicenceAddressScreen.v2(popupWindow, view2);
            }
        });
        textView.setText(this$0.r2().b("below_line_print_on_dl", "The Address 3 & Pincode lines will be printed on driving licence"));
        jc jcVar2 = this$0.binding;
        if (jcVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar = jcVar2;
        }
        popupWindow.showAsDropDown(jcVar.Z, 0, 10);
    }

    public static final void v2(PopupWindow popupWindow, View view) {
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    public static final void w2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) LearnerLicenceAadharScreen.class));
        this$0.finish();
    }

    private final boolean x2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        Editable text = jcVar.z.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, r2().b("select_state", getString(R.string.select_state)), 0).show();
            return false;
        }
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar3 = null;
        }
        Editable text2 = jcVar3.y.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this, r2().b("select_district", getString(R.string.select_district)), 0).show();
            return false;
        }
        jc jcVar4 = this.binding;
        if (jcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar4 = null;
        }
        Editable text3 = jcVar4.x.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, r2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
            return false;
        }
        jc jcVar5 = this.binding;
        if (jcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar5 = null;
        }
        Editable text4 = jcVar5.N.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this, r2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
            return false;
        }
        jc jcVar6 = this.binding;
        if (jcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar6 = null;
        }
        Editable text5 = jcVar6.O.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, r2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
            return false;
        }
        jc jcVar7 = this.binding;
        if (jcVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar7 = null;
        }
        if (jcVar7.O.getText().length() < 6) {
            Toast.makeText(this, r2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        jc jcVar8 = this.binding;
        if (jcVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar8 = null;
        }
        Editable text6 = jcVar8.V.getText();
        Intrinsics.checkNotNull(text6);
        if (text6.length() > 0) {
            jc jcVar9 = this.binding;
            if (jcVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar9 = null;
            }
            if (Integer.parseInt(String.valueOf(jcVar9.V.getText())) > 11) {
                Toast.makeText(this, r2().b("duration_month_0_12", "Month duration should be 0 to 12"), 0).show();
                return false;
            }
        }
        jc jcVar10 = this.binding;
        if (jcVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar10 = null;
        }
        Editable text7 = jcVar10.G.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, r2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        if (!this.haveAadhaarData) {
            jc jcVar11 = this.binding;
            if (jcVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar11 = null;
            }
            Editable text8 = jcVar11.F.getText();
            Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
            if (text8.length() == 0) {
                Toast.makeText(this, r2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
                return false;
            }
        }
        if (!this.haveAadhaarData) {
            jc jcVar12 = this.binding;
            if (jcVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar12 = null;
            }
            Editable text9 = jcVar12.E.getText();
            Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
            if (text9.length() == 0) {
                Toast.makeText(this, r2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
                return false;
            }
        }
        if (!this.haveAadhaarData) {
            jc jcVar13 = this.binding;
            if (jcVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar13 = null;
            }
            Editable text10 = jcVar13.B.getText();
            Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
            if (text10.length() == 0) {
                Toast.makeText(this, r2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
                return false;
            }
        }
        if (!this.haveAadhaarData) {
            jc jcVar14 = this.binding;
            if (jcVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jcVar14 = null;
            }
            Editable text11 = jcVar14.C.getText();
            Intrinsics.checkNotNullExpressionValue(text11, "getText(...)");
            if (text11.length() == 0) {
                Toast.makeText(this, r2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
                return false;
            }
        }
        if (this.haveAadhaarData) {
            return true;
        }
        jc jcVar15 = this.binding;
        if (jcVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar15;
        }
        if (jcVar2.C.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, r2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    private final void y2() {
        jc jcVar = this.binding;
        jc jcVar2 = null;
        if (jcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar = null;
        }
        jcVar.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.z2(this.a, view);
            }
        });
        jc jcVar3 = this.binding;
        if (jcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar3 = null;
        }
        jcVar3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.A2(this.a, view);
            }
        });
        jc jcVar4 = this.binding;
        if (jcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar4 = null;
        }
        jcVar4.M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.B2(this.a, view);
            }
        });
        jc jcVar5 = this.binding;
        if (jcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar5 = null;
        }
        jcVar5.s0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.xc3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                LearnerLicenceAddressScreen.C2(this.a, radioGroup, i);
            }
        });
        jc jcVar6 = this.binding;
        if (jcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar6 = null;
        }
        jcVar6.F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.D2(this.a, view);
            }
        });
        jc jcVar7 = this.binding;
        if (jcVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar7 = null;
        }
        jcVar7.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.E2(this.a, view);
            }
        });
        jc jcVar8 = this.binding;
        if (jcVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar8 = null;
        }
        jcVar8.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ad3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.F2(this.a, view);
            }
        });
        jc jcVar9 = this.binding;
        if (jcVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar9 = null;
        }
        jcVar9.K.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.bd3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                LearnerLicenceAddressScreen.G2(this.a, radioGroup, i);
            }
        });
        jc jcVar10 = this.binding;
        if (jcVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVar10 = null;
        }
        jcVar10.X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.cd3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LearnerLicenceAddressScreen.H2(this.a, compoundButton, z);
            }
        });
        jc jcVar11 = this.binding;
        if (jcVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar2 = jcVar11;
        }
        jcVar2.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAddressScreen.I2(this.a, view);
            }
        });
    }

    public static final void z2(LearnerLicenceAddressScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.J2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.k2(), this$0.r2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currStateCd = str;
    }

    public final void Q2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void R2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void S2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void T2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void U2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perStateCd = str;
    }

    public final void V2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void W2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String g2() {
        String str = this.currStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currStateCd");
        return null;
    }

    public final ClInter j2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final Context k2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog l2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String m2() {
        String str = this.perStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("perStateCd");
        return null;
    }

    /* JADX INFO: renamed from: n2, reason: from getter */
    public final DlAddress getPermanentAdd() {
        return this.permanentAdd;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jc jcVarX = jc.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jcVarX, "inflate(...)");
        this.binding = jcVarX;
        jc jcVar = null;
        if (jcVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jcVarX = null;
        }
        setContentView(jcVarX.m());
        ta3.a aVar = ta3.a;
        jc jcVar2 = this.binding;
        if (jcVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jcVar = jcVar2;
        }
        aVar.c1(this, jcVar);
        i2();
        s2();
        Y1();
        Z1();
        y2();
    }

    /* JADX INFO: renamed from: p2, reason: from getter */
    public final DlAddress getPresentAdd() {
        return this.presentAdd;
    }

    public final wl5 q2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 r2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }
}
