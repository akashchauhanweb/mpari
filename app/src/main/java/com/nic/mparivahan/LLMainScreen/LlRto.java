package com.nic.mparivahan.LLMainScreen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.LLMainScreen.LlRto;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.RTO;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.jd;
import com.zepto.jl;
import com.zepto.kl;
import com.zepto.kt6;
import com.zepto.ll;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.nr1;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.x31;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR2\u0010b\u001a\u0012\u0012\u0004\u0012\u00020Z0Yj\b\u0012\u0004\u0012\u00020Z`[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010h\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010#\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010#\u001a\u0004\bj\u0010e\"\u0004\bk\u0010g¨\u0006o"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlRto;", "Lcom/zepto/pq;", "", "A1", "", "message", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/jd;", "C", "Lcom/zepto/jd;", "o1", "()Lcom/zepto/jd;", "G1", "(Lcom/zepto/jd;)V", "binding", "Lcom/zepto/wl5;", "D", "Lcom/zepto/wl5;", "x1", "()Lcom/zepto/wl5;", "Q1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/nr1;", "E", "Lcom/zepto/nr1;", "p1", "()Lcom/zepto/nr1;", "H1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "F", "Ljava/lang/String;", "rtoCd", "Landroid/content/Context;", "G", "Landroid/content/Context;", "u1", "()Landroid/content/Context;", "M1", "(Landroid/content/Context;)V", "mContext", "H", "getSahi_session", "P1", "sahi_session", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "I", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "w1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "O1", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "I1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "K", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "r1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "J1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Lcom/zepto/ll;", "L", "Lcom/zepto/ll;", "t1", "()Lcom/zepto/ll;", "L1", "(Lcom/zepto/ll;)V", "mAadharViewModel", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "M", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "s1", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "K1", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;)V", "mAadharInterface", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "Lkotlin/collections/ArrayList;", "N", "Ljava/util/ArrayList;", "v1", "()Ljava/util/ArrayList;", "N1", "(Ljava/util/ArrayList;)V", "mRtosMaster", "O", "y1", "()Ljava/lang/String;", "R1", "(Ljava/lang/String;)V", "selectedRtoCd", "P", "z1", "S1", "selectedRtoName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlRto extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jd binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ll mAadharViewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public AadharInterface mAadharInterface;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList mRtosMaster;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String rtoCd = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String selectedRtoCd = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String selectedRtoName = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            LlRto llRto = LlRto.this;
            llRto.S1(((RtosMaster) llRto.v1().get(i)).getRto_name());
            LlRto llRto2 = LlRto.this;
            llRto2.R1(((RtosMaster) llRto2.v1().get(i)).getRto_code());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(CheckByState checkByState) {
            LlRto.this.o1().I.c(false);
            try {
                Intent intent = new Intent(LlRto.this.u1(), (Class<?>) LlMobileOtp.class);
                intent.putExtra("LLDetails", LlRto.this.r1());
                intent.putExtra("selectedRtoCd", LlRto.this.getSelectedRtoCd());
                intent.putExtra("selectedRtoName", LlRto.this.getSelectedRtoName());
                LlRto.this.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckByState) obj);
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
            LlRto.this.o1().I.c(false);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(CurrentRTO currentRTO) {
            LlRto.this.o1().x.setVisibility(8);
            try {
                int i = 0;
                if (!StringsKt__StringsJVMKt.equals(currentRTO.getStatus_code(), "00", true)) {
                    LlRto llRto = LlRto.this;
                    List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                    Intrinsics.checkNotNull(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                    llRto.N1((ArrayList) rtosMaster);
                    ArrayList arrayListV1 = LlRto.this.v1();
                    String strB = LlRto.this.q1().b("select_rto", LlRto.this.getString(R.string.please_select_rto));
                    Intrinsics.checkNotNull(strB);
                    arrayListV1.add(0, new RtosMaster(strB, "0"));
                    LlRto llRto2 = LlRto.this;
                    LlRto.this.o1().t.setAdapter((SpinnerAdapter) new x31(llRto2, llRto2.v1()));
                    int size = LlRto.this.v1().size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (Intrinsics.areEqual(LlRto.this.rtoCd, ((RtosMaster) LlRto.this.v1().get(i2)).getRto_code())) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    if (i > 0) {
                        LlRto.this.o1().t.setSelection(i);
                        return;
                    }
                    return;
                }
                LlRto.this.o1().p.setClickable(true);
                LlRto llRto3 = LlRto.this;
                List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                llRto3.N1((ArrayList) rtosMaster2);
                ArrayList arrayListV12 = LlRto.this.v1();
                String strB2 = LlRto.this.q1().b("select_rto", LlRto.this.getString(R.string.please_select_rto));
                Intrinsics.checkNotNull(strB2);
                arrayListV12.add(0, new RtosMaster(strB2, "0"));
                LlRto llRto4 = LlRto.this;
                LlRto.this.o1().t.setAdapter((SpinnerAdapter) new x31(llRto4, llRto4.v1()));
                int size2 = LlRto.this.v1().size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (Intrinsics.areEqual(LlRto.this.rtoCd, ((RtosMaster) LlRto.this.v1().get(i3)).getRto_code())) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                if (i > 0) {
                    LlRto.this.o1().t.setSelection(i);
                }
                LlRto.this.o1().t.setEnabled(true);
                LlRto.this.o1().t.setClickable(true);
            } catch (Exception unused) {
                LlRto.this.o1().x.setVisibility(8);
                LlRto llRto5 = LlRto.this;
                llRto5.E1(llRto5.q1().b("service_is_not_present", LlRto.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CurrentRTO) obj);
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
            LlRto.this.o1().x.setVisibility(8);
            LlRto llRto = LlRto.this;
            llRto.E1(llRto.q1().b("service_is_not_present", LlRto.this.getString(R.string.unable_to_get_details)));
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

    private final void A1() {
        M1(this);
        P1(new wl5(this));
        I1(new wa3(this));
        O1(DlServiceInt.INSTANCE.a(this));
        Q1(new wl5(this));
        K1(AadharInterface.INSTANCE.a(this));
        L1((ll) new z(this, new jl(new kl(s1()))).a(ll.class));
        H1((nr1) new z(this, new rq1(new lr1(w1(), this))).a(nr1.class));
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            J1((FetchLlDetails) serializableExtra);
            o1().A.setText(r1().getState().getStateName());
            RTO rto = r1().getRTO();
            Intrinsics.checkNotNull(rto);
            if (rto.getRTOCd() != null) {
                TextView textView = o1().z;
                RTO rto2 = r1().getRTO();
                Intrinsics.checkNotNull(rto2);
                textView.setText(rto2.getRTOName());
                RTO rto3 = r1().getRTO();
                Intrinsics.checkNotNull(rto3);
                String rTOCd = rto3.getRTOCd();
                Intrinsics.checkNotNull(rTOCd);
                this.rtoCd = rTOCd;
                RTO rto4 = r1().getRTO();
                Intrinsics.checkNotNull(rto4);
                String rTOCd2 = rto4.getRTOCd();
                Intrinsics.checkNotNull(rTOCd2);
                this.selectedRtoCd = rTOCd2;
                RTO rto5 = r1().getRTO();
                Intrinsics.checkNotNull(rto5);
                String rTOName = rto5.getRTOName();
                Intrinsics.checkNotNull(rTOName);
                this.selectedRtoName = rTOName;
            } else {
                o1().z.setText("NA");
                this.rtoCd = "";
                this.selectedRtoCd = "";
                this.selectedRtoName = "NA";
            }
            if (kt6.d(r1().getState().getStCd())) {
                o1().x.setVisibility(8);
                p1().h(this, r1().getState().getStCd());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        o1().n.setText(x1().k());
        o1().m.setText("LL No. : " + StringsKt__StringsKt.trim((CharSequence) r1().getLearningLicence()).toString());
        o1().t.setOnItemSelectedListener(new a());
    }

    public static final void B1(LlRto this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.o1().t.performClick();
    }

    public static final void C1(LlRto this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.q1().b("label_log_check_internet", this$0.getString(R.string.msg_no_internet)), 1).show();
            return;
        }
        int i = Intrinsics.areEqual(this$0.x1().b(), "502") ? 502 : Intrinsics.areEqual(this$0.x1().b(), "504") ? 504 : Intrinsics.areEqual(this$0.x1().b(), "574") ? 574 : Integer.parseInt(this$0.x1().n());
        if (Intrinsics.areEqual(this$0.selectedRtoCd, "0")) {
            Toast.makeText(this$0.getApplicationContext(), this$0.q1().b("select_rto", this$0.getString(R.string.please_select_rto)), 1).show();
        } else {
            this$0.o1().I.c(true);
            this$0.t1().g(this$0.x1().n(), i, this$0.selectedRtoCd);
        }
    }

    public static final void D1(LlRto this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(q1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ll3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlRto.F1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void G1(jd jdVar) {
        Intrinsics.checkNotNullParameter(jdVar, "<set-?>");
        this.binding = jdVar;
    }

    public final void H1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void I1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void J1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void K1(AadharInterface aadharInterface) {
        Intrinsics.checkNotNullParameter(aadharInterface, "<set-?>");
        this.mAadharInterface = aadharInterface;
    }

    public final void L1(ll llVar) {
        Intrinsics.checkNotNullParameter(llVar, "<set-?>");
        this.mAadharViewModel = llVar;
    }

    public final void M1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void N1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mRtosMaster = arrayList;
    }

    public final void O1(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void P1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final void Q1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRtoCd = str;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRtoName = str;
    }

    public final jd o1() {
        jd jdVar = this.binding;
        if (jdVar != null) {
            return jdVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jd jdVarC = jd.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jdVarC, "inflate(...)");
        G1(jdVarC);
        setContentView(o1().b());
        A1();
        ta3.a.j1(this, o1());
        t1().j().g(this, new f(new b()));
        t1().i().g(this, new f(new c()));
        o1().u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.il3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlRto.B1(this.a, view);
            }
        });
        o1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlRto.C1(this.a, view);
            }
        });
        o1().H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlRto.D1(this.a, view);
            }
        });
        p1().y().g(this, new f(new d()));
        p1().A().g(this, new f(new e()));
    }

    public final nr1 p1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails r1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final AadharInterface s1() {
        AadharInterface aadharInterface = this.mAadharInterface;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface");
        return null;
    }

    public final ll t1() {
        ll llVar = this.mAadharViewModel;
        if (llVar != null) {
            return llVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel");
        return null;
    }

    public final Context u1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ArrayList v1() {
        ArrayList arrayList = this.mRtosMaster;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRtosMaster");
        return null;
    }

    public final DlServiceInt w1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 x1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final String getSelectedRtoCd() {
        return this.selectedRtoCd;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getSelectedRtoName() {
        return this.selectedRtoName;
    }
}
