package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendarview.CalendarView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SaveSlotBookingModel;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentByDateResponse;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentRequest;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotCounterResponseDetails;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotPaymaentStatusResponse;
import com.nic.mparivahan.VahanServices.a;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import com.zepto.ca0;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.ny6;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wh7;
import com.zepto.yy0;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0003J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0003J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0007R\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u001e\u0010.\u001a\n ,*\u0004\u0018\u00010'0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010G\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010^\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R\"\u0010f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010[\"\u0004\be\u0010]R\"\u0010j\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010Y\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R\"\u0010n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010[\"\u0004\bm\u0010]R\"\u0010r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010Y\u001a\u0004\bp\u0010[\"\u0004\bq\u0010]R\"\u0010x\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010A\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010Y\u001a\u0004\bz\u0010[\"\u0004\b{\u0010]R#\u0010\u0080\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010Y\u001a\u0004\b~\u0010[\"\u0004\b\u007f\u0010]R&\u0010\u0084\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010Y\u001a\u0005\b\u0082\u0001\u0010[\"\u0005\b\u0083\u0001\u0010]R(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010Y\u001a\u0005\b\u0086\u0001\u0010[\"\u0005\b\u0087\u0001\u0010]R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0094\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010Y\u001a\u0005\b\u0092\u0001\u0010[\"\u0005\b\u0093\u0001\u0010]R*\u0010\u009c\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R&\u0010 \u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010Y\u001a\u0005\b\u009e\u0001\u0010[\"\u0005\b\u009f\u0001\u0010]R&\u0010¤\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010Y\u001a\u0005\b¢\u0001\u0010[\"\u0005\b£\u0001\u0010]R;\u0010\u00ad\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050¥\u0001j\t\u0012\u0004\u0012\u00020\u0005`¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R;\u0010±\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050¥\u0001j\t\u0012\u0004\u0012\u00020\u0005`¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¨\u0001\u001a\u0006\b¯\u0001\u0010ª\u0001\"\u0006\b°\u0001\u0010¬\u0001R;\u0010µ\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050¥\u0001j\t\u0012\u0004\u0012\u00020\u0005`¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010¨\u0001\u001a\u0006\b³\u0001\u0010ª\u0001\"\u0006\b´\u0001\u0010¬\u0001R=\u0010º\u0001\u001a\u0016\u0012\u0005\u0012\u00030¶\u00010¥\u0001j\n\u0012\u0005\u0012\u00030¶\u0001`¦\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¨\u0001\u001a\u0006\b¸\u0001\u0010ª\u0001\"\u0006\b¹\u0001\u0010¬\u0001R*\u0010Â\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Å\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SlotAppointmentBookingActivity;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/VahanServices/a$a;", "", "O1", "", "it", "p2", "E1", "", "position", "m2", "A1", "V1", "T1", "Z1", "selectedDate", "R1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "clickAble", "C", "J1", "U1", "dateToFormat", "inputFormat", "outputFormat", "Ljava/util/Date;", "v1", "Lcom/zepto/wh7;", "Lcom/zepto/wh7;", "z1", "()Lcom/zepto/wh7;", "Y1", "(Lcom/zepto/wh7;)V", "binding", "Ljava/time/LocalDate;", "D", "Ljava/time/LocalDate;", "E", "unselectedDate", "kotlin.jvm.PlatformType", "F", "today", "Lcom/nic/mparivahan/VahanServices/a;", "G", "Lcom/nic/mparivahan/VahanServices/a;", "I1", "()Lcom/nic/mparivahan/VahanServices/a;", "i2", "(Lcom/nic/mparivahan/VahanServices/a;)V", "slotAdapter", "Landroidx/recyclerview/widget/RecyclerView$p;", "H", "Landroidx/recyclerview/widget/RecyclerView$p;", "L1", "()Landroidx/recyclerview/widget/RecyclerView$p;", "k2", "(Landroidx/recyclerview/widget/RecyclerView$p;)V", "slotManager", "", "Lcom/nic/mparivahan/VahanServices/VahanViewModel/SlotAppointmentModel;", "I", "Ljava/util/List;", "K1", "()Ljava/util/List;", "j2", "(Ljava/util/List;)V", "slotList", "Lcom/zepto/ld7;", "J", "Lcom/zepto/ld7;", "N1", "()Lcom/zepto/ld7;", "l2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "K", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "h2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "L", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "setApplNo", "(Ljava/lang/String;)V", "applNo", "M", "M1", "setStateCd", "stateCd", "N", "C1", "setOffCd", "offCd", "O", "getPurCd", "setPurCd", "purCd", "P", "getRcNo", "setRcNo", "rcNo", "Q", "getPaymentStatus", "e2", "paymentStatus", "R", "getVehicleClass", "()I", "setVehicleClass", "(I)V", "vehicleClass", "S", "getVehicleCat", "setVehicleCat", "vehicleCat", "T", "getOwnerName", "setOwnerName", "ownerName", "U", "getVehicleClassDes", "setVehicleClassDes", "vehicleClassDes", "V", "getCounterId", "b2", "counterId", "Landroid/app/ProgressDialog;", "W", "Landroid/app/ProgressDialog;", "D1", "()Landroid/app/ProgressDialog;", "d2", "(Landroid/app/ProgressDialog;)V", "pDialog", "X", "F1", "f2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "G1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "g2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Z", "x1", "X1", "aadhar_name", "a0", "w1", "W1", "aadhar_address", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b0", "Ljava/util/ArrayList;", "getAvailableDate", "()Ljava/util/ArrayList;", "setAvailableDate", "(Ljava/util/ArrayList;)V", "availableDate", "c0", "getAlreadyBookedDate", "setAlreadyBookedDate", "alreadyBookedDate", "d0", "getHolidayDate", "setHolidayDate", "holidayDate", "Lcom/zepto/ca0;", "e0", "getMEvents", "setMEvents", "mEvents", "Lcom/zepto/wa3;", "f0", "Lcom/zepto/wa3;", "B1", "()Lcom/zepto/wa3;", "c2", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSlotAppointmentBookingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotAppointmentBookingActivity.kt\ncom/nic/mparivahan/VahanServices/SlotAppointmentBookingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,726:1\n1#2:727\n*E\n"})
public final class SlotAppointmentBookingActivity extends pq implements a.InterfaceC0056a {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public wh7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LocalDate selectedDate;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public LocalDate unselectedDate;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public com.nic.mparivahan.VahanServices.a slotAdapter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public RecyclerView.p slotManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int vehicleClass;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String counterId;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public LocalDate today = LocalDate.now();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public List slotList = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String offCd = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String purCd = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String paymentStatus = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String vehicleCat = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String vehicleClassDes = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ArrayList availableDate = new ArrayList();

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ArrayList alreadyBookedDate = new ArrayList();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ArrayList holidayDate = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public ArrayList mEvents = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(SlotAppointmentByDateResponse slotAppointmentByDateResponse) {
            com.nic.mparivahan.VahanServices.a aVar;
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
            SlotAppointmentBookingActivity.this.j2(slotAppointmentByDateResponse);
            if (SlotAppointmentBookingActivity.this.getSlotList() != null) {
                SlotAppointmentBookingActivity.this.z1().j.setVisibility(0);
                SlotAppointmentBookingActivity.this.z1().h.setVisibility(8);
                SlotAppointmentBookingActivity slotAppointmentBookingActivity = SlotAppointmentBookingActivity.this;
                List slotList = slotAppointmentBookingActivity.getSlotList();
                if (slotList != null) {
                    SlotAppointmentBookingActivity slotAppointmentBookingActivity2 = SlotAppointmentBookingActivity.this;
                    aVar = new com.nic.mparivahan.VahanServices.a(slotList, slotAppointmentBookingActivity2, slotAppointmentBookingActivity2.B1());
                } else {
                    aVar = null;
                }
                Intrinsics.checkNotNull(aVar);
                slotAppointmentBookingActivity.i2(aVar);
                SlotAppointmentBookingActivity.this.z1().j.setAdapter(SlotAppointmentBookingActivity.this.I1());
                SlotAppointmentBookingActivity.this.z1().j.setLayoutManager(SlotAppointmentBookingActivity.this.L1());
                SlotAppointmentBookingActivity.this.I1().j();
                List slotList2 = SlotAppointmentBookingActivity.this.getSlotList();
                Intrinsics.checkNotNull(slotList2);
                if (slotList2.isEmpty()) {
                    SlotAppointmentBookingActivity.this.z1().c.setVisibility(8);
                } else {
                    SlotAppointmentBookingActivity.this.z1().c.setVisibility(0);
                }
                LocalDate localDate = SlotAppointmentBookingActivity.this.selectedDate;
                if (localDate != null) {
                    CalendarView calendarView = SlotAppointmentBookingActivity.this.z1().b;
                    Intrinsics.checkNotNullExpressionValue(calendarView, "calendarView");
                    CalendarView.F1(calendarView, localDate, null, 2, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotAppointmentByDateResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(SlotCounterResponseDetails slotCounterResponseDetails) {
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
            SlotAppointmentBookingActivity.this.b2(slotCounterResponseDetails.getValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotCounterResponseDetails) obj);
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

        public final void invoke(String str) {
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
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

        public final void invoke(String str) {
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(str, "Network Issue", true)) {
                SlotAppointmentBookingActivity.this.z1().j.setVisibility(8);
                SlotAppointmentBookingActivity.this.z1().h.setVisibility(0);
                SlotAppointmentBookingActivity.this.z1().h.setText(str);
            }
            SlotAppointmentBookingActivity slotAppointmentBookingActivity = SlotAppointmentBookingActivity.this;
            slotAppointmentBookingActivity.unselectedDate = slotAppointmentBookingActivity.selectedDate;
            SlotAppointmentBookingActivity.this.selectedDate = null;
            LocalDate localDate = SlotAppointmentBookingActivity.this.unselectedDate;
            if (localDate != null) {
                CalendarView calendarView = SlotAppointmentBookingActivity.this.z1().b;
                Intrinsics.checkNotNullExpressionValue(calendarView, "calendarView");
                CalendarView.F1(calendarView, localDate, null, 2, null);
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(SaveSlotBookingModel saveSlotBookingModel) {
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
            gd1.a aVar = gd1.a;
            if (aVar.m(saveSlotBookingModel.getValue())) {
                if (aVar.m(saveSlotBookingModel.getValue())) {
                    SlotAppointmentBookingActivity.this.p2("Unable to book the appointment, Please try after some time  ");
                    return;
                } else {
                    SlotAppointmentBookingActivity.this.p2(saveSlotBookingModel.getValue());
                    return;
                }
            }
            Intent intent = new Intent(SlotAppointmentBookingActivity.this, (Class<?>) SlotSuccessfulBookedActivity.class);
            intent.putExtra("appNo", SlotAppointmentBookingActivity.this.getApplNo());
            intent.putExtra("apptId", saveSlotBookingModel.getValue());
            intent.putExtra("stateCd", SlotAppointmentBookingActivity.this.getStateCd());
            intent.putExtra("offCd", SlotAppointmentBookingActivity.this.getOffCd());
            SlotAppointmentBookingActivity.this.startActivity(intent);
            SlotAppointmentBookingActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SaveSlotBookingModel) obj);
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
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
            if (!StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                SlotAppointmentBookingActivity.this.p2(str);
            } else {
                SlotAppointmentBookingActivity slotAppointmentBookingActivity = SlotAppointmentBookingActivity.this;
                Toast.makeText(slotAppointmentBookingActivity, slotAppointmentBookingActivity.getString(R.string.no_internet), 0).show();
            }
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(SlotPaymaentStatusResponse slotPaymaentStatusResponse) {
            if (SlotAppointmentBookingActivity.this.D1().isShowing()) {
                SlotAppointmentBookingActivity.this.D1().dismiss();
            }
            SlotAppointmentBookingActivity.this.e2(slotPaymaentStatusResponse.getValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotPaymaentStatusResponse) obj);
            return Unit.INSTANCE;
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

    private final void O1() {
        l2((ld7) new z(this, new kd7(new jd7(H1()))).a(ld7.class));
        A1();
        E1();
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 0);
        Date time = calendar.getTime();
        Calendar.getInstance().add(5, 0);
        String str = new SimpleDateFormat("dd-MM-yyyy").format(time);
        z1().n.setText(str);
        z1().m.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotAppointmentBookingActivity.P1(this.a, view);
            }
        });
        z1().m.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotAppointmentBookingActivity.Q1(this.a, view);
            }
        });
        k2(new LinearLayoutManager(this, 1, false));
        N1().Q0().g(this, new i(new b()));
        Intrinsics.checkNotNull(str);
        J1(str);
        N1().V0().g(this, new i(new c()));
        N1().W0().g(this, new i(new d()));
        N1().R0().g(this, new i(new e()));
        N1().U0().g(this, new i(new f()));
        N1().T0().g(this, new i(new g()));
        N1().E().g(this, new i(new h()));
        N1().Q().g(this, new i(new a()));
    }

    public static final void P1(SlotAppointmentBookingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.B1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void Q1(SlotAppointmentBookingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.T1();
    }

    public static final void S1(SlotAppointmentBookingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.F1());
        intent.putExtra("RcDetails", this$0.G1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, false);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.x1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.w1());
        this$0.startActivity(intent);
    }

    private final void T1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void Z1() {
        ViewParent parent = z1().d.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(z1().d);
        z1().f.removeAllViews();
        z1().f.setOrientation(1);
        ny6 ny6Var = new ny6(this, this.mEvents);
        ny6Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        z1().f.addView(ny6Var);
        ExpandableHeightGridView calendarGridView = ny6Var.getCalendarGridView();
        if (calendarGridView == null) {
            return;
        }
        calendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zepto.j36
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                SlotAppointmentBookingActivity.a2(this.a, adapterView, view, i2, j);
            }
        });
    }

    public static final void a2(SlotAppointmentBookingActivity this$0, AdapterView adapterView, View view, int i2, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (adapterView != null) {
            int i3 = (int) j;
            if (adapterView.getAdapter().getView(i3, view, adapterView).getAlpha() == 0.4f) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            Calendar calendar2 = Calendar.getInstance();
            Object item = adapterView.getAdapter().getItem(i3);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type java.util.Date");
            calendar2.setTime((Date) item);
            boolean z = calendar.get(6) == calendar2.get(6);
            if (calendar.after(calendar2) && !z) {
                Toast.makeText(this$0, this$0.B1().b("select_previous_slot_date", "You can't select the previous date."), 0).show();
            }
            try {
                String str = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(calendar2.getTimeInMillis()));
                Intrinsics.checkNotNull(str);
                this$0.R1(str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final void n2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void o2(Dialog d2, SlotAppointmentBookingActivity this$0, int i2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.V1(i2);
    }

    public static final void q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void r2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void A1() {
        if (D1().isShowing()) {
            D1().dismiss();
        }
        D1().show();
        N1().G(this, this.stateCd, this.offCd, this.purCd);
    }

    public final wa3 B1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    @Override // com.nic.mparivahan.VahanServices.a.InterfaceC0056a
    public void C(int position, boolean clickAble) {
        m2(position);
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final String getOffCd() {
        return this.offCd;
    }

    public final ProgressDialog D1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void E1() {
        try {
            if (D1().isShowing()) {
                D1().dismiss();
            }
            D1().dismiss();
            N1().l(this, this.applNo, this.purCd);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String F1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails G1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService H1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final com.nic.mparivahan.VahanServices.a I1() {
        com.nic.mparivahan.VahanServices.a aVar = this.slotAdapter;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotAdapter");
        return null;
    }

    public final void J1(String selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        D1().show();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.purCd);
        N1().S0(this, new SlotAppointmentRequest(this.rcNo, this.applNo, this.stateCd, this.offCd, selectedDate, arrayList));
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final List getSlotList() {
        return this.slotList;
    }

    public final RecyclerView.p L1() {
        RecyclerView.p pVar = this.slotManager;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotManager");
        return null;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    public final ld7 N1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void R1(String selectedDate) {
        if (this.availableDate.size() <= 0) {
            Toast.makeText(this, B1().b("slot_booking_not_available", "Booking not available on this date"), 0).show();
            return;
        }
        int size = this.availableDate.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.areEqual(selectedDate, this.availableDate.get(i2))) {
                z1().n.setText(selectedDate);
                J1(selectedDate);
                return;
            }
        }
        Toast.makeText(this, B1().b("slot_booking_not_available", "Booking not available on this date"), 0).show();
    }

    public final void U1() {
        ca0 ca0Var;
        ca0 ca0Var2;
        ca0 ca0Var3;
        try {
            this.mEvents.clear();
            if (this.availableDate.size() > 0) {
                int size = this.availableDate.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = this.availableDate.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    Date dateV1 = v1((String) obj, "dd-MM-yyyy", "yyyy/MM/dd");
                    if (dateV1 != null) {
                        Drawable drawable = getResources().getDrawable(R.drawable.dl_slots_green);
                        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                        ca0Var3 = new ca0(dateV1, drawable);
                    } else {
                        ca0Var3 = null;
                    }
                    if (ca0Var3 != null) {
                        this.mEvents.add(ca0Var3);
                    }
                }
            }
            if (this.alreadyBookedDate.size() > 0) {
                int size2 = this.alreadyBookedDate.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj2 = this.alreadyBookedDate.get(i3);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    Date dateV12 = v1((String) obj2, "dd-MM-yyyy", "yyyy/MM/dd");
                    if (dateV12 != null) {
                        Drawable drawable2 = getResources().getDrawable(R.drawable.dl_slots_red);
                        Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                        ca0Var2 = new ca0(dateV12, drawable2);
                    } else {
                        ca0Var2 = null;
                    }
                    if (ca0Var2 != null) {
                        this.mEvents.add(ca0Var2);
                    }
                }
            }
            if (this.holidayDate.size() > 0) {
                int size3 = this.holidayDate.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj3 = this.holidayDate.get(i4);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    Date dateV13 = v1((String) obj3, "dd-MM-yyyy", "yyyy/MM/dd");
                    if (dateV13 != null) {
                        Drawable drawable3 = getResources().getDrawable(R.drawable.dl_slots_blue);
                        Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
                        ca0Var = new ca0(dateV13, drawable3);
                    } else {
                        ca0Var = null;
                    }
                    if (ca0Var != null) {
                        this.mEvents.add(ca0Var);
                    }
                }
            }
            Z1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void V1(int position) {
        try {
            List list = this.slotList;
            Intrinsics.checkNotNull(list);
            if (list.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state_cd", this.stateCd);
                jSONObject.put("off_cd", this.offCd);
                jSONObject.put("appt_id", "");
                List list2 = this.slotList;
                Intrinsics.checkNotNull(list2);
                jSONObject.put("day_of_week", ((SlotAppointmentModel) list2.get(position)).getDay_ofWeek());
                List list3 = this.slotList;
                Intrinsics.checkNotNull(list3);
                jSONObject.put("slot_id", String.valueOf(((SlotAppointmentModel) list3.get(position)).getSlot_id()));
                List list4 = this.slotList;
                Intrinsics.checkNotNull(list4);
                jSONObject.put("service_id", ((SlotAppointmentModel) list4.get(position)).getSlot__service_Id());
                jSONObject.put("counter_id", this.counterId);
                jSONObject.put("appl_no", this.applNo);
                jSONObject.put("regn_no", this.rcNo);
                List list5 = this.slotList;
                Intrinsics.checkNotNull(list5);
                jSONObject.put("appointment_dt", ((SlotAppointmentModel) list5.get(position)).getSelectApptDate());
                List list6 = this.slotList;
                Intrinsics.checkNotNull(list6);
                jSONObject.put("op_date", ((SlotAppointmentModel) list6.get(position)).getSelectApptDate());
                jSONObject.put("count_reschedule", VContant.MAINSCREEN);
                jSONObject.put("book_status", "N");
                jSONObject.put("service_descr", "");
                jSONObject.put("fit_officer", "");
                jSONObject.put("mobile_no", "0");
                jSONObject.put("paymemt_status", this.paymentStatus);
                jSONObject.put("op_dateas_date", "");
                jSONObject.put("op_date_release", "");
                jSONObject.put("new_appl_no", "");
                jSONObject.put("new_appointment_dt", "");
                jSONObject.put("vh_class", String.valueOf(this.vehicleClass));
                jSONObject.put("vch_catg", this.vehicleCat);
                jSONObject.put("owner_name", this.ownerName);
                jSONObject.put("vh_class_desc", this.vehicleClassDes);
                jSONObject.put("old_appointment_dt", "");
                jSONObject.put("shift_day_of_week", "");
                jSONObject.put("shift_slot_id", "");
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                if (D1().isShowing()) {
                    D1().dismiss();
                }
                D1().show();
                N1().u1(this, jSONArray);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void Y1(wh7 wh7Var) {
        Intrinsics.checkNotNullParameter(wh7Var, "<set-?>");
        this.binding = wh7Var;
    }

    public final void b2(String str) {
        this.counterId = str;
    }

    public final void c2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void d2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paymentStatus = str;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void g2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void h2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void i2(com.nic.mparivahan.VahanServices.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.slotAdapter = aVar;
    }

    public final void j2(List list) {
        this.slotList = list;
    }

    public final void k2(RecyclerView.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.slotManager = pVar;
    }

    public final void l2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void m2(final int position) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.new_slot_diloge);
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
        textView.setText(B1().b("button_cancel", "Cancel"));
        textView2.setText(B1().b("button_proceed", "Proceed"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView2.setBackground(yy0.e(this, R.drawable.green_shape_appoin));
        textView2.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(B1().b("proceed_slot_booking", "Are you sure of proceeding future to book slot?"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotAppointmentBookingActivity.n2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotAppointmentBookingActivity.o2(dialog, this, position, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, B1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_slot_booking);
        wh7 wh7VarC = wh7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wh7VarC, "inflate(...)");
        Y1(wh7VarC);
        setContentView(z1().b());
        ta3.a.V1(this, z1());
        c2(new wa3(this));
        h2(VahanProService.INSTANCE.a(this));
        d2(new ProgressDialog(this));
        D1().setMessage(B1().b("label_challan_please_wait", "Please wait..."));
        D1().setCancelable(false);
        D1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            if (getIntent().hasExtra("appl_no")) {
                String stringExtra = getIntent().getStringExtra("appl_no");
                Intrinsics.checkNotNull(stringExtra);
                this.applNo = stringExtra;
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra2 = getIntent().getStringExtra("stateCd");
                Intrinsics.checkNotNull(stringExtra2);
                this.stateCd = stringExtra2;
            }
            if (getIntent().hasExtra("offCd")) {
                String stringExtra3 = getIntent().getStringExtra("offCd");
                Intrinsics.checkNotNull(stringExtra3);
                this.offCd = stringExtra3;
            }
            if (getIntent().hasExtra("purCd")) {
                String stringExtra4 = getIntent().getStringExtra("purCd");
                Intrinsics.checkNotNull(stringExtra4);
                this.purCd = stringExtra4;
            }
            if (getIntent().hasExtra("rcNo")) {
                String stringExtra5 = getIntent().getStringExtra("rcNo");
                Intrinsics.checkNotNull(stringExtra5);
                this.rcNo = stringExtra5;
            }
            if (getIntent().hasExtra("vehicleClass")) {
                this.vehicleClass = getIntent().getIntExtra("vehicleClass", 0);
            }
            if (getIntent().hasExtra("vehicleCat")) {
                String stringExtra6 = getIntent().getStringExtra("vehicleCat");
                Intrinsics.checkNotNull(stringExtra6);
                this.vehicleCat = stringExtra6;
            }
            if (getIntent().hasExtra("ownerName")) {
                String stringExtra7 = getIntent().getStringExtra("ownerName");
                Intrinsics.checkNotNull(stringExtra7);
                this.ownerName = stringExtra7;
            }
            if (getIntent().hasExtra("vehicleClassDes")) {
                String stringExtra8 = getIntent().getStringExtra("vehicleClassDes");
                Intrinsics.checkNotNull(stringExtra8);
                this.vehicleClassDes = stringExtra8;
            }
            if (getIntent().hasExtra("availableDates")) {
                ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("availableDates");
                Intrinsics.checkNotNull(stringArrayListExtra);
                this.availableDate = stringArrayListExtra;
            }
            if (getIntent().hasExtra("alreadyBookedDates")) {
                ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("alreadyBookedDates");
                Intrinsics.checkNotNull(stringArrayListExtra2);
                this.alreadyBookedDate = stringArrayListExtra2;
            }
            if (getIntent().hasExtra("holidayDeclareDates")) {
                ArrayList<String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("holidayDeclareDates");
                Intrinsics.checkNotNull(stringArrayListExtra3);
                this.holidayDate = stringArrayListExtra3;
            }
            X1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
            W1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
            f2(String.valueOf(getIntent().getStringExtra("RC")));
            if (getIntent().hasExtra("RcDetails")) {
                Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
                g2((NrvDetails) serializableExtra);
            }
            z1().p.setText(B1().b("view_vehicle_details", "View Vehicle Details"));
            z1().o.setText(B1().b("vehicle_number", "Vehicle No. ") + ':' + F1());
            z1().i.setText(VContant.INSTANCE.L(this, this.purCd));
            z1().p.setPaintFlags(z1().p.getPaintFlags() | 8);
            z1().p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g36
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SlotAppointmentBookingActivity.S1(this.a, view);
                }
            });
            U1();
        }
        O1();
    }

    public final void p2(String it) {
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
        textView.setText(B1().b("btn_ok", "Ok"));
        ((TextView) viewFindViewById4).setText(B1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotAppointmentBookingActivity.q2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotAppointmentBookingActivity.r2(dialog, view);
            }
        });
        dialog.show();
    }

    public final Date v1(String dateToFormat, String inputFormat, String outputFormat) {
        Intrinsics.checkNotNullParameter(dateToFormat, "dateToFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new SimpleDateFormat(inputFormat).parse(dateToFormat);
            String str = date != null ? new SimpleDateFormat(outputFormat).format(date) : null;
            if (str != null) {
                return simpleDateFormat.parse(str);
            }
            return null;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String w1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String x1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final String getApplNo() {
        return this.applNo;
    }

    public final wh7 z1() {
        wh7 wh7Var = this.binding;
        if (wh7Var != null) {
            return wh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}
