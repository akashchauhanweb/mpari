package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.PermitFee;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPayment;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.a92;
import com.zepto.hz0;
import com.zepto.j37;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.yb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¦\u0002\u0010§\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010V\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010f\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010n\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010v\u001a\u0004\u0018\u00010o8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010~\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R+\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u009d\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R)\u0010¡\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0006\b\u009f\u0001\u0010\u009a\u0001\"\u0006\b \u0001\u0010\u009c\u0001R)\u0010¥\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u0098\u0001\u001a\u0006\b£\u0001\u0010\u009a\u0001\"\u0006\b¤\u0001\u0010\u009c\u0001R)\u0010©\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010\u0098\u0001\u001a\u0006\b§\u0001\u0010\u009a\u0001\"\u0006\b¨\u0001\u0010\u009c\u0001R)\u0010\u00ad\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0001\u0010\u0098\u0001\u001a\u0006\b«\u0001\u0010\u009a\u0001\"\u0006\b¬\u0001\u0010\u009c\u0001R)\u0010±\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010\u0098\u0001\u001a\u0006\b¯\u0001\u0010\u009a\u0001\"\u0006\b°\u0001\u0010\u009c\u0001R,\u0010¹\u0001\u001a\u0005\u0018\u00010²\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010Á\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R)\u0010Ã\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010»\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R)\u0010Ê\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010\u0098\u0001\u001a\u0006\bÈ\u0001\u0010\u009a\u0001\"\u0006\bÉ\u0001\u0010\u009c\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R,\u0010Ú\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R+\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010\u0098\u0001\u001a\u0006\bÜ\u0001\u0010\u009a\u0001\"\u0006\bÝ\u0001\u0010\u009c\u0001R+\u0010å\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R,\u0010í\u0001\u001a\u0005\u0018\u00010æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R,\u0010õ\u0001\u001a\u0005\u0018\u00010î\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R,\u0010ù\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010\u0089\u0001\u001a\u0006\b÷\u0001\u0010\u008b\u0001\"\u0006\bø\u0001\u0010\u008d\u0001R)\u0010ý\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bú\u0001\u0010\u0098\u0001\u001a\u0006\bû\u0001\u0010\u009a\u0001\"\u0006\bü\u0001\u0010\u009c\u0001R)\u0010\u0081\u0002\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bþ\u0001\u0010\u0098\u0001\u001a\u0006\bÿ\u0001\u0010\u009a\u0001\"\u0006\b\u0080\u0002\u0010\u009c\u0001R)\u0010\u0085\u0002\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0098\u0001\u001a\u0006\b\u0083\u0002\u0010\u009a\u0001\"\u0006\b\u0084\u0002\u0010\u009c\u0001R*\u0010\u008d\u0002\u001a\u00030\u0086\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R*\u0010\u0095\u0002\u001a\u00030\u008e\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002\"\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u009d\u0002\u001a\u00030\u0096\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R*\u0010¥\u0002\u001a\u00030\u009e\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0002\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002¨\u0006¨\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FeesDetailsScreen;", "Lcom/zepto/pq;", "", "c2", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "", "title", "w2", "message", "u2", "x1", "Lcom/zepto/ld7;", "C", "Lcom/zepto/ld7;", "Q1", "()Lcom/zepto/ld7;", "t2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "N1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "q2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "F1", "()Landroid/app/ProgressDialog;", "i2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "F", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "getConfirm_details", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "setConfirm_details", "(Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;)V", "confirm_details", "Lcom/zepto/yb;", "G", "Lcom/zepto/yb;", "C1", "()Lcom/zepto/yb;", "f2", "(Lcom/zepto/yb;)V", "binding", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "H", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "getHptObject", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "setHptObject", "(Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;)V", "hptObject", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "I", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "getHpaObject", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "setHpaObject", "(Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;)V", "hpaObject", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "J", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "getDuplicate_RC", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "setDuplicate_RC", "(Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;)V", "duplicate_RC", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "K", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "getDuplicate_FC", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;", "setDuplicate_FC", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DupFitnessModle/DuplicateFitessDraft;)V", "duplicate_FC", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "L", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "getRcCancellationdto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;", "setRcCancellationdto", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RcCancalltionModle/Data;)V", "rcCancellationdto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "M", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "getRcSurrenderdto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;", "setRcSurrenderdto", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCSurrenderModle/Data;)V", "rcSurrenderdto", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;", "N", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;", "getDuplicate_Permit", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;", "setDuplicate_Permit", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/DuplicatePermitDraft;)V", "duplicate_Permit", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "O", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "getRcReleaseDto", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;", "setRcReleaseDto", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/RCReleaseModel/Data;)V", "rcReleaseDto", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "P", "Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "getNpAuthPermit", "()Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;", "setNpAuthPermit", "(Lcom/nic/mparivahan/VahanServices/RenewalOfNpAuthorizationPermit/RenewalOfPermitSaveToDraftModel/Data;)V", "npAuthPermit", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "Q", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "getTemPermitDraft", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;", "setTemPermitDraft", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/Data;)V", "temPermitDraft", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;", "R", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;", "getTransferOfOwnerDraft", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;", "setTransferOfOwnerDraft", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftModel/Data;)V", "transferOfOwnerDraft", "S", "Ljava/lang/String;", "P1", "()Ljava/lang/String;", "s2", "(Ljava/lang/String;)V", "state_code", "T", "getAppl_no", "setAppl_no", "appl_no", "U", "K1", "n2", "rc_no", "V", "J1", "m2", VContant.PURPOSE_CODE, "W", "O1", "r2", "service_name", "X", "E1", "h2", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "getNoc_draft", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "setNoc_draft", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;)V", "noc_draft", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "Z", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "G1", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "j2", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "a0", "isFaceless", "()Z", "setFaceless", "(Z)V", "b0", "getTotal_amount", "setTotal_amount", "total_amount", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;", "c0", "Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;", "getMiscellaneousDto", "()Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;", "setMiscellaneousDto", "(Lcom/nic/mparivahan/VahanServices/CompoundingFee/CompoundModel/Data;)V", "miscellaneousDto", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "d0", "Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "getPermitRenewalDraft", "()Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;", "setPermitRenewalDraft", "(Lcom/nic/mparivahan/VahanServices/RenewalOfPermit/RPSaveToDraftModel/Data;)V", "permitRenewalDraft", "e0", "getChasi_no", "setChasi_no", "chasi_no", "f0", "Ljava/lang/Boolean;", "getNofees", "()Ljava/lang/Boolean;", "setNofees", "(Ljava/lang/Boolean;)V", "nofees", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "g0", "Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "getAlterDraft", "()Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;", "setAlterDraft", "(Lcom/nic/mparivahan/VahanServices/AlterationOfVehicle/AOVSaveToDraftModel/Data;)V", "alterDraft", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "h0", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "getMobileNoUpdateDraft", "()Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;", "setMobileNoUpdateDraft", "(Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileViewModel/Data;)V", "mobileNoUpdateDraft", "i0", "getSpecialPermitDraft", "setSpecialPermitDraft", "specialPermitDraft", "j0", "B1", "e2", "aadhar_name", "k0", "A1", "d2", "aadhar_address", "l0", "L1", "o2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "m0", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "M1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "p2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/wa3;", "n0", "Lcom/zepto/wa3;", "D1", "()Lcom/zepto/wa3;", "g2", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "o0", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "H1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "k2", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "permitService", "Lcom/zepto/o47;", "p0", "Lcom/zepto/o47;", "I1", "()Lcom/zepto/o47;", "l2", "(Lcom/zepto/o47;)V", "permitViewModle", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class FeesDetailsScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ChaangeOfAddressStatus confirm_details;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public yb binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public HptTerResponse hptObject;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public HPAResModle hpaObject;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public dulicateRcResponseModle duplicate_RC;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public DuplicateFitessDraft duplicate_FC;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Data rcCancellationdto;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data rcSurrenderdto;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DuplicatePermitDraft duplicate_Permit;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data rcReleaseDto;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data npAuthPermit;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data temPermitDraft;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data transferOfOwnerDraft;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String service_name;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public NocDraftResponse noc_draft;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel.Data miscellaneousDto;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data permitRenewalDraft;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String chasi_no;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public Boolean nofees;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data alterDraft;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data mobileNoUpdateDraft;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data specialPermitDraft;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public DuplicateFitnessService permitService;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public o47 permitViewModle;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String appl_no = " ";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String total_amount = "0.0";

    public static final void R1(FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.L1());
        intent.putExtra("RcDetails", this$0.M1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.B1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.A1());
        this$0.startActivity(intent);
    }

    public static final void S1(FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1(this$0, this$0.D1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void T1(FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x021a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void U1(com.nic.mparivahan.VahanServices.FeesDetailsScreen r27, com.nic.mparivahan.VahanServices.VahanModel.FeesModle r28) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.FeesDetailsScreen.U1(com.nic.mparivahan.VahanServices.FeesDetailsScreen, com.nic.mparivahan.VahanServices.VahanModel.FeesModle):void");
    }

    public static final void V1(FeesDetailsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        this$0.w2(this$0, "Unable to get the fee details, Please try after some time!");
    }

    public static final void W1(FeesDetailsScreen this$0, PermitFee permitFee) {
        ArrayList<FeeDobj> feeDobj;
        FeeDobj feeDobj2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        try {
            this$0.C1().m.setVisibility(0);
            this$0.C1().u.setVisibility(8);
            this$0.C1().j.setVisibility(0);
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data data = permitFee.getData();
            this$0.total_amount = String.valueOf(data != null ? data.getSumOfFee() : null);
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data data2 = permitFee.getData();
            ArrayList<FeeDobj> feeDobj3 = data2 != null ? data2.getFeeDobj() : null;
            IntRange indices = feeDobj3 != null ? CollectionsKt__CollectionsKt.getIndices(feeDobj3) : null;
            Intrinsics.checkNotNull(indices);
            int first = indices.getFirst();
            int last = indices.getLast();
            if (first <= last) {
                while (true) {
                    if (VContant.INSTANCE.f(String.valueOf(feeDobj3.get(first).getPurCd()))) {
                        TextView textView = this$0.C1().x;
                        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data data3 = permitFee.getData();
                        textView.setText((data3 == null || (feeDobj = data3.getFeeDobj()) == null || (feeDobj2 = feeDobj.get(first)) == null) ? null : feeDobj2.getFeeHeadDescr());
                        FeeDobj feeDobj4 = new FeeDobj(feeDobj3.get(first).getServicecharge(), "Service Charge", "0", 0, "0", "0");
                        FeeDobj feeDobj5 = feeDobj3.get(first);
                        Intrinsics.checkNotNullExpressionValue(feeDobj5, "get(...)");
                        FeeDobj feeDobjCopy$default = FeeDobj.copy$default(feeDobj5, null, "Fee Amount", null, null, null, null, 61, null);
                        feeDobj3.remove(first);
                        feeDobj3.add(first, feeDobjCopy$default);
                        feeDobj3.add(feeDobj4);
                    }
                    if (first == last) {
                        break;
                    } else {
                        first++;
                    }
                }
            }
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data data4 = permitFee.getData();
            FeeDobj feeDobj6 = new FeeDobj(data4 != null ? data4.getSumOfFine() : null, "Fine Amount", "0", 0, "0", "0");
            com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.Data data5 = permitFee.getData();
            FeeDobj feeDobj7 = new FeeDobj(data5 != null ? data5.getSumOfTotal() : null, "Total Amount", "0", 0, "0", "0");
            feeDobj3.add(feeDobj6);
            feeDobj3.add(feeDobj7);
            this$0.C1().i.setAdapter(new a92(feeDobj3, this$0));
            if (this$0.total_amount.equals("0") || this$0.total_amount.equals("0.0")) {
                this$0.C1().A.setText("Proceed");
            }
            try {
                this$0.C1().v.setText("0.0");
            } catch (Exception unused) {
                this$0.C1().v.setText("0.0");
            }
        } catch (Exception e) {
            e.printStackTrace();
            this$0.C1().m.setVisibility(8);
            this$0.w2(this$0, "Unable to get the fee details, Please try after some time!");
        }
    }

    public static final void X1(FeesDetailsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        this$0.w2(this$0, "Unable to get the fee details, Please try after some time!");
    }

    public static final void Y1(FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            vh7 vh7Var = new vh7(this$0);
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true)) {
                if (this$0.isFaceless) {
                    String str = this$0.chasi_no;
                    Boolean bool = this$0.nofees;
                    String str2 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle = this$0.duplicate_RC;
                    HPAResModle hPAResModle = this$0.hpaObject;
                    HptTerResponse hptTerResponse = this$0.hptObject;
                    NocDraftResponse nocDraftResponse = this$0.noc_draft;
                    String strE1 = this$0.E1();
                    String strR = hz0.a.r();
                    String strJ1 = this$0.J1();
                    Double dValueOf = Double.valueOf(0.0d);
                    String strK1 = this$0.K1();
                    String strP1 = this$0.P1();
                    String rc_vh_class_cd = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str, bool, "A", str2, chaangeOfAddressStatus, 22, dulicatercresponsemodle, "", "", hPAResModle, hptTerResponse, 0, "", 0, "", "", nocDraftResponse, strE1, strR, "", "", strJ1, "", "", dValueOf, 0, strK1, strP1, "", "", "", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str3 = this$0.chasi_no;
                Boolean bool2 = this$0.nofees;
                String str4 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus2 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle2 = this$0.duplicate_RC;
                HPAResModle hPAResModle2 = this$0.hpaObject;
                HptTerResponse hptTerResponse2 = this$0.hptObject;
                NocDraftResponse nocDraftResponse2 = this$0.noc_draft;
                String strE12 = this$0.E1();
                String strR2 = hz0.a.r();
                String strJ12 = this$0.J1();
                Double dValueOf2 = Double.valueOf(0.0d);
                String strK12 = this$0.K1();
                String strP12 = this$0.P1();
                String rc_vh_class_cd2 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str3, bool2, "M", str4, chaangeOfAddressStatus2, 22, dulicatercresponsemodle2, "", "", hPAResModle2, hptTerResponse2, 0, "", 0, "", "", nocDraftResponse2, strE12, strR2, "", "", strJ12, "", "", dValueOf2, 0, strK12, strP12, "", "", "", rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str5 = this$0.chasi_no;
                    Boolean bool3 = this$0.nofees;
                    String str6 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus3 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle3 = this$0.duplicate_RC;
                    HPAResModle hPAResModle3 = this$0.hpaObject;
                    HptTerResponse hptTerResponse3 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse3 = this$0.noc_draft;
                    String strE13 = this$0.E1();
                    String strR3 = hz0.a.r();
                    String strJ13 = this$0.J1();
                    Double dValueOf3 = Double.valueOf(0.0d);
                    String strK13 = this$0.K1();
                    String strP13 = this$0.P1();
                    String rc_vh_class_cd3 = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str5, bool3, "A", str6, chaangeOfAddressStatus3, 22, dulicatercresponsemodle3, "", "", hPAResModle3, hptTerResponse3, 0, "", 0, "", "", nocDraftResponse3, strE13, strR3, "", "", strJ13, "", "", dValueOf3, 0, strK13, strP13, "", "", "", rc_vh_class_cd3 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd3)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str7 = this$0.chasi_no;
                Boolean bool4 = this$0.nofees;
                String str8 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus4 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle4 = this$0.duplicate_RC;
                HPAResModle hPAResModle4 = this$0.hpaObject;
                HptTerResponse hptTerResponse4 = this$0.hptObject;
                NocDraftResponse nocDraftResponse4 = this$0.noc_draft;
                String strE14 = this$0.E1();
                String strR4 = hz0.a.r();
                String strJ14 = this$0.J1();
                Double dValueOf4 = Double.valueOf(0.0d);
                String strK14 = this$0.K1();
                String strP14 = this$0.P1();
                String rc_vh_class_cd4 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str7, bool4, "M", str8, chaangeOfAddressStatus4, 22, dulicatercresponsemodle4, "", "", hPAResModle4, hptTerResponse4, 0, "", 0, "", "", nocDraftResponse4, strE14, strR4, "", "", strJ14, "", "", dValueOf4, 0, strK14, strP14, "", "", "", rc_vh_class_cd4 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd4)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str9 = this$0.chasi_no;
                    Boolean bool5 = this$0.nofees;
                    String str10 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus5 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle5 = this$0.duplicate_RC;
                    HPAResModle hPAResModle5 = this$0.hpaObject;
                    HptTerResponse hptTerResponse5 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse5 = this$0.noc_draft;
                    String strE15 = this$0.E1();
                    String strR5 = hz0.a.r();
                    String strJ15 = this$0.J1();
                    Double dValueOf5 = Double.valueOf(0.0d);
                    String strK15 = this$0.K1();
                    String strP15 = this$0.P1();
                    String rc_vh_class_cd5 = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str9, bool5, "A", str10, chaangeOfAddressStatus5, 22, dulicatercresponsemodle5, "", "", hPAResModle5, hptTerResponse5, 0, "", 0, "", "", nocDraftResponse5, strE15, strR5, "", "", strJ15, "", "", dValueOf5, 0, strK15, strP15, "", "", "", rc_vh_class_cd5 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd5)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str11 = this$0.chasi_no;
                Boolean bool6 = this$0.nofees;
                String str12 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus6 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle6 = this$0.duplicate_RC;
                HPAResModle hPAResModle6 = this$0.hpaObject;
                HptTerResponse hptTerResponse6 = this$0.hptObject;
                NocDraftResponse nocDraftResponse6 = this$0.noc_draft;
                String strE16 = this$0.E1();
                String strR6 = hz0.a.r();
                String strJ16 = this$0.J1();
                Double dValueOf6 = Double.valueOf(0.0d);
                String strK16 = this$0.K1();
                String strP16 = this$0.P1();
                String rc_vh_class_cd6 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str11, bool6, "M", str12, chaangeOfAddressStatus6, 22, dulicatercresponsemodle6, "", "", hPAResModle6, hptTerResponse6, 0, "", 0, "", "", nocDraftResponse6, strE16, strR6, "", "", strJ16, "", "", dValueOf6, 0, strK16, strP16, "", "", "", rc_vh_class_cd6 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd6)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str13 = this$0.chasi_no;
                    Boolean bool7 = this$0.nofees;
                    String str14 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus7 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle7 = this$0.duplicate_RC;
                    HPAResModle hPAResModle7 = this$0.hpaObject;
                    HptTerResponse hptTerResponse7 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse7 = this$0.noc_draft;
                    String strE17 = this$0.E1();
                    String strR7 = hz0.a.r();
                    String strJ17 = this$0.J1();
                    Double dValueOf7 = Double.valueOf(0.0d);
                    String strK17 = this$0.K1();
                    String strP17 = this$0.P1();
                    String rc_vh_class_cd7 = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str13, bool7, "A", str14, chaangeOfAddressStatus7, 22, dulicatercresponsemodle7, "", "", hPAResModle7, hptTerResponse7, 0, "", 0, "", "", nocDraftResponse7, strE17, strR7, "", "", strJ17, "", "", dValueOf7, 0, strK17, strP17, "", "", "", rc_vh_class_cd7 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd7)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str15 = this$0.chasi_no;
                Boolean bool8 = this$0.nofees;
                String str16 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus8 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle8 = this$0.duplicate_RC;
                HPAResModle hPAResModle8 = this$0.hpaObject;
                HptTerResponse hptTerResponse8 = this$0.hptObject;
                NocDraftResponse nocDraftResponse8 = this$0.noc_draft;
                String strE18 = this$0.E1();
                String strR8 = hz0.a.r();
                String strJ18 = this$0.J1();
                Double dValueOf8 = Double.valueOf(0.0d);
                String strK18 = this$0.K1();
                String strP18 = this$0.P1();
                String rc_vh_class_cd8 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str15, bool8, "M", str16, chaangeOfAddressStatus8, 22, dulicatercresponsemodle8, "", "", hPAResModle8, hptTerResponse8, 0, "", 0, "", "", nocDraftResponse8, strE18, strR8, "", "", strJ18, "", "", dValueOf8, 0, strK18, strP18, "", "", "", rc_vh_class_cd8 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd8)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str17 = this$0.chasi_no;
                    Boolean bool9 = this$0.nofees;
                    String str18 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus9 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle9 = this$0.duplicate_RC;
                    HPAResModle hPAResModle9 = this$0.hpaObject;
                    HptTerResponse hptTerResponse9 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse9 = this$0.noc_draft;
                    String strE19 = this$0.E1();
                    String strR9 = hz0.a.r();
                    String strJ19 = this$0.J1();
                    Double dValueOf9 = Double.valueOf(0.0d);
                    String strK19 = this$0.K1();
                    String strP19 = this$0.P1();
                    String rc_vh_class_cd9 = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str17, bool9, "A", str18, chaangeOfAddressStatus9, 22, dulicatercresponsemodle9, "", "", hPAResModle9, hptTerResponse9, 0, "", 0, "", "", nocDraftResponse9, strE19, strR9, "", "", strJ19, "", "", dValueOf9, 0, strK19, strP19, "", "", "", rc_vh_class_cd9 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd9)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str19 = this$0.chasi_no;
                Boolean bool10 = this$0.nofees;
                String str20 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus10 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle10 = this$0.duplicate_RC;
                HPAResModle hPAResModle10 = this$0.hpaObject;
                HptTerResponse hptTerResponse10 = this$0.hptObject;
                NocDraftResponse nocDraftResponse10 = this$0.noc_draft;
                String strE110 = this$0.E1();
                String strR10 = hz0.a.r();
                String strJ110 = this$0.J1();
                Double dValueOf10 = Double.valueOf(0.0d);
                String strK110 = this$0.K1();
                String strP110 = this$0.P1();
                String rc_vh_class_cd10 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str19, bool10, "M", str20, chaangeOfAddressStatus10, 22, dulicatercresponsemodle10, "", "", hPAResModle10, hptTerResponse10, 0, "", 0, "", "", nocDraftResponse10, strE110, strR10, "", "", strJ110, "", "", dValueOf10, 0, strK110, strP110, "", "", "", rc_vh_class_cd10 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd10)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str21 = this$0.chasi_no;
                    Boolean bool11 = this$0.nofees;
                    String str22 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus11 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle11 = this$0.duplicate_RC;
                    HPAResModle hPAResModle11 = this$0.hpaObject;
                    HptTerResponse hptTerResponse11 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse11 = this$0.noc_draft;
                    String strE111 = this$0.E1();
                    String strR11 = hz0.a.r();
                    String strJ111 = this$0.J1();
                    Double dValueOf11 = Double.valueOf(0.0d);
                    String strK111 = this$0.K1();
                    String strP111 = this$0.P1();
                    String rc_vh_class_cd11 = this$0.M1().getRc_vh_class_cd();
                    Integer numValueOf = rc_vh_class_cd11 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd11)) : null;
                    DuplicateFitessDraft duplicateFitessDraft = this$0.duplicate_FC;
                    Data data = this$0.rcCancellationdto;
                    com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data2 = this$0.rcSurrenderdto;
                    DuplicatePermitDraft duplicatePermitDraft = this$0.duplicate_Permit;
                    this$0.j2(new BeforePaymentRequest(str21, bool11, "A", str22, chaangeOfAddressStatus11, 22, dulicatercresponsemodle11, "", "", hPAResModle11, hptTerResponse11, 0, "", 0, "", "", nocDraftResponse11, strE111, strR11, "", "", strJ111, "", "", dValueOf11, 0, strK111, strP111, "", "", "", numValueOf, duplicateFitessDraft, data, data2, duplicatePermitDraft != null ? duplicatePermitDraft.getData() : null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str23 = this$0.chasi_no;
                Boolean bool12 = this$0.nofees;
                String str24 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus12 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle12 = this$0.duplicate_RC;
                HPAResModle hPAResModle12 = this$0.hpaObject;
                HptTerResponse hptTerResponse12 = this$0.hptObject;
                NocDraftResponse nocDraftResponse12 = this$0.noc_draft;
                String strE112 = this$0.E1();
                String strR12 = hz0.a.r();
                String strJ112 = this$0.J1();
                Double dValueOf12 = Double.valueOf(0.0d);
                String strK112 = this$0.K1();
                String strP112 = this$0.P1();
                String rc_vh_class_cd12 = this$0.M1().getRc_vh_class_cd();
                Integer numValueOf2 = rc_vh_class_cd12 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd12)) : null;
                DuplicateFitessDraft duplicateFitessDraft2 = this$0.duplicate_FC;
                Data data3 = this$0.rcCancellationdto;
                com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data data4 = this$0.rcSurrenderdto;
                DuplicatePermitDraft duplicatePermitDraft2 = this$0.duplicate_Permit;
                this$0.j2(new BeforePaymentRequest(str23, bool12, "M", str24, chaangeOfAddressStatus12, 22, dulicatercresponsemodle12, "", "", hPAResModle12, hptTerResponse12, 0, "", 0, "", "", nocDraftResponse12, strE112, strR12, "", "", strJ112, "", "", dValueOf12, 0, strK112, strP112, "", "", "", numValueOf2, duplicateFitessDraft2, data3, data4, duplicatePermitDraft2 != null ? duplicatePermitDraft2.getData() : null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_RELEASE_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str25 = this$0.chasi_no;
                    Boolean bool13 = this$0.nofees;
                    String str26 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus13 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle13 = this$0.duplicate_RC;
                    HPAResModle hPAResModle13 = this$0.hpaObject;
                    HptTerResponse hptTerResponse13 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse13 = this$0.noc_draft;
                    String strE113 = this$0.E1();
                    String strR13 = hz0.a.r();
                    String strJ113 = this$0.J1();
                    Double dValueOf13 = Double.valueOf(0.0d);
                    String strK113 = this$0.K1();
                    String strP113 = this$0.P1();
                    String rc_vh_class_cd13 = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str25, bool13, "A", str26, chaangeOfAddressStatus13, 22, dulicatercresponsemodle13, "", "", hPAResModle13, hptTerResponse13, 0, "", 0, "", "", nocDraftResponse13, strE113, strR13, "", "", strJ113, "", "", dValueOf13, 0, strK113, strP113, "", "", "", rc_vh_class_cd13 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd13)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str27 = this$0.chasi_no;
                Boolean bool14 = this$0.nofees;
                String str28 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus14 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle14 = this$0.duplicate_RC;
                HPAResModle hPAResModle14 = this$0.hpaObject;
                HptTerResponse hptTerResponse14 = this$0.hptObject;
                NocDraftResponse nocDraftResponse14 = this$0.noc_draft;
                String strE114 = this$0.E1();
                String strR14 = hz0.a.r();
                String strJ114 = this$0.J1();
                Double dValueOf14 = Double.valueOf(0.0d);
                String strK114 = this$0.K1();
                String strP114 = this$0.P1();
                String rc_vh_class_cd14 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str27, bool14, "M", str28, chaangeOfAddressStatus14, 22, dulicatercresponsemodle14, "", "", hPAResModle14, hptTerResponse14, 0, "", 0, "", "", nocDraftResponse14, strE114, strR14, "", "", strJ114, "", "", dValueOf14, 0, strK114, strP114, "", "", "", rc_vh_class_cd14 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd14)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            if (!StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.ALTERATION_CODE, true)) {
                this$0.F1().show();
                if (this$0.isFaceless) {
                    String str29 = this$0.chasi_no;
                    Boolean bool15 = this$0.nofees;
                    String str30 = this$0.appl_no;
                    ChaangeOfAddressStatus chaangeOfAddressStatus15 = this$0.confirm_details;
                    dulicateRcResponseModle dulicatercresponsemodle15 = this$0.duplicate_RC;
                    HPAResModle hPAResModle15 = this$0.hpaObject;
                    HptTerResponse hptTerResponse15 = this$0.hptObject;
                    NocDraftResponse nocDraftResponse15 = this$0.noc_draft;
                    String strE115 = this$0.E1();
                    String strR15 = hz0.a.r();
                    String strJ115 = this$0.J1();
                    Double dValueOf15 = Double.valueOf(0.0d);
                    String strK115 = this$0.K1();
                    String strP115 = this$0.P1();
                    String rc_vh_class_cd15 = this$0.M1().getRc_vh_class_cd();
                    this$0.j2(new BeforePaymentRequest(str29, bool15, "A", str30, chaangeOfAddressStatus15, 22, dulicatercresponsemodle15, "", "", hPAResModle15, hptTerResponse15, 0, "", 0, "", "", nocDraftResponse15, strE115, strR15, "", "", strJ115, "", "", dValueOf15, 0, strK115, strP115, "", "", "", rc_vh_class_cd15 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd15)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                    this$0.Q1().z(this$0, this$0.G1());
                    return;
                }
                String str31 = this$0.chasi_no;
                Boolean bool16 = this$0.nofees;
                String str32 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus16 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle16 = this$0.duplicate_RC;
                HPAResModle hPAResModle16 = this$0.hpaObject;
                HptTerResponse hptTerResponse16 = this$0.hptObject;
                NocDraftResponse nocDraftResponse16 = this$0.noc_draft;
                String strE116 = this$0.E1();
                String strR16 = hz0.a.r();
                String strJ116 = this$0.J1();
                Double dValueOf16 = Double.valueOf(0.0d);
                String strK116 = this$0.K1();
                String strP116 = this$0.P1();
                String rc_vh_class_cd16 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str31, bool16, "M", str32, chaangeOfAddressStatus16, 22, dulicatercresponsemodle16, "", "", hPAResModle16, hptTerResponse16, 0, "", 0, "", "", nocDraftResponse16, strE116, strR16, "", "", strJ116, "", "", dValueOf16, 0, strK116, strP116, "", "", "", rc_vh_class_cd16 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd16)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            this$0.F1().show();
            new Gson();
            if (this$0.isFaceless) {
                String str33 = this$0.chasi_no;
                Boolean bool17 = this$0.nofees;
                String str34 = this$0.appl_no;
                ChaangeOfAddressStatus chaangeOfAddressStatus17 = this$0.confirm_details;
                dulicateRcResponseModle dulicatercresponsemodle17 = this$0.duplicate_RC;
                HPAResModle hPAResModle17 = this$0.hpaObject;
                HptTerResponse hptTerResponse17 = this$0.hptObject;
                NocDraftResponse nocDraftResponse17 = this$0.noc_draft;
                String strE117 = this$0.E1();
                String strR17 = hz0.a.r();
                String strJ117 = this$0.J1();
                Double dValueOf17 = Double.valueOf(0.0d);
                String strK117 = this$0.K1();
                String strP117 = this$0.P1();
                String rc_vh_class_cd17 = this$0.M1().getRc_vh_class_cd();
                this$0.j2(new BeforePaymentRequest(str33, bool17, "A", str34, chaangeOfAddressStatus17, 22, dulicatercresponsemodle17, "", "", hPAResModle17, hptTerResponse17, 0, "", 0, "", "", nocDraftResponse17, strE117, strR17, "", "", strJ117, "", "", dValueOf17, 0, strK117, strP117, "", "", "", rc_vh_class_cd17 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd17)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
                this$0.Q1().z(this$0, this$0.G1());
                return;
            }
            this$0.F1().show();
            String str35 = this$0.chasi_no;
            Boolean bool18 = this$0.nofees;
            String str36 = this$0.appl_no;
            ChaangeOfAddressStatus chaangeOfAddressStatus18 = this$0.confirm_details;
            dulicateRcResponseModle dulicatercresponsemodle18 = this$0.duplicate_RC;
            HPAResModle hPAResModle18 = this$0.hpaObject;
            HptTerResponse hptTerResponse18 = this$0.hptObject;
            NocDraftResponse nocDraftResponse18 = this$0.noc_draft;
            String strE118 = this$0.E1();
            String strR18 = hz0.a.r();
            String strJ118 = this$0.J1();
            Double dValueOf18 = Double.valueOf(0.0d);
            String strK118 = this$0.K1();
            String strP118 = this$0.P1();
            String rc_vh_class_cd18 = this$0.M1().getRc_vh_class_cd();
            this$0.j2(new BeforePaymentRequest(str35, bool18, "M", str36, chaangeOfAddressStatus18, 22, dulicatercresponsemodle18, "", "", hPAResModle18, hptTerResponse18, 0, "", 0, "", "", nocDraftResponse18, strE118, strR18, "", "", strJ118, "", "", dValueOf18, 0, strK118, strP118, "", "", "", rc_vh_class_cd18 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd18)) : null, this$0.duplicate_FC, this$0.rcCancellationdto, this$0.rcSurrenderdto, null, this$0.rcReleaseDto, this$0.npAuthPermit, vh7Var.a(), this$0.temPermitDraft, this$0.miscellaneousDto, this$0.permitRenewalDraft, this$0.specialPermitDraft));
            this$0.Q1().z(this$0, this$0.G1());
        } catch (Exception e) {
            this$0.F1().dismiss();
            e.printStackTrace();
        }
    }

    public static final void Z1(FeesDetailsScreen this$0, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl == null || returnUrl.length() == 0) {
            return;
        }
        try {
            Log.e("IsFaceless Feedetails-- > ", String.valueOf(this$0.isFaceless));
            Intent intent = new Intent(this$0, (Class<?>) VahanPayment.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            if (!StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true) && !StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                intent.putExtra(VContant.APP_NO, this$0.appl_no);
            }
            intent.putExtra("state_code", this$0.P1());
            intent.putExtra("rc_number", this$0.K1());
            intent.putExtra(VContant.PURPOSE_CODE, this$0.J1());
            intent.putExtra("URL", paymentBeforeUrlResponse.getReturnUrl());
            intent.putExtra(VContant.FINAL_SUBMIT, this$0.G1());
            intent.putExtra("RC", this$0.L1());
            intent.putExtra("RcDetails", this$0.M1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.B1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.A1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void a2(FeesDetailsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        if (str.equals("Error")) {
            this$0.u2(this$0, this$0.getString(R.string.service_unavable_please_try));
        } else {
            this$0.u2(this$0, str);
        }
    }

    public static final void b2(FeesDetailsScreen this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        try {
            Intrinsics.checkNotNull(distictModle);
            int size = distictModle.size();
            for (int i = 0; i < size; i++) {
                String strValueOf = String.valueOf(distictModle.get(i).getDist_cd());
                ChaangeOfAddressStatus chaangeOfAddressStatus = this$0.confirm_details;
                Intrinsics.checkNotNull(chaangeOfAddressStatus);
                if (StringsKt__StringsJVMKt.equals(strValueOf, chaangeOfAddressStatus.getC_district().toString(), true)) {
                    StringBuilder sb = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus2 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus2);
                    sb.append(chaangeOfAddressStatus2.getC_add1());
                    sb.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus3 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus3);
                    sb.append(chaangeOfAddressStatus3.getC_add2());
                    sb.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus4 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus4);
                    sb.append(chaangeOfAddressStatus4.getC_add3());
                    sb.append(", ");
                    sb.append(distictModle.get(i).getDescr());
                    sb.append(", ");
                    VContant.Companion companion = VContant.INSTANCE;
                    sb.append(companion.l(String.valueOf(this$0.M1().getRc_c_state())));
                    sb.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus5 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus5);
                    sb.append(chaangeOfAddressStatus5.getC_pincode());
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus6 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus6);
                    sb2.append(chaangeOfAddressStatus6.getP_add1());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus7 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus7);
                    sb2.append(chaangeOfAddressStatus7.getP_add2());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus8 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus8);
                    sb2.append(chaangeOfAddressStatus8.getP_add3());
                    sb2.append(", ");
                    sb2.append(distictModle.get(i).getDescr());
                    sb2.append(", ");
                    sb2.append(companion.l(String.valueOf(this$0.M1().getRc_c_state())));
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus9 = this$0.confirm_details;
                    Intrinsics.checkNotNull(chaangeOfAddressStatus9);
                    sb2.append(chaangeOfAddressStatus9.getP_pincode());
                    String string2 = sb2.toString();
                    this$0.C1().c.setText(string.toString());
                    this$0.C1().p.setText(string2.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb3 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus10 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus10);
            sb3.append(chaangeOfAddressStatus10.getC_add1());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus11 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus11);
            sb3.append(chaangeOfAddressStatus11.getC_add2());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus12 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus12);
            sb3.append(chaangeOfAddressStatus12.getC_add3());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus13 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus13);
            sb3.append(chaangeOfAddressStatus13.getC_district());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus14 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus14);
            sb3.append(chaangeOfAddressStatus14.getC_state());
            sb3.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus15 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus15);
            sb3.append(chaangeOfAddressStatus15.getC_pincode());
            String string3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus16 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus16);
            sb4.append(chaangeOfAddressStatus16.getP_add1());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus17 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus17);
            sb4.append(chaangeOfAddressStatus17.getP_add2());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus18 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus18);
            sb4.append(chaangeOfAddressStatus18.getP_add3());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus19 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus19);
            sb4.append(chaangeOfAddressStatus19.getP_district());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus20 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus20);
            sb4.append(chaangeOfAddressStatus20.getP_state());
            sb4.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus21 = this$0.confirm_details;
            Intrinsics.checkNotNull(chaangeOfAddressStatus21);
            sb4.append(chaangeOfAddressStatus21.getP_pincode());
            String string4 = sb4.toString();
            this$0.C1().c.setText(string3.toString());
            this$0.C1().p.setText(string4.toString());
        }
    }

    private final void c2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void v2(Dialog d, FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void x2(Dialog dialog, FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.finish();
    }

    public static final void y1(Dialog d, FeesDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void z1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final String A1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String B1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final yb C1() {
        yb ybVar = this.binding;
        if (ybVar != null) {
            return ybVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 D1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String E1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog F1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final BeforePaymentRequest G1() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final DuplicateFitnessService H1() {
        DuplicateFitnessService duplicateFitnessService = this.permitService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitService");
        return null;
    }

    public final o47 I1() {
        o47 o47Var = this.permitViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permitViewModle");
        return null;
    }

    public final String J1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final String K1() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final String L1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails M1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService N1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String O1() {
        String str = this.service_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("service_name");
        return null;
    }

    public final String P1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final ld7 Q1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void f2(yb ybVar) {
        Intrinsics.checkNotNullParameter(ybVar, "<set-?>");
        this.binding = ybVar;
    }

    public final void g2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void h2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void i2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void j2(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    public final void k2(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.permitService = duplicateFitnessService;
    }

    public final void l2(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.permitViewModle = o47Var;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        x1(this, D1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String strSubstring;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees_details_screen);
        yb ybVarC = yb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ybVarC, "inflate(...)");
        f2(ybVarC);
        setContentView(C1().b());
        ta3.a aVar = ta3.a;
        aVar.Q0(this, C1());
        g2(new wa3(this));
        q2(VahanProService.INSTANCE.a(this));
        k2(DuplicateFitnessService.INSTANCE.a(this));
        i2(new ProgressDialog(this));
        F1().setMessage("Please wait...");
        F1().setCancelable(false);
        F1().setCanceledOnTouchOutside(false);
        t2((ld7) new z(this, new kd7(new jd7(N1()))).a(ld7.class));
        l2((o47) new z(this, new n47(new j37(H1()))).a(o47.class));
        String stringExtra = getIntent().getStringExtra("state_code");
        Intrinsics.checkNotNull(stringExtra);
        s2(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("rc_number");
        Intrinsics.checkNotNull(stringExtra2);
        n2(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
        Intrinsics.checkNotNull(stringExtra3);
        m2(stringExtra3);
        String stringExtra4 = getIntent().getStringExtra(VContant.SERVICE_NAME);
        Intrinsics.checkNotNull(stringExtra4);
        r2(stringExtra4);
        String stringExtra5 = getIntent().getStringExtra("off_code");
        Intrinsics.checkNotNull(stringExtra5);
        h2(stringExtra5);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        e2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        d2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        o2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        p2((NrvDetails) serializableExtra);
        C1().i.setLayoutManager(new GridLayoutManager(this, 2));
        C1().i.setHasFixedSize(true);
        if (this.isFaceless) {
            C1().t.f.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = C1().t.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        if (kt6.d(J1()) && J1().equals(VContant.UPDATE_MOBILE_PURPOSE_CODE)) {
            boolean z2 = this.isFaceless;
            LinearLayout dmsLL = C1().t.d;
            Intrinsics.checkNotNullExpressionValue(dmsLL, "dmsLL");
            companion.M(z2, dmsLL);
        }
        try {
            C1().I.setText(D1().b("vehicle_no", "Vehicle No.:") + ' ' + K1());
            C1().B.i.setText(aVar.P(this, O1().toString()));
            C1().J.setText(D1().b("view_vehicle_details", "View Vehicle Details"));
            C1().J.setPaintFlags(C1().J.getPaintFlags() | 8);
            C1().J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b92
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeesDetailsScreen.R1(this.a, view);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
            String stringExtra6 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra6);
            this.appl_no = stringExtra6;
            Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.HYPOTHICATION_TERMINATION_CODE);
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse");
            this.hptObject = (HptTerResponse) serializableExtra2;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
            String stringExtra7 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra7);
            this.appl_no = stringExtra7;
            Serializable serializableExtra3 = getIntent().getSerializableExtra(VContant.HYPOTHECATION_ADDITION_CODE);
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPA.HPAResModle");
            this.hpaObject = (HPAResModle) serializableExtra3;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_RC_CODE, true)) {
            String stringExtra8 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra8);
            this.appl_no = stringExtra8;
            Serializable serializableExtra4 = getIntent().getSerializableExtra(VContant.DUPLICATE_RC_CODE);
            Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle");
            this.duplicate_RC = (dulicateRcResponseModle) serializableExtra4;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NOC_CODE, true)) {
            String stringExtra9 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra9);
            this.appl_no = stringExtra9;
            Serializable serializableExtra5 = getIntent().getSerializableExtra(VContant.NOC_CODE);
            Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse");
            this.noc_draft = (NocDraftResponse) serializableExtra5;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
            String stringExtra10 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra10);
            this.appl_no = stringExtra10;
            Serializable serializableExtra6 = getIntent().getSerializableExtra("COV");
            Intrinsics.checkNotNull(serializableExtra6, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus");
            this.confirm_details = (ChaangeOfAddressStatus) serializableExtra6;
            try {
                C1().b.setVisibility(0);
                F1().show();
                Q1().s1(this, P1());
            } catch (Exception unused) {
            }
        }
        StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, true);
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_FITNESS_CODE, true)) {
            String stringExtra11 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra11);
            this.appl_no = stringExtra11;
            Serializable serializableExtra7 = getIntent().getSerializableExtra(VContant.DUPLICATE_FITNESS_CODE);
            Intrinsics.checkNotNull(serializableExtra7, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft");
            this.duplicate_FC = (DuplicateFitessDraft) serializableExtra7;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_CANCELLATION_CODE, true)) {
            String stringExtra12 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra12);
            this.appl_no = stringExtra12;
            Serializable serializableExtra8 = getIntent().getSerializableExtra(VContant.RC_CANCELLATION_CODE);
            Intrinsics.checkNotNull(serializableExtra8, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.Data");
            this.rcCancellationdto = (Data) serializableExtra8;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_SURRENDER_RC_CODE, true)) {
            String stringExtra13 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra13);
            this.appl_no = stringExtra13;
            Serializable serializableExtra9 = getIntent().getSerializableExtra(VContant.RC_SURRENDER_RC_CODE);
            Intrinsics.checkNotNull(serializableExtra9, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data");
            this.rcSurrenderdto = (com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.Data) serializableExtra9;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.DUPLICATE_PERMIT_CODE, true)) {
            String stringExtra14 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra14);
            this.appl_no = stringExtra14;
            Serializable serializableExtra10 = getIntent().getSerializableExtra(VContant.DUPLICATE_PERMIT_CODE);
            Intrinsics.checkNotNull(serializableExtra10, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft");
            this.duplicate_Permit = (DuplicatePermitDraft) serializableExtra10;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RC_RELEASE_CODE, true)) {
            String stringExtra15 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra15);
            this.appl_no = stringExtra15;
            Serializable serializableExtra11 = getIntent().getSerializableExtra(VContant.RC_RELEASE_CODE);
            Intrinsics.checkNotNull(serializableExtra11, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data");
            this.rcReleaseDto = (com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.Data) serializableExtra11;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.NP_CODE, true)) {
            String stringExtra16 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra16);
            this.appl_no = stringExtra16;
            this.npAuthPermit = (com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.Data) getIntent().getSerializableExtra(VContant.NP_CODE);
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TEMPERMIT_CODE, true)) {
            String stringExtra17 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra17);
            this.appl_no = stringExtra17;
            Serializable serializableExtra12 = getIntent().getSerializableExtra(VContant.TEMPERMIT_CODE);
            Intrinsics.checkNotNull(serializableExtra12, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data");
            this.temPermitDraft = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) serializableExtra12;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
            String stringExtra18 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra18);
            this.appl_no = stringExtra18;
            Serializable serializableExtra13 = getIntent().getSerializableExtra(VContant.TRANFER_OF_OWNERSHIP_CODE);
            Intrinsics.checkNotNull(serializableExtra13, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data");
            this.transferOfOwnerDraft = (com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel.Data) serializableExtra13;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.PERMIT_RENEWAL_CODE, true)) {
            String stringExtra19 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra19);
            this.appl_no = stringExtra19;
            Serializable serializableExtra14 = getIntent().getSerializableExtra(VContant.PERMIT_RENEWAL_CODE);
            Intrinsics.checkNotNull(serializableExtra14, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data");
            this.permitRenewalDraft = (com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.Data) serializableExtra14;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.ALTERATION_CODE, true)) {
            String stringExtra20 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra20);
            this.appl_no = stringExtra20;
            Serializable serializableExtra15 = getIntent().getSerializableExtra(VContant.ALTERATION_CODE);
            Intrinsics.checkNotNull(serializableExtra15, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data");
            this.alterDraft = (com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data) serializableExtra15;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.UPDATE_MOBILE_CODE, true)) {
            String stringExtra21 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra21);
            this.appl_no = stringExtra21;
            Serializable serializableExtra16 = getIntent().getSerializableExtra(VContant.UPDATE_MOBILE_CODE);
            Intrinsics.checkNotNull(serializableExtra16, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data");
            this.mobileNoUpdateDraft = (com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data) serializableExtra16;
        }
        if (StringsKt__StringsJVMKt.equals(getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.SPEICAL_PERMIT_CODE, true)) {
            String stringExtra22 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra22);
            this.appl_no = stringExtra22;
            Serializable serializableExtra17 = getIntent().getSerializableExtra(VContant.SPEICAL_PERMIT_CODE);
            Intrinsics.checkNotNull(serializableExtra17, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data");
            this.specialPermitDraft = (com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data) serializableExtra17;
        }
        C1().B.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.S1(this.a, view);
            }
        });
        C1().B.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.T1(this.a, view);
            }
        });
        F1().show();
        if (VContant.INSTANCE.f(J1())) {
            String rc_chasi_no = M1().getRc_chasi_no();
            String strSubstring2 = null;
            if (rc_chasi_no != null) {
                String rc_chasi_no2 = M1().getRc_chasi_no();
                Intrinsics.checkNotNull(rc_chasi_no2 != null ? Integer.valueOf(rc_chasi_no2.length()) : null);
                strSubstring = rc_chasi_no.substring(r1.intValue() - 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            } else {
                strSubstring = null;
            }
            this.chasi_no = strSubstring;
            this.nofees = Boolean.FALSE;
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            map.put("purposeCode", J1());
            map.put("upTodate", hz0.a.r());
            arrayList.add(map);
            o47 o47VarI1 = I1();
            VUtility.Companion companion2 = VUtility.INSTANCE;
            String str = this.appl_no;
            String rc_chasi_no3 = M1().getRc_chasi_no();
            if (rc_chasi_no3 != null) {
                String rc_chasi_no4 = M1().getRc_chasi_no();
                Intrinsics.checkNotNull(rc_chasi_no4 != null ? Integer.valueOf(rc_chasi_no4.length()) : null);
                strSubstring2 = rc_chasi_no3.substring(r0.intValue() - 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            }
            o47VarI1.v(this, companion2.M(str, String.valueOf(strSubstring2), K1(), arrayList).toString());
        } else {
            Q1().t1(this, K1(), StringsKt__StringsKt.trim((CharSequence) P1()).toString(), StringsKt__StringsKt.trim((CharSequence) J1().toString()).toString());
        }
        Q1().T().g(this, new mf4() { // from class: com.zepto.j92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.U1(this.a, (FeesModle) obj);
            }
        });
        Q1().U().g(this, new mf4() { // from class: com.zepto.k92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.V1(this.a, (String) obj);
            }
        });
        I1().w().g(this, new mf4() { // from class: com.zepto.l92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.W1(this.a, (PermitFee) obj);
            }
        });
        I1().x().g(this, new mf4() { // from class: com.zepto.m92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.X1(this.a, (String) obj);
            }
        });
        C1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.Y1(this.a, view);
            }
        });
        Q1().D0().g(this, new mf4() { // from class: com.zepto.o92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.Z1(this.a, (PaymentBeforeUrlResponse) obj);
            }
        });
        Q1().E0().g(this, new mf4() { // from class: com.zepto.p92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.a2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        x1(this, D1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        Q1().J().g(this, new mf4() { // from class: com.zepto.c92
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FeesDetailsScreen.b2(this.a, (DistictModle) obj);
            }
        });
    }

    public final void p2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void q2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.service_name = str;
    }

    public final void s2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final void t2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void u2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.v2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void w2(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.x2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void x1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
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
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.y1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeesDetailsScreen.z1(dialog, view);
            }
        });
        dialog.show();
    }
}
