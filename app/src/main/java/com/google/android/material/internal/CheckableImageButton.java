package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import com.zepto.dq7;
import com.zepto.mr;
import com.zepto.r3;
import com.zepto.x2;
import com.zepto.z1;
import com.zepto.zy4;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends mr implements Checkable {
    public static final int[] g = {R.attr.state_checked};
    public boolean d;
    public boolean e;
    public boolean f;

    public class a extends x2 {
        public a() {
        }

        @Override // com.zepto.x2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.S(CheckableImageButton.this.a());
            r3Var.T(CheckableImageButton.this.isChecked());
        }
    }

    public static class b extends z1 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean f;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void d(Parcel parcel) {
            this.f = parcel.readInt() == 1;
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            d(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.C);
    }

    public boolean a() {
        return this.e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.c());
        setChecked(bVar.f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f = this.d;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.e != z) {
            this.e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.e || this.d == z) {
            return;
        }
        this.d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.f = true;
        dq7.q0(this, new a());
    }
}
