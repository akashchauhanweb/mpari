package com.zepto;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.yalantis.ucrop.a;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o31 extends z40 {
    public final int b;
    public final int c;
    public final boolean d;
    public final float e;
    public final float f;
    public File g;
    public final File h;
    public static final a j = new a(null);
    public static final String i = o31.class.getSimpleName();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(ImagePickerActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        Intrinsics.checkNotNullExpressionValue(extras, "activity.intent.extras ?: Bundle()");
        this.b = extras.getInt("extra.max_width", 0);
        this.c = extras.getInt("extra.max_height", 0);
        this.d = extras.getBoolean("extra.crop", false);
        this.e = extras.getFloat("extra.crop_x", 0.0f);
        this.f = extras.getFloat("extra.crop_y", 0.0f);
        this.h = b(extras.getString("extra.save_directory"));
    }

    private final void i(File file) {
        if (file == null) {
            d(y05.f);
            return;
        }
        ImagePickerActivity imagePickerActivityA = a();
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "Uri.fromFile(file)");
        imagePickerActivityA.k1(uriFromFile);
    }

    @Override // com.zepto.z40
    public void c() {
        h();
    }

    public final void g(Uri uri) {
        int i2;
        yb2 yb2Var = yb2.a;
        String strD = yb2Var.d(uri);
        File fileF = yb2Var.f(this.h, strD);
        this.g = fileF;
        if (fileF != null) {
            Intrinsics.checkNotNull(fileF);
            if (fileF.exists()) {
                a.C0064a c0064a = new a.C0064a();
                c0064a.b(yb2Var.a(strD));
                com.yalantis.ucrop.a aVarF = com.yalantis.ucrop.a.b(uri, Uri.fromFile(this.g)).f(c0064a);
                float f = this.e;
                float f2 = 0;
                if (f > f2) {
                    float f3 = this.f;
                    if (f3 > f2) {
                        aVarF.d(f, f3);
                    }
                }
                int i3 = this.b;
                if (i3 > 0 && (i2 = this.c) > 0) {
                    aVarF.e(i3, i2);
                }
                try {
                    aVarF.c(a(), 69);
                    return;
                } catch (ActivityNotFoundException e) {
                    e("uCrop not specified in manifest file.Add UCropActivity in Manifest<activity\n    android:name=\"com.yalantis.ucrop.UCropActivity\"\n    android:screenOrientation=\"portrait\"\n    android:theme=\"@style/Theme.AppCompat.Light.NoActionBar\"/>");
                    e.printStackTrace();
                    return;
                }
            }
        }
        Log.e(i, "Failed to create crop image file");
        d(y05.f);
    }

    public final void h() {
        File file = this.g;
        if (file != null) {
            file.delete();
        }
        this.g = null;
    }

    public final boolean j() {
        return this.d;
    }

    public final void k(int i2, int i3, Intent intent) {
        if (i2 == 69) {
            if (i3 == -1) {
                i(this.g);
            } else {
                f();
            }
        }
    }

    public void l(Bundle bundle) {
        this.g = (File) (bundle != null ? bundle.getSerializable("state.crop_file") : null);
    }

    public void m(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putSerializable("state.crop_file", this.g);
    }

    public final void n(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        g(uri);
    }
}
