package ai.protectt.app.security.recyclerviewhelper;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanAlerts;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.ai;
import com.zepto.e41;
import com.zepto.f80;
import com.zepto.if5;
import com.zepto.j70;
import com.zepto.jt;
import com.zepto.l06;
import com.zepto.md5;
import com.zepto.mo5;
import com.zepto.ni0;
import com.zepto.nn3;
import com.zepto.nq;
import com.zepto.or2;
import com.zepto.pp5;
import com.zepto.qj2;
import com.zepto.qq0;
import com.zepto.s06;
import com.zepto.tm5;
import com.zepto.y60;
import com.zepto.yz0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class RecyclerViewInteractor implements j70 {
    public static RadioButton A;
    public static CheckBox B;
    public static RecyclerView C;
    public static TextView D;
    public static CardView E;
    public static CardView F;
    public static CardView G;
    public static TextView H;
    public static TextView I;
    public static TextView J;
    public static TextView K;
    public static TextView L;
    public static CheckBox M;
    public static Button N;
    public static Button O;
    public static ConstraintLayout P;
    public static ConstraintLayout Q;
    public static ConstraintLayout R;
    public static Button S;
    public static TextView T;
    public static TextView U;
    public static TextView V;
    public static Button W;
    public static TextView X;
    public static RecyclerView Y;
    public static RecyclerView Z;
    public static CardView a0;
    public static CardView b0;
    public static nq c0;
    public static nq d0;
    public static RecyclerView e;
    public static nq e0;
    public static com.google.android.material.bottomsheet.a f;
    public static nq f0;
    public static com.google.android.material.bottomsheet.a g;
    public static nq g0;
    public static com.google.android.material.bottomsheet.a h;
    public static nq h0;
    public static j70 j;
    public static md5 k0;
    public static e41 m;
    public static CardView n;
    public static ConstraintLayout o;
    public static CardView p;
    public static CheckBox q;
    public static Button r;
    public static TextView s;
    public static ImageView t;
    public static CheckBox u;
    public static Button v;
    public static Button w;
    public static Button x;
    public static RadioGroup y;
    public static RadioButton z;
    public final String a = "RecyclerViewInteractor";
    public View b;
    public static final a c = new a(null);
    public static List d = new ArrayList();
    public static HashMap i = new HashMap();
    public static List k = new ArrayList();
    public static List l = new ArrayList();
    public static final List i0 = new ArrayList();
    public static List j0 = new ArrayList();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void A(CardView cardView) {
            Intrinsics.checkNotNullParameter(cardView, "<set-?>");
            RecyclerViewInteractor.n = cardView;
        }

        public final void b(String blockListApp) {
            String appHashOne;
            String appHashTwo;
            String appHashThree;
            Intrinsics.checkNotNullParameter(blockListApp, "blockListApp");
            try {
                tm5.a aVar = tm5.f;
                if (aVar.b().contains(blockListApp)) {
                    nq nqVarI = i();
                    Intrinsics.checkNotNull(nqVarI);
                    if (!nqVarI.C().contains(blockListApp)) {
                        nq nqVarI2 = i();
                        Intrinsics.checkNotNull(nqVarI2);
                        nqVarI2.C().add(blockListApp);
                    }
                } else {
                    y60 y60VarH = l06.e.a().h(blockListApp);
                    if (y60VarH != null && (appHashOne = y60VarH.getAppHashOne()) != null && appHashOne.length() != 0 && (appHashTwo = y60VarH.getAppHashTwo()) != null && appHashTwo.length() != 0 && (appHashThree = y60VarH.getAppHashThree()) != null && appHashThree.length() != 0 && (CollectionsKt___CollectionsKt.contains(aVar.a(), y60VarH.getAppHashOne()) || CollectionsKt___CollectionsKt.contains(aVar.a(), y60VarH.getAppHashTwo()) || CollectionsKt___CollectionsKt.contains(aVar.a(), y60VarH.getAppHashThree()))) {
                        nq nqVarI3 = i();
                        Intrinsics.checkNotNull(nqVarI3);
                        if (!nqVarI3.C().contains(blockListApp)) {
                            nq nqVarI4 = i();
                            Intrinsics.checkNotNull(nqVarI4);
                            nqVarI4.C().add(blockListApp);
                        }
                    }
                }
            } catch (Exception e) {
                nn3.a.f("RecyclerView", e.toString());
            }
        }

        public final void c(int i) {
            if (h().contains(Integer.valueOf(i))) {
                return;
            }
            h().add(Integer.valueOf(i));
        }

        public final void d() {
            try {
                ConstraintLayout constraintLayoutM = m();
                if (constraintLayoutM != null) {
                    constraintLayoutM.setVisibility(0);
                }
                o().setVisibility(8);
            } catch (Exception e) {
                nn3.c(nn3.a, "TAG", e.toString(), null, 4, null);
            }
        }

        public final nq e() {
            return RecyclerViewInteractor.e0;
        }

        public final List f() {
            return RecyclerViewInteractor.l;
        }

        public final nq g() {
            return RecyclerViewInteractor.f0;
        }

        public final List h() {
            return RecyclerViewInteractor.d;
        }

        public final nq i() {
            return RecyclerViewInteractor.c0;
        }

        public final com.google.android.material.bottomsheet.a j() {
            return RecyclerViewInteractor.g;
        }

        public final j70 k() {
            return RecyclerViewInteractor.j;
        }

        public final com.google.android.material.bottomsheet.a l() {
            return RecyclerViewInteractor.f;
        }

        public final ConstraintLayout m() {
            return RecyclerViewInteractor.o;
        }

        public final com.google.android.material.bottomsheet.a n() {
            return RecyclerViewInteractor.h;
        }

        public final CardView o() {
            CardView cardView = RecyclerViewInteractor.n;
            if (cardView != null) {
                return cardView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("cvLayoutFixIssue");
            return null;
        }

        public final List p() {
            return RecyclerViewInteractor.k;
        }

        public final HashMap q() {
            return RecyclerViewInteractor.i;
        }

        public final nq r() {
            return RecyclerViewInteractor.g0;
        }

        public final List s() {
            return RecyclerViewInteractor.i0;
        }

        public final RecyclerView t() {
            return RecyclerViewInteractor.e;
        }

        public final List u() {
            return RecyclerViewInteractor.j0;
        }

        public final e41 v() {
            return RecyclerViewInteractor.m;
        }

        public final nq w() {
            return RecyclerViewInteractor.h0;
        }

        public final int x() {
            try {
                TextView textView = RecyclerViewInteractor.s;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tv_issuesCount");
                    textView = null;
                }
                textView.setText(p().size() + " Issues Found!");
                nn3.a.f("isVulnerabilityPresent", p().size() + " Issues Found!Other alerts" + h().size());
                return p().size() + h().size();
            } catch (Exception e) {
                nn3.c(nn3.a, "TAG", e.toString(), null, 4, null);
                return 0;
            }
        }

        public final void y(int i) {
            if (h().contains(Integer.valueOf(i))) {
                h().remove(Integer.valueOf(i));
            }
        }

        public final void z(md5 md5Var) {
            RecyclerViewInteractor.k0 = md5Var;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ RecyclerViewInteractor c;
        public final /* synthetic */ float d;
        public final /* synthetic */ View e;

        public b(TextView textView, TextView textView2, RecyclerViewInteractor recyclerViewInteractor, float f, View view) {
            this.a = textView;
            this.b = textView2;
            this.c = recyclerViewInteractor;
            this.d = f;
            this.e = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                float lineRight = this.a.getLayout().getLineRight(this.a.getLineCount() - 1);
                int lineTop = this.a.getLayout().getLineTop(this.a.getLineCount() - 1);
                ViewParent parent = this.a.getParent();
                if (parent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                int width = ((ViewGroup) parent).getWidth();
                int width2 = (width - this.a.getWidth()) / 2;
                float f = width - lineRight;
                this.b.setText(or2.a("<u>Click     here</u>", 0));
                nn3.a.f(this.c.j0(), "onGlobalLayout:  " + f + "  " + this.b.getWidth() + "  " + width + ' ' + lineRight + "  " + width2 + ' ');
                float width3 = (float) this.b.getWidth();
                float f2 = this.d;
                if (f >= width3 + f2) {
                    this.b.setX(lineRight + f2);
                    this.b.setY(this.a.getY() + lineTop + 5.0f);
                } else {
                    this.b.setX(this.a.getX());
                    this.b.setY(this.a.getY() + this.a.getHeight());
                }
                jt.c.X();
            } catch (Exception e) {
                nn3.c(nn3.a, this.c.j0(), e.toString(), null, 4, null);
            }
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt__ComparisonsKt.compareValues(((md5) obj2).getVulnerabilityActionRequired(), ((md5) obj).getVulnerabilityActionRequired());
        }
    }

    public static final class d extends CountDownTimer {
        public final /* synthetic */ CharSequence a;
        public final /* synthetic */ md5 b;
        public final /* synthetic */ RecyclerViewInteractor c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CharSequence charSequence, md5 md5Var, RecyclerViewInteractor recyclerViewInteractor, long j) {
            super(j, 100L);
            this.a = charSequence;
            this.b = md5Var;
            this.c = recyclerViewInteractor;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (!this.b.getClearDataFlag()) {
                this.c.e0();
                return;
            }
            ScanAlerts scanAlertsL = jt.c.L();
            Intrinsics.checkNotNull(scanAlertsL);
            scanAlertsL.p(this.b, 2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Button button = RecyclerViewInteractor.W;
            Button button2 = null;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("c_blk_btn");
                button = null;
            }
            button.setEnabled(false);
            Button button3 = RecyclerViewInteractor.W;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("c_blk_btn");
            } else {
                button2 = button3;
            }
            button2.setText(String.format(Locale.getDefault(), "%s (%d)", this.a, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) + 1)));
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ int e;
        public final /* synthetic */ RecyclerViewInteractor f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, RecyclerViewInteractor recyclerViewInteractor, Continuation continuation) {
            super(2, continuation);
            this.e = i;
            this.f = recyclerViewInteractor;
        }

        public static final void d(RecyclerViewInteractor recyclerViewInteractor, md5 md5Var) {
            recyclerViewInteractor.j(md5Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((e) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                jt.a aVar = jt.c;
                ScanAlerts scanAlertsL = aVar.L();
                Intrinsics.checkNotNull(scanAlertsL);
                final md5 md5VarA = scanAlertsL.A(this.e);
                Activity activityR = aVar.r();
                Intrinsics.checkNotNull(activityR);
                final RecyclerViewInteractor recyclerViewInteractor = this.f;
                activityR.runOnUiThread(new Runnable() { // from class: com.zepto.e75
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerViewInteractor.e.d(recyclerViewInteractor, md5VarA);
                    }
                });
            } catch (Exception e) {
                nn3.c(nn3.a, this.f.j0(), e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public RecyclerViewInteractor() {
        j = this;
    }

    public static final void B0(RecyclerViewInteractor this$0, md5 response, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.a(response);
    }

    public static final void D0(RecyclerViewInteractor this$0, CompoundButton compoundButton, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Button button = null;
        if (!z2) {
            Button button2 = N;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                button2 = null;
            }
            button2.setVisibility(8);
            if (this$0.u0()) {
                jt.a aVar = jt.c;
                int identifier = aVar.C().getResources().getIdentifier("ap_darkred", "color", aVar.C().getPackageName());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(12.0f);
                gradientDrawable.setColor(aVar.C().getResources().getColorStateList(identifier));
                Button button3 = N;
                if (button3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                    button3 = null;
                }
                button3.setBackground(gradientDrawable);
                Button button4 = N;
                if (button4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                    button4 = null;
                }
                button4.setTextColor(Color.parseColor("#FFFFFF"));
                Button button5 = N;
                if (button5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                } else {
                    button = button5;
                }
                button.setTextSize(15.0f);
                return;
            }
            return;
        }
        Button button6 = N;
        if (button6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
            button6 = null;
        }
        button6.setVisibility(0);
        if (!this$0.u0()) {
            Button button7 = S;
            if (button7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_go_set_btn");
            } else {
                button = button7;
            }
            button.setTextSize(12.0f);
            return;
        }
        Button button8 = S;
        if (button8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_go_set_btn");
            button8 = null;
        }
        button8.setTextSize(15.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(12.0f);
        gradientDrawable2.setStroke(2, Color.parseColor("#004880"));
        Button button9 = N;
        if (button9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
            button9 = null;
        }
        button9.setBackground(gradientDrawable2);
        Button button10 = N;
        if (button10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
            button10 = null;
        }
        button10.setTextColor(Color.parseColor("#004880"));
        Button button11 = N;
        if (button11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
            button11 = null;
        }
        button11.setTextSize(15.0f);
        Button button12 = v;
        if (button12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
        } else {
            button = button12;
        }
        button.setTextSize(15.0f);
    }

    public static final void E0(RecyclerViewInteractor this$0, md5 response, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.a(response);
    }

    public static final void F0(CompoundButton compoundButton, boolean z2) {
        Button button = null;
        if (!z2) {
            jt.a aVar = jt.c;
            int identifier = aVar.C().getResources().getIdentifier("ap_darkred", "color", aVar.C().getPackageName());
            Button button2 = w;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
                button2 = null;
            }
            button2.setVisibility(8);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(12.0f);
            gradientDrawable.setColor(aVar.C().getResources().getColorStateList(identifier));
            Button button3 = w;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
                button3 = null;
            }
            button3.setBackground(gradientDrawable);
            Button button4 = w;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
                button4 = null;
            }
            button4.setTextColor(Color.parseColor("#FFFFFF"));
            Button button5 = v;
            if (button5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
            } else {
                button = button5;
            }
            button.setTextSize(15.0f);
            return;
        }
        Button button6 = w;
        if (button6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
            button6 = null;
        }
        button6.setVisibility(0);
        Button button7 = v;
        if (button7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
            button7 = null;
        }
        button7.setTextSize(12.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(12.0f);
        gradientDrawable2.setStroke(2, Color.parseColor("#004880"));
        Button button8 = w;
        if (button8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
            button8 = null;
        }
        button8.setBackground(gradientDrawable2);
        Button button9 = w;
        if (button9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
            button9 = null;
        }
        button9.setTextColor(Color.parseColor("#004880"));
        Button button10 = v;
        if (button10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
        } else {
            button = button10;
        }
        button.setTextSize(15.0f);
    }

    public static final void G0(CompoundButton compoundButton, boolean z2) {
        Button button = null;
        if (!z2) {
            Button button2 = w;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
            } else {
                button = button2;
            }
            button.setVisibility(8);
            return;
        }
        Button button3 = w;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
            button3 = null;
        }
        button3.setVisibility(0);
        Button button4 = v;
        if (button4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
        } else {
            button = button4;
        }
        button.setTextSize(12.0f);
    }

    public static final void H0(RecyclerViewInteractor this$0, md5 response, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.a(response);
    }

    public static final void J0(RecyclerViewInteractor this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadioButton radioButton = z;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButtonYes");
            radioButton = null;
        }
        if (i2 == radioButton.getId()) {
            this$0.W0();
            return;
        }
        RadioButton radioButton3 = A;
        if (radioButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("radioButtonNo");
        } else {
            radioButton2 = radioButton3;
        }
        if (i2 == radioButton2.getId()) {
            this$0.V0();
        }
    }

    public static final void K0(RecyclerViewInteractor this$0, md5 response, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.T0(response);
    }

    public static final void L0(md5 response, RecyclerViewInteractor this$0, View view) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.google.android.material.bottomsheet.a aVar = g;
        Intrinsics.checkNotNull(aVar);
        aVar.dismiss();
        a aVar2 = c;
        Integer vulnerabilityCode = response.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        aVar2.y(vulnerabilityCode.intValue());
        this$0.e0();
        Integer vulnerabilityCode2 = response.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode2);
        this$0.z0(vulnerabilityCode2.intValue());
    }

    public static final void M0(View view) {
        TextView textView = K;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_msg");
            textView = null;
        }
        if (textView.getMaxLines() == 4) {
            TextView textView3 = K;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_msg");
                textView3 = null;
            }
            textView3.setMaxLines(IntCompanionObject.MAX_VALUE);
            TextView textView4 = K;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_msg");
                textView4 = null;
            }
            textView4.setEllipsize(null);
            return;
        }
        TextView textView5 = K;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_msg");
            textView5 = null;
        }
        textView5.setMaxLines(4);
        TextView textView6 = K;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("b_msg");
        } else {
            textView2 = textView6;
        }
        textView2.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final void P0(RecyclerViewInteractor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c.o().setVisibility(8);
        ConstraintLayout constraintLayout = o;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        Button button = x;
        Button button2 = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btn_Close");
            button = null;
        }
        button.setVisibility(8);
        if (this$0.u0()) {
            jt.a aVar = jt.c;
            int identifier = aVar.C().getResources().getIdentifier("ap_darkred", "color", aVar.C().getPackageName());
            Button button3 = w;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
                button3 = null;
            }
            button3.setVisibility(8);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(12.0f);
            gradientDrawable.setColor(aVar.C().getResources().getColorStateList(identifier));
            Button button4 = w;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
                button4 = null;
            }
            button4.setBackground(gradientDrawable);
            Button button5 = w;
            if (button5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipIssue");
                button5 = null;
            }
            button5.setTextColor(Color.parseColor("#FFFFFF"));
            Button button6 = v;
            if (button6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
            } else {
                button2 = button6;
            }
            button2.setTextSize(15.0f);
        }
    }

    public static final void Q0(md5 response, RecyclerViewInteractor this$0, View view) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jt.a aVar = jt.c;
        Integer vulnerabilityCode = response.getVulnerabilityCode();
        Intrinsics.checkNotNull(vulnerabilityCode);
        aVar.V0(vulnerabilityCode.intValue());
        e41 e41VarA = e41.m.a();
        Intrinsics.checkNotNull(e41VarA);
        e41VarA.J(response);
        CheckBox checkBox = u;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cb_ignoreIssueView");
            checkBox = null;
        }
        checkBox.setChecked(false);
        if (k.size() != 0) {
            a aVar2 = c;
            aVar2.d();
            if (aVar2.x() != 1 || k.size() == 0) {
                return;
            }
            this$0.f((md5) CollectionsKt___CollectionsKt.first(k));
            return;
        }
        ScanAlerts scanAlertsL = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL);
        scanAlertsL.u();
        com.google.android.material.bottomsheet.a aVar3 = f;
        Intrinsics.checkNotNull(aVar3);
        aVar3.dismiss();
    }

    public static final void f0(CompoundButton compoundButton, boolean z2) {
        Button button = null;
        if (z2) {
            Button button2 = r;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipAll");
            } else {
                button = button2;
            }
            button.setVisibility(0);
            return;
        }
        Button button3 = r;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSkipAll");
        } else {
            button = button3;
        }
        button.setVisibility(8);
    }

    public static final void g0(RecyclerViewInteractor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.u0()) {
            CheckBox checkBox = q;
            if (checkBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cbSkipAll");
                checkBox = null;
            }
            checkBox.setChecked(false);
        }
        this$0.S0();
    }

    public static final void h0(RecyclerViewInteractor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jt.a aVar = jt.c;
        ScanAlerts scanAlertsL = aVar.L();
        Intrinsics.checkNotNull(scanAlertsL);
        this$0.k(scanAlertsL.A(((Number) CollectionsKt___CollectionsKt.first(aVar.A())).intValue()));
    }

    public static final void o0(md5 response, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        e0 = new nq(response);
        ScanCore scanCore = ScanCore.a;
        if (!scanCore.G0().isEmpty()) {
            for (String str : scanCore.G0()) {
                if (response.getBlockListApp() == null) {
                    response.setBlockListApp(str);
                }
                for (String str2 : ((HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor$handleAccessibilityPermissionAppListUiView$1$type$1
                }.getType())).keySet()) {
                    nq nqVar = e0;
                    Intrinsics.checkNotNull(nqVar);
                    if (!nqVar.C().contains(str2)) {
                        nq nqVar2 = e0;
                        Intrinsics.checkNotNull(nqVar2);
                        nqVar2.C().add(str2);
                    }
                }
            }
        }
        Type type = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor$handleAccessibilityPermissionAppListUiView$1$type$2
        }.getType();
        Gson gson = new Gson();
        String blockListApp = response.getBlockListApp();
        Intrinsics.checkNotNull(blockListApp);
        for (String str3 : ((HashMap) gson.fromJson(blockListApp, type)).keySet()) {
            nq nqVar3 = e0;
            Intrinsics.checkNotNull(nqVar3);
            if (!nqVar3.C().contains(str3)) {
                nq nqVar4 = e0;
                Intrinsics.checkNotNull(nqVar4);
                nqVar4.C().add(str3);
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
        recyclerView.setAdapter(e0);
    }

    public static final void q0(md5 response, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        f0 = new nq(response);
        ScanCore scanCore = ScanCore.a;
        if (!scanCore.H0().isEmpty()) {
            for (String str : scanCore.H0()) {
                if (response.getBlockListApp() == null) {
                    response.setBlockListApp(str);
                }
                for (String str2 : ((HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor$handleAdminPermissionAppListUiView$1$type$1
                }.getType())).keySet()) {
                    nq nqVar = f0;
                    Intrinsics.checkNotNull(nqVar);
                    if (!nqVar.C().contains(str2)) {
                        nq nqVar2 = f0;
                        Intrinsics.checkNotNull(nqVar2);
                        nqVar2.C().add(str2);
                    }
                }
            }
        }
        Type type = new TypeToken<HashMap<String, String>>() { // from class: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor$handleAdminPermissionAppListUiView$1$type$2
        }.getType();
        Gson gson = new Gson();
        String blockListApp = response.getBlockListApp();
        Intrinsics.checkNotNull(blockListApp);
        for (String str3 : ((HashMap) gson.fromJson(blockListApp, type)).keySet()) {
            nq nqVar3 = f0;
            Intrinsics.checkNotNull(nqVar3);
            if (!nqVar3.C().contains(str3)) {
                nq nqVar4 = f0;
                Intrinsics.checkNotNull(nqVar4);
                nqVar4.C().add(str3);
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
        recyclerView.setAdapter(f0);
    }

    public static final void s0(md5 response, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        c0 = new nq(response);
        a aVar = c;
        String blockListApp = response.getBlockListApp();
        Intrinsics.checkNotNull(blockListApp);
        aVar.b(blockListApp);
        List<String> list = i0;
        if (!list.isEmpty()) {
            for (String str : list) {
                if (ScanCore.a.s0().contains(str)) {
                    nq nqVar = c0;
                    Intrinsics.checkNotNull(nqVar);
                    if (!nqVar.C().contains(str)) {
                        c.b(str);
                    }
                }
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
        recyclerView.setAdapter(c0);
    }

    public static final void w0(md5 response, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        g0 = new nq(response);
        ScanCore scanCore = ScanCore.a;
        if (!scanCore.I0().isEmpty()) {
            for (String str : scanCore.I0()) {
                nq nqVar = g0;
                Intrinsics.checkNotNull(nqVar);
                if (!nqVar.C().contains(str)) {
                    nq nqVar2 = g0;
                    Intrinsics.checkNotNull(nqVar2);
                    nqVar2.C().add(str);
                }
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
        recyclerView.setAdapter(g0);
        nq nqVar3 = g0;
        Intrinsics.checkNotNull(nqVar3);
        nqVar3.j();
    }

    public static final void y0(md5 response, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        h0 = new nq(response);
        ScanCore scanCore = ScanCore.a;
        if (!scanCore.J0().isEmpty()) {
            for (String str : scanCore.J0()) {
                nq nqVar = h0;
                Intrinsics.checkNotNull(nqVar);
                if (!nqVar.C().contains(str)) {
                    nq nqVar2 = h0;
                    Intrinsics.checkNotNull(nqVar2);
                    nqVar2.C().add(str);
                }
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
        recyclerView.setAdapter(h0);
        nq nqVar3 = g0;
        Intrinsics.checkNotNull(nqVar3);
        nqVar3.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:3:0x0002, B:5:0x006c, B:8:0x0073, B:11:0x007b, B:16:0x008b, B:21:0x0098, B:27:0x00a6, B:29:0x00aa, B:30:0x00ae, B:35:0x00dd, B:37:0x00e1, B:39:0x00e6, B:24:0x009f, B:31:0x00c2, B:33:0x00c6, B:34:0x00ca, B:19:0x0092, B:14:0x0085), top: B:43:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:3:0x0002, B:5:0x006c, B:8:0x0073, B:11:0x007b, B:16:0x008b, B:21:0x0098, B:27:0x00a6, B:29:0x00aa, B:30:0x00ae, B:35:0x00dd, B:37:0x00e1, B:39:0x00e6, B:24:0x009f, B:31:0x00c2, B:33:0x00c6, B:34:0x00ca, B:19:0x0092, B:14:0x0085), top: B:43:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0(final com.zepto.md5 r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor.A0(com.zepto.md5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0008, B:6:0x007d, B:9:0x008b, B:14:0x0098, B:19:0x00a5, B:25:0x00b3, B:27:0x00b7, B:30:0x00bf, B:35:0x00ea, B:37:0x00ee, B:38:0x00f2, B:40:0x00f9, B:41:0x00ff, B:43:0x010b, B:44:0x010f, B:46:0x0116, B:48:0x011b, B:22:0x00ac, B:31:0x00d1, B:33:0x00d5, B:34:0x00d9, B:17:0x009f, B:12:0x0092, B:49:0x0125, B:51:0x0129, B:52:0x012d, B:54:0x0134, B:56:0x0139, B:57:0x013e, B:60:0x014e, B:65:0x015b, B:70:0x0168, B:76:0x0176, B:78:0x017a, B:79:0x017e, B:84:0x01a9, B:86:0x01ad, B:87:0x01b1, B:90:0x01bc, B:92:0x01c0, B:93:0x01c4, B:95:0x01cb, B:96:0x01cf, B:98:0x01d6, B:99:0x01da, B:101:0x01e1, B:102:0x01e5, B:104:0x01ec, B:105:0x01f0, B:107:0x01f6, B:109:0x01fa, B:110:0x01fe, B:112:0x0205, B:113:0x0209, B:115:0x0224, B:116:0x0228, B:118:0x022f, B:119:0x0233, B:121:0x023e, B:122:0x0242, B:123:0x0247, B:125:0x024b, B:126:0x024f, B:143:0x0294, B:145:0x0298, B:147:0x029d, B:127:0x0258, B:129:0x025c, B:130:0x0260, B:132:0x0267, B:133:0x026b, B:135:0x0272, B:136:0x0276, B:138:0x027d, B:139:0x0281, B:141:0x0288, B:142:0x028c, B:73:0x016f, B:80:0x0190, B:82:0x0194, B:83:0x0198, B:68:0x0162, B:63:0x0155, B:148:0x02a6, B:150:0x02aa, B:151:0x02ae, B:153:0x02b5, B:154:0x02b9, B:156:0x02c0, B:158:0x02c5), top: B:162:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0008, B:6:0x007d, B:9:0x008b, B:14:0x0098, B:19:0x00a5, B:25:0x00b3, B:27:0x00b7, B:30:0x00bf, B:35:0x00ea, B:37:0x00ee, B:38:0x00f2, B:40:0x00f9, B:41:0x00ff, B:43:0x010b, B:44:0x010f, B:46:0x0116, B:48:0x011b, B:22:0x00ac, B:31:0x00d1, B:33:0x00d5, B:34:0x00d9, B:17:0x009f, B:12:0x0092, B:49:0x0125, B:51:0x0129, B:52:0x012d, B:54:0x0134, B:56:0x0139, B:57:0x013e, B:60:0x014e, B:65:0x015b, B:70:0x0168, B:76:0x0176, B:78:0x017a, B:79:0x017e, B:84:0x01a9, B:86:0x01ad, B:87:0x01b1, B:90:0x01bc, B:92:0x01c0, B:93:0x01c4, B:95:0x01cb, B:96:0x01cf, B:98:0x01d6, B:99:0x01da, B:101:0x01e1, B:102:0x01e5, B:104:0x01ec, B:105:0x01f0, B:107:0x01f6, B:109:0x01fa, B:110:0x01fe, B:112:0x0205, B:113:0x0209, B:115:0x0224, B:116:0x0228, B:118:0x022f, B:119:0x0233, B:121:0x023e, B:122:0x0242, B:123:0x0247, B:125:0x024b, B:126:0x024f, B:143:0x0294, B:145:0x0298, B:147:0x029d, B:127:0x0258, B:129:0x025c, B:130:0x0260, B:132:0x0267, B:133:0x026b, B:135:0x0272, B:136:0x0276, B:138:0x027d, B:139:0x0281, B:141:0x0288, B:142:0x028c, B:73:0x016f, B:80:0x0190, B:82:0x0194, B:83:0x0198, B:68:0x0162, B:63:0x0155, B:148:0x02a6, B:150:0x02aa, B:151:0x02ae, B:153:0x02b5, B:154:0x02b9, B:156:0x02c0, B:158:0x02c5), top: B:162:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0008, B:6:0x007d, B:9:0x008b, B:14:0x0098, B:19:0x00a5, B:25:0x00b3, B:27:0x00b7, B:30:0x00bf, B:35:0x00ea, B:37:0x00ee, B:38:0x00f2, B:40:0x00f9, B:41:0x00ff, B:43:0x010b, B:44:0x010f, B:46:0x0116, B:48:0x011b, B:22:0x00ac, B:31:0x00d1, B:33:0x00d5, B:34:0x00d9, B:17:0x009f, B:12:0x0092, B:49:0x0125, B:51:0x0129, B:52:0x012d, B:54:0x0134, B:56:0x0139, B:57:0x013e, B:60:0x014e, B:65:0x015b, B:70:0x0168, B:76:0x0176, B:78:0x017a, B:79:0x017e, B:84:0x01a9, B:86:0x01ad, B:87:0x01b1, B:90:0x01bc, B:92:0x01c0, B:93:0x01c4, B:95:0x01cb, B:96:0x01cf, B:98:0x01d6, B:99:0x01da, B:101:0x01e1, B:102:0x01e5, B:104:0x01ec, B:105:0x01f0, B:107:0x01f6, B:109:0x01fa, B:110:0x01fe, B:112:0x0205, B:113:0x0209, B:115:0x0224, B:116:0x0228, B:118:0x022f, B:119:0x0233, B:121:0x023e, B:122:0x0242, B:123:0x0247, B:125:0x024b, B:126:0x024f, B:143:0x0294, B:145:0x0298, B:147:0x029d, B:127:0x0258, B:129:0x025c, B:130:0x0260, B:132:0x0267, B:133:0x026b, B:135:0x0272, B:136:0x0276, B:138:0x027d, B:139:0x0281, B:141:0x0288, B:142:0x028c, B:73:0x016f, B:80:0x0190, B:82:0x0194, B:83:0x0198, B:68:0x0162, B:63:0x0155, B:148:0x02a6, B:150:0x02aa, B:151:0x02ae, B:153:0x02b5, B:154:0x02b9, B:156:0x02c0, B:158:0x02c5), top: B:162:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:3:0x0008, B:6:0x007d, B:9:0x008b, B:14:0x0098, B:19:0x00a5, B:25:0x00b3, B:27:0x00b7, B:30:0x00bf, B:35:0x00ea, B:37:0x00ee, B:38:0x00f2, B:40:0x00f9, B:41:0x00ff, B:43:0x010b, B:44:0x010f, B:46:0x0116, B:48:0x011b, B:22:0x00ac, B:31:0x00d1, B:33:0x00d5, B:34:0x00d9, B:17:0x009f, B:12:0x0092, B:49:0x0125, B:51:0x0129, B:52:0x012d, B:54:0x0134, B:56:0x0139, B:57:0x013e, B:60:0x014e, B:65:0x015b, B:70:0x0168, B:76:0x0176, B:78:0x017a, B:79:0x017e, B:84:0x01a9, B:86:0x01ad, B:87:0x01b1, B:90:0x01bc, B:92:0x01c0, B:93:0x01c4, B:95:0x01cb, B:96:0x01cf, B:98:0x01d6, B:99:0x01da, B:101:0x01e1, B:102:0x01e5, B:104:0x01ec, B:105:0x01f0, B:107:0x01f6, B:109:0x01fa, B:110:0x01fe, B:112:0x0205, B:113:0x0209, B:115:0x0224, B:116:0x0228, B:118:0x022f, B:119:0x0233, B:121:0x023e, B:122:0x0242, B:123:0x0247, B:125:0x024b, B:126:0x024f, B:143:0x0294, B:145:0x0298, B:147:0x029d, B:127:0x0258, B:129:0x025c, B:130:0x0260, B:132:0x0267, B:133:0x026b, B:135:0x0272, B:136:0x0276, B:138:0x027d, B:139:0x0281, B:141:0x0288, B:142:0x028c, B:73:0x016f, B:80:0x0190, B:82:0x0194, B:83:0x0198, B:68:0x0162, B:63:0x0155, B:148:0x02a6, B:150:0x02aa, B:151:0x02ae, B:153:0x02b5, B:154:0x02b9, B:156:0x02c0, B:158:0x02c5), top: B:162:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C0(final com.zepto.md5 r18) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor.C0(com.zepto.md5):void");
    }

    public final void I0(final md5 md5Var) {
        Button button;
        try {
            com.google.android.material.bottomsheet.a aVar = f;
            if (aVar != null) {
                Intrinsics.checkNotNull(aVar);
                if (aVar.isShowing()) {
                    com.google.android.material.bottomsheet.a aVar2 = f;
                    Intrinsics.checkNotNull(aVar2);
                    aVar2.dismiss();
                }
            }
            jt.a aVar3 = jt.c;
            View view = LayoutInflater.from(aVar3.r()).inflate(aVar3.C().getResources().getIdentifier("ap_layout_b_ui", "layout", aVar3.C().getPackageName()), (ViewGroup) null);
            View viewFindViewById = view.findViewById(l0("ap_tv_threat_title_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(getVie…(\"ap_tv_threat_title_b\"))");
            J = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(l0("ap_tv_description_navigation_title_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(getVie…ion_navigation_title_b\"))");
            K = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(l0("ap_tv_recommendation_text_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(getVie…_recommendation_text_b\"))");
            L = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(l0("ap_cb_accept_risk_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(getVie…D(\"ap_cb_accept_risk_b\"))");
            M = (CheckBox) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(l0("ap_btn_fix_issue_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(getViewID(\"ap_btn_fix_issue_b\"))");
            S = (Button) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(l0("ap_close_app_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(getViewID(\"ap_close_app_b\"))");
            N = (Button) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(l0("ap_skip_btn_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(getViewID(\"ap_skip_btn_b\"))");
            O = (Button) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(l0("ap_cl_card_view"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(getViewID(\"ap_cl_card_view\"))");
            P = (ConstraintLayout) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(l0("ap_cl_btns"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(getViewID(\"ap_cl_btns\"))");
            R = (ConstraintLayout) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(l0("ap_cl_back_button"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(getViewID(\"ap_cl_back_button\"))");
            Q = (ConstraintLayout) viewFindViewById10;
            Y = (RecyclerView) view.findViewById(l0("ap_rv_black_listed_apps_b"));
            View viewFindViewById11 = view.findViewById(l0("ap_cv_black_listed_apps_b"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(getVie…cv_black_listed_apps_b\"))");
            a0 = (CardView) viewFindViewById11;
            Activity activityR = aVar3.r();
            Intrinsics.checkNotNull(activityR);
            g = new com.google.android.material.bottomsheet.a(activityR);
            HashMap map = i;
            Activity activityR2 = aVar3.r();
            Intrinsics.checkNotNull(activityR2);
            String strStringPlus = Intrinsics.stringPlus(activityR2.getClass().getName(), VContant.APPLICATION_SCREEN);
            com.google.android.material.bottomsheet.a aVar4 = g;
            Intrinsics.checkNotNull(aVar4);
            map.put(strStringPlus, aVar4);
            com.google.android.material.bottomsheet.a aVar5 = g;
            Intrinsics.checkNotNull(aVar5);
            aVar5.setCancelable(false);
            com.google.android.material.bottomsheet.a aVar6 = g;
            Intrinsics.checkNotNull(aVar6);
            aVar6.setContentView(view);
            if (mo5.a.k()) {
                try {
                    com.google.android.material.bottomsheet.a aVar7 = g;
                    Intrinsics.checkNotNull(aVar7);
                    Window window = aVar7.getWindow();
                    if (window != null) {
                        window.setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e2) {
                    nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
                }
            }
            View viewFindViewById12 = view.findViewById(l0("ap_radioGroupYesNo"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(getViewID(\"ap_radioGroupYesNo\"))");
            y = (RadioGroup) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(l0("ap_radioButtonYes"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "view.findViewById(getViewID(\"ap_radioButtonYes\"))");
            z = (RadioButton) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(l0("ap_radioButtonNo"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "view.findViewById(getViewID(\"ap_radioButtonNo\"))");
            A = (RadioButton) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(l0("ap_checkbox_skip"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "view.findViewById(getViewID(\"ap_checkbox_skip\"))");
            B = (CheckBox) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(l0("ap_cv_question"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "view.findViewById(getViewID(\"ap_cv_question\"))");
            G = (CardView) viewFindViewById16;
            X = (TextView) view.findViewById(l0("ap_user_question"));
            nn3 nn3Var = nn3.a;
            mo5 mo5Var = mo5.a;
            ai aiVar = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            nn3Var.f("HashmapAdap", Intrinsics.stringPlus("", aiVar == null ? null : aiVar.getConditionaltitle()));
            ai aiVar2 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            nn3Var.f("HashmapAdap", Intrinsics.stringPlus("", aiVar2 == null ? null : aiVar2.getConditionalmsg()));
            ai aiVar3 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            nn3Var.f("HashmapAdap", Intrinsics.stringPlus("", aiVar3 == null ? null : aiVar3.getYesmessage()));
            ai aiVar4 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            nn3Var.f("HashmapAdap", Intrinsics.stringPlus("", aiVar4 == null ? null : aiVar4.getNomessage()));
            TextView textView = X;
            Intrinsics.checkNotNull(textView);
            ai aiVar5 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            textView.setText(aiVar5 == null ? null : aiVar5.getConditionaltitle());
            RadioButton radioButton = z;
            if (radioButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("radioButtonYes");
                radioButton = null;
            }
            ai aiVar6 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            radioButton.setText(aiVar6 == null ? null : aiVar6.getYesmessage());
            RadioButton radioButton2 = A;
            if (radioButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("radioButtonNo");
                radioButton2 = null;
            }
            ai aiVar7 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            radioButton2.setText(aiVar7 == null ? null : aiVar7.getNomessage());
            CheckBox checkBox = B;
            if (checkBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
                checkBox = null;
            }
            ai aiVar8 = (ai) mo5Var.c().get(md5Var.getVulnerabilityCode());
            checkBox.setText(aiVar8 == null ? null : aiVar8.getConditionalmsg());
            TextView textView2 = J;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_tittle");
                textView2 = null;
            }
            String vulnerabilityTitle = md5Var.getVulnerabilityTitle();
            Intrinsics.checkNotNull(vulnerabilityTitle);
            textView2.setText(StringsKt__StringsKt.substringBefore$default(vulnerabilityTitle, "!", (String) null, 2, (Object) null));
            TextView textView3 = K;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_msg");
                textView3 = null;
            }
            textView3.setText(md5Var.getVulnerabilityMessage());
            TextView textView4 = L;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_recom");
                textView4 = null;
            }
            textView4.setText(md5Var.getRecommendation());
            CheckBox checkBox2 = M;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_check_box");
                checkBox2 = null;
            }
            checkBox2.setVisibility(8);
            com.google.android.material.bottomsheet.a aVar8 = g;
            Intrinsics.checkNotNull(aVar8);
            BottomSheetBehavior bottomSheetBehaviorQ = aVar8.q();
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ, "blockAlertBottomSheetDialog!!.behavior");
            if (u0()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    b0(view, "ap_tv_description_navigation_title_b");
                } catch (Exception e3) {
                    nn3.c(nn3.a, this.a, e3.toString(), null, 4, null);
                }
            }
            Set setKeySet = mo5.a.c().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "hashMapAdaptiveContainer.keys");
            if (CollectionsKt___CollectionsKt.contains(setKeySet, md5Var.getVulnerabilityCode())) {
                Activity activityR3 = jt.c.r();
                Intrinsics.checkNotNull(activityR3);
                bottomSheetBehaviorQ.S0(i0(activityR3));
                ConstraintLayout constraintLayout = P;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cl_card_view");
                    constraintLayout = null;
                }
                constraintLayout.getLayoutParams().height = (int) (((double) bottomSheetBehaviorQ.u0()) * 0.6d);
                bottomSheetBehaviorQ.u0();
                bottomSheetBehaviorQ.K0(false);
                RadioButton radioButton3 = z;
                if (radioButton3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("radioButtonYes");
                    radioButton3 = null;
                }
                if (!radioButton3.isChecked()) {
                    RadioButton radioButton4 = A;
                    if (radioButton4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("radioButtonNo");
                        radioButton4 = null;
                    }
                    if (!radioButton4.isChecked()) {
                        Button button2 = N;
                        if (button2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                            button2 = null;
                        }
                        button2.setEnabled(false);
                        Button button3 = N;
                        if (button3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                            button3 = null;
                        }
                        button3.setBackgroundResource(l0("ap_disable_blockbtn_border"));
                        Button button4 = N;
                        if (button4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                            button4 = null;
                        }
                        button4.setTextColor(-7829368);
                        CheckBox checkBox3 = B;
                        if (checkBox3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
                            checkBox3 = null;
                        }
                        checkBox3.setVisibility(4);
                        CheckBox checkBox4 = B;
                        if (checkBox4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
                            checkBox4 = null;
                        }
                        checkBox4.setChecked(false);
                        TextView textView5 = K;
                        if (textView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("b_msg");
                            textView5 = null;
                        }
                        textView5.setMaxLines(4);
                        TextView textView6 = K;
                        if (textView6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("b_msg");
                            textView6 = null;
                        }
                        textView6.setEllipsize(TextUtils.TruncateAt.END);
                        TextView textView7 = K;
                        if (textView7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("b_msg");
                            textView7 = null;
                        }
                        textView7.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z65
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                RecyclerViewInteractor.M0(view2);
                            }
                        });
                    }
                }
                RadioGroup radioGroup = y;
                if (radioGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("radioGroupContainer");
                    radioGroup = null;
                }
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.a75
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup2, int i2) {
                        RecyclerViewInteractor.J0(this.a, radioGroup2, i2);
                    }
                });
                Button button5 = O;
                if (button5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_skip_btn");
                    button5 = null;
                }
                button5.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b75
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        RecyclerViewInteractor.K0(this.a, md5Var, view2);
                    }
                });
            } else {
                Button button6 = S;
                if (button6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_go_set_btn");
                    button6 = null;
                }
                button6.setVisibility(8);
                Button button7 = N;
                if (button7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                    button7 = null;
                }
                button7.setVisibility(0);
                Button button8 = N;
                if (button8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                    button8 = null;
                }
                button8.setEnabled(true);
                Button button9 = O;
                if (button9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("b_skip_btn");
                    button9 = null;
                }
                button9.setVisibility(8);
                CardView cardView = G;
                if (cardView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cv_question");
                    cardView = null;
                }
                cardView.setVisibility(8);
                bottomSheetBehaviorQ.K0(false);
                ConstraintLayout constraintLayout2 = P;
                if (constraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cl_card_view");
                    constraintLayout2 = null;
                }
                constraintLayout2.getLayoutParams().height = -2;
            }
            Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
            if (vulnerabilityCode != null && vulnerabilityCode.intValue() == 215) {
                CardView cardView2 = a0;
                if (cardView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cvBlackListedAppsBlock");
                    cardView2 = null;
                }
                cardView2.setVisibility(0);
                RecyclerView recyclerView = Y;
                Intrinsics.checkNotNull(recyclerView);
                r0(md5Var, recyclerView);
            } else {
                Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
                if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 12) {
                    pp5.a aVar9 = pp5.c;
                    if (aVar9.b() != null) {
                        CardView cardView3 = a0;
                        if (cardView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cvBlackListedAppsBlock");
                            cardView3 = null;
                        }
                        cardView3.setVisibility(0);
                        String blockListApp = md5Var.getBlockListApp();
                        if (blockListApp == null || blockListApp.length() == 0) {
                            md5Var.setBlockListApp(aVar9.b());
                        }
                        O0(md5Var, Y);
                    }
                } else {
                    Integer vulnerabilityCode3 = md5Var.getVulnerabilityCode();
                    if (vulnerabilityCode3 != null && vulnerabilityCode3.intValue() == 35 && (!ScanCore.a.H0().isEmpty())) {
                        CardView cardView4 = a0;
                        if (cardView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cvBlackListedAppsBlock");
                            cardView4 = null;
                        }
                        cardView4.setVisibility(0);
                        RecyclerView recyclerView2 = Y;
                        Intrinsics.checkNotNull(recyclerView2);
                        p0(md5Var, recyclerView2);
                    } else {
                        Integer vulnerabilityCode4 = md5Var.getVulnerabilityCode();
                        if (vulnerabilityCode4 != null && vulnerabilityCode4.intValue() == 44 && (!ScanCore.a.G0().isEmpty())) {
                            CardView cardView5 = a0;
                            if (cardView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cvBlackListedAppsBlock");
                                cardView5 = null;
                            }
                            cardView5.setVisibility(0);
                            RecyclerView recyclerView3 = Y;
                            Intrinsics.checkNotNull(recyclerView3);
                            n0(md5Var, recyclerView3);
                        } else {
                            Integer vulnerabilityCode5 = md5Var.getVulnerabilityCode();
                            if (vulnerabilityCode5 != null && vulnerabilityCode5.intValue() == 6 && (!ScanCore.a.I0().isEmpty())) {
                                CardView cardView6 = a0;
                                if (cardView6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("cvBlackListedAppsBlock");
                                    cardView6 = null;
                                }
                                cardView6.setVisibility(0);
                                RecyclerView recyclerView4 = Y;
                                Intrinsics.checkNotNull(recyclerView4);
                                v0(md5Var, recyclerView4);
                            } else {
                                Integer vulnerabilityCode6 = md5Var.getVulnerabilityCode();
                                if (vulnerabilityCode6 != null && vulnerabilityCode6.intValue() == 226 && (!ScanCore.a.J0().isEmpty())) {
                                    CardView cardView7 = a0;
                                    if (cardView7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("cvBlackListedAppsBlock");
                                        cardView7 = null;
                                    }
                                    cardView7.setVisibility(0);
                                    RecyclerView recyclerView5 = Y;
                                    Intrinsics.checkNotNull(recyclerView5);
                                    x0(md5Var, recyclerView5);
                                }
                            }
                        }
                    }
                }
            }
            A0(md5Var);
            Button button10 = N;
            if (button10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                button = null;
            } else {
                button = button10;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c75
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RecyclerViewInteractor.L0(md5Var, this, view2);
                }
            });
            Activity activityR4 = jt.c.r();
            Intrinsics.checkNotNull(activityR4);
            if (activityR4.isFinishing()) {
                return;
            }
            com.google.android.material.bottomsheet.a aVar10 = g;
            Intrinsics.checkNotNull(aVar10);
            if (aVar10.isShowing()) {
                return;
            }
            a aVar11 = c;
            Integer vulnerabilityCode7 = md5Var.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode7);
            aVar11.c(vulnerabilityCode7.intValue());
            com.google.android.material.bottomsheet.a aVar12 = g;
            Intrinsics.checkNotNull(aVar12);
            aVar12.show();
            com.google.android.material.bottomsheet.a aVar13 = g;
            Intrinsics.checkNotNull(aVar13);
            if (aVar13.isShowing()) {
                return;
            }
            e0();
            Integer vulnerabilityCode8 = md5Var.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode8);
            z0(vulnerabilityCode8.intValue());
        } catch (Exception e4) {
            nn3.c(nn3.a, this.a, e4.toString(), null, 4, null);
        }
    }

    public final void N0(md5 md5Var) {
        com.google.android.material.bottomsheet.a aVar;
        com.google.android.material.bottomsheet.a aVar2;
        try {
            String vulnerabilityActionRequired = md5Var.getVulnerabilityActionRequired();
            NativeInteractor nativeInteractor = NativeInteractor.a;
            if (!Intrinsics.areEqual(vulnerabilityActionRequired, nativeInteractor.e1())) {
                if (Intrinsics.areEqual(vulnerabilityActionRequired, nativeInteractor.a1())) {
                    if (k0 == null) {
                        k0 = md5Var;
                        d(md5Var);
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(vulnerabilityActionRequired, nativeInteractor.d1())) {
                    c0(md5Var);
                    return;
                }
                if (Intrinsics.areEqual(vulnerabilityActionRequired, nativeInteractor.f1())) {
                    nn3.a.f(this.a, "vulnerabilityCode:-" + md5Var.getVulnerabilityCode() + " vulnerabilityActionRequired" + ((Object) md5Var.getVulnerabilityActionRequired()));
                    return;
                }
                return;
            }
            jt.a aVar3 = jt.c;
            Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            aVar3.b(vulnerabilityCode.intValue());
            if (!aVar3.Z() && k0 == null) {
                j(md5Var);
                return;
            }
            if (aVar3.Z()) {
                com.google.android.material.bottomsheet.a aVar4 = f;
                if (aVar4 != null) {
                    Intrinsics.checkNotNull(aVar4);
                    if (aVar4.isShowing()) {
                        h(md5Var);
                        return;
                    }
                }
                com.google.android.material.bottomsheet.a aVar5 = f;
                if (aVar5 != null) {
                    Intrinsics.checkNotNull(aVar5);
                    if (!aVar5.isShowing() && (aVar2 = g) != null) {
                        Intrinsics.checkNotNull(aVar2);
                        if (!aVar2.isShowing()) {
                            Activity activityR = aVar3.r();
                            Intrinsics.checkNotNull(activityR);
                            if (!activityR.isFinishing()) {
                                com.google.android.material.bottomsheet.a aVar6 = f;
                                Intrinsics.checkNotNull(aVar6);
                                aVar6.show();
                            }
                            h(md5Var);
                            return;
                        }
                    }
                }
                if (f == null && (aVar = g) != null) {
                    Intrinsics.checkNotNull(aVar);
                    if (!aVar.isShowing()) {
                        j(md5Var);
                        return;
                    }
                }
                if (CollectionsKt___CollectionsKt.contains(j0, md5Var.getVulnerabilityCode())) {
                    return;
                }
                List list = j0;
                Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode2);
                list.add(vulnerabilityCode2);
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void O0(md5 md5Var, RecyclerView recyclerView) {
        try {
            nq nqVar = new nq(md5Var);
            d0 = nqVar;
            Intrinsics.checkNotNull(nqVar);
            if (!CollectionsKt___CollectionsKt.contains(nqVar.C(), md5Var.getBlockListApp())) {
                nq nqVar2 = d0;
                Intrinsics.checkNotNull(nqVar2);
                ArrayList arrayListC = nqVar2.C();
                String blockListApp = md5Var.getBlockListApp();
                Intrinsics.checkNotNull(blockListApp);
                arrayListC.add(blockListApp);
            }
            Intrinsics.checkNotNull(recyclerView);
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "rvScreenSharing!!.layoutParams");
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
            recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
            recyclerView.setAdapter(d0);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void R0(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.b = view;
    }

    public final void S0() {
        try {
            for (md5 md5Var : k) {
                jt.a aVar = jt.c;
                Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode);
                aVar.V0(vulnerabilityCode.intValue());
            }
            k.clear();
            jt.a aVar2 = jt.c;
            ScanAlerts scanAlertsL = aVar2.L();
            Intrinsics.checkNotNull(scanAlertsL);
            Activity activityR = aVar2.r();
            Intrinsics.checkNotNull(activityR);
            scanAlertsL.C(activityR);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void T0(md5 md5Var) {
        try {
            jt.a aVar = jt.c;
            if (!CollectionsKt___CollectionsKt.contains(aVar.O(), md5Var.getVulnerabilityCode())) {
                List listO = aVar.O();
                Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
                Intrinsics.checkNotNull(vulnerabilityCode);
                listO.add(vulnerabilityCode);
                CheckBox checkBox = B;
                ArrayList arrayListC = null;
                if (checkBox == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
                    checkBox = null;
                }
                if (checkBox.isChecked()) {
                    Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
                    if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 215) {
                        nq nqVar = c0;
                        if (nqVar != null) {
                            arrayListC = nqVar.C();
                        }
                        nn3.a.f(this.a, Intrinsics.stringPlus("Adapter BlockList app", arrayListC));
                        if (arrayListC != null) {
                            s06 s06VarA = s06.m.a();
                            Intrinsics.checkNotNull(s06VarA);
                            String string = arrayListC.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "currentHamApp.toString()");
                            s06VarA.C("harmful_app_list", string);
                        }
                    }
                    s06 s06VarA2 = s06.m.a();
                    Intrinsics.checkNotNull(s06VarA2);
                    s06VarA2.C(String.valueOf(md5Var.getVulnerabilityCode()), String.valueOf(System.currentTimeMillis()));
                }
            }
            if (CollectionsKt___CollectionsKt.contains(aVar.A(), md5Var.getVulnerabilityCode())) {
                aVar.A().remove(md5Var.getVulnerabilityCode());
            }
            j70 j70Var = j;
            Intrinsics.checkNotNull(j70Var);
            j70Var.e(md5Var);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void U0() {
        try {
            Button button = N;
            Button button2 = null;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                button = null;
            }
            button.setEnabled(true);
            Button button3 = N;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                button3 = null;
            }
            button3.setBackgroundResource(l0("ap_skip_all_border"));
            jt.a aVar = jt.c;
            int identifier = aVar.C().getResources().getIdentifier("ap_darkred", "color", aVar.C().getPackageName());
            Button button4 = N;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
            } else {
                button2 = button4;
            }
            button2.setTextColor(aVar.C().getColor(identifier));
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void V0() {
        try {
            Button button = N;
            CheckBox checkBox = null;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                button = null;
            }
            button.setVisibility(8);
            Button button2 = O;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_skip_btn");
                button2 = null;
            }
            button2.setVisibility(0);
            CheckBox checkBox2 = B;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
            } else {
                checkBox = checkBox2;
            }
            checkBox.setVisibility(0);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void W0() {
        try {
            U0();
            CheckBox checkBox = B;
            Button button = null;
            if (checkBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
                checkBox = null;
            }
            checkBox.setChecked(false);
            CheckBox checkBox2 = B;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkbox_skip");
                checkBox2 = null;
            }
            checkBox2.setVisibility(4);
            Button button2 = N;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_blk_btn");
                button2 = null;
            }
            button2.setVisibility(0);
            Button button3 = O;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("b_skip_btn");
            } else {
                button = button3;
            }
            button.setVisibility(8);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void a(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Integer vulnerabilityCode = response.getVulnerabilityCode();
            CheckBox checkBox = null;
            Intent intent = (vulnerabilityCode != null && vulnerabilityCode.intValue() == 30) ? new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS") : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 25) ? new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS") : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 44) ? new Intent("android.settings.ACCESSIBILITY_SETTINGS") : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 41) ? new Intent("android.settings.DATE_SETTINGS") : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 31) ? new Intent("android.app.action.SET_NEW_PASSWORD") : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 24) ? new Intent("android.settings.VPN_SETTINGS") : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 35) ? new Intent().setComponent(new ComponentName("com.android.settings", "com.android.settings.DeviceAdminSettings")) : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 217) ? new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus(NativeInteractor.a.P(), jt.c.C().getPackageName()))) : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 5) ? new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus(NativeInteractor.a.P(), jt.c.C().getPackageName()))) : (vulnerabilityCode != null && vulnerabilityCode.intValue() == 224) ? new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus(NativeInteractor.a.P(), jt.c.C().getPackageName()))) : null;
            Intrinsics.checkNotNull(intent);
            jt.a aVar = jt.c;
            Activity activityR = aVar.r();
            Intrinsics.checkNotNull(activityR);
            if (intent.resolveActivity(activityR.getPackageManager()) != null) {
                Activity activityR2 = aVar.r();
                Intrinsics.checkNotNull(activityR2);
                activityR2.startActivity(intent);
                return;
            }
            nn3.a.f("Application_Developer", "No Activity to handle Intent action");
            Button button = v;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnFixIssue");
                button = null;
            }
            button.setVisibility(8);
            CheckBox checkBox2 = u;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cb_ignoreIssueView");
            } else {
                checkBox = checkBox2;
            }
            checkBox.setVisibility(8);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void b() {
        try {
            nn3 nn3Var = nn3.a;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(k0);
            sb.append(' ');
            jt.a aVar = jt.c;
            sb.append(aVar.A());
            sb.append(' ');
            nn3Var.f("AlertReFresh", sb.toString());
            md5 md5Var = k0;
            if (md5Var != null) {
                Intrinsics.checkNotNull(md5Var);
                d(md5Var);
            } else if (!(!aVar.A().isEmpty())) {
                g();
            } else if (aVar.A().contains(215)) {
                tm5 tm5VarD = tm5.f.d();
                Intrinsics.checkNotNull(tm5VarD);
                ScanAlerts scanAlertsL = aVar.L();
                Intrinsics.checkNotNull(scanAlertsL);
                if5 if5VarQ = scanAlertsL.Q(215);
                Intrinsics.checkNotNull(if5VarQ);
                tm5VarD.J(if5VarQ, "SecondScreen");
            } else {
                ScanAlerts scanAlertsL2 = aVar.L();
                Intrinsics.checkNotNull(scanAlertsL2);
                k(scanAlertsL2.A(((Number) CollectionsKt___CollectionsKt.first(aVar.A())).intValue()));
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void b0(View view, String str) {
        try {
            TextView textView = (TextView) view.findViewById(l0(str));
            TextView textView2 = (TextView) view.findViewById(l0("ap_tv_new_text_view"));
            textView2.setVisibility(0);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new b(textView, textView2, this, 16.0f, view));
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void c(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            nn3.a.f(Intrinsics.stringPlus(this.a, "Ident"), "vulnerabilityCode:-" + response.getVulnerabilityCode() + " vulnerabilityActionRequired" + ((Object) response.getVulnerabilityActionRequired()));
            N0(response);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void c0(md5 md5Var) {
        com.google.android.material.bottomsheet.a aVar;
        try {
            jt.a aVar2 = jt.c;
            Integer vulnerabilityCode = md5Var.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            aVar2.c(vulnerabilityCode.intValue());
            if (aVar2.Z() || k0 != null) {
                Integer vulnerabilityCode2 = md5Var.getVulnerabilityCode();
                if (vulnerabilityCode2 != null && vulnerabilityCode2.intValue() == 215) {
                    com.google.android.material.bottomsheet.a aVar3 = g;
                    Intrinsics.checkNotNull(aVar3);
                    if (aVar3.isShowing()) {
                        com.google.android.material.bottomsheet.a aVar4 = g;
                        Intrinsics.checkNotNull(aVar4);
                        aVar4.dismiss();
                        a aVar5 = c;
                        Integer vulnerabilityCode3 = md5Var.getVulnerabilityCode();
                        Intrinsics.checkNotNull(vulnerabilityCode3);
                        aVar5.y(vulnerabilityCode3.intValue());
                        k(md5Var);
                    }
                } else if (CollectionsKt___CollectionsKt.contains(aVar2.A(), md5Var.getVulnerabilityCode()) && (aVar = g) != null) {
                    Intrinsics.checkNotNull(aVar);
                    if (!aVar.isShowing()) {
                        k(md5Var);
                    }
                }
            } else {
                aVar2.n0(true);
                k(md5Var);
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0264 A[Catch: Exception -> 0x006b, TryCatch #2 {Exception -> 0x006b, blocks: (B:3:0x0007, B:5:0x0042, B:9:0x006e, B:11:0x0072, B:13:0x007b, B:14:0x0083, B:16:0x0087, B:18:0x0090, B:19:0x0098, B:28:0x018f, B:30:0x01a6, B:31:0x01ac, B:33:0x01c0, B:34:0x01c6, B:36:0x01d1, B:37:0x01d7, B:43:0x01fc, B:47:0x0205, B:49:0x020d, B:51:0x0213, B:53:0x0217, B:54:0x021b, B:115:0x032f, B:117:0x0333, B:119:0x033a, B:121:0x035d, B:123:0x0368, B:125:0x038b, B:55:0x0228, B:71:0x0264, B:82:0x0298, B:93:0x02cb, B:104:0x02fd, B:107:0x0304, B:109:0x030c, B:111:0x031c, B:113:0x0320, B:114:0x0324, B:96:0x02d2, B:98:0x02d9, B:100:0x02e9, B:102:0x02ed, B:103:0x02f1, B:85:0x029f, B:87:0x02a7, B:89:0x02b7, B:91:0x02bb, B:92:0x02bf, B:74:0x026b, B:76:0x0273, B:78:0x0283, B:80:0x0287, B:81:0x028b, B:58:0x022f, B:60:0x0237, B:62:0x023f, B:64:0x0243, B:65:0x0247, B:67:0x0250, B:70:0x025d, B:69:0x0256, B:42:0x01ee, B:27:0x0181, B:21:0x016e, B:24:0x017a, B:39:0x01e4), top: B:133:0x0007, inners: #0, #1 }] */
    @Override // com.zepto.j70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.zepto.md5 r14) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor.d(com.zepto.md5):void");
    }

    public final void d0() {
        try {
            com.google.android.material.bottomsheet.a aVar = f;
            if (aVar != null) {
                Intrinsics.checkNotNull(aVar);
                if (aVar.isShowing() || !(!k.isEmpty())) {
                    return;
                }
                Activity activityR = jt.c.r();
                Intrinsics.checkNotNull(activityR);
                if (!activityR.isFinishing()) {
                    com.google.android.material.bottomsheet.a aVar2 = f;
                    Intrinsics.checkNotNull(aVar2);
                    if (!aVar2.isShowing()) {
                        com.google.android.material.bottomsheet.a aVar3 = f;
                        Intrinsics.checkNotNull(aVar3);
                        aVar3.show();
                    }
                }
                if (k.size() == 1) {
                    j70 j70Var = j;
                    Intrinsics.checkNotNull(j70Var);
                    j70Var.f((md5) CollectionsKt___CollectionsKt.first(k));
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void e(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            a aVar = c;
            Integer vulnerabilityCode = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            aVar.y(vulnerabilityCode.intValue());
            com.google.android.material.bottomsheet.a aVar2 = g;
            Intrinsics.checkNotNull(aVar2);
            aVar2.dismiss();
            jt.a aVar3 = jt.c;
            if (!aVar3.A().isEmpty()) {
                Activity activityR = aVar3.r();
                Intrinsics.checkNotNull(activityR);
                activityR.runOnUiThread(new Runnable() { // from class: com.zepto.k65
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerViewInteractor.h0(this.c);
                    }
                });
            } else {
                g();
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void e0() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setFlags(67108864);
            jt.a aVar = jt.c;
            Activity activityR = aVar.r();
            if (activityR != null) {
                activityR.startActivity(intent);
            }
            Activity activityR2 = aVar.r();
            if (activityR2 != null) {
                activityR2.finish();
            }
            Iterator it = aVar.d().iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).finish();
            }
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void f(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            a aVar = c;
            ImageView imageView = null;
            if (aVar.x() != 0 && aVar.x() != 1) {
                ConstraintLayout constraintLayout = o;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                aVar.o().setVisibility(8);
                ImageView imageView2 = t;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivBackButtonFixIssuesView");
                } else {
                    imageView = imageView2;
                }
                imageView.setVisibility(0);
                return;
            }
            ConstraintLayout constraintLayout2 = o;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            aVar.o().setVisibility(0);
            ImageView imageView3 = t;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivBackButtonFixIssuesView");
            } else {
                imageView = imageView3;
            }
            imageView.setVisibility(8);
            i(response);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void g() {
        try {
            List list = j0;
            list.addAll(l);
            List listDistinct = CollectionsKt___CollectionsKt.distinct(list);
            if (listDistinct.isEmpty()) {
                return;
            }
            k.clear();
            com.google.android.material.bottomsheet.a aVar = f;
            if (aVar != null) {
                Intrinsics.checkNotNull(aVar);
                aVar.dismiss();
            }
            f = null;
            l.clear();
            List listMinus = CollectionsKt___CollectionsKt.minus((Iterable) listDistinct, (Iterable) jt.c.O());
            if (listMinus.isEmpty()) {
                return;
            }
            Iterator it = listMinus.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue == 215) {
                    tm5 tm5VarD = tm5.f.d();
                    Intrinsics.checkNotNull(tm5VarD);
                    ScanAlerts scanAlertsL = jt.c.L();
                    Intrinsics.checkNotNull(scanAlertsL);
                    if5 if5VarQ = scanAlertsL.Q(215);
                    Intrinsics.checkNotNull(if5VarQ);
                    tm5VarD.J(if5VarQ, "SecondScreen");
                } else {
                    f80.d(qj2.c, null, null, new e(iIntValue, this, null), 3, null);
                }
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    @Override // com.zepto.j70
    public void h(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (CollectionsKt___CollectionsKt.contains(l, response.getVulnerabilityCode())) {
                return;
            }
            k.add(response);
            List list = l;
            Integer vulnerabilityCode = response.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            list.add(vulnerabilityCode);
            if (m != null) {
                d0();
                e41 e41Var = m;
                Intrinsics.checkNotNull(e41Var);
                e41Var.j();
                f(response);
            }
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0146 A[Catch: Exception -> 0x0025, TryCatch #1 {Exception -> 0x0025, blocks: (B:3:0x0005, B:7:0x000f, B:10:0x0020, B:13:0x0028, B:15:0x002f, B:16:0x0035, B:20:0x0047, B:22:0x0065, B:24:0x0069, B:25:0x006f, B:26:0x007e, B:28:0x0082, B:29:0x0088, B:31:0x009d, B:32:0x00a3, B:38:0x00c9, B:40:0x00d0, B:41:0x00d6, B:45:0x00e7, B:47:0x00ef, B:49:0x00f5, B:51:0x00f9, B:52:0x00fd, B:117:0x021e, B:119:0x0222, B:121:0x0227, B:53:0x010a, B:69:0x0146, B:80:0x017a, B:91:0x01ae, B:102:0x01e0, B:113:0x0213, B:115:0x0217, B:116:0x021b, B:105:0x01e7, B:107:0x01ef, B:109:0x01ff, B:111:0x0203, B:112:0x0207, B:94:0x01b5, B:96:0x01bc, B:98:0x01cc, B:100:0x01d0, B:101:0x01d4, B:83:0x0181, B:85:0x0189, B:87:0x0199, B:89:0x019d, B:90:0x01a1, B:72:0x014d, B:74:0x0155, B:76:0x0165, B:78:0x0169, B:79:0x016d, B:56:0x0111, B:58:0x0119, B:60:0x0121, B:62:0x0125, B:63:0x0129, B:65:0x0132, B:68:0x013f, B:67:0x0138, B:37:0x00bb, B:6:0x000c, B:34:0x00b0), top: B:127:0x0005, inners: #0 }] */
    @Override // com.zepto.j70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(final com.zepto.md5 r12) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor.i(com.zepto.md5):void");
    }

    public final int i0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.8d);
    }

    @Override // com.zepto.j70
    public void j(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (f != null) {
                h(response);
                return;
            }
            t0();
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(activityR);
            f = aVar;
            Intrinsics.checkNotNull(aVar);
            aVar.setCancelable(false);
            com.google.android.material.bottomsheet.a aVar2 = f;
            Intrinsics.checkNotNull(aVar2);
            aVar2.setContentView(k0());
            if (mo5.a.k()) {
                try {
                    com.google.android.material.bottomsheet.a aVar3 = f;
                    Intrinsics.checkNotNull(aVar3);
                    Window window = aVar3.getWindow();
                    if (window != null) {
                        window.setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
                    }
                } catch (Exception e2) {
                    nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
                }
            }
            com.google.android.material.bottomsheet.a aVar4 = f;
            Intrinsics.checkNotNull(aVar4);
            BottomSheetBehavior bottomSheetBehaviorQ = aVar4.q();
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ, "bottomSheetDialog!!.behavior");
            bottomSheetBehaviorQ.S0(10000);
            RecyclerView recyclerView = (RecyclerView) k0().findViewById(l0("ap_rv_fixable_issues"));
            e = recyclerView;
            if (recyclerView != null) {
                Intrinsics.checkNotNull(recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(jt.c.C()));
            }
            Button button = null;
            if (u0()) {
                CheckBox checkBox = q;
                if (checkBox == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cbSkipAll");
                    checkBox = null;
                }
                checkBox.setChecked(true);
                CheckBox checkBox2 = q;
                if (checkBox2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cbSkipAll");
                    checkBox2 = null;
                }
                if (checkBox2.isChecked()) {
                    Button button2 = r;
                    if (button2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("btnSkipAll");
                        button2 = null;
                    }
                    button2.setVisibility(0);
                }
            }
            CheckBox checkBox3 = q;
            if (checkBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cbSkipAll");
                checkBox3 = null;
            }
            checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.o65
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    RecyclerViewInteractor.f0(compoundButton, z2);
                }
            });
            Button button3 = r;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnSkipAll");
            } else {
                button = button3;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p65
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecyclerViewInteractor.g0(this.a, view);
                }
            });
            List list = k;
            if (list.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new c());
            }
            e41 e41Var = new e41(k);
            RecyclerView recyclerView2 = e;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setAdapter(e41Var);
            m = e41Var;
            RecyclerView recyclerView3 = e;
            Intrinsics.checkNotNull(recyclerView3);
            recyclerView3.setItemViewCacheSize(100);
            e41 e41Var2 = m;
            Intrinsics.checkNotNull(e41Var2);
            e41Var2.j();
            h(response);
            HashMap map = i;
            jt.a aVar5 = jt.c;
            Activity activityR2 = aVar5.r();
            Intrinsics.checkNotNull(activityR2);
            String strStringPlus = Intrinsics.stringPlus(activityR2.getClass().getName(), VContant.MAINSCREEN);
            com.google.android.material.bottomsheet.a aVar6 = f;
            Intrinsics.checkNotNull(aVar6);
            map.put(strStringPlus, aVar6);
            if (k.size() != 0) {
                Activity activityR3 = aVar5.r();
                Intrinsics.checkNotNull(activityR3);
                if (activityR3.isFinishing()) {
                    return;
                }
                com.google.android.material.bottomsheet.a aVar7 = f;
                Intrinsics.checkNotNull(aVar7);
                if (aVar7.isShowing()) {
                    return;
                }
                com.google.android.material.bottomsheet.a aVar8 = f;
                Intrinsics.checkNotNull(aVar8);
                aVar8.show();
                com.google.android.material.bottomsheet.a aVar9 = f;
                Intrinsics.checkNotNull(aVar9);
                if (aVar9.isShowing()) {
                    return;
                }
                e0();
            }
        } catch (Exception e3) {
            nn3.c(nn3.a, this.a, e3.toString(), null, 4, null);
        }
    }

    public final String j0() {
        return this.a;
    }

    @Override // com.zepto.j70
    public void k(md5 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            I0(response);
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final View k0() {
        View view = this.b;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("view");
        return null;
    }

    public final int l0(String str) {
        try {
            jt.a aVar = jt.c;
            return aVar.C().getResources().getIdentifier(str, "id", aVar.C().getPackageName());
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            return 0;
        }
    }

    public final int m0(String str) {
        try {
            jt.a aVar = jt.c;
            return aVar.C().getResources().getIdentifier(str, "string", aVar.C().getPackageName());
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            return 0;
        }
    }

    public final void n0(final md5 md5Var, final RecyclerView recyclerView) {
        try {
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.v65
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewInteractor.o0(md5Var, recyclerView);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void p0(final md5 md5Var, final RecyclerView recyclerView) {
        try {
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.y65
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewInteractor.q0(md5Var, recyclerView);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void r0(final md5 md5Var, final RecyclerView recyclerView) {
        try {
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.d75
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewInteractor.s0(md5Var, recyclerView);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void t0() {
        try {
            jt.a aVar = jt.c;
            View viewInflate = LayoutInflater.from(aVar.r()).inflate(aVar.C().getResources().getIdentifier("ap_layout_new_bottom_sheet", "layout", aVar.C().getPackageName()), (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "from(currentActivity)\n  …ate(btnSheetDialog, null)");
            R0(viewInflate);
            o = (ConstraintLayout) k0().findViewById(l0("ap_cl_issues_list"));
            a aVar2 = c;
            View viewFindViewById = k0().findViewById(l0("ap_cl_fix_issue"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(getViewID(\"ap_cl_fix_issue\"))");
            aVar2.A((CardView) viewFindViewById);
            View viewFindViewById2 = k0().findViewById(l0("ap_cv_black_listed_apps"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(getVie…p_cv_black_listed_apps\"))");
            p = (CardView) viewFindViewById2;
            View viewFindViewById3 = k0().findViewById(l0("ap_tv_issues_found_count"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(getVie…_tv_issues_found_count\"))");
            s = (TextView) viewFindViewById3;
            View viewFindViewById4 = k0().findViewById(l0("ap_ll_iv_back_button"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(getVie…(\"ap_ll_iv_back_button\"))");
            t = (ImageView) viewFindViewById4;
            View viewFindViewById5 = k0().findViewById(l0("ap_cb_accept_risk"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(getViewID(\"ap_cb_accept_risk\"))");
            u = (CheckBox) viewFindViewById5;
            View viewFindViewById6 = k0().findViewById(l0("ap_cb_skip_all"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(getViewID(\"ap_cb_skip_all\"))");
            q = (CheckBox) viewFindViewById6;
            View viewFindViewById7 = k0().findViewById(l0("ap_btn_skip_all"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(getViewID(\"ap_btn_skip_all\"))");
            r = (Button) viewFindViewById7;
            View viewFindViewById8 = k0().findViewById(l0("ap_btn_fix_issue"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(getViewID(\"ap_btn_fix_issue\"))");
            v = (Button) viewFindViewById8;
            View viewFindViewById9 = k0().findViewById(l0("ap_btn_skip_issue"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(getViewID(\"ap_btn_skip_issue\"))");
            w = (Button) viewFindViewById9;
            View viewFindViewById10 = k0().findViewById(l0("ap_close_app"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(getViewID(\"ap_close_app\"))");
            x = (Button) viewFindViewById10;
            View viewFindViewById11 = k0().findViewById(l0("ap_tv_threat_title"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(getViewID(\"ap_tv_threat_title\"))");
            D = (TextView) viewFindViewById11;
            View viewFindViewById12 = k0().findViewById(l0("ap_cv_navigation_description"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(getVie…navigation_description\"))");
            E = (CardView) viewFindViewById12;
            View viewFindViewById13 = k0().findViewById(l0("ap_cv_hint"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "view.findViewById(getViewID(\"ap_cv_hint\"))");
            F = (CardView) viewFindViewById13;
            View viewFindViewById14 = k0().findViewById(l0("ap_tv_description_navigation_title"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "view.findViewById(getVie…ption_navigation_title\"))");
            H = (TextView) viewFindViewById14;
            C = (RecyclerView) k0().findViewById(l0("ap_rv_black_listed_apps"));
            View viewFindViewById15 = k0().findViewById(l0("ap_tv_recommendation_text"));
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "view.findViewById(getVie…tv_recommendation_text\"))");
            I = (TextView) viewFindViewById15;
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final boolean u0() {
        jt.a aVar = jt.c;
        ni0 ni0VarM = aVar.m();
        String apppackage = ni0VarM == null ? null : ni0VarM.getApppackage();
        NativeInteractor nativeInteractor = NativeInteractor.a;
        if (!Intrinsics.areEqual(apppackage, nativeInteractor.R())) {
            qq0 qq0VarP = aVar.p();
            Intrinsics.checkNotNull(qq0VarP);
            if (!Intrinsics.areEqual(qq0VarP.getPackageName(), nativeInteractor.R())) {
                return false;
            }
        }
        return true;
    }

    public final void v0(final md5 md5Var, final RecyclerView recyclerView) {
        try {
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.x65
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewInteractor.w0(md5Var, recyclerView);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void x0(final md5 md5Var, final RecyclerView recyclerView) {
        try {
            Activity activityR = jt.c.r();
            Intrinsics.checkNotNull(activityR);
            activityR.runOnUiThread(new Runnable() { // from class: com.zepto.w65
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerViewInteractor.y0(md5Var, recyclerView);
                }
            });
        } catch (Exception e2) {
            nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
        }
    }

    public final void z0(int i2) {
        if (i2 == 228) {
            try {
                Activity activityR = jt.c.r();
                Intrinsics.checkNotNull(activityR);
                activityR.finish();
                Process.killProcess(Process.myPid());
            } catch (Exception e2) {
                nn3.c(nn3.a, this.a, e2.toString(), null, 4, null);
            }
        }
    }
}
