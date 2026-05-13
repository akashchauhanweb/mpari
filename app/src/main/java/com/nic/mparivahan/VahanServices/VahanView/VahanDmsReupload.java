package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsFileDetail;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUpdateRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;
import com.zepto.cc1;
import com.zepto.dc1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.iu6;
import com.zepto.j27;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.qs1;
import com.zepto.st6;
import com.zepto.t17;
import com.zepto.wa3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Ö\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\t¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003J\u001c\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0003J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0015J/\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001cH\u0016J \u0010(\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016J \u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001cH\u0016J*\u0010,\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u00100\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010\u000bJ\u0010\u00101\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-J\u0018\u00103\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00102\u001a\u00020\u000bJ\u0010\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u000bH\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001cH\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u000bJ\u0018\u00109\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u000bR\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010X\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010S\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR\"\u0010`\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010S\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR\"\u0010d\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010S\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR\"\u0010h\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010S\u001a\u0004\bf\u0010U\"\u0004\bg\u0010WR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010SR*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001RA\u0010\u0094\u0001\u001a\u001a\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010\u008b\u0001j\f\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u0001`\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010\u009a\u0001\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0095\u0001\u0010a\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R+\u0010¡\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R3\u0010²\u0001\u001a\f\u0012\u0005\u0012\u00030«\u0001\u0018\u00010ª\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010´\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010SR\u0018\u0010¶\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010SR*\u0010¾\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R(\u0010Â\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¿\u0001\u0010S\u001a\u0005\bÀ\u0001\u0010U\"\u0005\bÁ\u0001\u0010WR&\u0010Æ\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÃ\u0001\u0010L\u001a\u0005\bÄ\u0001\u0010N\"\u0005\bÅ\u0001\u0010PR&\u0010Ê\u0001\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÇ\u0001\u0010D\u001a\u0005\bÈ\u0001\u0010F\"\u0005\bÉ\u0001\u0010HR9\u0010Ó\u0001\u001a\u0012\u0012\r\u0012\u000b Ì\u0001*\u0004\u0018\u00010\u00060\u00060Ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001¨\u0006×\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanDmsReupload;", "Lcom/zepto/pq;", "Lcom/zepto/j27$a;", "", "", "A1", "Landroid/content/Intent;", "data", "V1", "Landroid/net/Uri;", "uri", "", "selection", "H1", "Landroid/os/Bundle;", "bundle", "J2", "imagePath", "p2", "I2", "U1", "o2", "base64String", "Landroid/graphics/Bitmap;", "z1", "onBackPressed", "savedInstanceState", "onCreate", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "pos", "g", "cat_id", "sub_id", "d", "h", "a", "bitmap", "e", "Landroid/content/Context;", "context", "message", "m2", "i2", "base64", "K2", "doc_number", "q", "code", "h2", "k2", "M2", "Landroid/app/ProgressDialog;", "C", "Landroid/app/ProgressDialog;", "J1", "()Landroid/app/ProgressDialog;", "x2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "B2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "slotService", "Lcom/zepto/ld7;", "E", "Lcom/zepto/ld7;", "getSlotViewModel", "()Lcom/zepto/ld7;", "C2", "(Lcom/zepto/ld7;)V", "slotViewModel", "F", "Ljava/lang/String;", "P1", "()Ljava/lang/String;", "D2", "(Ljava/lang/String;)V", "state_code", "G", "C1", "r2", "appl_no", "H", "M1", "z2", "rc_no", "I", "L1", "y2", VContant.PURPOSE_CODE, "J", "E1", "t2", "chassiNo", "Lcom/zepto/qs1;", "K", "Lcom/zepto/qs1;", "G1", "()Lcom/zepto/qs1;", "v2", "(Lcom/zepto/qs1;)V", "dmsViewModle", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "L", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "F1", "()Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "u2", "(Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;)V", "dmsService", "Lcom/zepto/t17;", "M", "Lcom/zepto/t17;", "D1", "()Lcom/zepto/t17;", "s2", "(Lcom/zepto/t17;)V", "binding", "N", "imgType", "Lcom/zepto/j27;", "O", "Lcom/zepto/j27;", "B1", "()Lcom/zepto/j27;", "q2", "(Lcom/zepto/j27;)V", "adapter", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/NonUploaded;", "Lkotlin/collections/ArrayList;", "P", "Ljava/util/ArrayList;", "I1", "()Ljava/util/ArrayList;", "w2", "(Ljava/util/ArrayList;)V", "non_uploaded_list", "Q", "getPosition", "()I", "setPosition", "(I)V", "position", "R", "Landroid/graphics/Bitmap;", "getBitmap_sel", "()Landroid/graphics/Bitmap;", "setBitmap_sel", "(Landroid/graphics/Bitmap;)V", "bitmap_sel", "Lcom/zepto/iu6;", "S", "Lcom/zepto/iu6;", "Q1", "()Lcom/zepto/iu6;", "E2", "(Lcom/zepto/iu6;)V", "uploaded_adapter", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/Uploaded;", "T", "Ljava/util/List;", "R1", "()Ljava/util/List;", "F2", "(Ljava/util/List;)V", "uploaded_list", "U", "selectedCatId", "V", "selectedSubId", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "N1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "X", "getDoc_key", "setDoc_key", "doc_key", "Y", "T1", "H2", "vahanViewModle", "Z", "S1", "G2", "vahanService", "Lcom/zepto/of;", "kotlin.jvm.PlatformType", "a0", "Lcom/zepto/of;", "getGetProfileLauncher", "()Lcom/zepto/of;", "setGetProfileLauncher", "(Lcom/zepto/of;)V", "getProfileLauncher", "<init>", "()V", "b0", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanDmsReupload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanDmsReupload.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanDmsReupload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,992:1\n1855#2,2:993\n1855#2,2:995\n1#3:997\n*S KotlinDebug\n*F\n+ 1 VahanDmsReupload.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanDmsReupload\n*L\n918#1:993,2\n950#1:995,2\n*E\n"})
public final class VahanDmsReupload extends pq implements j27.a {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VahanProService slotService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ld7 slotViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String appl_no;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String chassiNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public qs1 dmsViewModle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DMSService dmsService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public t17 binding;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String imgType;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public j27 adapter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList non_uploaded_list;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public Bitmap bitmap_sel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public iu6 uploaded_adapter;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public List uploaded_list;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String doc_key;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public of getProfileLauncher;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int position = -1;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String selectedCatId = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String selectedSubId = "";

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanDmsReupload.this.J1().dismiss();
            VahanDmsReupload.this.finish();
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanDmsReupload.this.J1().dismiss();
            VahanDmsReupload.this.finish();
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no == null || regn_no.length() == 0) {
                    VahanDmsReupload.this.J1().dismiss();
                } else {
                    VahanDmsReupload vahanDmsReupload = VahanDmsReupload.this;
                    VContant.Companion companion = VContant.INSTANCE;
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    vahanDmsReupload.A2(companion.c(ownerDetailPuccPermit));
                    qs1 qs1VarG1 = VahanDmsReupload.this.G1();
                    String strC1 = VahanDmsReupload.this.C1();
                    String strL1 = VahanDmsReupload.this.L1();
                    String strP1 = VahanDmsReupload.this.P1();
                    Integer vehTypeAsInt = VahanDmsReupload.this.N1().getVehTypeAsInt();
                    Intrinsics.checkNotNull(vehTypeAsInt);
                    qs1VarG1.g(strC1, strL1, strP1, vehTypeAsInt.intValue(), 10, VahanDmsReupload.this.N1());
                }
            } catch (Exception e) {
                VahanDmsReupload.this.J1().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
            return Unit.INSTANCE;
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

        public final void invoke(String str) {
            VahanDmsReupload.this.J1().dismiss();
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x000e, B:5:0x001b, B:7:0x003b, B:11:0x0044, B:13:0x0056, B:15:0x005c, B:17:0x0062, B:19:0x0068, B:21:0x0072, B:23:0x007b, B:31:0x00c1, B:33:0x00c7, B:35:0x00cd, B:37:0x00d7, B:39:0x00e0, B:41:0x00f3, B:42:0x00f7, B:43:0x011a, B:24:0x0087, B:26:0x008f, B:28:0x0099, B:30:0x00a2, B:44:0x0126, B:46:0x0136, B:47:0x014f), top: B:51:0x000e }] */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse r8) {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload.f.a(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse):void");
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
            VahanDmsReupload.this.J1().dismiss();
            VahanDmsReupload.this.D1().h.setVisibility(8);
            VahanDmsReupload vahanDmsReupload = VahanDmsReupload.this;
            vahanDmsReupload.M2(vahanDmsReupload, vahanDmsReupload.getString(R.string.service_unavable_please_try));
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

    public VahanDmsReupload() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.o27
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanDmsReupload.K1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getProfileLauncher = ofVarB0;
    }

    private final void A1() {
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
        }
    }

    private final void I2(Bundle bundle) {
        this.bitmap_sel = (Bitmap) bundle.get("data");
        ArrayList arrayList = this.non_uploaded_list;
        NonUploaded nonUploaded = arrayList != null ? (NonUploaded) arrayList.get(this.position) : null;
        if (nonUploaded != null) {
            nonUploaded.setAttached(Boolean.TRUE);
        }
        ArrayList arrayList2 = this.non_uploaded_list;
        NonUploaded nonUploaded2 = arrayList2 != null ? (NonUploaded) arrayList2.get(this.position) : null;
        if (nonUploaded2 != null) {
            nonUploaded2.setBitmap(this.bitmap_sel);
        }
        ArrayList arrayList3 = this.non_uploaded_list;
        NonUploaded nonUploaded3 = arrayList3 != null ? (NonUploaded) arrayList3.get(this.position) : null;
        if (nonUploaded3 != null) {
            nonUploaded3.setCatId(this.selectedCatId);
        }
        ArrayList arrayList4 = this.non_uploaded_list;
        NonUploaded nonUploaded4 = arrayList4 != null ? (NonUploaded) arrayList4.get(this.position) : null;
        if (nonUploaded4 != null) {
            nonUploaded4.setSubId(this.selectedSubId);
        }
        e(this.position, this.selectedSubId, this.selectedCatId, this.bitmap_sel);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void K1(VahanDmsReupload this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (gfVar.d() == -1) {
            Intent intentC = gfVar.c();
            String str = null;
            Bundle extras = intentC != null ? intentC.getExtras() : null;
            String str2 = this$0.imgType;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgType");
            } else {
                str = str2;
            }
            switch (str.hashCode()) {
                case -827012528:
                    if (str.equals("signature_Update") && intentC != null) {
                        this$0.V1(intentC);
                    }
                    break;
                case 106642994:
                    if (str.equals("photo") && extras != null) {
                        this$0.I2(extras);
                        break;
                    }
                    break;
                case 955443094:
                    if (str.equals("photo_Update") && extras != null) {
                        this$0.J2(extras);
                    }
                    break;
                case 1073584312:
                    if (str.equals("signature") && intentC != null) {
                        this$0.U1(intentC);
                    }
                    break;
            }
        }
    }

    public static final void L2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void N2(Dialog d2, VahanDmsReupload this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void W1(VahanDmsReupload this$0, Ref.ObjectRef languageSession, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(languageSession, "$languageSession");
        VUtility.INSTANCE.y(this$0, ((wa3) languageSession.element).b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void X1(VahanDmsReupload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().show();
        this$0.T1().k(this$0, this$0.C1(), this$0.P1());
    }

    public static final void Y1(VahanDmsReupload this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
        this$0.k2(this$0, "Unable to update the document, Please try after sometime");
    }

    public static final void Z1(VahanDmsReupload this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.D1().r.getVisibility() == 0) {
            this$0.D1().r.setVisibility(8);
        } else {
            this$0.D1().r.setVisibility(0);
        }
    }

    public static final void a2(VahanDmsReupload this$0, DmsUploadRes dmsUploadRes) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(dmsUploadRes.getStatusCode(), "V001", true)) {
                qs1 qs1VarG1 = this$0.G1();
                String strC1 = this$0.C1();
                String strL1 = this$0.L1();
                String strP1 = this$0.P1();
                Integer vehTypeAsInt = this$0.N1().getVehTypeAsInt();
                Intrinsics.checkNotNull(vehTypeAsInt);
                qs1VarG1.p(strC1, strL1, strP1, vehTypeAsInt.intValue(), 10, this$0.N1());
                this$0.m2(this$0, "Documents has been Successfully Uploaded!");
            } else {
                this$0.J1().dismiss();
                this$0.i2(this$0);
            }
        } catch (Exception unused) {
            this$0.J1().dismiss();
            this$0.i2(this$0);
        }
    }

    public static final void b2(VahanDmsReupload this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
        this$0.i2(this$0);
    }

    public static final void c2(VahanDmsReupload this$0, VahanDmsModleResponse vahanDmsModleResponse) {
        List<Uploaded> uploadedList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
        if (StringsKt__StringsJVMKt.equals(vahanDmsModleResponse.getStatusCode(), "V001", true)) {
            ArrayList arrayList = this$0.non_uploaded_list;
            if (arrayList != null) {
                arrayList.clear();
            }
            UploadDataDto uploadDataDto = vahanDmsModleResponse.getUploadDataDto();
            ArrayList arrayList2 = (ArrayList) (uploadDataDto != null ? uploadDataDto.getNonUploadedList() : null);
            this$0.non_uploaded_list = arrayList2;
            Integer numValueOf = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() > 0) {
                this$0.D1().p.setAdapter(null);
                this$0.q2(new j27(this$0, this$0, this$0.non_uploaded_list));
                this$0.D1().p.setAdapter(this$0.B1());
                this$0.B1().j();
            } else {
                ArrayList arrayList3 = this$0.non_uploaded_list;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                this$0.D1().p.setAdapter(null);
                this$0.B1().j();
            }
            UploadDataDto uploadDataDto2 = vahanDmsModleResponse.getUploadDataDto();
            Integer numValueOf2 = (uploadDataDto2 == null || (uploadedList = uploadDataDto2.getUploadedList()) == null) ? null : Integer.valueOf(uploadedList.size());
            Intrinsics.checkNotNull(numValueOf2);
            if (numValueOf2.intValue() > 0) {
                try {
                    this$0.D1().q.setVisibility(0);
                    UploadDataDto uploadDataDto3 = vahanDmsModleResponse.getUploadDataDto();
                    this$0.uploaded_list = uploadDataDto3 != null ? uploadDataDto3.getUploadedList() : null;
                    this$0.D1().r.setAdapter(null);
                    this$0.E2(new iu6(this$0, this$0, this$0.uploaded_list));
                    this$0.D1().r.setAdapter(this$0.Q1());
                    this$0.Q1().j();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static final void d2(VahanDmsReupload this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
    }

    public static final void e2(VahanDmsReupload this$0, DMSViewDocModle dMSViewDocModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
        if (StringsKt__StringsJVMKt.equals(dMSViewDocModle.getStatusCode(), "V001", true)) {
            this$0.K2(this$0, dMSViewDocModle.getFileContent());
        }
    }

    public static final void f2(VahanDmsReupload this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
    }

    public static final void g2(VahanDmsReupload this$0, UpdateDocResponse updateDocResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().dismiss();
        if (StringsKt__StringsJVMKt.equals(updateDocResponse.getStatusCode(), "V001", true)) {
            this$0.k2(this$0, "Documents has been updated Successfully!");
        } else {
            this$0.k2(this$0, updateDocResponse.getStatusDesc());
        }
    }

    public static final void j2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void l2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void n2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final Bitmap z1(String base64String) {
        byte[] bArrDecode = Base64.decode(base64String, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public final void A2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final j27 B1() {
        j27 j27Var = this.adapter;
        if (j27Var != null) {
            return j27Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void B2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    public final String C1() {
        String str = this.appl_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appl_no");
        return null;
    }

    public final void C2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    public final t17 D1() {
        t17 t17Var = this.binding;
        if (t17Var != null) {
            return t17Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void D2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final String E1() {
        String str = this.chassiNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassiNo");
        return null;
    }

    public final void E2(iu6 iu6Var) {
        Intrinsics.checkNotNullParameter(iu6Var, "<set-?>");
        this.uploaded_adapter = iu6Var;
    }

    public final DMSService F1() {
        DMSService dMSService = this.dmsService;
        if (dMSService != null) {
            return dMSService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsService");
        return null;
    }

    public final void F2(List list) {
        this.uploaded_list = list;
    }

    public final qs1 G1() {
        qs1 qs1Var = this.dmsViewModle;
        if (qs1Var != null) {
            return qs1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsViewModle");
        return null;
    }

    public final void G2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final String H1(Uri uri, String selection) {
        ContentResolver contentResolver = getContentResolver();
        Intrinsics.checkNotNull(uri);
        Cursor cursorQuery = contentResolver.query(uri, null, selection, null, null);
        if (cursorQuery != null) {
            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_data")) : null;
            cursorQuery.close();
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void H2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final ArrayList getNon_uploaded_list() {
        return this.non_uploaded_list;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void J2(Bundle bundle) {
        Bitmap bitmap = (Bitmap) bundle.get("data");
        this.bitmap_sel = bitmap;
        if (this.doc_key != null) {
            J1().show();
            String strC1 = C1();
            String str = this.doc_key;
            Intrinsics.checkNotNull(str);
            String str2 = C1() + "" + System.currentTimeMillis() + ".jpg";
            Intrinsics.checkNotNull(bitmap);
            G1().s(new DmsUpdateRequest(strC1, str, str2, st6.f(bitmap), P1()));
        }
    }

    public final void K2(Context context, String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.show_dms_doc);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.images_upload);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewFindViewById2).setImageBitmap(z1(base64));
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.L2(dialog, view);
            }
        });
        dialog.show();
    }

    public final String L1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final String M1() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final void M2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.N2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final NrvDetails N1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService O1() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
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

    public final iu6 Q1() {
        iu6 iu6Var = this.uploaded_adapter;
        if (iu6Var != null) {
            return iu6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uploaded_adapter");
        return null;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final List getUploaded_list() {
        return this.uploaded_list;
    }

    public final VahanProService S1() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final ld7 T1() {
        ld7 ld7Var = this.vahanViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanViewModle");
        return null;
    }

    public final void U1(Intent data) {
        Intrinsics.checkNotNull(data);
        Uri data2 = data.getData();
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append(" & ");
        String str = this.imgType;
        String path = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgType");
            str = null;
        }
        sb.append(str);
        sb.append("& ");
        sb.append(data2);
        Log.v("data", sb.toString());
        if (DocumentsContract.isDocumentUri(this, data2)) {
            String documentId = DocumentsContract.getDocumentId(data2);
            Intrinsics.checkNotNull(data2);
            if (Intrinsics.areEqual("com.android.providers.media.documents", data2.getAuthority())) {
                Intrinsics.checkNotNull(documentId);
                path = H1(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + ((String) StringsKt__StringsKt.split$default((CharSequence) documentId, new String[]{":"}, false, 0, 6, (Object) null).get(1)));
            } else if (Intrinsics.areEqual("com.android.providers.downloads.documents", data2.getAuthority())) {
                Uri uri = Uri.parse("content://downloads/public_downloads");
                Long lValueOf = Long.valueOf(documentId);
                Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(...)");
                Uri uriWithAppendedId = ContentUris.withAppendedId(uri, lValueOf.longValue());
                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                path = H1(uriWithAppendedId, null);
            }
        } else {
            Intrinsics.checkNotNull(data2);
            if (StringsKt__StringsJVMKt.equals("content", data2.getScheme(), true)) {
                path = H1(data2, null);
            } else if (StringsKt__StringsJVMKt.equals("file", data2.getScheme(), true)) {
                path = data2.getPath();
            }
        }
        o2(path);
    }

    public final void V1(Intent data) {
        Intrinsics.checkNotNull(data);
        Uri data2 = data.getData();
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append(" & ");
        String str = this.imgType;
        String path = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgType");
            str = null;
        }
        sb.append(str);
        sb.append("& ");
        sb.append(data2);
        Log.v("data", sb.toString());
        if (DocumentsContract.isDocumentUri(this, data2)) {
            String documentId = DocumentsContract.getDocumentId(data2);
            Intrinsics.checkNotNull(data2);
            if (Intrinsics.areEqual("com.android.providers.media.documents", data2.getAuthority())) {
                Intrinsics.checkNotNull(documentId);
                path = H1(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + ((String) StringsKt__StringsKt.split$default((CharSequence) documentId, new String[]{":"}, false, 0, 6, (Object) null).get(1)));
            } else if (Intrinsics.areEqual("com.android.providers.downloads.documents", data2.getAuthority())) {
                Uri uri = Uri.parse("content://downloads/public_downloads");
                Long lValueOf = Long.valueOf(documentId);
                Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(...)");
                Uri uriWithAppendedId = ContentUris.withAppendedId(uri, lValueOf.longValue());
                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                path = H1(uriWithAppendedId, null);
            }
        } else {
            Intrinsics.checkNotNull(data2);
            if (StringsKt__StringsJVMKt.equals("content", data2.getScheme(), true)) {
                path = H1(data2, null);
            } else if (StringsKt__StringsJVMKt.equals("file", data2.getScheme(), true)) {
                path = data2.getPath();
            }
        }
        p2(path);
    }

    @Override // com.zepto.j27.a
    public void a(int pos) {
    }

    @Override // com.zepto.j27.a
    public void d(int pos, String cat_id, String sub_id) {
        Intrinsics.checkNotNullParameter(cat_id, "cat_id");
        Intrinsics.checkNotNullParameter(sub_id, "sub_id");
        if (st6.e(this)) {
            Log.e("calling1", String.valueOf(pos));
            this.imgType = "signature";
            this.position = pos;
            this.selectedCatId = cat_id;
            this.selectedSubId = sub_id;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.getProfileLauncher.a(intent);
        }
    }

    @Override // com.zepto.j27.a
    public void e(int pos, String sub_id, String cat_id, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(sub_id, "sub_id");
        Intrinsics.checkNotNullParameter(cat_id, "cat_id");
        J1().show();
        this.position = pos;
        Intrinsics.checkNotNull(bitmap);
        G1().t(new DmsUploadReq(StringsKt__StringsKt.trim((CharSequence) C1()).toString(), CollectionsKt__CollectionsJVMKt.listOf(new DmsFileDetail(st6.f(bitmap), cat_id, sub_id, "file_" + System.currentTimeMillis() + ".jpg", false)), StringsKt__StringsKt.trim((CharSequence) P1()).toString()));
    }

    @Override // com.zepto.j27.a
    public void g(int pos) {
        ArrayList arrayList = this.non_uploaded_list;
        NonUploaded nonUploaded = arrayList != null ? (NonUploaded) arrayList.get(this.position) : null;
        if (nonUploaded != null) {
            nonUploaded.setAttached(Boolean.FALSE);
        }
        ArrayList arrayList2 = this.non_uploaded_list;
        NonUploaded nonUploaded2 = arrayList2 != null ? (NonUploaded) arrayList2.get(this.position) : null;
        if (nonUploaded2 != null) {
            nonUploaded2.setBitmap(null);
        }
        ArrayList arrayList3 = this.non_uploaded_list;
        NonUploaded nonUploaded3 = arrayList3 != null ? (NonUploaded) arrayList3.get(this.position) : null;
        if (nonUploaded3 != null) {
            nonUploaded3.setSubId("");
        }
        ArrayList arrayList4 = this.non_uploaded_list;
        NonUploaded nonUploaded4 = arrayList4 != null ? (NonUploaded) arrayList4.get(this.position) : null;
        if (nonUploaded4 != null) {
            nonUploaded4.setCatId("");
        }
        B1().j();
    }

    @Override // com.zepto.j27.a
    public void h(int pos, String cat_id, String sub_id) {
        Intrinsics.checkNotNullParameter(cat_id, "cat_id");
        Intrinsics.checkNotNullParameter(sub_id, "sub_id");
        if (st6.d(this)) {
            this.imgType = "photo";
            this.position = pos;
            this.selectedCatId = cat_id;
            this.selectedSubId = sub_id;
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.getProfileLauncher.a(getIntent());
        }
    }

    public void h2(String doc_number, int code) {
        Intrinsics.checkNotNullParameter(doc_number, "doc_number");
        this.doc_key = doc_number;
        if (code == 1 && st6.e(this)) {
            this.imgType = "signature_Update";
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.getProfileLauncher.a(intent);
        }
        if (code == 2 && st6.d(this)) {
            this.imgType = "photo_Update";
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.getProfileLauncher.a(getIntent());
        }
    }

    public final void i2(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.close_doc_upload);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.j2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void k2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validate_pop_up_for_document);
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.l2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void m2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.doc_uploading_diloge_ui);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.n2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void o2(String imagePath) {
        if (imagePath != null) {
            this.bitmap_sel = BitmapFactory.decodeFile(imagePath);
            ArrayList arrayList = this.non_uploaded_list;
            NonUploaded nonUploaded = arrayList != null ? (NonUploaded) arrayList.get(this.position) : null;
            if (nonUploaded != null) {
                nonUploaded.setAttached(Boolean.TRUE);
            }
            ArrayList arrayList2 = this.non_uploaded_list;
            NonUploaded nonUploaded2 = arrayList2 != null ? (NonUploaded) arrayList2.get(this.position) : null;
            if (nonUploaded2 != null) {
                nonUploaded2.setBitmap(this.bitmap_sel);
            }
            ArrayList arrayList3 = this.non_uploaded_list;
            NonUploaded nonUploaded3 = arrayList3 != null ? (NonUploaded) arrayList3.get(this.position) : null;
            if (nonUploaded3 != null) {
                nonUploaded3.setCatId(this.selectedCatId);
            }
            ArrayList arrayList4 = this.non_uploaded_list;
            NonUploaded nonUploaded4 = arrayList4 != null ? (NonUploaded) arrayList4.get(this.position) : null;
            if (nonUploaded4 != null) {
                nonUploaded4.setSubId(this.selectedSubId);
            }
            e(this.position, this.selectedSubId, this.selectedCatId, this.bitmap_sel);
        }
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, new wa3(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.zepto.wa3] */
    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_dms_activity_reupload);
        t17 t17VarC = t17.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(t17VarC, "inflate(...)");
        s2(t17VarC);
        setContentView(D1().b());
        VahanProService.Companion companion = VahanProService.INSTANCE;
        B2(companion.a(this));
        u2(DMSService.INSTANCE.a(this));
        G2(companion.a(this));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new wa3(this);
        A1();
        x2(new ProgressDialog(this));
        J1().setMessage(((wa3) objectRef.element).b("label_challan_please_wait", getString(R.string.please_wait)));
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        D1().e.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.W1(this.a, objectRef, view);
            }
        });
        C2((ld7) new z(this, new kd7(new jd7(O1()))).a(ld7.class));
        H2((ld7) new z(this, new kd7(new jd7(S1()))).a(ld7.class));
        v2((qs1) new z(this, new dc1(new cc1(F1()))).a(qs1.class));
        D1().p.setLayoutManager(new LinearLayoutManager(this));
        D1().r.setLayoutManager(new LinearLayoutManager(this));
        try {
            String stringExtra = getIntent().getStringExtra("state_code");
            Intrinsics.checkNotNull(stringExtra);
            D2(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra2);
            r2(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            Intrinsics.checkNotNull(stringExtra3);
            z2(stringExtra3);
            String stringExtra4 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
            Intrinsics.checkNotNull(stringExtra4);
            y2(stringExtra4);
            String stringExtra5 = getIntent().getStringExtra("chassiNo");
            Intrinsics.checkNotNull(stringExtra5);
            t2(stringExtra5);
            D1().s.setText("Vehicle No. : " + M1());
            D1().b.setText("Application No. " + C1());
            D1().j.setText(VContant.INSTANCE.L(this, L1()));
            J1().show();
            T1().F0(this, M1(), P1(), L1(), E1());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        D1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.X1(this.a, view);
            }
        });
        T1().C().g(this, new h(new b()));
        T1().D().g(this, new h(new c()));
        D1().q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsReupload.Z1(this.a, view);
            }
        });
        T1().I0().g(this, new h(new d()));
        T1().H0().g(this, new h(new e()));
        G1().h().g(this, new h(new f()));
        G1().i().g(this, new h(new g()));
        G1().j().g(this, new mf4() { // from class: com.zepto.x27
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.a2(this.a, (DmsUploadRes) obj);
            }
        });
        G1().k().g(this, new mf4() { // from class: com.zepto.y27
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.b2(this.a, (String) obj);
            }
        });
        G1().l().g(this, new mf4() { // from class: com.zepto.z27
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.c2(this.a, (VahanDmsModleResponse) obj);
            }
        });
        G1().m().g(this, new mf4() { // from class: com.zepto.a37
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.d2(this.a, (String) obj);
            }
        });
        G1().q().g(this, new mf4() { // from class: com.zepto.b37
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.e2(this.a, (DMSViewDocModle) obj);
            }
        });
        G1().r().g(this, new mf4() { // from class: com.zepto.c37
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.f2(this.a, (String) obj);
            }
        });
        G1().n().g(this, new mf4() { // from class: com.zepto.n27
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.g2(this.a, (UpdateDocResponse) obj);
            }
        });
        G1().o().g(this, new mf4() { // from class: com.zepto.u27
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsReupload.Y1(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 5001) {
            if (!(!(grantResults.length == 0)) || grantResults[0] == 0) {
                return;
            }
            Toast.makeText(this, "Please grant permission to proceed", 0).show();
            A1();
        }
    }

    public final void p2(String imagePath) {
        if (imagePath != null) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imagePath);
            this.bitmap_sel = bitmapDecodeFile;
            if (this.doc_key != null) {
                J1().show();
                String strC1 = C1();
                String str = this.doc_key;
                Intrinsics.checkNotNull(str);
                String str2 = C1() + "" + System.currentTimeMillis() + ".jpg";
                Intrinsics.checkNotNull(bitmapDecodeFile);
                G1().s(new DmsUpdateRequest(strC1, str, str2, st6.f(bitmapDecodeFile), P1()));
            }
        }
    }

    public void q(String doc_number) {
        Intrinsics.checkNotNullParameter(doc_number, "doc_number");
        try {
            J1().show();
            Log.e("Print --OBJ--> ", doc_number);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) doc_number, new String[]{"/"}, false, 0, 6, (Object) null);
            G1().u(StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(0)).toString(), StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(2)).toString(), StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(1)).toString());
        } catch (Exception e2) {
            J1().dismiss();
            e2.printStackTrace();
        }
    }

    public final void q2(j27 j27Var) {
        Intrinsics.checkNotNullParameter(j27Var, "<set-?>");
        this.adapter = j27Var;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appl_no = str;
    }

    public final void s2(t17 t17Var) {
        Intrinsics.checkNotNullParameter(t17Var, "<set-?>");
        this.binding = t17Var;
    }

    public final void t2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassiNo = str;
    }

    public final void u2(DMSService dMSService) {
        Intrinsics.checkNotNullParameter(dMSService, "<set-?>");
        this.dmsService = dMSService;
    }

    public final void v2(qs1 qs1Var) {
        Intrinsics.checkNotNullParameter(qs1Var, "<set-?>");
        this.dmsViewModle = qs1Var;
    }

    public final void w2(ArrayList arrayList) {
        this.non_uploaded_list = arrayList;
    }

    public final void x2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void y2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }
}
