package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.zepto.op7;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(op7 op7Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = op7Var.p(iconCompat.a, 1);
        iconCompat.c = op7Var.j(iconCompat.c, 2);
        iconCompat.d = op7Var.r(iconCompat.d, 3);
        iconCompat.e = op7Var.p(iconCompat.e, 4);
        iconCompat.f = op7Var.p(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) op7Var.r(iconCompat.g, 6);
        iconCompat.i = op7Var.t(iconCompat.i, 7);
        iconCompat.j = op7Var.t(iconCompat.j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, op7 op7Var) {
        op7Var.x(true, true);
        iconCompat.k(op7Var.f());
        int i = iconCompat.a;
        if (-1 != i) {
            op7Var.F(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            op7Var.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            op7Var.H(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            op7Var.F(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            op7Var.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            op7Var.H(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            op7Var.J(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            op7Var.J(str2, 8);
        }
    }
}
