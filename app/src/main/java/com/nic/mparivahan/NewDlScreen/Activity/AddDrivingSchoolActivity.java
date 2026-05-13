package com.nic.mparivahan.NewDlScreen.Activity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity;
import com.nic.mparivahan.NewDlScreen.Modal.CheckCovs;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolModal;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.NewDlScreen.Modal.StateWiseDrivingSchoolList;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import com.zepto.d86;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.n74;
import com.zepto.o74;
import com.zepto.p9;
import com.zepto.pq;
import com.zepto.t84;
import com.zepto.ta3;
import com.zepto.tj;
import com.zepto.wa3;
import com.zepto.wl5;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bf\u0010gJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u001a\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u0002070\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00105R\u0016\u0010N\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010;R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00105R\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR*\u0010\\\u001a\n U*\u0004\u0018\u00010T0T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010;R\u0016\u0010a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Activity/AddDrivingSchoolActivity;", "Lcom/zepto/pq;", "", "E1", "F1", "J1", "B1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/DrivingSchoolDetRequestModal;", "addedDSchoolData", "b2", "Landroid/app/DatePickerDialog$OnDateSetListener;", "dateSetListener", "A1", "X1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "firstDate", "secondDate", "", "C1", "", "position", "D1", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "onKeyUp", "Lcom/zepto/p9;", "C", "Lcom/zepto/p9;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "H1", "()Landroid/app/ProgressDialog;", "Z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/t84;", "E", "Lcom/zepto/t84;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/NewDLService;", "F", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/NewDLService;", "service", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "G", "Ljava/util/ArrayList;", "llDetails", "Lcom/nic/mparivahan/NewDlScreen/Modal/CheckCovs;", "H", "checkedCovs", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "G1", "()Lcom/zepto/wa3;", "Y1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "J", "Lcom/zepto/wl5;", "I1", "()Lcom/zepto/wl5;", "a2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/nic/mparivahan/NewDlScreen/Modal/StateWiseDrivingSchoolList;", "K", "dSchoolList", "L", "clickedTrainingDate", "M", "Lcom/zepto/tj;", "N", "Lcom/zepto/tj;", "addedDSchoolAdapter", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "O", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "P", "editedPos", "Q", "Z", "fromEdit", "Landroid/content/SharedPreferences;", "R", "Landroid/content/SharedPreferences;", "pref", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAddDrivingSchoolActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDrivingSchoolActivity.kt\ncom/nic/mparivahan/NewDlScreen/Activity/AddDrivingSchoolActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,672:1\n1855#2,2:673\n1855#2,2:675\n*S KotlinDebug\n*F\n+ 1 AddDrivingSchoolActivity.kt\ncom/nic/mparivahan/NewDlScreen/Activity/AddDrivingSchoolActivity\n*L\n164#1:673,2\n225#1:675,2\n*E\n"})
public final class AddDrivingSchoolActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public p9 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public t84 viewModal;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NewDLService service;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int clickedTrainingDate;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public tj addedDSchoolAdapter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean fromEdit;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public SharedPreferences pref;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList llDetails = new ArrayList();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList checkedCovs = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList dSchoolList = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList addedDSchoolData = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int editedPos = -1;

    public static final class a implements d86.b {
        public a() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            String covCode = ((CheckCovs) AddDrivingSchoolActivity.this.checkedCovs.get(i)).getCovCode();
            p9 p9Var = AddDrivingSchoolActivity.this.binding;
            p9 p9Var2 = null;
            if (p9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var = null;
            }
            p9Var.X.setText(str);
            p9 p9Var3 = AddDrivingSchoolActivity.this.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var3 = null;
            }
            p9Var3.X.setContentDescription(covCode);
            p9 p9Var4 = AddDrivingSchoolActivity.this.binding;
            if (p9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var4 = null;
            }
            if (StringsKt__StringsJVMKt.equals(p9Var4.X.getText().toString(), "Select", true)) {
                p9 p9Var5 = AddDrivingSchoolActivity.this.binding;
                if (p9Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    p9Var5 = null;
                }
                p9Var5.P.setVisibility(8);
                p9 p9Var6 = AddDrivingSchoolActivity.this.binding;
                if (p9Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    p9Var2 = p9Var6;
                }
                p9Var2.S.setVisibility(8);
            } else {
                p9 p9Var7 = AddDrivingSchoolActivity.this.binding;
                if (p9Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    p9Var7 = null;
                }
                p9Var7.P.setVisibility(0);
                p9 p9Var8 = AddDrivingSchoolActivity.this.binding;
                if (p9Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    p9Var2 = p9Var8;
                }
                p9Var2.S.setVisibility(0);
            }
            AddDrivingSchoolActivity.this.fromEdit = false;
        }
    }

    public static final class b implements d86.b {
        public b() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            String code = ((StateWiseDrivingSchoolList) AddDrivingSchoolActivity.this.dSchoolList.get(i)).getCode();
            p9 p9Var = AddDrivingSchoolActivity.this.binding;
            p9 p9Var2 = null;
            if (p9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var = null;
            }
            p9Var.G.setText(str);
            p9 p9Var3 = AddDrivingSchoolActivity.this.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var2 = p9Var3;
            }
            p9Var2.G.setContentDescription(code);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(DrivingSchoolModal drivingSchoolModal) {
            try {
                if (AddDrivingSchoolActivity.this.H1().isShowing()) {
                    AddDrivingSchoolActivity.this.H1().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(drivingSchoolModal.getStatusDesc(), "Success", true)) {
                    AddDrivingSchoolActivity addDrivingSchoolActivity = AddDrivingSchoolActivity.this;
                    ArrayList<StateWiseDrivingSchoolList> stateWiseSchoolList = drivingSchoolModal.getStateWiseSchoolList();
                    Intrinsics.checkNotNull(stateWiseSchoolList);
                    addDrivingSchoolActivity.dSchoolList = stateWiseSchoolList;
                }
            } catch (Exception unused) {
                if (AddDrivingSchoolActivity.this.H1().isShowing()) {
                    AddDrivingSchoolActivity.this.H1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrivingSchoolModal) obj);
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
            if (AddDrivingSchoolActivity.this.H1().isShowing()) {
                AddDrivingSchoolActivity.this.H1().dismiss();
            }
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    private final void F1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            this.llDetails = parcelableArrayListExtra;
        }
        SharedPreferences sharedPreferences = this.pref;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("addedDSchoolDetails", null);
        if (kt6.d(string)) {
            Type type = new TypeToken<List<? extends DrivingSchoolDetRequestModal>>() { // from class: com.nic.mparivahan.NewDlScreen.Activity.AddDrivingSchoolActivity$getIntentData$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objFromJson = new Gson().fromJson(string, type);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.addedDSchoolData = (ArrayList) objFromJson;
        }
        if (this.addedDSchoolData.size() > 0) {
            b2(this.addedDSchoolData);
        }
        if (this.llDetails.size() > 0) {
            ArrayList<CheckCovs> checkCovs = ((LLDetailsResultModal) this.llDetails.get(0)).getCheckCovs();
            this.checkedCovs = checkCovs;
            if (checkCovs.size() > 0) {
                int size = this.addedDSchoolData.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.areEqual(((CheckCovs) this.checkedCovs.get(0)).getCovCode(), ((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(i)).getCovcd())) {
                        this.checkedCovs.remove(0);
                    }
                }
            }
        }
    }

    private final void J1() {
        p9 p9Var = this.binding;
        p9 p9Var2 = null;
        if (p9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var = null;
        }
        p9Var.V.setFocusable(false);
        p9 p9Var3 = this.binding;
        if (p9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var3 = null;
        }
        p9Var3.T.setFocusable(false);
        p9 p9Var4 = this.binding;
        if (p9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var4 = null;
        }
        p9Var4.z.setFocusable(false);
        p9 p9Var5 = this.binding;
        if (p9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var5 = null;
        }
        p9Var5.H.setFocusable(false);
        a2(new wl5(this));
        Y1(new wa3(this));
        Z1(new ProgressDialog(this));
        H1().setMessage(G1().b("label_challan_please_wait", getString(R.string.please_wait)));
        H1().setCancelable(true);
        H1().setCanceledOnTouchOutside(true);
        p9 p9Var6 = this.binding;
        if (p9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var6 = null;
        }
        p9Var6.M.f.setText(I1().k());
        this.service = NewDLService.INSTANCE.a(this);
        NewDLService newDLService = this.service;
        if (newDLService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newDLService = null;
        }
        this.viewModal = (t84) new z(this, new n74(new o74(newDLService))).a(t84.class);
        p9 p9Var7 = this.binding;
        if (p9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var7 = null;
        }
        p9Var7.X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.si
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.K1(this.a, view);
            }
        });
        p9 p9Var8 = this.binding;
        if (p9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var8 = null;
        }
        p9Var8.S.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.Q1(this.a, view);
            }
        });
        p9 p9Var9 = this.binding;
        if (p9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var9 = null;
        }
        p9Var9.R.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.aj
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AddDrivingSchoolActivity.R1(this.a, compoundButton, z);
            }
        });
        p9 p9Var10 = this.binding;
        if (p9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var10 = null;
        }
        p9Var10.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.S1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.cj
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                AddDrivingSchoolActivity.T1(this.a, datePicker, i, i2, i3);
            }
        };
        p9 p9Var11 = this.binding;
        if (p9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var11 = null;
        }
        p9Var11.V.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.U1(this.a, onDateSetListener, view);
            }
        });
        p9 p9Var12 = this.binding;
        if (p9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var12 = null;
        }
        p9Var12.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.V1(this.a, onDateSetListener, view);
            }
        });
        p9 p9Var13 = this.binding;
        if (p9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var13 = null;
        }
        p9Var13.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.W1(this.a, onDateSetListener, view);
            }
        });
        p9 p9Var14 = this.binding;
        if (p9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var14 = null;
        }
        p9Var14.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ui
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.L1(this.a, onDateSetListener, view);
            }
        });
        p9 p9Var15 = this.binding;
        if (p9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var15 = null;
        }
        p9Var15.O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.M1(this.a, view);
            }
        });
        p9 p9Var16 = this.binding;
        if (p9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var16 = null;
        }
        p9Var16.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.N1(this.a, view);
            }
        });
        p9 p9Var17 = this.binding;
        if (p9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var17 = null;
        }
        p9Var17.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.O1(this.a, view);
            }
        });
        p9 p9Var18 = this.binding;
        if (p9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p9Var2 = p9Var18;
        }
        p9Var2.M.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDrivingSchoolActivity.P1(this.a, view);
            }
        });
    }

    public static final void K1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkedCovs.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this$0.checkedCovs.iterator();
            while (it.hasNext()) {
                String covAbbrDesc = ((CheckCovs) it.next()).getCovAbbrDesc();
                Intrinsics.checkNotNull(covAbbrDesc);
                arrayList.add(covAbbrDesc);
            }
            d86 d86VarA = d86.INSTANCE.a(this$0.G1().b("select_class_vehicle", this$0.getString(R.string.select_class_of_vehcile)), arrayList);
            d86VarA.k2(this$0.I0(), "DSchoolPicker");
            d86VarA.n2(this$0.new a());
        }
    }

    public static final void L1(AddDrivingSchoolActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.clickedTrainingDate = 0;
        this$0.A1(dateSetListener);
    }

    public static final void M1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p9 p9Var = this$0.binding;
        if (p9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var = null;
        }
        if (p9Var.G.getText().toString().length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("select_d_school", this$0.getString(R.string.select_d_school)), 0).show();
            return;
        }
        p9 p9Var2 = this$0.binding;
        if (p9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var2 = null;
        }
        if (String.valueOf(p9Var2.K.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_enrollement_no", this$0.getString(R.string.enter_enrollment_no)), 0).show();
            return;
        }
        p9 p9Var3 = this$0.binding;
        if (p9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var3 = null;
        }
        if (String.valueOf(p9Var3.H.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_enrollement_date", this$0.getString(R.string.enter_enrollment_date)), 0).show();
            return;
        }
        p9 p9Var4 = this$0.binding;
        if (p9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var4 = null;
        }
        if (String.valueOf(p9Var4.B.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_certificate_number", this$0.getString(R.string.enter_certificate_number)), 0).show();
            return;
        }
        p9 p9Var5 = this$0.binding;
        if (p9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var5 = null;
        }
        if (String.valueOf(p9Var5.z.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_certificate_date", this$0.getString(R.string.enter_certificate_date)), 0).show();
            return;
        }
        p9 p9Var6 = this$0.binding;
        if (p9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var6 = null;
        }
        if (String.valueOf(p9Var6.T.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_trained_from", this$0.getString(R.string.enter_trained_from)), 0).show();
            return;
        }
        p9 p9Var7 = this$0.binding;
        if (p9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var7 = null;
        }
        if (String.valueOf(p9Var7.V.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_trained_to", this$0.getString(R.string.enter_trained_to)), 0).show();
            return;
        }
        p9 p9Var8 = this$0.binding;
        if (p9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var8 = null;
        }
        String strValueOf = String.valueOf(p9Var8.z.getText());
        p9 p9Var9 = this$0.binding;
        if (p9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var9 = null;
        }
        if (this$0.C1(strValueOf, String.valueOf(p9Var9.H.getText()))) {
            Toast.makeText(this$0, this$0.G1().b("enrollment_date_error", this$0.getString(R.string.certificate_date_error)), 0).show();
            return;
        }
        p9 p9Var10 = this$0.binding;
        if (p9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var10 = null;
        }
        String strValueOf2 = String.valueOf(p9Var10.V.getText());
        p9 p9Var11 = this$0.binding;
        if (p9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var11 = null;
        }
        if (this$0.C1(strValueOf2, String.valueOf(p9Var11.T.getText()))) {
            Toast.makeText(this$0, this$0.G1().b("training_from_date_error", this$0.getString(R.string.training_date_error)), 0).show();
            return;
        }
        p9 p9Var12 = this$0.binding;
        if (p9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var12 = null;
        }
        String strValueOf3 = String.valueOf(p9Var12.H.getText());
        p9 p9Var13 = this$0.binding;
        if (p9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var13 = null;
        }
        String string = p9Var13.X.getContentDescription().toString();
        p9 p9Var14 = this$0.binding;
        if (p9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var14 = null;
        }
        String strValueOf4 = String.valueOf(p9Var14.V.getText());
        p9 p9Var15 = this$0.binding;
        if (p9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var15 = null;
        }
        String strValueOf5 = String.valueOf(p9Var15.z.getText());
        p9 p9Var16 = this$0.binding;
        if (p9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var16 = null;
        }
        String strValueOf6 = String.valueOf(p9Var16.B.getText());
        p9 p9Var17 = this$0.binding;
        if (p9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var17 = null;
        }
        String strValueOf7 = String.valueOf(p9Var17.K.getText());
        p9 p9Var18 = this$0.binding;
        if (p9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var18 = null;
        }
        String string2 = p9Var18.G.getContentDescription().toString();
        p9 p9Var19 = this$0.binding;
        if (p9Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var19 = null;
        }
        String strValueOf8 = String.valueOf(p9Var19.T.getText());
        p9 p9Var20 = this$0.binding;
        if (p9Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var20 = null;
        }
        String string3 = p9Var20.X.getText().toString();
        p9 p9Var21 = this$0.binding;
        if (p9Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var21 = null;
        }
        DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = new DrivingSchoolDetRequestModal(strValueOf3, string, strValueOf4, strValueOf5, strValueOf6, strValueOf7, string2, strValueOf8, string3, p9Var21.G.getText().toString());
        p9 p9Var22 = this$0.binding;
        if (p9Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var22 = null;
        }
        if (Intrinsics.areEqual(p9Var22.O.getText(), this$0.G1().b("btn_Update", this$0.getString(R.string.update)))) {
            p9 p9Var23 = this$0.binding;
            if (p9Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var23 = null;
            }
            p9Var23.X.setClickable(true);
            this$0.addedDSchoolData.set(this$0.editedPos, drivingSchoolDetRequestModal);
            p9 p9Var24 = this$0.binding;
            if (p9Var24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var24 = null;
            }
            p9Var24.O.setText(this$0.G1().b("label_save", this$0.getString(R.string.save)));
        } else {
            this$0.addedDSchoolData.add(drivingSchoolDetRequestModal);
        }
        this$0.b2(this$0.addedDSchoolData);
        p9 p9Var25 = this$0.binding;
        if (p9Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var25 = null;
        }
        p9Var25.H.setText("");
        p9 p9Var26 = this$0.binding;
        if (p9Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var26 = null;
        }
        p9Var26.V.setText("");
        p9 p9Var27 = this$0.binding;
        if (p9Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var27 = null;
        }
        p9Var27.T.setText("");
        p9 p9Var28 = this$0.binding;
        if (p9Var28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var28 = null;
        }
        p9Var28.B.setText("");
        p9 p9Var29 = this$0.binding;
        if (p9Var29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var29 = null;
        }
        p9Var29.z.setText("");
        p9 p9Var30 = this$0.binding;
        if (p9Var30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var30 = null;
        }
        p9Var30.K.setText("");
        p9 p9Var31 = this$0.binding;
        if (p9Var31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var31 = null;
        }
        p9Var31.X.setText("");
        p9 p9Var32 = this$0.binding;
        if (p9Var32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var32 = null;
        }
        p9Var32.G.setText("");
        p9 p9Var33 = this$0.binding;
        if (p9Var33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var33 = null;
        }
        p9Var33.S.setVisibility(8);
        p9 p9Var34 = this$0.binding;
        if (p9Var34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var34 = null;
        }
        p9Var34.R.setChecked(false);
        p9 p9Var35 = this$0.binding;
        if (p9Var35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var35 = null;
        }
        if (Intrinsics.areEqual(p9Var35.O.getText(), this$0.G1().b("label_save", this$0.getString(R.string.save)))) {
            int size = this$0.checkedCovs.size();
            for (int i = 0; i < size; i++) {
                String covCode = ((CheckCovs) this$0.checkedCovs.get(i)).getCovCode();
                p9 p9Var36 = this$0.binding;
                if (p9Var36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    p9Var36 = null;
                }
                if (Intrinsics.areEqual(covCode, p9Var36.X.getContentDescription().toString())) {
                    this$0.checkedCovs.remove(i);
                    return;
                }
            }
        }
    }

    public static final void N1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p9 p9Var = this$0.binding;
        if (p9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var = null;
        }
        if (p9Var.G.getText().toString().length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("select_d_school", this$0.getString(R.string.select_d_school)), 0).show();
            return;
        }
        p9 p9Var2 = this$0.binding;
        if (p9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var2 = null;
        }
        if (String.valueOf(p9Var2.K.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_enrollement_no", this$0.getString(R.string.enter_enrollment_no)), 0).show();
            return;
        }
        p9 p9Var3 = this$0.binding;
        if (p9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var3 = null;
        }
        if (String.valueOf(p9Var3.H.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_enrollement_date", this$0.getString(R.string.enter_enrollment_date)), 0).show();
            return;
        }
        p9 p9Var4 = this$0.binding;
        if (p9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var4 = null;
        }
        if (String.valueOf(p9Var4.B.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_certificate_number", this$0.getString(R.string.enter_certificate_number)), 0).show();
            return;
        }
        p9 p9Var5 = this$0.binding;
        if (p9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var5 = null;
        }
        if (String.valueOf(p9Var5.z.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_certificate_date", this$0.getString(R.string.enter_certificate_date)), 0).show();
            return;
        }
        p9 p9Var6 = this$0.binding;
        if (p9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var6 = null;
        }
        if (String.valueOf(p9Var6.T.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_trained_from", this$0.getString(R.string.enter_trained_from)), 0).show();
            return;
        }
        p9 p9Var7 = this$0.binding;
        if (p9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var7 = null;
        }
        if (String.valueOf(p9Var7.V.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.G1().b("enter_trained_to", this$0.getString(R.string.enter_trained_to)), 0).show();
            return;
        }
        p9 p9Var8 = this$0.binding;
        if (p9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var8 = null;
        }
        String strValueOf = String.valueOf(p9Var8.z.getText());
        p9 p9Var9 = this$0.binding;
        if (p9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var9 = null;
        }
        if (this$0.C1(strValueOf, String.valueOf(p9Var9.H.getText()))) {
            Toast.makeText(this$0, this$0.G1().b("enrollment_date_error", this$0.getString(R.string.certificate_date_error)), 0).show();
            return;
        }
        p9 p9Var10 = this$0.binding;
        if (p9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var10 = null;
        }
        String strValueOf2 = String.valueOf(p9Var10.V.getText());
        p9 p9Var11 = this$0.binding;
        if (p9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var11 = null;
        }
        if (this$0.C1(strValueOf2, String.valueOf(p9Var11.T.getText()))) {
            Toast.makeText(this$0, this$0.G1().b("training_from_date_error", this$0.getString(R.string.training_date_error)), 0).show();
            return;
        }
        p9 p9Var12 = this$0.binding;
        if (p9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var12 = null;
        }
        String strValueOf3 = String.valueOf(p9Var12.H.getText());
        p9 p9Var13 = this$0.binding;
        if (p9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var13 = null;
        }
        String string = p9Var13.X.getContentDescription().toString();
        p9 p9Var14 = this$0.binding;
        if (p9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var14 = null;
        }
        String strValueOf4 = String.valueOf(p9Var14.V.getText());
        p9 p9Var15 = this$0.binding;
        if (p9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var15 = null;
        }
        String strValueOf5 = String.valueOf(p9Var15.z.getText());
        p9 p9Var16 = this$0.binding;
        if (p9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var16 = null;
        }
        String strValueOf6 = String.valueOf(p9Var16.B.getText());
        p9 p9Var17 = this$0.binding;
        if (p9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var17 = null;
        }
        String strValueOf7 = String.valueOf(p9Var17.K.getText());
        p9 p9Var18 = this$0.binding;
        if (p9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var18 = null;
        }
        String string2 = p9Var18.G.getContentDescription().toString();
        p9 p9Var19 = this$0.binding;
        if (p9Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var19 = null;
        }
        String strValueOf8 = String.valueOf(p9Var19.T.getText());
        p9 p9Var20 = this$0.binding;
        if (p9Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var20 = null;
        }
        String string3 = p9Var20.X.getText().toString();
        p9 p9Var21 = this$0.binding;
        if (p9Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var21 = null;
        }
        this$0.addedDSchoolData.add(new DrivingSchoolDetRequestModal(strValueOf3, string, strValueOf4, strValueOf5, strValueOf6, strValueOf7, string2, strValueOf8, string3, p9Var21.G.getText().toString()));
        this$0.b2(this$0.addedDSchoolData);
        p9 p9Var22 = this$0.binding;
        if (p9Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var22 = null;
        }
        p9Var22.H.setText("");
        p9 p9Var23 = this$0.binding;
        if (p9Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var23 = null;
        }
        p9Var23.V.setText("");
        p9 p9Var24 = this$0.binding;
        if (p9Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var24 = null;
        }
        p9Var24.T.setText("");
        p9 p9Var25 = this$0.binding;
        if (p9Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var25 = null;
        }
        p9Var25.B.setText("");
        p9 p9Var26 = this$0.binding;
        if (p9Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var26 = null;
        }
        p9Var26.z.setText("");
        p9 p9Var27 = this$0.binding;
        if (p9Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var27 = null;
        }
        p9Var27.K.setText("");
        p9 p9Var28 = this$0.binding;
        if (p9Var28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var28 = null;
        }
        p9Var28.X.setText("");
        p9 p9Var29 = this$0.binding;
        if (p9Var29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var29 = null;
        }
        p9Var29.G.setText("");
        p9 p9Var30 = this$0.binding;
        if (p9Var30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var30 = null;
        }
        p9Var30.S.setVisibility(8);
        p9 p9Var31 = this$0.binding;
        if (p9Var31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var31 = null;
        }
        p9Var31.R.setChecked(false);
        int size = this$0.checkedCovs.size();
        for (int i = 0; i < size; i++) {
            String covCode = ((CheckCovs) this$0.checkedCovs.get(i)).getCovCode();
            p9 p9Var32 = this$0.binding;
            if (p9Var32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var32 = null;
            }
            if (Intrinsics.areEqual(covCode, p9Var32.X.getContentDescription().toString())) {
                this$0.checkedCovs.remove(i);
                return;
            }
        }
    }

    public static final void O1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X1();
    }

    public static final void P1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X1();
    }

    public static final void Q1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p9 p9Var = this$0.binding;
        p9 p9Var2 = null;
        if (p9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var = null;
        }
        if (!p9Var.R.isChecked()) {
            p9 p9Var3 = this$0.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var3 = null;
            }
            p9Var3.R.setChecked(true);
            p9 p9Var4 = this$0.binding;
            if (p9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var4 = null;
            }
            p9Var4.J.setVisibility(0);
            p9 p9Var5 = this$0.binding;
            if (p9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var2 = p9Var5;
            }
            p9Var2.F.setVisibility(0);
            this$0.B1();
            return;
        }
        p9 p9Var6 = this$0.binding;
        if (p9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var6 = null;
        }
        p9Var6.R.setChecked(false);
        p9 p9Var7 = this$0.binding;
        if (p9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var7 = null;
        }
        p9Var7.J.setVisibility(8);
        p9 p9Var8 = this$0.binding;
        if (p9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var8 = null;
        }
        p9Var8.F.setVisibility(8);
        p9 p9Var9 = this$0.binding;
        if (p9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var9 = null;
        }
        p9Var9.E.setVisibility(8);
        p9 p9Var10 = this$0.binding;
        if (p9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p9Var2 = p9Var10;
        }
        p9Var2.O.setVisibility(8);
    }

    public static final void R1(AddDrivingSchoolActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p9 p9Var = null;
        if (z) {
            p9 p9Var2 = this$0.binding;
            if (p9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var2 = null;
            }
            p9Var2.J.setVisibility(0);
            p9 p9Var3 = this$0.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var3;
            }
            p9Var.F.setVisibility(0);
            this$0.B1();
            return;
        }
        p9 p9Var4 = this$0.binding;
        if (p9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var4 = null;
        }
        p9Var4.J.setVisibility(8);
        p9 p9Var5 = this$0.binding;
        if (p9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var5 = null;
        }
        p9Var5.F.setVisibility(8);
        p9 p9Var6 = this$0.binding;
        if (p9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var6 = null;
        }
        p9Var6.E.setVisibility(8);
        p9 p9Var7 = this$0.binding;
        if (p9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p9Var = p9Var7;
        }
        p9Var.O.setVisibility(8);
    }

    public static final void S1(AddDrivingSchoolActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.dSchoolList.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this$0.dSchoolList.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateWiseDrivingSchoolList) it.next()).getName());
            }
            d86 d86VarA = d86.INSTANCE.a(this$0.G1().b("select_d_school", this$0.getString(R.string.select_d_school)), arrayList);
            d86VarA.k2(this$0.I0(), "DSchoolPicker");
            d86VarA.n2(this$0.new b());
        }
    }

    public static final void T1(AddDrivingSchoolActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        int i4 = this$0.clickedTrainingDate;
        p9 p9Var = null;
        if (i4 == 0) {
            p9 p9Var2 = this$0.binding;
            if (p9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var2;
            }
            p9Var.H.setText(str + '-' + str2 + '-' + str3);
            return;
        }
        if (i4 == 1) {
            p9 p9Var3 = this$0.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var3;
            }
            p9Var.z.setText(str + '-' + str2 + '-' + str3);
            return;
        }
        if (i4 == 2) {
            p9 p9Var4 = this$0.binding;
            if (p9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var4;
            }
            p9Var.T.setText(str + '-' + str2 + '-' + str3);
            return;
        }
        if (i4 != 3) {
            return;
        }
        p9 p9Var5 = this$0.binding;
        if (p9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p9Var = p9Var5;
        }
        p9Var.V.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void U1(AddDrivingSchoolActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.clickedTrainingDate = 3;
        this$0.A1(dateSetListener);
    }

    public static final void V1(AddDrivingSchoolActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.clickedTrainingDate = 2;
        this$0.A1(dateSetListener);
    }

    public static final void W1(AddDrivingSchoolActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.clickedTrainingDate = 1;
        this$0.A1(dateSetListener);
    }

    public final void A1(DatePickerDialog.OnDateSetListener dateSetListener) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, dateSetListener, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public final void B1() {
        p9 p9Var = null;
        if (this.fromEdit) {
            p9 p9Var2 = this.binding;
            if (p9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var2;
            }
            p9Var.O.setVisibility(0);
            return;
        }
        if (this.checkedCovs.size() > 1) {
            p9 p9Var3 = this.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var3 = null;
            }
            p9Var3.E.setVisibility(0);
            p9 p9Var4 = this.binding;
            if (p9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var4;
            }
            p9Var.O.setVisibility(8);
            return;
        }
        if (this.checkedCovs.size() != 1) {
            p9 p9Var5 = this.binding;
            if (p9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var = p9Var5;
            }
            p9Var.P.setVisibility(8);
            return;
        }
        p9 p9Var6 = this.binding;
        if (p9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var6 = null;
        }
        p9Var6.E.setVisibility(8);
        p9 p9Var7 = this.binding;
        if (p9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p9Var = p9Var7;
        }
        p9Var.O.setVisibility(0);
    }

    public final boolean C1(String firstDate, String secondDate) {
        Intrinsics.checkNotNullParameter(firstDate, "firstDate");
        Intrinsics.checkNotNullParameter(secondDate, "secondDate");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = simpleDateFormat.parse(firstDate);
            Date date2 = simpleDateFormat.parse(secondDate);
            Intrinsics.checkNotNull(date);
            return date.before(date2);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public final void D1(int position) {
        this.editedPos = position;
        this.fromEdit = true;
        if (this.addedDSchoolData.size() > 0) {
            p9 p9Var = this.binding;
            p9 p9Var2 = null;
            if (p9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var = null;
            }
            p9Var.P.setVisibility(0);
            p9 p9Var3 = this.binding;
            if (p9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var3 = null;
            }
            p9Var3.X.setClickable(false);
            p9 p9Var4 = this.binding;
            if (p9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var4 = null;
            }
            p9Var4.K.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getEnrollNo());
            p9 p9Var5 = this.binding;
            if (p9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var5 = null;
            }
            p9Var5.H.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getEnrollDate());
            p9 p9Var6 = this.binding;
            if (p9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var6 = null;
            }
            p9Var6.B.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getCertNo());
            p9 p9Var7 = this.binding;
            if (p9Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var7 = null;
            }
            p9Var7.z.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getCertDate());
            p9 p9Var8 = this.binding;
            if (p9Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var8 = null;
            }
            p9Var8.T.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getTrainFrom());
            p9 p9Var9 = this.binding;
            if (p9Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var9 = null;
            }
            p9Var9.V.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getTrainTo());
            p9 p9Var10 = this.binding;
            if (p9Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var10 = null;
            }
            p9Var10.X.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getVehicleClassName());
            p9 p9Var11 = this.binding;
            if (p9Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var11 = null;
            }
            p9Var11.G.setText(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getDrivingSchoolName());
            p9 p9Var12 = this.binding;
            if (p9Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var12 = null;
            }
            p9Var12.G.setContentDescription(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getDschoolCode());
            p9 p9Var13 = this.binding;
            if (p9Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var13 = null;
            }
            p9Var13.X.setContentDescription(((DrivingSchoolDetRequestModal) this.addedDSchoolData.get(position)).getCovcd());
            p9 p9Var14 = this.binding;
            if (p9Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var14 = null;
            }
            p9Var14.N.setVisibility(8);
            p9 p9Var15 = this.binding;
            if (p9Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var15 = null;
            }
            p9Var15.O.setVisibility(0);
            p9 p9Var16 = this.binding;
            if (p9Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var16 = null;
            }
            p9Var16.O.setText(G1().b("btn_Update", getString(R.string.update)));
            p9 p9Var17 = this.binding;
            if (p9Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var17 = null;
            }
            p9Var17.S.setVisibility(0);
            p9 p9Var18 = this.binding;
            if (p9Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                p9Var2 = p9Var18;
            }
            p9Var2.R.setChecked(true);
        }
    }

    public final void E1() {
        try {
            if (H1().isShowing()) {
                H1().dismiss();
            }
            H1().show();
            t84 t84Var = this.viewModal;
            if (t84Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
                t84Var = null;
            }
            t84Var.h(((LLDetailsResultModal) this.llDetails.get(0)).getLlFromState1().get(0).getLlFromState1Code());
        } catch (Exception e2) {
            e2.printStackTrace();
            if (H1().isShowing()) {
                H1().dismiss();
            }
        }
    }

    public final wa3 G1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 I1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void X1() {
        SharedPreferences sharedPreferences = this.pref;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("addedDSchoolDetails", new Gson().toJson(this.addedDSchoolData));
        editorEdit.apply();
        onBackPressed();
    }

    public final void Y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void Z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void a2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void b2(ArrayList addedDSchoolData) {
        if (addedDSchoolData.size() > 0) {
            this.addedDSchoolAdapter = new tj(this, addedDSchoolData, G1());
            p9 p9Var = this.binding;
            tj tjVar = null;
            if (p9Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var = null;
            }
            p9Var.w.setLayoutManager(new LinearLayoutManager(this, 1, false));
            p9 p9Var2 = this.binding;
            if (p9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                p9Var2 = null;
            }
            RecyclerView recyclerView = p9Var2.w;
            tj tjVar2 = this.addedDSchoolAdapter;
            if (tjVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addedDSchoolAdapter");
            } else {
                tjVar = tjVar2;
            }
            recyclerView.setAdapter(tjVar);
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        p9 p9VarX = p9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(p9VarX, "inflate(...)");
        this.binding = p9VarX;
        t84 t84Var = null;
        if (p9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9VarX = null;
        }
        setContentView(p9VarX.m());
        ta3.a aVar = ta3.a;
        p9 p9Var = this.binding;
        if (p9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p9Var = null;
        }
        aVar.v(this, p9Var);
        SharedPreferences sharedPreferences = getSharedPreferences("AddVehicleClass", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.pref = sharedPreferences;
        F1();
        J1();
        E1();
        t84 t84Var2 = this.viewModal;
        if (t84Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            t84Var2 = null;
        }
        t84Var2.j().g(this, new e(new c()));
        t84 t84Var3 = this.viewModal;
        if (t84Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            t84Var = t84Var3;
        }
        t84Var.m().g(this, new e(new d()));
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        X1();
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        X1();
        return true;
    }
}
