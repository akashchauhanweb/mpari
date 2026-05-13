package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.zepto.dq7;
import com.zepto.mg2;
import com.zepto.qv7;
import com.zepto.sf2;
import com.zepto.y15;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;B%\b\u0017\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u001b¢\u0006\u0004\b:\u0010?B!\b\u0010\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\b:\u0010BJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0001J\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u0019\u0010*\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0010H\u0002R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006C"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "removeViewAt", "removeViewInLayout", "removeView", "start", "count", "removeViews", "removeViewsInLayout", "removeAllViewsInLayout", "Lcom/zepto/sf2;", "F", "getFragment", "()Lcom/zepto/sf2;", "v", "a", "", "Ljava/util/List;", "disappearingFragmentChildren", "b", "transitioningFragmentViews", "c", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "d", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/zepto/mg2;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/zepto/mg2;)V", "fragment_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n55#2,6:354\n55#2,6:360\n1855#3,2:366\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:354,6\n135#1:360,6\n226#1:366,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List disappearingFragmentChildren;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List transitioningFragmentViews;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean drawDisappearingViewsFirst;

    public static final class a {
        public static final a a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v, WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(View v) {
        if (this.transitioningFragmentViews.contains(v)) {
            this.disappearingFragmentChildren.add(v);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (mg2.D0(child) != null) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        qv7 qv7VarC0;
        Intrinsics.checkNotNullParameter(insets, "insets");
        qv7 qv7VarW = qv7.w(insets);
        Intrinsics.checkNotNullExpressionValue(qv7VarW, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.a;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            qv7VarC0 = qv7.w(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            qv7VarC0 = dq7.c0(this, qv7VarW);
        }
        Intrinsics.checkNotNullExpressionValue(qv7VarC0, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!qv7VarC0.p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                dq7.g(getChildAt(i), qv7VarC0);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.drawDisappearingViewsFirst && (!this.disappearingFragmentChildren.isEmpty()) && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends sf2> F getFragment() {
        return (F) mg2.j0(this).g0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        View view = getChildAt(index);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        int i = start + count;
        for (int i2 = start; i2 < i; i2++) {
            View view = getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        int i = start + count;
        for (int i2 = start; i2 < i; i2++) {
            View view = getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(start, count);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.drawDisappearingViewsFirst = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.applyWindowInsetsListener = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = y15.e;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(y15.f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + Typography.quote);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, mg2 fm) {
        String str;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = y15.e;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(y15.f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(y15.g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        sf2 sf2VarG0 = fm.g0(id);
        if (classAttribute != null && sf2VarG0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            sf2 sf2VarA = fm.t0().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(sf2VarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            sf2VarA.x = id;
            sf2VarA.y = id;
            sf2VarA.z = string;
            sf2VarA.t = fm;
            sf2VarA.u = fm.w0();
            sf2VarA.O0(context, attrs, null);
            fm.n().s(true).d(this, sf2VarA, string).k();
        }
        fm.Z0(this);
    }
}
