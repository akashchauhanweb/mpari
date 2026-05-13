package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public class fg2 implements LayoutInflater.Factory2 {
    public final mg2 a;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ yg2 a;

        public a(yg2 yg2Var) {
            this.a = yg2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            sf2 sf2VarK = this.a.k();
            this.a.m();
            i56.r((ViewGroup) sf2VarK.I.getParent(), fg2.this.a).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public fg2(mg2 mg2Var) {
        this.a = mg2Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        yg2 yg2VarU;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y15.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(y15.b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(y15.c, -1);
        String string = typedArrayObtainStyledAttributes.getString(y15.d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !dg2.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        sf2 sf2VarG0 = resourceId != -1 ? this.a.g0(resourceId) : null;
        if (sf2VarG0 == null && string != null) {
            sf2VarG0 = this.a.h0(string);
        }
        if (sf2VarG0 == null && id != -1) {
            sf2VarG0 = this.a.g0(id);
        }
        if (sf2VarG0 == null) {
            sf2VarG0 = this.a.t0().a(context.getClassLoader(), attributeValue);
            sf2VarG0.o = true;
            sf2VarG0.x = resourceId != 0 ? resourceId : id;
            sf2VarG0.y = id;
            sf2VarG0.z = string;
            sf2VarG0.p = true;
            mg2 mg2Var = this.a;
            sf2VarG0.t = mg2Var;
            sf2VarG0.u = mg2Var.w0();
            sf2VarG0.O0(this.a.w0().f(), attributeSet, sf2VarG0.b);
            yg2VarU = this.a.h(sf2VarG0);
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Fragment " + sf2VarG0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (sf2VarG0.p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            sf2VarG0.p = true;
            mg2 mg2Var2 = this.a;
            sf2VarG0.t = mg2Var2;
            sf2VarG0.u = mg2Var2.w0();
            sf2VarG0.O0(this.a.w0().f(), attributeSet, sf2VarG0.b);
            yg2VarU = this.a.u(sf2VarG0);
            if (mg2.J0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + sf2VarG0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        bh2.g(sf2VarG0, viewGroup);
        sf2VarG0.H = viewGroup;
        yg2VarU.m();
        yg2VarU.j();
        View view2 = sf2VarG0.I;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (sf2VarG0.I.getTag() == null) {
            sf2VarG0.I.setTag(string);
        }
        sf2VarG0.I.addOnAttachStateChangeListener(new a(yg2VarU));
        return sf2VarG0.I;
    }
}
