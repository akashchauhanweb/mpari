package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsFileDetail;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanLog.VahanLogUpdateDoc;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import com.zepto.aj0;
import com.zepto.au6;
import com.zepto.b27;
import com.zepto.cc1;
import com.zepto.dc1;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.jf;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.qs1;
import com.zepto.s17;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u0083\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\t¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\n\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0003J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0015J/\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001eH\u0016J \u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H\u0016J \u0010+\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001eH\u0016J*\u0010.\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u00100\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010/\u001a\u0004\u0018\u00010\u0013J\u0010\u00101\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0018\u00103\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u00102\u001a\u00020\u0013J\u0010\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0013H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\u0013J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\u0013J\"\u0010:\u001a\u0002092\u001a\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bJ\"\u0010;\u001a\u0002092\u001a\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bJ\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\u0013J\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0006j\b\u0012\u0004\u0012\u00020\u0013`\bJ\u0016\u0010@\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0013R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010Z\u001a\u0004\ba\u0010\\\"\u0004\bb\u0010^R\"\u0010g\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010Z\u001a\u0004\be\u0010\\\"\u0004\bf\u0010^R\"\u0010k\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010Z\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R\"\u0010o\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010Z\u001a\u0004\bm\u0010\\\"\u0004\bn\u0010^R\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010ZR*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R<\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010¥\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b \u0001\u0010h\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R+\u0010¬\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010´\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R3\u0010½\u0001\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010¿\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010ZR\u0018\u0010Á\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010ZR)\u0010È\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R&\u0010Ì\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÉ\u0001\u0010Z\u001a\u0005\bÊ\u0001\u0010\\\"\u0005\bË\u0001\u0010^R*\u0010Ó\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R&\u0010×\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÔ\u0001\u0010Z\u001a\u0005\bÕ\u0001\u0010\\\"\u0005\bÖ\u0001\u0010^R&\u0010Û\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bØ\u0001\u0010Z\u001a\u0005\bÙ\u0001\u0010\\\"\u0005\bÚ\u0001\u0010^R&\u0010ß\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÜ\u0001\u0010Z\u001a\u0005\bÝ\u0001\u0010\\\"\u0005\bÞ\u0001\u0010^R)\u0010æ\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bá\u0001\u0010J\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R&\u0010ê\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bç\u0001\u0010Z\u001a\u0005\bè\u0001\u0010\\\"\u0005\bé\u0001\u0010^R*\u0010ò\u0001\u001a\u00030ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R;\u0010ü\u0001\u001a\u0014\u0012\u000f\u0012\r õ\u0001*\u0005\u0018\u00010ô\u00010ô\u00010ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R9\u0010\u0080\u0002\u001a\u0012\u0012\r\u0012\u000b õ\u0001*\u0004\u0018\u00010\u00130\u00130ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bý\u0001\u0010÷\u0001\u001a\u0006\bþ\u0001\u0010ù\u0001\"\u0006\bÿ\u0001\u0010û\u0001¨\u0006\u0084\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanDmsAPI;", "Lcom/zepto/pq;", "Lcom/zepto/b27$a;", "Lcom/zepto/au6$a;", "", "J1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/NonUploaded;", "Lkotlin/collections/ArrayList;", "non_uploaded_list", "g3", "Landroid/graphics/Bitmap;", "uri", "i2", "Landroid/os/Bundle;", "bundle", "d3", "imagePath", "H2", "", "base64String", "I1", "H1", "Landroid/content/Context;", "context", "it", "w2", "onBackPressed", "savedInstanceState", "onCreate", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "pos", "g", "cat_id", "sub_id", "d", "h", "a", "bitmap", "e", "message", "F2", "z2", "base64", "e3", "doc_number", "q", "D2", "B2", "list", "", "G1", "F1", "h3", "K1", "file_name", "base64Pdf", "v2", "Landroid/app/ProgressDialog;", "C", "Landroid/app/ProgressDialog;", "W1", "()Landroid/app/ProgressDialog;", "S2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "D", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "d2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Y2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "slotService", "Lcom/zepto/ld7;", "E", "Lcom/zepto/ld7;", "e2", "()Lcom/zepto/ld7;", "Z2", "(Lcom/zepto/ld7;)V", "slotViewModel", "F", "Ljava/lang/String;", "f2", "()Ljava/lang/String;", "a3", "(Ljava/lang/String;)V", "state_code", "G", "O1", "L2", "appl_no", "H", "a2", "V2", "rc_no", "I", "Z1", "U2", VContant.PURPOSE_CODE, "J", "V1", "R2", "offCd", "Lcom/zepto/qs1;", "K", "Lcom/zepto/qs1;", "R1", "()Lcom/zepto/qs1;", "O2", "(Lcom/zepto/qs1;)V", "dmsViewModle", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "L", "Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "Q1", "()Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;", "N2", "(Lcom/nic/mparivahan/VahanServices/DMS/DInterface/DMSService;)V", "dmsService", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "M", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "X1", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "T2", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "Lcom/zepto/s17;", "N", "Lcom/zepto/s17;", "P1", "()Lcom/zepto/s17;", "M2", "(Lcom/zepto/s17;)V", "binding", "O", "imgType", "Lcom/zepto/b27;", "P", "Lcom/zepto/b27;", "N1", "()Lcom/zepto/b27;", "K2", "(Lcom/zepto/b27;)V", "adapter", "Q", "Ljava/util/ArrayList;", "U1", "()Ljava/util/ArrayList;", "Q2", "(Ljava/util/ArrayList;)V", "R", "getPosition", "()I", "setPosition", "(I)V", "position", "S", "Landroid/graphics/Bitmap;", "getBitmap_sel", "()Landroid/graphics/Bitmap;", "setBitmap_sel", "(Landroid/graphics/Bitmap;)V", "bitmap_sel", "Lcom/zepto/au6;", "T", "Lcom/zepto/au6;", "g2", "()Lcom/zepto/au6;", "b3", "(Lcom/zepto/au6;)V", "uploaded_adapter", "", "Lcom/nic/mparivahan/VahanServices/DMS/DmsModle/Uploaded;", "U", "Ljava/util/List;", "h2", "()Ljava/util/List;", "c3", "(Ljava/util/List;)V", "uploaded_list", "V", "selectedCatId", "W", "selectedSubId", "X", "Z", "j2", "()Z", "setFaceless", "(Z)V", "isFaceless", "Y", "b2", "W2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "c2", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "X2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "a0", "M1", "J2", "aadhar_name", "b0", "L1", "I2", "aadhar_address", "c0", "getVahlogReptDate", "setVahlogReptDate", "vahlogReptDate", "", "d0", "getVahlogFeeAmt", "()D", "setVahlogFeeAmt", "(D)V", "vahlogFeeAmt", "e0", "getVahlogReptNo", "setVahlogReptNo", "vahlogReptNo", "Lcom/zepto/wa3;", "f0", "Lcom/zepto/wa3;", "T1", "()Lcom/zepto/wa3;", "P2", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "g0", "Lcom/zepto/of;", "getGetProfileLauncher", "()Lcom/zepto/of;", "setGetProfileLauncher", "(Lcom/zepto/of;)V", "getProfileLauncher", "h0", "getGetDocLauncher", "setGetDocLauncher", "getDocLauncher", "<init>", "()V", "i0", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanDmsAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanDmsAPI.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanDmsAPI\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1350:1\n1855#2,2:1351\n1855#2,2:1353\n*S KotlinDebug\n*F\n+ 1 VahanDmsAPI.kt\ncom/nic/mparivahan/VahanServices/VahanView/VahanDmsAPI\n*L\n1208#1:1351,2\n1240#1:1353,2\n*E\n"})
public final class VahanDmsAPI extends pq implements b27.a, au6.a {

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
    public String offCd;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public qs1 dmsViewModle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DMSService dmsService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public s17 binding;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String imgType;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public b27 adapter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList non_uploaded_list;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public Bitmap bitmap_sel;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public au6 uploaded_adapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public List uploaded_list;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public double vahlogFeeAmt;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public of getProfileLauncher;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public of getDocLauncher;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int position = -1;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String selectedCatId = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String selectedSubId = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String vahlogReptDate = " ";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String vahlogReptNo = " ";

    public static final class b extends Lambda implements Function1 {
        public b() {
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
        public final void a(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            try {
                if (finalRequestSubmitResponse == null) {
                    if (VahanDmsAPI.this.W1().isShowing()) {
                        VahanDmsAPI.this.W1().dismiss();
                    }
                    VahanDmsAPI vahanDmsAPI = VahanDmsAPI.this;
                    vahanDmsAPI.D2(vahanDmsAPI, vahanDmsAPI.T1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                    return;
                }
                if (!finalRequestSubmitResponse.getApplication_status()) {
                    if (VahanDmsAPI.this.W1().isShowing()) {
                        VahanDmsAPI.this.W1().dismiss();
                    }
                    VahanDmsAPI vahanDmsAPI2 = VahanDmsAPI.this;
                    vahanDmsAPI2.D2(vahanDmsAPI2, vahanDmsAPI2.T1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                    return;
                }
                if (!VahanDmsAPI.this.getIsFaceless()) {
                    VahanDmsAPI.this.H1();
                    return;
                }
                Intent intent = new Intent(VahanDmsAPI.this, (Class<?>) VahanFaceLessConfirmation.class);
                intent.putExtra("state_code", VahanDmsAPI.this.f2());
                intent.putExtra("rc_number", VahanDmsAPI.this.a2());
                intent.putExtra(VContant.APP_NO, VahanDmsAPI.this.O1());
                intent.putExtra(VContant.PURPOSE_CODE, VahanDmsAPI.this.Z1());
                VahanDmsAPI.this.startActivity(intent);
                VahanDmsAPI.this.finish();
            } catch (Exception unused) {
                if (VahanDmsAPI.this.W1().isShowing()) {
                    VahanDmsAPI.this.W1().dismiss();
                    VahanDmsAPI vahanDmsAPI3 = VahanDmsAPI.this;
                    vahanDmsAPI3.D2(vahanDmsAPI3, vahanDmsAPI3.T1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FinalRequestSubmitResponse) obj);
            return Unit.INSTANCE;
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
            if (VahanDmsAPI.this.W1().isShowing()) {
                VahanDmsAPI.this.W1().dismiss();
                VahanDmsAPI vahanDmsAPI = VahanDmsAPI.this;
                vahanDmsAPI.D2(vahanDmsAPI, vahanDmsAPI.T1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (VahanDmsAPI.this.W1().isShowing()) {
                    VahanDmsAPI.this.W1().dismiss();
                }
                Intent intent = new Intent(VahanDmsAPI.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanDmsAPI.this.Z1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", VahanDmsAPI.this.b2());
                intent.putExtra("RcDetails", VahanDmsAPI.this.c2());
                intent.putExtra(VContant.NEXGEN_isFACELESS, VahanDmsAPI.this.getIsFaceless());
                intent.putExtra(VContant.NEXGEN_addahar_name, VahanDmsAPI.this.M1());
                intent.putExtra(VContant.NEXGEN_addahar_address, VahanDmsAPI.this.L1());
                VahanDmsAPI.this.startActivity(intent);
                VahanDmsAPI.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotUserDataModel) obj);
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
            try {
                if (VahanDmsAPI.this.W1().isShowing()) {
                    VahanDmsAPI.this.W1().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanDmsAPI vahanDmsAPI = VahanDmsAPI.this;
                    Toast.makeText(vahanDmsAPI, vahanDmsAPI.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                    VahanDmsAPI vahanDmsAPI2 = VahanDmsAPI.this;
                    vahanDmsAPI2.w2(vahanDmsAPI2, str);
                    return;
                }
                VahanDmsAPI vahanDmsAPI3 = VahanDmsAPI.this;
                vahanDmsAPI3.w2(vahanDmsAPI3, vahanDmsAPI3.getString(R.string.service_unavable_please_try));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x000e, B:5:0x001b, B:7:0x003b, B:11:0x0044, B:13:0x0056, B:15:0x005c, B:17:0x0062, B:19:0x0068, B:21:0x0072, B:23:0x007b, B:31:0x00d7, B:33:0x00dd, B:35:0x00e3, B:37:0x00ed, B:39:0x00f6, B:41:0x0109, B:42:0x010d, B:43:0x0130, B:24:0x009d, B:26:0x00a5, B:28:0x00af, B:30:0x00b8, B:44:0x013c, B:46:0x014c, B:47:0x0165), top: B:51:0x000e }] */
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
                Method dump skipped, instruction units count: 402
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.f.a(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse):void");
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
            VahanDmsAPI.this.W1().dismiss();
            VahanDmsAPI.this.P1().h.setVisibility(8);
            VahanDmsAPI vahanDmsAPI = VahanDmsAPI.this;
            vahanDmsAPI.h3(vahanDmsAPI, vahanDmsAPI.getString(R.string.service_unavable_please_try));
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

    public VahanDmsAPI() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.x07
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanDmsAPI.Y1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getProfileLauncher = ofVarB0;
        of ofVarB02 = B0(new jf(), new hf() { // from class: com.zepto.i17
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanDmsAPI.S1(this.a, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E2(Dialog d2, VahanDmsAPI this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) VahanDmsAPI.class);
        intent.putExtra("state_code", this$0.f2());
        intent.putExtra(VContant.APP_NO, this$0.O1());
        intent.putExtra("rc_number", this$0.a2());
        intent.putExtra(VContant.PURPOSE_CODE, this$0.Z1());
        intent.putExtra("off_code", this$0.V1());
        intent.putExtra(VContant.FINAL_SUBMIT, this$0.X1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra("RC", this$0.b2());
        intent.putExtra("RcDetails", this$0.c2());
        intent.putExtra("vahlogReptDate", this$0.vahlogReptDate);
        intent.putExtra("vahlogFeeAmt", this$0.vahlogFeeAmt);
        intent.putExtra("vahlogReptNo", this$0.vahlogReptNo);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.M1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.L1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1() {
        try {
            e2().m(this, O1());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void H2(Bitmap imagePath) {
        if (imagePath == null) {
            Log.e("calling", "3");
            return;
        }
        Log.e("calling", VContant.APPLICATION_SCREEN);
        this.bitmap_sel = imagePath;
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
        N1().k(this.position);
    }

    private final Bitmap I1(String base64String) {
        byte[] bArrDecode = Base64.decode(base64String, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    private final void J1() {
        if (Build.VERSION.SDK_INT >= 31 || checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            return;
        }
        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
    }

    public static final void S1(VahanDmsAPI this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (uri != null) {
            try {
                String strQ = st6.q(this$0, uri);
                String strR = st6.r(this$0, uri);
                if (!this$0.K1().contains(StringsKt__StringsKt.trim((CharSequence) strR).toString())) {
                    Toast.makeText(this$0, this$0.T1().b("upload_file_types", "You can only upload file types (JPEG/JPG/PDF) and Maximum File Size is 200KB."), 0).show();
                    return;
                }
                if (!StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) strR).toString(), "pdf", true)) {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this$0.getContentResolver(), uri);
                    Intrinsics.checkNotNull(bitmap);
                    this$0.i2(bitmap);
                    return;
                }
                String strA = st6.a(this$0, uri);
                ArrayList arrayList = this$0.non_uploaded_list;
                NonUploaded nonUploaded = arrayList != null ? (NonUploaded) arrayList.get(this$0.position) : null;
                if (nonUploaded != null) {
                    nonUploaded.setAttached(Boolean.TRUE);
                }
                ArrayList arrayList2 = this$0.non_uploaded_list;
                NonUploaded nonUploaded2 = arrayList2 != null ? (NonUploaded) arrayList2.get(this$0.position) : null;
                if (nonUploaded2 != null) {
                    nonUploaded2.setBitmap(this$0.bitmap_sel);
                }
                ArrayList arrayList3 = this$0.non_uploaded_list;
                NonUploaded nonUploaded3 = arrayList3 != null ? (NonUploaded) arrayList3.get(this$0.position) : null;
                if (nonUploaded3 != null) {
                    nonUploaded3.setCatId(this$0.selectedCatId);
                }
                ArrayList arrayList4 = this$0.non_uploaded_list;
                NonUploaded nonUploaded4 = arrayList4 != null ? (NonUploaded) arrayList4.get(this$0.position) : null;
                if (nonUploaded4 != null) {
                    nonUploaded4.setSubId(this$0.selectedSubId);
                }
                ArrayList arrayList5 = this$0.non_uploaded_list;
                NonUploaded nonUploaded5 = arrayList5 != null ? (NonUploaded) arrayList5.get(this$0.position) : null;
                if (nonUploaded5 != null) {
                    nonUploaded5.setDocType(1);
                }
                ArrayList arrayList6 = this$0.non_uploaded_list;
                NonUploaded nonUploaded6 = arrayList6 != null ? (NonUploaded) arrayList6.get(this$0.position) : null;
                if (nonUploaded6 != null) {
                    nonUploaded6.setDocBase64(strA);
                }
                ArrayList arrayList7 = this$0.non_uploaded_list;
                NonUploaded nonUploaded7 = arrayList7 != null ? (NonUploaded) arrayList7.get(this$0.position) : null;
                if (nonUploaded7 != null) {
                    nonUploaded7.setFile_name(strQ);
                }
                this$0.N1().k(this$0.position);
            } catch (Exception unused) {
            }
        }
    }

    public static final void Y1(VahanDmsAPI this$0, gf gfVar) {
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
            if (!Intrinsics.areEqual(str, "photo") || extras == null) {
                return;
            }
            this$0.d3(extras);
        }
    }

    private final void d3(Bundle bundle) {
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
        N1().k(this.position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void g3(ArrayList non_uploaded_list) {
        DmsFileDetail dmsFileDetail;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(non_uploaded_list);
        int size = non_uploaded_list.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(((NonUploaded) non_uploaded_list.get(i)).getIsAttached(), Boolean.TRUE) && (((NonUploaded) non_uploaded_list.get(i)).getBitmap() != null || ((NonUploaded) non_uploaded_list.get(i)).getDocBase64() != null)) {
                Integer docType = ((NonUploaded) non_uploaded_list.get(i)).getDocType();
                if (docType == null || docType.intValue() != 1 || ((NonUploaded) non_uploaded_list.get(i)).getDocBase64() == null) {
                    Bitmap bitmap = ((NonUploaded) non_uploaded_list.get(i)).getBitmap();
                    Intrinsics.checkNotNull(bitmap);
                    String strF = st6.f(bitmap);
                    String catId = ((NonUploaded) non_uploaded_list.get(i)).getCatId();
                    Intrinsics.checkNotNull(catId);
                    String subId = ((NonUploaded) non_uploaded_list.get(i)).getSubId();
                    Intrinsics.checkNotNull(subId);
                    dmsFileDetail = new DmsFileDetail(strF, catId, subId, "file_" + System.currentTimeMillis() + i + ".jpg", false);
                } else {
                    String docBase64 = ((NonUploaded) non_uploaded_list.get(i)).getDocBase64();
                    Intrinsics.checkNotNull(docBase64);
                    String catId2 = ((NonUploaded) non_uploaded_list.get(i)).getCatId();
                    Intrinsics.checkNotNull(catId2);
                    String subId2 = ((NonUploaded) non_uploaded_list.get(i)).getSubId();
                    Intrinsics.checkNotNull(subId2);
                    dmsFileDetail = new DmsFileDetail(docBase64, catId2, subId2, "file_" + System.currentTimeMillis() + i + ".pdf", false);
                }
                arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(dmsFileDetail));
            }
        }
        Log.v("List Size", String.valueOf(arrayList.size()));
        DmsUploadReq dmsUploadReq = new DmsUploadReq(StringsKt__StringsKt.trim((CharSequence) O1()).toString(), arrayList, StringsKt__StringsKt.trim((CharSequence) f2()).toString());
        P1().p.setEnabled(false);
        R1().t(dmsUploadReq);
    }

    private final void i2(Bitmap uri) {
        Log.e("calling", VContant.APPLICATION_SCREEN);
        H2(uri);
    }

    public static final void i3(Dialog d2, VahanDmsAPI this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void k2(VahanDmsAPI this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.T1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void l2(VahanDmsAPI this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.b2());
        intent.putExtra("RcDetails", this$0.c2());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.M1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.L1());
        this$0.startActivity(intent);
    }

    public static final void m2(VahanDmsAPI this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.G1(this$0.non_uploaded_list)) {
            this$0.B2(this$0, this$0.T1().b("doc_mandatory", "Please Upload all the mandatory documents"));
            return;
        }
        try {
            String.valueOf(System.currentTimeMillis());
            String str = this$0.vahlogReptDate;
            String str2 = this$0.vahlogReptNo;
            double d2 = this$0.vahlogFeeAmt;
            String strO1 = this$0.O1();
            String strB2 = this$0.b2();
            hz0.a aVar = hz0.a;
            VahanLogUpdateDoc.INSTANCE.a(this$0, new DocUpdateLogs(str, str, str2, d2, strO1, strB2, aVar.r(), aVar.r()));
        } catch (Exception e2) {
            e2.toString();
        }
        this$0.W1().show();
        this$0.e2().y1(new BeforePaymentRequestfinal(this$0.X1().getAadharauth(), this$0.O1(), this$0.X1().getChanngeOfAdressDto(), this$0.X1().getComp_cd(), this$0.X1().getDurcdto(), this$0.X1().getFir_dt(), this$0.X1().getFir_no(), this$0.X1().getHpaDto(), this$0.X1().getHptDto(), this$0.X1().getIdv(), String.valueOf(this$0.X1().getIns_from()), this$0.X1().getIns_type(), String.valueOf(this$0.X1().getIns_upto()), this$0.X1().getMsg().toString(), this$0.X1().getNocDto(), this$0.X1().getOff_cd().toString(), this$0.X1().getOp_dt().toString(), this$0.X1().getPolice_station().toString(), this$0.X1().getPolicy_no().toString(), this$0.X1().getPur_cd().toString(), this$0.vahlogReptDate, this$0.vahlogReptNo, String.valueOf(this$0.vahlogFeeAmt), this$0.X1().getReason(), this$0.X1().getRegn_no().toString(), this$0.X1().getState_cd().toString(), this$0.X1().getState_header().toString(), this$0.X1().getStatus().toString(), this$0.X1().getTax_mode().toString(), this$0.X1().getVh_class()));
    }

    public static final void n2(VahanDmsAPI this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.P1().t.getVisibility() == 0) {
            this$0.P1().t.setVisibility(8);
        } else {
            this$0.P1().t.setVisibility(0);
        }
    }

    public static final void o2(VahanDmsAPI this$0, DmsUploadRes dmsUploadRes) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().p.setEnabled(true);
        try {
            if (!StringsKt__StringsJVMKt.equals(dmsUploadRes.getStatusCode(), "V001", true)) {
                Log.e("Error1", "erro");
                this$0.W1().dismiss();
                this$0.z2(this$0);
                return;
            }
            Log.e("Error", "V001");
            if (this$0.Z1().equals("3")) {
                try {
                    qs1 qs1VarR1 = this$0.R1();
                    String strO1 = this$0.O1();
                    String strZ1 = this$0.Z1();
                    String strF2 = this$0.f2();
                    Integer vehTypeAsInt = this$0.c2().getVehTypeAsInt();
                    Intrinsics.checkNotNull(vehTypeAsInt);
                    int iIntValue = vehTypeAsInt.intValue();
                    VContant.Companion companion = VContant.INSTANCE;
                    dulicateRcResponseModle durcdto = this$0.X1().getDurcdto();
                    String reason = durcdto != null ? durcdto.getReason() : null;
                    Intrinsics.checkNotNull(reason);
                    qs1VarR1.p(strO1, strZ1, strF2, iIntValue, companion.B(reason), this$0.c2());
                } catch (Exception unused) {
                    qs1 qs1VarR12 = this$0.R1();
                    String strO12 = this$0.O1();
                    String strZ12 = this$0.Z1();
                    String strF22 = this$0.f2();
                    Integer vehTypeAsInt2 = this$0.c2().getVehTypeAsInt();
                    Intrinsics.checkNotNull(vehTypeAsInt2);
                    qs1VarR12.p(strO12, strZ12, strF22, vehTypeAsInt2.intValue(), 10, this$0.c2());
                }
            } else {
                qs1 qs1VarR13 = this$0.R1();
                String strO13 = this$0.O1();
                String strZ13 = this$0.Z1();
                String strF23 = this$0.f2();
                Integer vehTypeAsInt3 = this$0.c2().getVehTypeAsInt();
                Intrinsics.checkNotNull(vehTypeAsInt3);
                qs1VarR13.p(strO13, strZ13, strF23, vehTypeAsInt3.intValue(), 10, this$0.c2());
            }
            this$0.F2(this$0, this$0.T1().b("doc_uploaded_successfully", "Documents has been Successfully Uploaded!"));
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e("Error", Unit.INSTANCE.toString());
            this$0.W1().dismiss();
            this$0.z2(this$0);
        }
    }

    public static final void p2(VahanDmsAPI this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().p.setEnabled(true);
        this$0.W1().dismiss();
        this$0.z2(this$0);
    }

    public static final void q2(VahanDmsAPI this$0, VahanDmsModleResponse vahanDmsModleResponse) {
        List<Uploaded> uploadedList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.W1().dismiss();
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
                this$0.P1().r.setAdapter(null);
                this$0.K2(new b27(this$0, this$0, this$0.non_uploaded_list));
                this$0.P1().r.setAdapter(this$0.N1());
                this$0.N1().j();
            } else {
                ArrayList arrayList3 = this$0.non_uploaded_list;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                this$0.P1().r.setAdapter(null);
                this$0.N1().j();
            }
            UploadDataDto uploadDataDto2 = vahanDmsModleResponse.getUploadDataDto();
            Integer numValueOf2 = (uploadDataDto2 == null || (uploadedList = uploadDataDto2.getUploadedList()) == null) ? null : Integer.valueOf(uploadedList.size());
            Intrinsics.checkNotNull(numValueOf2);
            if (numValueOf2.intValue() > 0) {
                try {
                    this$0.P1().s.setVisibility(0);
                    UploadDataDto uploadDataDto3 = vahanDmsModleResponse.getUploadDataDto();
                    this$0.uploaded_list = uploadDataDto3 != null ? uploadDataDto3.getUploadedList() : null;
                    this$0.P1().t.setAdapter(null);
                    this$0.b3(new au6(this$0, this$0, this$0.uploaded_list));
                    this$0.P1().t.setAdapter(this$0.g2());
                    this$0.g2().j();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (this$0.G1(this$0.non_uploaded_list)) {
                this$0.P1().i.setVisibility(8);
                this$0.P1().p.setVisibility(0);
            } else {
                this$0.P1().i.setVisibility(0);
                this$0.P1().p.setVisibility(8);
            }
        }
    }

    public static final void r2(VahanDmsAPI this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.W1().dismiss();
    }

    public static final void s2(VahanDmsAPI this$0, DMSViewDocModle dMSViewDocModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.W1().dismiss();
        if (StringsKt__StringsJVMKt.equals(dMSViewDocModle.getStatusCode(), "V001", true)) {
            if (!StringsKt__StringsJVMKt.equals(dMSViewDocModle.getFileExt(), ".pdf", true)) {
                this$0.e3(this$0, dMSViewDocModle.getFileContent());
            } else {
                try {
                    this$0.v2(dMSViewDocModle.getFileName(), dMSViewDocModle.getFileContent());
                } catch (Exception unused) {
                }
            }
        }
    }

    public static final void t2(VahanDmsAPI this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.W1().dismiss();
    }

    public static final void u2(VahanDmsAPI this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.F1(this$0.non_uploaded_list)) {
            this$0.B2(this$0, this$0.T1().b("doc_mandatory", "Please Upload all the mandatory documents"));
            return;
        }
        this$0.W1().show();
        try {
            this$0.g3(this$0.non_uploaded_list);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(Context context, String it) {
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
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.x2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.y2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void B2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.C2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void D2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.E2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final boolean F1(ArrayList list) {
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((NonUploaded) it.next()).getIsAttached(), Boolean.TRUE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void F2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        textView.setText(new wa3(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.G2(dialog, view);
            }
        });
        dialog.show();
    }

    public final boolean G1(ArrayList list) {
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsJVMKt.equals(String.valueOf(((NonUploaded) it.next()).getMandatory()), "Y", true)) {
                    Log.e("check", "y");
                    return true;
                }
            }
        }
        return false;
    }

    public final void I2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final ArrayList K1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("JPEG");
        arrayList.add("JPG");
        arrayList.add("PDF");
        arrayList.add("jpeg");
        arrayList.add("jpg");
        arrayList.add("pdf");
        arrayList.add("PNG");
        arrayList.add("png");
        return arrayList;
    }

    public final void K2(b27 b27Var) {
        Intrinsics.checkNotNullParameter(b27Var, "<set-?>");
        this.adapter = b27Var;
    }

    public final String L1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final void L2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appl_no = str;
    }

    public final String M1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final void M2(s17 s17Var) {
        Intrinsics.checkNotNullParameter(s17Var, "<set-?>");
        this.binding = s17Var;
    }

    public final b27 N1() {
        b27 b27Var = this.adapter;
        if (b27Var != null) {
            return b27Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void N2(DMSService dMSService) {
        Intrinsics.checkNotNullParameter(dMSService, "<set-?>");
        this.dmsService = dMSService;
    }

    public final String O1() {
        String str = this.appl_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appl_no");
        return null;
    }

    public final void O2(qs1 qs1Var) {
        Intrinsics.checkNotNullParameter(qs1Var, "<set-?>");
        this.dmsViewModle = qs1Var;
    }

    public final s17 P1() {
        s17 s17Var = this.binding;
        if (s17Var != null) {
            return s17Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void P2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final DMSService Q1() {
        DMSService dMSService = this.dmsService;
        if (dMSService != null) {
            return dMSService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsService");
        return null;
    }

    public final void Q2(ArrayList arrayList) {
        this.non_uploaded_list = arrayList;
    }

    public final qs1 R1() {
        qs1 qs1Var = this.dmsViewModle;
        if (qs1Var != null) {
            return qs1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dmsViewModle");
        return null;
    }

    public final void R2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offCd = str;
    }

    public final void S2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final wa3 T1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final void T2(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final ArrayList getNon_uploaded_list() {
        return this.non_uploaded_list;
    }

    public final void U2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final String V1() {
        String str = this.offCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("offCd");
        return null;
    }

    public final void V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final ProgressDialog W1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void W2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final BeforePaymentRequest X1() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final void X2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void Y2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    public final String Z1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }

    public final void Z2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    @Override // com.zepto.b27.a
    public void a(int pos) {
    }

    public final String a2() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final void a3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final String b2() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final void b3(au6 au6Var) {
        Intrinsics.checkNotNullParameter(au6Var, "<set-?>");
        this.uploaded_adapter = au6Var;
    }

    public final NrvDetails c2() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final void c3(List list) {
        this.uploaded_list = list;
    }

    @Override // com.zepto.b27.a
    public void d(int pos, String cat_id, String sub_id) {
        Intrinsics.checkNotNullParameter(cat_id, "cat_id");
        Intrinsics.checkNotNullParameter(sub_id, "sub_id");
        if (st6.e(this)) {
            this.imgType = "signature";
            this.position = pos;
            this.selectedCatId = cat_id;
            this.selectedSubId = sub_id;
            new Intent("android.intent.action.GET_CONTENT").setType("*/*");
            this.getDocLauncher.a("*/*");
        }
    }

    public final VahanProService d2() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    @Override // com.zepto.b27.a
    public void e(int pos, String sub_id, String cat_id, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(sub_id, "sub_id");
        Intrinsics.checkNotNullParameter(cat_id, "cat_id");
        W1().show();
        this.position = pos;
        Intrinsics.checkNotNull(bitmap);
        R1().t(new DmsUploadReq(StringsKt__StringsKt.trim((CharSequence) O1()).toString(), CollectionsKt__CollectionsJVMKt.listOf(new DmsFileDetail(st6.f(bitmap), cat_id, sub_id, "file_" + System.currentTimeMillis() + ".jpg", false)), StringsKt__StringsKt.trim((CharSequence) f2()).toString()));
    }

    public final ld7 e2() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    public final void e3(Context context, String base64) {
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
        ((ImageView) viewFindViewById2).setImageBitmap(I1(base64));
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.f3(dialog, view);
            }
        });
        dialog.show();
    }

    public final String f2() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    @Override // com.zepto.b27.a
    public void g(int pos) {
        ArrayList arrayList = this.non_uploaded_list;
        NonUploaded nonUploaded = arrayList != null ? (NonUploaded) arrayList.get(pos) : null;
        if (nonUploaded != null) {
            nonUploaded.setAttached(Boolean.FALSE);
        }
        ArrayList arrayList2 = this.non_uploaded_list;
        NonUploaded nonUploaded2 = arrayList2 != null ? (NonUploaded) arrayList2.get(pos) : null;
        if (nonUploaded2 != null) {
            nonUploaded2.setBitmap(null);
        }
        ArrayList arrayList3 = this.non_uploaded_list;
        NonUploaded nonUploaded3 = arrayList3 != null ? (NonUploaded) arrayList3.get(pos) : null;
        if (nonUploaded3 != null) {
            nonUploaded3.setSubId("");
        }
        ArrayList arrayList4 = this.non_uploaded_list;
        NonUploaded nonUploaded4 = arrayList4 != null ? (NonUploaded) arrayList4.get(pos) : null;
        if (nonUploaded4 != null) {
            nonUploaded4.setCatId("");
        }
        N1().k(pos);
    }

    public final au6 g2() {
        au6 au6Var = this.uploaded_adapter;
        if (au6Var != null) {
            return au6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uploaded_adapter");
        return null;
    }

    @Override // com.zepto.b27.a
    public void h(int pos, String cat_id, String sub_id) {
        Intrinsics.checkNotNullParameter(cat_id, "cat_id");
        Intrinsics.checkNotNullParameter(sub_id, "sub_id");
        if (aj0.a.a(this)) {
            this.imgType = "photo";
            this.position = pos;
            this.selectedCatId = cat_id;
            this.selectedSubId = sub_id;
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.getProfileLauncher.a(getIntent());
            return;
        }
        if (st6.d(this)) {
            this.imgType = "photo";
            this.position = pos;
            this.selectedCatId = cat_id;
            this.selectedSubId = sub_id;
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.getProfileLauncher.a(getIntent());
        }
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final List getUploaded_list() {
        return this.uploaded_list;
    }

    public final void h3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.i3(dialog, this, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: renamed from: j2, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, T1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_dms_activity);
        s17 s17VarC = s17.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(s17VarC, "inflate(...)");
        M2(s17VarC);
        setContentView(P1().b());
        ta3.a.g2(this, P1());
        P2(new wa3(this));
        Y2(VahanProService.INSTANCE.a(this));
        N2(DMSService.INSTANCE.a(this));
        J1();
        S2(new ProgressDialog(this));
        W1().setMessage("Please wait...");
        W1().setCancelable(false);
        W1().setCanceledOnTouchOutside(false);
        P1().e.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.k2(this.a, view);
            }
        });
        Z2((ld7) new z(this, new kd7(new jd7(d2()))).a(ld7.class));
        O2((qs1) new z(this, new dc1(new cc1(Q1()))).a(qs1.class));
        P1().r.setLayoutManager(new LinearLayoutManager(this));
        P1().t.setLayoutManager(new LinearLayoutManager(this));
        try {
            String stringExtra = getIntent().getStringExtra("state_code");
            Intrinsics.checkNotNull(stringExtra);
            a3(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
            Intrinsics.checkNotNull(stringExtra2);
            L2(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            Intrinsics.checkNotNull(stringExtra3);
            V2(stringExtra3);
            String stringExtra4 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
            Intrinsics.checkNotNull(stringExtra4);
            U2(stringExtra4);
            String stringExtra5 = getIntent().getStringExtra("off_code");
            Intrinsics.checkNotNull(stringExtra5);
            R2(stringExtra5);
            Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
            T2((BeforePaymentRequest) serializableExtra);
            P1().u.setText(T1().b("vehicle_no", "Vehicle No. :") + ' ' + a2());
            P1().b.setText(T1().b("vahan_application_no", "Application No.") + ' ' + O1());
            this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
            J2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
            I2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
            W2(String.valueOf(getIntent().getStringExtra("RC")));
            Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            X2((NrvDetails) serializableExtra2);
            this.vahlogReptDate = String.valueOf(getIntent().getStringExtra("vahlogReptDate"));
            this.vahlogFeeAmt = getIntent().getDoubleExtra("vahlogFeeAmt", 0.0d);
            this.vahlogReptNo = String.valueOf(getIntent().getStringExtra("vahlogReptNo"));
            TextView textView = P1().e.g;
            VContant.Companion companion = VContant.INSTANCE;
            textView.setText(companion.L(this, Z1()));
            P1().v.setText(T1().b("view_vehicle_details", "View Vehicle Details"));
            P1().v.setPaintFlags(P1().v.getPaintFlags() | 8);
            P1().v.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VahanDmsAPI.l2(this.a, view);
                }
            });
            if (this.isFaceless) {
                P1().c.e.setWeightSum(3.0f);
            }
            boolean z = this.isFaceless;
            LinearLayout appMent = P1().c.b;
            Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
            companion.M(z, appMent);
            P1().i.setVisibility(8);
            P1().k.setWeightSum(1.0f);
            W1().show();
            if (StringsKt__StringsJVMKt.equals(Z1(), "3", true)) {
                try {
                    gd1.a aVar = gd1.a;
                    dulicateRcResponseModle durcdto = X1().getDurcdto();
                    String reason = durcdto != null ? durcdto.getReason() : null;
                    Intrinsics.checkNotNull(reason);
                    if (aVar.m(String.valueOf(companion.B(reason)))) {
                        qs1 qs1VarR1 = R1();
                        String strO1 = O1();
                        String strZ1 = Z1();
                        String strF2 = f2();
                        Integer vehTypeAsInt = c2().getVehTypeAsInt();
                        Intrinsics.checkNotNull(vehTypeAsInt);
                        qs1VarR1.g(strO1, strZ1, strF2, vehTypeAsInt.intValue(), 0, c2());
                    } else {
                        qs1 qs1VarR12 = R1();
                        String strO12 = O1();
                        String strZ12 = Z1();
                        String strF22 = f2();
                        Integer vehTypeAsInt2 = c2().getVehTypeAsInt();
                        Intrinsics.checkNotNull(vehTypeAsInt2);
                        int iIntValue = vehTypeAsInt2.intValue();
                        dulicateRcResponseModle durcdto2 = X1().getDurcdto();
                        String reason2 = durcdto2 != null ? durcdto2.getReason() : null;
                        Intrinsics.checkNotNull(reason2);
                        qs1VarR12.g(strO12, strZ12, strF22, iIntValue, companion.B(reason2), c2());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    qs1 qs1VarR13 = R1();
                    String strO13 = O1();
                    String strZ13 = Z1();
                    String strF23 = f2();
                    Integer vehTypeAsInt3 = c2().getVehTypeAsInt();
                    Intrinsics.checkNotNull(vehTypeAsInt3);
                    qs1VarR13.g(strO13, strZ13, strF23, vehTypeAsInt3.intValue(), 0, c2());
                }
            } else {
                qs1 qs1VarR14 = R1();
                String strO14 = O1();
                String strZ14 = Z1();
                String strF24 = f2();
                Integer vehTypeAsInt4 = c2().getVehTypeAsInt();
                Intrinsics.checkNotNull(vehTypeAsInt4);
                qs1VarR14.g(strO14, strZ14, strF24, vehTypeAsInt4.intValue(), 10, c2());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        P1().s.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.n2(this.a, view);
            }
        });
        R1().h().g(this, new h(new f()));
        R1().i().g(this, new h(new g()));
        R1().j().g(this, new mf4() { // from class: com.zepto.o17
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsAPI.o2(this.a, (DmsUploadRes) obj);
            }
        });
        R1().k().g(this, new mf4() { // from class: com.zepto.p17
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsAPI.p2(this.a, (String) obj);
            }
        });
        R1().l().g(this, new mf4() { // from class: com.zepto.q17
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsAPI.q2(this.a, (VahanDmsModleResponse) obj);
            }
        });
        R1().m().g(this, new mf4() { // from class: com.zepto.r17
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsAPI.r2(this.a, (String) obj);
            }
        });
        R1().q().g(this, new mf4() { // from class: com.zepto.y07
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsAPI.s2(this.a, (DMSViewDocModle) obj);
            }
        });
        R1().r().g(this, new mf4() { // from class: com.zepto.z07
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanDmsAPI.t2(this.a, (String) obj);
            }
        });
        P1().p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.u2(this.a, view);
            }
        });
        P1().i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                VahanDmsAPI.m2(this.a, view);
            }
        });
        e2().V().g(this, new h(new b()));
        e2().W().g(this, new h(new c()));
        e2().Y0().g(this, new h(new d()));
        e2().X0().g(this, new h(new e()));
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
            J1();
        }
    }

    @Override // com.zepto.au6.a
    public void q(String doc_number) {
        Intrinsics.checkNotNullParameter(doc_number, "doc_number");
        try {
            W1().show();
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) doc_number, new String[]{"/"}, false, 0, 6, (Object) null);
            R1().u(StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(0)).toString(), StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(2)).toString(), StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(1)).toString());
        } catch (Exception e2) {
            W1().dismiss();
            e2.printStackTrace();
        }
    }

    public final void v2(String file_name, String base64Pdf) throws IOException {
        Intrinsics.checkNotNullParameter(file_name, "file_name");
        Intrinsics.checkNotNullParameter(base64Pdf, "base64Pdf");
        String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str + file_name);
        if (!file2.exists()) {
            byte[] bArrDecode = Base64.decode(base64Pdf, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + file_name));
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void z2(Context context) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDmsAPI.A2(dialog, view);
            }
        });
        dialog.show();
    }
}
