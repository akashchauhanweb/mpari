package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Language.Modle.Language;
import com.nic.mparivahan.R;
import com.zepto.ds4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class sa3 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final ua3 f;

    public static final class a extends RecyclerView.d0 {
        public final ImageView u;
        public final LinearLayout v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.ll_select);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
        }

        public final ImageView O() {
            return this.u;
        }

        public final LinearLayout P() {
            return this.v;
        }
    }

    public static final class b implements ha0 {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Language b;
        public final /* synthetic */ sa3 c;
        public final /* synthetic */ a d;
        public final /* synthetic */ int e;

        public b(Ref.ObjectRef objectRef, Language language, sa3 sa3Var, a aVar, int i) {
            this.a = objectRef;
            this.b = language;
            this.c = sa3Var;
            this.d = aVar;
            this.e = i;
        }

        @Override // com.zepto.ha0
        public void a(Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading image: ");
            sb.append(exc != null ? exc.getMessage() : null);
            System.out.println((Object) sb.toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zepto.ha0
        public void b() {
            if (StringsKt__StringsJVMKt.equals$default(((wa3) this.a.element).c(), this.b.getLangCode(), false, 2, null)) {
                this.c.G(this.d, String.valueOf(((wa3) this.a.element).c()), this.e);
            }
        }
    }

    public sa3(ArrayList language_modle, Context context, ua3 mLanguageClickInterface) {
        Intrinsics.checkNotNullParameter(language_modle, "language_modle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mLanguageClickInterface, "mLanguageClickInterface");
        this.d = language_modle;
        this.e = context;
        this.f = mLanguageClickInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(sa3 this$0, Language ItemsViewModel, int i, Ref.ObjectRef languageKeySession, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ItemsViewModel, "$ItemsViewModel");
        Intrinsics.checkNotNullParameter(languageKeySession, "$languageKeySession");
        this$0.f.w(ItemsViewModel.getLangCode(), i);
        if (ItemsViewModel.getLangId() == 2) {
            ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
            this$0.E(i, this$0.d.size());
            this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "Continue in English", "Choose Language");
            return;
        }
        if (ItemsViewModel.getLangId() == 10) {
            ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
            this$0.E(i, this$0.d.size());
            this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "ગુજરાતીમાં ચાલુ રાખો", "ભાષા પસંદ કરો");
            return;
        }
        if (ItemsViewModel.getLangId() == 9) {
            ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
            this$0.E(i, this$0.d.size());
            this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "Continue in English", "ಭಾಷೆಯನ್ನು ಆರಿಸಿ");
            return;
        }
        if (ItemsViewModel.getLangId() == 6) {
            ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
            this$0.E(i, this$0.d.size());
            this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "ഇംഗ്ലീഷിൽ തുടരുക", "ഭാഷ തിരഞ്ഞെടുക്കുക");
            return;
        }
        if (ItemsViewModel.getLangId() == 4) {
            ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
            this$0.E(i, this$0.d.size());
            this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "मराठीत सुरू ठेवा", "भाषा निवडा");
            return;
        }
        if (ItemsViewModel.getLangId() != 11) {
            if (ItemsViewModel.getLangId() == 3) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "Continue in English", "ਭਾਸ਼ਾ ਚੁਣੋ");
                return;
            }
            if (ItemsViewModel.getLangId() == 7) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "తమిళంలో కొనసాగండి", "மொழியைத் தேர்ந்தெடுக்கவும்");
                return;
            }
            if (ItemsViewModel.getLangId() == 8) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "తెలుగులోనే కొనసాగించండి", "భాషను ఎంచుకోండి");
                return;
            }
            if (ItemsViewModel.getLangId() == 12) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "অসমীয়াত অব্যাহত ৰাখক", "ভাষা বাছক");
                return;
            }
            if (ItemsViewModel.getLangId() == 1) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "हिंदी में जारी रखें", "भाषा चुनें");
            } else if (ItemsViewModel.getLangId() == 5) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "বাংলায় চালিয়ে যান", "ভাষা নির্বাচন করুন");
            } else if (ItemsViewModel.getLangId() == 7) {
                ((wa3) languageKeySession.element).h(ItemsViewModel.getLangCode());
                this$0.E(i, this$0.d.size());
                this$0.f.W(ItemsViewModel.getLangCode().toString(), i, "இந்தியில் தொடரவும்", "மொழியைத் தேர்ந்தெடுக்கவும்");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.zepto.wa3] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new wa3(this.e);
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final Language language = (Language) obj;
        StringsKt__StringsKt.trim((CharSequence) language.getLangIcon()).toString();
        new ds4.b(this.e).a().i(F(language.getLangCode())).i(holder.O(), new b(objectRef, language, this, holder, i));
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ra3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sa3.C(this.a, language, i, objectRef, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.language_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void E(int i, int i2) {
        j();
    }

    public final int F(String lang_code) {
        Intrinsics.checkNotNullParameter(lang_code, "lang_code");
        return StringsKt__StringsJVMKt.equals(lang_code, "english", true) ? R.drawable.uenglish : StringsKt__StringsJVMKt.equals(lang_code, "gujarati", true) ? R.drawable.ugujarati : (StringsKt__StringsJVMKt.equals(lang_code, "asamiya", true) || StringsKt__StringsJVMKt.equals(lang_code, "bengali", true)) ? R.drawable.ubengali : StringsKt__StringsJVMKt.equals(lang_code, "hindi", true) ? R.drawable.uhindi : StringsKt__StringsJVMKt.equals(lang_code, "tamil", true) ? R.drawable.utamil : StringsKt__StringsJVMKt.equals(lang_code, "malayalam", true) ? R.drawable.umalayalam : StringsKt__StringsJVMKt.equals(lang_code, "marathi", true) ? R.drawable.umarathi : StringsKt__StringsJVMKt.equals(lang_code, "telugu", true) ? R.drawable.utelugu : R.drawable.telugu;
    }

    public final void G(a holder, String lang_code, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(lang_code, "lang_code");
        if (StringsKt__StringsJVMKt.equals(lang_code, "english", true)) {
            new ds4.b(this.e).a().i(R.drawable.english).h(holder.O());
            this.f.W(lang_code, i, "Continue in English", "Choose Language");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "gujarati", true)) {
            new ds4.b(this.e).a().i(R.drawable.gujarati).h(holder.O());
            this.f.W(lang_code, i, "ગુજરાતીમાં ચાલુ રાખો", "ભાષા પસંદ કરો");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "asamiya", true)) {
            new ds4.b(this.e).a().i(R.drawable.asmiya).h(holder.O());
            this.f.W(lang_code, i, "অসমীয়াত অব্যাহত ৰাখক", "Choose Language");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "bengali", true)) {
            new ds4.b(this.e).a().i(R.drawable.bangla).h(holder.O());
            this.f.W(lang_code, i, "বাংলায় চালিয়ে যান", "ভাষা নির্বাচন করুন");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "hindi", true)) {
            new ds4.b(this.e).a().i(R.drawable.hindi).h(holder.O());
            this.f.W(lang_code, i, "हिंदी में जारी रखें", "भाषा चुनें");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "tamil", true)) {
            new ds4.b(this.e).a().i(R.drawable.tamil).h(holder.O());
            this.f.W(lang_code, i, "తమిళంలో కొనసాగండి", "மொழியைத் தேர்ந்தெடுக்கவும்");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "malayalam", true)) {
            new ds4.b(this.e).a().i(R.drawable.malayalam).h(holder.O());
            this.f.W(lang_code, i, "ഇംഗ്ലീഷിൽ തുടരുക", "ഭാഷ തിരഞ്ഞെടുക്കുക");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "marathi", true)) {
            new ds4.b(this.e).a().i(R.drawable.marathi).h(holder.O());
            this.f.W(lang_code, i, "मराठी में जारी रखें", "भाषा चुनें");
        }
        if (StringsKt__StringsJVMKt.equals(lang_code, "telugu", true)) {
            new ds4.b(this.e).a().i(R.drawable.telugu).h(holder.O());
            this.f.W(lang_code, i, "తెలుగులోనే కొనసాగించండి", "భాషను ఎంచుకోండి");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
