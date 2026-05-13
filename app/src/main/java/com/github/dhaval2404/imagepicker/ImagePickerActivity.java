package com.github.dhaval2404.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.zepto.li2;
import com.zepto.lv0;
import com.zepto.o31;
import com.zepto.pa0;
import com.zepto.pq;
import com.zepto.px2;
import com.zepto.qx2;
import com.zepto.wb2;
import com.zepto.y05;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J-\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bJ\u0012\u0010\u001e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onBackPressed", "Landroid/net/Uri;", "uri", "m1", "k1", "j1", "o1", "message", "l1", "i1", "n1", "Lcom/zepto/li2;", "C", "Lcom/zepto/li2;", "mGalleryProvider", "Lcom/zepto/pa0;", "D", "Lcom/zepto/pa0;", "mCameraProvider", "Lcom/zepto/o31;", "E", "Lcom/zepto/o31;", "mCropProvider", "Lcom/zepto/lv0;", "F", "Lcom/zepto/lv0;", "mCompressionProvider", "<init>", "()V", "G", "a", "imagepicker_release"}, k = 1, mv = {1, 4, 0})
public final class ImagePickerActivity extends pq {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public li2 mGalleryProvider;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public pa0 mCameraProvider;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public o31 mCropProvider;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public lv0 mCompressionProvider;

    /* JADX INFO: renamed from: com.github.dhaval2404.imagepicker.ImagePickerActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent();
            String string = context.getString(y05.g);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.error_task_cancelled)");
            intent.putExtra("extra.error", string);
            return intent;
        }
    }

    public final void i1(Bundle savedInstanceState) {
        pa0 pa0Var;
        o31 o31Var = new o31(this);
        this.mCropProvider = o31Var;
        o31Var.l(savedInstanceState);
        this.mCompressionProvider = new lv0(this);
        Intent intent = getIntent();
        qx2 qx2Var = (qx2) (intent != null ? intent.getSerializableExtra("extra.image_provider") : null);
        if (qx2Var != null) {
            int i = px2.a[qx2Var.ordinal()];
            if (i == 1) {
                li2 li2Var = new li2(this);
                this.mGalleryProvider = li2Var;
                if (savedInstanceState != null) {
                    return;
                }
                li2Var.j();
                Unit unit = Unit.INSTANCE;
                return;
            }
            if (i == 2) {
                pa0 pa0Var2 = new pa0(this);
                this.mCameraProvider = pa0Var2;
                pa0Var2.n(savedInstanceState);
                if (savedInstanceState == null && (pa0Var = this.mCameraProvider) != null) {
                    pa0Var.r();
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
                return;
            }
        }
        Log.e("image_picker", "Image provider can not be null");
        String string = getString(y05.g);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.error_task_cancelled)");
        l1(string);
    }

    public final void j1(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        pa0 pa0Var = this.mCameraProvider;
        if (pa0Var != null) {
            pa0Var.h();
        }
        o31 o31Var = this.mCropProvider;
        if (o31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropProvider");
        }
        o31Var.h();
        n1(uri);
    }

    public final void k1(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        pa0 pa0Var = this.mCameraProvider;
        if (pa0Var != null) {
            pa0Var.h();
        }
        lv0 lv0Var = this.mCompressionProvider;
        if (lv0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompressionProvider");
        }
        if (!lv0Var.o(uri)) {
            n1(uri);
            return;
        }
        lv0 lv0Var2 = this.mCompressionProvider;
        if (lv0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompressionProvider");
        }
        lv0Var2.j(uri);
    }

    public final void l1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intent intent = new Intent();
        intent.putExtra("extra.error", message);
        setResult(64, intent);
        finish();
    }

    public final void m1(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        o31 o31Var = this.mCropProvider;
        if (o31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropProvider");
        }
        if (o31Var.j()) {
            o31 o31Var2 = this.mCropProvider;
            if (o31Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCropProvider");
            }
            o31Var2.n(uri);
            return;
        }
        lv0 lv0Var = this.mCompressionProvider;
        if (lv0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompressionProvider");
        }
        if (!lv0Var.o(uri)) {
            n1(uri);
            return;
        }
        lv0 lv0Var2 = this.mCompressionProvider;
        if (lv0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompressionProvider");
        }
        lv0Var2.j(uri);
    }

    public final void n1(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        intent.putExtra("extra.file_path", wb2.a.g(this, uri));
        setResult(-1, intent);
        finish();
    }

    public final void o1() {
        setResult(0, INSTANCE.a(this));
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        pa0 pa0Var = this.mCameraProvider;
        if (pa0Var != null) {
            pa0Var.l(requestCode, resultCode, data);
        }
        li2 li2Var = this.mGalleryProvider;
        if (li2Var != null) {
            li2Var.h(requestCode, resultCode, data);
        }
        o31 o31Var = this.mCropProvider;
        if (o31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropProvider");
        }
        o31Var.k(requestCode, resultCode, data);
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        o1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i1(savedInstanceState);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        pa0 pa0Var = this.mCameraProvider;
        if (pa0Var != null) {
            pa0Var.m(requestCode);
        }
    }

    @Override // com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        pa0 pa0Var = this.mCameraProvider;
        if (pa0Var != null) {
            pa0Var.o(outState);
        }
        o31 o31Var = this.mCropProvider;
        if (o31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCropProvider");
        }
        o31Var.m(outState);
        super.onSaveInstanceState(outState);
    }
}
