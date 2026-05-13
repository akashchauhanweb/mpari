package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.FetchChallanLog.FetchChallanAssets.FetchChallaInterface;
import com.nic.mparivahan.FetchChallanLog.PojoChallan.FetchChallanResponse;
import com.nic.mparivahan.FetchVahanLog.FetchVahanLog.VahanInterface;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.FetchVahanLog.Pojo.VahanPojo;
import com.nic.mparivahan.FetchVahanLog.Staging.VahanInterfaceStaging;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationTransactionStatus;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.fetchSarathiLog.FetchSarathiAssets.SarathiInterface;
import com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.FetchSarathiPojo;
import com.zepto.ab2;
import com.zepto.bb2;
import com.zepto.da2;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.h67;
import com.zepto.i18;
import com.zepto.ja2;
import com.zepto.jv;
import com.zepto.ka2;
import com.zepto.mf4;
import com.zepto.ms1;
import com.zepto.os1;
import com.zepto.pq;
import com.zepto.ps1;
import com.zepto.pw;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.u92;
import com.zepto.w92;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.x92;
import com.zepto.xa2;
import com.zepto.y92;
import com.zepto.za2;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ!\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J!\u0010\u001b\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010A\u001a\b\u0012\u0004\u0012\u00020:098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010^\u001a\b\u0012\u0004\u0012\u00020Z098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010<\u001a\u0004\b\\\u0010>\"\u0004\b]\u0010@R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR(\u0010s\u001a\b\u0012\u0004\u0012\u00020o098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010<\u001a\u0004\bq\u0010>\"\u0004\br\u0010@R\u0016\u0010w\u001a\u00020t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R)\u0010\u0086\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010®\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010º\u0001\u001a\u00030·\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R'\u0010¿\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b\u0017\u0010K\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R'\u0010Â\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b\u001b\u0010K\u001a\u0006\bÀ\u0001\u0010¼\u0001\"\u0006\bÁ\u0001\u0010¾\u0001R(\u0010Æ\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÃ\u0001\u0010K\u001a\u0006\bÄ\u0001\u0010¼\u0001\"\u0006\bÅ\u0001\u0010¾\u0001R*\u0010Î\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R)\u0010Ö\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÓ\u0001\u0010\u0081\u0001\u001a\u0006\bÔ\u0001\u0010\u0083\u0001\"\u0006\bÕ\u0001\u0010\u0085\u0001R)\u0010Ú\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b×\u0001\u0010\u0081\u0001\u001a\u0006\bØ\u0001\u0010\u0083\u0001\"\u0006\bÙ\u0001\u0010\u0085\u0001R*\u0010â\u0001\u001a\u00030Û\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001a\u0010æ\u0001\u001a\u00030ã\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001¨\u0006é\u0001"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/FetchVahanViews/FetchVahanTransactions;", "Lcom/zepto/pq;", "Lcom/zepto/ps1;", "Lcom/zepto/os1;", "Lcom/zepto/ms1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "c2", "e2", "a2", "", "vahlogRecordId", "position", "D", "(Ljava/lang/Integer;I)V", "vahlogApplicationId", "sCd", "Z", "recordId", "E", "", "a0", "(Ljava/lang/Long;I)V", "C", "Landroid/content/Context;", "v1", "()Landroid/content/Context;", "h2", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "L1", "()Landroidx/recyclerview/widget/RecyclerView;", "y2", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rv_vahan_trans", "Lcom/zepto/za2;", "Lcom/zepto/za2;", "D1", "()Lcom/zepto/za2;", "p2", "(Lcom/zepto/za2;)V", "mFetchVahanVM", "Lcom/nic/mparivahan/FetchVahanLog/FetchVahanLog/VahanInterface;", "F", "Lcom/nic/mparivahan/FetchVahanLog/FetchVahanLog/VahanInterface;", "I1", "()Lcom/nic/mparivahan/FetchVahanLog/FetchVahanLog/VahanInterface;", "u2", "(Lcom/nic/mparivahan/FetchVahanLog/FetchVahanLog/VahanInterface;)V", "mVahanInterface", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/FetchVahanLog/Pojo/VahanLog;", "G", "Ljava/util/ArrayList;", "E1", "()Ljava/util/ArrayList;", "q2", "(Ljava/util/ArrayList;)V", "mListVal", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "H1", "()Lcom/zepto/ws6;", "t2", "(Lcom/zepto/ws6;)V", "mSession", "Lcom/zepto/y92;", "I", "Lcom/zepto/y92;", "A1", "()Lcom/zepto/y92;", "m2", "(Lcom/zepto/y92;)V", "mFetchSarathVMi", "Lcom/nic/mparivahan/fetchSarathiLog/FetchSarathiAssets/SarathiInterface;", "J", "Lcom/nic/mparivahan/fetchSarathiLog/FetchSarathiAssets/SarathiInterface;", "G1", "()Lcom/nic/mparivahan/fetchSarathiLog/FetchSarathiAssets/SarathiInterface;", "s2", "(Lcom/nic/mparivahan/fetchSarathiLog/FetchSarathiAssets/SarathiInterface;)V", "mSarathiInterface", "Lcom/nic/mparivahan/fetchSarathiLog/FetchSarthiPojo/SarathiLog;", "K", "M1", "z2", "sListVal", "Lcom/zepto/w92;", "L", "Lcom/zepto/w92;", "z1", "()Lcom/zepto/w92;", "l2", "(Lcom/zepto/w92;)V", "mFetchChallanVM", "Lcom/nic/mparivahan/FetchChallanLog/FetchChallanAssets/FetchChallaInterface;", "M", "Lcom/nic/mparivahan/FetchChallanLog/FetchChallanAssets/FetchChallaInterface;", "x1", "()Lcom/nic/mparivahan/FetchChallanLog/FetchChallanAssets/FetchChallaInterface;", "j2", "(Lcom/nic/mparivahan/FetchChallanLog/FetchChallanAssets/FetchChallaInterface;)V", "mFetchChallaInterface", "Lcom/nic/mparivahan/FetchChallanLog/PojoChallan/MparEchallanLog;", "N", "F1", "r2", "mMparEchallanLog", "Lcom/zepto/jv;", "O", "Lcom/zepto/jv;", "viewModel", "Lcom/zepto/ev;", "P", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "R", "Ljava/lang/String;", "P1", "()Ljava/lang/String;", "C2", "(Ljava/lang/String;)V", "trans_val", "Landroid/widget/TextView;", "S", "Landroid/widget/TextView;", "getMy_transations", "()Landroid/widget/TextView;", "v2", "(Landroid/widget/TextView;)V", "my_transations", "Landroid/widget/RelativeLayout;", "T", "Landroid/widget/RelativeLayout;", "K1", "()Landroid/widget/RelativeLayout;", "x2", "(Landroid/widget/RelativeLayout;)V", "rl_notransaction", "Landroid/widget/ProgressBar;", "U", "Landroid/widget/ProgressBar;", "O1", "()Landroid/widget/ProgressBar;", "B2", "(Landroid/widget/ProgressBar;)V", "trans_bar", "Lcom/zepto/ja2;", "V", "Lcom/zepto/ja2;", "C1", "()Lcom/zepto/ja2;", "o2", "(Lcom/zepto/ja2;)V", "mFetchVahanAdapter", "Lcom/zepto/da2;", "W", "Lcom/zepto/da2;", "B1", "()Lcom/zepto/da2;", "n2", "(Lcom/zepto/da2;)V", "mFetchSarathiAdapter", "Lcom/zepto/u92;", "X", "Lcom/zepto/u92;", "y1", "()Lcom/zepto/u92;", "k2", "(Lcom/zepto/u92;)V", "mFetchChallanAdapter", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Q1", "()I", "setVahanAdapterPos", "(I)V", "VahanAdapterPos", "getSarthiAdapterPos", "setSarthiAdapterPos", "SarthiAdapterPos", "b0", "getChallanAdapterPos", "setChallanAdapterPos", "ChallanAdapterPos", "Landroid/app/ProgressDialog;", "c0", "Landroid/app/ProgressDialog;", "J1", "()Landroid/app/ProgressDialog;", "w2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/FetchVahanLog/Staging/VahanInterfaceStaging;", "d0", "Lcom/nic/mparivahan/FetchVahanLog/Staging/VahanInterfaceStaging;", "mVahanInterfaceStaging", "e0", "u1", "g2", "application", "f0", "N1", "A2", "stateCd", "Lcom/zepto/wa3;", "g0", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "i2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/xa2;", "h0", "Lcom/zepto/xa2;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class FetchVahanTransactions extends pq implements ps1, os1, ms1 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RecyclerView rv_vahan_trans;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public za2 mFetchVahanVM;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VahanInterface mVahanInterface;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList mListVal;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 mSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public y92 mFetchSarathVMi;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public SarathiInterface mSarathiInterface;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList sListVal;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public w92 mFetchChallanVM;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public FetchChallaInterface mFetchChallaInterface;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList mMparEchallanLog;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ev otpViewModel;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String trans_val;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public TextView my_transations;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public RelativeLayout rl_notransaction;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ProgressBar trans_bar;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ja2 mFetchVahanAdapter;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public da2 mFetchSarathiAdapter;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public u92 mFetchChallanAdapter;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public int VahanAdapterPos;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public int SarthiAdapterPos;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public int ChallanAdapterPos;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public VahanInterfaceStaging mVahanInterfaceStaging = VahanInterfaceStaging.INSTANCE.a();

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String application;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String stateCd;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public xa2 binding;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (FetchVahanTransactions.this.J1().isShowing()) {
                FetchVahanTransactions.this.J1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().size() > 0) {
                    Intent intent = new Intent(FetchVahanTransactions.this, (Class<?>) VahanApplicationTransactionStatus.class);
                    intent.putExtra("transList", new Gson().toJson(applicationStatusSuccessModel.getTransList()));
                    intent.putExtra("applicationNo", FetchVahanTransactions.this.u1());
                    intent.putExtra("ownerName", "");
                    intent.putExtra("stateCd", FetchVahanTransactions.this.N1());
                    intent.putExtra("regNo", "");
                    FetchVahanTransactions.this.startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApplicationStatusSuccessModel) obj);
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
            if (FetchVahanTransactions.this.J1().isShowing()) {
                FetchVahanTransactions.this.J1().dismiss();
            }
            FetchVahanTransactions fetchVahanTransactions = FetchVahanTransactions.this;
            fetchVahanTransactions.e2(fetchVahanTransactions, "Service temporarily unavailable, Please try again later.");
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
        public final void a(DltVhnTransaction dltVhnTransaction) {
            if (!Intrinsics.areEqual(dltVhnTransaction.getStatusCode(), "AUD001")) {
                FetchVahanTransactions fetchVahanTransactions = FetchVahanTransactions.this;
                fetchVahanTransactions.a2(fetchVahanTransactions, dltVhnTransaction.getStatusDesc());
            } else {
                FetchVahanTransactions.this.C1().L(FetchVahanTransactions.this.getVahanAdapterPos());
                FetchVahanTransactions fetchVahanTransactions2 = FetchVahanTransactions.this;
                fetchVahanTransactions2.a2(fetchVahanTransactions2, fetchVahanTransactions2.w1().b("vehicle_trans_deleted", "Transaction Record deleted successfully."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DltVhnTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final void R1(FetchVahanTransactions this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void S1(FetchVahanTransactions this$0, VahanPojo vahanPojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1().setVisibility(8);
        try {
            if (Intrinsics.areEqual(vahanPojo.getStatusCode(), "AUD001")) {
                try {
                    this$0.K1().setVisibility(8);
                    this$0.L1().setLayoutManager(new LinearLayoutManager(this$0));
                    this$0.L1().setAdapter(null);
                    this$0.q2(vahanPojo.getVahanLogs());
                    CollectionsKt___CollectionsJvmKt.reverse(this$0.E1());
                    this$0.o2(new ja2(this$0.E1(), this$0.v1(), this$0));
                    this$0.L1().setAdapter(this$0.C1());
                } catch (Exception unused) {
                    this$0.L1().setAdapter(null);
                    this$0.K1().setVisibility(0);
                }
            } else {
                this$0.L1().setAdapter(null);
                this$0.K1().setVisibility(0);
            }
        } catch (Exception unused2) {
            this$0.c2(this$0, "Service temporarily unavailable, Please try again later.");
        }
    }

    public static final void T1(FetchVahanTransactions this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1().setVisibility(8);
        this$0.K1().setVisibility(8);
        this$0.c2(this$0, "Service temporarily unavailable, Please try again later.");
    }

    public static final void U1(FetchVahanTransactions this$0, FetchSarathiPojo fetchSarathiPojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1().setVisibility(8);
        try {
            if (Intrinsics.areEqual(fetchSarathiPojo.getStatusCode(), "AUD001")) {
                try {
                    this$0.K1().setVisibility(8);
                    this$0.L1().setLayoutManager(new LinearLayoutManager(this$0));
                    this$0.L1().setAdapter(null);
                    this$0.z2(fetchSarathiPojo.getSarathiLogs());
                    CollectionsKt___CollectionsJvmKt.reverse(this$0.M1());
                    this$0.n2(new da2(this$0.M1(), this$0.v1(), this$0));
                    this$0.L1().setAdapter(this$0.B1());
                } catch (Exception unused) {
                    this$0.L1().setAdapter(null);
                    this$0.K1().setVisibility(0);
                }
            } else {
                this$0.L1().setAdapter(null);
                this$0.K1().setVisibility(0);
            }
        } catch (Exception unused2) {
            this$0.c2(this$0, "Service temporarily unavailable, Please try again later.");
        }
    }

    public static final void V1(FetchVahanTransactions this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1().setVisibility(8);
        this$0.K1().setVisibility(8);
        this$0.c2(this$0, "Service temporarily unavailable, Please try again later.");
    }

    public static final void W1(FetchVahanTransactions this$0, FetchChallanResponse fetchChallanResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1().setVisibility(8);
        Log.v("Response", fetchChallanResponse.toString());
        try {
            Log.v("Status", fetchChallanResponse.getStatusCode());
            if (Intrinsics.areEqual(fetchChallanResponse.getStatusCode(), "AUD001")) {
                this$0.K1().setVisibility(8);
                this$0.L1().setLayoutManager(new LinearLayoutManager(this$0));
                this$0.L1().setAdapter(null);
                this$0.r2(fetchChallanResponse.getMparEchallanLog());
                CollectionsKt___CollectionsJvmKt.reverse(this$0.F1());
                this$0.k2(new u92(this$0.F1(), this$0.v1(), this$0));
                this$0.L1().setAdapter(this$0.y1());
            } else {
                this$0.L1().setAdapter(null);
                this$0.K1().setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public static final void X1(FetchVahanTransactions this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1().setVisibility(8);
        this$0.K1().setVisibility(8);
        this$0.c2(this$0, "Service temporarily unavailable, Please try again later.");
    }

    public static final void Y1(FetchVahanTransactions this$0, DltVhnTransaction dltVhnTransaction) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Intrinsics.areEqual(dltVhnTransaction.getStatusCode(), "AUD001")) {
            this$0.a2(this$0, dltVhnTransaction.getStatusDesc());
        } else {
            this$0.B1().L(this$0.SarthiAdapterPos);
            this$0.a2(this$0, this$0.w1().b("dl_transc_deleted", "Transaction Record deleted successfully."));
        }
    }

    public static final void Z1(FetchVahanTransactions this$0, DltVhnTransaction dltVhnTransaction) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Intrinsics.areEqual(dltVhnTransaction.getStatusCode(), "AUD001")) {
            this$0.a2(this$0, dltVhnTransaction.getStatusDesc());
        } else {
            this$0.y1().K(this$0.ChallanAdapterPos);
            this$0.a2(this$0, "Transaction Record deleted successfully.");
        }
    }

    public static final void b2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void d2(Dialog d2, FetchVahanTransactions this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void f2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final y92 A1() {
        y92 y92Var = this.mFetchSarathVMi;
        if (y92Var != null) {
            return y92Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchSarathVMi");
        return null;
    }

    public final void A2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public final da2 B1() {
        da2 da2Var = this.mFetchSarathiAdapter;
        if (da2Var != null) {
            return da2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchSarathiAdapter");
        return null;
    }

    public final void B2(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.trans_bar = progressBar;
    }

    public final ja2 C1() {
        ja2 ja2Var = this.mFetchVahanAdapter;
        if (ja2Var != null) {
            return ja2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchVahanAdapter");
        return null;
    }

    public final void C2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trans_val = str;
    }

    @Override // com.zepto.ps1
    public void D(Integer vahlogRecordId, int position) {
        this.VahanAdapterPos = position;
        za2 za2VarD1 = D1();
        Intrinsics.checkNotNull(vahlogRecordId);
        za2VarD1.g(vahlogRecordId.intValue(), false);
    }

    public final za2 D1() {
        za2 za2Var = this.mFetchVahanVM;
        if (za2Var != null) {
            return za2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchVahanVM");
        return null;
    }

    @Override // com.zepto.os1
    public void E(Integer recordId, int position) {
        this.SarthiAdapterPos = position;
        y92 y92VarA1 = A1();
        Intrinsics.checkNotNull(recordId);
        y92VarA1.g(recordId.intValue(), false);
    }

    public final ArrayList E1() {
        ArrayList arrayList = this.mListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mListVal");
        return null;
    }

    public final ArrayList F1() {
        ArrayList arrayList = this.mMparEchallanLog;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMparEchallanLog");
        return null;
    }

    public final SarathiInterface G1() {
        SarathiInterface sarathiInterface = this.mSarathiInterface;
        if (sarathiInterface != null) {
            return sarathiInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSarathiInterface");
        return null;
    }

    public final ws6 H1() {
        ws6 ws6Var = this.mSession;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSession");
        return null;
    }

    public final VahanInterface I1() {
        VahanInterface vahanInterface = this.mVahanInterface;
        if (vahanInterface != null) {
            return vahanInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mVahanInterface");
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

    public final RelativeLayout K1() {
        RelativeLayout relativeLayout = this.rl_notransaction;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rl_notransaction");
        return null;
    }

    public final RecyclerView L1() {
        RecyclerView recyclerView = this.rv_vahan_trans;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rv_vahan_trans");
        return null;
    }

    public final ArrayList M1() {
        ArrayList arrayList = this.sListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sListVal");
        return null;
    }

    public final String N1() {
        String str = this.stateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCd");
        return null;
    }

    public final ProgressBar O1() {
        ProgressBar progressBar = this.trans_bar;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trans_bar");
        return null;
    }

    public final String P1() {
        String str = this.trans_val;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trans_val");
        return null;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final int getVahanAdapterPos() {
        return this.VahanAdapterPos;
    }

    @Override // com.zepto.ps1
    public void Z(String vahlogApplicationId, String sCd) {
        Intrinsics.checkNotNullParameter(vahlogApplicationId, "vahlogApplicationId");
        Intrinsics.checkNotNullParameter(sCd, "sCd");
        g2(vahlogApplicationId);
        A2(sCd);
        J1().show();
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.o(this, vahlogApplicationId, N1());
    }

    @Override // com.zepto.ms1
    public void a0(Long recordId, int position) {
        this.SarthiAdapterPos = position;
        w92 w92VarZ1 = z1();
        Intrinsics.checkNotNull(recordId);
        w92VarZ1.g(recordId.longValue(), false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String strP1 = P1();
            switch (strP1.hashCode()) {
                case 49:
                    if (strP1.equals(VContant.MAINSCREEN)) {
                        if (C1().e() > 0) {
                            K1().setVisibility(8);
                        } else {
                            K1().setVisibility(0);
                        }
                    }
                    break;
                case 50:
                    if (strP1.equals(VContant.APPLICATION_SCREEN)) {
                        if (B1().e() > 0) {
                            K1().setVisibility(8);
                        } else {
                            K1().setVisibility(0);
                        }
                    }
                    break;
                case 51:
                    if (strP1.equals("3")) {
                        if (y1().e() > 0) {
                            K1().setVisibility(8);
                        } else {
                            K1().setVisibility(0);
                        }
                    }
                    break;
            }
        } catch (Exception unused) {
        }
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
        ((TextView) viewFindViewById).setText(message);
        textView.setText(w1().b("btn_ok", "ok"));
        ((TextView) viewFindViewById3).setText(w1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wa2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FetchVahanTransactions.b2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void c2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
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
        textView.setText(w1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(w1().b("nex_parivahan", "NextGen mParivahan"));
        ((TextView) viewFindViewById2).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.na2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FetchVahanTransactions.d2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void e2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
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
        ((TextView) viewFindViewById3).setText(w1().b("nex_parivahan", "NextGen mParivahan"));
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ma2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FetchVahanTransactions.f2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application = str;
    }

    public final void h2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void i2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void j2(FetchChallaInterface fetchChallaInterface) {
        Intrinsics.checkNotNullParameter(fetchChallaInterface, "<set-?>");
        this.mFetchChallaInterface = fetchChallaInterface;
    }

    public final void k2(u92 u92Var) {
        Intrinsics.checkNotNullParameter(u92Var, "<set-?>");
        this.mFetchChallanAdapter = u92Var;
    }

    public final void l2(w92 w92Var) {
        Intrinsics.checkNotNullParameter(w92Var, "<set-?>");
        this.mFetchChallanVM = w92Var;
    }

    public final void m2(y92 y92Var) {
        Intrinsics.checkNotNullParameter(y92Var, "<set-?>");
        this.mFetchSarathVMi = y92Var;
    }

    public final void n2(da2 da2Var) {
        Intrinsics.checkNotNullParameter(da2Var, "<set-?>");
        this.mFetchSarathiAdapter = da2Var;
    }

    public final void o2(ja2 ja2Var) {
        Intrinsics.checkNotNullParameter(ja2Var, "<set-?>");
        this.mFetchVahanAdapter = ja2Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fetch_vahan_transactions);
        xa2 xa2VarC = xa2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xa2VarC, "inflate(...)");
        this.binding = xa2VarC;
        ev evVar = null;
        if (xa2VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xa2VarC = null;
        }
        setContentView(xa2VarC.b());
        h2(this);
        ta3.a aVar = ta3.a;
        Context contextV1 = v1();
        xa2 xa2Var = this.binding;
        if (xa2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xa2Var = null;
        }
        aVar.a2(contextV1, xa2Var);
        i2(new wa3(v1()));
        s2(SarathiInterface.INSTANCE.a(v1()));
        u2(VahanInterface.INSTANCE.a(v1()));
        j2(FetchChallaInterface.INSTANCE.a(v1()));
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        ApplicationService applicationService = this.retrofitService;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        ApplicationServiceOtp applicationServiceOtp = this.otpRetrofitService;
        if (applicationServiceOtp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.otpViewModel = (ev) new z(this, new fv6(new pw(applicationServiceOtp))).a(ev.class);
        w2(new ProgressDialog(this));
        J1().setMessage("Please wait...");
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        View viewFindViewById = findViewById(R.id.rv_vahan_trans);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        y2((RecyclerView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.my_transations);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        v2((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.trans_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        B2((ProgressBar) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.rl_notransaction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        x2((RelativeLayout) viewFindViewById4);
        xa2 xa2Var2 = this.binding;
        if (xa2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xa2Var2 = null;
        }
        xa2Var2.i.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.la2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FetchVahanTransactions.R1(this.a, view);
            }
        });
        t2(new ws6(this));
        C2(String.valueOf(getIntent().getStringExtra("trans_val")));
        p2((za2) new z(this, new ka2(new h67(I1()))).a(za2.class));
        l2((w92) new z(this, new ab2(new bb2(x1()))).a(w92.class));
        m2((y92) new z(this, new x92(new i18(G1()))).a(y92.class));
        if (Intrinsics.areEqual(P1(), VContant.MAINSCREEN)) {
            xa2 xa2Var3 = this.binding;
            if (xa2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xa2Var3 = null;
            }
            xa2Var3.i.g.setText(w1().b("Vehicle_Transactions", "Vehicle Transactions"));
            O1().setVisibility(0);
            D1().h(Integer.parseInt(H1().k()), true);
            D1().k().g(this, new mf4() { // from class: com.zepto.oa2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    FetchVahanTransactions.S1(this.a, (VahanPojo) obj);
                }
            });
            D1().i().g(this, new mf4() { // from class: com.zepto.pa2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    FetchVahanTransactions.T1(this.a, (String) obj);
                }
            });
        }
        if (Intrinsics.areEqual(P1(), VContant.APPLICATION_SCREEN)) {
            xa2 xa2Var4 = this.binding;
            if (xa2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xa2Var4 = null;
            }
            xa2Var4.i.g.setText(w1().b("Driving_Licence_Transactions", "Driving Licence Transactions"));
            O1().setVisibility(0);
            A1().h(Integer.parseInt(H1().k()), true);
            A1().k().g(this, new mf4() { // from class: com.zepto.qa2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    FetchVahanTransactions.U1(this.a, (FetchSarathiPojo) obj);
                }
            });
            A1().i().g(this, new mf4() { // from class: com.zepto.ra2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    FetchVahanTransactions.V1(this.a, (String) obj);
                }
            });
        }
        if (Intrinsics.areEqual(P1(), "3")) {
            xa2 xa2Var5 = this.binding;
            if (xa2Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xa2Var5 = null;
            }
            xa2Var5.i.g.setText(w1().b("Challan_Transactions", "Challan Transactions"));
            O1().setVisibility(0);
            z1().h(Long.parseLong(H1().k()), true);
            z1().k().g(this, new mf4() { // from class: com.zepto.sa2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    FetchVahanTransactions.W1(this.a, (FetchChallanResponse) obj);
                }
            });
            z1().i().g(this, new mf4() { // from class: com.zepto.ta2
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    FetchVahanTransactions.X1(this.a, (String) obj);
                }
            });
        }
        D1().j().g(this, new d(new c()));
        A1().j().g(this, new mf4() { // from class: com.zepto.ua2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FetchVahanTransactions.Y1(this.a, (DltVhnTransaction) obj);
            }
        });
        z1().j().g(this, new mf4() { // from class: com.zepto.va2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FetchVahanTransactions.Z1(this.a, (DltVhnTransaction) obj);
            }
        });
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.n().g(this, new d(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar3;
        }
        evVar.k().g(this, new d(new b()));
    }

    public final void p2(za2 za2Var) {
        Intrinsics.checkNotNullParameter(za2Var, "<set-?>");
        this.mFetchVahanVM = za2Var;
    }

    public final void q2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mListVal = arrayList;
    }

    public final void r2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mMparEchallanLog = arrayList;
    }

    public final void s2(SarathiInterface sarathiInterface) {
        Intrinsics.checkNotNullParameter(sarathiInterface, "<set-?>");
        this.mSarathiInterface = sarathiInterface;
    }

    public final void t2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSession = ws6Var;
    }

    public final String u1() {
        String str = this.application;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    public final void u2(VahanInterface vahanInterface) {
        Intrinsics.checkNotNullParameter(vahanInterface, "<set-?>");
        this.mVahanInterface = vahanInterface;
    }

    public final Context v1() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final void v2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.my_transations = textView;
    }

    public final wa3 w1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void w2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final FetchChallaInterface x1() {
        FetchChallaInterface fetchChallaInterface = this.mFetchChallaInterface;
        if (fetchChallaInterface != null) {
            return fetchChallaInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchChallaInterface");
        return null;
    }

    public final void x2(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.rl_notransaction = relativeLayout;
    }

    public final u92 y1() {
        u92 u92Var = this.mFetchChallanAdapter;
        if (u92Var != null) {
            return u92Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchChallanAdapter");
        return null;
    }

    public final void y2(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.rv_vahan_trans = recyclerView;
    }

    public final w92 z1() {
        w92 w92Var = this.mFetchChallanVM;
        if (w92Var != null) {
            return w92Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFetchChallanVM");
        return null;
    }

    public final void z2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.sListVal = arrayList;
    }
}
