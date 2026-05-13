package com.yalantis.ucrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import com.zepto.a05;
import com.zepto.c15;
import com.zepto.ez4;
import com.zepto.fn6;
import com.zepto.hn6;
import com.zepto.kz4;
import com.zepto.n00;
import com.zepto.p60;
import com.zepto.pq;
import com.zepto.q05;
import com.zepto.rv5;
import com.zepto.rz4;
import com.zepto.s05;
import com.zepto.t5;
import com.zepto.yq;
import com.zepto.yy0;
import com.zepto.zm6;
import com.zepto.zx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public class UCropActivity extends pq {
    public static final Bitmap.CompressFormat g0 = Bitmap.CompressFormat.JPEG;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public UCropView N;
    public GestureCropImageView O;
    public OverlayView P;
    public ViewGroup Q;
    public ViewGroup R;
    public ViewGroup S;
    public ViewGroup T;
    public ViewGroup U;
    public ViewGroup V;
    public TextView X;
    public TextView Y;
    public View Z;
    public fn6 a0;
    public boolean M = true;
    public List W = new ArrayList();
    public Bitmap.CompressFormat b0 = g0;
    public int c0 = 90;
    public int[] d0 = {1, 2, 3};
    public zm6.b e0 = new a();
    public final View.OnClickListener f0 = new g();

    public class a implements zm6.b {
        public a() {
        }

        @Override // com.zepto.zm6.b
        public void a(Exception exc) {
            UCropActivity.this.E1(exc);
            UCropActivity.this.finish();
        }

        @Override // com.zepto.zm6.b
        public void b(float f) {
            UCropActivity.this.G1(f);
        }

        @Override // com.zepto.zm6.b
        public void c(float f) {
            UCropActivity.this.A1(f);
        }

        @Override // com.zepto.zm6.b
        public void d() {
            UCropActivity.this.N.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.Z.setClickable(false);
            UCropActivity.this.M = false;
            UCropActivity.this.f1();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.O.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).s(view.isSelected()));
            UCropActivity.this.O.z();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.this.W) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a(float f, float f2) {
            UCropActivity.this.O.x(f / 42.0f);
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.O.z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c() {
            UCropActivity.this.O.t();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.x1();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.y1(90);
        }
    }

    public class f implements HorizontalProgressWheelView.a {
        public f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.O.C(UCropActivity.this.O.getCurrentScale() + (f * ((UCropActivity.this.O.getMaxScale() - UCropActivity.this.O.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.O.E(UCropActivity.this.O.getCurrentScale() + (f * ((UCropActivity.this.O.getMaxScale() - UCropActivity.this.O.getMinScale()) / 15000.0f)));
            }
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.O.z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c() {
            UCropActivity.this.O.t();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity.this.J1(view.getId());
        }
    }

    public class h implements p60 {
        public h() {
        }

        @Override // com.zepto.p60
        public void a(Throwable th) {
            UCropActivity.this.E1(th);
            UCropActivity.this.finish();
        }

        @Override // com.zepto.p60
        public void b(Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.F1(uri, uCropActivity.O.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }
    }

    static {
        yq.I(true);
    }

    public final void A1(float f2) {
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f2)));
        }
    }

    public final void B1(int i) {
        TextView textView = this.X;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void C1(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        w1(intent);
        if (uri == null || uri2 == null) {
            E1(new NullPointerException(getString(c15.a)));
            finish();
            return;
        }
        try {
            this.O.n(uri, uri2);
        } catch (Exception e2) {
            E1(e2);
            finish();
        }
    }

    public final void D1() {
        if (!this.L) {
            z1(0);
        } else if (this.Q.getVisibility() == 0) {
            J1(a05.n);
        } else {
            J1(a05.p);
        }
    }

    public void E1(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    public void F1(Uri uri, float f2, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f2).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }

    public final void G1(float f2) {
        TextView textView = this.Y;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f2 * 100.0f))));
        }
    }

    public final void H1(int i) {
        TextView textView = this.Y;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void I1(int i) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(IntCompanionObject.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    public final void J1(int i) {
        if (this.L) {
            ViewGroup viewGroup = this.Q;
            int i2 = a05.n;
            viewGroup.setSelected(i == i2);
            ViewGroup viewGroup2 = this.R;
            int i3 = a05.o;
            viewGroup2.setSelected(i == i3);
            ViewGroup viewGroup3 = this.S;
            int i4 = a05.p;
            viewGroup3.setSelected(i == i4);
            this.T.setVisibility(i == i2 ? 0 : 8);
            this.U.setVisibility(i == i3 ? 0 : 8);
            this.V.setVisibility(i == i4 ? 0 : 8);
            t1(i);
            if (i == i4) {
                z1(0);
            } else if (i == i3) {
                z1(1);
            } else {
                z1(2);
            }
        }
    }

    public final void K1() {
        I1(this.E);
        Toolbar toolbar = (Toolbar) findViewById(a05.t);
        toolbar.setBackgroundColor(this.D);
        toolbar.setTitleTextColor(this.G);
        TextView textView = (TextView) toolbar.findViewById(a05.u);
        textView.setTextColor(this.G);
        textView.setText(this.C);
        Drawable drawableMutate = yy0.e(this, this.I).mutate();
        drawableMutate.setColorFilter(this.G, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(drawableMutate);
        e1(toolbar);
        t5 t5VarU0 = U0();
        if (t5VarU0 != null) {
            t5VarU0.t(false);
        }
    }

    public final void L1(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList<zx> parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new zx(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new zx(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new zx(getString(c15.c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new zx(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new zx(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(a05.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (zx zxVar : parcelableArrayListExtra) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(q05.b, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.F);
            aspectRatioTextView.setAspectRatio(zxVar);
            linearLayout.addView(frameLayout);
            this.W.add(frameLayout);
        }
        ((ViewGroup) this.W.get(intExtra)).setSelected(true);
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setOnClickListener(new b());
        }
    }

    public final void M1() {
        this.X = (TextView) findViewById(a05.r);
        int i = a05.l;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.F);
        findViewById(a05.z).setOnClickListener(new d());
        findViewById(a05.A).setOnClickListener(new e());
        B1(this.F);
    }

    public final void N1() {
        this.Y = (TextView) findViewById(a05.s);
        int i = a05.m;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.F);
        H1(this.F);
    }

    public final void O1() {
        ImageView imageView = (ImageView) findViewById(a05.f);
        ImageView imageView2 = (ImageView) findViewById(a05.e);
        ImageView imageView3 = (ImageView) findViewById(a05.d);
        imageView.setImageDrawable(new rv5(imageView.getDrawable(), this.F));
        imageView2.setImageDrawable(new rv5(imageView2.getDrawable(), this.F));
        imageView3.setImageDrawable(new rv5(imageView3.getDrawable(), this.F));
    }

    public final void P1(Intent intent) {
        this.E = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", yy0.c(this, ez4.h));
        this.D = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", yy0.c(this, ez4.i));
        this.F = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", yy0.c(this, ez4.a));
        this.G = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", yy0.c(this, ez4.j));
        this.I = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", rz4.a);
        this.J = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", rz4.b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.C = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(c15.b);
        }
        this.C = stringExtra;
        this.K = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", yy0.c(this, ez4.f));
        this.L = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.H = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", yy0.c(this, ez4.b));
        K1();
        v1();
        if (this.L) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(a05.x)).findViewById(a05.a);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(q05.c, viewGroup, true);
            n00 n00Var = new n00();
            this.a0 = n00Var;
            n00Var.a0(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(a05.n);
            this.Q = viewGroup2;
            viewGroup2.setOnClickListener(this.f0);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(a05.o);
            this.R = viewGroup3;
            viewGroup3.setOnClickListener(this.f0);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(a05.p);
            this.S = viewGroup4;
            viewGroup4.setOnClickListener(this.f0);
            this.T = (ViewGroup) findViewById(a05.g);
            this.U = (ViewGroup) findViewById(a05.h);
            this.V = (ViewGroup) findViewById(a05.i);
            L1(intent);
            M1();
            N1();
            O1();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(q05.a);
        Intent intent = getIntent();
        P1(intent);
        C1(intent);
        D1();
        s1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(s05.a, menu);
        MenuItem menuItemFindItem = menu.findItem(a05.k);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.G, PorterDuff.Mode.SRC_ATOP);
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e2) {
                Log.i("UCropActivity", String.format("%s - %s", e2.getMessage(), getString(c15.d)));
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(a05.j);
        Drawable drawableE = yy0.e(this, this.J);
        if (drawableE == null) {
            return true;
        }
        drawableE.mutate();
        drawableE.setColorFilter(this.G, PorterDuff.Mode.SRC_ATOP);
        menuItemFindItem2.setIcon(drawableE);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == a05.j) {
            u1();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(a05.j).setVisible(!this.M);
        menu.findItem(a05.k).setVisible(this.M);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.O;
        if (gestureCropImageView != null) {
            gestureCropImageView.t();
        }
    }

    public final void s1() {
        if (this.Z == null) {
            this.Z = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, a05.t);
            this.Z.setLayoutParams(layoutParams);
            this.Z.setClickable(true);
        }
        ((RelativeLayout) findViewById(a05.x)).addView(this.Z);
    }

    public final void t1(int i) {
        hn6.a((ViewGroup) findViewById(a05.x), this.a0);
        this.S.findViewById(a05.s).setVisibility(i == a05.p ? 0 : 8);
        this.Q.findViewById(a05.q).setVisibility(i == a05.n ? 0 : 8);
        this.R.findViewById(a05.r).setVisibility(i == a05.o ? 0 : 8);
    }

    public void u1() {
        this.Z.setClickable(true);
        this.M = true;
        f1();
        this.O.u(this.b0, this.c0, new h());
    }

    public final void v1() {
        UCropView uCropView = (UCropView) findViewById(a05.v);
        this.N = uCropView;
        this.O = uCropView.getCropImageView();
        this.P = this.N.getOverlayView();
        this.O.setTransformImageListener(this.e0);
        ((ImageView) findViewById(a05.c)).setColorFilter(this.K, PorterDuff.Mode.SRC_ATOP);
        int i = a05.w;
        findViewById(i).setBackgroundColor(this.H);
        if (this.L) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i).getLayoutParams()).bottomMargin = 0;
        findViewById(i).requestLayout();
    }

    public final void w1(Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = g0;
        }
        this.b0 = compressFormatValueOf;
        this.c0 = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.d0 = intArrayExtra;
        }
        this.O.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.O.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.O.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.P.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.P.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(ez4.e)));
        this.P.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.P.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.P.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(ez4.c)));
        this.P.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(kz4.a)));
        this.P.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.P.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.P.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.P.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(ez4.d)));
        this.P.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(kz4.b)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup = this.Q;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.O.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.O.setTargetAspectRatio(0.0f);
        } else {
            this.O.setTargetAspectRatio(((zx) parcelableArrayListExtra.get(intExtra)).d() / ((zx) parcelableArrayListExtra.get(intExtra)).e());
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.O.setMaxResultImageSizeX(intExtra2);
        this.O.setMaxResultImageSizeY(intExtra3);
    }

    public final void x1() {
        GestureCropImageView gestureCropImageView = this.O;
        gestureCropImageView.x(-gestureCropImageView.getCurrentAngle());
        this.O.z();
    }

    public final void y1(int i) {
        this.O.x(i);
        this.O.z();
    }

    public final void z1(int i) {
        GestureCropImageView gestureCropImageView = this.O;
        int i2 = this.d0[i];
        gestureCropImageView.setScaleEnabled(i2 == 3 || i2 == 1);
        GestureCropImageView gestureCropImageView2 = this.O;
        int i3 = this.d0[i];
        gestureCropImageView2.setRotateEnabled(i3 == 3 || i3 == 2);
    }
}
