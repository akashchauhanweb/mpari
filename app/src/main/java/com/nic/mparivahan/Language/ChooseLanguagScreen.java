package com.nic.mparivahan.Language;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Language.ChooseLanguagScreen;
import com.nic.mparivahan.Language.Modle.GetLanguageStrings;
import com.nic.mparivahan.Language.Modle.LangJSON;
import com.nic.mparivahan.Language.Modle.Language;
import com.nic.mparivahan.Language.Modle.LanguageModle;
import com.nic.mparivahan.R;
import com.zepto.gd1;
import com.zepto.gs0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sa3;
import com.zepto.ua3;
import com.zepto.wa3;
import com.zepto.xa3;
import com.zepto.ya3;
import com.zepto.za3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bS\u0010TJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0002R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/nic/mparivahan/Language/ChooseLanguagScreen;", "Lcom/zepto/pq;", "Lcom/zepto/ua3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "langId", "", "position", "w", "language", "choose", "W", "n1", "Lcom/zepto/za3;", "C", "Lcom/zepto/za3;", "t1", "()Lcom/zepto/za3;", "E1", "(Lcom/zepto/za3;)V", "viewModel", "Lcom/nic/mparivahan/Language/LanguageService;", "D", "Lcom/nic/mparivahan/Language/LanguageService;", "r1", "()Lcom/nic/mparivahan/Language/LanguageService;", "C1", "(Lcom/nic/mparivahan/Language/LanguageService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "q1", "()Landroid/app/ProgressDialog;", "B1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/Button;", "F", "Landroid/widget/Button;", "l1", "()Landroid/widget/Button;", "x1", "(Landroid/widget/Button;)V", "btnContinue", "G", "Ljava/lang/String;", "getLangCode", "()Ljava/lang/String;", "setLangCode", "(Ljava/lang/String;)V", "langCode", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "o1", "()Lcom/zepto/wa3;", "z1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Landroid/widget/TextView;", "I", "Landroid/widget/TextView;", "m1", "()Landroid/widget/TextView;", "y1", "(Landroid/widget/TextView;)V", "choose_language", "J", "s1", "D1", "vahan_service_lable", "Landroid/widget/LinearLayout;", "K", "Landroid/widget/LinearLayout;", "p1", "()Landroid/widget/LinearLayout;", "A1", "(Landroid/widget/LinearLayout;)V", "languageLayout", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ChooseLanguagScreen extends pq implements ua3 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public za3 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LanguageService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Button btnContinue;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String langCode = "english";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView choose_language;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView vahan_service_lable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout languageLayout;

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ RecyclerView e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView recyclerView) {
            super(1);
            this.e = recyclerView;
        }

        public final void a(LanguageModle languageModle) {
            try {
                if (ChooseLanguagScreen.this.q1().isShowing()) {
                    ChooseLanguagScreen.this.q1().dismiss();
                }
                ChooseLanguagScreen.this.p1().setVisibility(0);
                ChooseLanguagScreen.this.o1().h(ChooseLanguagScreen.this.o1().d());
                List<Language> languages = languageModle.getLanguages();
                Intrinsics.checkNotNull(languages, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Language.Modle.Language>");
                ArrayList arrayList = (ArrayList) languages;
                Collections.sort(arrayList);
                ChooseLanguagScreen chooseLanguagScreen = ChooseLanguagScreen.this;
                this.e.setAdapter(new sa3(arrayList, chooseLanguagScreen, chooseLanguagScreen));
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LanguageModle) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (ChooseLanguagScreen.this.q1().isShowing()) {
                ChooseLanguagScreen.this.q1().dismiss();
            }
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    public static final void u1(ChooseLanguagScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void v1(ChooseLanguagScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0, this$0.getString(R.string.kindly_check_your_internet_connection), 0).show();
            return;
        }
        this$0.q1().show();
        za3 za3VarT1 = this$0.t1();
        String str = this$0.langCode;
        Intrinsics.checkNotNull(str);
        za3VarT1.j(str);
    }

    public static final void w1(ChooseLanguagScreen this$0, GetLanguageStrings getLanguageStrings) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            wa3 wa3Var = new wa3(this$0);
            wa3Var.a();
            wa3Var.f(this$0.langCode);
            if (getLanguageStrings.getLangJSON().size() > 0) {
                List<LangJSON> langJSON = getLanguageStrings.getLangJSON();
                int size = langJSON.size();
                for (int i = 0; i < size; i++) {
                    gd1.a.m(langJSON.get(i).getText_value());
                    String text_code = langJSON.get(i).getText_code();
                    String string = null;
                    String string2 = text_code != null ? StringsKt__StringsKt.trim((CharSequence) text_code).toString() : null;
                    String text_value = langJSON.get(i).getText_value();
                    if (text_value != null) {
                        string = StringsKt__StringsKt.trim((CharSequence) text_value).toString();
                    }
                    wa3Var.g(string2, string);
                }
                this$0.q1().dismiss();
                this$0.startActivity(new Intent(this$0, (Class<?>) DashBoard.class));
                this$0.finishAffinity();
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                wa3 wa3Var2 = new wa3(this$0);
                JSONArray jSONArray = new JSONArray(gs0.a.a(this$0, this$0.langCode + ".json"));
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string3 = jSONObject.getString("text_code");
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string4 = StringsKt__StringsKt.trim((CharSequence) string3).toString();
                    String string5 = jSONObject.getString("text_value");
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    wa3Var2.g(string4, StringsKt__StringsKt.trim((CharSequence) string5).toString());
                }
                this$0.q1().dismiss();
                this$0.startActivity(new Intent(this$0, (Class<?>) DashBoard.class));
                this$0.finishAffinity();
            } catch (Exception unused) {
                this$0.q1().dismiss();
            }
        }
    }

    public final void A1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.languageLayout = linearLayout;
    }

    public final void B1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void C1(LanguageService languageService) {
        Intrinsics.checkNotNullParameter(languageService, "<set-?>");
        this.retrofitService = languageService;
    }

    public final void D1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vahan_service_lable = textView;
    }

    public final void E1(za3 za3Var) {
        Intrinsics.checkNotNullParameter(za3Var, "<set-?>");
        this.viewModel = za3Var;
    }

    @Override // com.zepto.ua3
    public void W(String langId, int position, String language, String choose) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(choose, "choose");
        Intrinsics.checkNotNull(langId);
        this.langCode = langId;
        l1().setText(language);
        m1().setText(choose);
    }

    public final Button l1() {
        Button button = this.btnContinue;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnContinue");
        return null;
    }

    public final TextView m1() {
        TextView textView = this.choose_language;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("choose_language");
        return null;
    }

    public final void n1() {
        try {
            if (q1().isShowing()) {
                q1().dismiss();
            }
            q1().show();
            t1().i();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final wa3 o1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_languag_screen);
        C1(LanguageService.INSTANCE.a(this));
        B1(new ProgressDialog(this));
        q1().setMessage("Please wait...");
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        z1(new wa3(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.mvvm_back);
        View viewFindViewById = findViewById(R.id.choose_language);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        y1((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.language_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        A1((LinearLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.vahan_service_lable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        D1((TextView) viewFindViewById3);
        s1().setText(o1().b("choose_language", "Choose Language"));
        View viewFindViewById4 = findViewById(R.id.btn_continue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        x1((Button) viewFindViewById4);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setHasFixedSize(true);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ck0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseLanguagScreen.u1(this.a, view);
            }
        });
        E1((za3) new z(this, new xa3(new ya3(r1()))).a(za3.class));
        n1();
        t1().h().g(this, new c(new a(recyclerView)));
        t1().g().g(this, new c(new b()));
        l1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseLanguagScreen.v1(this.a, view);
            }
        });
        t1().l().g(this, new mf4() { // from class: com.zepto.ek0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChooseLanguagScreen.w1(this.a, (GetLanguageStrings) obj);
            }
        });
    }

    public final LinearLayout p1() {
        LinearLayout linearLayout = this.languageLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageLayout");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final LanguageService r1() {
        LanguageService languageService = this.retrofitService;
        if (languageService != null) {
            return languageService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final TextView s1() {
        TextView textView = this.vahan_service_lable;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahan_service_lable");
        return null;
    }

    public final za3 t1() {
        za3 za3Var = this.viewModel;
        if (za3Var != null) {
            return za3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    @Override // com.zepto.ua3
    public void w(String langId, int position) {
        Intrinsics.checkNotNull(langId);
        this.langCode = langId;
    }

    public final void x1(Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.btnContinue = button;
    }

    public final void y1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.choose_language = textView;
    }

    public final void z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }
}
