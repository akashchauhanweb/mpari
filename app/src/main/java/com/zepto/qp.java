package com.zepto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class qp extends nm7 implements Animatable {
    public c b;
    public Context c;
    public ArgbEvaluator d;
    public d e;
    public Animator.AnimatorListener f;
    public ArrayList g;
    public final Drawable.Callback h;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            qp.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            qp.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            qp.this.unscheduleSelf(runnable);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(qp.this.g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pp) arrayList.get(i)).b(qp.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(qp.this.g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pp) arrayList.get(i)).c(qp.this);
            }
        }
    }

    public static class c extends Drawable.ConstantState {
        public int a;
        public om7 b;
        public AnimatorSet c;
        public ArrayList d;
        public nx e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.a = cVar.a;
                om7 om7Var = cVar.b;
                if (om7Var != null) {
                    Drawable.ConstantState constantState = om7Var.getConstantState();
                    if (resources != null) {
                        this.b = (om7) constantState.newDrawable(resources);
                    } else {
                        this.b = (om7) constantState.newDrawable();
                    }
                    om7 om7Var2 = (om7) this.b.mutate();
                    this.b = om7Var2;
                    om7Var2.setCallback(callback);
                    this.b.setBounds(cVar.b.getBounds());
                    this.b.g(false);
                }
                ArrayList arrayList = cVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList(size);
                    this.e = new nx(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) cVar.d.get(i);
                        Animator animatorClone = animator.clone();
                        String str = (String) cVar.e.get(animator);
                        animatorClone.setTarget(this.b.c(str));
                        this.d.add(animatorClone);
                        this.e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public qp() {
        this(null, null, null);
    }

    public static qp a(Context context, int i) {
        qp qpVar = new qp(context);
        Drawable drawableE = ed5.e(context.getResources(), i, context.getTheme());
        qpVar.a = drawableE;
        drawableE.setCallback(qpVar.h);
        qpVar.e = new d(qpVar.a.getConstantState());
        return qpVar;
    }

    public static void c(AnimatedVectorDrawable animatedVectorDrawable, pp ppVar) {
        animatedVectorDrawable.registerAnimationCallback(ppVar.a());
    }

    public static boolean g(AnimatedVectorDrawable animatedVectorDrawable, pp ppVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(ppVar.a());
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            tw1.a(drawable, theme);
        }
    }

    public void b(pp ppVar) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, ppVar);
            return;
        }
        if (ppVar == null) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (this.g.contains(ppVar)) {
            return;
        }
        this.g.add(ppVar);
        if (this.f == null) {
            this.f = new b();
        }
        this.b.c.addListener(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return tw1.b(drawable);
        }
        return false;
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d() {
        Animator.AnimatorListener animatorListener = this.f;
        if (animatorListener != null) {
            this.b.c.removeListener(animatorListener);
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void e(String str, Animator animator) {
        animator.setTarget(this.b.b.c(str));
        c cVar = this.b;
        if (cVar.d == null) {
            cVar.d = new ArrayList();
            this.b.e = new nx();
        }
        this.b.d.add(animator);
        this.b.e.put(animator, str);
    }

    public boolean f(pp ppVar) {
        Drawable drawable = this.a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, ppVar);
        }
        ArrayList arrayList = this.g;
        if (arrayList == null || ppVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(ppVar);
        if (this.g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? tw1.d(drawable) : this.b.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? tw1.e(drawable) : this.b.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new d(this.a.getConstantState());
        }
        return null;
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.b.getIntrinsicWidth();
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getOpacity() : this.b.b.getOpacity();
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            tw1.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = vo6.i(resources, theme, attributeSet, kp.e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        om7 om7VarB = om7.b(resources, resourceId, theme);
                        om7VarB.g(false);
                        om7VarB.setCallback(this.h);
                        om7 om7Var = this.b.b;
                        if (om7Var != null) {
                            om7Var.setCallback(null);
                        }
                        this.b.b = om7VarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, kp.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, sp.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? tw1.h(drawable) : this.b.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isStateful() : this.b.b.isStateful();
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.b.setBounds(rect);
        }
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i) : this.b.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : this.b.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            tw1.j(drawable, z);
        } else {
            this.b.b.setAutoMirrored(z);
        }
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.zepto.nm7, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            tw1.n(drawable, i);
        } else {
            this.b.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            tw1.o(drawable, colorStateList);
        } else {
            this.b.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            tw1.p(drawable, mode);
        } else {
            this.b.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.b.c.isStarted()) {
                return;
            }
            this.b.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.c.end();
        }
    }

    public qp(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.b.setColorFilter(colorFilter);
        }
    }

    public static class d extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            qp qpVar = new qp();
            Drawable drawableNewDrawable = this.a.newDrawable();
            qpVar.a = drawableNewDrawable;
            drawableNewDrawable.setCallback(qpVar.h);
            return qpVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            qp qpVar = new qp();
            Drawable drawableNewDrawable = this.a.newDrawable(resources);
            qpVar.a = drawableNewDrawable;
            drawableNewDrawable.setCallback(qpVar.h);
            return qpVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            qp qpVar = new qp();
            Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
            qpVar.a = drawableNewDrawable;
            drawableNewDrawable.setCallback(qpVar.h);
            return qpVar;
        }
    }

    public qp(Context context, c cVar, Resources resources) {
        this.d = null;
        this.f = null;
        this.g = null;
        a aVar = new a();
        this.h = aVar;
        this.c = context;
        if (cVar != null) {
            this.b = cVar;
        } else {
            this.b = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
