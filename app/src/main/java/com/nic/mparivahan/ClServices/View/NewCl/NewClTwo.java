package com.nic.mparivahan.ClServices.View.NewCl;

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
import com.nic.mparivahan.ClServices.View.NewCl.NewClTwo;
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
import com.zepto.d86;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.xh0;
import com.zepto.yd;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bZ\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\"\u0010T\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010I\"\u0004\bS\u0010KR\"\u0010X\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010G\u001a\u0004\bV\u0010I\"\u0004\bW\u0010KR\"\u0010\\\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010G\u001a\u0004\bZ\u0010I\"\u0004\b[\u0010KR\"\u0010`\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010G\u001a\u0004\b^\u0010I\"\u0004\b_\u0010KR\"\u0010d\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010G\u001a\u0004\bb\u0010I\"\u0004\bc\u0010KR\"\u0010h\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010G\u001a\u0004\bf\u0010I\"\u0004\bg\u0010KR\"\u0010l\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010G\u001a\u0004\bj\u0010I\"\u0004\bk\u0010KR\"\u0010p\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010G\u001a\u0004\bn\u0010I\"\u0004\bo\u0010KR\"\u0010t\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010G\u001a\u0004\br\u0010I\"\u0004\bs\u0010KR\"\u0010x\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010G\u001a\u0004\bv\u0010I\"\u0004\bw\u0010KR\"\u0010|\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010G\u001a\u0004\bz\u0010I\"\u0004\b{\u0010KR#\u0010\u0080\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010G\u001a\u0004\b~\u0010I\"\u0004\b\u007f\u0010KR&\u0010\u0084\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010G\u001a\u0005\b\u0082\u0001\u0010I\"\u0005\b\u0083\u0001\u0010KR&\u0010\u0088\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010G\u001a\u0005\b\u0086\u0001\u0010I\"\u0005\b\u0087\u0001\u0010KR&\u0010\u008c\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010G\u001a\u0005\b\u008a\u0001\u0010I\"\u0005\b\u008b\u0001\u0010KR&\u0010\u0090\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010G\u001a\u0005\b\u008e\u0001\u0010I\"\u0005\b\u008f\u0001\u0010KR&\u0010\u0094\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010G\u001a\u0005\b\u0092\u0001\u0010I\"\u0005\b\u0093\u0001\u0010KR&\u0010\u0098\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010G\u001a\u0005\b\u0096\u0001\u0010I\"\u0005\b\u0097\u0001\u0010KR\u001a\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010¤\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R%\u0010±\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010®\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R%\u0010´\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010°\u0001R%\u0010¶\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010°\u0001R%\u0010¹\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010·\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010°\u0001R%\u0010»\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010·\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010°\u0001R%\u0010¾\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010¼\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010°\u0001R%\u0010À\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010¼\u0001\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010°\u0001R\u0018\u0010Â\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÁ\u0001\u0010GR*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Î\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Å\u0001\u001a\u0006\bÌ\u0001\u0010Ç\u0001\"\u0006\bÍ\u0001\u0010É\u0001R&\u0010Ò\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÏ\u0001\u0010G\u001a\u0005\bÐ\u0001\u0010I\"\u0005\bÑ\u0001\u0010KR&\u0010Ö\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÓ\u0001\u0010G\u001a\u0005\bÔ\u0001\u0010I\"\u0005\bÕ\u0001\u0010K¨\u0006Ù\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/NewCl/NewClTwo;", "Lcom/zepto/pq;", "", "H2", "T1", "U1", "J2", "", "fromWhere", "Y2", "X2", "Z2", "V1", "W1", "X1", "Y1", "Z1", "a2", "villaOrTown", "o2", "x2", "a3", "d3", "message", "b3", "", "I2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/yd;", "C", "Lcom/zepto/yd;", "p2", "()Lcom/zepto/yd;", "r3", "(Lcom/zepto/yd;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "r2", "()Landroid/content/Context;", "u3", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "u2", "()Landroid/app/ProgressDialog;", "x3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "F2", "()Lcom/zepto/wa3;", "F3", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "E2", "()Lcom/zepto/wl5;", "E3", "(Lcom/zepto/wl5;)V", "sarathiSession", "H", "Ljava/lang/String;", "h2", "()Ljava/lang/String;", "k3", "(Ljava/lang/String;)V", "clFirstName", "I", "j2", "m3", "clMiddleName", "J", "i2", "l3", "clLastName", "K", "m2", "p3", "clRelation", "L", "z2", "z3", "relFirstName", "M", "B2", "B3", "relMiddleName", "N", "A2", "A3", "relLastName", "O", "c2", "f3", "appGender", "P", "b2", "e3", "appDob", "Q", "f2", "i3", "clEdu", "R", "e2", "h3", "clBlood", "S", "l2", "o3", "clPhone", "T", "g2", "j3", "clEmail", "U", "k2", "n3", "clMobile", "V", "d2", "g3", "clAlterMobile", "W", "s2", "v3", "mark1", "X", "t2", "w3", "mark2", "Y", "G2", "G3", "state_code", "Z", "C2", "C3", "rto_code", "a0", "D2", "D3", "rto_name", "Lcom/zepto/xh0;", "b0", "Lcom/zepto/xh0;", "viewModel", "Lcom/zepto/kl0;", "c0", "Lcom/zepto/kl0;", "getMClDlViewModel", "()Lcom/zepto/kl0;", "s3", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "d0", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "q2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "t3", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "", "Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "e0", "Ljava/util/List;", "mStateList", "Lcom/nic/mparivahan/dlservices/data/model/DistrictsMasterItem;", "f0", "mCurrDistList", "g0", "mPermDistList", "Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "h0", "mCurrTalukaList", "i0", "mPermTalukaList", "Lcom/nic/mparivahan/dlservices/data/model/VillageOrTownMasterItem;", "j0", "mCurrVillageOrTownList", "k0", "mPermVillageOrTownList", "l0", "isCurrentOrPermanentAddress", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "m0", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "y2", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "n0", "w2", "setPermanentAdd", "permanentAdd", "o0", "n2", "q3", "currStateCd", "p0", "v2", "y3", "perStateCd", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNewClTwo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewClTwo.kt\ncom/nic/mparivahan/ClServices/View/NewCl/NewClTwo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1015:1\n1855#2,2:1016\n1855#2,2:1018\n1855#2,2:1020\n1855#2,2:1022\n1855#2,2:1024\n1855#2,2:1026\n1855#2,2:1028\n*S KotlinDebug\n*F\n+ 1 NewClTwo.kt\ncom/nic/mparivahan/ClServices/View/NewCl/NewClTwo\n*L\n536#1:1016,2\n591#1:1018,2\n593#1:1020,2\n646#1:1022,2\n650#1:1024,2\n800#1:1026,2\n802#1:1028,2\n*E\n"})
public final class NewClTwo extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public yd mBinding;

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

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String clMiddleName;

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

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public xh0 viewModel;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public List mStateList;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public List mCurrDistList;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public List mPermDistList;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public List mCurrTalukaList;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public List mPermTalukaList;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public List mCurrVillageOrTownList;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public List mPermVillageOrTownList;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String isCurrentOrPermanentAddress = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String currStateCd;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String perStateCd;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(StateResponse stateResponse) {
            try {
                NewClTwo.this.u2().dismiss();
                if (Intrinsics.areEqual(stateResponse.getStatusCode(), "00")) {
                    if (stateResponse.getStateMaster() != null && (!r0.isEmpty())) {
                        NewClTwo.this.mStateList = stateResponse.getStateMaster();
                    }
                } else {
                    NewClTwo newClTwo = NewClTwo.this;
                    newClTwo.b3(newClTwo.F2().b("no_details", NewClTwo.this.getString(R.string.no_Details_are_avail)));
                }
            } catch (Exception unused) {
                NewClTwo newClTwo2 = NewClTwo.this;
                newClTwo2.b3(newClTwo2.F2().b("service_is_not_present", NewClTwo.this.getString(R.string.unable_to_get_details)));
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
            try {
                NewClTwo.this.u2().dismiss();
                if (Intrinsics.areEqual(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    NewClTwo.this.mCurrDistList = distResponse.getDistMaster();
                    NewClTwo.this.mPermDistList = distResponse.getDistMaster();
                } else {
                    NewClTwo newClTwo = NewClTwo.this;
                    newClTwo.b3(newClTwo.F2().b("no_details", NewClTwo.this.getString(R.string.unable_to_get_details)));
                }
            } catch (Exception unused) {
                NewClTwo newClTwo2 = NewClTwo.this;
                newClTwo2.b3(newClTwo2.F2().b("service_is_not_present", NewClTwo.this.getString(R.string.unable_to_get_details)));
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
            try {
                NewClTwo.this.u2().dismiss();
                if (!Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "01")) {
                        NewClTwo newClTwo = NewClTwo.this;
                        newClTwo.b3(newClTwo.F2().b("no_taluka_found", ""));
                    } else {
                        NewClTwo newClTwo2 = NewClTwo.this;
                        newClTwo2.b3(newClTwo2.F2().b("no_details", NewClTwo.this.getString(R.string.unable_to_get_details)));
                    }
                } else if (Intrinsics.areEqual(NewClTwo.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    NewClTwo.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                } else {
                    NewClTwo.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                NewClTwo newClTwo3 = NewClTwo.this;
                newClTwo3.b3(newClTwo3.F2().b("service_is_not_present", NewClTwo.this.getString(R.string.unable_to_get_details)));
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
                NewClTwo.this.u2().dismiss();
                if (!Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    NewClTwo newClTwo = NewClTwo.this;
                    newClTwo.b3(newClTwo.F2().b("no_vill_found", ""));
                } else if (Intrinsics.areEqual(NewClTwo.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    NewClTwo.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                } else {
                    NewClTwo.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                NewClTwo newClTwo2 = NewClTwo.this;
                newClTwo2.b3(newClTwo2.F2().b("service_is_not_present", NewClTwo.this.getString(R.string.unable_to_get_details)));
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
            String str2 = NewClTwo.this.isCurrentOrPermanentAddress;
            xh0 xh0Var = null;
            if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                List list = NewClTwo.this.mCurrDistList;
                String distCode = (list == null || (districtsMasterItem2 = (DistrictsMasterItem) list.get(i)) == null) ? null : districtsMasterItem2.getDistCode();
                NewClTwo.this.p2().x.setText(str);
                NewClTwo.this.p2().x.setContentDescription(distCode);
                NewClTwo.this.getPresentAdd().setDistrict(distCode);
                NewClTwo.this.W1();
                if (distCode != null) {
                    NewClTwo newClTwo = NewClTwo.this;
                    newClTwo.u2().dismiss();
                    xh0 xh0Var2 = newClTwo.viewModel;
                    if (xh0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var2;
                    }
                    xh0Var.n(newClTwo.p2().y.getContentDescription().toString(), distCode);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                List list2 = NewClTwo.this.mPermDistList;
                String distCode2 = (list2 == null || (districtsMasterItem = (DistrictsMasterItem) list2.get(i)) == null) ? null : districtsMasterItem.getDistCode();
                NewClTwo.this.p2().E.setText(str);
                NewClTwo.this.p2().E.setContentDescription(distCode2);
                NewClTwo.this.getPermanentAdd().setDistrict(distCode2);
                NewClTwo.this.Z1();
                if (distCode2 != null) {
                    NewClTwo newClTwo2 = NewClTwo.this;
                    newClTwo2.u2().dismiss();
                    xh0 xh0Var3 = newClTwo2.viewModel;
                    if (xh0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var3;
                    }
                    xh0Var.n(newClTwo2.p2().F.getContentDescription().toString(), distCode2);
                }
            }
        }
    }

    public static final class f implements d86.b {
        public f() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            StateMasterItem stateMasterItem;
            StateMasterItem stateMasterItem2;
            String str2 = NewClTwo.this.isCurrentOrPermanentAddress;
            xh0 xh0Var = null;
            try {
                if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                    NewClTwo newClTwo = NewClTwo.this;
                    List list = newClTwo.mStateList;
                    String stateCode = (list == null || (stateMasterItem2 = (StateMasterItem) list.get(i)) == null) ? null : stateMasterItem2.getStateCode();
                    Intrinsics.checkNotNull(stateCode);
                    newClTwo.q3(stateCode);
                    NewClTwo.this.p2().y.setText(str);
                    NewClTwo.this.p2().y.setContentDescription(NewClTwo.this.n2());
                    NewClTwo.this.V1();
                    String strN2 = NewClTwo.this.n2();
                    if (strN2 != null) {
                        NewClTwo newClTwo2 = NewClTwo.this;
                        newClTwo2.u2().dismiss();
                        xh0 xh0Var2 = newClTwo2.viewModel;
                        if (xh0Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            xh0Var = xh0Var2;
                        }
                        xh0Var.g(strN2);
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                    NewClTwo newClTwo3 = NewClTwo.this;
                    List list2 = newClTwo3.mStateList;
                    String stateCode2 = (list2 == null || (stateMasterItem = (StateMasterItem) list2.get(i)) == null) ? null : stateMasterItem.getStateCode();
                    Intrinsics.checkNotNull(stateCode2);
                    newClTwo3.y3(stateCode2);
                    NewClTwo.this.p2().F.setText(str);
                    NewClTwo.this.p2().F.setContentDescription(NewClTwo.this.v2());
                    NewClTwo.this.Y1();
                    String strV2 = NewClTwo.this.v2();
                    if (strV2 != null) {
                        NewClTwo newClTwo4 = NewClTwo.this;
                        newClTwo4.u2().dismiss();
                        xh0 xh0Var3 = newClTwo4.viewModel;
                        if (xh0Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            xh0Var = xh0Var3;
                        }
                        xh0Var.g(strV2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final class g implements d86.b {
        public final /* synthetic */ Ref.ObjectRef b;

        public g(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            String subDistcode = null;
            if (Intrinsics.areEqual(NewClTwo.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = NewClTwo.this.mCurrTalukaList;
                if (list != null && (talukaMasterItem2 = (TalukaMasterItem) list.get(i)) != null) {
                    subDistcode = talukaMasterItem2.getSubDistcode();
                }
                NewClTwo.this.p2().w.setText(str);
                NewClTwo.this.p2().w.setContentDescription(subDistcode);
                NewClTwo.this.getPresentAdd().setSubDistrict(subDistcode);
                NewClTwo.this.o2((String) this.b.element);
                NewClTwo.this.p2().M.setText(((Object) NewClTwo.this.p2().w.getText()) + ", " + ((Object) NewClTwo.this.p2().x.getText()) + ", " + ((Object) NewClTwo.this.p2().y.getText()));
                return;
            }
            List list2 = NewClTwo.this.mPermTalukaList;
            if (list2 != null && (talukaMasterItem = (TalukaMasterItem) list2.get(i)) != null) {
                subDistcode = talukaMasterItem.getSubDistcode();
            }
            NewClTwo.this.p2().D.setText(str);
            NewClTwo.this.p2().D.setContentDescription(subDistcode);
            NewClTwo.this.getPermanentAdd().setSubDistrict(subDistcode);
            NewClTwo.this.x2((String) this.b.element);
            NewClTwo.this.p2().A.setText(((Object) NewClTwo.this.p2().D.getText()) + ", " + ((Object) NewClTwo.this.p2().E.getText()) + ", " + ((Object) NewClTwo.this.p2().F.getText()));
        }
    }

    public static final class h implements d86.b {
        public h() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            String villageCode = null;
            if (Intrinsics.areEqual(NewClTwo.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = NewClTwo.this.mCurrVillageOrTownList;
                if (list != null && (villageOrTownMasterItem2 = (VillageOrTownMasterItem) list.get(i)) != null) {
                    villageCode = villageOrTownMasterItem2.getVillageCode();
                }
                NewClTwo.this.p2().L.setText(str);
                NewClTwo.this.p2().L.setContentDescription(villageCode);
                NewClTwo.this.getPresentAdd().setVillageOrTown(villageCode);
                return;
            }
            List list2 = NewClTwo.this.mPermVillageOrTownList;
            if (list2 != null && (villageOrTownMasterItem = (VillageOrTownMasterItem) list2.get(i)) != null) {
                villageCode = villageOrTownMasterItem.getVillageCode();
            }
            NewClTwo.this.p2().G.setText(str);
            NewClTwo.this.p2().G.setContentDescription(villageCode);
            NewClTwo.this.getPermanentAdd().setVillageOrTown(villageCode);
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

    private final void H2() {
        F3(new wa3(r2()));
        E3(new wl5(r2()));
        x3(new ProgressDialog(r2()));
        u2().setMessage(F2().b("label_challan_please_wait", getString(R.string.please_wait)));
        u2().setCancelable(false);
        u2().setCanceledOnTouchOutside(false);
        p2().W.g.setText(E2().k());
        t3(ClInter.INSTANCE.a(r2()));
        s3((kl0) new z(this, new sn0(new jl0(q2()))).a(kl0.class));
        if (getIntent() != null) {
            G3(String.valueOf(getIntent().getStringExtra("state_code")));
            C3(String.valueOf(getIntent().getStringExtra("rto_code")));
            D3(String.valueOf(getIntent().getStringExtra("rto_name")));
            k3(String.valueOf(getIntent().getStringExtra("clFirstName")));
            m3(String.valueOf(getIntent().getStringExtra("clMiddleName")));
            l3(String.valueOf(getIntent().getStringExtra("clLastName")));
            p3(String.valueOf(getIntent().getStringExtra("clRelation")));
            z3(String.valueOf(getIntent().getStringExtra("relFirstName")));
            B3(String.valueOf(getIntent().getStringExtra("relMiddleName")));
            A3(String.valueOf(getIntent().getStringExtra("relLastName")));
            e3(String.valueOf(getIntent().getStringExtra("appDob")));
            i3(String.valueOf(getIntent().getStringExtra("clEdu")));
            h3(String.valueOf(getIntent().getStringExtra("clBlood")));
            o3(String.valueOf(getIntent().getStringExtra("clPhone")));
            j3(String.valueOf(getIntent().getStringExtra("clEmail")));
            n3(String.valueOf(getIntent().getStringExtra("clMobile")));
            g3(String.valueOf(getIntent().getStringExtra("clAlterMobile")));
            v3(String.valueOf(getIntent().getStringExtra("mark1")));
            w3(String.valueOf(getIntent().getStringExtra("mark2")));
            f3(String.valueOf(getIntent().getStringExtra("appGender")));
        }
    }

    private final boolean I2() {
        Editable text = p2().y.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, F2().b("select_state", getString(R.string.select_state)), 0).show();
            return false;
        }
        Editable text2 = p2().x.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this, F2().b("select_district", getString(R.string.select_district)), 0).show();
            return false;
        }
        Editable text3 = p2().w.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, F2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
            return false;
        }
        Editable text4 = p2().M.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this, F2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
            return false;
        }
        Editable text5 = p2().N.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, F2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
            return false;
        }
        if (p2().N.getText().length() < 6) {
            Toast.makeText(this, F2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        Editable text6 = p2().F.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, F2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        Editable text7 = p2().E.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, F2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
            return false;
        }
        Editable text8 = p2().D.getText();
        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
        if (text8.length() == 0) {
            Toast.makeText(this, F2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
            return false;
        }
        Editable text9 = p2().A.getText();
        Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
        if (text9.length() == 0) {
            Toast.makeText(this, F2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
            return false;
        }
        Editable text10 = p2().B.getText();
        Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
        if (text10.length() == 0) {
            Toast.makeText(this, F2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        if (p2().B.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, F2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    private final void J2() {
        p2().W.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.K2(this.a, view);
            }
        });
        p2().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.L2(this.a, view);
            }
        });
        p2().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.P2(this.a, view);
            }
        });
        p2().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.Q2(this.a, view);
            }
        });
        p2().L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.R2(this.a, view);
            }
        });
        p2().B0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.r64
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                NewClTwo.S2(this.a, radioGroup, i2);
            }
        });
        p2().F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.T2(this.a, view);
            }
        });
        p2().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.U2(this.a, view);
            }
        });
        p2().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.V2(this.a, view);
            }
        });
        p2().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.W2(this.a, view);
            }
        });
        p2().J.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.k64
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                NewClTwo.M2(this.a, radioGroup, i2);
            }
        });
        p2().f0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.l64
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NewClTwo.N2(this.a, compoundButton, z);
            }
        });
        p2().g0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.O2(this.a, view);
            }
        });
    }

    public static final void K2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void L2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Y2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.r2(), "Please Check Your Internet connection", 1).show();
        }
    }

    public static final void M2(NewClTwo this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mPermTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        switch (i2) {
            case R.id.dl_permanent_town_rb /* 2131362708 */:
                this$0.x2("U");
                break;
            case R.id.dl_permanent_village_rb /* 2131362709 */:
                this$0.x2("R");
                break;
        }
    }

    public static final void N2(NewClTwo this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (z) {
                this$0.d3();
            } else {
                this$0.permanentAdd = new DlAddress("", "", "", "", "", "", "", "");
                this$0.p2().E.setText("");
                this$0.p2().D.setText("");
                this$0.p2().G.setText("");
                this$0.p2().z.setText("");
                this$0.p2().C.setText("");
                this$0.p2().C.setText("");
                this$0.p2().C.setText("");
            }
            this$0.p2().z(this$0.permanentAdd);
            this$0.p2().a();
        } catch (Exception unused) {
        }
    }

    public static final void O2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.I2()) {
            try {
                Intent intent = new Intent(this$0, (Class<?>) NewClThree.class);
                intent.putExtra("state_code", this$0.G2());
                intent.putExtra("rto_code", this$0.C2());
                intent.putExtra("rto_name", this$0.D2());
                intent.putExtra("clFirstName", this$0.h2());
                if (Intrinsics.areEqual(this$0.j2(), "")) {
                    intent.putExtra("clMiddleName", "");
                } else {
                    intent.putExtra("clMiddleName", this$0.j2());
                }
                intent.putExtra("clLastName", this$0.i2());
                intent.putExtra("clRelation", this$0.m2());
                intent.putExtra("relFirstName", this$0.z2());
                if (Intrinsics.areEqual(this$0.B2(), "")) {
                    intent.putExtra("relMiddleName", "");
                } else {
                    intent.putExtra("relMiddleName", this$0.B2());
                }
                intent.putExtra("relLastName", this$0.A2());
                intent.putExtra("appGender", this$0.c2());
                intent.putExtra("appDob", this$0.b2());
                intent.putExtra("clEdu", this$0.f2());
                intent.putExtra("clBlood", this$0.e2());
                intent.putExtra("clPhone", this$0.l2());
                intent.putExtra("clEmail", this$0.g2());
                intent.putExtra("clMobile", this$0.k2());
                intent.putExtra("clAlterMobile", this$0.d2());
                intent.putExtra("mark1", this$0.s2());
                intent.putExtra("mark2", this$0.t2());
                intent.putExtra("presHouseNo", this$0.p2().K.getText().toString());
                intent.putExtra("presStreet", this$0.p2().O.getText().toString());
                intent.putExtra("presLocation", this$0.p2().M.getText().toString());
                intent.putExtra("presVillageOrTown", this$0.presentAdd.getVillageOrTown());
                intent.putExtra("presSubDistrict", this$0.presentAdd.getSubDistrict());
                intent.putExtra("presDistrict", this$0.presentAdd.getDistrict());
                intent.putExtra("presState", this$0.n2());
                intent.putExtra("presPincode", this$0.p2().N.getText().toString());
                intent.putExtra("perHouseNo", this$0.p2().z.getText().toString());
                intent.putExtra("perStreet", this$0.p2().C.getText().toString());
                intent.putExtra("perLocation", this$0.p2().A.getText().toString());
                intent.putExtra("permVillageOrTown", this$0.permanentAdd.getVillageOrTown());
                intent.putExtra("perSubDistrict", this$0.permanentAdd.getSubDistrict());
                intent.putExtra("perDistrict", this$0.permanentAdd.getDistrict());
                intent.putExtra("perState", this$0.v2());
                intent.putExtra("perPinCode", this$0.p2().N.getText().toString());
                intent.putExtra("permanentAdd", this$0.permanentAdd);
                Editable text = this$0.p2().L.getText();
                if (text == null || text.length() == 0) {
                    intent.putExtra("presVillageOrTownName", "NA");
                } else {
                    intent.putExtra("presVillageOrTownName", this$0.p2().L.getText().toString());
                }
                Editable text2 = this$0.p2().G.getText();
                if (text2 == null || text2.length() == 0) {
                    intent.putExtra("permVillageOrTownName", "NA");
                } else {
                    intent.putExtra("permVillageOrTownName", this$0.p2().G.getText().toString());
                }
                this$0.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public static final void P2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.X2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.r2(), this$0.F2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void Q2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Z2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.r2(), this$0.F2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void R2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.a3("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.r2(), this$0.F2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void S2(NewClTwo this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        if (i2 == R.id.town_rb) {
            this$0.o2("U");
        } else {
            if (i2 != R.id.village_rb) {
                return;
            }
            this$0.o2("R");
        }
    }

    private final void T1() {
        this.viewModel = (xh0) new z(this).a(xh0.class);
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(r2(), "Please Check Your Internet connection", 1).show();
            return;
        }
        u2().show();
        xh0 xh0Var = this.viewModel;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.m();
    }

    public static final void T2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Y2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.r2(), "Please Check Your Internet connection", 1).show();
        }
    }

    private final void U1() {
        xh0 xh0Var = this.viewModel;
        xh0 xh0Var2 = null;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.i().g(this, new i(new a()));
        xh0 xh0Var3 = this.viewModel;
        if (xh0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var3 = null;
        }
        xh0Var3.h().g(this, new i(new b()));
        xh0 xh0Var4 = this.viewModel;
        if (xh0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var4 = null;
        }
        xh0Var4.k().g(this, new i(new c()));
        xh0 xh0Var5 = this.viewModel;
        if (xh0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            xh0Var2 = xh0Var5;
        }
        xh0Var2.l().g(this, new i(new d()));
    }

    public static final void U2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.X2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.r2(), this$0.F2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void V2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Z2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.r2(), this$0.F2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1() {
        p2().w.setText("");
        p2().w.setHint(F2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        X1();
        X1();
    }

    public static final void W2(NewClTwo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.a3("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.r2(), this$0.F2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    private final void X1() {
        p2().L.setText("");
        p2().L.setHint(F2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mCurrVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    private final void X2(String fromWhere) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1() {
        p2().D.setText("");
        p2().D.setHint(F2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mPermTalukaList = CollectionsKt__CollectionsKt.emptyList();
        a2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Z2(String fromWhere) {
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
                if (p2().h0.isChecked()) {
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
                if (p2().H.isChecked()) {
                    t2 = "U";
                }
                objectRef.element = t2;
            }
            d86 d86VarA = d86.INSTANCE.a("Select Taluka", arrayList);
            d86VarA.k2(I0(), "TalukaPicker");
            d86VarA.n2(new g(objectRef));
        } catch (Exception unused) {
        }
    }

    private final void a2() {
        p2().G.setText("");
        p2().G.setHint(F2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mPermVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    private final void a3(String fromWhere) {
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
            d86VarA.n2(new h());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b3(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById3;
        ((TextView) viewFindViewById2).setText(message);
        ((TextView) viewFindViewById).setText(F2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClTwo.c3(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void c3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void d3() {
        try {
            this.permanentAdd = this.presentAdd;
            y3(n2());
            p2().F.setText(p2().y.getText());
            p2().E.setText(p2().x.getText());
            p2().D.setText(p2().w.getText());
            p2().G.setText(p2().L.getText());
            p2().z.setText(p2().K.getText());
            p2().C.setText(p2().O.getText());
            p2().A.setText(p2().M.getText());
            p2().B.setText(p2().N.getText());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(String villaOrTown) {
        try {
            String string = p2().w.getContentDescription().toString();
            X1();
            u2().dismiss();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.o(p2().y.getContentDescription().toString(), p2().x.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(String villaOrTown) {
        try {
            String string = p2().D.getContentDescription().toString();
            a2();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.o(p2().F.getContentDescription().toString(), p2().E.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    public final String A2() {
        String str = this.relLastName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relLastName");
        return null;
    }

    public final void A3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relLastName = str;
    }

    public final String B2() {
        String str = this.relMiddleName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relMiddleName");
        return null;
    }

    public final void B3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relMiddleName = str;
    }

    public final String C2() {
        String str = this.rto_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_code");
        return null;
    }

    public final void C3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_code = str;
    }

    public final String D2() {
        String str = this.rto_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_name");
        return null;
    }

    public final void D3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_name = str;
    }

    public final wl5 E2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void E3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final wa3 F2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void F3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String G2() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final void G3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final void V1() {
        p2().x.setText("");
        p2().x.setHint(F2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        W1();
    }

    public final void Y1() {
        p2().E.setText("");
        p2().E.setHint(F2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.mPermDistList = CollectionsKt__CollectionsKt.emptyList();
        Z1();
    }

    public final void Y2(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            ArrayList arrayList = new ArrayList();
            List<StateMasterItem> list = this.mStateList;
            if (list != null) {
                for (StateMasterItem stateMasterItem : list) {
                    arrayList.add(String.valueOf(stateMasterItem != null ? stateMasterItem.getStateName() : null));
                }
            }
            d86 d86VarA = d86.INSTANCE.a("Select State", arrayList);
            d86VarA.k2(I0(), "StatePicker");
            d86VarA.n2(new f());
        } catch (Exception unused) {
        }
    }

    public final String b2() {
        String str = this.appDob;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appDob");
        return null;
    }

    public final String c2() {
        String str = this.appGender;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appGender");
        return null;
    }

    public final String d2() {
        String str = this.clAlterMobile;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clAlterMobile");
        return null;
    }

    public final String e2() {
        String str = this.clBlood;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clBlood");
        return null;
    }

    public final void e3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appDob = str;
    }

    public final String f2() {
        String str = this.clEdu;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clEdu");
        return null;
    }

    public final void f3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appGender = str;
    }

    public final String g2() {
        String str = this.clEmail;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clEmail");
        return null;
    }

    public final void g3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clAlterMobile = str;
    }

    public final String h2() {
        String str = this.clFirstName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clFirstName");
        return null;
    }

    public final void h3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clBlood = str;
    }

    public final String i2() {
        String str = this.clLastName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clLastName");
        return null;
    }

    public final void i3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clEdu = str;
    }

    public final String j2() {
        String str = this.clMiddleName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clMiddleName");
        return null;
    }

    public final void j3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clEmail = str;
    }

    public final String k2() {
        String str = this.clMobile;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clMobile");
        return null;
    }

    public final void k3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clFirstName = str;
    }

    public final String l2() {
        String str = this.clPhone;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhone");
        return null;
    }

    public final void l3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clLastName = str;
    }

    public final String m2() {
        String str = this.clRelation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clRelation");
        return null;
    }

    public final void m3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clMiddleName = str;
    }

    public final String n2() {
        String str = this.currStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currStateCd");
        return null;
    }

    public final void n3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clMobile = str;
    }

    public final void o3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhone = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yd ydVarX = yd.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ydVarX, "inflate(...)");
        r3(ydVarX);
        setContentView(p2().m());
        u3(this);
        ta3.a.y1(this, p2());
        H2();
        T1();
        U1();
        J2();
    }

    public final yd p2() {
        yd ydVar = this.mBinding;
        if (ydVar != null) {
            return ydVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final void p3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clRelation = str;
    }

    public final ClInter q2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final void q3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currStateCd = str;
    }

    public final Context r2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void r3(yd ydVar) {
        Intrinsics.checkNotNullParameter(ydVar, "<set-?>");
        this.mBinding = ydVar;
    }

    public final String s2() {
        String str = this.mark1;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mark1");
        return null;
    }

    public final void s3(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final String t2() {
        String str = this.mark2;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mark2");
        return null;
    }

    public final void t3(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final ProgressDialog u2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void u3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final String v2() {
        String str = this.perStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("perStateCd");
        return null;
    }

    public final void v3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mark1 = str;
    }

    /* JADX INFO: renamed from: w2, reason: from getter */
    public final DlAddress getPermanentAdd() {
        return this.permanentAdd;
    }

    public final void w3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mark2 = str;
    }

    public final void x3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final DlAddress getPresentAdd() {
        return this.presentAdd;
    }

    public final void y3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perStateCd = str;
    }

    public final String z2() {
        String str = this.relFirstName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relFirstName");
        return null;
    }

    public final void z3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relFirstName = str;
    }
}
