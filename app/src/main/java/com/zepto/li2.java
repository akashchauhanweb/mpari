package com.zepto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class li2 extends z40 {
    public static final a c = new a(null);
    public final String[] b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(ImagePickerActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        Intrinsics.checkNotNullExpressionValue(extras, "activity.intent.extras ?: Bundle()");
        String[] stringArray = extras.getStringArray("extra.mime_types");
        this.b = stringArray == null ? new String[0] : stringArray;
    }

    public final void g(Intent intent) {
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            d(y05.c);
        } else {
            k(data);
            a().m1(data);
        }
    }

    public final void h(int i, int i2, Intent intent) {
        if (i == 4261) {
            if (i2 == -1) {
                g(intent);
            } else {
                f();
            }
        }
    }

    public final void i() {
        a().startActivityForResult(u03.d(a(), this.b), 4261);
    }

    public final void j() {
        i();
    }

    public final void k(Uri uri) {
        getContentResolver().takePersistableUriPermission(uri, 1);
    }
}
