package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

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
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import com.zepto.d86;
import com.zepto.il;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.tb;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bò\u0001\u0010ó\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u000109\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R \u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R \u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R \u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R \u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010;R \u0010I\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010G\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010;R \u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010G\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010;R&\u0010P\u001a\u0012\u0012\u0004\u0012\u00020L0\u0004j\b\u0012\u0004\u0012\u00020L`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR&\u0010S\u001a\u0012\u0012\u0004\u0012\u00020Q0\u0004j\b\u0012\u0004\u0012\u00020Q`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R\"\u0010h\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010U\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010U\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010OR\u0018\u0010\u008f\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010UR\u0018\u0010\u0091\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010UR\u0018\u0010\u0093\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010UR\u0018\u0010\u0095\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010UR\u0018\u0010\u0097\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010UR\u0018\u0010\u0099\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010UR\u0018\u0010\u009b\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010UR\u0018\u0010\u009d\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010UR\u0018\u0010\u009f\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010UR\u0018\u0010¡\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010UR\u0019\u0010£\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008e\u0001R\u0019\u0010¥\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u008e\u0001R\u0019\u0010§\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u008e\u0001R\u0019\u0010©\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u008e\u0001R\u0019\u0010«\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u008e\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010UR\u0018\u0010¯\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010UR\u0018\u0010±\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010UR\u0018\u0010³\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010UR\u0018\u0010µ\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010UR\u0018\u0010·\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010UR\u0018\u0010¹\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010UR\u0019\u0010»\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u008e\u0001R\u0018\u0010½\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010UR\u0018\u0010¿\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010UR\u0018\u0010Á\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010UR\u0019\u0010Ä\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010@R\u0019\u0010Æ\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÅ\u0001\u0010@R\u001f\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030Ç\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÈ\u0001\u0010OR\u0018\u0010Ë\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010UR\u0018\u0010Í\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÌ\u0001\u0010UR\u0018\u0010Ï\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÎ\u0001\u0010UR\u0018\u0010Ñ\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÐ\u0001\u0010UR\u0018\u0010Ó\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÒ\u0001\u0010UR\u0018\u0010Õ\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÔ\u0001\u0010UR\u0018\u0010×\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÖ\u0001\u0010UR\u0018\u0010Ù\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bØ\u0001\u0010UR\u0018\u0010Û\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÚ\u0001\u0010UR\u0018\u0010Ý\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÜ\u0001\u0010UR\u0018\u0010ß\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÞ\u0001\u0010UR\u0018\u0010á\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bà\u0001\u0010UR\u0018\u0010ã\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bâ\u0001\u0010UR\u0018\u0010å\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bä\u0001\u0010UR\u0018\u0010ç\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bæ\u0001\u0010UR\u0018\u0010é\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bè\u0001\u0010UR\u0018\u0010ë\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bê\u0001\u0010UR\u0018\u0010í\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bì\u0001\u0010UR\u0018\u0010ï\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bî\u0001\u0010UR\u0018\u0010ñ\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bð\u0001\u0010U¨\u0006ô\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/editlearnerlicence/Activity/AddressDetailEditScreen;", "Lcom/zepto/pq;", "", "g2", "Ljava/util/ArrayList;", "Lcom/zepto/il;", "addressDetails", "O2", "q2", "x2", "Y1", "Z1", "", "message", "K2", "fromWhere", "H2", "I2", "a2", "b2", "c2", "d2", "villaOrTown", "f2", "m2", "J2", "M2", "", "w2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/tb;", "C", "Lcom/zepto/tb;", "binding", "Lcom/zepto/xh0;", "D", "Lcom/zepto/xh0;", "viewModel", "Lcom/zepto/kl0;", "E", "Lcom/zepto/kl0;", "getMClDlViewModel", "()Lcom/zepto/kl0;", "P2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "F", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "h2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "Q2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "", "Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "G", "Ljava/util/List;", "mStateList", "Lcom/nic/mparivahan/dlservices/data/model/DistrictsMasterItem;", "H", "mCurrDistList", "I", "mPermDistList", "Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "J", "mCurrTalukaList", "K", "mPermTalukaList", "Lcom/nic/mparivahan/dlservices/data/model/VillageOrTownMasterItem;", "L", "mCurrVillageOrTownList", "M", "mPermVillageOrTownList", "Lcom/zepto/w01;", "Lkotlin/collections/ArrayList;", "N", "Ljava/util/ArrayList;", "covDetails", "Lcom/zepto/qv5;", "O", "selectedCovList", "P", "Ljava/lang/String;", "isCurrentOrPermanentAddress", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "Q", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "n2", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "R", "l2", "setPermanentAdd", "permanentAdd", "S", "e2", "()Ljava/lang/String;", "N2", "(Ljava/lang/String;)V", "currStateCd", "T", "k2", "T2", "perStateCd", "Landroid/content/Context;", "U", "Landroid/content/Context;", "i2", "()Landroid/content/Context;", "R2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "V", "Landroid/app/ProgressDialog;", "j2", "()Landroid/app/ProgressDialog;", "S2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "p2", "()Lcom/zepto/wa3;", "V2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "X", "Lcom/zepto/wl5;", "o2", "()Lcom/zepto/wl5;", "U2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Y", "Z", "apiPreStateCd", "a0", "apiPreDistrictCd", "b0", "apiPreSubDivisionCd", "c0", "apiPreTownVill", "d0", "apiCityCode", "e0", "apiPermStateCd", "f0", "apiPermDistrictCd", "g0", "apiPermSubDivisionCd", "h0", "apiPermTownVill", "i0", "apiPermCityCode", "j0", "isTalukaFromApiCall", "k0", "isForCurrentTalukaApiCall", "l0", "isCityFromApiCall", "m0", "isForCurrentCityApiCall", "n0", "willingToDonate", "o0", "licenseFromState", "p0", "licenceFromRTO", "q0", "jurisdiction", "r0", "licenceFromRTOCode", "s0", "applicationNo", "t0", "reference", "u0", "applDate", "v0", "allowNewAddr", "w0", "applCatg", "x0", "bioId", "y0", "allClassOfVehicles", "", "z0", "presVillTown", "A0", "premVillTown", "Lcom/zepto/t93;", "B0", "llRefDetails", "C0", "applicantFName", "D0", "applicantMName", "E0", "applicantLName", "F0", "fullName", "G0", "relationship", "H0", "relationFName", "I0", "relationMName", "J0", "relationLName", "K0", "gender", "L0", "dob", "M0", "placeOfBirth", "N0", "countryCd", "O0", "eduQualificationCd", "P0", "bloodGroupCd", "Q0", "phoneNo", "R0", "emailId", "S0", "applicantMobileNo", "T0", "emergencyContactNo", "U0", "idMark1", "V0", "idMark2", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAddressDetailEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressDetailEditScreen.kt\ncom/nic/mparivahan/LLServices/editlearnerlicence/Activity/AddressDetailEditScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1222:1\n1855#2,2:1223\n1855#2,2:1225\n1855#2,2:1227\n1855#2,2:1229\n1855#2,2:1231\n1855#2,2:1233\n1855#2,2:1235\n*S KotlinDebug\n*F\n+ 1 AddressDetailEditScreen.kt\ncom/nic/mparivahan/LLServices/editlearnerlicence/Activity/AddressDetailEditScreen\n*L\n789#1:1223,2\n846#1:1225,2\n848#1:1227,2\n908#1:1229,2\n912#1:1231,2\n1065#1:1233,2\n1067#1:1235,2\n*E\n"})
public final class AddressDetailEditScreen extends pq {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public int premVillTown;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public tb binding;

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

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String currStateCd;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String perStateCd;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public boolean isTalukaFromApiCall;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public boolean isForCurrentTalukaApiCall;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public boolean isCityFromApiCall;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public boolean isForCurrentCityApiCall;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public boolean willingToDonate;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public boolean allowNewAddr;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public int presVillTown;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList covDetails = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ArrayList selectedCovList = new ArrayList();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String isCurrentOrPermanentAddress = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ArrayList addressDetails = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String apiPreStateCd = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String apiPreDistrictCd = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String apiPreSubDivisionCd = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String apiPreTownVill = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String apiCityCode = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String apiPermStateCd = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String apiPermDistrictCd = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String apiPermSubDivisionCd = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String apiPermTownVill = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String apiPermCityCode = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String licenseFromState = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String licenceFromRTO = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String jurisdiction = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String licenceFromRTOCode = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String applicationNo = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String reference = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String applDate = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String applCatg = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String bioId = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String allClassOfVehicles = "";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public ArrayList llRefDetails = new ArrayList();

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public String applicantFName = "";

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public String applicantMName = "";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String applicantLName = "";

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public String fullName = "";

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public String relationship = "";

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public String relationFName = "";

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public String relationMName = "";

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public String relationLName = "";

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public String gender = "";

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public String placeOfBirth = "";

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public String countryCd = "";

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public String eduQualificationCd = "";

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public String bloodGroupCd = "";

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public String phoneNo = "";

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public String emailId = "";

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public String applicantMobileNo = "";

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public String emergencyContactNo = "";

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public String idMark1 = "";

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public String idMark2 = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(StateResponse stateResponse) {
            try {
                AddressDetailEditScreen.this.j2().dismiss();
                if (Intrinsics.areEqual(stateResponse.getStatusCode(), "00")) {
                    if (stateResponse.getStateMaster() != null && (!r0.isEmpty())) {
                        AddressDetailEditScreen.this.mStateList = stateResponse.getStateMaster();
                    }
                } else {
                    AddressDetailEditScreen addressDetailEditScreen = AddressDetailEditScreen.this;
                    addressDetailEditScreen.K2(addressDetailEditScreen.p2().b("no_details", AddressDetailEditScreen.this.getString(R.string.no_Details_are_avail)));
                }
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen2 = AddressDetailEditScreen.this;
                addressDetailEditScreen2.K2(addressDetailEditScreen2.p2().b("service_is_not_present", AddressDetailEditScreen.this.getString(R.string.unable_to_get_details)));
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
                AddressDetailEditScreen.this.j2().dismiss();
                if (Intrinsics.areEqual(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    AddressDetailEditScreen.this.mCurrDistList = distResponse.getDistMaster();
                    AddressDetailEditScreen.this.mPermDistList = distResponse.getDistMaster();
                } else {
                    AddressDetailEditScreen addressDetailEditScreen = AddressDetailEditScreen.this;
                    addressDetailEditScreen.K2(addressDetailEditScreen.p2().b("no_details", AddressDetailEditScreen.this.getString(R.string.unable_to_get_details)));
                }
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen2 = AddressDetailEditScreen.this;
                addressDetailEditScreen2.K2(addressDetailEditScreen2.p2().b("service_is_not_present", AddressDetailEditScreen.this.getString(R.string.unable_to_get_details)));
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
                AddressDetailEditScreen.this.j2().dismiss();
                if (!Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "01")) {
                        AddressDetailEditScreen addressDetailEditScreen = AddressDetailEditScreen.this;
                        addressDetailEditScreen.K2(addressDetailEditScreen.p2().b("no_taluka_found", ""));
                    } else {
                        AddressDetailEditScreen addressDetailEditScreen2 = AddressDetailEditScreen.this;
                        addressDetailEditScreen2.K2(addressDetailEditScreen2.p2().b("no_details", AddressDetailEditScreen.this.getString(R.string.unable_to_get_details)));
                    }
                } else if (AddressDetailEditScreen.this.isTalukaFromApiCall) {
                    if (AddressDetailEditScreen.this.isForCurrentTalukaApiCall) {
                        AddressDetailEditScreen.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                    } else {
                        AddressDetailEditScreen.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                    }
                } else if (Intrinsics.areEqual(AddressDetailEditScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    AddressDetailEditScreen.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                } else {
                    AddressDetailEditScreen.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen3 = AddressDetailEditScreen.this;
                addressDetailEditScreen3.K2(addressDetailEditScreen3.p2().b("service_is_not_present", AddressDetailEditScreen.this.getString(R.string.unable_to_get_details)));
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
                AddressDetailEditScreen.this.j2().dismiss();
                if (!Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    AddressDetailEditScreen addressDetailEditScreen = AddressDetailEditScreen.this;
                    addressDetailEditScreen.K2(addressDetailEditScreen.p2().b("no_vill_found", ""));
                } else {
                    if (AddressDetailEditScreen.this.isCityFromApiCall) {
                        if (AddressDetailEditScreen.this.isForCurrentCityApiCall) {
                            AddressDetailEditScreen.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                            return;
                        } else {
                            AddressDetailEditScreen.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                            return;
                        }
                    }
                    if (Intrinsics.areEqual(AddressDetailEditScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                        AddressDetailEditScreen.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                    } else {
                        AddressDetailEditScreen.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                    }
                }
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen2 = AddressDetailEditScreen.this;
                addressDetailEditScreen2.K2(addressDetailEditScreen2.p2().b("service_is_not_present", AddressDetailEditScreen.this.getString(R.string.unable_to_get_details)));
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
            AddressDetailEditScreen.this.isTalukaFromApiCall = false;
            String str2 = AddressDetailEditScreen.this.isCurrentOrPermanentAddress;
            tb tbVar = null;
            if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                List list = AddressDetailEditScreen.this.mCurrDistList;
                String distCode = (list == null || (districtsMasterItem2 = (DistrictsMasterItem) list.get(i)) == null) ? null : districtsMasterItem2.getDistCode();
                tb tbVar2 = AddressDetailEditScreen.this.binding;
                if (tbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar2 = null;
                }
                tbVar2.y.setText(str);
                tb tbVar3 = AddressDetailEditScreen.this.binding;
                if (tbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar3 = null;
                }
                tbVar3.y.setContentDescription(distCode);
                AddressDetailEditScreen.this.getPresentAdd().setDistrict(distCode);
                AddressDetailEditScreen.this.a2();
                if (distCode != null) {
                    AddressDetailEditScreen addressDetailEditScreen = AddressDetailEditScreen.this;
                    addressDetailEditScreen.j2().dismiss();
                    xh0 xh0Var = addressDetailEditScreen.viewModel;
                    if (xh0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        xh0Var = null;
                    }
                    tb tbVar4 = addressDetailEditScreen.binding;
                    if (tbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        tbVar = tbVar4;
                    }
                    xh0Var.n(tbVar.z.getContentDescription().toString(), distCode);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                List list2 = AddressDetailEditScreen.this.mPermDistList;
                String distCode2 = (list2 == null || (districtsMasterItem = (DistrictsMasterItem) list2.get(i)) == null) ? null : districtsMasterItem.getDistCode();
                tb tbVar5 = AddressDetailEditScreen.this.binding;
                if (tbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar5 = null;
                }
                tbVar5.F.setText(str);
                tb tbVar6 = AddressDetailEditScreen.this.binding;
                if (tbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar6 = null;
                }
                tbVar6.F.setContentDescription(distCode2);
                AddressDetailEditScreen.this.getPermanentAdd().setDistrict(distCode2);
                AddressDetailEditScreen.this.c2();
                if (distCode2 != null) {
                    AddressDetailEditScreen addressDetailEditScreen2 = AddressDetailEditScreen.this;
                    addressDetailEditScreen2.j2().dismiss();
                    xh0 xh0Var2 = addressDetailEditScreen2.viewModel;
                    if (xh0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        xh0Var2 = null;
                    }
                    tb tbVar7 = addressDetailEditScreen2.binding;
                    if (tbVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        tbVar = tbVar7;
                    }
                    xh0Var2.n(tbVar.G.getContentDescription().toString(), distCode2);
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
            AddressDetailEditScreen.this.isCityFromApiCall = false;
            tb tbVar = null;
            if (Intrinsics.areEqual(AddressDetailEditScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = AddressDetailEditScreen.this.mCurrTalukaList;
                String subDistcode = (list == null || (talukaMasterItem2 = (TalukaMasterItem) list.get(i)) == null) ? null : talukaMasterItem2.getSubDistcode();
                tb tbVar2 = AddressDetailEditScreen.this.binding;
                if (tbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar2 = null;
                }
                tbVar2.x.setText(str);
                tb tbVar3 = AddressDetailEditScreen.this.binding;
                if (tbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar3 = null;
                }
                tbVar3.x.setContentDescription(subDistcode);
                AddressDetailEditScreen.this.getPresentAdd().setSubDistrict(subDistcode);
                AddressDetailEditScreen.this.f2((String) this.b.element);
                tb tbVar4 = AddressDetailEditScreen.this.binding;
                if (tbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar4 = null;
                }
                EditText editText = tbVar4.N;
                StringBuilder sb = new StringBuilder();
                tb tbVar5 = AddressDetailEditScreen.this.binding;
                if (tbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar5 = null;
                }
                sb.append((Object) tbVar5.x.getText());
                sb.append(", ");
                tb tbVar6 = AddressDetailEditScreen.this.binding;
                if (tbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar6 = null;
                }
                sb.append((Object) tbVar6.y.getText());
                sb.append(", ");
                tb tbVar7 = AddressDetailEditScreen.this.binding;
                if (tbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    tbVar = tbVar7;
                }
                sb.append((Object) tbVar.z.getText());
                editText.setText(sb.toString());
                return;
            }
            List list2 = AddressDetailEditScreen.this.mPermTalukaList;
            String subDistcode2 = (list2 == null || (talukaMasterItem = (TalukaMasterItem) list2.get(i)) == null) ? null : talukaMasterItem.getSubDistcode();
            tb tbVar8 = AddressDetailEditScreen.this.binding;
            if (tbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar8 = null;
            }
            tbVar8.E.setText(str);
            tb tbVar9 = AddressDetailEditScreen.this.binding;
            if (tbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar9 = null;
            }
            tbVar9.E.setContentDescription(subDistcode2);
            AddressDetailEditScreen.this.getPermanentAdd().setSubDistrict(subDistcode2);
            AddressDetailEditScreen.this.m2((String) this.b.element);
            tb tbVar10 = AddressDetailEditScreen.this.binding;
            if (tbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar10 = null;
            }
            EditText editText2 = tbVar10.B;
            StringBuilder sb2 = new StringBuilder();
            tb tbVar11 = AddressDetailEditScreen.this.binding;
            if (tbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar11 = null;
            }
            sb2.append((Object) tbVar11.E.getText());
            sb2.append(", ");
            tb tbVar12 = AddressDetailEditScreen.this.binding;
            if (tbVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar12 = null;
            }
            sb2.append((Object) tbVar12.F.getText());
            sb2.append(", ");
            tb tbVar13 = AddressDetailEditScreen.this.binding;
            if (tbVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar = tbVar13;
            }
            sb2.append((Object) tbVar.G.getText());
            editText2.setText(sb2.toString());
        }
    }

    public static final class g implements d86.b {
        public g() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            tb tbVar = null;
            if (Intrinsics.areEqual(AddressDetailEditScreen.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = AddressDetailEditScreen.this.mCurrVillageOrTownList;
                String villageCode = (list == null || (villageOrTownMasterItem2 = (VillageOrTownMasterItem) list.get(i)) == null) ? null : villageOrTownMasterItem2.getVillageCode();
                tb tbVar2 = AddressDetailEditScreen.this.binding;
                if (tbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar2 = null;
                }
                tbVar2.M.setText(str);
                tb tbVar3 = AddressDetailEditScreen.this.binding;
                if (tbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    tbVar = tbVar3;
                }
                tbVar.M.setContentDescription(villageCode);
                AddressDetailEditScreen.this.getPresentAdd().setVillageOrTown(villageCode);
                return;
            }
            List list2 = AddressDetailEditScreen.this.mPermVillageOrTownList;
            String villageCode2 = (list2 == null || (villageOrTownMasterItem = (VillageOrTownMasterItem) list2.get(i)) == null) ? null : villageOrTownMasterItem.getVillageCode();
            tb tbVar4 = AddressDetailEditScreen.this.binding;
            if (tbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar4 = null;
            }
            tbVar4.H.setText(str);
            tb tbVar5 = AddressDetailEditScreen.this.binding;
            if (tbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar = tbVar5;
            }
            tbVar.H.setContentDescription(villageCode2);
            AddressDetailEditScreen.this.getPermanentAdd().setVillageOrTown(villageCode2);
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

    public static final void A2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.J2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.i2(), this$0.p2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void B2(AddressDetailEditScreen this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mPermTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        switch (i) {
            case R.id.dl_permanent_town_rb /* 2131362708 */:
                this$0.premVillTown = 0;
                this$0.m2("U");
                break;
            case R.id.dl_permanent_village_rb /* 2131362709 */:
                this$0.premVillTown = 1;
                this$0.m2("R");
                break;
        }
    }

    public static final void C2(AddressDetailEditScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tb tbVar = null;
        try {
            if (z) {
                this$0.M2();
            } else {
                this$0.permanentAdd = new DlAddress("", "", "", "", "", "", "", "");
                tb tbVar2 = this$0.binding;
                if (tbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar2 = null;
                }
                tbVar2.F.setText("");
                tb tbVar3 = this$0.binding;
                if (tbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar3 = null;
                }
                tbVar3.E.setText("");
                tb tbVar4 = this$0.binding;
                if (tbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar4 = null;
                }
                tbVar4.H.setText("");
                tb tbVar5 = this$0.binding;
                if (tbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar5 = null;
                }
                tbVar5.A.setText("");
                tb tbVar6 = this$0.binding;
                if (tbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar6 = null;
                }
                tbVar6.D.setText("");
                tb tbVar7 = this$0.binding;
                if (tbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar7 = null;
                }
                tbVar7.B.setText("");
                tb tbVar8 = this$0.binding;
                if (tbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar8 = null;
                }
                tbVar8.C.setText("");
            }
            tb tbVar9 = this$0.binding;
            if (tbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar9 = null;
            }
            tbVar9.z(this$0.permanentAdd);
            tb tbVar10 = this$0.binding;
            if (tbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar = tbVar10;
            }
            tbVar.a();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void D2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.H2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.i2(), this$0.p2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void E2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.I2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.i2(), this$0.p2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void F2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.J2("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.i2(), this$0.p2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void G2(AddressDetailEditScreen this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        if (i == R.id.town_rb) {
            this$0.presVillTown = 2;
            this$0.f2("U");
        } else {
            if (i != R.id.village_rb) {
                return;
            }
            this$0.presVillTown = 1;
            this$0.f2("R");
        }
    }

    private final void H2(String fromWhere) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void I2(String fromWhere) {
        T t;
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            ArrayList arrayList = new ArrayList();
            String str = "R";
            tb tbVar = null;
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<TalukaMasterItem> list = this.mCurrTalukaList;
                if (list != null) {
                    for (TalukaMasterItem talukaMasterItem : list) {
                        arrayList.add(String.valueOf(talukaMasterItem != null ? talukaMasterItem.getSubDistname() : null));
                    }
                }
                tb tbVar2 = this.binding;
                if (tbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    tbVar = tbVar2;
                }
                t = str;
                if (tbVar.a0.isChecked()) {
                    t = "U";
                }
            } else {
                List<TalukaMasterItem> list2 = this.mPermTalukaList;
                if (list2 != null) {
                    for (TalukaMasterItem talukaMasterItem2 : list2) {
                        arrayList.add(String.valueOf(talukaMasterItem2 != null ? talukaMasterItem2.getSubDistname() : null));
                    }
                }
                tb tbVar3 = this.binding;
                if (tbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    tbVar = tbVar3;
                }
                t = str;
                if (tbVar.I.isChecked()) {
                    t = "U";
                }
            }
            objectRef.element = t;
            d86 d86VarA = d86.INSTANCE.a("Select Taluka", arrayList);
            d86VarA.k2(I0(), "TalukaPicker");
            d86VarA.n2(new f(objectRef));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void J2(String fromWhere) {
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
    public final void K2(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.L2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void L2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void M2() {
        try {
            this.permanentAdd = this.presentAdd;
            T2(e2());
            tb tbVar = this.binding;
            tb tbVar2 = null;
            if (tbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar = null;
            }
            EditText editText = tbVar.G;
            tb tbVar3 = this.binding;
            if (tbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar3 = null;
            }
            editText.setText(tbVar3.z.getText());
            tb tbVar4 = this.binding;
            if (tbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar4 = null;
            }
            EditText editText2 = tbVar4.F;
            tb tbVar5 = this.binding;
            if (tbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar5 = null;
            }
            editText2.setText(tbVar5.y.getText());
            tb tbVar6 = this.binding;
            if (tbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar6 = null;
            }
            EditText editText3 = tbVar6.E;
            tb tbVar7 = this.binding;
            if (tbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar7 = null;
            }
            editText3.setText(tbVar7.x.getText());
            tb tbVar8 = this.binding;
            if (tbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar8 = null;
            }
            EditText editText4 = tbVar8.H;
            tb tbVar9 = this.binding;
            if (tbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar9 = null;
            }
            editText4.setText(tbVar9.M.getText());
            tb tbVar10 = this.binding;
            if (tbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar10 = null;
            }
            EditText editText5 = tbVar10.A;
            tb tbVar11 = this.binding;
            if (tbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar11 = null;
            }
            editText5.setText(tbVar11.L.getText());
            tb tbVar12 = this.binding;
            if (tbVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar12 = null;
            }
            EditText editText6 = tbVar12.D;
            tb tbVar13 = this.binding;
            if (tbVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar13 = null;
            }
            editText6.setText(tbVar13.P.getText());
            tb tbVar14 = this.binding;
            if (tbVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar14 = null;
            }
            EditText editText7 = tbVar14.B;
            tb tbVar15 = this.binding;
            if (tbVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar15 = null;
            }
            editText7.setText(tbVar15.N.getText());
            tb tbVar16 = this.binding;
            if (tbVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar16 = null;
            }
            EditText editText8 = tbVar16.C;
            tb tbVar17 = this.binding;
            if (tbVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar2 = tbVar17;
            }
            editText8.setText(tbVar2.O.getText());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void Y1() {
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(i2(), "Please Check Your Internet connection", 1).show();
            return;
        }
        j2().show();
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
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        tbVar.x.setText("");
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar3;
        }
        tbVar2.x.setHint(p2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        b2();
        b2();
    }

    private final void b2() {
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        tbVar.M.setText("");
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar3;
        }
        tbVar2.M.setHint(p2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mCurrVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2() {
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        tbVar.E.setText("");
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar3;
        }
        tbVar2.E.setHint(p2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mPermTalukaList = CollectionsKt__CollectionsKt.emptyList();
        d2();
    }

    private final void d2() {
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        tbVar.H.setText("");
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar3;
        }
        tbVar2.H.setHint(p2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mPermVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(String villaOrTown) {
        try {
            tb tbVar = this.binding;
            tb tbVar2 = null;
            if (tbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar = null;
            }
            String string = tbVar.x.getContentDescription().toString();
            b2();
            j2().dismiss();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            tb tbVar3 = this.binding;
            if (tbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar3 = null;
            }
            String string2 = tbVar3.z.getContentDescription().toString();
            tb tbVar4 = this.binding;
            if (tbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar2 = tbVar4;
            }
            xh0Var.o(string2, tbVar2.y.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(String villaOrTown) {
        try {
            tb tbVar = this.binding;
            tb tbVar2 = null;
            if (tbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar = null;
            }
            String string = tbVar.E.getContentDescription().toString();
            d2();
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            tb tbVar3 = this.binding;
            if (tbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar3 = null;
            }
            String string2 = tbVar3.G.getContentDescription().toString();
            tb tbVar4 = this.binding;
            if (tbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar2 = tbVar4;
            }
            xh0Var.o(string2, tbVar2.F.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void q2() {
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        tbVar.U.f.setText(o2().k());
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar3 = null;
        }
        tbVar3.U.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.r2(this.a, view);
            }
        });
        tb tbVar4 = this.binding;
        if (tbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar4 = null;
        }
        tbVar4.S.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.s2(this.a, view);
            }
        });
        tb tbVar5 = this.binding;
        if (tbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar5 = null;
        }
        tbVar5.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.u2(this.a, view);
            }
        });
        tb tbVar6 = this.binding;
        if (tbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar6;
        }
        tbVar2.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.v2(this.a, view);
            }
        });
    }

    public static final void r2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void s2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        tb tbVar = null;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        final PopupWindow popupWindow = new PopupWindow(viewInflate, (int) (((double) this$0.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        TextView textView = (TextView) viewInflate.findViewById(R.id.infoMessageTv);
        ((ImageView) viewInflate.findViewById(R.id.closeIv)).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddressDetailEditScreen.t2(popupWindow, view2);
            }
        });
        textView.setText(this$0.p2().b("address_ll_print_msg", "Address 1, Address 2, Address 3 & Pincode will be printed on your Driving Licence Number"));
        tb tbVar2 = this$0.binding;
        if (tbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar = tbVar2;
        }
        popupWindow.showAsDropDown(tbVar.Z, 0, 10);
    }

    public static final void t2(PopupWindow popupWindow, View view) {
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    public static final void u2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.w2()) {
            Intent intent = new Intent(this$0, (Class<?>) SelectedCovDetailsScreen.class);
            intent.putParcelableArrayListExtra("covDetails", this$0.covDetails);
            intent.putParcelableArrayListExtra("selectedCovDetails", this$0.selectedCovList);
            intent.putExtra("willingToDonate", this$0.willingToDonate);
            intent.putExtra("licenseFromState", this$0.licenseFromState);
            intent.putExtra("licenceFromRTO", this$0.licenceFromRTO);
            intent.putExtra("jurisdiction", this$0.jurisdiction);
            intent.putExtra("licenceFromRTOCode", this$0.licenceFromRTOCode);
            intent.putExtra("applicationNo", this$0.applicationNo);
            intent.putExtra("reference", this$0.reference);
            intent.putExtra("applDate", this$0.applDate);
            intent.putExtra("allowNewAddr", this$0.allowNewAddr);
            intent.putExtra("applCatg", this$0.applCatg);
            intent.putParcelableArrayListExtra("llRefDetails", this$0.llRefDetails);
            intent.putExtra("bioId", this$0.bioId);
            intent.putExtra("allClassOfVehicles", this$0.allClassOfVehicles);
            intent.putExtra("applicantFName", this$0.getIntent().getStringExtra("applicantFName"));
            intent.putExtra("applicantMName", this$0.getIntent().getStringExtra("applicantMName"));
            intent.putExtra("applicantLName", this$0.getIntent().getStringExtra("applicantLName"));
            intent.putExtra("fullName", this$0.getIntent().getStringExtra("fullName"));
            intent.putExtra("relationship", this$0.getIntent().getStringExtra("relationship"));
            intent.putExtra("relationFName", this$0.getIntent().getStringExtra("relationFName"));
            intent.putExtra("relationMName", this$0.getIntent().getStringExtra("relationMName"));
            intent.putExtra("relationLName", this$0.getIntent().getStringExtra("relationLName"));
            intent.putExtra("gender", this$0.getIntent().getStringExtra("gender"));
            intent.putExtra("dob", this$0.getIntent().getStringExtra("dob"));
            intent.putExtra("placeOfBirth", this$0.getIntent().getStringExtra("placeOfBirth"));
            intent.putExtra("country", this$0.getIntent().getStringExtra("country"));
            intent.putExtra("educationQualification", this$0.getIntent().getStringExtra("educationQualification"));
            intent.putExtra("bloodGroup", this$0.getIntent().getStringExtra("bloodGroup"));
            intent.putExtra("mobileNo", this$0.getIntent().getStringExtra("mobileNo"));
            intent.putExtra("emailId", this$0.getIntent().getStringExtra("emailId"));
            intent.putExtra("applicantMobileNo", this$0.getIntent().getStringExtra("applicantMobileNo"));
            intent.putExtra("emergencyContactNo", this$0.getIntent().getStringExtra("emergencyContactNo"));
            intent.putExtra("identificationMark1", this$0.getIntent().getStringExtra("identificationMark1"));
            intent.putExtra("identificationMark2", this$0.getIntent().getStringExtra("identificationMark2"));
            tb tbVar = this$0.binding;
            tb tbVar2 = null;
            if (tbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar = null;
            }
            intent.putExtra("presHouseNo", tbVar.L.getText().toString());
            tb tbVar3 = this$0.binding;
            if (tbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar3 = null;
            }
            intent.putExtra("presStreet", tbVar3.P.getText().toString());
            tb tbVar4 = this$0.binding;
            if (tbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar4 = null;
            }
            intent.putExtra("presLocation", tbVar4.N.getText().toString());
            intent.putExtra("presVillageOrTown", this$0.presentAdd.getVillageOrTown());
            intent.putExtra("presSubDistrict", this$0.presentAdd.getSubDistrict());
            intent.putExtra("presDistrict", this$0.presentAdd.getDistrict());
            intent.putExtra("presState", this$0.e2());
            intent.putExtra("presVillTown", this$0.presVillTown);
            tb tbVar5 = this$0.binding;
            if (tbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar5 = null;
            }
            intent.putExtra("presPincode", tbVar5.O.getText().toString());
            tb tbVar6 = this$0.binding;
            if (tbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar6 = null;
            }
            intent.putExtra("perHouseNo", tbVar6.A.getText().toString());
            tb tbVar7 = this$0.binding;
            if (tbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar7 = null;
            }
            intent.putExtra("perStreet", tbVar7.D.getText().toString());
            tb tbVar8 = this$0.binding;
            if (tbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar8 = null;
            }
            intent.putExtra("perLocation", tbVar8.B.getText().toString());
            intent.putExtra("permVillageOrTown", this$0.permanentAdd.getVillageOrTown());
            intent.putExtra("perSubDistrict", this$0.permanentAdd.getSubDistrict());
            intent.putExtra("perDistrict", this$0.permanentAdd.getDistrict());
            intent.putExtra("perState", this$0.k2());
            intent.putExtra("premVillTown", this$0.premVillTown);
            tb tbVar9 = this$0.binding;
            if (tbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar9 = null;
            }
            intent.putExtra("perPinCode", tbVar9.O.getText().toString());
            intent.putExtra("permanentAdd", this$0.permanentAdd);
            tb tbVar10 = this$0.binding;
            if (tbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tbVar10 = null;
            }
            intent.putExtra("stayMonths", String.valueOf(tbVar10.V.getText()));
            tb tbVar11 = this$0.binding;
            if (tbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                tbVar2 = tbVar11;
            }
            intent.putExtra("stayYears", String.valueOf(tbVar2.t0.getText()));
            this$0.startActivity(intent);
        }
    }

    public static final void v2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) EditLearnerAppScreen.class));
        this$0.finish();
    }

    private final boolean w2() {
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        Editable text = tbVar.z.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, p2().b("select_state", getString(R.string.select_state)), 0).show();
            return false;
        }
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar3 = null;
        }
        Editable text2 = tbVar3.y.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this, p2().b("select_district", getString(R.string.select_district)), 0).show();
            return false;
        }
        tb tbVar4 = this.binding;
        if (tbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar4 = null;
        }
        Editable text3 = tbVar4.x.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, p2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
            return false;
        }
        tb tbVar5 = this.binding;
        if (tbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar5 = null;
        }
        Editable text4 = tbVar5.N.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            Toast.makeText(this, p2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
            return false;
        }
        tb tbVar6 = this.binding;
        if (tbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar6 = null;
        }
        Editable text5 = tbVar6.O.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, p2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
            return false;
        }
        tb tbVar7 = this.binding;
        if (tbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar7 = null;
        }
        if (tbVar7.O.getText().length() < 6) {
            Toast.makeText(this, p2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        tb tbVar8 = this.binding;
        if (tbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar8 = null;
        }
        Editable text6 = tbVar8.G.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, p2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        tb tbVar9 = this.binding;
        if (tbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar9 = null;
        }
        Editable text7 = tbVar9.F.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, p2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
            return false;
        }
        tb tbVar10 = this.binding;
        if (tbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar10 = null;
        }
        Editable text8 = tbVar10.E.getText();
        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
        if (text8.length() == 0) {
            Toast.makeText(this, p2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
            return false;
        }
        tb tbVar11 = this.binding;
        if (tbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar11 = null;
        }
        Editable text9 = tbVar11.B.getText();
        Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
        if (text9.length() == 0) {
            Toast.makeText(this, p2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
            return false;
        }
        tb tbVar12 = this.binding;
        if (tbVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar12 = null;
        }
        Editable text10 = tbVar12.C.getText();
        Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
        if (text10.length() == 0) {
            Toast.makeText(this, p2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
            return false;
        }
        tb tbVar13 = this.binding;
        if (tbVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar13;
        }
        if (tbVar2.C.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, p2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    private final void x2() {
        tb tbVar = this.binding;
        tb tbVar2 = null;
        if (tbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar = null;
        }
        tbVar.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.D2(this.a, view);
            }
        });
        tb tbVar3 = this.binding;
        if (tbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar3 = null;
        }
        tbVar3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.E2(this.a, view);
            }
        });
        tb tbVar4 = this.binding;
        if (tbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar4 = null;
        }
        tbVar4.M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.F2(this.a, view);
            }
        });
        tb tbVar5 = this.binding;
        if (tbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar5 = null;
        }
        tbVar5.s0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.kk
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                AddressDetailEditScreen.G2(this.a, radioGroup, i);
            }
        });
        tb tbVar6 = this.binding;
        if (tbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar6 = null;
        }
        tbVar6.F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.y2(this.a, view);
            }
        });
        tb tbVar7 = this.binding;
        if (tbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar7 = null;
        }
        tbVar7.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.z2(this.a, view);
            }
        });
        tb tbVar8 = this.binding;
        if (tbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar8 = null;
        }
        tbVar8.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailEditScreen.A2(this.a, view);
            }
        });
        tb tbVar9 = this.binding;
        if (tbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVar9 = null;
        }
        tbVar9.K.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.ak
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                AddressDetailEditScreen.B2(this.a, radioGroup, i);
            }
        });
        tb tbVar10 = this.binding;
        if (tbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar2 = tbVar10;
        }
        tbVar2.X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.bk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AddressDetailEditScreen.C2(this.a, compoundButton, z);
            }
        });
    }

    public static final void y2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.H2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.i2(), this$0.p2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void z2(AddressDetailEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.I2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.i2(), this$0.p2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public final void N2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currStateCd = str;
    }

    public final void O2(ArrayList addressDetails) {
        try {
            this.apiPreStateCd = ((il) addressDetails.get(0)).x();
            this.apiPreDistrictCd = ((il) addressDetails.get(0)).s();
            this.apiPreSubDivisionCd = ((il) addressDetails.get(0)).A();
            this.apiPreTownVill = ((il) addressDetails.get(0)).B();
            this.apiCityCode = ((il) addressDetails.get(0)).q();
            N2(this.apiPreStateCd);
            T2(e2());
            this.presentAdd.setDistrict(this.apiPreDistrictCd);
            this.presentAdd.setSubDistrict(this.apiPreSubDivisionCd);
            this.presentAdd.setVillageOrTown(this.apiCityCode);
            Log.e("Sub District", this.apiPreSubDivisionCd);
            if (kt6.d(this.apiPreTownVill)) {
                this.presVillTown = Integer.parseInt(this.apiPreTownVill);
            }
            this.apiPermStateCd = ((il) addressDetails.get(0)).k();
            this.apiPermDistrictCd = ((il) addressDetails.get(0)).f();
            this.apiPermSubDivisionCd = ((il) addressDetails.get(0)).n();
            this.apiPermTownVill = ((il) addressDetails.get(0)).o();
            this.apiPermCityCode = ((il) addressDetails.get(0)).d();
            this.permanentAdd.setDistrict(this.apiPermDistrictCd);
            this.permanentAdd.setSubDistrict(this.apiPermSubDivisionCd);
            this.permanentAdd.setVillageOrTown(this.apiPermCityCode);
            if (kt6.d(this.apiPermTownVill)) {
                this.premVillTown = Integer.parseInt(this.apiPermTownVill);
            }
            j2().dismiss();
            xh0 xh0Var = this.viewModel;
            tb tbVar = null;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            xh0Var.g(this.apiPreStateCd);
            this.isTalukaFromApiCall = true;
            this.isCityFromApiCall = true;
            if (((il) addressDetails.get(0)).w().length() > 0) {
                tb tbVar2 = this.binding;
                if (tbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar2 = null;
                }
                tbVar2.z.setText(((il) addressDetails.get(0)).w());
                tb tbVar3 = this.binding;
                if (tbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar3 = null;
                }
                tbVar3.z.setContentDescription(this.apiPreStateCd);
            }
            if (((il) addressDetails.get(0)).r().length() > 0) {
                tb tbVar4 = this.binding;
                if (tbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar4 = null;
                }
                tbVar4.y.setText(((il) addressDetails.get(0)).r());
                tb tbVar5 = this.binding;
                if (tbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar5 = null;
                }
                tbVar5.y.setContentDescription(this.apiPreDistrictCd);
            }
            if (((il) addressDetails.get(0)).z().length() > 0) {
                this.isForCurrentTalukaApiCall = true;
                tb tbVar6 = this.binding;
                if (tbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar6 = null;
                }
                tbVar6.x.setText(((il) addressDetails.get(0)).z());
                j2().dismiss();
                xh0 xh0Var2 = this.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var2 = null;
                }
                xh0Var2.n(this.apiPreStateCd, this.apiPreDistrictCd);
            }
            if (StringsKt__StringsJVMKt.equals(((il) addressDetails.get(0)).B(), VContant.MAINSCREEN, true)) {
                tb tbVar7 = this.binding;
                if (tbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar7 = null;
                }
                tbVar7.r0.setChecked(true);
                tb tbVar8 = this.binding;
                if (tbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar8 = null;
                }
                tbVar8.a0.setChecked(false);
            } else {
                tb tbVar9 = this.binding;
                if (tbVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar9 = null;
                }
                tbVar9.r0.setChecked(false);
                tb tbVar10 = this.binding;
                if (tbVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar10 = null;
                }
                tbVar10.a0.setChecked(true);
            }
            if (((il) addressDetails.get(0)).p().length() > 0) {
                tb tbVar11 = this.binding;
                if (tbVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar11 = null;
                }
                tbVar11.M.setText(((il) addressDetails.get(0)).p());
                j2().dismiss();
                this.isForCurrentCityApiCall = true;
                tb tbVar12 = this.binding;
                if (tbVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar12 = null;
                }
                String str = tbVar12.a0.isChecked() ? "U" : "R";
                xh0 xh0Var3 = this.viewModel;
                if (xh0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var3 = null;
                }
                xh0Var3.o(this.apiPreStateCd, this.apiPreDistrictCd, this.apiPreSubDivisionCd, str);
            }
            if (((il) addressDetails.get(0)).t().length() > 0) {
                tb tbVar13 = this.binding;
                if (tbVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar13 = null;
                }
                tbVar13.L.setText(((il) addressDetails.get(0)).t());
            }
            if (((il) addressDetails.get(0)).y().length() > 0) {
                tb tbVar14 = this.binding;
                if (tbVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar14 = null;
                }
                tbVar14.P.setText(((il) addressDetails.get(0)).y());
            }
            if (((il) addressDetails.get(0)).u().length() > 0) {
                tb tbVar15 = this.binding;
                if (tbVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar15 = null;
                }
                tbVar15.N.setText(((il) addressDetails.get(0)).u());
            }
            if (((il) addressDetails.get(0)).v().length() > 0) {
                tb tbVar16 = this.binding;
                if (tbVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar16 = null;
                }
                tbVar16.O.setText(((il) addressDetails.get(0)).v());
            }
            if (((il) addressDetails.get(0)).C().length() > 0) {
                tb tbVar17 = this.binding;
                if (tbVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar17 = null;
                }
                tbVar17.V.setText(((il) addressDetails.get(0)).C());
            }
            if (((il) addressDetails.get(0)).D().length() > 0) {
                tb tbVar18 = this.binding;
                if (tbVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar18 = null;
                }
                tbVar18.t0.setText(((il) addressDetails.get(0)).D());
            }
            if (((il) addressDetails.get(0)).j().length() > 0) {
                tb tbVar19 = this.binding;
                if (tbVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar19 = null;
                }
                tbVar19.G.setText(((il) addressDetails.get(0)).j());
                tb tbVar20 = this.binding;
                if (tbVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar20 = null;
                }
                tbVar20.G.setContentDescription(this.apiPermStateCd);
            }
            if (((il) addressDetails.get(0)).e().length() > 0) {
                tb tbVar21 = this.binding;
                if (tbVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar21 = null;
                }
                tbVar21.F.setText(((il) addressDetails.get(0)).r());
                tb tbVar22 = this.binding;
                if (tbVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar22 = null;
                }
                tbVar22.F.setContentDescription(this.apiPermDistrictCd);
            }
            if (((il) addressDetails.get(0)).m().length() > 0) {
                this.isForCurrentTalukaApiCall = false;
                tb tbVar23 = this.binding;
                if (tbVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar23 = null;
                }
                tbVar23.E.setText(((il) addressDetails.get(0)).m());
                j2().dismiss();
                xh0 xh0Var4 = this.viewModel;
                if (xh0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var4 = null;
                }
                xh0Var4.n(this.apiPermStateCd, this.apiPermDistrictCd);
            }
            if (StringsKt__StringsJVMKt.equals(((il) addressDetails.get(0)).o(), VContant.MAINSCREEN, true)) {
                tb tbVar24 = this.binding;
                if (tbVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar24 = null;
                }
                tbVar24.J.setChecked(true);
                tb tbVar25 = this.binding;
                if (tbVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar25 = null;
                }
                tbVar25.I.setChecked(false);
            } else {
                tb tbVar26 = this.binding;
                if (tbVar26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar26 = null;
                }
                tbVar26.J.setChecked(false);
                tb tbVar27 = this.binding;
                if (tbVar27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar27 = null;
                }
                tbVar27.I.setChecked(true);
            }
            if (((il) addressDetails.get(0)).c().length() > 0) {
                tb tbVar28 = this.binding;
                if (tbVar28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar28 = null;
                }
                tbVar28.H.setText(((il) addressDetails.get(0)).c());
                j2().dismiss();
                this.isForCurrentCityApiCall = false;
                tb tbVar29 = this.binding;
                if (tbVar29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar29 = null;
                }
                String str2 = tbVar29.a0.isChecked() ? "U" : "R";
                xh0 xh0Var5 = this.viewModel;
                if (xh0Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var5 = null;
                }
                xh0Var5.o(this.apiPermStateCd, this.apiPermDistrictCd, this.apiPermSubDivisionCd, str2);
            }
            if (((il) addressDetails.get(0)).g().length() > 0) {
                tb tbVar30 = this.binding;
                if (tbVar30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar30 = null;
                }
                tbVar30.A.setText(((il) addressDetails.get(0)).g());
            }
            if (((il) addressDetails.get(0)).l().length() > 0) {
                tb tbVar31 = this.binding;
                if (tbVar31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar31 = null;
                }
                tbVar31.D.setText(((il) addressDetails.get(0)).l());
            }
            if (((il) addressDetails.get(0)).h().length() > 0) {
                tb tbVar32 = this.binding;
                if (tbVar32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tbVar32 = null;
                }
                tbVar32.B.setText(((il) addressDetails.get(0)).h());
            }
            if (((il) addressDetails.get(0)).i().length() > 0) {
                tb tbVar33 = this.binding;
                if (tbVar33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    tbVar = tbVar33;
                }
                tbVar.C.setText(((il) addressDetails.get(0)).i());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void P2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void Q2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void R2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void S2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perStateCd = str;
    }

    public final void U2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void V2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String e2() {
        String str = this.currStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currStateCd");
        return null;
    }

    public final void g2() {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("addressDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        this.addressDetails = parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("covDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra2);
        this.covDetails = parcelableArrayListExtra2;
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("selectedCovDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra3);
        this.selectedCovList = parcelableArrayListExtra3;
        this.willingToDonate = getIntent().getBooleanExtra("willingToDonate", false);
        String stringExtra = getIntent().getStringExtra("licenseFromState");
        Intrinsics.checkNotNull(stringExtra);
        this.licenseFromState = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("licenceFromRTO");
        Intrinsics.checkNotNull(stringExtra2);
        this.licenceFromRTO = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("jurisdiction");
        Intrinsics.checkNotNull(stringExtra3);
        this.jurisdiction = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("licenceFromRTOCode");
        Intrinsics.checkNotNull(stringExtra4);
        this.licenceFromRTOCode = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicationNo");
        Intrinsics.checkNotNull(stringExtra5);
        this.applicationNo = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        Intrinsics.checkNotNull(stringExtra6);
        this.reference = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("applDate");
        Intrinsics.checkNotNull(stringExtra7);
        this.applDate = stringExtra7;
        this.allowNewAddr = getIntent().getBooleanExtra("allowNewAddr", false);
        String stringExtra8 = getIntent().getStringExtra("applCatg");
        Intrinsics.checkNotNull(stringExtra8);
        this.applCatg = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("bioId");
        Intrinsics.checkNotNull(stringExtra9);
        this.bioId = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("allClassOfVehicles");
        Intrinsics.checkNotNull(stringExtra10);
        this.allClassOfVehicles = stringExtra10;
        ArrayList parcelableArrayListExtra4 = getIntent().getParcelableArrayListExtra("llRefDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra4);
        this.llRefDetails = parcelableArrayListExtra4;
        String stringExtra11 = getIntent().getStringExtra("applicantFName");
        Intrinsics.checkNotNull(stringExtra11);
        this.applicantFName = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("applicantMName");
        Intrinsics.checkNotNull(stringExtra12);
        this.applicantMName = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("applicantLName");
        Intrinsics.checkNotNull(stringExtra13);
        this.applicantLName = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("fullName");
        Intrinsics.checkNotNull(stringExtra14);
        this.fullName = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("relationship");
        Intrinsics.checkNotNull(stringExtra15);
        this.relationship = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("relationFName");
        Intrinsics.checkNotNull(stringExtra16);
        this.relationFName = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("relationMName");
        Intrinsics.checkNotNull(stringExtra17);
        this.relationMName = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("relationLName");
        Intrinsics.checkNotNull(stringExtra18);
        this.relationLName = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("gender");
        Intrinsics.checkNotNull(stringExtra19);
        this.gender = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra20);
        this.dob = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("placeOfBirth");
        Intrinsics.checkNotNull(stringExtra21);
        this.placeOfBirth = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("country");
        Intrinsics.checkNotNull(stringExtra22);
        this.countryCd = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("educationQualification");
        Intrinsics.checkNotNull(stringExtra23);
        this.eduQualificationCd = stringExtra23;
        String stringExtra24 = getIntent().getStringExtra("bloodGroup");
        Intrinsics.checkNotNull(stringExtra24);
        this.bloodGroupCd = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("mobileNo");
        Intrinsics.checkNotNull(stringExtra25);
        this.phoneNo = stringExtra25;
        String stringExtra26 = getIntent().getStringExtra("emailId");
        Intrinsics.checkNotNull(stringExtra26);
        this.emailId = stringExtra26;
        String stringExtra27 = getIntent().getStringExtra("applicantMobileNo");
        Intrinsics.checkNotNull(stringExtra27);
        this.applicantMobileNo = stringExtra27;
        String stringExtra28 = getIntent().getStringExtra("emergencyContactNo");
        Intrinsics.checkNotNull(stringExtra28);
        this.emergencyContactNo = stringExtra28;
        String stringExtra29 = getIntent().getStringExtra("identificationMark1");
        Intrinsics.checkNotNull(stringExtra29);
        this.idMark1 = stringExtra29;
        String stringExtra30 = getIntent().getStringExtra("identificationMark2");
        Intrinsics.checkNotNull(stringExtra30);
        this.idMark2 = stringExtra30;
        if (this.addressDetails.size() > 0) {
            O2(this.addressDetails);
        }
    }

    public final ClInter h2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final Context i2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog j2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String k2() {
        String str = this.perStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("perStateCd");
        return null;
    }

    /* JADX INFO: renamed from: l2, reason: from getter */
    public final DlAddress getPermanentAdd() {
        return this.permanentAdd;
    }

    /* JADX INFO: renamed from: n2, reason: from getter */
    public final DlAddress getPresentAdd() {
        return this.presentAdd;
    }

    public final wl5 o2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tb tbVarX = tb.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tbVarX, "inflate(...)");
        this.binding = tbVarX;
        tb tbVar = null;
        if (tbVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tbVarX = null;
        }
        setContentView(tbVarX.m());
        R2(this);
        V2(new wa3(i2()));
        U2(new wl5(i2()));
        Q2(ClInter.INSTANCE.a(i2()));
        S2(new ProgressDialog(i2()));
        j2().setMessage(p2().b("label_challan_please_wait", getString(R.string.please_wait)));
        j2().setCancelable(false);
        j2().setCanceledOnTouchOutside(false);
        P2((kl0) new z(this, new sn0(new jl0(h2()))).a(kl0.class));
        this.viewModel = (xh0) new z(this).a(xh0.class);
        g2();
        q2();
        Y1();
        Z1();
        x2();
        ta3.a aVar = ta3.a;
        tb tbVar2 = this.binding;
        if (tbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tbVar = tbVar2;
        }
        aVar.I0(this, tbVar);
    }

    public final wa3 p2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }
}
