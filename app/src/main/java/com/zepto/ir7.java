package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ir7 extends cl4 {
    public List c;
    public LayoutInflater d;
    public int e;
    public int f;
    public int g;
    public int h;
    public gm5 i;
    public String j;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ir7.p(ir7.this);
        }
    }

    public ir7(Context context, List imageList, int i, int i2, int i3, int i4, gm5 gm5Var, String textAlign) {
        Intrinsics.checkParameterIsNotNull(imageList, "imageList");
        Intrinsics.checkParameterIsNotNull(textAlign, "textAlign");
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = gm5Var;
        this.j = textAlign;
        this.c = imageList;
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.d = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public static final /* synthetic */ u23 p(ir7 ir7Var) {
        ir7Var.getClass();
        return null;
    }

    @Override // com.zepto.cl4
    public void a(ViewGroup container, int i, Object object) {
        Intrinsics.checkParameterIsNotNull(container, "container");
        Intrinsics.checkParameterIsNotNull(object, "object");
        container.removeView((RelativeLayout) object);
    }

    @Override // com.zepto.cl4
    public int d() {
        List list = this.c;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        return list.size();
    }

    @Override // com.zepto.cl4
    public boolean h(View view, Object obj) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        return Intrinsics.areEqual(view, obj);
    }

    public final int q(String textAlign) {
        Intrinsics.checkParameterIsNotNull(textAlign, "textAlign");
        int iHashCode = textAlign.hashCode();
        if (iHashCode != 77974012) {
            if (iHashCode == 1984282709 && textAlign.equals("CENTER")) {
                return 17;
            }
        } else if (textAlign.equals("RIGHT")) {
            return 5;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    @Override // com.zepto.cl4
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View g(android.view.ViewGroup r12, int r13) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ir7.g(android.view.ViewGroup, int):android.view.View");
    }

    public final void s(u23 itemClickListener) {
        Intrinsics.checkParameterIsNotNull(itemClickListener, "itemClickListener");
    }

    public final void t(wi6 touchListener) {
        Intrinsics.checkParameterIsNotNull(touchListener, "touchListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ir7(Context context, List imageList, int i, int i2, int i3, int i4, String textAlign) {
        this(context, imageList, i, i2, i3, i4, null, textAlign);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(imageList, "imageList");
        Intrinsics.checkParameterIsNotNull(textAlign, "textAlign");
    }
}
