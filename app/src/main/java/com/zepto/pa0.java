package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pa0 extends z40 {
    public File b;
    public final File c;
    public static final a e = new a(null);
    public static final String[] d = {"android.permission.CAMERA"};

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(ImagePickerActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        Intrinsics.checkNotNullExpressionValue(extras, "activity.intent.extras ?: Bundle()");
        this.c = b(extras.getString("extra.save_directory"));
    }

    @Override // com.zepto.z40
    public void c() {
        h();
    }

    public final void g() {
        if (k(this)) {
            q();
        } else {
            p();
        }
    }

    public final void h() {
        File file = this.b;
        if (file != null) {
            file.delete();
        }
        this.b = null;
    }

    public final String[] i(Context context) {
        String[] strArr = d;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (wq4.a.b(context, str)) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void j() {
        ImagePickerActivity imagePickerActivityA = a();
        Uri uriFromFile = Uri.fromFile(this.b);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "Uri.fromFile(mCameraFile)");
        imagePickerActivityA.m1(uriFromFile);
    }

    public final boolean k(Context context) {
        for (String str : i(context)) {
            if (true ^ wq4.a.a(context, str)) {
                return false;
            }
        }
        return true;
    }

    public final void l(int i, int i2, Intent intent) {
        if (i == 4281) {
            if (i2 == -1) {
                j();
            } else {
                f();
            }
        }
    }

    public final void m(int i) {
        if (i == 4282) {
            if (k(this)) {
                r();
                return;
            }
            String string = getString(y05.i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.permission_camera_denied)");
            e(string);
        }
    }

    public void n(Bundle bundle) {
        this.b = (File) (bundle != null ? bundle.getSerializable("state.camera_file") : null);
    }

    public void o(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putSerializable("state.camera_file", this.b);
    }

    public final void p() {
        l8.s(a(), i(a()), 4282);
    }

    public final void q() {
        File fileG = yb2.g(yb2.a, this.c, null, 2, null);
        this.b = fileG;
        if (fileG == null || !fileG.exists()) {
            d(y05.e);
        } else {
            a().startActivityForResult(u03.b(this, fileG), 4281);
        }
    }

    public final void r() {
        if (u03.f(this)) {
            g();
        } else {
            d(y05.b);
        }
    }
}
