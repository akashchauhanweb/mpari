package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.zepto.hr;
import com.zepto.zy4;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class a extends hr implements DialogInterface {
    public final AlertController f;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0001a {
        public final AlertController.b a;
        public final int b;

        public C0001a(Context context) {
            this(context, a.k(context, 0));
        }

        public a a() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.f);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.a.a;
        }

        public C0001a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            return this;
        }

        public C0001a d(View view) {
            this.a.g = view;
            return this;
        }

        public C0001a e(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public C0001a f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            return this;
        }

        public C0001a g(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.l = bVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public C0001a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.l = charSequence;
            bVar.n = onClickListener;
            return this;
        }

        public C0001a i(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public C0001a j(DialogInterface.OnDismissListener onDismissListener) {
            this.a.t = onDismissListener;
            return this;
        }

        public C0001a k(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public C0001a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = charSequence;
            bVar.k = onClickListener;
            return this;
        }

        public C0001a m(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public C0001a n(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        public C0001a o(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public C0001a p(View view) {
            AlertController.b bVar = this.a;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = false;
            return this;
        }

        public a q() {
            a aVarA = a();
            aVarA.show();
            return aVarA;
        }

        public C0001a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, a.k(context, i)));
            this.b = i;
        }
    }

    public a(Context context, int i) {
        super(context, k(context, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    public static int k(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(zy4.l, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i) {
        return this.f.c(i);
    }

    public ListView j() {
        return this.f.e();
    }

    @Override // com.zepto.hr, com.zepto.fu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.zepto.hr, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.q(charSequence);
    }
}
