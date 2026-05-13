package com.nic.mparivahan.Dl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLDashboardNew;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.BioObjX;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CreateVirtualDocModle;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RecentSearch;
import com.nic.mparivahan.RC.RCDashBoard;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.ViewRcChallanActivity;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.d65;
import com.zepto.hs1;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k18;
import com.zepto.k9;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b¶\u0002\u0010·\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u001c\u0010\r\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u001e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001a\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u001e\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005J*\u0010\"\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 J6\u0010'\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0005J\b\u0010(\u001a\u00020\u0003H\u0007J\u001a\u0010)\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010Z\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010R\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\"\u0010j\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010]\u001a\u0004\bh\u0010_\"\u0004\bi\u0010aR\"\u0010n\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010]\u001a\u0004\bl\u0010_\"\u0004\bm\u0010aR\"\u0010r\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010]\u001a\u0004\bp\u0010_\"\u0004\bq\u0010aR\"\u0010v\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010]\u001a\u0004\bt\u0010_\"\u0004\bu\u0010aR\"\u0010z\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010]\u001a\u0004\bx\u0010_\"\u0004\by\u0010aR\"\u0010~\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b{\u0010R\u001a\u0004\b|\u0010T\"\u0004\b}\u0010VR)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R)\u0010\u008a\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0081\u0001\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001\"\u0006\b\u0089\u0001\u0010\u0085\u0001R&\u0010\u008e\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010J\u001a\u0005\b\u008c\u0001\u0010L\"\u0005\b\u008d\u0001\u0010NR&\u0010\u0092\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010J\u001a\u0005\b\u0090\u0001\u0010L\"\u0005\b\u0091\u0001\u0010NR&\u0010\u0096\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010J\u001a\u0005\b\u0094\u0001\u0010L\"\u0005\b\u0095\u0001\u0010NR)\u0010\u009d\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R&\u0010¡\u0001\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010R\u001a\u0005\b\u009f\u0001\u0010T\"\u0005\b \u0001\u0010VR&\u0010¥\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¢\u0001\u0010]\u001a\u0005\b£\u0001\u0010_\"\u0005\b¤\u0001\u0010aR*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R1\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R*\u0010¾\u0001\u001a\u00030·\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R&\u0010Â\u0001\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¿\u0001\u0010R\u001a\u0005\bÀ\u0001\u0010T\"\u0005\bÁ\u0001\u0010VR&\u0010Æ\u0001\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÃ\u0001\u0010R\u001a\u0005\bÄ\u0001\u0010T\"\u0005\bÅ\u0001\u0010VR4\u0010Ï\u0001\u001a\r È\u0001*\u0005\u0018\u00010Ç\u00010Ç\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R*\u0010×\u0001\u001a\u00030Ð\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R(\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bØ\u0001\u0010\u0098\u0001\u001a\u0006\bÙ\u0001\u0010\u009a\u0001\"\u0006\bÚ\u0001\u0010\u009c\u0001R)\u0010Þ\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÛ\u0001\u0010\u0098\u0001\u001a\u0006\bÜ\u0001\u0010\u009a\u0001\"\u0006\bÝ\u0001\u0010\u009c\u0001R)\u0010å\u0001\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R&\u0010é\u0001\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bæ\u0001\u0010R\u001a\u0005\bç\u0001\u0010T\"\u0005\bè\u0001\u0010VR&\u0010í\u0001\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bê\u0001\u0010R\u001a\u0005\bë\u0001\u0010T\"\u0005\bì\u0001\u0010VR&\u0010ñ\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bî\u0001\u0010]\u001a\u0005\bï\u0001\u0010_\"\u0005\bð\u0001\u0010aR&\u0010õ\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bò\u0001\u0010]\u001a\u0005\bó\u0001\u0010_\"\u0005\bô\u0001\u0010aR&\u0010ù\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bö\u0001\u0010]\u001a\u0005\b÷\u0001\u0010_\"\u0005\bø\u0001\u0010aR&\u0010ý\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bú\u0001\u0010]\u001a\u0005\bû\u0001\u0010_\"\u0005\bü\u0001\u0010aR&\u0010\u0081\u0002\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bþ\u0001\u0010]\u001a\u0005\bÿ\u0001\u0010_\"\u0005\b\u0080\u0002\u0010aR&\u0010\u0085\u0002\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0002\u0010]\u001a\u0005\b\u0083\u0002\u0010_\"\u0005\b\u0084\u0002\u0010aR&\u0010\u0089\u0002\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0086\u0002\u0010R\u001a\u0005\b\u0087\u0002\u0010T\"\u0005\b\u0088\u0002\u0010VR&\u0010\u008d\u0002\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0002\u0010R\u001a\u0005\b\u008b\u0002\u0010T\"\u0005\b\u008c\u0002\u0010VR&\u0010\u0091\u0002\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008e\u0002\u0010]\u001a\u0005\b\u008f\u0002\u0010_\"\u0005\b\u0090\u0002\u0010aR)\u0010\u0095\u0002\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0081\u0001\u001a\u0006\b\u0093\u0002\u0010\u0083\u0001\"\u0006\b\u0094\u0002\u0010\u0085\u0001R)\u0010\u0099\u0002\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0002\u0010à\u0001\u001a\u0006\b\u0097\u0002\u0010â\u0001\"\u0006\b\u0098\u0002\u0010ä\u0001R*\u0010¡\u0002\u001a\u00030\u009a\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010\u009c\u0002\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002R*\u0010©\u0002\u001a\u00030¢\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0002\u0010¤\u0002\u001a\u0006\b¥\u0002\u0010¦\u0002\"\u0006\b§\u0002\u0010¨\u0002R\u001a\u0010\u00ad\u0002\u001a\u00030ª\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R*\u0010µ\u0002\u001a\u00030®\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002¨\u0006¸\u0002"}, d2 = {"Lcom/nic/mparivahan/Dl/DLDashboardNew;", "Lcom/zepto/pq;", "Lcom/zepto/d65;", "", "l2", "", "str", "", "P1", "v4", "Landroid/content/Context;", "context", "message", "h3", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/EditText;", "editText", "Landroid/view/View;", "mView", "J2", "v3", "encodedImage", "Landroid/graphics/Bitmap;", "S1", "k3", "searchNumber", "u", "I", "n3", "dl_number", "", "forChallan", "q3", "doc_number", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "dlobj", "doc_id", "Q1", "E3", "t4", "Lcom/zepto/is1;", "C", "Lcom/zepto/is1;", "E2", "()Lcom/zepto/is1;", "W3", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "D", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "D2", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "V3", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "N2", "()Landroid/app/ProgressDialog;", "e4", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Landroid/content/Context;", "C2", "()Landroid/content/Context;", "U3", "(Landroid/content/Context;)V", "mContext", "G", "Landroid/widget/EditText;", "k2", "()Landroid/widget/EditText;", "P3", "(Landroid/widget/EditText;)V", "etSearchDL", "Landroid/widget/LinearLayout;", "H", "Landroid/widget/LinearLayout;", "A2", "()Landroid/widget/LinearLayout;", "S3", "(Landroid/widget/LinearLayout;)V", "llSearchDL", "getLlCreateDl", "R3", "llCreateDl", "Landroid/widget/TextView;", "J", "Landroid/widget/TextView;", "U2", "()Landroid/widget/TextView;", "k4", "(Landroid/widget/TextView;)V", "txtDlHolderName", "K", "W2", "m4", "txtLicAuthCode", "L", "getTxtVehicleClass", "p4", "txtVehicleClass", "M", "Y2", "o4", "txtLicValidityCode", "N", "X2", "n4", "txtLicAuthority", "O", "V2", "l4", "txtIssueDate", "P", "Z2", "q4", "txt_dl_number", "Q", "e2", "J3", "dl_layout", "Landroid/widget/ImageView;", "R", "Landroid/widget/ImageView;", "L2", "()Landroid/widget/ImageView;", "c4", "(Landroid/widget/ImageView;)V", "owner_image", "S", "Z1", "D3", "date_img", "T", "h2", "M3", "dobDateMain", "U", "i2", "N3", "dobMonthMain", "V", "j2", "O3", "dobYearMain", "W", "Ljava/lang/String;", "Y1", "()Ljava/lang/String;", "C3", "(Ljava/lang/String;)V", "dateValeMain", "X", "c2", "H3", "dlRecentSearch", "Y", "V1", "y3", "clrText", "Landroidx/recyclerview/widget/RecyclerView;", "Z", "Landroidx/recyclerview/widget/RecyclerView;", "O2", "()Landroidx/recyclerview/widget/RecyclerView;", "f4", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recDlRecycler", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/RecentSearch;", "a0", "Ljava/util/ArrayList;", "P2", "()Ljava/util/ArrayList;", "g4", "(Ljava/util/ArrayList;)V", "recentSearchList", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "b0", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "X1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "B3", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "c0", "B2", "T3", "ll_create_dl", "d0", "a3", "s4", "viewChallanLl", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "e0", "Ljava/util/Calendar;", "U1", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Lcom/zepto/ws6;", "f0", "Lcom/zepto/ws6;", "getUserSessionManager", "()Lcom/zepto/ws6;", "r4", "(Lcom/zepto/ws6;)V", "userSessionManager", "g0", "f2", "K3", "h0", "getD_number", "A3", "d_number", "i0", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "g2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "L3", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlobjx", "j0", "R2", "i4", "redirect_Rcdashboard", "k0", "H2", "Z3", "nexgenarrow", "l0", "I2", "a4", "ntValidUpTodate", "m0", "T2", "j4", "trValidUpto", "n0", "b2", "G3", "dlNo", "o0", "M2", "d4", "owner_name", "p0", "z2", "Q3", "issue_date", "q0", "T1", "x3", "address", "r0", "a2", "F3", "dlHolder", "s0", "Q2", "h4", "redirect_DashBoard", "t0", "W1", "z3", "createDl", "u0", "K2", "b4", "option_menu", "v0", "d2", "I3", "dl_data", "Lcom/zepto/a55;", "w0", "Lcom/zepto/a55;", "G2", "()Lcom/zepto/a55;", "Y3", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "x0", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "F2", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "X3", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/zepto/k9;", "y0", "Lcom/zepto/k9;", "binding", "Lcom/zepto/wa3;", "z0", "Lcom/zepto/wa3;", "S2", "()Lcom/zepto/wa3;", "setSession", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDLDashboardNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DLDashboardNew.kt\ncom/nic/mparivahan/Dl/DLDashboardNew\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1546:1\n107#2:1547\n79#2,22:1548\n107#2:1570\n79#2,22:1571\n107#2:1593\n79#2,22:1594\n107#2:1616\n79#2,22:1617\n107#2:1639\n79#2,22:1640\n107#2:1662\n79#2,22:1663\n107#2:1685\n79#2,22:1686\n107#2:1708\n79#2,22:1709\n107#2:1731\n79#2,22:1732\n107#2:1754\n79#2,22:1755\n107#2:1777\n79#2,22:1778\n107#2:1800\n79#2,22:1801\n107#2:1823\n79#2,22:1824\n107#2:1846\n79#2,22:1847\n107#2:1869\n79#2,22:1870\n107#2:1892\n79#2,22:1893\n107#2:1915\n79#2,22:1916\n107#2:1938\n79#2,22:1939\n107#2:1961\n79#2,22:1962\n107#2:1984\n79#2,22:1985\n107#2:2007\n79#2,22:2008\n*S KotlinDebug\n*F\n+ 1 DLDashboardNew.kt\ncom/nic/mparivahan/Dl/DLDashboardNew\n*L\n741#1:1547\n741#1:1548,22\n750#1:1570\n750#1:1571,22\n753#1:1593\n753#1:1594,22\n768#1:1616\n768#1:1617,22\n769#1:1639\n769#1:1640,22\n770#1:1662\n770#1:1663,22\n773#1:1685\n773#1:1686,22\n774#1:1708\n774#1:1709,22\n775#1:1731\n775#1:1732,22\n1098#1:1754\n1098#1:1755,22\n1099#1:1777\n1099#1:1778,22\n1100#1:1800\n1100#1:1801,22\n1103#1:1823\n1103#1:1824,22\n1104#1:1846\n1104#1:1847,22\n1105#1:1869\n1105#1:1870,22\n1294#1:1892\n1294#1:1893,22\n1295#1:1915\n1295#1:1916,22\n1296#1:1938\n1296#1:1939,22\n1307#1:1961\n1307#1:1962,22\n1308#1:1984\n1308#1:1985,22\n1309#1:2007\n1309#1:2008,22\n*E\n"})
public final class DLDashboardNew extends pq implements d65 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public EditText etSearchDL;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public LinearLayout llSearchDL;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LinearLayout llCreateDl;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView txtDlHolderName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView txtLicAuthCode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView txtVehicleClass;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView txtLicValidityCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView txtLicAuthority;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView txtIssueDate;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView txt_dl_number;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public LinearLayout dl_layout;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ImageView owner_image;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ImageView date_img;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public EditText dobDateMain;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public EditText dobMonthMain;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public EditText dobYearMain;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String dateValeMain;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public LinearLayout dlRecentSearch;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public TextView clrText;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public RecyclerView recDlRecycler;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ArrayList recentSearchList;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public LinearLayout ll_create_dl;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public LinearLayout viewChallanLl;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String dl_number;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String d_number;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public DldetobjX dlobjx;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public LinearLayout redirect_Rcdashboard;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public TextView ntValidUpTodate;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public TextView trValidUpto;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public TextView dlNo;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public TextView owner_name;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public TextView issue_date;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public TextView address;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public LinearLayout dlHolder;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public LinearLayout redirect_DashBoard;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public TextView createDl;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public ImageView option_menu;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public DldetobjX dl_data;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public k9 binding;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public wa3 session;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            DLDashboardNew.this.h2().requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                DLDashboardNew.this.i2().requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 31) {
                    DLDashboardNew.this.h2().setText("");
                }
            }
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            DLDashboardNew.this.i2().requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                DLDashboardNew.this.j2().requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 12) {
                    DLDashboardNew.this.i2().setText("");
                }
            }
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 4) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 < 1900) {
                    DLDashboardNew.this.j2().setText("");
                }
            }
        }
    }

    public static final class d implements View.OnClickListener {
        public final /* synthetic */ g b;

        public d(g gVar) {
            this.b = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            DLDashboardNew dLDashboardNew = DLDashboardNew.this;
            new DatePickerDialog(dLDashboardNew, this.b, dLDashboardNew.getCal().get(1), DLDashboardNew.this.getCal().get(2), DLDashboardNew.this.getCal().get(5)).show();
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                DLDashboardNew.this.i2().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                DLDashboardNew.this.j2().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class g implements DatePickerDialog.OnDateSetListener {
        public g() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            DLDashboardNew.this.getCal().set(1, i);
            DLDashboardNew.this.getCal().set(2, i2);
            DLDashboardNew.this.getCal().set(5, i3);
            DLDashboardNew.this.v4();
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
        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                if (DLDashboardNew.this.N2().isShowing()) {
                    DLDashboardNew.this.N2().dismiss();
                }
                try {
                    DLDashboardNew.this.X1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    DLDashboardNew dLDashboardNew = DLDashboardNew.this;
                    dLDashboardNew.t4(dLDashboardNew, dLDashboardNew.S2().b(va3.a.k(), "Virtual DL Successfully Created!"));
                } catch (Exception e) {
                    e.printStackTrace();
                    DLDashboardNew dLDashboardNew2 = DLDashboardNew.this;
                    dLDashboardNew2.t4(dLDashboardNew2, dLDashboardNew2.S2().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time."));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (DLDashboardNew.this.N2().isShowing()) {
                    DLDashboardNew.this.N2().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            try {
                if (DLDashboardNew.this.N2().isShowing()) {
                    DLDashboardNew.this.N2().dismiss();
                }
                DLDashboardNew dLDashboardNew = DLDashboardNew.this;
                dLDashboardNew.t4(dLDashboardNew, dLDashboardNew.S2().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time."));
            } catch (Exception e) {
                e.printStackTrace();
                if (DLDashboardNew.this.N2().isShowing()) {
                    DLDashboardNew.this.N2().dismiss();
                }
            }
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
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
        public final void a(MyRcDeletResponse myRcDeletResponse) throws Throwable {
            try {
                DLDashboardNew.this.N2().dismiss();
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        DLDashboardNew.this.X1().e0();
                        DLDashboardNew dLDashboardNew = DLDashboardNew.this;
                        dLDashboardNew.t4(dLDashboardNew, dLDashboardNew.S2().b(va3.a.a1(), "Virtual DL Successfully deleted!"));
                        DLDashboardNew.this.E3();
                    } catch (Exception e) {
                        e.printStackTrace();
                        DLDashboardNew dLDashboardNew2 = DLDashboardNew.this;
                        dLDashboardNew2.t4(dLDashboardNew2, dLDashboardNew2.S2().b(va3.a.F0(), "Unable to delete the Virtual DL, Please try after some time."));
                    }
                } else if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                    DLDashboardNew dLDashboardNew3 = DLDashboardNew.this;
                    dLDashboardNew3.t4(dLDashboardNew3, dLDashboardNew3.S2().b(va3.a.F0(), "Unable to delete the Virtual DL, Please try after some time."));
                } else {
                    DLDashboardNew dLDashboardNew4 = DLDashboardNew.this;
                    dLDashboardNew4.t4(dLDashboardNew4, dLDashboardNew4.S2().b(va3.a.F0(), "Unable to delete the Virtual DL, Please try after some time."));
                }
            } catch (Exception e2) {
                if (DLDashboardNew.this.N2().isShowing()) {
                    DLDashboardNew.this.N2().dismiss();
                }
                e2.printStackTrace();
                DLDashboardNew dLDashboardNew5 = DLDashboardNew.this;
                dLDashboardNew5.t4(dLDashboardNew5, "Unable to delete the Virtual DL, Please try after some time.");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((MyRcDeletResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k implements TextWatcher {
        public final /* synthetic */ EditText a;

        public k(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class l implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public l(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 31) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class m implements TextWatcher {
        public final /* synthetic */ EditText a;

        public m(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class n implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public n(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 12) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class o implements View.OnClickListener {
        public final /* synthetic */ p b;
        public final /* synthetic */ Ref.ObjectRef c;

        public o(p pVar, Ref.ObjectRef objectRef) {
            this.b = pVar;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            new DatePickerDialog(DLDashboardNew.this.C2(), this.b, ((Calendar) this.c.element).get(1), ((Calendar) this.c.element).get(2), ((Calendar) this.c.element).get(5)).show();
        }
    }

    public static final class p implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ EditText b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ EditText d;

        public p(Ref.ObjectRef objectRef, EditText editText, EditText editText2, EditText editText3) {
            this.a = objectRef;
            this.b = editText;
            this.c = editText2;
            this.d = editText3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            ((Calendar) this.a.element).set(1, i);
            ((Calendar) this.a.element).set(2, i2);
            ((Calendar) this.a.element).set(5, i3);
            CharSequence charSequence = DateFormat.format("dd", ((Calendar) this.a.element).getTime());
            Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
            String str = (String) charSequence;
            CharSequence charSequence2 = DateFormat.format("MM", ((Calendar) this.a.element).getTime());
            Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) charSequence2;
            CharSequence charSequence3 = DateFormat.format("yyyy", ((Calendar) this.a.element).getTime());
            Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) charSequence3;
            try {
                this.b.setText(str);
                this.c.setText(str2);
                this.d.setText(str3);
            } catch (Exception unused) {
            }
        }
    }

    public static final class q implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public q(Function1 function) {
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

    private final boolean P1(String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '-') {
                i2++;
            }
        }
        return i2 <= 4;
    }

    public static final void R1(Dialog d2, String str, DLDashboardNew this$0, DldetobjX dlobj, String str2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dlobj, "$dlobj");
        d2.dismiss();
        try {
            this$0.X1().O0(StringsKt__StringsKt.trim((CharSequence) String.valueOf(str)).toString(), dlobj, str2, k18.a.g(StringsKt__StringsKt.trim((CharSequence) dlobj.getDlobj().getDlLicno().toString()).toString()));
            this$0.startActivity(new Intent(this$0, (Class<?>) DLVirtualRcScreen.class));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void b3(DLDashboardNew this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
        String omRtoFullname;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N2().dismiss();
        try {
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 0) {
                this$0.e2().setVisibility(8);
                this$0.v3(this$0.C2(), this$0.S2().b("no_details", "No Details are available."));
                return;
            }
            this$0.k2().setText("");
            this$0.h2().setText("");
            this$0.i2().setText("");
            this$0.j2().setText("");
            this$0.L3(dLServiceResponseModleV1.getDldetobj().get(0));
            this$0.e2().setVisibility(0);
            this$0.Z2().setText(this$0.g2().getDlobj().getDlLicno());
            this$0.K3(this$0.g2().getDlobj().getDlLicno().toString());
            BioImgObjX bioImgObj = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
            String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
            if (biPhoto == null || biPhoto.length() == 0) {
                this$0.L2().setImageResource(R.drawable.ic_no_pic);
            } else {
                ImageView imageViewL2 = this$0.L2();
                BioImgObjX bioImgObj2 = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
                imageViewL2.setImageBitmap(this$0.S1(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "bioFullName", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName() == null) {
                this$0.U2().setText("NA");
            } else {
                this$0.U2().setText(hs1.a.b(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName().toString()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "dlRtoCode", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlRtoCode() == null) {
                this$0.W2().setText("NA");
            } else {
                this$0.W2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlRtoCode());
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "dlIssuedt", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt() == null) {
                this$0.V2().setText("NA");
            } else {
                this$0.V2().setText(k18.a.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "dlNtValdtoDt", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt() == null) {
                this$0.Y2().setText("NA");
            } else {
                this$0.Y2().setText(k18.a.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt().toString()));
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "omRtoShortname", false, 2, (Object) null)) {
                String omRtoShortname = dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOmRtoShortname();
                if ((omRtoShortname != null && omRtoShortname.length() != 0) || (omRtoFullname = dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOmRtoFullname()) == null || omRtoFullname.length() == 0) {
                    this$0.X2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOmRtoShortname());
                } else {
                    this$0.X2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOmRtoFullname());
                }
            } else {
                this$0.X2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOlaName());
            }
            if (this$0.X1().P(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno()) != 0) {
                this$0.X1().N0(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName());
                return;
            }
            BioImgObjX bioImgObj3 = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
            if ((bioImgObj3 != null ? bioImgObj3.getBiPhoto() : null) == null) {
                this$0.X1().S0(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno(), dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName(), "DL", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), "");
                return;
            }
            DatabaseHelper databaseHelperX1 = this$0.X1();
            String bioDlno = dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno();
            String bioFullName = dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName();
            String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            BioImgObjX bioImgObj4 = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
            databaseHelperX1.S0(bioDlno, bioFullName, "DL", str, bioImgObj4 != null ? bioImgObj4.getBiPhoto() : null);
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.e2().setVisibility(8);
            this$0.v3(this$0.C2(), this$0.S2().b("no_details", "No Details are available."));
        }
    }

    public static final void c3(DLDashboardNew this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N2().dismiss();
        this$0.e2().setVisibility(8);
        this$0.v3(this$0.C2(), this$0.S2().b("no_details", "No Details are available."));
    }

    public static final void d3(DLDashboardNew this$0, CreateVirtualDocModle createVirtualDocModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N2().dismiss();
        if (StringsKt__StringsJVMKt.equals(createVirtualDocModle.getStatusCode(), "VTLD005", true)) {
            this$0.v3(this$0.C2(), createVirtualDocModle.getStatusDesc().toString());
            return;
        }
        if (StringsKt__StringsJVMKt.equals(createVirtualDocModle.getStatusCode(), "VTLD014", true)) {
            this$0.v3(this$0.C2(), createVirtualDocModle.getStatusDesc().toString());
        } else if (!StringsKt__StringsJVMKt.equals(createVirtualDocModle.getStatusCode(), "VTLD001", true)) {
            this$0.v3(this$0.C2(), this$0.S2().b(va3.a.K0(), "Unable to create the Virtual DL, Please try after some time"));
        } else {
            this$0.Q1(this$0.C2(), this$0.S2().b(va3.a.k(), "Virtual DL Successfully Created!"), StringsKt__StringsKt.trim((CharSequence) createVirtualDocModle.getCitizenDocInfo().getDocNumber()).toString(), this$0.g2(), String.valueOf(createVirtualDocModle.getCitizenDocInfo().getDocId()));
        }
    }

    public static final void e3(DLDashboardNew this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N2().dismiss();
        this$0.v3(this$0.C2(), this$0.S2().b(va3.a.K0(), "Unable to create the Virtual DL, Please try after some time"));
    }

    public static final void f3(DLDashboardNew this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.N2().dismiss();
            try {
                this$0.M2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName());
                this$0.T1().setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd1() + ' ' + dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd2());
                TextView textViewZ2 = this$0.z2();
                StringBuilder sb = new StringBuilder();
                sb.append(this$0.S2().b("issue_date", "Issue Date"));
                sb.append(" - ");
                k18.a aVar = k18.a;
                sb.append(aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt()));
                textViewZ2.setText(sb.toString());
                this$0.I2().setText(this$0.S2().b("label_dl_serv_valid_upto", "Valid Upto") + " - " + aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt()));
                this$0.X1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static final void g3(DLDashboardNew this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.N2().dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void h3(Context context, String message) {
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
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(S2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(S2().b("button_proceed", "Proceed"));
        textView2.setText(S2().b("button_cancel", "Cancel"));
        ((TextView) viewFindViewById).setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.i3(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                DLDashboardNew.j3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void i3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void j3(Dialog d2, DLDashboardNew this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (this$0.b2().getText().toString().length() > 0) {
            try {
                if (this$0.N2().isShowing()) {
                    this$0.N2().dismiss();
                }
                this$0.N2().show();
                String strB0 = this$0.X1().B0(StringsKt__StringsKt.trim((CharSequence) this$0.b2().getText().toString()).toString());
                if (strB0 != null && strB0.length() != 0) {
                    a55 a55VarG2 = this$0.G2();
                    Intrinsics.checkNotNull(strB0);
                    a55VarG2.g(strB0, this$0);
                }
            } catch (Exception e2) {
                if (this$0.N2().isShowing()) {
                    this$0.N2().dismiss();
                }
                e2.printStackTrace();
            }
        }
    }

    public static final void l3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void m2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q3(this$0, "Challan DL Verification", this$0.f2(), 1);
    }

    public static final void m3(Dialog d2, DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (this$0.X1().I0("DL") != null) {
            ArrayList arrayListI0 = this$0.X1().I0("DL");
            Intrinsics.checkNotNullExpressionValue(arrayListI0, "getRecentSearch(...)");
            this$0.g4(arrayListI0);
            if (this$0.P2() != null || !this$0.P2().isEmpty()) {
                int size = this$0.P2().size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        this$0.X1().x0(((RecentSearch) this$0.P2().get(i2)).getSearchNumber(), "DL");
                    } catch (Exception unused) {
                    }
                }
                this$0.P2().clear();
            }
            this$0.O2().setAdapter(null);
            this$0.e2().setVisibility(8);
        }
    }

    public static final boolean n2(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final void o2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k3(this$0.C2());
    }

    public static final void o3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final boolean p2(DLDashboardNew this$0, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 67 || this$0.i2().getText().length() != 0) {
            return false;
        }
        this$0.h2().requestFocus();
        return false;
    }

    public static final void p3(String str, DLDashboardNew this$0, EditText dobYear, EditText dobMonth, EditText dobDate, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dobYear, "$dobYear");
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (str != null) {
            this$0.e4(new ProgressDialog(this$0.C2()));
            this$0.N2().setMessage(this$0.S2().b("label_challan_please_wait", "Please wait..."));
            this$0.N2().setCancelable(false);
            this$0.N2().setCanceledOnTouchOutside(false);
            this$0.N2().show();
            String string = dobYear.getText().toString();
            int length = string.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i2, length + 1).toString().length() != 0) {
                String string2 = dobMonth.getText().toString();
                int length2 = string2.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (i3 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i3 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i3++;
                    } else {
                        z3 = true;
                    }
                }
                if (string2.subSequence(i3, length2 + 1).toString().length() != 0) {
                    String string3 = dobDate.getText().toString();
                    int length3 = string3.length() - 1;
                    int i4 = 0;
                    boolean z5 = false;
                    while (i4 <= length3) {
                        boolean z6 = Intrinsics.compare((int) string3.charAt(!z5 ? i4 : length3), 32) <= 0;
                        if (z5) {
                            if (!z6) {
                                break;
                            } else {
                                length3--;
                            }
                        } else if (z6) {
                            i4++;
                        } else {
                            z5 = true;
                        }
                    }
                    if (string3.subSequence(i4, length3 + 1).toString().length() != 0) {
                        StringBuilder sb = new StringBuilder();
                        String string4 = dobYear.getText().toString();
                        int length4 = string4.length() - 1;
                        int i5 = 0;
                        boolean z7 = false;
                        while (i5 <= length4) {
                            boolean z8 = Intrinsics.compare((int) string4.charAt(!z7 ? i5 : length4), 32) <= 0;
                            if (z7) {
                                if (!z8) {
                                    break;
                                } else {
                                    length4--;
                                }
                            } else if (z8) {
                                i5++;
                            } else {
                                z7 = true;
                            }
                        }
                        sb.append(string4.subSequence(i5, length4 + 1).toString());
                        sb.append('-');
                        String string5 = dobMonth.getText().toString();
                        int length5 = string5.length() - 1;
                        int i6 = 0;
                        boolean z9 = false;
                        while (i6 <= length5) {
                            boolean z10 = Intrinsics.compare((int) string5.charAt(!z9 ? i6 : length5), 32) <= 0;
                            if (z9) {
                                if (!z10) {
                                    break;
                                } else {
                                    length5--;
                                }
                            } else if (z10) {
                                i6++;
                            } else {
                                z9 = true;
                            }
                        }
                        sb.append(string5.subSequence(i6, length5 + 1).toString());
                        sb.append('-');
                        String string6 = dobDate.getText().toString();
                        int length6 = string6.length() - 1;
                        int i7 = 0;
                        boolean z11 = false;
                        while (i7 <= length6) {
                            boolean z12 = Intrinsics.compare((int) string6.charAt(!z11 ? i7 : length6), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    break;
                                } else {
                                    length6--;
                                }
                            } else if (z12) {
                                i7++;
                            } else {
                                z11 = true;
                            }
                        }
                        sb.append(string6.subSequence(i7, length6 + 1).toString());
                        String string7 = sb.toString();
                        d2.dismiss();
                        this$0.N2().show();
                        this$0.E2().g(str, string7.toString(), this$0);
                        return;
                    }
                }
            }
            Toast.makeText(this$0, this$0.S2().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
        }
    }

    public static final boolean q2(DLDashboardNew this$0, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 67 || this$0.j2().getText().length() != 0) {
            return false;
        }
        this$0.i2().requestFocus();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r2(com.nic.mparivahan.Dl.DLDashboardNew r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DLDashboardNew.r2(com.nic.mparivahan.Dl.DLDashboardNew, android.view.View):void");
    }

    public static final boolean r3(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final void s2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final boolean s3(EditText dobMonth, EditText dobDate, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        if (i2 != 67 || dobMonth.getText().length() != 0) {
            return false;
        }
        dobDate.requestFocus();
        return false;
    }

    public static final void t2(final DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupMenu popupMenu = new PopupMenu(this$0, this$0.K2());
        popupMenu.inflate(R.menu.dl_menu);
        popupMenu.setGravity(5);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.g61
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return DLDashboardNew.u2(this.a, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final void t3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean u2(DLDashboardNew this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                this$0.startActivity(new Intent(this$0, (Class<?>) DLVirtualRcScreen.class));
                return false;
            case R.id.menu2 /* 2131363698 */:
                try {
                    if (this$0.N2().isShowing()) {
                        this$0.N2().dismiss();
                    }
                    this$0.N2().show();
                    DldetobjX dldetails = ((DLDocument) this$0.X1().z0().get(0)).getDldetails();
                    Intrinsics.checkNotNull(dldetails);
                    this$0.I3(dldetails);
                    this$0.E2().j(StringsKt__StringsKt.trim((CharSequence) this$0.d2().getDlobj().getDlLicno()).toString(), k18.a.b(StringsKt__StringsKt.trim((CharSequence) this$0.d2().getBioObj().getBioDob()).toString()), this$0);
                    break;
                } catch (Exception unused) {
                    if (this$0.N2().isShowing()) {
                        this$0.N2().dismiss();
                    }
                }
                return false;
            case R.id.menu3 /* 2131363699 */:
                this$0.h3(this$0.C2(), this$0.S2().b(va3.a.A0(), "Are you sure, You want to delete ?"));
                return false;
            default:
                return false;
        }
    }

    public static final void u3(String str, DLDashboardNew this$0, EditText dobYear, EditText dobMonth, EditText dobDate, int i2, Dialog d2, String dl_number, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dobYear, "$dobYear");
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(dl_number, "$dl_number");
        if (str != null) {
            this$0.e4(new ProgressDialog(this$0.C2()));
            this$0.N2().setMessage("Please wait...");
            this$0.N2().setCancelable(false);
            this$0.N2().setCanceledOnTouchOutside(false);
            String string = dobYear.getText().toString();
            int length = string.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i3, length + 1).toString().length() > 0) {
                String string2 = dobMonth.getText().toString();
                int length2 = string2.length() - 1;
                int i4 = 0;
                boolean z3 = false;
                while (i4 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i4 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i4++;
                    } else {
                        z3 = true;
                    }
                }
                if (string2.subSequence(i4, length2 + 1).toString().length() > 0) {
                    String string3 = dobDate.getText().toString();
                    int length3 = string3.length() - 1;
                    int i5 = 0;
                    boolean z5 = false;
                    while (i5 <= length3) {
                        boolean z6 = Intrinsics.compare((int) string3.charAt(!z5 ? i5 : length3), 32) <= 0;
                        if (z5) {
                            if (!z6) {
                                break;
                            } else {
                                length3--;
                            }
                        } else if (z6) {
                            i5++;
                        } else {
                            z5 = true;
                        }
                    }
                    if (string3.subSequence(i5, length3 + 1).toString().length() > 0) {
                        if (i2 == 1) {
                            d2.dismiss();
                            Intent intent = new Intent(this$0, (Class<?>) ViewRcChallanActivity.class);
                            intent.putExtra("rcNo", StringsKt__StringsKt.trim((CharSequence) dl_number).toString());
                            intent.putExtra("type", "DL");
                            this$0.startActivity(intent);
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        String string4 = dobYear.getText().toString();
                        int length4 = string4.length() - 1;
                        int i6 = 0;
                        boolean z7 = false;
                        while (i6 <= length4) {
                            boolean z8 = Intrinsics.compare((int) string4.charAt(!z7 ? i6 : length4), 32) <= 0;
                            if (z7) {
                                if (!z8) {
                                    break;
                                } else {
                                    length4--;
                                }
                            } else if (z8) {
                                i6++;
                            } else {
                                z7 = true;
                            }
                        }
                        sb.append(string4.subSequence(i6, length4 + 1).toString());
                        sb.append('-');
                        String string5 = dobMonth.getText().toString();
                        int length5 = string5.length() - 1;
                        int i7 = 0;
                        boolean z9 = false;
                        while (i7 <= length5) {
                            boolean z10 = Intrinsics.compare((int) string5.charAt(!z9 ? i7 : length5), 32) <= 0;
                            if (z9) {
                                if (!z10) {
                                    break;
                                } else {
                                    length5--;
                                }
                            } else if (z10) {
                                i7++;
                            } else {
                                z9 = true;
                            }
                        }
                        sb.append(string5.subSequence(i7, length5 + 1).toString());
                        sb.append('-');
                        String string6 = dobDate.getText().toString();
                        int length6 = string6.length() - 1;
                        int i8 = 0;
                        boolean z11 = false;
                        while (i8 <= length6) {
                            boolean z12 = Intrinsics.compare((int) string6.charAt(!z11 ? i8 : length6), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    break;
                                } else {
                                    length6--;
                                }
                            } else if (z12) {
                                i8++;
                            } else {
                                z11 = true;
                            }
                        }
                        sb.append(string6.subSequence(i8, length6 + 1).toString());
                        if (!Intrinsics.areEqual(sb.toString(), StringsKt__StringsKt.trim((CharSequence) this$0.Y1()).toString())) {
                            Toast.makeText(this$0, this$0.S2().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
                            return;
                        }
                        d2.dismiss();
                        this$0.N2().show();
                        StringsKt__StringsKt.trim((CharSequence) dl_number).toString();
                        return;
                    }
                }
            }
            Toast.makeText(this$0, this$0.S2().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
        }
    }

    public static final void u4(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void v2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void x2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) RCDashBoard.class));
        this$0.finish();
    }

    public static final void y2(DLDashboardNew this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q3(this$0, "DL Verification", this$0.f2(), 0);
    }

    public final LinearLayout A2() {
        LinearLayout linearLayout = this.llSearchDL;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llSearchDL");
        return null;
    }

    public final void A3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d_number = str;
    }

    public final LinearLayout B2() {
        LinearLayout linearLayout = this.ll_create_dl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_create_dl");
        return null;
    }

    public final void B3(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final Context C2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void C3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateValeMain = str;
    }

    public final DlService D2() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final void D3(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.date_img = imageView;
    }

    public final is1 E2() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final void E3() throws Throwable {
        BioObjX bioObj;
        try {
            if (X1().z0() == null) {
                a2().setVisibility(4);
                c2().setVisibility(0);
                return;
            }
            Log.d("entered", "entered");
            a2().setVisibility(0);
            c2().setVisibility(8);
            ArrayList arrayListZ0 = X1().z0();
            DldetobjX dldetails = ((DLDocument) arrayListZ0.get(0)).getDldetails();
            String docnumber = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
            if (docnumber != null && docnumber.length() != 0) {
                Log.d("entered", "entered2");
                b2().setText(String.valueOf(((DLDocument) arrayListZ0.get(0)).getDocnumber()));
                if (((DLDocument) arrayListZ0.get(0)).getDldetails() == null) {
                    Log.d("entered", "entered3");
                    N2().show();
                    E2().i(String.valueOf(((DLDocument) arrayListZ0.get(0)).getDocnumber()), StringsKt__StringsKt.trim((CharSequence) String.valueOf(((DLDocument) arrayListZ0.get(0)).getDob())).toString(), this);
                    return;
                }
                TextView textViewM2 = M2();
                DldetobjX dldetails2 = ((DLDocument) arrayListZ0.get(0)).getDldetails();
                textViewM2.setText((dldetails2 == null || (bioObj = dldetails2.getBioObj()) == null) ? null : bioObj.getBioFullName());
                Log.d("entered", "entered4");
                Intrinsics.checkNotNull(dldetails);
                String bioPermAdd2 = dldetails.getBioObj().getBioPermAdd2();
                if (bioPermAdd2 == null || bioPermAdd2.length() == 0 || Intrinsics.areEqual(dldetails.getBioObj().getBioPermAdd2(), "null")) {
                    TextView textViewT1 = T1();
                    BioObjX bioObj2 = dldetails.getBioObj();
                    Intrinsics.checkNotNull(bioObj2);
                    textViewT1.setText(bioObj2.getBioPermAdd1());
                } else {
                    TextView textViewT12 = T1();
                    StringBuilder sb = new StringBuilder();
                    BioObjX bioObj3 = dldetails.getBioObj();
                    Intrinsics.checkNotNull(bioObj3);
                    sb.append(bioObj3.getBioPermAdd1());
                    sb.append(' ');
                    sb.append(dldetails.getBioObj().getBioPermAdd2());
                    textViewT12.setText(sb.toString());
                }
                TextView textViewZ2 = z2();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(S2().b("issue_date", "Issue Date"));
                sb2.append(' ');
                k18.a aVar = k18.a;
                sb2.append(aVar.f(dldetails.getDlobj().getDlIssuedt()));
                textViewZ2.setText(sb2.toString());
                T2().setVisibility(8);
                DlobjX dlobj = dldetails.getDlobj();
                String dlNtValdtoDt = dlobj != null ? dlobj.getDlNtValdtoDt() : null;
                if (dlNtValdtoDt != null && dlNtValdtoDt.length() != 0) {
                    TextView textViewI2 = I2();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(S2().b("label_dl_serv_valid_upto", "Valid Upto"));
                    DlobjX dlobj2 = dldetails.getDlobj();
                    sb3.append(aVar.f(String.valueOf(dlobj2 != null ? dlobj2.getDlNtValdtoDt() : null)));
                    textViewI2.setText(sb3.toString());
                    return;
                }
                TextView textViewI22 = I2();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(S2().b("label_dl_serv_valid_upto", "Valid Upto"));
                DlobjX dlobj3 = dldetails.getDlobj();
                sb4.append(aVar.f(String.valueOf(dlobj3 != null ? dlobj3.getDlTrValdtoDt() : null)));
                textViewI22.setText(sb4.toString());
            }
        } catch (Exception unused) {
        }
    }

    public final RcService F2() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final void F3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dlHolder = linearLayout;
    }

    public final a55 G2() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final void G3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dlNo = textView;
    }

    public final LinearLayout H2() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final void H3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dlRecentSearch = linearLayout;
    }

    @Override // com.zepto.d65
    public void I(String searchNumber) {
    }

    public final TextView I2() {
        TextView textView = this.ntValidUpTodate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ntValidUpTodate");
        return null;
    }

    public final void I3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dl_data = dldetobjX;
    }

    public final boolean J2(String str, EditText editText, View mView) {
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(mView, "mView");
        int[] iArr = new int[256];
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            iArr[cCharAt] = iArr[cCharAt] + 1;
        }
        char[] cArr = new char[str.length()];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = str.charAt(i3);
            if (i3 >= 0) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (str.charAt(i3) == cArr[i4]) {
                        i5++;
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
                if (i5 > 12) {
                    editText.requestFocus();
                    v3(C2(), S2().b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"));
                    return true;
                }
            }
        }
        return false;
    }

    public final void J3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dl_layout = linearLayout;
    }

    public final ImageView K2() {
        ImageView imageView = this.option_menu;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("option_menu");
        return null;
    }

    public final void K3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dl_number = str;
    }

    public final ImageView L2() {
        ImageView imageView = this.owner_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("owner_image");
        return null;
    }

    public final void L3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlobjx = dldetobjX;
    }

    public final TextView M2() {
        TextView textView = this.owner_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("owner_name");
        return null;
    }

    public final void M3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dobDateMain = editText;
    }

    public final ProgressDialog N2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void N3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dobMonthMain = editText;
    }

    public final RecyclerView O2() {
        RecyclerView recyclerView = this.recDlRecycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recDlRecycler");
        return null;
    }

    public final void O3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dobYearMain = editText;
    }

    public final ArrayList P2() {
        ArrayList arrayList = this.recentSearchList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recentSearchList");
        return null;
    }

    public final void P3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.etSearchDL = editText;
    }

    public final void Q1(Context context, String message, final String doc_number, final DldetobjX dlobj, final String doc_id) {
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
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
        ((TextView) viewFindViewById3).setText(S2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(S2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.R1(dialog, doc_number, this, dlobj, doc_id, view);
            }
        });
        dialog.show();
    }

    public final LinearLayout Q2() {
        LinearLayout linearLayout = this.redirect_DashBoard;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirect_DashBoard");
        return null;
    }

    public final void Q3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.issue_date = textView;
    }

    public final LinearLayout R2() {
        LinearLayout linearLayout = this.redirect_Rcdashboard;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirect_Rcdashboard");
        return null;
    }

    public final void R3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llCreateDl = linearLayout;
    }

    public final Bitmap S1(String encodedImage) {
        try {
            byte[] bArrDecode = Base64.decode(encodedImage, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final wa3 S2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void S3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llSearchDL = linearLayout;
    }

    public final TextView T1() {
        TextView textView = this.address;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("address");
        return null;
    }

    public final TextView T2() {
        TextView textView = this.trValidUpto;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trValidUpto");
        return null;
    }

    public final void T3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_create_dl = linearLayout;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final Calendar getCal() {
        return this.cal;
    }

    public final TextView U2() {
        TextView textView = this.txtDlHolderName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtDlHolderName");
        return null;
    }

    public final void U3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final TextView V1() {
        TextView textView = this.clrText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clrText");
        return null;
    }

    public final TextView V2() {
        TextView textView = this.txtIssueDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtIssueDate");
        return null;
    }

    public final void V3(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final TextView W1() {
        TextView textView = this.createDl;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createDl");
        return null;
    }

    public final TextView W2() {
        TextView textView = this.txtLicAuthCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLicAuthCode");
        return null;
    }

    public final void W3(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final DatabaseHelper X1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final TextView X2() {
        TextView textView = this.txtLicAuthority;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLicAuthority");
        return null;
    }

    public final void X3(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final String Y1() {
        String str = this.dateValeMain;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateValeMain");
        return null;
    }

    public final TextView Y2() {
        TextView textView = this.txtLicValidityCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLicValidityCode");
        return null;
    }

    public final void Y3(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final ImageView Z1() {
        ImageView imageView = this.date_img;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("date_img");
        return null;
    }

    public final TextView Z2() {
        TextView textView = this.txt_dl_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_dl_number");
        return null;
    }

    public final void Z3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final LinearLayout a2() {
        LinearLayout linearLayout = this.dlHolder;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlHolder");
        return null;
    }

    public final LinearLayout a3() {
        LinearLayout linearLayout = this.viewChallanLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewChallanLl");
        return null;
    }

    public final void a4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.ntValidUpTodate = textView;
    }

    public final TextView b2() {
        TextView textView = this.dlNo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlNo");
        return null;
    }

    public final void b4(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.option_menu = imageView;
    }

    public final LinearLayout c2() {
        LinearLayout linearLayout = this.dlRecentSearch;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlRecentSearch");
        return null;
    }

    public final void c4(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.owner_image = imageView;
    }

    public final DldetobjX d2() {
        DldetobjX dldetobjX = this.dl_data;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_data");
        return null;
    }

    public final void d4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.owner_name = textView;
    }

    public final LinearLayout e2() {
        LinearLayout linearLayout = this.dl_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_layout");
        return null;
    }

    public final void e4(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final String f2() {
        String str = this.dl_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_number");
        return null;
    }

    public final void f4(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recDlRecycler = recyclerView;
    }

    public final DldetobjX g2() {
        DldetobjX dldetobjX = this.dlobjx;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlobjx");
        return null;
    }

    public final void g4(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.recentSearchList = arrayList;
    }

    public final EditText h2() {
        EditText editText = this.dobDateMain;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobDateMain");
        return null;
    }

    public final void h4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.redirect_DashBoard = linearLayout;
    }

    public final EditText i2() {
        EditText editText = this.dobMonthMain;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobMonthMain");
        return null;
    }

    public final void i4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.redirect_Rcdashboard = linearLayout;
    }

    public final EditText j2() {
        EditText editText = this.dobYearMain;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobYearMain");
        return null;
    }

    public final void j4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.trValidUpto = textView;
    }

    public final EditText k2() {
        EditText editText = this.etSearchDL;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("etSearchDL");
        return null;
    }

    public final void k3(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_history);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View viewFindViewById2 = dialog.findViewById(R.id.ok_dlt);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.tv_msg);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((MyTextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.l3(dialog, view);
            }
        });
        ((MyTextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.m3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void k4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtDlHolderName = textView;
    }

    public final void l2() throws Throwable {
        View viewFindViewById = findViewById(R.id.txt_dl_holder_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        k4((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.txt_lic_auth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        m4((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.txt_vehicle_class);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        p4((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.txt_lic_validity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        o4((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.txt_lic_authority);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        n4((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.ll_create_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        R3((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.et_search_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        P3((EditText) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.ll_search_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        S3((LinearLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.txt_dl_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        q4((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.txt_issue_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        l4((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.owner_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        c4((ImageView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.date_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        D3((ImageView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.dl_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        J3((LinearLayout) viewFindViewById13);
        e2().setVisibility(8);
        View viewFindViewById14 = findViewById(R.id.dobDateMain);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        M3((EditText) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.dobMonthMain);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        N3((EditText) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.dobYearMain);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        O3((EditText) viewFindViewById16);
        View viewFindViewById17 = findViewById(R.id.dl_rec_search);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        H3((LinearLayout) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.txt_clear_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        y3((TextView) viewFindViewById18);
        View viewFindViewById19 = findViewById(R.id.rec_dl_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        f4((RecyclerView) viewFindViewById19);
        View viewFindViewById20 = findViewById(R.id.ll_create_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        T3((LinearLayout) viewFindViewById20);
        View viewFindViewById21 = findViewById(R.id.viewChallanLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        s4((LinearLayout) viewFindViewById21);
        View viewFindViewById22 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        Z3((LinearLayout) viewFindViewById22);
        View viewFindViewById23 = findViewById(R.id.redirect_DashBoard);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        h4((LinearLayout) viewFindViewById23);
        H2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.v2(this.a, view);
            }
        });
        Q2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.w2(this.a, view);
            }
        });
        View viewFindViewById24 = findViewById(R.id.redirect_Rcdashboard);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(...)");
        i4((LinearLayout) viewFindViewById24);
        R2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.x2(this.a, view);
            }
        });
        B2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.y2(this.a, view);
            }
        });
        a3().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.m2(this.a, view);
            }
        });
        h2().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.w51
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return DLDashboardNew.n2(textView, i2, keyEvent);
            }
        });
        V1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.o2(this.a, view);
            }
        });
        h2().addTextChangedListener(new e());
        i2().addTextChangedListener(new f());
        h2().addTextChangedListener(new a());
        i2().setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.y51
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return DLDashboardNew.p2(this.a, view, i2, keyEvent);
            }
        });
        i2().addTextChangedListener(new b());
        j2().setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.z51
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return DLDashboardNew.q2(this.a, view, i2, keyEvent);
            }
        });
        j2().addTextChangedListener(new c());
        g gVar = new g();
        ImageView imageViewZ1 = Z1();
        Intrinsics.checkNotNull(imageViewZ1);
        imageViewZ1.setOnClickListener(new d(gVar));
        A2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.r2(this.a, view);
            }
        });
        View viewFindViewById25 = findViewById(R.id.ntValidUpTodate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(...)");
        a4((TextView) viewFindViewById25);
        View viewFindViewById26 = findViewById(R.id.trValidUpto);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById26, "findViewById(...)");
        j4((TextView) viewFindViewById26);
        View viewFindViewById27 = findViewById(R.id.dlNo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById27, "findViewById(...)");
        G3((TextView) viewFindViewById27);
        View viewFindViewById28 = findViewById(R.id.owner_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById28, "findViewById(...)");
        d4((TextView) viewFindViewById28);
        View viewFindViewById29 = findViewById(R.id.address);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById29, "findViewById(...)");
        x3((TextView) viewFindViewById29);
        View viewFindViewById30 = findViewById(R.id.issue_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById30, "findViewById(...)");
        Q3((TextView) viewFindViewById30);
        View viewFindViewById31 = findViewById(R.id.dlHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById31, "findViewById(...)");
        F3((LinearLayout) viewFindViewById31);
        View viewFindViewById32 = findViewById(R.id.txt_create_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById32, "findViewById(...)");
        z3((TextView) viewFindViewById32);
        View viewFindViewById33 = findViewById(R.id.option_menu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById33, "findViewById(...)");
        b4((ImageView) viewFindViewById33);
        W1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.s2(this.a, view);
            }
        });
        try {
            E3();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        K2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.t2(this.a, view);
            }
        });
    }

    public final void l4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtIssueDate = textView;
    }

    public final void m4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLicAuthCode = textView;
    }

    public final void n3(Context context, final String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.verify_card);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById2 = dialog.findViewById(R.id.cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById3 = dialog.findViewById(R.id.applicant_year);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.applicant_month);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.applicant_date);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.head);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById7 = dialog.findViewById(R.id.verify_text_view);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById8 = dialog.findViewById(R.id.cancle_txt);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(S2().b(va3.a.X0(), "Verify your DL"));
        ((TextView) viewFindViewById7).setText(S2().b("vahan_btn_verify", "Verify"));
        ((TextView) viewFindViewById8).setText(S2().b("button_cancel", "Cancel"));
        View viewFindViewById9 = dialog.findViewById(R.id.dob_badge);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(S2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.o3(dialog, view);
            }
        });
        ((CardView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.p3(message, this, editText, editText2, editText3, dialog, view);
            }
        });
        dialog.show();
    }

    public final void n4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLicAuthority = textView;
    }

    public final void o4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLicValidityCode = textView;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        k9 k9VarC = k9.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(k9VarC, "inflate(...)");
        this.binding = k9VarC;
        k9 k9Var = null;
        if (k9VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k9VarC = null;
        }
        setContentView(k9VarC.b());
        ta3.a aVar = ta3.a;
        k9 k9Var2 = this.binding;
        if (k9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            k9Var = k9Var2;
        }
        aVar.y0(this, k9Var);
        U3(this);
        X3(RcService.INSTANCE.a(this));
        V3(DlService.INSTANCE.a(this));
        r4(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(C2());
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        B3(databaseHelperD0);
        e4(new ProgressDialog(C2()));
        N2().setMessage(S2().b("label_challan_please_wait", "Please wait..."));
        N2().setCancelable(false);
        N2().setCanceledOnTouchOutside(false);
        W3((is1) new z(this, new js1(new jp1(D2()))).a(is1.class));
        Y3((a55) new z(this, new b55(new s45(F2()))).a(a55.class));
        l2();
        E2().v().g(this, new mf4() { // from class: com.zepto.r51
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                DLDashboardNew.b3(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        E2().w().g(this, new mf4() { // from class: com.zepto.c61
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLDashboardNew.c3(this.a, (String) obj);
            }
        });
        E2().B().g(this, new mf4() { // from class: com.zepto.n61
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLDashboardNew.d3(this.a, (CreateVirtualDocModle) obj);
            }
        });
        E2().C().g(this, new mf4() { // from class: com.zepto.q61
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLDashboardNew.e3(this.a, (String) obj);
            }
        });
        E2().n().g(this, new q(new h()));
        E2().o().g(this, new q(new i()));
        G2().x().g(this, new q(new j()));
        E2().r().g(this, new mf4() { // from class: com.zepto.r61
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                DLDashboardNew.f3(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        E2().s().g(this, new mf4() { // from class: com.zepto.s61
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLDashboardNew.g3(this.a, (String) obj);
            }
        });
    }

    public final void p4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleClass = textView;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.util.Calendar] */
    public final void q3(Context context, final String message, final String dl_number, final int forChallan) {
        Intrinsics.checkNotNullParameter(dl_number, "dl_number");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.verify_card);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById3 = dialog.findViewById(R.id.applicant_year);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.applicant_month);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.applicant_date);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.head);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById7 = dialog.findViewById(R.id.verify_text_view);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById8 = dialog.findViewById(R.id.cancle_txt);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(S2().b(va3.a.X0(), "Verify your DL"));
        ((TextView) viewFindViewById7).setText(S2().b("vahan_btn_verify", "Verify"));
        ((TextView) viewFindViewById8).setText(S2().b("button_cancel", "Cancel"));
        View viewFindViewById9 = dialog.findViewById(R.id.dob_badge);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(S2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.h61
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return DLDashboardNew.r3(textView, i2, keyEvent);
            }
        });
        editText3.addTextChangedListener(new k(editText2));
        editText3.addTextChangedListener(new l(editText3, editText2));
        editText2.addTextChangedListener(new m(editText));
        editText2.setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.i61
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return DLDashboardNew.s3(editText2, editText3, view, i2, keyEvent);
            }
        });
        editText2.addTextChangedListener(new n(editText2, editText));
        View viewFindViewById10 = dialog.findViewById(R.id.dob_cal);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.ImageView");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Calendar.getInstance();
        ((ImageView) viewFindViewById10).setOnClickListener(new o(new p(objectRef, editText3, editText2, editText), objectRef));
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.t3(dialog, view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.u3(message, this, editText, editText2, editText3, forChallan, dialog, dl_number, view);
            }
        });
        dialog.show();
    }

    public final void q4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_dl_number = textView;
    }

    public final void r4(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final void s4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.viewChallanLl = linearLayout;
    }

    public final void t4(Context context, String message) {
        Intrinsics.checkNotNull(context);
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
        ((TextView) viewFindViewById3).setText(S2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(S2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.u4(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.d65
    public void u(String searchNumber) {
        if (searchNumber != null) {
            n3(C2(), searchNumber);
        }
    }

    public final void v3(Context context, String message) {
        Intrinsics.checkNotNull(context);
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
        ((TextView) viewFindViewById3).setText(S2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(S2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDashboardNew.w3(dialog, view);
            }
        });
        dialog.show();
    }

    public final void v4() {
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence4 = DateFormat.format("dd", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence4, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence4;
        CharSequence charSequence5 = DateFormat.format("MM", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence5, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence5;
        CharSequence charSequence6 = DateFormat.format("yyyy", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence6, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence6;
        try {
            h2().setText(str);
            i2().setText(str2);
            j2().setText(str3);
        } catch (Exception unused) {
        }
    }

    public final void x3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.address = textView;
    }

    public final void y3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.clrText = textView;
    }

    public final TextView z2() {
        TextView textView = this.issue_date;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("issue_date");
        return null;
    }

    public final void z3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.createDl = textView;
    }
}
