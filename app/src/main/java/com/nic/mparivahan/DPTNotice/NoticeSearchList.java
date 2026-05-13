package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel;
import com.nic.mparivahan.DPTNotice.NoticeSearchList;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.R;
import com.zepto.ec1;
import com.zepto.ie;
import com.zepto.kt6;
import com.zepto.lc1;
import com.zepto.mc1;
import com.zepto.mf4;
import com.zepto.od4;
import com.zepto.pq;
import com.zepto.wa3;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R&\u0010:\u001a\u0012\u0012\u0004\u0012\u00020605j\b\u0012\u0004\u0012\u000206`78\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R2\u0010@\u001a\u0012\u0012\u0004\u0012\u00020605j\b\u0012\u0004\u0012\u000206`78\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00109\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010\u0013R\u0016\u0010D\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u0013R\u0016\u0010F\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0013¨\u0006I"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/NoticeSearchList;", "Lcom/zepto/pq;", "", "w1", "r1", "t1", "s1", "", "F1", "A1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "D1", "C", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "D", "getInputType", "setInputType", "inputType", "Lcom/zepto/ie;", "E", "Lcom/zepto/ie;", "binding", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "C1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "G", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "retrofitService", "Lcom/zepto/mc1;", "H", "Lcom/zepto/mc1;", "viewModel", "Lcom/zepto/od4;", "I", "Lcom/zepto/od4;", "adapter", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "Lkotlin/collections/ArrayList;", "J", "Ljava/util/ArrayList;", "noticeSearchArray", "K", "u1", "()Ljava/util/ArrayList;", "B1", "(Ljava/util/ArrayList;)V", "filteredList", "L", "digit", "M", "serviceName", "N", "serviceCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NoticeSearchList extends pq {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ie binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public NoticeService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public mc1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public od4 adapter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList noticeSearchArray = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList filteredList = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String serviceCode = "";

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
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            ie ieVar = NoticeSearchList.this.binding;
            if (ieVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar = null;
            }
            ieVar.e.setError(null);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(NoticeListModel noticeListModel) {
            try {
                ie ieVar = NoticeSearchList.this.binding;
                ie ieVar2 = null;
                od4 od4Var = null;
                if (ieVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar = null;
                }
                ieVar.f.setVisibility(8);
                ie ieVar3 = NoticeSearchList.this.binding;
                if (ieVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar3 = null;
                }
                ieVar3.c.setVisibility(8);
                ie ieVar4 = NoticeSearchList.this.binding;
                if (ieVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar4 = null;
                }
                ieVar4.d.setVisibility(0);
                Intrinsics.checkNotNull(noticeListModel);
                if (StringsKt__StringsJVMKt.equals(noticeListModel.getCode(), "200", true)) {
                    if (Intrinsics.areEqual(NoticeSearchList.this.serviceName, "Verify Payment Status")) {
                        NoticeSearchList.this.B1(noticeListModel.getData());
                        if (NoticeSearchList.this.getFilteredList().size() > 0) {
                            int size = NoticeSearchList.this.getFilteredList().size();
                            for (int i = 0; i < size; i++) {
                                if (((DPTNoticeDataModel) NoticeSearchList.this.getFilteredList().get(i)).getPayment_eligible() == 0) {
                                    NoticeSearchList.this.noticeSearchArray.add(NoticeSearchList.this.getFilteredList().get(i));
                                }
                            }
                        }
                    } else {
                        NoticeSearchList.this.noticeSearchArray = noticeListModel.getData();
                    }
                    if (NoticeSearchList.this.noticeSearchArray.size() > 1) {
                        ie ieVar5 = NoticeSearchList.this.binding;
                        if (ieVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ieVar5 = null;
                        }
                        ieVar5.j.setText(NoticeSearchList.this.getString(R.string.total_notices) + NoticeSearchList.this.noticeSearchArray.size());
                    } else {
                        ie ieVar6 = NoticeSearchList.this.binding;
                        if (ieVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ieVar6 = null;
                        }
                        ieVar6.j.setText(NoticeSearchList.this.getString(R.string.total_notice) + ": " + NoticeSearchList.this.noticeSearchArray.size());
                    }
                    if (NoticeSearchList.this.noticeSearchArray.size() > 0) {
                        ie ieVar7 = NoticeSearchList.this.binding;
                        if (ieVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ieVar7 = null;
                        }
                        ieVar7.c.setVisibility(8);
                        ie ieVar8 = NoticeSearchList.this.binding;
                        if (ieVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ieVar8 = null;
                        }
                        ieVar8.d.setVisibility(0);
                        od4 od4Var2 = NoticeSearchList.this.adapter;
                        if (od4Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            od4Var = od4Var2;
                        }
                        od4Var.B(NoticeSearchList.this.noticeSearchArray);
                        return;
                    }
                    ie ieVar9 = NoticeSearchList.this.binding;
                    if (ieVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ieVar9 = null;
                    }
                    ieVar9.c.setVisibility(0);
                    if (Intrinsics.areEqual(NoticeSearchList.this.serviceName, "Verify Payment Status")) {
                        ie ieVar10 = NoticeSearchList.this.binding;
                        if (ieVar10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            ieVar10 = null;
                        }
                        ieVar10.c.setText(NoticeSearchList.this.getString(R.string.no_transcation_found));
                    }
                    ie ieVar11 = NoticeSearchList.this.binding;
                    if (ieVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        ieVar2 = ieVar11;
                    }
                    ieVar2.d.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NoticeListModel) obj);
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
            ie ieVar = NoticeSearchList.this.binding;
            ie ieVar2 = null;
            if (ieVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar = null;
            }
            ieVar.f.setVisibility(8);
            ie ieVar3 = NoticeSearchList.this.binding;
            if (ieVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar3 = null;
            }
            ieVar3.c.setVisibility(0);
            ie ieVar4 = NoticeSearchList.this.binding;
            if (ieVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar4 = null;
            }
            ieVar4.d.setVisibility(8);
            ie ieVar5 = NoticeSearchList.this.binding;
            if (ieVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ieVar2 = ieVar5;
            }
            ieVar2.j.setVisibility(8);
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    private final boolean A1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public static final void E1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean F1() {
        ie ieVar = this.binding;
        ie ieVar2 = null;
        if (ieVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(ieVar.e.getText())).toString();
        if (!Intrinsics.areEqual(this.inputType, "Notice")) {
            return false;
        }
        if (string.length() == 0) {
            ie ieVar3 = this.binding;
            if (ieVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar3 = null;
            }
            ieVar3.e.setError(getString(R.string.please_enter_notice_no));
            ie ieVar4 = this.binding;
            if (ieVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ieVar2 = ieVar4;
            }
            ieVar2.e.requestFocus();
            return true;
        }
        if (string.length() >= 5) {
            return false;
        }
        ie ieVar5 = this.binding;
        if (ieVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar5 = null;
        }
        ieVar5.e.setError(getString(R.string.enter_min_notice_no));
        ie ieVar6 = this.binding;
        if (ieVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ieVar2 = ieVar6;
        }
        ieVar2.e.requestFocus();
        return true;
    }

    private final void r1() {
        if (!A1()) {
            D1(this, v1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        } else if (Intrinsics.areEqual(this.inputType, "Notice")) {
            s1();
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            t1();
        }
    }

    private final void s1() {
        try {
            ie ieVar = this.binding;
            mc1 mc1Var = null;
            if (ieVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar = null;
            }
            ieVar.f.setVisibility(0);
            mc1 mc1Var2 = this.viewModel;
            if (mc1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                mc1Var = mc1Var2;
            }
            mc1Var.k("Notice", this.inputValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void t1() {
        try {
            ie ieVar = this.binding;
            mc1 mc1Var = null;
            if (ieVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar = null;
            }
            ieVar.f.setVisibility(0);
            mc1 mc1Var2 = this.viewModel;
            if (mc1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                mc1Var = mc1Var2;
            }
            mc1Var.l("RC", this.inputValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void w1() {
        ie ieVar = this.binding;
        ie ieVar2 = null;
        if (ieVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar = null;
        }
        ieVar.i.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearchList.x1(this.a, view);
            }
        });
        NoticeService noticeService = this.retrofitService;
        if (noticeService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            noticeService = null;
        }
        this.viewModel = (mc1) new z(this, new lc1(new ec1(noticeService))).a(mc1.class);
        ie ieVar3 = this.binding;
        if (ieVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar3 = null;
        }
        ieVar3.e.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        ie ieVar4 = this.binding;
        if (ieVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar4 = null;
        }
        ieVar4.e.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Notice")) {
                ie ieVar5 = this.binding;
                if (ieVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar5 = null;
                }
                ieVar5.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                ie ieVar6 = this.binding;
                if (ieVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar6 = null;
                }
                ieVar6.e.setHint(getString(R.string.enter_notice_number));
            } else if (Intrinsics.areEqual(str, "RC")) {
                ie ieVar7 = this.binding;
                if (ieVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar7 = null;
                }
                ieVar7.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                ie ieVar8 = this.binding;
                if (ieVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar8 = null;
                }
                ieVar8.e.setHint(getString(R.string.enter_vehicle_number));
            }
        }
        if (this.inputValue.length() > 0) {
            ie ieVar9 = this.binding;
            if (ieVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar9 = null;
            }
            ieVar9.e.setText(this.inputValue);
        }
        ie ieVar10 = this.binding;
        if (ieVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar10 = null;
        }
        ieVar10.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearchList.y1(this.a, view);
            }
        });
        ie ieVar11 = this.binding;
        if (ieVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar11 = null;
        }
        ieVar11.e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.ld4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return NoticeSearchList.z1(this.a, textView, i, keyEvent);
            }
        });
        ie ieVar12 = this.binding;
        if (ieVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ieVar2 = ieVar12;
        }
        ieVar2.e.addTextChangedListener(new a());
        r1();
    }

    public static final void x1(NoticeSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void y1(NoticeSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.inputType, "RC")) {
            this$0.onBackPressed();
            return;
        }
        ie ieVar = null;
        if (Intrinsics.areEqual(this$0.inputType, "Notice") && !this$0.F1()) {
            ie ieVar2 = this$0.binding;
            if (ieVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ieVar = ieVar2;
            }
            this$0.inputValue = StringsKt__StringsKt.trim((CharSequence) String.valueOf(ieVar.e.getText())).toString();
            this$0.r1();
            return;
        }
        ie ieVar3 = this$0.binding;
        if (ieVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar3 = null;
        }
        ieVar3.e.setError(this$0.getString(R.string.please_enter_notice_no));
        ie ieVar4 = this$0.binding;
        if (ieVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ieVar = ieVar4;
        }
        ieVar.e.requestFocus();
    }

    public static final boolean z1(NoticeSearchList this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        if (Intrinsics.areEqual(this$0.inputType, "RC")) {
            this$0.onBackPressed();
        } else {
            ie ieVar = null;
            if (!Intrinsics.areEqual(this$0.inputType, "Notice") || this$0.F1()) {
                ie ieVar2 = this$0.binding;
                if (ieVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar2 = null;
                }
                ieVar2.e.setError(this$0.getString(R.string.please_enter_notice_no));
                ie ieVar3 = this$0.binding;
                if (ieVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ieVar = ieVar3;
                }
                ieVar.e.requestFocus();
                return true;
            }
            ie ieVar4 = this$0.binding;
            if (ieVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ieVar = ieVar4;
            }
            this$0.inputValue = StringsKt__StringsKt.trim((CharSequence) String.valueOf(ieVar.e.getText())).toString();
            this$0.r1();
        }
        return true;
    }

    public final void B1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.filteredList = arrayList;
    }

    public final void C1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void D1(Context context, String message) {
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
        textView.setText(v1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(v1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.md4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeSearchList.E1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ie ieVarC = ie.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ieVarC, "inflate(...)");
        this.binding = ieVarC;
        mc1 mc1Var = null;
        if (ieVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVarC = null;
        }
        setContentView(ieVarC.b());
        C1(new wa3(this));
        String stringExtra = getIntent().getStringExtra("inputValue");
        Intrinsics.checkNotNull(stringExtra);
        this.inputValue = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra2);
        this.inputType = stringExtra2;
        this.retrofitService = NoticeService.INSTANCE.a(this);
        if (getIntent().hasExtra("serviceName")) {
            String stringExtra3 = getIntent().getStringExtra("serviceName");
            Intrinsics.checkNotNull(stringExtra3);
            this.serviceName = stringExtra3;
            ie ieVar = this.binding;
            if (ieVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ieVar = null;
            }
            ieVar.h.setText(this.serviceName);
        }
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra4 = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra4);
            this.serviceCode = stringExtra4;
        }
        if (kt6.d(this.serviceCode)) {
            if (StringsKt__StringsJVMKt.equals(this.serviceCode, "111", true)) {
                ie ieVar2 = this.binding;
                if (ieVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar2 = null;
                }
                ieVar2.i.i.setText(v1().b("cn_statusTitle", getString(R.string.challan_notice_status)));
            } else if (StringsKt__StringsJVMKt.equals(this.serviceCode, "112", true)) {
                ie ieVar3 = this.binding;
                if (ieVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar3 = null;
                }
                ieVar3.i.i.setText(v1().b("cn_PaymentTitle", getString(R.string.challan_notice_payment_title)));
            } else if (StringsKt__StringsJVMKt.equals(this.serviceCode, "114", true)) {
                ie ieVar4 = this.binding;
                if (ieVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ieVar4 = null;
                }
                ieVar4.i.i.setText(v1().b("cn_downloadTitle", getString(R.string.challan_notice_download_title)));
            }
        }
        ie ieVar5 = this.binding;
        if (ieVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar5 = null;
        }
        ieVar5.d.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new od4(this, this.noticeSearchArray, this.inputType, v1(), this.serviceName, this.serviceCode);
        ie ieVar6 = this.binding;
        if (ieVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ieVar6 = null;
        }
        RecyclerView recyclerView = ieVar6.d;
        od4 od4Var = this.adapter;
        if (od4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            od4Var = null;
        }
        recyclerView.setAdapter(od4Var);
        w1();
        mc1 mc1Var2 = this.viewModel;
        if (mc1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mc1Var2 = null;
        }
        mc1Var2.h().g(this, new d(new b()));
        mc1 mc1Var3 = this.viewModel;
        if (mc1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            mc1Var = mc1Var3;
        }
        mc1Var.g().g(this, new d(new c()));
    }

    /* JADX INFO: renamed from: u1, reason: from getter */
    public final ArrayList getFilteredList() {
        return this.filteredList;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }
}
