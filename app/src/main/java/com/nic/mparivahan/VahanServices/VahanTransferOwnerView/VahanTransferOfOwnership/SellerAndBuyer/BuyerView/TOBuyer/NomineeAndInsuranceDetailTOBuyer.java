package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerSaveToDraftAAdhar.ToSaveToDraftBuyerRepo.TOSaveToDraftServiceBuyerAadhar;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.Relation;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.a85;
import com.zepto.fe;
import com.zepto.ih6;
import com.zepto.ji6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qb6;
import com.zepto.rb6;
import com.zepto.sb6;
import com.zepto.ta3;
import com.zepto.u72;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010.\u001a\n '*\u0004\u0018\u00010&0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00100\u001a\u0004\bO\u00102\"\u0004\bP\u00104R\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u00100\u001a\u0004\b[\u00102\"\u0004\b\\\u00104R\"\u0010a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00100\u001a\u0004\b_\u00102\"\u0004\b`\u00104R\"\u0010e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00100\u001a\u0004\bc\u00102\"\u0004\bd\u00104R\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010p\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010{\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R=\u0010\u0091\u0001\u001a\u0019\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010tj\f\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u0001`\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010v\u001a\u0005\b\u008f\u0001\u0010x\"\u0005\b\u0090\u0001\u0010z¨\u0006\u0094\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/NomineeAndInsuranceDetailTOBuyer;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "i2", "strNum", "", "J1", "Lcom/zepto/fe;", "C", "Lcom/zepto/fe;", "x1", "()Lcom/zepto/fe;", "W1", "(Lcom/zepto/fe;)V", "binding", "Lcom/zepto/ji6;", "D", "Lcom/zepto/ji6;", "G1", "()Lcom/zepto/ji6;", "f2", "(Lcom/zepto/ji6;)V", "toSaveToDraftViewModel", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerSaveToDraftAAdhar/ToSaveToDraftBuyerRepo/TOSaveToDraftServiceBuyerAadhar;", "E", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerSaveToDraftAAdhar/ToSaveToDraftBuyerRepo/TOSaveToDraftServiceBuyerAadhar;", "H1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerSaveToDraftAAdhar/ToSaveToDraftBuyerRepo/TOSaveToDraftServiceBuyerAadhar;", "g2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerSaveToDraftAAdhar/ToSaveToDraftBuyerRepo/TOSaveToDraftServiceBuyerAadhar;)V", "tosavetodraftService", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "F", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "G", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "X1", "(Ljava/lang/String;)V", "formated_date", "Lcom/zepto/sb6;", "H", "Lcom/zepto/sb6;", "I1", "()Lcom/zepto/sb6;", "h2", "(Lcom/zepto/sb6;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "I", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "e2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "C1", "()Landroid/app/ProgressDialog;", "b2", "(Landroid/app/ProgressDialog;)V", "pDialog", "K", "getRelationWithNomineeGet", "d2", "relationWithNomineeGet", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "z1", "()Lcom/zepto/wa3;", "Y1", "(Lcom/zepto/wa3;)V", "languageSession", "M", "getOff_code", "a2", "off_code", "N", "w1", "setAadhar_name", "aadhar_name", "O", "v1", "setAadhar_address", "aadhar_address", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "P", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "c2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Q", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Ljava/util/ArrayList;", "R", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "S", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "T", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiobj", "", "Lkotlin/collections/ArrayList;", "U", "F1", "setSelectPurCode", "selectPurCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NomineeAndInsuranceDetailTOBuyer extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fe binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ji6 toSaveToDraftViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TOSaveToDraftServiceBuyerAadhar tosavetodraftService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public sb6 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TOCommonService retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String relationWithNomineeGet;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiServiceDraft multiobj;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_name = "NA";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhar_address = "NA";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ArrayList selectPurCode = new ArrayList();

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
            NomineeAndInsuranceDetailTOBuyer.this.C1().dismiss();
            if (str.equals("Error")) {
                return;
            }
            NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer = NomineeAndInsuranceDetailTOBuyer.this;
            nomineeAndInsuranceDetailTOBuyer.i2(nomineeAndInsuranceDetailTOBuyer, str);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(ToCommonModel2 toCommonModel2) {
            NomineeAndInsuranceDetailTOBuyer.this.C1().dismiss();
            try {
                ArrayList<Relation> relation = toCommonModel2.getData().getRelation();
                relation.add(0, new Relation(0, "Select Relation With Nominee"));
                NomineeAndInsuranceDetailTOBuyer.this.x1().z.setAdapter((SpinnerAdapter) new a85(NomineeAndInsuranceDetailTOBuyer.this, relation));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ToCommonModel2) obj);
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

        public final void invoke(String str) {
            NomineeAndInsuranceDetailTOBuyer.this.C1().dismiss();
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            NomineeAndInsuranceDetailTOBuyer.this.d2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
        public final void a(SellerResponse sellerResponse) {
            Integer statusCode;
            TransferOwnershipDto transferOwnershipDto;
            NomineeAndInsuranceDetailTOBuyer.this.C1().dismiss();
            ApiMessage apiMessage = sellerResponse.getApiMessage();
            if (apiMessage == null || (statusCode = apiMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer = NomineeAndInsuranceDetailTOBuyer.this;
                ApiMessage apiMessage2 = sellerResponse.getApiMessage();
                nomineeAndInsuranceDetailTOBuyer.i2(nomineeAndInsuranceDetailTOBuyer, apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
                return;
            }
            try {
                NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer2 = NomineeAndInsuranceDetailTOBuyer.this;
                MultiServiceDraftTO multiServiceobj = nomineeAndInsuranceDetailTOBuyer2.getMultiServiceobj();
                String applNo = multiServiceobj != null ? multiServiceobj.getApplNo() : null;
                MultiServiceDraftTO multiServiceobj2 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                ChanngeOfAdressDto channgeOfAdressDto = multiServiceobj2 != null ? multiServiceobj2.getChanngeOfAdressDto() : null;
                MultiServiceDraftTO multiServiceobj3 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                Durcdto durcdto = multiServiceobj3 != null ? multiServiceobj3.getDurcdto() : null;
                MultiServiceDraftTO multiServiceobj4 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                HpaDto hpaDto = multiServiceobj4 != null ? multiServiceobj4.getHpaDto() : null;
                MultiServiceDraftTO multiServiceobj5 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                HptDto hptDto = multiServiceobj5 != null ? multiServiceobj5.getHptDto() : null;
                MultiServiceDraftTO multiServiceobj6 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                Integer numValueOf = multiServiceobj6 != null ? Integer.valueOf(multiServiceobj6.getOfficeCode()) : null;
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue = numValueOf.intValue();
                MultiServiceDraftTO multiServiceobj7 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                String openDate = multiServiceobj7 != null ? multiServiceobj7.getOpenDate() : null;
                ArrayList selectPurCode = NomineeAndInsuranceDetailTOBuyer.this.getSelectPurCode();
                Intrinsics.checkNotNull(selectPurCode);
                MultiServiceDraftTO multiServiceobj8 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                String regnNo = multiServiceobj8 != null ? multiServiceobj8.getRegnNo() : null;
                MultiServiceDraftTO multiServiceobj9 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                String stateCode = multiServiceobj9 != null ? multiServiceobj9.getStateCode() : null;
                MultiServiceDraftTO multiServiceobj10 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                nomineeAndInsuranceDetailTOBuyer2.Z1(new MultiServiceDraft(applNo, channgeOfAdressDto, durcdto, hpaDto, hptDto, iIntValue, openDate, selectPurCode, regnNo, stateCode, multiServiceobj10 != null ? multiServiceobj10.getTransferOwnershipDto() : null));
                Intent intent = new Intent(NomineeAndInsuranceDetailTOBuyer.this, (Class<?>) VahanMultiServiceConfirmationScreen.class);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, VContant.INSTANCE.i(NomineeAndInsuranceDetailTOBuyer.this.getSelectPurCode()));
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, NomineeAndInsuranceDetailTOBuyer.this.getMultiobj());
                intent.putExtra("RcDetails", NomineeAndInsuranceDetailTOBuyer.this.D1());
                MultiServiceDraftTO multiServiceobj11 = NomineeAndInsuranceDetailTOBuyer.this.getMultiServiceobj();
                if (multiServiceobj11 != null && (transferOwnershipDto = multiServiceobj11.getTransferOwnershipDto()) != null) {
                    authMode = transferOwnershipDto.getAuthMode();
                }
                if (StringsKt__StringsJVMKt.equals(authMode, "A", true)) {
                    intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                } else {
                    intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                }
                intent.putExtra(VContant.NEXGEN_addahar_name, NomineeAndInsuranceDetailTOBuyer.this.getAadhar_name());
                intent.putExtra(VContant.NEXGEN_addahar_address, NomineeAndInsuranceDetailTOBuyer.this.getAadhar_address());
                NomineeAndInsuranceDetailTOBuyer.this.startActivity(intent);
                NomineeAndInsuranceDetailTOBuyer.this.finishAffinity();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SellerResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public static final void K1(NomineeAndInsuranceDetailTOBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.D1().getRc_regn_no());
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.aadhar_name);
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.aadhar_address);
        this$0.startActivity(intent);
    }

    public static final void L1(NomineeAndInsuranceDetailTOBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void M1(NomineeAndInsuranceDetailTOBuyer this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.X1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.x1().m.setText(this$0.y1());
    }

    public static final void N1(NomineeAndInsuranceDetailTOBuyer this$0, DatePickerDialog.OnDateSetListener dateSetListenerinsuranceUpto, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerinsuranceUpto, "$dateSetListenerinsuranceUpto");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerinsuranceUpto, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void O1(NomineeAndInsuranceDetailTOBuyer this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.x1().d.setChecked(false);
            this$0.x1().e.setChecked(true);
            this$0.x1().t.setVisibility(0);
        }
    }

    public static final void P1(NomineeAndInsuranceDetailTOBuyer this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.x1().d.setChecked(true);
            this$0.x1().e.setChecked(false);
            this$0.x1().t.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Q1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer r48, android.view.View r49) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer.Q1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer, android.view.View):void");
    }

    public static final void R1(NomineeAndInsuranceDetailTOBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void S1(NomineeAndInsuranceDetailTOBuyer this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.X1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.x1().q.setText(this$0.y1());
    }

    public static final void T1(NomineeAndInsuranceDetailTOBuyer this$0, DatePickerDialog.OnDateSetListener dateSetListenerNominee, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerNominee, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerNominee, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void U1(NomineeAndInsuranceDetailTOBuyer this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.X1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.x1().j.setText(this$0.y1());
    }

    public static final void V1(NomineeAndInsuranceDetailTOBuyer this$0, DatePickerDialog.OnDateSetListener dateSetListenerinsuranceFrom, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerinsuranceFrom, "$dateSetListenerinsuranceFrom");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerinsuranceFrom, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final MultiServiceDraftTO getMultiServiceobj() {
        return this.multiServiceobj;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final MultiServiceDraft getMultiobj() {
        return this.multiobj;
    }

    public final ProgressDialog C1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final TOCommonService E1() {
        TOCommonService tOCommonService = this.retrofitService;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final ArrayList getSelectPurCode() {
        return this.selectPurCode;
    }

    public final ji6 G1() {
        ji6 ji6Var = this.toSaveToDraftViewModel;
        if (ji6Var != null) {
            return ji6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toSaveToDraftViewModel");
        return null;
    }

    public final TOSaveToDraftServiceBuyerAadhar H1() {
        TOSaveToDraftServiceBuyerAadhar tOSaveToDraftServiceBuyerAadhar = this.tosavetodraftService;
        if (tOSaveToDraftServiceBuyerAadhar != null) {
            return tOSaveToDraftServiceBuyerAadhar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tosavetodraftService");
        return null;
    }

    public final sb6 I1() {
        sb6 sb6Var = this.viewModel;
        if (sb6Var != null) {
            return sb6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final boolean J1(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void W1(fe feVar) {
        Intrinsics.checkNotNullParameter(feVar, "<set-?>");
        this.binding = feVar;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void Y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void Z1(MultiServiceDraft multiServiceDraft) {
        this.multiobj = multiServiceDraft;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void b2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void c2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationWithNomineeGet = str;
    }

    public final void e2(TOCommonService tOCommonService) {
        Intrinsics.checkNotNullParameter(tOCommonService, "<set-?>");
        this.retrofitService = tOCommonService;
    }

    public final void f2(ji6 ji6Var) {
        Intrinsics.checkNotNullParameter(ji6Var, "<set-?>");
        this.toSaveToDraftViewModel = ji6Var;
    }

    public final void g2(TOSaveToDraftServiceBuyerAadhar tOSaveToDraftServiceBuyerAadhar) {
        Intrinsics.checkNotNullParameter(tOSaveToDraftServiceBuyerAadhar, "<set-?>");
        this.tosavetodraftService = tOSaveToDraftServiceBuyerAadhar;
    }

    public final void h2(sb6 sb6Var) {
        Intrinsics.checkNotNullParameter(sb6Var, "<set-?>");
        this.viewModel = sb6Var;
    }

    public final void i2(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.za4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.j2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fe feVarC = fe.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(feVarC, "inflate(...)");
        W1(feVarC);
        setContentView(x1().b());
        Y1(new wa3(this));
        ta3.a.Z1(this, x1());
        Y1(new wa3(this));
        if (new vh7(this).b()) {
            x1().y.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = x1().y.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        e2(TOCommonService.INSTANCE.a(this));
        g2(TOSaveToDraftServiceBuyerAadhar.INSTANCE.a(this));
        a2(String.valueOf(getIntent().getStringExtra("off_code")));
        this.aadhar_name = String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name));
        this.aadhar_address = String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        c2((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        x1().D.i.setText(String.valueOf(z1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        x1().D.e.setVisibility(0);
        x1().D.e.setText(D1().getRc_regn_no());
        SpannableString spannableString = new SpannableString(D1().getRc_regn_no());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        x1().D.e.setText(spannableString);
        x1().D.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wa4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.K1(this.a, view);
            }
        });
        b2(new ProgressDialog(this));
        C1().setMessage("Please wait...");
        C1().setCancelable(false);
        C1().setCanceledOnTouchOutside(false);
        h2((sb6) new z(this, new rb6(new qb6(E1()))).a(sb6.class));
        f2((ji6) new z(this, new u72(new ih6(H1()))).a(ji6.class));
        try {
            C1().show();
            I1().g();
        } catch (Exception unused) {
        }
        x1().D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.L1(this.a, view);
            }
        });
        I1().i().g(this, new f(new b()));
        I1().h().g(this, new f(new c()));
        x1().e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.db4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                NomineeAndInsuranceDetailTOBuyer.O1(this.a, compoundButton, z2);
            }
        });
        x1().d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.eb4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                NomineeAndInsuranceDetailTOBuyer.P1(this.a, compoundButton, z2);
            }
        });
        x1().z.setOnItemSelectedListener(new d());
        x1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.Q1(this.a, view);
            }
        });
        G1().h().g(this, new f(new e()));
        G1().g().g(this, new f(new a()));
        x1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.R1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.hb4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NomineeAndInsuranceDetailTOBuyer.S1(this.a, datePicker, i, i2, i3);
            }
        };
        x1().q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ib4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.T1(this.a, onDateSetListener, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener2 = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.xa4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NomineeAndInsuranceDetailTOBuyer.U1(this.a, datePicker, i, i2, i3);
            }
        };
        x1().j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ya4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.V1(this.a, onDateSetListener2, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener3 = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ab4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NomineeAndInsuranceDetailTOBuyer.M1(this.a, datePicker, i, i2, i3);
            }
        };
        x1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetailTOBuyer.N1(this.a, onDateSetListener3, view);
            }
        });
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final String getAadhar_address() {
        return this.aadhar_address;
    }

    /* JADX INFO: renamed from: w1, reason: from getter */
    public final String getAadhar_name() {
        return this.aadhar_name;
    }

    public final fe x1() {
        fe feVar = this.binding;
        if (feVar != null) {
            return feVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String y1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 z1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }
}
