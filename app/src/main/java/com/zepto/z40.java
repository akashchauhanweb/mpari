package com.zepto;

import android.content.ContextWrapper;
import android.os.Environment;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class z40 extends ContextWrapper {
    public final ImagePickerActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(ImagePickerActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    public final ImagePickerActivity a() {
        return this.a;
    }

    public final File b(String str) {
        if (str != null) {
            return new File(str);
        }
        File externalFilesDir = getExternalFilesDir(Environment.DIRECTORY_DCIM);
        if (externalFilesDir == null) {
            externalFilesDir = this.a.getFilesDir();
        }
        File file = externalFilesDir;
        Intrinsics.checkNotNullExpressionValue(file, "getExternalFilesDir(Envi…CIM) ?: activity.filesDir");
        return file;
    }

    public void c() {
    }

    public final void d(int i) {
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(errorRes)");
        e(string);
    }

    public final void e(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        c();
        this.a.l1(error);
    }

    public final void f() {
        c();
        this.a.o1();
    }
}
