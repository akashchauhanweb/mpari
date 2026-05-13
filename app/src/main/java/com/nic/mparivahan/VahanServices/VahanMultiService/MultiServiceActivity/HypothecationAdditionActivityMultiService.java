package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.HypothecationAdditionActivityMultiService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.d67;
import com.zepto.ed5;
import com.zepto.gz3;
import com.zepto.hz0;
import com.zepto.ir2;
import com.zepto.jw2;
import com.zepto.k18;
import com.zepto.kr2;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wk2;
import com.zepto.y67;
import com.zepto.yh7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00105\u001a\n .*\u0004\u0018\u00010-0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010D\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u00109\"\u0004\bO\u0010;R\"\u0010T\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bR\u00109\"\u0004\bS\u0010;R\"\u0010X\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR6\u0010k\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010s\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0087\u0001\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010n\u001a\u0005\b\u0085\u0001\u0010p\"\u0005\b\u0086\u0001\u0010r¨\u0006\u008a\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiServiceActivity/HypothecationAdditionActivityMultiService;", "Lcom/zepto/pq;", "", "Y1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "purCode", "Ljava/util/ArrayList;", "purSel", "k2", "Lcom/zepto/jw2;", "C", "Lcom/zepto/jw2;", "z1", "()Lcom/zepto/jw2;", "b2", "(Lcom/zepto/jw2;)V", "binding", "Lcom/zepto/kr2;", "D", "Lcom/zepto/kr2;", "H1", "()Lcom/zepto/kr2;", "l2", "(Lcom/zepto/kr2;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "E", "Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "G1", "()Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "j2", "(Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "D1", "()Landroid/app/ProgressDialog;", "g2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "Ljava/lang/String;", "getFormated_date", "()Ljava/lang/String;", "c2", "(Ljava/lang/String;)V", "formated_date", "I", "E1", "h2", "rc_number", "J", "C1", "f2", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "i2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "L", "y1", "a2", "aadhar_name", "M", "x1", "Z1", "aadhar_address", "", "N", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "d2", "(Lcom/zepto/wa3;)V", "languageSession", "Lkotlin/collections/ArrayList;", "P", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "I1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "m2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "S", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "e2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "T", "getDraftObj", "setDraftObj", "draftObj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationAdditionActivityMultiService extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jw2 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public kr2 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public HServices retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiServiceDraft draftObj;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (HypothecationAdditionActivityMultiService.this.z1().p.getSelectedItemPosition() != 0) {
                HypothecationAdditionActivityMultiService.this.D1().show();
                Object selectedItem = HypothecationAdditionActivityMultiService.this.z1().p.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                HypothecationAdditionActivityMultiService.this.H1().q(((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void J1(HypothecationAdditionActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void K1(HypothecationAdditionActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.E1());
        intent.putExtra("RcDetails", this$0.F1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
        this$0.startActivity(intent);
    }

    public static final void L1(HypothecationAdditionActivityMultiService this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.c2(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.z1().f.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void M1(HypothecationAdditionActivityMultiService this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void N1(HypothecationAdditionActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.z1().h.getText().toString();
        String string2 = this$0.z1().i.getText().toString();
        String string3 = this$0.z1().C.getText().toString();
        String string4 = this$0.z1().l.getText().toString();
        String string5 = this$0.z1().d.getText().toString();
        String string6 = this$0.z1().f.getText().toString();
        Object selectedItem = this$0.z1().p.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
        if (this$0.z1().k.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.A1().b("please_enter_hypothentication_type", this$0.getString(R.string.please_enter_hypothentication_type)), 0).show();
            return;
        }
        if (string.length() < 2) {
            Toast.makeText(this$0, this$0.A1().b("please_enter_the_financer_name", this$0.getString(R.string.please_enter_the_financer_name)), 0).show();
            return;
        }
        if (string2.length() < 2) {
            Toast.makeText(this$0, this$0.A1().b("please_enter_valid_house_no", this$0.getString(R.string.please_enter_valid_house_no)), 0).show();
            return;
        }
        if (string3.length() < 3) {
            Toast.makeText(this$0, this$0.A1().b("please_enter_village_town_city", this$0.getString(R.string.please_enter_village_town_city)), 0).show();
            return;
        }
        if (this$0.z1().p.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.A1().b("please_select_the_state", this$0.getString(R.string.please_select_the_state)), 0).show();
            return;
        }
        if (this$0.z1().c.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.A1().b("please_select_district", this$0.getString(R.string.please_select_district)), 0).show();
            return;
        }
        if (string5.length() < 6) {
            Toast.makeText(this$0, this$0.A1().b("please_enter_valid_pincode", this$0.getString(R.string.please_enter_valid_pincode)), 0).show();
            return;
        }
        if (this$0.z1().f.getText().length() < 2) {
            Toast.makeText(this$0, this$0.A1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            hz0.a aVar = hz0.a;
            aVar.r();
            Object selectedItem2 = this$0.z1().k.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem");
            Object selectedItem3 = this$0.z1().c.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
            int dist_cd = ((DistictModleItem) selectedItem3).getDist_cd();
            int i = Integer.parseInt(string5);
            String string7 = vahanStateModleSubList.get(0).toString();
            String strH = k18.a.h(string6);
            String string8 = ((HTPModleItem) selectedItem2).getHp_type_cd().toString();
            int i2 = Integer.parseInt(this$0.C1());
            String strR = aVar.r();
            int i3 = Integer.parseInt(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
            String strE1 = this$0.E1();
            Integer rc_owner_srNo = this$0.F1().getRc_owner_srNo();
            HpaDto hpaDto = new HpaDto("", string2, string3, string4, dist_cd, string, i, string7, strH, string8, i2, strR, i3, strE1, rc_owner_srNo != null ? rc_owner_srNo.intValue() : 0, String.valueOf(this$0.F1().getState_cd()));
            MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft);
            this$0.draftObj = multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : null, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : null, (2045 & 4) != 0 ? multiServiceDraft.durcdto : null, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : hpaDto, (2045 & 16) != 0 ? multiServiceDraft.hptDto : null, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null);
            VContant.Companion companion = VContant.INSTANCE;
            if (StringsKt__StringsJVMKt.equals(companion.t(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this$0.multiServiceList), VContant.REDIRECT, true)) {
                this$0.D1().show();
                MultiSelectionViewModel multiSelectionViewModelI1 = this$0.I1();
                MultiServiceDraft multiServiceDraft2 = this$0.draftObj;
                Intrinsics.checkNotNull(multiServiceDraft2);
                multiSelectionViewModelI1.v(multiServiceDraft2);
                return;
            }
            Intent intent = new Intent();
            if (companion.w(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this$0.multiServiceList)) {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.t(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this$0.multiServiceList)));
            } else {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.t(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this$0.multiServiceList)));
            }
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.E1());
            intent.putExtra("RcDetails", this$0.F1());
            intent.putExtra("off_code", this$0.C1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void O1(HypothecationAdditionActivityMultiService this$0, DraftResponse draftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            return;
        }
        Data data = draftResponse.getData();
        String strValueOf = String.valueOf(data != null ? data.getApplNo() : null);
        Data data2 = draftResponse.getData();
        if (data2 != null) {
            data2.getTransferOwnershipDto();
        }
        Data data3 = draftResponse.getData();
        ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
        Data data4 = draftResponse.getData();
        HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
        Data data5 = draftResponse.getData();
        HptDto hptDto = data5 != null ? data5.getHptDto() : null;
        Data data6 = draftResponse.getData();
        Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
        MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
        MultiServiceDraft multiServiceDraftCopy = multiServiceDraft != null ? multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : strValueOf, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : channgeOfAdressDto, (2045 & 4) != 0 ? multiServiceDraft.durcdto : durcdto, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : hpaDto, (2045 & 16) != 0 ? multiServiceDraft.hptDto : hptDto, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null) : null;
        Intent intent = new Intent(this$0, (Class<?>) VahanMultiServiceConfirmationScreen.class);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftCopy);
        intent.putExtra("RcDetails", this$0.F1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.y1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.x1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void P1(HypothecationAdditionActivityMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
        VContant.INSTANCE.N(this$0, str);
    }

    public static final void Q1(HypothecationAdditionActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.A1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void R1(HypothecationAdditionActivityMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1();
    }

    public static final void S1(HypothecationAdditionActivityMultiService this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.z1().p.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            this$0.D1().show();
            this$0.H1().m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void T1(HypothecationAdditionActivityMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
    }

    public static final void U1(HypothecationAdditionActivityMultiService this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.z1().c.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void V1(HypothecationAdditionActivityMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
    }

    public static final void W1(HypothecationAdditionActivityMultiService this$0, HtpTypeModle htpTypeModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
        try {
            Intrinsics.checkNotNull(htpTypeModle);
            htpTypeModle.add(0, new HTPModleItem("0", "Select Type"));
            this$0.z1().k.setAdapter((SpinnerAdapter) new d67(this$0, htpTypeModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void X1(HypothecationAdditionActivityMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new HTPModleItem("0", "Select Type"));
        this$0.z1().k.setAdapter((SpinnerAdapter) new d67(this$0, arrayList));
    }

    private final void Y1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final wa3 A1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final MultiService B1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final String C1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog D1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String E1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails F1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final HServices G1() {
        HServices hServices = this.retrofitService;
        if (hServices != null) {
            return hServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final kr2 H1() {
        kr2 kr2Var = this.viewModel;
        if (kr2Var != null) {
            return kr2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final MultiSelectionViewModel I1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void b2(jw2 jw2Var) {
        Intrinsics.checkNotNullParameter(jw2Var, "<set-?>");
        this.binding = jw2Var;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void d2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void e2(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void g2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void h2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void i2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void j2(HServices hServices) {
        Intrinsics.checkNotNullParameter(hServices, "<set-?>");
        this.retrofitService = hServices;
    }

    public final void k2(String purCode, ArrayList purSel) {
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        try {
            Intrinsics.checkNotNull(purSel);
            int iIndexOf = purSel.indexOf(purCode);
            if (purSel.size() == 4) {
                z1().r.b.setVisibility(0);
                TextView textView = z1().r.d;
                VContant.Companion companion = VContant.INSTANCE;
                Object obj = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                textView.setText(companion.D(this, (String) obj));
                TextView textView2 = z1().r.f;
                Object obj2 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                textView2.setText(companion.D(this, (String) obj2));
                TextView textView3 = z1().r.k;
                Object obj3 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                textView3.setText(companion.D(this, (String) obj3));
                TextView textView4 = z1().r.n;
                Object obj4 = purSel.get(3);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                textView4.setText(companion.D(this, (String) obj4));
                if (iIndexOf == 3) {
                    z1().r.c.setChecked(true);
                    z1().r.e.setChecked(true);
                    z1().r.h.setChecked(true);
                    z1().r.m.setChecked(false);
                }
                if (iIndexOf == 2) {
                    z1().r.c.setChecked(true);
                    z1().r.e.setChecked(true);
                    z1().r.h.setChecked(false);
                    z1().r.m.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 1) {
                    z1().r.c.setChecked(true);
                    z1().r.e.setChecked(false);
                    Drawable drawableE = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    z1().r.h.setCheckMarkDrawable(drawableE);
                    z1().r.m.setCheckMarkDrawable(drawableE);
                }
                if (iIndexOf == 0) {
                    z1().r.c.setChecked(false);
                    Drawable drawableE2 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    z1().r.e.setCheckMarkDrawable(drawableE2);
                    z1().r.h.setCheckMarkDrawable(drawableE2);
                    z1().r.m.setCheckMarkDrawable(drawableE2);
                }
            }
            if (purSel.size() == 3) {
                z1().r.u.setVisibility(0);
                TextView textView5 = z1().r.z;
                VContant.Companion companion2 = VContant.INSTANCE;
                Object obj5 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                textView5.setText(companion2.D(this, (String) obj5));
                TextView textView6 = z1().r.w;
                Object obj6 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                textView6.setText(companion2.D(this, (String) obj6));
                TextView textView7 = z1().r.j;
                Object obj7 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                textView7.setText(companion2.D(this, (String) obj7));
                if (iIndexOf == 2) {
                    z1().r.i.setChecked(true);
                    z1().r.v.setChecked(true);
                    z1().r.y.setChecked(false);
                }
                if (iIndexOf == 1) {
                    z1().r.i.setChecked(true);
                    z1().r.v.setChecked(false);
                    z1().r.y.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 0) {
                    z1().r.i.setChecked(false);
                    Drawable drawableE3 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    z1().r.v.setCheckMarkDrawable(drawableE3);
                    z1().r.y.setCheckMarkDrawable(drawableE3);
                }
            }
            if (purSel.size() == 2) {
                z1().r.A.setVisibility(0);
                TextView textView8 = z1().r.t;
                VContant.Companion companion3 = VContant.INSTANCE;
                Object obj8 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                textView8.setText(companion3.D(this, (String) obj8));
                TextView textView9 = z1().r.r;
                Object obj9 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                textView9.setText(companion3.D(this, (String) obj9));
                if (iIndexOf == 1) {
                    z1().r.q.setChecked(true);
                    z1().r.s.setChecked(false);
                }
                if (iIndexOf == 0) {
                    z1().r.q.setChecked(false);
                    z1().r.s.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void l2(kr2 kr2Var) {
        Intrinsics.checkNotNullParameter(kr2Var, "<set-?>");
        this.viewModel = kr2Var;
    }

    public final void m2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hyptaddition_multi);
        jw2 jw2VarC = jw2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jw2VarC, "inflate(...)");
        b2(jw2VarC);
        setContentView(z1().b());
        ta3.a.s2(this, z1());
        d2(new wa3(this));
        g2(new ProgressDialog(this));
        D1().setMessage("Please wait...");
        D1().setCancelable(false);
        D1().setCanceledOnTouchOutside(false);
        j2(HServices.INSTANCE.a(this));
        l2((kr2) new z(this, new wk2(new ir2(G1()))).a(kr2.class));
        e2(MultiService.INSTANCE.a(this));
        m2((MultiSelectionViewModel) new z(this, new y67(new sx3(B1()))).a(MultiSelectionViewModel.class));
        h2(String.valueOf(getIntent().getStringExtra("RC")));
        f2(String.valueOf(getIntent().getStringExtra("off_code")));
        a2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Z1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        h2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        i2((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        z1().s.e.setVisibility(0);
        z1().s.e.setText(E1());
        SpannableString spannableString = new SpannableString(E1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        z1().s.e.setText(spannableString);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            z1().s.i.setText(new wa3(this).b("hypothecation_addition", getString(R.string.vahan_hypothecation_addition)));
        } else {
            SpannableString spannableString2 = new SpannableString(new wa3(this).b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            z1().s.i.setText(spannableString2);
        }
        z1().s.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ws2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiService.J1(this.a, view);
            }
        });
        k2(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this.multiServiceList);
        if (this.isFaceless) {
            z1().o.e.setWeightSum(3.0f);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.isFaceless = booleanExtra;
        VContant.Companion companion = VContant.INSTANCE;
        LinearLayout appMent = z1().o.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(booleanExtra, appMent);
        Serializable serializableExtra3 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        i2((NrvDetails) serializableExtra3);
        z1().A.setText(A1().b("vehicle_no", "Vehicle No.:") + ' ' + E1());
        z1().B.setText(A1().b("view_vehicle_details", "View Vehicle Details"));
        z1().B.setPaintFlags(z1().B.getPaintFlags() | 8);
        z1().s.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ht2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiService.K1(this.a, view);
            }
        });
        z1().s.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.it2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiService.Q1(this.a, view);
            }
        });
        z1().s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiService.R1(this.a, view);
            }
        });
        try {
            D1().show();
            H1().o();
        } catch (Exception unused) {
        }
        H1().n().g(this, new mf4() { // from class: com.zepto.kt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.S1(this.a, (VahanStateModle) obj);
            }
        });
        H1().p().g(this, new mf4() { // from class: com.zepto.xs2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.T1(this.a, (String) obj);
            }
        });
        H1().g().g(this, new mf4() { // from class: com.zepto.ys2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.U1(this.a, (DistictModle) obj);
            }
        });
        H1().h().g(this, new mf4() { // from class: com.zepto.zs2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.V1(this.a, (String) obj);
            }
        });
        H1().i().g(this, new mf4() { // from class: com.zepto.at2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.W1(this.a, (HtpTypeModle) obj);
            }
        });
        H1().j().g(this, new mf4() { // from class: com.zepto.bt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.X1(this.a, (String) obj);
            }
        });
        Spinner spinner = z1().p;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ct2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HypothecationAdditionActivityMultiService.L1(this.a, datePicker, i, i2, i3);
            }
        };
        z1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiService.M1(this.a, onDateSetListener, view);
            }
        });
        z1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.et2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiService.N1(this.a, view);
            }
        });
        I1().l().g(this, new mf4() { // from class: com.zepto.ft2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.O1(this.a, (DraftResponse) obj);
            }
        });
        I1().m().g(this, new mf4() { // from class: com.zepto.gt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiService.P1(this.a, (String) obj);
            }
        });
    }

    public final String x1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String y1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final jw2 z1() {
        jw2 jw2Var = this.binding;
        if (jw2Var != null) {
            return jw2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}
