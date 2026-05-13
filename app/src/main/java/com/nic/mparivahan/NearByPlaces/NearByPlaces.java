package com.nic.mparivahan.NearByPlaces;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.nic.mparivahan.NearByPlaces.NearByPlaces;
import com.nic.mparivahan.R;
import com.zepto.pq;
import com.zepto.rd;
import com.zepto.ta3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0014R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/nic/mparivahan/NearByPlaces/NearByPlaces;", "Lcom/zepto/pq;", "", "p1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "uri", "Landroid/content/Context;", "context", "", "n1", "newBase", "attachBaseContext", "Landroid/widget/RelativeLayout;", "C", "Landroid/widget/RelativeLayout;", "z1", "()Landroid/widget/RelativeLayout;", "F1", "(Landroid/widget/RelativeLayout;)V", "nearRTO", "D", "y1", "E1", "nearPUCC", "E", "w1", "C1", "nearFuelPump", "F", "x1", "D1", "nearHospital", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "v1", "()Landroid/widget/ImageView;", "B1", "(Landroid/widget/ImageView;)V", "mvvm_back", "H", "Landroid/content/Context;", "o1", "()Landroid/content/Context;", "A1", "(Landroid/content/Context;)V", "Lcom/zepto/rd;", "I", "Lcom/zepto/rd;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NearByPlaces extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public RelativeLayout nearRTO;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RelativeLayout nearPUCC;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public RelativeLayout nearFuelPump;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public RelativeLayout nearHospital;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public rd binding;

    private final void p1() {
        View viewFindViewById = findViewById(R.id.mvvm_Back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        B1((ImageView) viewFindViewById);
        v1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearByPlaces.q1(this.a, view);
            }
        });
        View viewFindViewById2 = findViewById(R.id.nearestPollutionRl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        E1((RelativeLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.nearestRTORl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        F1((RelativeLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.nearestfuelPumpRl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        C1((RelativeLayout) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.nearHospitalRl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        D1((RelativeLayout) viewFindViewById5);
        y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearByPlaces.r1(this.a, view);
            }
        });
        z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearByPlaces.s1(this.a, view);
            }
        });
        w1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearByPlaces.t1(this.a, view);
            }
        });
        x1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearByPlaces.u1(this.a, view);
            }
        });
    }

    public static final void q1(NearByPlaces this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void r1(NearByPlaces this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1("com.google.android.apps.maps", this$0.o1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Nearest Pollution Checking Center")));
            intent.setPackage("com.google.android.apps.maps");
            this$0.o1().startActivity(intent);
            Context contextO1 = this$0.o1();
            Intrinsics.checkNotNull(contextO1, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO1).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context contextO12 = this$0.o1();
            Intrinsics.checkNotNull(contextO12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            this$0.o1().startActivity(intent2);
        } catch (Exception e) {
            Toast.makeText(this$0.o1(), "Unable to Connect Try Again...", 1).show();
            e.printStackTrace();
        }
    }

    public static final void s1(NearByPlaces this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1("com.google.android.apps.maps", this$0.o1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Nearest RTO office")));
            intent.setPackage("com.google.android.apps.maps");
            this$0.o1().startActivity(intent);
            Context contextO1 = this$0.o1();
            Intrinsics.checkNotNull(contextO1, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO1).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context contextO12 = this$0.o1();
            Intrinsics.checkNotNull(contextO12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            this$0.o1().startActivity(intent2);
        } catch (Exception e) {
            Toast.makeText(this$0.o1(), "Unable to Connect Try Again...", 1).show();
            e.printStackTrace();
        }
    }

    public static final void t1(NearByPlaces this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1("com.google.android.apps.maps", this$0.o1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Fuel Pump")));
            intent.setPackage("com.google.android.apps.maps");
            this$0.o1().startActivity(intent);
            Context contextO1 = this$0.o1();
            Intrinsics.checkNotNull(contextO1, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO1).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context contextO12 = this$0.o1();
            Intrinsics.checkNotNull(contextO12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            this$0.o1().startActivity(intent2);
        } catch (Exception e) {
            Toast.makeText(this$0.o1(), "Unable to Connect Try Again...", 1).show();
            e.printStackTrace();
        }
    }

    public static final void u1(NearByPlaces this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n1("com.google.android.apps.maps", this$0.o1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Hospital")));
            intent.setPackage("com.google.android.apps.maps");
            this$0.o1().startActivity(intent);
            Context contextO1 = this$0.o1();
            Intrinsics.checkNotNull(contextO1, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO1).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context contextO12 = this$0.o1();
            Intrinsics.checkNotNull(contextO12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            this$0.o1().startActivity(intent2);
        } catch (Exception e) {
            Toast.makeText(this$0.o1(), "Unable to Connect Try Again...", 1).show();
            e.printStackTrace();
        }
    }

    public final void A1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void B1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void C1(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nearFuelPump = relativeLayout;
    }

    public final void D1(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nearHospital = relativeLayout;
    }

    public final void E1(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nearPUCC = relativeLayout;
    }

    public final void F1(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nearRTO = relativeLayout;
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        super.attachBaseContext(newBase);
        Configuration configuration = new Configuration(newBase.getResources().getConfiguration());
        configuration.fontScale = 1.0f;
        applyOverrideConfiguration(configuration);
    }

    public final boolean n1(String uri, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        try {
            Intrinsics.checkNotNull(uri);
            packageManager.getPackageInfo(uri, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final Context o1() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rd rdVarC = rd.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(rdVarC, "inflate(...)");
        this.binding = rdVarC;
        rd rdVar = null;
        if (rdVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rdVarC = null;
        }
        setContentView(rdVarC.b());
        A1(this);
        ta3.a aVar = ta3.a;
        Context contextO1 = o1();
        rd rdVar2 = this.binding;
        if (rdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rdVar = rdVar2;
        }
        aVar.v1(contextO1, rdVar);
        p1();
    }

    public final ImageView v1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final RelativeLayout w1() {
        RelativeLayout relativeLayout = this.nearFuelPump;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nearFuelPump");
        return null;
    }

    public final RelativeLayout x1() {
        RelativeLayout relativeLayout = this.nearHospital;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nearHospital");
        return null;
    }

    public final RelativeLayout y1() {
        RelativeLayout relativeLayout = this.nearPUCC;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nearPUCC");
        return null;
    }

    public final RelativeLayout z1() {
        RelativeLayout relativeLayout = this.nearRTO;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nearRTO");
        return null;
    }
}
