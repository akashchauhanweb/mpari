package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.PersonalDetailsEditScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.BloodGroupResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryMasterResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.CountryResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.EducationQualResponseModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.QualificationMasterDataModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.zepto.b85;
import com.zepto.i94;
import com.zepto.j94;
import com.zepto.k94;
import com.zepto.mf4;
import com.zepto.nr4;
import com.zepto.pq;
import com.zepto.rb;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
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
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0003J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0004j\b\u0012\u0004\u0012\u00020\u001c`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR&\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u0004j\b\u0012\u0004\u0012\u00020\u001f`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR&\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0\u0004j\b\u0012\u0004\u0012\u00020\"`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u001e\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u001bR\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010)R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u001bR\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020D0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u001bR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010)R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010)R\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010)R\u0016\u0010V\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010)R\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010)R\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010)R\u0016\u0010_\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010)R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010)R\u0016\u0010c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010)R\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010)R\u0016\u0010g\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010)R\u0016\u0010i\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010YR\u0016\u0010k\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010)R\u0016\u0010m\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010)R\u0016\u0010o\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010)R\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u001c\u0010v\u001a\b\u0012\u0004\u0012\u00020t0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010\u001b¨\u0006y"}, d2 = {"Lcom/nic/mparivahan/LLServices/editlearnerlicence/Activity/PersonalDetailsEditScreen;", "Lcom/zepto/pq;", "", "F1", "Ljava/util/ArrayList;", "Lcom/zepto/nr4;", "personalDetails", "K1", "", "relationType", "B1", "G1", "C1", "L1", "E1", "N1", "M1", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/rb;", "C", "Lcom/zepto/rb;", "binding", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "Lcom/zepto/il;", "E", "addressDetails", "Lcom/zepto/w01;", "F", "covDetails", "Lcom/zepto/qv5;", "G", "selectedCovList", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/Relationship;", "H", "relationList", "I", "Ljava/lang/String;", "selectedRelationCode", "J", "selectedGenderValue", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "K", "Ljava/util/Calendar;", "cal", "Lcom/zepto/j94;", "L", "Lcom/zepto/j94;", "learnerLicenceVM", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "M", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "service", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/CountryMasterResponseModal;", "N", "countryList", "O", "selectedCountryCode", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/QualificationMasterDataModal;", "P", "educationQualList", "Q", "selectedEduQualificationCode", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/BloodGroupMasterDataModal;", "R", "bloodGroupList", "S", "selectedBloodGroup", "Landroid/app/ProgressDialog;", "T", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "session", "V", "apiCountryCode", "W", "apiBloodGroup", "X", "apiEduQualCode", "", "Y", "Z", "willingToDonate", "licenseFromState", "a0", "licenceFromRTO", "b0", "jurisdiction", "c0", "licenceFromRTOCode", "d0", "applicationNo", "e0", "reference", "f0", "applDate", "g0", "allowNewAddr", "h0", "applCatg", "i0", "bioId", "j0", "allClassOfVehicles", "Lcom/zepto/wl5;", "k0", "Lcom/zepto/wl5;", "sarthiSession", "Lcom/zepto/t93;", "l0", "llRefDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PersonalDetailsEditScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public rb binding;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public j94 learnerLicenceVM;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public NewLLServices service;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public boolean willingToDonate;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean allowNewAddr;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList personalDetails = new ArrayList();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList addressDetails = new ArrayList();

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ArrayList covDetails = new ArrayList();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList selectedCovList = new ArrayList();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList relationList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String selectedRelationCode = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String selectedGenderValue = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList countryList = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String selectedCountryCode = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList educationQualList = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String selectedEduQualificationCode = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList bloodGroupList = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String selectedBloodGroup = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String apiCountryCode = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String apiBloodGroup = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String apiEduQualCode = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String licenseFromState = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String licenceFromRTO = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String jurisdiction = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String licenceFromRTOCode = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String applicationNo = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String reference = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String applDate = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String applCatg = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String bioId = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String allClassOfVehicles = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList llRefDetails = new ArrayList();

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
            personalDetailsEditScreen.selectedRelationCode = ((Relationship) personalDetailsEditScreen.relationList.get(i)).getRelationCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements TextWatcher {
        public b() {
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
                rb rbVar = PersonalDetailsEditScreen.this.binding;
                rb rbVar2 = null;
                if (rbVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar = null;
                }
                if (String.valueOf(rbVar.F.getText()).length() <= 0) {
                    rb rbVar3 = PersonalDetailsEditScreen.this.binding;
                    if (rbVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rbVar3 = null;
                    }
                    EditText editText = rbVar3.f0;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    sb.append(' ');
                    rb rbVar4 = PersonalDetailsEditScreen.this.binding;
                    if (rbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rbVar4 = null;
                    }
                    sb.append((Object) rbVar4.F.getText());
                    rb rbVar5 = PersonalDetailsEditScreen.this.binding;
                    if (rbVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rbVar2 = rbVar5;
                    }
                    sb.append((Object) rbVar2.C.getText());
                    editText.setText(sb.toString());
                    return;
                }
                rb rbVar6 = PersonalDetailsEditScreen.this.binding;
                if (rbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar6 = null;
                }
                EditText editText2 = rbVar6.f0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) charSequence);
                sb2.append(' ');
                rb rbVar7 = PersonalDetailsEditScreen.this.binding;
                if (rbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar7 = null;
                }
                sb2.append((Object) rbVar7.F.getText());
                sb2.append(' ');
                rb rbVar8 = PersonalDetailsEditScreen.this.binding;
                if (rbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rbVar2 = rbVar8;
                }
                sb2.append((Object) rbVar2.C.getText());
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class c implements TextWatcher {
        public c() {
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
                rb rbVar = PersonalDetailsEditScreen.this.binding;
                rb rbVar2 = null;
                if (rbVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar = null;
                }
                EditText editText = rbVar.f0;
                StringBuilder sb = new StringBuilder();
                rb rbVar3 = PersonalDetailsEditScreen.this.binding;
                if (rbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar3 = null;
                }
                sb.append((Object) rbVar3.y.getText());
                sb.append(' ');
                sb.append((Object) charSequence);
                sb.append(' ');
                rb rbVar4 = PersonalDetailsEditScreen.this.binding;
                if (rbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rbVar2 = rbVar4;
                }
                sb.append((Object) rbVar2.C.getText());
                editText.setText(sb.toString());
            }
        }
    }

    public static final class d implements TextWatcher {
        public d() {
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
                rb rbVar = PersonalDetailsEditScreen.this.binding;
                rb rbVar2 = null;
                if (rbVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar = null;
                }
                if (String.valueOf(rbVar.F.getText()).length() <= 0) {
                    rb rbVar3 = PersonalDetailsEditScreen.this.binding;
                    if (rbVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rbVar3 = null;
                    }
                    EditText editText = rbVar3.f0;
                    StringBuilder sb = new StringBuilder();
                    rb rbVar4 = PersonalDetailsEditScreen.this.binding;
                    if (rbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rbVar4 = null;
                    }
                    sb.append((Object) rbVar4.y.getText());
                    sb.append(' ');
                    rb rbVar5 = PersonalDetailsEditScreen.this.binding;
                    if (rbVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rbVar2 = rbVar5;
                    }
                    sb.append((Object) rbVar2.F.getText());
                    sb.append((Object) charSequence);
                    editText.setText(sb.toString());
                    return;
                }
                rb rbVar6 = PersonalDetailsEditScreen.this.binding;
                if (rbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar6 = null;
                }
                EditText editText2 = rbVar6.f0;
                StringBuilder sb2 = new StringBuilder();
                rb rbVar7 = PersonalDetailsEditScreen.this.binding;
                if (rbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rbVar7 = null;
                }
                sb2.append((Object) rbVar7.y.getText());
                sb2.append(' ');
                rb rbVar8 = PersonalDetailsEditScreen.this.binding;
                if (rbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rbVar2 = rbVar8;
                }
                sb2.append((Object) rbVar2.F.getText());
                sb2.append(' ');
                sb2.append((Object) charSequence);
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
            personalDetailsEditScreen.selectedCountryCode = ((CountryMasterResponseModal) personalDetailsEditScreen.countryList.get(i)).getCountryCode();
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
            PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
            personalDetailsEditScreen.selectedEduQualificationCode = ((QualificationMasterDataModal) personalDetailsEditScreen.educationQualList.get(i)).getQualificationCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
            personalDetailsEditScreen.selectedBloodGroup = ((BloodGroupMasterDataModal) personalDetailsEditScreen.bloodGroupList.get(i)).getBloodGroupCode();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(CountryResponseModal countryResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = PersonalDetailsEditScreen.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(countryResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
                    ArrayList<CountryMasterResponseModal> drivingSchoolMasterList = countryResponseModal.getDrivingSchoolMasterList();
                    Intrinsics.checkNotNull(drivingSchoolMasterList);
                    personalDetailsEditScreen.countryList = drivingSchoolMasterList;
                    if (PersonalDetailsEditScreen.this.countryList.size() > 0) {
                        PersonalDetailsEditScreen.this.M1();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = PersonalDetailsEditScreen.this.dialog;
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

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(EducationQualResponseModal educationQualResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = PersonalDetailsEditScreen.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(educationQualResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
                    ArrayList<QualificationMasterDataModal> qualificationMasterData = educationQualResponseModal.getQualificationMasterData();
                    Intrinsics.checkNotNull(qualificationMasterData);
                    personalDetailsEditScreen.educationQualList = qualificationMasterData;
                    if (PersonalDetailsEditScreen.this.educationQualList.size() > 0) {
                        PersonalDetailsEditScreen.this.N1();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = PersonalDetailsEditScreen.this.dialog;
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

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(BloodGroupResponseModal bloodGroupResponseModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = PersonalDetailsEditScreen.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(bloodGroupResponseModal.getStatusCode(), "00", true)) {
                    PersonalDetailsEditScreen personalDetailsEditScreen = PersonalDetailsEditScreen.this;
                    ArrayList<BloodGroupMasterDataModal> bloodGroupMasterData = bloodGroupResponseModal.getBloodGroupMasterData();
                    Intrinsics.checkNotNull(bloodGroupMasterData);
                    personalDetailsEditScreen.bloodGroupList = bloodGroupMasterData;
                    if (PersonalDetailsEditScreen.this.bloodGroupList.size() > 0) {
                        PersonalDetailsEditScreen.this.L1();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = PersonalDetailsEditScreen.this.dialog;
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

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = PersonalDetailsEditScreen.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = PersonalDetailsEditScreen.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
        }
    }

    public static final class l implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public l(Function1 function) {
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
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("personalDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        this.personalDetails = parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("addressDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra2);
        this.addressDetails = parcelableArrayListExtra2;
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("covDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra3);
        this.covDetails = parcelableArrayListExtra3;
        ArrayList parcelableArrayListExtra4 = getIntent().getParcelableArrayListExtra("selectedCovDetails");
        Intrinsics.checkNotNull(parcelableArrayListExtra4);
        this.selectedCovList = parcelableArrayListExtra4;
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
        if (getIntent().hasExtra("bioId")) {
            String stringExtra9 = getIntent().getStringExtra("bioId");
            Intrinsics.checkNotNull(stringExtra9);
            this.bioId = stringExtra9;
        }
        if (getIntent().hasExtra("allClassOfVehicles")) {
            String stringExtra10 = getIntent().getStringExtra("allClassOfVehicles");
            Intrinsics.checkNotNull(stringExtra10);
            this.allClassOfVehicles = stringExtra10;
        }
        if (getIntent().hasExtra("llRefDetails")) {
            ArrayList parcelableArrayListExtra5 = getIntent().getParcelableArrayListExtra("llRefDetails");
            Intrinsics.checkNotNull(parcelableArrayListExtra5);
            this.llRefDetails = parcelableArrayListExtra5;
        }
        if (this.personalDetails.size() > 0) {
            K1(this.personalDetails);
        }
    }

    private final void G1() {
        this.sarthiSession = new wl5(this);
        rb rbVar = this.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        TextView textView = rbVar.E.f;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        textView.setText(wl5Var.k());
        rb rbVar3 = this.binding;
        if (rbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar3 = null;
        }
        rbVar3.E.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsEditScreen.H1(this.a, view);
            }
        });
        rb rbVar4 = this.binding;
        if (rbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar4 = null;
        }
        rbVar4.K.setEnabled(false);
        rb rbVar5 = this.binding;
        if (rbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar5 = null;
        }
        rbVar5.I.setEnabled(false);
        rb rbVar6 = this.binding;
        if (rbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar6 = null;
        }
        rbVar6.L.setEnabled(false);
        rb rbVar7 = this.binding;
        if (rbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar7 = null;
        }
        rbVar7.U.setFocusable(false);
        rb rbVar8 = this.binding;
        if (rbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar8 = null;
        }
        rbVar8.M.setOnItemSelectedListener(new a());
        rb rbVar9 = this.binding;
        if (rbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar9 = null;
        }
        rbVar9.y.addTextChangedListener(new b());
        rb rbVar10 = this.binding;
        if (rbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar10 = null;
        }
        rbVar10.F.addTextChangedListener(new c());
        rb rbVar11 = this.binding;
        if (rbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar11 = null;
        }
        rbVar11.C.addTextChangedListener(new d());
        rb rbVar12 = this.binding;
        if (rbVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar12 = null;
        }
        rbVar12.J.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.lr4
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                PersonalDetailsEditScreen.I1(this.a, radioGroup, i2);
            }
        });
        rb rbVar13 = this.binding;
        if (rbVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar13 = null;
        }
        rbVar13.O.setOnItemSelectedListener(new e());
        rb rbVar14 = this.binding;
        if (rbVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar14 = null;
        }
        rbVar14.Q.setOnItemSelectedListener(new f());
        rb rbVar15 = this.binding;
        if (rbVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar15 = null;
        }
        rbVar15.P.setOnItemSelectedListener(new g());
        rb rbVar16 = this.binding;
        if (rbVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rbVar2 = rbVar16;
        }
        rbVar2.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalDetailsEditScreen.J1(this.a, view);
            }
        });
    }

    public static final void H1(PersonalDetailsEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void I1(PersonalDetailsEditScreen this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewFindViewById = this$0.findViewById(i2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CharSequence text = ((RadioButton) viewFindViewById).getText();
        this$0.selectedGenderValue = Intrinsics.areEqual(text, "Male") ? VContant.MAINSCREEN : Intrinsics.areEqual(text, "Female") ? VContant.APPLICATION_SCREEN : "0";
    }

    public static final void J1(PersonalDetailsEditScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        rb rbVar = this$0.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        if (rbVar.y.getText().toString().length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_first_name), 0).show();
            return;
        }
        rb rbVar3 = this$0.binding;
        if (rbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar3 = null;
        }
        Editable text = rbVar3.y.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() < 3) {
            Toast.makeText(this$0, this$0.getString(R.string.error_valid_first_name), 0).show();
            return;
        }
        rb rbVar4 = this$0.binding;
        if (rbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar4 = null;
        }
        if (rbVar4.C.getText().toString().length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_last_name), 0).show();
            return;
        }
        rb rbVar5 = this$0.binding;
        if (rbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar5 = null;
        }
        Editable text2 = rbVar5.C.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 3) {
            Toast.makeText(this$0, this$0.getString(R.string.error_valid_last_name), 0).show();
            return;
        }
        rb rbVar6 = this$0.binding;
        if (rbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar6 = null;
        }
        Editable text3 = rbVar6.f0.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_valid_full_name), 0).show();
            return;
        }
        if (StringsKt__StringsJVMKt.equals(this$0.selectedRelationCode, "0", true)) {
            Toast.makeText(this$0, this$0.getString(R.string.error_select_relation), 0).show();
            return;
        }
        rb rbVar7 = this$0.binding;
        if (rbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar7 = null;
        }
        if (String.valueOf(rbVar7.z.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_first_name_rel), 0).show();
            return;
        }
        rb rbVar8 = this$0.binding;
        if (rbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar8 = null;
        }
        Editable text4 = rbVar8.z.getText();
        Intrinsics.checkNotNull(text4);
        if (text4.length() < 3) {
            Toast.makeText(this$0, this$0.getString(R.string.error_valid_first_name_rel), 0).show();
            return;
        }
        rb rbVar9 = this$0.binding;
        if (rbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar9 = null;
        }
        if (String.valueOf(rbVar9.D.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_last_name_rel), 0).show();
            return;
        }
        rb rbVar10 = this$0.binding;
        if (rbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar10 = null;
        }
        Editable text5 = rbVar10.D.getText();
        Intrinsics.checkNotNull(text5);
        if (text5.length() < 3) {
            Toast.makeText(this$0, this$0.getString(R.string.error_valid_last_name_rel), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedGenderValue, "")) {
            Toast.makeText(this$0, this$0.getString(R.string.error_gender), 0).show();
            return;
        }
        rb rbVar11 = this$0.binding;
        if (rbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar11 = null;
        }
        if (rbVar11.Z.getText().toString().length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_dob), 0).show();
            return;
        }
        rb rbVar12 = this$0.binding;
        if (rbVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar12 = null;
        }
        if (String.valueOf(rbVar12.n0.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_place_of_birth), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedCountryCode, "")) {
            Toast.makeText(this$0, this$0.getString(R.string.error_select_country), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedEduQualificationCode, "")) {
            Toast.makeText(this$0, this$0.getString(R.string.error_select_education_qual), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.selectedBloodGroup, "") || StringsKt__StringsJVMKt.equals(this$0.selectedBloodGroup, "Select Blood Group", true)) {
            Toast.makeText(this$0, this$0.getString(R.string.error_select_blood_group), 0).show();
            return;
        }
        rb rbVar13 = this$0.binding;
        if (rbVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar13 = null;
        }
        if (String.valueOf(rbVar13.U.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.enter_mobile_no), 0).show();
            return;
        }
        rb rbVar14 = this$0.binding;
        if (rbVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar14 = null;
        }
        if (String.valueOf(rbVar14.U.getText()).length() < 9) {
            Toast.makeText(this$0, this$0.getString(R.string.enter_mobile_no), 0).show();
            return;
        }
        rb rbVar15 = this$0.binding;
        if (rbVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar15 = null;
        }
        if (String.valueOf(rbVar15.d0.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_emergency_no), 0).show();
            return;
        }
        rb rbVar16 = this$0.binding;
        if (rbVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar16 = null;
        }
        if (String.valueOf(rbVar16.d0.getText()).length() < 9) {
            Toast.makeText(this$0, this$0.getString(R.string.error_emergency_no), 0).show();
            return;
        }
        rb rbVar17 = this$0.binding;
        if (rbVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar17 = null;
        }
        if (String.valueOf(rbVar17.k0.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_identification_mark_1), 0).show();
            return;
        }
        rb rbVar18 = this$0.binding;
        if (rbVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar18 = null;
        }
        if (String.valueOf(rbVar18.l0.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.error_identification_mark_2), 0).show();
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) AddressDetailEditScreen.class);
        intent.putParcelableArrayListExtra("addressDetails", this$0.addressDetails);
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
        rb rbVar19 = this$0.binding;
        if (rbVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar19 = null;
        }
        intent.putExtra("applicantFName", rbVar19.y.getText().toString());
        rb rbVar20 = this$0.binding;
        if (rbVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar20 = null;
        }
        intent.putExtra("applicantMName", String.valueOf(rbVar20.F.getText()));
        rb rbVar21 = this$0.binding;
        if (rbVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar21 = null;
        }
        intent.putExtra("applicantLName", rbVar21.C.getText().toString());
        rb rbVar22 = this$0.binding;
        if (rbVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar22 = null;
        }
        intent.putExtra("fullName", rbVar22.f0.getText().toString());
        intent.putExtra("relationship", this$0.selectedRelationCode);
        rb rbVar23 = this$0.binding;
        if (rbVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar23 = null;
        }
        intent.putExtra("relationFName", String.valueOf(rbVar23.z.getText()));
        rb rbVar24 = this$0.binding;
        if (rbVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar24 = null;
        }
        intent.putExtra("relationMName", String.valueOf(rbVar24.G.getText()));
        rb rbVar25 = this$0.binding;
        if (rbVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar25 = null;
        }
        intent.putExtra("relationLName", String.valueOf(rbVar25.D.getText()));
        intent.putExtra("gender", this$0.selectedGenderValue);
        rb rbVar26 = this$0.binding;
        if (rbVar26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar26 = null;
        }
        intent.putExtra("dob", rbVar26.Z.getText().toString());
        rb rbVar27 = this$0.binding;
        if (rbVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar27 = null;
        }
        intent.putExtra("placeOfBirth", String.valueOf(rbVar27.n0.getText()));
        intent.putExtra("country", this$0.selectedCountryCode);
        intent.putExtra("educationQualification", this$0.selectedEduQualificationCode);
        intent.putExtra("bloodGroup", this$0.selectedBloodGroup);
        rb rbVar28 = this$0.binding;
        if (rbVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar28 = null;
        }
        intent.putExtra("mobileNo", String.valueOf(rbVar28.i0.getText()));
        rb rbVar29 = this$0.binding;
        if (rbVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar29 = null;
        }
        intent.putExtra("emailId", String.valueOf(rbVar29.b0.getText()));
        rb rbVar30 = this$0.binding;
        if (rbVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar30 = null;
        }
        intent.putExtra("applicantMobileNo", String.valueOf(rbVar30.U.getText()));
        rb rbVar31 = this$0.binding;
        if (rbVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar31 = null;
        }
        intent.putExtra("emergencyContactNo", String.valueOf(rbVar31.d0.getText()));
        rb rbVar32 = this$0.binding;
        if (rbVar32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar32 = null;
        }
        intent.putExtra("identificationMark1", String.valueOf(rbVar32.k0.getText()));
        rb rbVar33 = this$0.binding;
        if (rbVar33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rbVar2 = rbVar33;
        }
        intent.putExtra("identificationMark2", String.valueOf(rbVar2.l0.getText()));
        this$0.startActivity(intent);
    }

    private final void K1(ArrayList personalDetails) {
        rb rbVar = this.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        rbVar.y.setText(((nr4) personalDetails.get(0)).j());
        rb rbVar3 = this.binding;
        if (rbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar3 = null;
        }
        rbVar3.C.setText(((nr4) personalDetails.get(0)).o());
        rb rbVar4 = this.binding;
        if (rbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar4 = null;
        }
        rbVar4.F.setText(((nr4) personalDetails.get(0)).p());
        rb rbVar5 = this.binding;
        if (rbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar5 = null;
        }
        rbVar5.f0.setText(((nr4) personalDetails.get(0)).k());
        B1(((nr4) personalDetails.get(0)).r());
        rb rbVar6 = this.binding;
        if (rbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar6 = null;
        }
        rbVar6.z.setText(((nr4) personalDetails.get(0)).s());
        rb rbVar7 = this.binding;
        if (rbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar7 = null;
        }
        rbVar7.G.setText(((nr4) personalDetails.get(0)).u());
        rb rbVar8 = this.binding;
        if (rbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar8 = null;
        }
        rbVar8.D.setText(((nr4) personalDetails.get(0)).t());
        if (StringsKt__StringsJVMKt.equals(((nr4) personalDetails.get(0)).l(), VContant.MAINSCREEN, true)) {
            rb rbVar9 = this.binding;
            if (rbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rbVar9 = null;
            }
            rbVar9.K.setChecked(true);
            this.selectedGenderValue = VContant.MAINSCREEN;
        } else if (StringsKt__StringsJVMKt.equals(((nr4) personalDetails.get(0)).l(), "0", true)) {
            rb rbVar10 = this.binding;
            if (rbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rbVar10 = null;
            }
            rbVar10.I.setChecked(true);
            this.selectedGenderValue = VContant.APPLICATION_SCREEN;
        } else {
            rb rbVar11 = this.binding;
            if (rbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rbVar11 = null;
            }
            rbVar11.L.setChecked(true);
            this.selectedGenderValue = "0";
        }
        rb rbVar12 = this.binding;
        if (rbVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar12 = null;
        }
        rbVar12.Z.setText(((nr4) personalDetails.get(0)).g());
        rb rbVar13 = this.binding;
        if (rbVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar13 = null;
        }
        rbVar13.n0.setText(((nr4) personalDetails.get(0)).e());
        this.apiCountryCode = ((nr4) personalDetails.get(0)).f();
        this.apiBloodGroup = ((nr4) personalDetails.get(0)).d();
        this.apiEduQualCode = ((nr4) personalDetails.get(0)).h();
        rb rbVar14 = this.binding;
        if (rbVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar14 = null;
        }
        rbVar14.b0.setText(((nr4) personalDetails.get(0)).i());
        rb rbVar15 = this.binding;
        if (rbVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar15 = null;
        }
        rbVar15.U.setText(((nr4) personalDetails.get(0)).q());
        rb rbVar16 = this.binding;
        if (rbVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar16 = null;
        }
        rbVar16.d0.setText(((nr4) personalDetails.get(0)).c());
        rb rbVar17 = this.binding;
        if (rbVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar17 = null;
        }
        rbVar17.k0.setText(((nr4) personalDetails.get(0)).m());
        rb rbVar18 = this.binding;
        if (rbVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rbVar2 = rbVar18;
        }
        rbVar2.l0.setText(((nr4) personalDetails.get(0)).n());
    }

    public final void B1(String relationType) {
        this.relationList.add(0, new Relationship("0", "Select Relation"));
        this.relationList.add(1, new Relationship("F", "Father"));
        this.relationList.add(2, new Relationship("M", "Mother"));
        this.relationList.add(3, new Relationship("H", "Husband"));
        this.relationList.add(4, new Relationship("G", "Guardian"));
        int size = this.relationList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            if (StringsKt__StringsJVMKt.equals(((Relationship) this.relationList.get(i3)).getRelationCode(), relationType, true)) {
                i2 = i3;
            }
        }
        b85 b85Var = new b85(this, this.relationList);
        rb rbVar = this.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        rbVar.M.setAdapter((SpinnerAdapter) b85Var);
        rb rbVar3 = this.binding;
        if (rbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rbVar2 = rbVar3;
        }
        rbVar2.M.setSelection(i2);
    }

    public final void C1() {
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

    public final void D1() {
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

    public final void E1() {
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

    public final void L1() {
        ArrayList arrayList = new ArrayList();
        int size = this.bloodGroupList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((BloodGroupMasterDataModal) this.bloodGroupList.get(i3)).getBloodGroupName()));
            if (StringsKt__StringsJVMKt.equals(((BloodGroupMasterDataModal) this.bloodGroupList.get(i3)).getBloodGroupCode(), this.apiBloodGroup, true)) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rb rbVar = this.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        rbVar.P.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 != -1) {
            rb rbVar3 = this.binding;
            if (rbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rbVar2 = rbVar3;
            }
            rbVar2.P.setSelection(i2);
        }
    }

    public final void M1() {
        ArrayList arrayList = new ArrayList();
        int size = this.countryList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((CountryMasterResponseModal) this.countryList.get(i3)).getCountryName()));
            if (StringsKt__StringsJVMKt.equals(((CountryMasterResponseModal) this.countryList.get(i3)).getCountryCode(), this.apiCountryCode, true)) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rb rbVar = this.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        rbVar.O.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 != -1) {
            rb rbVar3 = this.binding;
            if (rbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rbVar2 = rbVar3;
            }
            rbVar2.O.setSelection(i2);
        }
    }

    public final void N1() {
        ArrayList arrayList = new ArrayList();
        int size = this.educationQualList.size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((QualificationMasterDataModal) this.educationQualList.get(i3)).getQualificationName()));
            if (StringsKt__StringsJVMKt.equals(((QualificationMasterDataModal) this.educationQualList.get(i3)).getQualificationCode(), this.apiEduQualCode, true)) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rb rbVar = this.binding;
        rb rbVar2 = null;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        rbVar.Q.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 != -1) {
            rb rbVar3 = this.binding;
            if (rbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rbVar2 = rbVar3;
            }
            rbVar2.Q.setSelection(i2);
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rb rbVarX = rb.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(rbVarX, "inflate(...)");
        this.binding = rbVarX;
        j94 j94Var = null;
        if (rbVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVarX = null;
        }
        setContentView(rbVarX.m());
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
        F1();
        D1();
        E1();
        C1();
        G1();
        ta3.a aVar = ta3.a;
        rb rbVar = this.binding;
        if (rbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rbVar = null;
        }
        aVar.M0(this, rbVar);
        j94 j94Var2 = this.learnerLicenceVM;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var2 = null;
        }
        j94Var2.p().g(this, new l(new h()));
        j94 j94Var3 = this.learnerLicenceVM;
        if (j94Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var3 = null;
        }
        j94Var3.u().g(this, new l(new i()));
        j94 j94Var4 = this.learnerLicenceVM;
        if (j94Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var4 = null;
        }
        j94Var4.k().g(this, new l(new j()));
        j94 j94Var5 = this.learnerLicenceVM;
        if (j94Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
        } else {
            j94Var = j94Var5;
        }
        j94Var.w().g(this, new l(new k()));
    }
}
