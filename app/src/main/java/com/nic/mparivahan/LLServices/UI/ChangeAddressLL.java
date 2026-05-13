package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlApplicationNumber;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.SubmitLlServiceAPI;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeAddressLlReq;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import com.zepto.cf2;
import com.zepto.d86;
import com.zepto.df2;
import com.zepto.dm3;
import com.zepto.ef2;
import com.zepto.ff2;
import com.zepto.hl3;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.q86;
import com.zepto.r86;
import com.zepto.s86;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.u6;
import com.zepto.uj3;
import com.zepto.wa3;
import com.zepto.wb0;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bä\u0001\u0010å\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010 \u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\bR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010R\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR \u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010V\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010TR \u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010V\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010TR \u0010]\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010[\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010TR \u0010_\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010[\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010TR \u0010b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010`\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010TR \u0010d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010`\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010TR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010p\u001a\u00020e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010g\u001a\u0004\bn\u0010i\"\u0004\bo\u0010kR\u0016\u0010s\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010w\u001a\u00020t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010rR*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R(\u0010¯\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bª\u0001\u0010r\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010³\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b°\u0001\u0010r\u001a\u0006\b±\u0001\u0010¬\u0001\"\u0006\b²\u0001\u0010®\u0001R(\u0010·\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b´\u0001\u0010r\u001a\u0006\bµ\u0001\u0010¬\u0001\"\u0006\b¶\u0001\u0010®\u0001R(\u0010»\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¸\u0001\u0010r\u001a\u0006\b¹\u0001\u0010¬\u0001\"\u0006\bº\u0001\u0010®\u0001R(\u0010¿\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¼\u0001\u0010r\u001a\u0006\b½\u0001\u0010¬\u0001\"\u0006\b¾\u0001\u0010®\u0001R(\u0010Ã\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÀ\u0001\u0010r\u001a\u0006\bÁ\u0001\u0010¬\u0001\"\u0006\bÂ\u0001\u0010®\u0001R(\u0010Ç\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÄ\u0001\u0010r\u001a\u0006\bÅ\u0001\u0010¬\u0001\"\u0006\bÆ\u0001\u0010®\u0001R(\u0010Ë\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÈ\u0001\u0010r\u001a\u0006\bÉ\u0001\u0010¬\u0001\"\u0006\bÊ\u0001\u0010®\u0001R(\u0010Ï\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÌ\u0001\u0010r\u001a\u0006\bÍ\u0001\u0010¬\u0001\"\u0006\bÎ\u0001\u0010®\u0001R\u0018\u0010Ñ\u0001\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bÐ\u0001\u0010rR\u0018\u0010Ó\u0001\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bÒ\u0001\u0010rR*\u0010Û\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010ã\u0001\u001a\u00030Ü\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001¨\u0006æ\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/ChangeAddressLL;", "Lcom/zepto/pq;", "", "K2", "u2", "V1", "W1", "x2", "", "fromWhere", "M2", "N2", "Y1", "Z1", "a2", "b2", "villaOrTown", "d2", "q2", "O2", "T2", "message", "R2", "", "w2", "Lcom/nic/mparivahan/LLServices/SubmitServiceAssets/ChangeAddressLlReq;", "c2", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FormOneRequest;", "X1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "P2", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "C", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "e2", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "U2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Lcom/zepto/u6;", "D", "Lcom/zepto/u6;", "f2", "()Lcom/zepto/u6;", "V2", "(Lcom/zepto/u6;)V", "mBinding", "Landroid/content/Context;", "E", "Landroid/content/Context;", "h2", "()Landroid/content/Context;", "Y2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "o2", "()Landroid/app/ProgressDialog;", "f3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "t2", "()Lcom/zepto/wa3;", "h3", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "s2", "()Lcom/zepto/wl5;", "g3", "(Lcom/zepto/wl5;)V", "sarathiSession", "", "Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "I", "Ljava/util/List;", "mStateList", "Lcom/nic/mparivahan/dlservices/data/model/DistrictsMasterItem;", "J", "mCurrDistList", "K", "mPermDistList", "Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "L", "mCurrTalukaList", "M", "mPermTalukaList", "Lcom/nic/mparivahan/dlservices/data/model/VillageOrTownMasterItem;", "N", "mCurrVillageOrTownList", "O", "mPermVillageOrTownList", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "P", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "r2", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "Q", "p2", "setPermanentAdd", "permanentAdd", "R", "Ljava/lang/String;", "isCurrentOrPermanentAddress", "Lcom/zepto/xh0;", "S", "Lcom/zepto/xh0;", "viewModel", "Lcom/zepto/kl0;", "T", "Lcom/zepto/kl0;", "getMClDlViewModel", "()Lcom/zepto/kl0;", "W2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "U", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "g2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "X2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Lcom/zepto/dm3;", "V", "Lcom/zepto/dm3;", "l2", "()Lcom/zepto/dm3;", "c3", "(Lcom/zepto/dm3;)V", "mLlViewModel", "Lcom/nic/mparivahan/LLServices/LlInterface;", "W", "Lcom/nic/mparivahan/LLServices/LlInterface;", "k2", "()Lcom/nic/mparivahan/LLServices/LlInterface;", "b3", "(Lcom/nic/mparivahan/LLServices/LlInterface;)V", "mLlInterface", "X", "Mobile_no", "Lcom/zepto/ef2;", "Y", "Lcom/zepto/ef2;", "i2", "()Lcom/zepto/ef2;", "Z2", "(Lcom/zepto/ef2;)V", "mFormEligVM", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "Z", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "j2", "()Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "a3", "(Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;)V", "mFormsInterface", "a0", "getForm1FlagDLserReq", "()Ljava/lang/String;", "setForm1FlagDLserReq", "(Ljava/lang/String;)V", "form1FlagDLserReq", "b0", "getSubmitFormOne", "i3", "submitFormOne", "c0", "getAString", "setAString", "aString", "d0", "getBString", "setBString", "bString", "e0", "getCString", "setCString", "cString", "f0", "getDString", "setDString", "dString", "g0", "getEString", "setEString", "eString", "h0", "getFString", "setFString", "fString", "i0", "getGString", "setGString", "gString", "j0", "selectedRtoCd", "k0", "selectedRtoName", "Lcom/zepto/s86;", "l0", "Lcom/zepto/s86;", "m2", "()Lcom/zepto/s86;", "d3", "(Lcom/zepto/s86;)V", "mSubmitFormVM", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "m0", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "n2", "()Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "e3", "(Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;)V", "mSubmitInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeAddressLL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeAddressLL.kt\ncom/nic/mparivahan/LLServices/UI/ChangeAddressLL\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1419:1\n1855#2,2:1420\n1855#2,2:1422\n1855#2,2:1424\n1855#2,2:1426\n1855#2,2:1428\n1855#2,2:1430\n1855#2,2:1432\n*S KotlinDebug\n*F\n+ 1 ChangeAddressLL.kt\ncom/nic/mparivahan/LLServices/UI/ChangeAddressLL\n*L\n672#1:1420,2\n728#1:1422,2\n730#1:1424,2\n792#1:1426,2\n797#1:1428,2\n948#1:1430,2\n950#1:1432,2\n*E\n"})
public final class ChangeAddressLL extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public u6 mBinding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public List mStateList;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List mCurrDistList;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public List mPermDistList;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public List mCurrTalukaList;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public List mPermTalukaList;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public List mCurrVillageOrTownList;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public List mPermVillageOrTownList;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public xh0 viewModel;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public dm3 mLlViewModel;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public LlInterface mLlInterface;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ef2 mFormEligVM;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public FromEligCheck mFormsInterface;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String selectedRtoCd;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String selectedRtoName;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public s86 mSubmitFormVM;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public SubmitInterface mSubmitInterface;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String isCurrentOrPermanentAddress = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String gString = "N";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(StateResponse stateResponse) {
            try {
                ChangeAddressLL.this.o2().dismiss();
                if (Intrinsics.areEqual(stateResponse.getStatusCode(), "00")) {
                    if (stateResponse.getStateMaster() != null && (!r0.isEmpty())) {
                        ChangeAddressLL.this.mStateList = stateResponse.getStateMaster();
                    }
                } else {
                    ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
                    changeAddressLL.R2(changeAddressLL.t2().b("no_details", ChangeAddressLL.this.getString(R.string.no_Details_are_avail)));
                }
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = ChangeAddressLL.this;
                changeAddressLL2.R2(changeAddressLL2.t2().b("service_is_not_present", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
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
                ChangeAddressLL.this.o2().dismiss();
                if (Intrinsics.areEqual(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    ChangeAddressLL.this.mCurrDistList = distResponse.getDistMaster();
                    ChangeAddressLL.this.mPermDistList = distResponse.getDistMaster();
                } else {
                    ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
                    changeAddressLL.R2(changeAddressLL.t2().b("no_details", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
                }
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = ChangeAddressLL.this;
                changeAddressLL2.R2(changeAddressLL2.t2().b("service_is_not_present", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
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
                ChangeAddressLL.this.o2().dismiss();
                if (!Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "01")) {
                        ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
                        changeAddressLL.R2(changeAddressLL.t2().b("no_taluka_found", "No Taluka / Block found for selected District"));
                    } else {
                        ChangeAddressLL changeAddressLL2 = ChangeAddressLL.this;
                        changeAddressLL2.R2(changeAddressLL2.t2().b("no_details", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
                    }
                } else if (Intrinsics.areEqual(ChangeAddressLL.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    ChangeAddressLL.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                } else {
                    ChangeAddressLL.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL3 = ChangeAddressLL.this;
                changeAddressLL3.R2(changeAddressLL3.t2().b("service_is_not_present", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
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
                ChangeAddressLL.this.o2().dismiss();
                if (!Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
                    changeAddressLL.R2(changeAddressLL.t2().b("no_vill_found", "No Village/Town found for selected Taluka/Block"));
                } else if (Intrinsics.areEqual(ChangeAddressLL.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    ChangeAddressLL.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                } else {
                    ChangeAddressLL.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = ChangeAddressLL.this;
                changeAddressLL2.R2(changeAddressLL2.t2().b("service_is_not_present", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VillageOrTownResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(SubmitResponse submitResponse) {
            ChangeAddressLL.this.o2().dismiss();
            try {
                if (Intrinsics.areEqual(submitResponse.getStatus_code(), "00")) {
                    ChangeAddressLL.this.i3("Y");
                    ChangeAddressLL.this.R2(submitResponse.getFoneObject().get(0).getMsg());
                } else {
                    ChangeAddressLL.this.P2(submitResponse.getFoneObject().get(0).getMsg());
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitResponse) obj);
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

        public final void invoke(String str) {
            ChangeAddressLL.this.o2().dismiss();
            ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
            changeAddressLL.R2(changeAddressLL.t2().b("service_is_not_present", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(ff2 ff2Var) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(SubmitLlServiceAPI submitLlServiceAPI) {
            ChangeAddressLL.this.f2().h0.c(false);
            try {
                String string = submitLlServiceAPI.getApplicationNumber().toString();
                if (string != null && string.length() != 0) {
                    Intent intent = new Intent(ChangeAddressLL.this, (Class<?>) LlApplicationNumber.class);
                    intent.putExtra("LLDetails", ChangeAddressLL.this.e2());
                    String str = ChangeAddressLL.this.Mobile_no;
                    String str2 = null;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
                        str = null;
                    }
                    intent.putExtra("Mobile_no", str);
                    String str3 = ChangeAddressLL.this.selectedRtoCd;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
                        str3 = null;
                    }
                    intent.putExtra("selectedRtoCd", str3);
                    String str4 = ChangeAddressLL.this.selectedRtoName;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoName");
                    } else {
                        str2 = str4;
                    }
                    intent.putExtra("selectedRtoName", str2);
                    intent.putExtra("appNumber", submitLlServiceAPI.getApplicationNumber().toString());
                    ChangeAddressLL.this.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitLlServiceAPI) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ChangeAddressLL.this.f2().h0.c(false);
            ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
            changeAddressLL.R2(changeAddressLL.t2().b("service_is_not_present", ChangeAddressLL.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class j implements d86.b {
        public j() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            DistrictsMasterItem districtsMasterItem;
            DistrictsMasterItem districtsMasterItem2;
            String str2 = ChangeAddressLL.this.isCurrentOrPermanentAddress;
            xh0 xh0Var = null;
            if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                List list = ChangeAddressLL.this.mCurrDistList;
                String distCode = (list == null || (districtsMasterItem2 = (DistrictsMasterItem) list.get(i)) == null) ? null : districtsMasterItem2.getDistCode();
                ChangeAddressLL.this.f2().x.setText(str);
                ChangeAddressLL.this.f2().x.setContentDescription(distCode);
                ChangeAddressLL.this.getPresentAdd().setDistrict(distCode);
                ChangeAddressLL.this.Y1();
                if (distCode != null) {
                    ChangeAddressLL changeAddressLL = ChangeAddressLL.this;
                    changeAddressLL.o2().dismiss();
                    xh0 xh0Var2 = changeAddressLL.viewModel;
                    if (xh0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var2;
                    }
                    xh0Var.n(StringsKt__StringsKt.trim((CharSequence) changeAddressLL.e2().getState().getStCd()).toString(), distCode);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                List list2 = ChangeAddressLL.this.mPermDistList;
                String distCode2 = (list2 == null || (districtsMasterItem = (DistrictsMasterItem) list2.get(i)) == null) ? null : districtsMasterItem.getDistCode();
                ChangeAddressLL.this.f2().E.setText(str);
                ChangeAddressLL.this.f2().E.setContentDescription(distCode2);
                ChangeAddressLL.this.getPermanentAdd().setDistrict(distCode2);
                ChangeAddressLL.this.a2();
                if (distCode2 != null) {
                    ChangeAddressLL changeAddressLL2 = ChangeAddressLL.this;
                    changeAddressLL2.o2().dismiss();
                    xh0 xh0Var3 = changeAddressLL2.viewModel;
                    if (xh0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var3;
                    }
                    xh0Var.n(StringsKt__StringsKt.trim((CharSequence) changeAddressLL2.e2().getState().getStCd()).toString(), distCode2);
                }
            }
        }
    }

    public static final class k implements d86.b {
        public final /* synthetic */ Ref.ObjectRef b;

        public k(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            String subDistcode = null;
            if (Intrinsics.areEqual(ChangeAddressLL.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = ChangeAddressLL.this.mCurrTalukaList;
                if (list != null && (talukaMasterItem2 = (TalukaMasterItem) list.get(i)) != null) {
                    subDistcode = talukaMasterItem2.getSubDistcode();
                }
                ChangeAddressLL.this.f2().w.setText(str);
                ChangeAddressLL.this.f2().w.setContentDescription(subDistcode);
                ChangeAddressLL.this.getPresentAdd().setSubDistrict(subDistcode);
                ChangeAddressLL.this.d2((String) this.b.element);
                ChangeAddressLL.this.f2().M.setText(((Object) ChangeAddressLL.this.f2().w.getText()) + ", " + ((Object) ChangeAddressLL.this.f2().x.getText()) + ", " + ((Object) ChangeAddressLL.this.f2().y.getText()));
                return;
            }
            List list2 = ChangeAddressLL.this.mPermTalukaList;
            if (list2 != null && (talukaMasterItem = (TalukaMasterItem) list2.get(i)) != null) {
                subDistcode = talukaMasterItem.getSubDistcode();
            }
            ChangeAddressLL.this.f2().D.setText(str);
            ChangeAddressLL.this.f2().D.setContentDescription(subDistcode);
            ChangeAddressLL.this.getPermanentAdd().setSubDistrict(subDistcode);
            ChangeAddressLL.this.q2((String) this.b.element);
            ChangeAddressLL.this.f2().A.setText(((Object) ChangeAddressLL.this.f2().D.getText()) + ", " + ((Object) ChangeAddressLL.this.f2().E.getText()) + ", " + ((Object) ChangeAddressLL.this.f2().F.getText()));
        }
    }

    public static final class l implements d86.b {
        public l() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            String villageCode = null;
            if (Intrinsics.areEqual(ChangeAddressLL.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = ChangeAddressLL.this.mCurrVillageOrTownList;
                if (list != null && (villageOrTownMasterItem2 = (VillageOrTownMasterItem) list.get(i)) != null) {
                    villageCode = villageOrTownMasterItem2.getVillageCode();
                }
                ChangeAddressLL.this.f2().L.setText(str);
                ChangeAddressLL.this.f2().L.setContentDescription(villageCode);
                ChangeAddressLL.this.getPresentAdd().setVillageOrTown(villageCode);
                return;
            }
            List list2 = ChangeAddressLL.this.mPermVillageOrTownList;
            if (list2 != null && (villageOrTownMasterItem = (VillageOrTownMasterItem) list2.get(i)) != null) {
                villageCode = villageOrTownMasterItem.getVillageCode();
            }
            ChangeAddressLL.this.f2().G.setText(str);
            ChangeAddressLL.this.f2().G.setContentDescription(villageCode);
            ChangeAddressLL.this.getPermanentAdd().setVillageOrTown(villageCode);
        }
    }

    public static final class m implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public m(Function1 function) {
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

    public static final void A2(ChangeAddressLL this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (z) {
                this$0.T2();
                this$0.f2().F.setEnabled(false);
                this$0.f2().E.setEnabled(false);
                this$0.f2().D.setEnabled(false);
                this$0.f2().G.setEnabled(false);
                this$0.f2().A.setEnabled(false);
                this$0.f2().z.setEnabled(false);
                this$0.f2().C.setEnabled(false);
                this$0.f2().B.setEnabled(false);
            } else {
                this$0.f2().F.setEnabled(true);
                this$0.f2().E.setEnabled(true);
                this$0.f2().D.setEnabled(true);
                this$0.f2().G.setEnabled(true);
                this$0.f2().A.setEnabled(true);
                this$0.f2().z.setEnabled(true);
                this$0.f2().C.setEnabled(true);
                this$0.f2().B.setEnabled(true);
                this$0.permanentAdd = new DlAddress("", "", "", "", "", "", "", "");
                this$0.f2().E.setText("");
                this$0.f2().D.setText("");
                this$0.f2().G.setText("");
                this$0.f2().A.setText("");
                this$0.f2().z.setText("");
                this$0.f2().C.setText("");
                this$0.f2().B.setText("");
            }
            this$0.f2().z(this$0.permanentAdd);
            this$0.f2().a();
        } catch (Exception unused) {
        }
    }

    public static final void B2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.w2()) {
            if (!com.nic.mparivahan.a.a.a(this$0)) {
                Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                return;
            }
            this$0.f2().h0.c(true);
            this$0.l2().g(this$0, this$0.c2());
        }
    }

    public static final void C2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void D2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void E2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.M2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void F2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.N2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void G2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.O2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void H2(ChangeAddressLL this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        if (i2 == R.id.town_rb) {
            this$0.d2("U");
        } else {
            if (i2 != R.id.village_rb) {
                return;
            }
            this$0.d2("R");
        }
    }

    public static final void I2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.M2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void J2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.N2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    private final void K2() {
        try {
            f2().j0.setVisibility(8);
            f2().C0.setVisibility(8);
            f2().X.g.setText(s2().k());
            f2().X.h.setPaintFlags(8 | f2().X.h.getPaintFlags());
            f2().X.h.setText(StringsKt__StringsKt.trim((CharSequence) e2().getLearningLicence()).toString());
            f2().X.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ed0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChangeAddressLL.L2(this.a, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void L2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.e2());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void M2(String fromWhere) {
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
            d86VarA.n2(new j());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N2(String fromWhere) {
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
                if (f2().i0.isChecked()) {
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
                if (f2().H.isChecked()) {
                    t2 = "U";
                }
                objectRef.element = t2;
            }
            d86 d86VarA = d86.INSTANCE.a("Select Taluka", arrayList);
            d86VarA.k2(I0(), "TalukaPicker");
            d86VarA.n2(new k(objectRef));
        } catch (Exception unused) {
        }
    }

    private final void O2(String fromWhere) {
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
            d86VarA.n2(new l());
        } catch (Exception unused) {
        }
    }

    public static final void Q2(Dialog d2, ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.S2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void T2() {
        try {
            this.permanentAdd = this.presentAdd;
            f2().E.setText(f2().x.getText());
            f2().D.setText(f2().w.getText());
            f2().G.setText(f2().L.getText());
            f2().z.setText(f2().K.getText());
            f2().C.setText(f2().O.getText());
            f2().A.setText(f2().M.getText());
            f2().B.setText(f2().N.getText());
        } catch (Exception unused) {
        }
    }

    private final void V1() {
        this.viewModel = (xh0) new z(this).a(xh0.class);
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), t2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        xh0 xh0Var = this.viewModel;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.g(StringsKt__StringsKt.trim((CharSequence) e2().getState().getStCd()).toString());
    }

    private final void W1() {
        xh0 xh0Var = this.viewModel;
        xh0 xh0Var2 = null;
        if (xh0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var = null;
        }
        xh0Var.i().g(this, new m(new a()));
        xh0 xh0Var3 = this.viewModel;
        if (xh0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var3 = null;
        }
        xh0Var3.h().g(this, new m(new b()));
        xh0 xh0Var4 = this.viewModel;
        if (xh0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var4 = null;
        }
        xh0Var4.k().g(this, new m(new c()));
        xh0 xh0Var5 = this.viewModel;
        if (xh0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            xh0Var2 = xh0Var5;
        }
        xh0Var2.l().g(this, new m(new d()));
        m2().i().g(this, new m(new e()));
        m2().h().g(this, new m(new f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1() {
        f2().w.setText("");
        f2().w.setHint(t2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        Z1();
        Z1();
    }

    private final void Z1() {
        f2().L.setText("");
        f2().L.setHint(t2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mCurrVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        f2().D.setText("");
        f2().D.setHint(t2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mPermTalukaList = CollectionsKt__CollectionsKt.emptyList();
        b2();
    }

    private final void b2() {
        f2().G.setText("");
        f2().G.setHint(t2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mPermVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(String villaOrTown) {
        try {
            String string = f2().w.getContentDescription().toString();
            Z1();
            o2().dismiss();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.o(StringsKt__StringsKt.trim((CharSequence) e2().getState().getStCd()).toString(), f2().x.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(String villaOrTown) {
        try {
            String string = f2().D.getContentDescription().toString();
            b2();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.o(StringsKt__StringsKt.trim((CharSequence) e2().getState().getStCd()).toString(), f2().E.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    private final void u2() {
        h3(new wa3(h2()));
        g3(new wl5(h2()));
        f3(new ProgressDialog(h2()));
        o2().setMessage(t2().b("label_challan_please_wait", getString(R.string.please_wait)));
        o2().setCancelable(false);
        o2().setCanceledOnTouchOutside(false);
        f2().W.g.setText(s2().k());
        f2().C0.setPaintFlags(f2().j0.getPaintFlags() | 8);
        X2(ClInter.INSTANCE.a(h2()));
        W2((kl0) new z(this, new sn0(new jl0(g2()))).a(kl0.class));
        b3(LlInterface.INSTANCE.a(h2()));
        c3((dm3) new z(this, new uj3(new hl3(k2()))).a(dm3.class));
        if (getIntent() != null) {
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            U2((FetchLlDetails) serializableExtra);
            this.selectedRtoCd = String.valueOf(getIntent().getStringExtra("selectedRtoCd"));
            this.selectedRtoName = String.valueOf(getIntent().getStringExtra("selectedRtoName"));
            f2().j0.setText("LL No. : " + StringsKt__StringsKt.trim((CharSequence) e2().getLearningLicence()).toString());
            f2().y.setText(e2().getState().getStateName());
            f2().F.setText(e2().getState().getStateName());
        }
        f2().C0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.v2(this.a, view);
            }
        });
        a3(FromEligCheck.INSTANCE.a(this));
        Z2((ef2) new z(this, new df2(new cf2(j2()))).a(ef2.class));
        i2().h(X1());
        i2().j().g(this, new m(new g()));
        e3(SubmitInterface.INSTANCE.a(this));
        d3((s86) new z(this, new q86(new r86(n2()))).a(s86.class));
    }

    public static final void v2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.e2());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final boolean w2() {
        Editable text = f2().y.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, t2().b("select_state", getString(R.string.select_state)), 0).show();
            return false;
        }
        Editable text2 = f2().x.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this, t2().b("select_district", getString(R.string.select_district)), 0).show();
            return false;
        }
        Editable text3 = f2().w.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, t2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
            return false;
        }
        Editable text4 = f2().M.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this, t2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
            return false;
        }
        Editable text5 = f2().N.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, t2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
            return false;
        }
        if (f2().N.getText().length() < 6) {
            Toast.makeText(this, t2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        Editable text6 = f2().F.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, t2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        Editable text7 = f2().E.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, t2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
            return false;
        }
        Editable text8 = f2().D.getText();
        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
        if (text8.length() == 0) {
            Toast.makeText(this, t2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
            return false;
        }
        Editable text9 = f2().A.getText();
        Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
        if (text9.length() == 0) {
            Toast.makeText(this, t2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
            return false;
        }
        Editable text10 = f2().B.getText();
        Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
        if (text10.length() == 0) {
            Toast.makeText(this, t2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        if (f2().B.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, t2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    private final void x2() {
        f2().W.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.C2(this.a, view);
            }
        });
        f2().X.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.D2(this.a, view);
            }
        });
        f2().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.E2(this.a, view);
            }
        });
        f2().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ld0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.F2(this.a, view);
            }
        });
        f2().L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.md0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.G2(this.a, view);
            }
        });
        f2().E0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.nd0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                ChangeAddressLL.H2(this.a, radioGroup, i2);
            }
        });
        f2().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.I2(this.a, view);
            }
        });
        f2().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ad0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.J2(this.a, view);
            }
        });
        f2().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.y2(this.a, view);
            }
        });
        f2().J.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.cd0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                ChangeAddressLL.z2(this.a, radioGroup, i2);
            }
        });
        f2().g0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.hd0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChangeAddressLL.A2(this.a, compoundButton, z);
            }
        });
        f2().h0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.id0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.B2(this.a, view);
            }
        });
    }

    public static final void y2(ChangeAddressLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.O2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.h2(), this$0.t2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void z2(ChangeAddressLL this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mPermTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        switch (i2) {
            case R.id.dl_permanent_town_rb /* 2131362708 */:
                this$0.q2("U");
                break;
            case R.id.dl_permanent_village_rb /* 2131362709 */:
                this$0.q2("R");
                break;
        }
    }

    public final void P2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(t2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(t2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAddressLL.Q2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void U2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void V2(u6 u6Var) {
        Intrinsics.checkNotNullParameter(u6Var, "<set-?>");
        this.mBinding = u6Var;
    }

    public final void W2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final FormOneRequest X1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(504);
        String str = this.selectedRtoCd;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
            str = null;
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str, arrayList);
    }

    public final void X2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void Y2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void Z2(ef2 ef2Var) {
        Intrinsics.checkNotNullParameter(ef2Var, "<set-?>");
        this.mFormEligVM = ef2Var;
    }

    public final void a3(FromEligCheck fromEligCheck) {
        Intrinsics.checkNotNullParameter(fromEligCheck, "<set-?>");
        this.mFormsInterface = fromEligCheck;
    }

    public final void b3(LlInterface llInterface) {
        Intrinsics.checkNotNullParameter(llInterface, "<set-?>");
        this.mLlInterface = llInterface;
    }

    public final ChangeAddressLlReq c2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("changeOfAddress");
        String string = StringsKt__StringsKt.trim((CharSequence) e2().getLearningLicence()).toString();
        String string2 = StringsKt__StringsKt.trim((CharSequence) e2().getDateOfBirth()).toString();
        String stCd = e2().getState().getStCd();
        String str = this.selectedRtoCd;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
            str = null;
        }
        String str2 = str;
        String stCd2 = e2().getState().getStCd();
        String district = this.presentAdd.getDistrict();
        Intrinsics.checkNotNull(district);
        String subDistrict = this.presentAdd.getSubDistrict();
        Intrinsics.checkNotNull(subDistrict);
        String villageOrTown = this.presentAdd.getVillageOrTown();
        Intrinsics.checkNotNull(villageOrTown);
        String string3 = f2().M.getText().toString();
        String string4 = f2().K.getText().toString();
        String string5 = f2().O.getText().toString();
        String string6 = f2().N.getText().toString();
        String stCd3 = e2().getState().getStCd();
        String district2 = this.permanentAdd.getDistrict();
        Intrinsics.checkNotNull(district2);
        String subDistrict2 = this.permanentAdd.getSubDistrict();
        Intrinsics.checkNotNull(subDistrict2);
        String villageOrTown2 = this.permanentAdd.getVillageOrTown();
        Intrinsics.checkNotNull(villageOrTown2);
        return new ChangeAddressLlReq("UmangOD", "2335647e653c970102713f68f6aad970", "164.100.161.142", "SarathiMobileService", string, string2, stCd, str2, "", stCd2, district, subDistrict, "NA", villageOrTown, string3, string4, string5, string6, "NA", stCd3, district2, subDistrict2, "NA", villageOrTown2, f2().A.getText().toString(), f2().z.getText().toString(), f2().C.getText().toString(), f2().N.getText().toString(), e2().getMobileNumber(), "changeOfAddress", arrayList);
    }

    public final void c3(dm3 dm3Var) {
        Intrinsics.checkNotNullParameter(dm3Var, "<set-?>");
        this.mLlViewModel = dm3Var;
    }

    public final void d3(s86 s86Var) {
        Intrinsics.checkNotNullParameter(s86Var, "<set-?>");
        this.mSubmitFormVM = s86Var;
    }

    public final FetchLlDetails e2() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final void e3(SubmitInterface submitInterface) {
        Intrinsics.checkNotNullParameter(submitInterface, "<set-?>");
        this.mSubmitInterface = submitInterface;
    }

    public final u6 f2() {
        u6 u6Var = this.mBinding;
        if (u6Var != null) {
            return u6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final void f3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final ClInter g2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final void g3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final Context h2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void h3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final ef2 i2() {
        ef2 ef2Var = this.mFormEligVM;
        if (ef2Var != null) {
            return ef2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormEligVM");
        return null;
    }

    public final void i3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.submitFormOne = str;
    }

    public final FromEligCheck j2() {
        FromEligCheck fromEligCheck = this.mFormsInterface;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final LlInterface k2() {
        LlInterface llInterface = this.mLlInterface;
        if (llInterface != null) {
            return llInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlInterface");
        return null;
    }

    public final dm3 l2() {
        dm3 dm3Var = this.mLlViewModel;
        if (dm3Var != null) {
            return dm3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlViewModel");
        return null;
    }

    public final s86 m2() {
        s86 s86Var = this.mSubmitFormVM;
        if (s86Var != null) {
            return s86Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface n2() {
        SubmitInterface submitInterface = this.mSubmitInterface;
        if (submitInterface != null) {
            return submitInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitInterface");
        return null;
    }

    public final ProgressDialog o2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        u6 u6VarX = u6.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(u6VarX, "inflate(...)");
        V2(u6VarX);
        setContentView(f2().m());
        Y2(this);
        ta3.a.z(this, f2());
        u2();
        V1();
        W1();
        x2();
        l2().l().g(this, new m(new h()));
        l2().i().g(this, new m(new i()));
        K2();
    }

    /* JADX INFO: renamed from: p2, reason: from getter */
    public final DlAddress getPermanentAdd() {
        return this.permanentAdd;
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final DlAddress getPresentAdd() {
        return this.presentAdd;
    }

    public final wl5 s2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 t2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }
}
