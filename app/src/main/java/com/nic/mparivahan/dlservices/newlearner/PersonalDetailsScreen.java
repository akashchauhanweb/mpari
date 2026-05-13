package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryMasterResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.EducationQualResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.QualificationMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.zepto.b85;
import com.zepto.be;
import com.zepto.i94;
import com.zepto.j94;
import com.zepto.k94;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0003J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010*\u001a\n '*\u0004\u0018\u00010&0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010!R\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010$R\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020F0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010!R\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010$R\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010!R\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010$R\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010$R\u0016\u0010S\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u00102R\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010$R\u0016\u0010W\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010$R\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010$R\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010$R\u0016\u0010^\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00106R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010_R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010$R\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010$R\u0016\u0010e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010$R\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/PersonalDetailsScreen;", "Lcom/zepto/pq;", "", "haveAadhaarData", "", "h2", "", "message", "c2", "N1", "e2", "P1", "g2", "f2", "O1", "L1", "T1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Q1", "", "dayOfMonth", "month", "year", "M1", "Lcom/zepto/be;", "C", "Lcom/zepto/be;", "binding", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/Relationship;", "D", "Ljava/util/ArrayList;", "relationList", "E", "Ljava/lang/String;", "selectedRelationCode", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "F", "Ljava/util/Calendar;", "cal", "G", "formattedDate", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/wl5;", "I", "Lcom/zepto/wl5;", "sarthiSession", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "session", "Lcom/zepto/j94;", "K", "Lcom/zepto/j94;", "learnerLicenceVM", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "L", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "service", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/CountryMasterResponseModal;", "M", "countryList", "N", "selectedCountryCode", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/QualificationMasterDataModal;", "O", "educationQualList", "P", "selectedEduQualificationCode", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/BloodGroupMasterDataModal;", "Q", "bloodGroupList", "R", "selectedBloodGroup", "S", "selectedGenderValue", "T", "calculatedAge", "U", "selectedStateCd", "V", "selectedRtoCd", "W", "selectedRtoName", "X", "alreadyMobileNo", "", "Y", "ekycID", "Z", "a0", "aadhaarLastFourDigitMobileNo", "b0", "cmCampDesc", "c0", "cmType", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "d0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PersonalDetailsScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public be binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String formattedDate;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public j94 learnerLicenceVM;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public NewLLServices service;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int calculatedAge;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public long ekycID;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public boolean haveAadhaarData;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList relationList = new ArrayList();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String selectedRelationCode = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList countryList = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String selectedCountryCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ArrayList educationQualList = new ArrayList();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String selectedEduQualificationCode = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList bloodGroupList = new ArrayList();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String selectedBloodGroup = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String selectedGenderValue = VContant.MAINSCREEN;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String selectedStateCd = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String selectedRtoCd = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String selectedRtoName = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String alreadyMobileNo = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String cmCampDesc = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String cmType = "";

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 0) {
                be beVar = PersonalDetailsScreen.this.binding;
                be beVar2 = null;
                if (beVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar = null;
                }
                if (String.valueOf(beVar.F.getText()).length() <= 0) {
                    be beVar3 = PersonalDetailsScreen.this.binding;
                    if (beVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        beVar3 = null;
                    }
                    EditText editText = beVar3.f0;
                    StringBuilder sb = new StringBuilder();
                    be beVar4 = PersonalDetailsScreen.this.binding;
                    if (beVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        beVar4 = null;
                    }
                    sb.append((Object) beVar4.y.getText());
                    sb.append(' ');
                    be beVar5 = PersonalDetailsScreen.this.binding;
                    if (beVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        beVar2 = beVar5;
                    }
                    sb.append((Object) beVar2.F.getText());
                    sb.append((Object) charSequence);
                    editText.setText(sb.toString());
                    return;
                }
                be beVar6 = PersonalDetailsScreen.this.binding;
                if (beVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar6 = null;
                }
                EditText editText2 = beVar6.f0;
                StringBuilder sb2 = new StringBuilder();
                be beVar7 = PersonalDetailsScreen.this.binding;
                if (beVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar7 = null;
                }
                sb2.append((Object) beVar7.y.getText());
                sb2.append(' ');
                be beVar8 = PersonalDetailsScreen.this.binding;
                if (beVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    beVar2 = beVar8;
                }
                sb2.append((Object) beVar2.F.getText());
                sb2.append(' ');
                sb2.append((Object) charSequence);
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNull(editable);
            if (editable.length() > 1) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(1, -Integer.parseInt(editable.toString()));
                calendar.add(2, 1);
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                int i3 = calendar.get(5);
                be beVar = PersonalDetailsScreen.this.binding;
                if (beVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar = null;
                }
                TextView textView = beVar.Z;
                StringBuilder sb = new StringBuilder();
                sb.append(i3);
                sb.append('-');
                sb.append(i2);
                sb.append('-');
                sb.append(i);
                textView.setText(sb.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
            personalDetailsScreen.selectedRelationCode = ((Relationship) personalDetailsScreen.relationList.get(i)).getRelationCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
            personalDetailsScreen.selectedCountryCode = ((CountryMasterResponseModal) personalDetailsScreen.countryList.get(i)).getCountryCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
            personalDetailsScreen.selectedEduQualificationCode = ((QualificationMasterDataModal) personalDetailsScreen.educationQualList.get(i)).getQualificationCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
            personalDetailsScreen.selectedBloodGroup = ((BloodGroupMasterDataModal) personalDetailsScreen.bloodGroupList.get(i)).getBloodGroupCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                be beVar = PersonalDetailsScreen.this.binding;
                be beVar2 = null;
                if (beVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar = null;
                }
                if (String.valueOf(beVar.F.getText()).length() <= 0) {
                    be beVar3 = PersonalDetailsScreen.this.binding;
                    if (beVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        beVar3 = null;
                    }
                    EditText editText = beVar3.f0;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    sb.append(' ');
                    be beVar4 = PersonalDetailsScreen.this.binding;
                    if (beVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        beVar4 = null;
                    }
                    sb.append((Object) beVar4.F.getText());
                    be beVar5 = PersonalDetailsScreen.this.binding;
                    if (beVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        beVar2 = beVar5;
                    }
                    sb.append((Object) beVar2.C.getText());
                    editText.setText(sb.toString());
                    return;
                }
                be beVar6 = PersonalDetailsScreen.this.binding;
                if (beVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar6 = null;
                }
                EditText editText2 = beVar6.f0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) charSequence);
                sb2.append(' ');
                be beVar7 = PersonalDetailsScreen.this.binding;
                if (beVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar7 = null;
                }
                sb2.append((Object) beVar7.F.getText());
                sb2.append(' ');
                be beVar8 = PersonalDetailsScreen.this.binding;
                if (beVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    beVar2 = beVar8;
                }
                sb2.append((Object) beVar2.C.getText());
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 0) {
                be beVar = PersonalDetailsScreen.this.binding;
                be beVar2 = null;
                if (beVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar = null;
                }
                EditText editText = beVar.f0;
                StringBuilder sb = new StringBuilder();
                be beVar3 = PersonalDetailsScreen.this.binding;
                if (beVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    beVar3 = null;
                }
                sb.append((Object) beVar3.y.getText());
                sb.append(' ');
                sb.append((Object) charSequence);
                sb.append(' ');
                be beVar4 = PersonalDetailsScreen.this.binding;
                if (beVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    beVar2 = beVar4;
                }
                sb.append((Object) beVar2.C.getText());
                editText.setText(sb.toString());
            }
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(CountryResponseModal countryResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = PersonalDetailsScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = PersonalDetailsScreen.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(countryResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
                    wa3 wa3Var = personalDetailsScreen.session;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var = null;
                    }
                    personalDetailsScreen.c2(wa3Var.b("service_is_not_present", PersonalDetailsScreen.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                PersonalDetailsScreen personalDetailsScreen2 = PersonalDetailsScreen.this;
                ArrayList<CountryMasterResponseModal> drivingSchoolMasterList = countryResponseModal.getDrivingSchoolMasterList();
                Intrinsics.checkNotNull(drivingSchoolMasterList);
                personalDetailsScreen2.countryList = drivingSchoolMasterList;
                if (PersonalDetailsScreen.this.countryList.size() > 0) {
                    PersonalDetailsScreen.this.f2();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = PersonalDetailsScreen.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = PersonalDetailsScreen.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CountryResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(EducationQualResponseModal educationQualResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = PersonalDetailsScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = PersonalDetailsScreen.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(educationQualResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
                    wa3 wa3Var = personalDetailsScreen.session;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var = null;
                    }
                    personalDetailsScreen.c2(wa3Var.b("service_is_not_present", PersonalDetailsScreen.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                PersonalDetailsScreen personalDetailsScreen2 = PersonalDetailsScreen.this;
                ArrayList<QualificationMasterDataModal> qualificationMasterData = educationQualResponseModal.getQualificationMasterData();
                Intrinsics.checkNotNull(qualificationMasterData);
                personalDetailsScreen2.educationQualList = qualificationMasterData;
                if (PersonalDetailsScreen.this.educationQualList.size() > 0) {
                    PersonalDetailsScreen.this.g2();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = PersonalDetailsScreen.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = PersonalDetailsScreen.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EducationQualResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        public final void a(BloodGroupResponseModal bloodGroupResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = PersonalDetailsScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = PersonalDetailsScreen.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(bloodGroupResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
                    ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData = bloodGroupResponseModal.getBloodGroupMasterData();
                    Intrinsics.checkNotNull(bloodGroupMasterData);
                    personalDetailsScreen.bloodGroupList = bloodGroupMasterData;
                    if (PersonalDetailsScreen.this.bloodGroupList.size() > 0) {
                        PersonalDetailsScreen.this.e2();
                        return;
                    }
                    return;
                }
                if (!StringsKt__StringsJVMKt.equals(bloodGroupResponseModal.getStatusCode(), "01", true)) {
                    PersonalDetailsScreen personalDetailsScreen2 = PersonalDetailsScreen.this;
                    wa3 wa3Var = personalDetailsScreen2.session;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var = null;
                    }
                    personalDetailsScreen2.c2(wa3Var.b("service_is_not_present", PersonalDetailsScreen.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData2 = bloodGroupResponseModal.getBloodGroupMasterData();
                Intrinsics.checkNotNull(bloodGroupMasterData2);
                if (kt6.d(bloodGroupMasterData2.get(0).getMasterNotAvailable())) {
                    PersonalDetailsScreen.this.c2(bloodGroupResponseModal.getBloodGroupMasterData().get(0).getMasterNotAvailable());
                    return;
                }
                PersonalDetailsScreen personalDetailsScreen3 = PersonalDetailsScreen.this;
                wa3 wa3Var2 = personalDetailsScreen3.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var2 = null;
                }
                personalDetailsScreen3.c2(wa3Var2.b("service_is_not_present", PersonalDetailsScreen.this.getString(R.string.unable_to_get_details)));
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = PersonalDetailsScreen.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = PersonalDetailsScreen.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((BloodGroupResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1 {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = PersonalDetailsScreen.this.dialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = PersonalDetailsScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            PersonalDetailsScreen personalDetailsScreen = PersonalDetailsScreen.this;
            wa3 wa3Var2 = personalDetailsScreen.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            personalDetailsScreen.c2(wa3Var.b("service_is_not_present", PersonalDetailsScreen.this.getString(R.string.unable_to_get_details)));
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

    private final void N1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            j94 j94Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            j94 j94Var2 = this.learnerLicenceVM;
            if (j94Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            } else {
                j94Var = j94Var2;
            }
            j94Var.j();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void O1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            j94 j94Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            j94 j94Var2 = this.learnerLicenceVM;
            if (j94Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            } else {
                j94Var = j94Var2;
            }
            j94Var.o();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void P1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            j94 j94Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            j94 j94Var2 = this.learnerLicenceVM;
            if (j94Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            } else {
                j94Var = j94Var2;
            }
            j94Var.v();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void R1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void S1(PersonalDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void T1() {
        this.sarthiSession = new wl5(this);
        be beVar = this.binding;
        be beVar2 = null;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        TextView textView = beVar.E.f;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        textView.setText(wl5Var.k());
        be beVar3 = this.binding;
        if (beVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar3 = null;
        }
        beVar3.E.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.U1(this.a, view);
            }
        });
        if (kt6.d(this.alreadyMobileNo)) {
            be beVar4 = this.binding;
            if (beVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar4 = null;
            }
            beVar4.U.setText(this.alreadyMobileNo);
            be beVar5 = this.binding;
            if (beVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar5 = null;
            }
            beVar5.U.setFocusable(0);
        } else {
            be beVar6 = this.binding;
            if (beVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar6 = null;
            }
            beVar6.U.setText("");
            be beVar7 = this.binding;
            if (beVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar7 = null;
            }
            beVar7.U.setFocusable(1);
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.rr4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                PersonalDetailsScreen.V1(this.a, datePicker, i2, i3, i4);
            }
        };
        be beVar8 = this.binding;
        if (beVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar8 = null;
        }
        beVar8.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.W1(this.a, onDateSetListener, view);
            }
        });
        be beVar9 = this.binding;
        if (beVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar9 = null;
        }
        beVar9.w.addTextChangedListener(new b());
        be beVar10 = this.binding;
        if (beVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar10 = null;
        }
        beVar10.M.setOnItemSelectedListener(new c());
        be beVar11 = this.binding;
        if (beVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar11 = null;
        }
        beVar11.O.setOnItemSelectedListener(new d());
        be beVar12 = this.binding;
        if (beVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar12 = null;
        }
        beVar12.Q.setOnItemSelectedListener(new e());
        be beVar13 = this.binding;
        if (beVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar13 = null;
        }
        beVar13.P.setOnItemSelectedListener(new f());
        be beVar14 = this.binding;
        if (beVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar14 = null;
        }
        beVar14.y.addTextChangedListener(new g());
        be beVar15 = this.binding;
        if (beVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar15 = null;
        }
        beVar15.F.addTextChangedListener(new h());
        be beVar16 = this.binding;
        if (beVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar16 = null;
        }
        beVar16.C.addTextChangedListener(new a());
        be beVar17 = this.binding;
        if (beVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar17 = null;
        }
        beVar17.J.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.tr4
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                PersonalDetailsScreen.X1(this.a, radioGroup, i2);
            }
        });
        be beVar18 = this.binding;
        if (beVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar18 = null;
        }
        beVar18.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ur4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.Y1(this.a, view);
            }
        });
        be beVar19 = this.binding;
        if (beVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar19 = null;
        }
        beVar19.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.Z1(this.a, view);
            }
        });
        be beVar20 = this.binding;
        if (beVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            beVar2 = beVar20;
        }
        beVar2.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.a2(this.a, view);
            }
        });
    }

    public static final void U1(PersonalDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1("Are you sure want to go back ?");
    }

    public static final void V1(PersonalDetailsScreen this$0, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i2);
        this$0.cal.set(2, i3);
        this$0.cal.set(5, i4);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        this$0.formattedDate = str + '-' + str2 + '-' + str3;
        be beVar = this$0.binding;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        beVar.Z.setText(str + '-' + str2 + '-' + str3);
        this$0.calculatedAge = this$0.M1(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3));
    }

    public static final void W1(PersonalDetailsScreen this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void X1(PersonalDetailsScreen this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewFindViewById = this$0.findViewById(i2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CharSequence text = ((RadioButton) viewFindViewById).getText();
        this$0.selectedGenderValue = Intrinsics.areEqual(text, "Male") ? VContant.MAINSCREEN : Intrinsics.areEqual(text, "Female") ? VContant.APPLICATION_SCREEN : "0";
    }

    public static final void Y1(PersonalDetailsScreen this$0, View view) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        be beVar = this$0.binding;
        wa3 wa3Var = null;
        wa3 wa3Var2 = null;
        wa3 wa3Var3 = null;
        wa3 wa3Var4 = null;
        wa3 wa3Var5 = null;
        wa3 wa3Var6 = null;
        wa3 wa3Var7 = null;
        wa3 wa3Var8 = null;
        wa3 wa3Var9 = null;
        wa3 wa3Var10 = null;
        wa3 wa3Var11 = null;
        wa3 wa3Var12 = null;
        wa3 wa3Var13 = null;
        wa3 wa3Var14 = null;
        wa3 wa3Var15 = null;
        wa3 wa3Var16 = null;
        wa3 wa3Var17 = null;
        wa3 wa3Var18 = null;
        DOEkycX dOEkycX = null;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        if (String.valueOf(beVar.U.getText()).length() > 8) {
            be beVar2 = this$0.binding;
            if (beVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar2 = null;
            }
            String strValueOf = String.valueOf(beVar2.U.getText());
            be beVar3 = this$0.binding;
            if (beVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar3 = null;
            }
            int length = String.valueOf(beVar3.U.getText()).length() - 4;
            be beVar4 = this$0.binding;
            if (beVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar4 = null;
            }
            strSubstring = strValueOf.substring(length, String.valueOf(beVar4.U.getText()).length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        be beVar5 = this$0.binding;
        if (beVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar5 = null;
        }
        if (beVar5.y.getText().toString().length() == 0) {
            wa3 wa3Var19 = this$0.session;
            if (wa3Var19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var2 = wa3Var19;
            }
            Toast.makeText(this$0, wa3Var2.b("PLEASE_ENTER_FIRST_NAME", this$0.getString(R.string.enter_first_name)), 0).show();
            return;
        }
        be beVar6 = this$0.binding;
        if (beVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar6 = null;
        }
        Editable text = beVar6.y.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 3) {
            wa3 wa3Var20 = this$0.session;
            if (wa3Var20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var3 = wa3Var20;
            }
            Toast.makeText(this$0, wa3Var3.b("PLEASE_ENTER_FIRST_NAME", this$0.getString(R.string.enter_valid_first_name)), 0).show();
            return;
        }
        be beVar7 = this$0.binding;
        if (beVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar7 = null;
        }
        if (beVar7.C.getText().toString().length() == 0) {
            wa3 wa3Var21 = this$0.session;
            if (wa3Var21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var4 = wa3Var21;
            }
            Toast.makeText(this$0, wa3Var4.b("PLEASE_ENTER_LAST_NAME", this$0.getString(R.string.enter_last_name)), 0).show();
            return;
        }
        be beVar8 = this$0.binding;
        if (beVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar8 = null;
        }
        Editable text2 = beVar8.C.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 3) {
            wa3 wa3Var22 = this$0.session;
            if (wa3Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var5 = wa3Var22;
            }
            Toast.makeText(this$0, wa3Var5.b("PLEASE_ENTER_VALID_LAST_NAME", this$0.getString(R.string.enter_valid_last_name)), 0).show();
            return;
        }
        be beVar9 = this$0.binding;
        if (beVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar9 = null;
        }
        Editable text3 = beVar9.f0.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            wa3 wa3Var23 = this$0.session;
            if (wa3Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var6 = wa3Var23;
            }
            Toast.makeText(this$0, wa3Var6.b("PLEASE_ENTER_FULL_NAME", this$0.getString(R.string.enter_full_name)), 0).show();
            return;
        }
        if (StringsKt__StringsJVMKt.equals(this$0.selectedRelationCode, "0", true)) {
            wa3 wa3Var24 = this$0.session;
            if (wa3Var24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var7 = wa3Var24;
            }
            Toast.makeText(this$0, wa3Var7.b("pls_enter_relation", this$0.getString(R.string.error_select_relation)), 0).show();
            return;
        }
        be beVar10 = this$0.binding;
        if (beVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar10 = null;
        }
        if (String.valueOf(beVar10.z.getText()).length() == 0) {
            wa3 wa3Var25 = this$0.session;
            if (wa3Var25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var8 = wa3Var25;
            }
            Toast.makeText(this$0, wa3Var8.b("PLEASE_ENTER_REL_FIRST_NAME", this$0.getString(R.string.rel_first_name)), 0).show();
            return;
        }
        be beVar11 = this$0.binding;
        if (beVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar11 = null;
        }
        Editable text4 = beVar11.z.getText();
        Intrinsics.checkNotNull(text4);
        if (text4.length() < 3) {
            wa3 wa3Var26 = this$0.session;
            if (wa3Var26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var9 = wa3Var26;
            }
            Toast.makeText(this$0, wa3Var9.b("PLEASE_ENTER_REL_VALID_FIRST_NAME", this$0.getString(R.string.rel_valid_first_name)), 0).show();
            return;
        }
        be beVar12 = this$0.binding;
        if (beVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar12 = null;
        }
        if (String.valueOf(beVar12.D.getText()).length() == 0) {
            wa3 wa3Var27 = this$0.session;
            if (wa3Var27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var10 = wa3Var27;
            }
            Toast.makeText(this$0, wa3Var10.b("PLEASE_ENTER_REL_LAST_NAME", this$0.getString(R.string.rel_last_name)), 0).show();
            return;
        }
        be beVar13 = this$0.binding;
        if (beVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar13 = null;
        }
        Editable text5 = beVar13.D.getText();
        Intrinsics.checkNotNull(text5);
        if (text5.length() < 3) {
            wa3 wa3Var28 = this$0.session;
            if (wa3Var28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var11 = wa3Var28;
            }
            Toast.makeText(this$0, wa3Var11.b("PLEASE_ENTER_REL_VALID_FIRST_NAME", this$0.getString(R.string.rel_valid_last_name)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedGenderValue, "")) {
            Toast.makeText(this$0, this$0.getString(R.string.error_gender), 0).show();
            return;
        }
        be beVar14 = this$0.binding;
        if (beVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar14 = null;
        }
        if (beVar14.Z.getText().toString().length() == 0) {
            wa3 wa3Var29 = this$0.session;
            if (wa3Var29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var12 = wa3Var29;
            }
            Toast.makeText(this$0, wa3Var12.b("please_enter_bd", this$0.getString(R.string.please_enter_bd)), 0).show();
            return;
        }
        if (this$0.calculatedAge < 18) {
            wa3 wa3Var30 = this$0.session;
            if (wa3Var30 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var13 = wa3Var30;
            }
            Toast.makeText(this$0, wa3Var13.b("age_above_18", this$0.getString(R.string.error_age)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedCountryCode, "")) {
            wa3 wa3Var31 = this$0.session;
            if (wa3Var31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var14 = wa3Var31;
            }
            Toast.makeText(this$0, wa3Var14.b("edit_dl_serv_selc_country", this$0.getString(R.string.select_country)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedEduQualificationCode, "")) {
            wa3 wa3Var32 = this$0.session;
            if (wa3Var32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var15 = wa3Var32;
            }
            Toast.makeText(this$0, wa3Var15.b("PLEASE_SELECT_EDUCATION", this$0.getString(R.string.select_education)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedBloodGroup, "") || StringsKt__StringsJVMKt.equals(this$0.selectedBloodGroup, "Select Blood Group", true)) {
            wa3 wa3Var33 = this$0.session;
            if (wa3Var33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var33;
            }
            Toast.makeText(this$0, wa3Var.b("PLEASE_SELECT_BG", this$0.getString(R.string.select_bg)), 0).show();
            return;
        }
        be beVar15 = this$0.binding;
        if (beVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar15 = null;
        }
        if (String.valueOf(beVar15.U.getText()).length() == 0) {
            wa3 wa3Var34 = this$0.session;
            if (wa3Var34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var16 = wa3Var34;
            }
            Toast.makeText(this$0, wa3Var16.b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 0).show();
            return;
        }
        be beVar16 = this$0.binding;
        if (beVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar16 = null;
        }
        if (String.valueOf(beVar16.U.getText()).length() < 9) {
            wa3 wa3Var35 = this$0.session;
            if (wa3Var35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var17 = wa3Var35;
            }
            Toast.makeText(this$0, wa3Var17.b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)), 0).show();
            return;
        }
        if (this$0.haveAadhaarData) {
            DOEkycX dOEkycX2 = this$0.adharData;
            if (dOEkycX2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX2 = null;
            }
            if (dOEkycX2.getPhone() == 0 && !Intrinsics.areEqual(strSubstring, this$0.aadhaarLastFourDigitMobileNo)) {
                wa3 wa3Var36 = this$0.session;
                if (wa3Var36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var18 = wa3Var36;
                }
                Toast.makeText(this$0, wa3Var18.b("valid_aadhaar_mobile_no", this$0.getString(R.string.applicant_aadhaar_mobile_error)), 0).show();
                return;
            }
        }
        Intent intent = new Intent(this$0, (Class<?>) LearnerLicenceAddressScreen.class);
        intent.putExtra("stateCd", this$0.selectedStateCd);
        intent.putExtra("rtoCd", this$0.selectedRtoCd);
        intent.putExtra("rtoName", this$0.selectedRtoName);
        be beVar17 = this$0.binding;
        if (beVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar17 = null;
        }
        intent.putExtra("applicantFName", beVar17.y.getText().toString());
        be beVar18 = this$0.binding;
        if (beVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar18 = null;
        }
        intent.putExtra("applicantMName", String.valueOf(beVar18.F.getText()));
        be beVar19 = this$0.binding;
        if (beVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar19 = null;
        }
        intent.putExtra("applicantLName", beVar19.C.getText().toString());
        be beVar20 = this$0.binding;
        if (beVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar20 = null;
        }
        intent.putExtra("fullName", beVar20.f0.getText().toString());
        intent.putExtra("relationship", this$0.selectedRelationCode);
        be beVar21 = this$0.binding;
        if (beVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar21 = null;
        }
        intent.putExtra("relationFName", String.valueOf(beVar21.z.getText()));
        be beVar22 = this$0.binding;
        if (beVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar22 = null;
        }
        intent.putExtra("relationMName", String.valueOf(beVar22.G.getText()));
        be beVar23 = this$0.binding;
        if (beVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar23 = null;
        }
        intent.putExtra("relationLName", String.valueOf(beVar23.D.getText()));
        intent.putExtra("gender", this$0.selectedGenderValue);
        be beVar24 = this$0.binding;
        if (beVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar24 = null;
        }
        intent.putExtra("dob", beVar24.Z.getText().toString());
        be beVar25 = this$0.binding;
        if (beVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar25 = null;
        }
        intent.putExtra("placeOfBirth", String.valueOf(beVar25.n0.getText()));
        intent.putExtra("country", this$0.selectedCountryCode);
        intent.putExtra("educationQualification", this$0.selectedEduQualificationCode);
        intent.putExtra("bloodGroup", this$0.selectedBloodGroup);
        be beVar26 = this$0.binding;
        if (beVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar26 = null;
        }
        intent.putExtra("landlineNo", String.valueOf(beVar26.i0.getText()));
        be beVar27 = this$0.binding;
        if (beVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar27 = null;
        }
        intent.putExtra("emailId", String.valueOf(beVar27.b0.getText()));
        be beVar28 = this$0.binding;
        if (beVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar28 = null;
        }
        intent.putExtra("applicantMobileNo", String.valueOf(beVar28.U.getText()));
        be beVar29 = this$0.binding;
        if (beVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar29 = null;
        }
        intent.putExtra("altMobileNo", String.valueOf(beVar29.d0.getText()));
        be beVar30 = this$0.binding;
        if (beVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar30 = null;
        }
        intent.putExtra("identificationMark1", String.valueOf(beVar30.k0.getText()));
        be beVar31 = this$0.binding;
        if (beVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar31 = null;
        }
        intent.putExtra("identificationMark2", String.valueOf(beVar31.l0.getText()));
        intent.putExtra("enteredAge", this$0.calculatedAge);
        intent.putExtra("campDesc", this$0.cmCampDesc);
        intent.putExtra("cmType", this$0.cmType);
        if (this$0.haveAadhaarData) {
            DOEkycX dOEkycX3 = this$0.adharData;
            if (dOEkycX3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX3 = null;
            }
            intent.putExtra("aadharData", dOEkycX3);
            DOEkycX dOEkycX4 = this$0.adharData;
            if (dOEkycX4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
            } else {
                dOEkycX = dOEkycX4;
            }
            Log.d("adhar_pht", dOEkycX.getPht());
            intent.putExtra("ekycId", this$0.ekycID);
            intent.putExtra("dataFromAadhar", this$0.haveAadhaarData);
        }
        this$0.startActivity(intent);
    }

    public static final void Z1(PersonalDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        be beVar = null;
        if (this$0.getIntent().getBooleanExtra("dataFromAadhar", false)) {
            be beVar2 = this$0.binding;
            if (beVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar2 = null;
            }
            beVar2.M.setSelection(0);
            be beVar3 = this$0.binding;
            if (beVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar3 = null;
            }
            beVar3.z.setText("");
            be beVar4 = this$0.binding;
            if (beVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar4 = null;
            }
            beVar4.G.setText("");
            be beVar5 = this$0.binding;
            if (beVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar5 = null;
            }
            beVar5.D.setText("");
            be beVar6 = this$0.binding;
            if (beVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar6 = null;
            }
            beVar6.n0.setText("");
            be beVar7 = this$0.binding;
            if (beVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar7 = null;
            }
            beVar7.O.setSelection(0);
            be beVar8 = this$0.binding;
            if (beVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar8 = null;
            }
            beVar8.Q.setSelection(0);
            be beVar9 = this$0.binding;
            if (beVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar9 = null;
            }
            beVar9.P.setSelection(0);
            be beVar10 = this$0.binding;
            if (beVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar10 = null;
            }
            beVar10.i0.setText("");
            be beVar11 = this$0.binding;
            if (beVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar11 = null;
            }
            beVar11.b0.setText("");
            be beVar12 = this$0.binding;
            if (beVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar12 = null;
            }
            beVar12.U.setText("");
            be beVar13 = this$0.binding;
            if (beVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar13 = null;
            }
            beVar13.d0.setText("");
            be beVar14 = this$0.binding;
            if (beVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                beVar14 = null;
            }
            beVar14.k0.setText("");
            be beVar15 = this$0.binding;
            if (beVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                beVar = beVar15;
            }
            beVar.l0.setText("");
            return;
        }
        be beVar16 = this$0.binding;
        if (beVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar16 = null;
        }
        beVar16.y.setText("");
        be beVar17 = this$0.binding;
        if (beVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar17 = null;
        }
        beVar17.F.setText("");
        be beVar18 = this$0.binding;
        if (beVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar18 = null;
        }
        beVar18.C.setText("");
        be beVar19 = this$0.binding;
        if (beVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar19 = null;
        }
        beVar19.f0.setText("");
        be beVar20 = this$0.binding;
        if (beVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar20 = null;
        }
        beVar20.M.setSelection(0);
        be beVar21 = this$0.binding;
        if (beVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar21 = null;
        }
        beVar21.z.setText("");
        be beVar22 = this$0.binding;
        if (beVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar22 = null;
        }
        beVar22.G.setText("");
        be beVar23 = this$0.binding;
        if (beVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar23 = null;
        }
        beVar23.D.setText("");
        be beVar24 = this$0.binding;
        if (beVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar24 = null;
        }
        beVar24.Z.setText("");
        be beVar25 = this$0.binding;
        if (beVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar25 = null;
        }
        beVar25.n0.setText("");
        be beVar26 = this$0.binding;
        if (beVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar26 = null;
        }
        beVar26.O.setSelection(0);
        be beVar27 = this$0.binding;
        if (beVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar27 = null;
        }
        beVar27.Q.setSelection(0);
        be beVar28 = this$0.binding;
        if (beVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar28 = null;
        }
        beVar28.P.setSelection(0);
        be beVar29 = this$0.binding;
        if (beVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar29 = null;
        }
        beVar29.i0.setText("");
        be beVar30 = this$0.binding;
        if (beVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar30 = null;
        }
        beVar30.b0.setText("");
        be beVar31 = this$0.binding;
        if (beVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar31 = null;
        }
        beVar31.U.setText("");
        be beVar32 = this$0.binding;
        if (beVar32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar32 = null;
        }
        beVar32.d0.setText("");
        be beVar33 = this$0.binding;
        if (beVar33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar33 = null;
        }
        beVar33.k0.setText("");
        be beVar34 = this$0.binding;
        if (beVar34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            beVar = beVar34;
        }
        beVar.l0.setText("");
    }

    public static final void a2(PersonalDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        be beVar = null;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        final PopupWindow popupWindow = new PopupWindow(viewInflate, (int) (((double) this$0.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        TextView textView = (TextView) viewInflate.findViewById(R.id.infoMessageTv);
        ((ImageView) viewInflate.findViewById(R.id.closeIv)).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PersonalDetailsScreen.b2(popupWindow, view2);
            }
        });
        wa3 wa3Var = this$0.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        textView.setText(wa3Var.b("infoDescription", "If Middle name is more than 6 characters, then middle name could be entered either in First Name or Last Name and will be printed on driving licence"));
        be beVar2 = this$0.binding;
        if (beVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            beVar = beVar2;
        }
        popupWindow.showAsDropDown(beVar.R, 0, 10);
    }

    public static final void b2(PopupWindow popupWindow, View view) {
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        wa3 wa3Var = this.session;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        textView2.setText(wa3Var.b("btn_ok", getString(R.string.ok_txt)));
        textView.setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById3;
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var3 = null;
        }
        textView3.setText(wa3Var3.b("nex_parivahan", "NextGen mParivahan"));
        wa3 wa3Var4 = this.session;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var2 = wa3Var4;
        }
        textView2.setText(wa3Var2.b("btn_ok", "OK"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.or4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.d2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void d2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        ArrayList arrayList = new ArrayList();
        int size = this.bloodGroupList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((BloodGroupMasterDataModal) this.bloodGroupList.get(i3)).getBloodGroupName()));
            if (Intrinsics.areEqual(((BloodGroupMasterDataModal) this.bloodGroupList.get(i3)).getBloodGroupName(), "Unknown")) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        be beVar = this.binding;
        be beVar2 = null;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        beVar.P.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 != -1) {
            be beVar3 = this.binding;
            if (beVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                beVar2 = beVar3;
            }
            beVar2.P.setSelection(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2() {
        ArrayList arrayList = new ArrayList();
        int size = this.countryList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((CountryMasterResponseModal) this.countryList.get(i3)).getCountryName()));
            if (Intrinsics.areEqual(((CountryMasterResponseModal) this.countryList.get(i3)).getCountryName(), "INDIA")) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        be beVar = this.binding;
        be beVar2 = null;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        beVar.O.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 != -1) {
            be beVar3 = this.binding;
            if (beVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                beVar2 = beVar3;
            }
            beVar2.O.setSelection(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2() {
        ArrayList arrayList = new ArrayList();
        int size = this.educationQualList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((QualificationMasterDataModal) this.educationQualList.get(i3)).getQualificationName()));
            if (Intrinsics.areEqual(((QualificationMasterDataModal) this.educationQualList.get(i3)).getQualificationCode(), "999")) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        be beVar = this.binding;
        be beVar2 = null;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        beVar.Q.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 != -1) {
            be beVar3 = this.binding;
            if (beVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                beVar2 = beVar3;
            }
            beVar2.Q.setSelection(i2);
        }
    }

    public final void L1() {
        this.relationList.add(0, new Relationship("0", "Select Relation"));
        this.relationList.add(1, new Relationship("F", "Father"));
        this.relationList.add(2, new Relationship("M", "Mother"));
        this.relationList.add(3, new Relationship("H", "Husband"));
        this.relationList.add(4, new Relationship("G", "Guardian"));
        b85 b85Var = new b85(this, this.relationList);
        be beVar = this.binding;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        beVar.M.setAdapter((SpinnerAdapter) b85Var);
    }

    public final int M1(int dayOfMonth, int month, int year) {
        return Period.between(LocalDate.of(year, month, dayOfMonth), LocalDate.now()).getYears();
    }

    public final void Q1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText("OK");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.S1(this.a, view);
            }
        });
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsScreen.R1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h2(boolean r15) {
        /*
            Method dump skipped, instruction units count: 1894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.PersonalDetailsScreen.h2(boolean):void");
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        be beVarX = be.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(beVarX, "inflate(...)");
        this.binding = beVarX;
        j94 j94Var = null;
        if (beVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVarX = null;
        }
        setContentView(beVarX.m());
        ta3.a aVar = ta3.a;
        be beVar = this.binding;
        if (beVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            beVar = null;
        }
        aVar.d1(this, beVar);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra);
            this.selectedStateCd = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("rtoCd");
            Intrinsics.checkNotNull(stringExtra2);
            this.selectedRtoCd = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("rtoName");
            Intrinsics.checkNotNull(stringExtra3);
            this.selectedRtoName = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("inputMobileNo");
            Intrinsics.checkNotNull(stringExtra4);
            this.alreadyMobileNo = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("campDesc");
            Intrinsics.checkNotNull(stringExtra5);
            this.cmCampDesc = stringExtra5;
            String stringExtra6 = getIntent().getStringExtra("cmType");
            Intrinsics.checkNotNull(stringExtra6);
            this.cmType = stringExtra6;
            if (getIntent().hasExtra("dataFromAadhar") && getIntent().getBooleanExtra("dataFromAadhar", false)) {
                Serializable serializableExtra = getIntent().getSerializableExtra("aadharData");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
                this.adharData = (DOEkycX) serializableExtra;
                this.ekycID = getIntent().getLongExtra("ekycId", 0L);
                this.haveAadhaarData = getIntent().getBooleanExtra("dataFromAadhar", false);
                String stringExtra7 = getIntent().getStringExtra("aadhaarLastFourDigitMobileNo");
                Intrinsics.checkNotNull(stringExtra7);
                this.aadhaarLastFourDigitMobileNo = stringExtra7;
            }
        }
        L1();
        this.service = NewLLServices.INSTANCE.a(this);
        NewLLServices newLLServices = this.service;
        if (newLLServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newLLServices = null;
        }
        this.learnerLicenceVM = (j94) new z(this, new k94(new i94(newLLServices))).a(j94.class);
        this.session = new wa3(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setCancelable(false);
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        wa3 wa3Var = this.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        progressDialog3.setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        O1();
        P1();
        N1();
        T1();
        boolean z = this.haveAadhaarData;
        if (z) {
            h2(z);
        }
        j94 j94Var2 = this.learnerLicenceVM;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var2 = null;
        }
        j94Var2.p().g(this, new m(new i()));
        j94 j94Var3 = this.learnerLicenceVM;
        if (j94Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var3 = null;
        }
        j94Var3.u().g(this, new m(new j()));
        j94 j94Var4 = this.learnerLicenceVM;
        if (j94Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var4 = null;
        }
        j94Var4.k().g(this, new m(new k()));
        j94 j94Var5 = this.learnerLicenceVM;
        if (j94Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
        } else {
            j94Var = j94Var5;
        }
        j94Var.w().g(this, new m(new l()));
    }
}
