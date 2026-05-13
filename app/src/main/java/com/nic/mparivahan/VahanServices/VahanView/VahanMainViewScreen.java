package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerIdentification;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.AadhaarMobModle;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.cc1;
import com.zepto.dc1;
import com.zepto.e03;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.gl7;
import com.zepto.gz3;
import com.zepto.hf;
import com.zepto.hh;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.qs1;
import com.zepto.sg4;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.yy0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0003H\u0014J\u0006\u0010\t\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fJ$\u0010\u0015\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0003R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R2\u00106\u001a\u0012\u0012\u0004\u0012\u00020.0-j\b\u0012\u0004\u0012\u00020.`/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\"\u0010e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010X\u001a\u0004\bc\u0010Z\"\u0004\bd\u0010\\R\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010p\u001a\u0005\b\u0087\u0001\u0010r\"\u0005\b\u0088\u0001\u0010tR&\u0010\u008d\u0001\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010x\u001a\u0005\b\u008b\u0001\u0010z\"\u0005\b\u008c\u0001\u0010|RG\u0010\u0096\u0001\u001a \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u008e\u0001j\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R%\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010X\u001a\u0005\b\u0098\u0001\u0010Z\"\u0005\b\u0099\u0001\u0010\\R&\u0010\u009d\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010X\u001a\u0005\b\u009b\u0001\u0010Z\"\u0005\b\u009c\u0001\u0010\\R(\u0010¡\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010X\u001a\u0005\b\u009f\u0001\u0010Z\"\u0005\b \u0001\u0010\\R&\u0010¥\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010X\u001a\u0005\b£\u0001\u0010Z\"\u0005\b¤\u0001\u0010\\R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R:\u0010±\u0001\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010-j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`/8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b®\u0001\u00101\u001a\u0005\b¯\u0001\u00103\"\u0005\b°\u0001\u00105R*\u0010¹\u0001\u001a\u00030²\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010Á\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R&\u0010Å\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÂ\u0001\u0010X\u001a\u0005\bÃ\u0001\u0010Z\"\u0005\bÄ\u0001\u0010\\R&\u0010É\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÆ\u0001\u0010X\u001a\u0005\bÇ\u0001\u0010Z\"\u0005\bÈ\u0001\u0010\\R&\u0010Í\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÊ\u0001\u0010X\u001a\u0005\bË\u0001\u0010Z\"\u0005\bÌ\u0001\u0010\\R\"\u0010Ñ\u0001\u001a\f\u0012\u0005\u0012\u00030Ï\u0001\u0018\u00010Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010Ð\u0001R#\u0010Ó\u0001\u001a\f\u0012\u0005\u0012\u00030Ï\u0001\u0018\u00010Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ð\u0001R&\u0010×\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÔ\u0001\u0010X\u001a\u0005\bÕ\u0001\u0010Z\"\u0005\bÖ\u0001\u0010\\R)\u0010Ý\u0001\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010³\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R&\u0010á\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÞ\u0001\u0010X\u001a\u0005\bß\u0001\u0010Z\"\u0005\bà\u0001\u0010\\R&\u0010å\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bâ\u0001\u0010X\u001a\u0005\bã\u0001\u0010Z\"\u0005\bä\u0001\u0010\\¨\u0006è\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanMainViewScreen;", "Lcom/zepto/pq;", "Lcom/zepto/sg4;", "", "s2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "P2", "Landroid/content/Context;", "context", "", "rc_number", "B1", "title", "y1", "rc_num", "", "position", "chassiNo", "e0", "message", "R2", "", "aa", "mob", "Q2", "e2", "Lcom/zepto/hh;", "C", "Lcom/zepto/hh;", "H1", "()Lcom/zepto/hh;", "u2", "(Lcom/zepto/hh;)V", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "J1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "x2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "E", "Ljava/util/ArrayList;", "G1", "()Ljava/util/ArrayList;", "t2", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/gl7;", "F", "Lcom/zepto/gl7;", "N1", "()Lcom/zepto/gl7;", "C2", "(Lcom/zepto/gl7;)V", "myRcAdapter", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "Q1", "()Landroid/app/ProgressDialog;", "F2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "H", "Lcom/zepto/al7;", "c2", "()Lcom/zepto/al7;", "N2", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "I", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "U1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "H2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "J", "Ljava/lang/String;", "I1", "()Ljava/lang/String;", "v2", "(Ljava/lang/String;)V", "chassi_number", "K", "getClickvalue", "w2", "clickvalue", "L", "R1", "setRc_adapter_val", "rc_adapter_val", "Lcom/zepto/vh7;", "M", "Lcom/zepto/vh7;", "X1", "()Lcom/zepto/vh7;", "J2", "(Lcom/zepto/vh7;)V", "session", "Lcom/zepto/ld7;", "N", "Lcom/zepto/ld7;", "b2", "()Lcom/zepto/ld7;", "M2", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "a2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "P", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "nrvDetails", "Q", "d2", "O2", "viewModelAddMob", "R", "V1", "I2", "retrofitServiceAddMob", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "S", "Ljava/util/HashMap;", "W1", "()Ljava/util/HashMap;", "setServiceSelectionHashMap", "(Ljava/util/HashMap;)V", "serviceSelectionHashMap", "T", "T1", "G2", "U", "getMobile_number", "setMobile_number", "mobile_number", "V", "P1", "E2", "off_code", "W", "Z1", "setState_intent", "state_intent", "Lcom/zepto/wa3;", "X", "Lcom/zepto/wa3;", "M1", "()Lcom/zepto/wa3;", "A2", "(Lcom/zepto/wa3;)V", "langSession", "Y", "getMultiServiceList", "setMultiServiceList", "multiServiceList", "Lcom/zepto/qs1;", "Z", "Lcom/zepto/qs1;", "L1", "()Lcom/zepto/qs1;", "z2", "(Lcom/zepto/qs1;)V", "dmsViewModle", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "a0", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "K1", "()Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "y2", "(Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;)V", "dmsService", "b0", "S1", "setRc_chassi_val", "rc_chassi_val", "c0", "getMobileNo", "B2", "mobileNo", "d0", "Y1", "K2", "stateCode", "Lcom/zepto/of;", "Landroid/content/Intent;", "Lcom/zepto/of;", "launcher", "f0", "launcherAadhaar", "g0", "getAuthMode", "setAuthMode", "authMode", "h0", "f2", "()Z", "setFaceless", "(Z)V", "isFaceless", "i0", "F1", "setAadhar_name", "aadhar_name", "j0", "E1", "setAadhar_address", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanMainViewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanMainViewScreen.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanMainViewScreen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,918:1\n1#2:919\n*E\n"})
public final class VahanMainViewScreen extends pq implements sg4 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public hh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public gl7 myRcAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public al7 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String chassi_number;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clickvalue;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public NrvDetails nrvDetails;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public qs1 dmsViewModle;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public DMSService dmsService;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public of launcher;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public of launcherAadhaar;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rc_adapter_val = " ";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public HashMap serviceSelectionHashMap = new HashMap();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String rc_number = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String mobile_number = "NA";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String state_intent = "NA";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String rc_chassi_val = " ";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String mobileNo = " ";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String stateCode = " ";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String authMode = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String aadhar_name = "NA";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String aadhar_address = "NA";

    public static final class a extends Lambda implements Function1 {
        public a() {
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
            if (str == null) {
                VahanMainViewScreen.this.Q1().dismiss();
                VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                vahanMainViewScreen.R2(vahanMainViewScreen, vahanMainViewScreen.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
                return;
            }
            try {
                if (StringsKt__StringsJVMKt.equals(str, "200", true)) {
                    VContant.Companion companion = VContant.INSTANCE;
                    if (companion.A(VahanMainViewScreen.this.X1()).equals(VContant.Tax_PURPOSE_CODE)) {
                        VahanMainViewScreen.this.Q1().dismiss();
                        Intent intent = new Intent(VahanMainViewScreen.this, (Class<?>) VahanGenerateOTPScreenV1.class);
                        e03.a aVar = e03.a;
                        String rc_number = VahanMainViewScreen.this.getRc_number();
                        HashMap serviceSelectionHashMap = VahanMainViewScreen.this.getServiceSelectionHashMap();
                        String off_code = VahanMainViewScreen.this.getOff_code();
                        Intrinsics.checkNotNull(off_code);
                        intent.putExtra(VContant.MOBAUTH, aVar.a(rc_number, serviceSelectionHashMap, off_code, VahanMainViewScreen.this.getStateCode(), VahanMainViewScreen.this.getRc_chassi_val(), VContant.MAINSCREEN, companion.A(VahanMainViewScreen.this.X1())));
                        of ofVar = VahanMainViewScreen.this.launcher;
                        Intrinsics.checkNotNull(ofVar);
                        ofVar.a(intent);
                    } else {
                        ld7 ld7VarD2 = VahanMainViewScreen.this.d2();
                        VahanMainViewScreen vahanMainViewScreen2 = VahanMainViewScreen.this;
                        String stateCode = vahanMainViewScreen2.getStateCode();
                        String strA = companion.A(VahanMainViewScreen.this.X1());
                        String off_code2 = VahanMainViewScreen.this.getOff_code();
                        Intrinsics.checkNotNull(off_code2);
                        ld7VarD2.j(vahanMainViewScreen2, stateCode, strA, off_code2);
                    }
                } else {
                    VahanMainViewScreen.this.Q1().dismiss();
                    VahanMainViewScreen vahanMainViewScreen3 = VahanMainViewScreen.this;
                    vahanMainViewScreen3.R2(vahanMainViewScreen3, vahanMainViewScreen3.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanMainViewScreen.this.Q1().dismiss();
            }
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
            VahanMainViewScreen.this.Q1().dismiss();
            VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
            vahanMainViewScreen.R2(vahanMainViewScreen, str.toString());
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
        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                    OwnerIdentification ownerIdentification = ownerDetailPuccPermit.getOwnerIdentification();
                    vahanMainViewScreen.B2(String.valueOf(ownerIdentification != null ? ownerIdentification.getMobile_no() : null));
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    OwnerDetailPuccPermit ownerDetailPuccPermitCopy = ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : VahanMainViewScreen.this.getRc_chassi_val(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null);
                    VahanMainViewScreen vahanMainViewScreen2 = VahanMainViewScreen.this;
                    VContant.Companion companion = VContant.INSTANCE;
                    vahanMainViewScreen2.D2(companion.c(ownerDetailPuccPermitCopy));
                    if (VahanMainViewScreen.this.getNrvDetails() == null || !StringsKt__StringsJVMKt.equals(companion.A(VahanMainViewScreen.this.X1()), VContant.Tax_PURPOSE_CODE, true)) {
                        if (VahanMainViewScreen.this.getNrvDetails() != null) {
                            qs1 qs1VarL1 = VahanMainViewScreen.this.L1();
                            String strA = companion.A(VahanMainViewScreen.this.X1());
                            NrvDetails nrvDetails = VahanMainViewScreen.this.getNrvDetails();
                            String strValueOf = String.valueOf(nrvDetails != null ? nrvDetails.getState_cd() : null);
                            Integer vehTypeAsInt = ownerDetailPuccPermit.getVehTypeAsInt();
                            Intrinsics.checkNotNull(vehTypeAsInt);
                            int iIntValue = vehTypeAsInt.intValue();
                            NrvDetails nrvDetails2 = VahanMainViewScreen.this.getNrvDetails();
                            Intrinsics.checkNotNull(nrvDetails2);
                            qs1VarL1.g("0", strA, strValueOf, iIntValue, 0, nrvDetails2);
                            return;
                        }
                        return;
                    }
                    VahanMainViewScreen.this.Q1().dismiss();
                    Intent intent = new Intent(VahanMainViewScreen.this, (Class<?>) PayTaxActivity.class);
                    NrvDetails nrvDetails3 = VahanMainViewScreen.this.getNrvDetails();
                    Intrinsics.checkNotNull(nrvDetails3);
                    intent.putExtra("RC", nrvDetails3.getRc_regn_no());
                    intent.putExtra("RcDetails", VahanMainViewScreen.this.getNrvDetails());
                    intent.putExtra("Rcfulldetails", ownerDetailPuccPermit);
                    intent.putExtra("map", VahanMainViewScreen.this.getServiceSelectionHashMap());
                    NrvDetails nrvDetails4 = VahanMainViewScreen.this.getNrvDetails();
                    Intrinsics.checkNotNull(nrvDetails4);
                    intent.putExtra("off_code", nrvDetails4.getRc_off_cd());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, VahanMainViewScreen.this.getIsFaceless());
                    intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                    intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                    VahanMainViewScreen.this.startActivity(intent);
                    VahanMainViewScreen.this.finish();
                    return;
                }
                VahanMainViewScreen.this.Q1().dismiss();
                VahanMainViewScreen vahanMainViewScreen3 = VahanMainViewScreen.this;
                vahanMainViewScreen3.y1(vahanMainViewScreen3, "No details found");
            } catch (Exception e) {
                VahanMainViewScreen.this.Q1().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            VahanMainViewScreen.this.Q1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "error", true)) {
                VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                vahanMainViewScreen.R2(vahanMainViewScreen, vahanMainViewScreen.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
            } else {
                VahanMainViewScreen vahanMainViewScreen2 = VahanMainViewScreen.this;
                vahanMainViewScreen2.R2(vahanMainViewScreen2, str);
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
            VahanMainViewScreen.this.Q1().dismiss();
            VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
            vahanMainViewScreen.R2(vahanMainViewScreen, vahanMainViewScreen.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(VahanDmsModleResponse vahanDmsModleResponse) {
            try {
                VahanMainViewScreen.this.Q1().dismiss();
                if (!StringsKt__StringsJVMKt.equals(vahanDmsModleResponse.getStatusCode(), "V001", true)) {
                    gz3.a aVar = gz3.a;
                    VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                    HashMap serviceSelectionHashMap = vahanMainViewScreen.getServiceSelectionHashMap();
                    boolean isFaceless = VahanMainViewScreen.this.getIsFaceless();
                    NrvDetails nrvDetails = VahanMainViewScreen.this.getNrvDetails();
                    Intrinsics.checkNotNull(nrvDetails);
                    aVar.j(vahanMainViewScreen, serviceSelectionHashMap, isFaceless, nrvDetails, VahanMainViewScreen.this.getAadhar_name(), VahanMainViewScreen.this.getAadhar_address());
                    return;
                }
                UploadDataDto uploadDataDto = vahanDmsModleResponse.getUploadDataDto();
                List<NonUploaded> nonUploadedList = uploadDataDto != null ? uploadDataDto.getNonUploadedList() : null;
                Intrinsics.checkNotNull(nonUploadedList, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded> }");
                ArrayList arrayList = (ArrayList) nonUploadedList;
                if (arrayList.size() <= 0) {
                    ld7 ld7VarD2 = VahanMainViewScreen.this.d2();
                    VahanMainViewScreen vahanMainViewScreen2 = VahanMainViewScreen.this;
                    String stateCode = vahanMainViewScreen2.getStateCode();
                    String strA = VContant.INSTANCE.A(VahanMainViewScreen.this.X1());
                    String off_code = VahanMainViewScreen.this.getOff_code();
                    Intrinsics.checkNotNull(off_code);
                    ld7VarD2.j(vahanMainViewScreen2, stateCode, strA, off_code);
                    return;
                }
                gz3.a aVar2 = gz3.a;
                VahanMainViewScreen vahanMainViewScreen3 = VahanMainViewScreen.this;
                NrvDetails nrvDetails2 = vahanMainViewScreen3.getNrvDetails();
                Intrinsics.checkNotNull(nrvDetails2);
                HashMap serviceSelectionHashMap2 = VahanMainViewScreen.this.getServiceSelectionHashMap();
                boolean isFaceless2 = VahanMainViewScreen.this.getIsFaceless();
                String aadhar_name = VahanMainViewScreen.this.getAadhar_name();
                String aadhar_address = VahanMainViewScreen.this.getAadhar_address();
                VContant.Companion companion = VContant.INSTANCE;
                VahanMainViewScreen vahanMainViewScreen4 = VahanMainViewScreen.this;
                aVar2.k(vahanMainViewScreen3, arrayList, nrvDetails2, serviceSelectionHashMap2, isFaceless2, aadhar_name, aadhar_address, companion.n(vahanMainViewScreen4, vahanMainViewScreen4.X1()));
            } catch (Exception e) {
                e.printStackTrace();
                ld7 ld7VarD22 = VahanMainViewScreen.this.d2();
                VahanMainViewScreen vahanMainViewScreen5 = VahanMainViewScreen.this;
                String stateCode2 = vahanMainViewScreen5.getStateCode();
                String strA2 = VContant.INSTANCE.A(VahanMainViewScreen.this.X1());
                String off_code2 = VahanMainViewScreen.this.getOff_code();
                Intrinsics.checkNotNull(off_code2);
                ld7VarD22.j(vahanMainViewScreen5, stateCode2, strA2, off_code2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanDmsModleResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                VahanMainViewScreen.this.Q1().dismiss();
                ld7 ld7VarD2 = VahanMainViewScreen.this.d2();
                VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                String stateCode = vahanMainViewScreen.getStateCode();
                String strA = VContant.INSTANCE.A(VahanMainViewScreen.this.X1());
                String off_code = VahanMainViewScreen.this.getOff_code();
                Intrinsics.checkNotNull(off_code);
                ld7VarD2.j(vahanMainViewScreen, stateCode, strA, off_code);
            } catch (Exception unused) {
            }
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
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
        public final void a(GetStateCode getStateCode) {
            if (getStateCode == null) {
                VahanMainViewScreen.this.Q1().dismiss();
                VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                vahanMainViewScreen.R2(vahanMainViewScreen, vahanMainViewScreen.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
                return;
            }
            try {
                if (gd1.a.m(getStateCode.getStateCd())) {
                    VahanMainViewScreen.this.Q1().dismiss();
                    VahanMainViewScreen vahanMainViewScreen2 = VahanMainViewScreen.this;
                    vahanMainViewScreen2.R2(vahanMainViewScreen2, vahanMainViewScreen2.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
                } else {
                    VahanMainViewScreen.this.K2(getStateCode.getStateCd());
                    VahanMainViewScreen.this.E2(String.valueOf(getStateCode.getOffCd()));
                    if (StringsKt__StringsJVMKt.equals(VahanMainViewScreen.this.getState_intent(), getStateCode.getStateCd(), true) || StringsKt__StringsJVMKt.equals(VahanMainViewScreen.this.getState_intent(), "OD", true)) {
                        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(VahanMainViewScreen.this.H1().s.getText())).toString();
                        String strValueOf = String.valueOf(VahanMainViewScreen.this.H1().f.getText());
                        if (string.length() > 0) {
                            ld7 ld7VarB2 = VahanMainViewScreen.this.b2();
                            VahanMainViewScreen vahanMainViewScreen3 = VahanMainViewScreen.this;
                            String stateCd = getStateCode.getStateCd();
                            String strA = VContant.INSTANCE.A(VahanMainViewScreen.this.X1());
                            String off_code = VahanMainViewScreen.this.getOff_code();
                            Intrinsics.checkNotNull(off_code);
                            ld7VarB2.D1(vahanMainViewScreen3, string, strValueOf, stateCd, strA, off_code);
                        } else if (VahanMainViewScreen.this.getRc_adapter_val().length() > 0) {
                            VahanMainViewScreen vahanMainViewScreen4 = VahanMainViewScreen.this;
                            vahanMainViewScreen4.G2(vahanMainViewScreen4.getRc_adapter_val());
                            ld7 ld7VarB22 = VahanMainViewScreen.this.b2();
                            VahanMainViewScreen vahanMainViewScreen5 = VahanMainViewScreen.this;
                            String rc_adapter_val = vahanMainViewScreen5.getRc_adapter_val();
                            String rc_chassi_val = VahanMainViewScreen.this.getRc_chassi_val();
                            String stateCd2 = getStateCode.getStateCd();
                            String strA2 = VContant.INSTANCE.A(VahanMainViewScreen.this.X1());
                            String off_code2 = VahanMainViewScreen.this.getOff_code();
                            Intrinsics.checkNotNull(off_code2);
                            ld7VarB22.D1(vahanMainViewScreen5, rc_adapter_val, rc_chassi_val, stateCd2, strA2, off_code2);
                        }
                    } else {
                        VahanMainViewScreen.this.Q1().dismiss();
                        VahanMainViewScreen vahanMainViewScreen6 = VahanMainViewScreen.this;
                        vahanMainViewScreen6.R2(vahanMainViewScreen6, VahanMainViewScreen.this.M1().b("validstate", "Please enter valid RC number of ") + ' ' + VContant.INSTANCE.l(VahanMainViewScreen.this.getState_intent()) + ' ' + VahanMainViewScreen.this.M1().b("vahan_state", "State"));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanMainViewScreen.this.Q1().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetStateCode) obj);
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
            VahanMainViewScreen.this.Q1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                VahanMainViewScreen vahanMainViewScreen = VahanMainViewScreen.this;
                vahanMainViewScreen.R2(vahanMainViewScreen, vahanMainViewScreen.M1().b("record_error_msg", VahanMainViewScreen.this.getString(R.string.service_unavable_please_try)));
            } else {
                VahanMainViewScreen vahanMainViewScreen2 = VahanMainViewScreen.this;
                vahanMainViewScreen2.R2(vahanMainViewScreen2, str.toString());
            }
        }
    }

    public static final class j implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public j(Function1 function) {
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

    public static final void C1(Dialog d2, VahanMainViewScreen this$0, String rc_number, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) VahanProcessWithAdharV1.class);
        e03.a aVar = e03.a;
        HashMap map = this$0.serviceSelectionHashMap;
        String str = this$0.off_code;
        Intrinsics.checkNotNull(str);
        intent.putExtra(VContant.AAHARAUTH, aVar.a(rc_number, map, str, this$0.stateCode, this$0.rc_chassi_val, VContant.MAINSCREEN, VContant.INSTANCE.A(this$0.X1())));
        of ofVar = this$0.launcherAadhaar;
        Intrinsics.checkNotNull(ofVar);
        ofVar.a(intent);
    }

    public static final void D1(Dialog d2, VahanMainViewScreen this$0, String rc_number, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) VahanGenerateOTPScreenV1.class);
        e03.a aVar = e03.a;
        HashMap map = this$0.serviceSelectionHashMap;
        String str = this$0.off_code;
        Intrinsics.checkNotNull(str);
        intent.putExtra(VContant.MOBAUTH, aVar.a(rc_number, map, str, this$0.stateCode, this$0.rc_chassi_val, VContant.MAINSCREEN, VContant.INSTANCE.A(this$0.X1())));
        of ofVar = this$0.launcher;
        Intrinsics.checkNotNull(ofVar);
        ofVar.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void g2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void h2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    public static final void i2(VahanMainViewScreen this$0, gf result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.d() == -1) {
            Intent intentC = result.c();
            Intrinsics.checkNotNull(intentC);
            this$0.authMode = String.valueOf(intentC.getStringExtra(VContant.AUTHMODE));
            this$0.Q1().show();
            this$0.b2().F0(this$0, this$0.rc_number, this$0.stateCode, VContant.INSTANCE.A(this$0.X1()), this$0.rc_chassi_val);
        }
    }

    public static final void j2(VahanMainViewScreen this$0, gf result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.d() == -1) {
            this$0.Q1().show();
            Intent intentC = result.c();
            Intrinsics.checkNotNull(intentC);
            this$0.authMode = String.valueOf(intentC.getStringExtra(VContant.AUTHMODE));
            this$0.isFaceless = intentC.getBooleanExtra(VContant.NEXGEN_isFACELESS, true);
            this$0.aadhar_name = String.valueOf(intentC.getStringExtra(VContant.NEXGEN_addahar_name));
            this$0.aadhar_address = String.valueOf(intentC.getStringExtra(VContant.NEXGEN_addahar_address));
            this$0.b2().F0(this$0, this$0.rc_number, this$0.stateCode, VContant.INSTANCE.A(this$0.X1()), this$0.rc_chassi_val);
        }
    }

    public static final void k2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void l2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s2();
    }

    public static final void m2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1().c.setBackgroundResource(R.drawable.other_new_shape_grey);
        this$0.H1().d.setBackgroundResource(R.drawable.button_style);
        this$0.H1().d.setTextColor(yy0.c(this$0, R.color.white));
        this$0.H1().c.setTextColor(yy0.c(this$0, R.color.black));
        this$0.H1().t.setVisibility(8);
        this$0.H1().k.setVisibility(0);
        this$0.H1().b.setVisibility(8);
        this$0.H1().n.setVisibility(0);
    }

    public static final void n2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1().c.setBackgroundResource(R.drawable.button_style);
        this$0.H1().d.setBackgroundResource(R.drawable.other_new_shape_grey);
        this$0.H1().c.setTextColor(yy0.c(this$0, R.color.white));
        this$0.H1().d.setTextColor(yy0.c(this$0, R.color.black));
        this$0.H1().t.setVisibility(0);
        this$0.H1().k.setVisibility(8);
        this$0.H1().b.setVisibility(0);
        this$0.H1().n.setVisibility(8);
    }

    public static final void o2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w2("submit");
        String strValueOf = String.valueOf(this$0.H1().s.getText());
        this$0.v2(String.valueOf(this$0.H1().f.getText()));
        this$0.rc_chassi_val = this$0.I1();
        this$0.rc_number = strValueOf;
        if (strValueOf.length() < 4) {
            Toast.makeText(this$0, this$0.M1().b("validRc", "Please enter valid RC number"), 0).show();
        } else if (this$0.I1().length() < 5) {
            Toast.makeText(this$0, this$0.M1().b("validchassi", "Please enter valid chassis number"), 0).show();
        } else {
            this$0.Q1().show();
            this$0.b2().o(this$0, strValueOf);
        }
    }

    public static final void p2(VahanMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(this$0.H1().f.getText()).length() > 0) {
            Editable text = this$0.H1().f.getText();
            Intrinsics.checkNotNull(text);
            text.clear();
        }
        if (String.valueOf(this$0.H1().s.getText()).length() > 0) {
            Editable text2 = this$0.H1().s.getText();
            Intrinsics.checkNotNull(text2);
            text2.clear();
        }
    }

    public static final void q2(VahanMainViewScreen this$0, AadhaarMobModle aadhaarMobModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.Q1().dismiss();
            if (aadhaarMobModle.getApiMessage().getStatusCode() == 200) {
                this$0.Q2(Boolean.parseBoolean(aadhaarMobModle.getData().getAadharAuth()), Boolean.parseBoolean(aadhaarMobModle.getData().getMobileAuth()));
            } else {
                this$0.Q2(false, true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.B1(this$0, this$0.rc_number);
        }
    }

    public static final void r2(VahanMainViewScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1().dismiss();
        this$0.R2(this$0, this$0.M1().b("record_error_msg", this$0.getString(R.string.service_unavable_please_try)));
    }

    private final void s2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void z1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public final void A2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void B1(Context context, final String rc_number) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.process_with_Adhar);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.process_with_mobile);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        wa3 wa3Var = new wa3(this);
        textView.setText(wa3Var.b("proceed_with_adhar", "Proceed with Aadhaar/VID"));
        textView2.setText(wa3Var.b("proceed_with_mobile", "Proceed with Mobile No."));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.C1(dialog, this, rc_number, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.D1(dialog, this, rc_number, view);
            }
        });
        dialog.show();
    }

    public final void B2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNo = str;
    }

    public final void C2(gl7 gl7Var) {
        Intrinsics.checkNotNullParameter(gl7Var, "<set-?>");
        this.myRcAdapter = gl7Var;
    }

    public final void D2(NrvDetails nrvDetails) {
        this.nrvDetails = nrvDetails;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getAadhar_address() {
        return this.aadhar_address;
    }

    public final void E2(String str) {
        this.off_code = str;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final String getAadhar_name() {
        return this.aadhar_name;
    }

    public final void F2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final ArrayList G1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final void G2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final hh H1() {
        hh hhVar = this.binding;
        if (hhVar != null) {
            return hhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void H2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final String I1() {
        String str = this.chassi_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassi_number");
        return null;
    }

    public final void I2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final DatabaseHelper J1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final void J2(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final DMSService K1() {
        DMSService dMSService = this.dmsService;
        if (dMSService != null) {
            return dMSService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsService");
        return null;
    }

    public final void K2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final qs1 L1() {
        qs1 qs1Var = this.dmsViewModle;
        if (qs1Var != null) {
            return qs1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsViewModle");
        return null;
    }

    public final void L2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final wa3 M1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void M2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final gl7 N1() {
        gl7 gl7Var = this.myRcAdapter;
        if (gl7Var != null) {
            return gl7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    public final void N2(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel = al7Var;
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    public final void O2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public final String getOff_code() {
        return this.off_code;
    }

    public final void P2() throws Throwable {
        ArrayList arrayListH0 = J1().H0();
        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
        t2(arrayListH0);
        if (G1().size() <= 0) {
            H1().g.setVisibility(0);
            H1().t.setVisibility(8);
            H1().q.setVisibility(8);
            H1().k.setVisibility(0);
            H1().b.setVisibility(8);
            H1().n.setVisibility(0);
            return;
        }
        try {
            gl7 gl7Var = new gl7(G1(), this, this);
            Intrinsics.checkNotNull(gl7Var);
            C2(gl7Var);
            H1().t.setAdapter(N1());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final ProgressDialog Q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void Q2(boolean aa, boolean mob) {
        try {
            if (aa && mob) {
                B1(this, this.rc_number);
            } else if (!aa && mob) {
                Intent intent = new Intent(this, (Class<?>) VahanGenerateOTPScreenV1.class);
                e03.a aVar = e03.a;
                String str = this.rc_number;
                HashMap map = this.serviceSelectionHashMap;
                String str2 = this.off_code;
                Intrinsics.checkNotNull(str2);
                intent.putExtra(VContant.MOBAUTH, aVar.a(str, map, str2, this.stateCode, this.rc_chassi_val, VContant.MAINSCREEN, VContant.INSTANCE.A(X1())));
                of ofVar = this.launcher;
                Intrinsics.checkNotNull(ofVar);
                ofVar.a(intent);
            } else if (!aa || mob) {
                R2(this, getString(R.string.service_unavable_please_try));
            } else {
                Intent intent2 = new Intent(this, (Class<?>) VahanProcessWithAdharV1.class);
                e03.a aVar2 = e03.a;
                String str3 = this.rc_number;
                HashMap map2 = this.serviceSelectionHashMap;
                String str4 = this.off_code;
                Intrinsics.checkNotNull(str4);
                intent2.putExtra(VContant.AAHARAUTH, aVar2.a(str3, map2, str4, this.stateCode, this.rc_chassi_val, VContant.MAINSCREEN, VContant.INSTANCE.A(X1())));
                of ofVar2 = this.launcherAadhaar;
                Intrinsics.checkNotNull(ofVar2);
                ofVar2.a(intent2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            Intent intent3 = new Intent(this, (Class<?>) VahanGenerateOTPScreenV1.class);
            e03.a aVar3 = e03.a;
            String str5 = this.rc_number;
            HashMap map3 = this.serviceSelectionHashMap;
            String str6 = this.off_code;
            Intrinsics.checkNotNull(str6);
            intent3.putExtra(VContant.MOBAUTH, aVar3.a(str5, map3, str6, this.stateCode, this.rc_chassi_val, VContant.MAINSCREEN, VContant.INSTANCE.A(X1())));
            of ofVar3 = this.launcher;
            Intrinsics.checkNotNull(ofVar3);
            ofVar3.a(intent3);
        }
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final String getRc_adapter_val() {
        return this.rc_adapter_val;
    }

    public final void R2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.S2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getRc_chassi_val() {
        return this.rc_chassi_val;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final String getRc_number() {
        return this.rc_number;
    }

    public final VahanServiceConnection U1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanProService V1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final HashMap getServiceSelectionHashMap() {
        return this.serviceSelectionHashMap;
    }

    public final vh7 X1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getState_intent() {
        return this.state_intent;
    }

    public final VahanProService a2() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final ld7 b2() {
        ld7 ld7Var = this.vahanViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanViewModle");
        return null;
    }

    public final al7 c2() {
        al7 al7Var = this.viewModel;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final ld7 d2() {
        ld7 ld7Var = this.viewModelAddMob;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelAddMob");
        return null;
    }

    @Override // com.zepto.sg4
    public void e0(String rc_num, int position, String chassiNo) {
        if (rc_num != null) {
            w2("rcnumber");
            this.rc_adapter_val = rc_num;
            this.rc_chassi_val = String.valueOf(chassiNo);
            Q1().show();
            b2().o(this, rc_num);
        }
    }

    public final void e2() {
        ArrayList arrayList = this.multiServiceList;
        if (arrayList != null) {
            arrayList.add("3");
        }
        ArrayList arrayList2 = this.multiServiceList;
        if (arrayList2 != null) {
            arrayList2.add("4");
        }
        ArrayList arrayList3 = this.multiServiceList;
        if (arrayList3 != null) {
            arrayList3.add(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        }
        ArrayList arrayList4 = this.multiServiceList;
        if (arrayList4 != null) {
            arrayList4.add(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
        }
        ArrayList arrayList5 = this.multiServiceList;
        if (arrayList5 != null) {
            arrayList5.add(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
        }
    }

    /* JADX INFO: renamed from: f2, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_main_view_screen);
        hh hhVarC = hh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hhVarC, "inflate(...)");
        u2(hhVarC);
        setContentView(H1().b());
        getWindow().addFlags(128);
        ta3.a.J2(this, H1());
        new vh7(this).f(" ");
        A2(new wa3(this));
        if (getIntent() != null) {
            this.state_intent = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        VahanProService.Companion companion = VahanProService.INSTANCE;
        L2(companion.a(this));
        I2(companion.a(this));
        H2(VahanServiceConnection.INSTANCE.a(this));
        O2((ld7) new z(this, new kd7(new jd7(V1()))).a(ld7.class));
        N2((al7) new z(this, new bl7(new bg7(U1()))).a(al7.class));
        M2((ld7) new z(this, new kd7(new jd7(a2()))).a(ld7.class));
        y2(DMSService.INSTANCE.a(this));
        z2((qs1) new z(this, new dc1(new cc1(K1()))).a(qs1.class));
        wa3 wa3Var = new wa3(this);
        F2(new ProgressDialog(this));
        Q1().setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        Q1().setCancelable(false);
        Q1().setCanceledOnTouchOutside(false);
        J2(new vh7(this));
        H1().o.i.setText(VContant.INSTANCE.n(this, X1()));
        e2();
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        x2(databaseHelperD0);
        try {
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.DUPLICATE_RC_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.RCPARTICULAR_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.NOC_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.NOC, VContant.NOC_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.DUPLICATE_FITNESS_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.DUPLICATE_FITNESS, VContant.DUPLICATE_FITNESS_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.RC_CANCELLATION_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.RC_CANCALATION, VContant.RC_CANCELLATION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.RC_SURRENDER_RC_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.RC_SURRENDER, VContant.RC_SURRENDER_RC_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.DUPLICATE_PERMIT_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.DUPLICATE_PERMIT, VContant.DUPLICATE_PERMIT_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.PAY_TAX_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.RC_RELEASE_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.RC_RELEASE, VContant.RC_RELEASE_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.PAY_TAX_ASS_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.PAY_TAXASS, VContant.PAY_TAX_ASS_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.TEMPERMIT_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.Temp_Permit, VContant.TEMPERMIT_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.NP_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.NP_Permit, VContant.NP_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.PERMIT_RENEWAL_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.PERMIT_RENEWAL, VContant.PERMIT_RENEWAL_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.COMPOUND_FEE_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.MISELL_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.MISELL_PAYMENT, VContant.MISELL_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.ALTERATION_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.ALTERATION, VContant.ALTERATION_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.UPDATE_MOBILE_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.MULTI_SELECT_SERVICE_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.MULTI_SELECT_SERVICE, VContant.MULTI_SELECT_SERVICE_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.SPEICAL_PERMIT_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.SPEICAL_PERMIT, VContant.SPEICAL_PERMIT_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.RETENTION_REGISTRATION_NUMBER_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.RETENTION_REGISTRATION, VContant.RETENTION_REGISTRATION_NUMBER_CODE);
            }
            if (this.serviceSelectionHashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
                H1().o.e.setVisibility(8);
                SpannableString spannableString = new SpannableString(wa3Var.b("rcServices", getString(R.string.rc_service)));
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                H1().o.i.setText(spannableString);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.TRANSFER_PERMIT_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.TRANSFER_OF_PERMIT, VContant.TRANSFER_PERMIT_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.TRANSFER_PERMIT_SURRENDER_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.TRANSFER_OF_PERMIT_SURRENDER, VContant.TRANSFER_PERMIT_SURRENDER_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(X1().c(), VContant.TRANSFER_PERMIT_DEATH_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.TRANSFER_OF_PERMIT_DEATH_CASE, VContant.TRANSFER_PERMIT_DEATH_CODE);
            }
            H1().o.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i67
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VahanMainViewScreen.g2(this.a, view);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        H1().t.setLayoutManager(new LinearLayoutManager(this, 1, false));
        P2();
        H1().o.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.h2(this.a, view);
            }
        });
        H1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.k2(this.a, view);
            }
        });
        H1().o.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.l2(this.a, view);
            }
        });
        H1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.m2(this.a, view);
            }
        });
        H1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.n2(this.a, view);
            }
        });
        H1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.o2(this.a, view);
            }
        });
        b2().j0().g(this, new j(new h()));
        b2().k0().g(this, new j(new i()));
        b2().n1().g(this, new j(new a()));
        b2().o1().g(this, new j(new b()));
        b2().I0().g(this, new j(new c()));
        b2().H0().g(this, new j(new d()));
        c2().g().g(this, new j(new e()));
        H1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.p2(this.a, view);
            }
        });
        d2().r().g(this, new mf4() { // from class: com.zepto.j67
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMainViewScreen.q2(this.a, (AadhaarMobModle) obj);
            }
        });
        d2().s().g(this, new mf4() { // from class: com.zepto.k67
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMainViewScreen.r2(this.a, (String) obj);
            }
        });
        L1().h().g(this, new j(new f()));
        L1().i().g(this, new j(new g()));
        this.launcher = B0(new mf(), new hf() { // from class: com.zepto.p67
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanMainViewScreen.i2(this.a, (gf) obj);
            }
        });
        this.launcherAadhaar = B0(new mf(), new hf() { // from class: com.zepto.q67
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanMainViewScreen.j2(this.a, (gf) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            NaxpToKenService.INSTANCE.a(this);
        } catch (Exception unused) {
        }
    }

    public final void t2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final void u2(hh hhVar) {
        Intrinsics.checkNotNullParameter(hhVar, "<set-?>");
        this.binding = hhVar;
    }

    public final void v2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassi_number = str;
    }

    public final void w2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clickvalue = str;
    }

    public final void x2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void y1(Context context, String title) {
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
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(new wa3(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMainViewScreen.z1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void y2(DMSService dMSService) {
        Intrinsics.checkNotNullParameter(dMSService, "<set-?>");
        this.dmsService = dMSService;
    }

    public final void z2(qs1 qs1Var) {
        Intrinsics.checkNotNullParameter(qs1Var, "<set-?>");
        this.dmsViewModle = qs1Var;
    }
}
