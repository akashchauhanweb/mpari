package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import com.zepto.bs7;
import com.zepto.dq7;
import com.zepto.lf4;
import com.zepto.nf2;
import com.zepto.rq;
import com.zepto.s16;
import com.zepto.tr;
import com.zepto.uf3;
import com.zepto.zy4;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final rq a;
    public final Context b;
    public nf2 c;
    public SpinnerAdapter d;
    public final boolean e;
    public j f;
    public int g;
    public final Rect h;

    public class a extends nf2 {
        public final /* synthetic */ h j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.j = hVar;
        }

        @Override // com.zepto.nf2
        public s16 b() {
            return this.j;
        }

        @Override // com.zepto.nf2
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().d()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().d()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    public static final class c {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class d {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i) {
            view.setTextAlignment(i);
        }

        public static void d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    public static final class e {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (lf4.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class f implements j, DialogInterface.OnClickListener {
        public androidx.appcompat.app.a a;
        public ListAdapter b;
        public CharSequence c;

        public f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public boolean d() {
            androidx.appcompat.app.a aVar = this.a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.a;
            if (aVar != null) {
                aVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public int e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void i(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void m(int i, int i2) {
            if (this.b == null) {
                return;
            }
            a.C0001a c0001a = new a.C0001a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                c0001a.o(charSequence);
            }
            androidx.appcompat.app.a aVarA = c0001a.m(this.b, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.a = aVarA;
            ListView listViewJ = aVarA.j();
            d.d(listViewJ, i);
            d.c(listViewJ, i2);
            this.a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public CharSequence o() {
            return this.c;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void p(ListAdapter listAdapter) {
            this.b = listAdapter;
        }
    }

    public static class g implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter a;
        public ListAdapter b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class h extends uf3 implements j {
        public CharSequence I;
        public ListAdapter J;
        public final Rect K;
        public int L;

        public class a implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AppCompatSpinner a;

            public a(AppCompatSpinner appCompatSpinner) {
                this.a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.J.getItemId(i));
                }
                h.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.V(AppCompatSpinner.this)) {
                    h.this.dismiss();
                } else {
                    h.this.T();
                    h.super.a();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.K = new Rect();
            D(AppCompatSpinner.this);
            J(true);
            P(0);
            L(new a(AppCompatSpinner.this));
        }

        public void T() {
            int i;
            Drawable drawableG = g();
            if (drawableG != null) {
                drawableG.getPadding(AppCompatSpinner.this.h);
                i = bs7.b(AppCompatSpinner.this) ? AppCompatSpinner.this.h.right : -AppCompatSpinner.this.h.left;
            } else {
                Rect rect = AppCompatSpinner.this.h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.g;
            if (i2 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.J, g());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iA > i4) {
                    iA = i4;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i2);
            }
            l(bs7.b(AppCompatSpinner.this) ? i + (((width - paddingRight) - z()) - U()) : i + paddingLeft + U());
        }

        public int U() {
            return this.L;
        }

        public boolean V(View view) {
            return dq7.T(view) && view.getGlobalVisibleRect(this.K);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void i(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void k(int i) {
            this.L = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public void m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zD = d();
            T();
            I(2);
            super.a();
            ListView listViewH = h();
            listViewH.setChoiceMode(1);
            d.d(listViewH, i);
            d.c(listViewH, i2);
            Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (zD || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.j
        public CharSequence o() {
            return this.I;
        }

        @Override // com.zepto.uf3, androidx.appcompat.widget.AppCompatSpinner.j
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.J = listAdapter;
        }
    }

    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public boolean c;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        }

        public i(Parcel parcel) {
            super(parcel);
            this.c = parcel.readByte() != 0;
        }
    }

    public interface j {
        void b(Drawable drawable);

        boolean d();

        void dismiss();

        int e();

        Drawable g();

        void i(CharSequence charSequence);

        void j(int i);

        void k(int i);

        void l(int i);

        void m(int i, int i2);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.K);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.h);
        Rect rect = this.h;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f.m(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f;
        return jVar != null ? jVar.e() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f;
        return jVar != null ? jVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final j getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f;
        return jVar != null ? jVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f;
        return jVar != null ? jVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        rq rqVar = this.a;
        if (rqVar != null) {
            return rqVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        rq rqVar = this.a;
        if (rqVar != null) {
            return rqVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f;
        if (jVar == null || !jVar.d()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f;
        iVar.c = jVar != null && jVar.d();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        nf2 nf2Var = this.c;
        if (nf2Var == null || !nf2Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.d()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        j jVar = this.f;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            jVar.k(i2);
            this.f.l(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        j jVar = this.f;
        if (jVar != null) {
            jVar.j(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f;
        if (jVar != null) {
            jVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(tr.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f;
        if (jVar != null) {
            jVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        rq rqVar = this.a;
        if (rqVar != null) {
            rqVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            this.f.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
