package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.zepto.p05;
import com.zepto.zz4;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public final ClockHandView A;
    public final ClockFaceView B;
    public final MaterialButtonToggleGroup C;
    public final View.OnClickListener D;
    public final Chip y;
    public final Chip z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.C(TimePickerView.this);
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.D(TimePickerView.this);
            return false;
        }
    }

    public class c implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector a;

        public c(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
    }

    public interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ e C(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ d D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public final /* synthetic */ void E(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    public final void F() {
        Chip chip = this.y;
        int i = zz4.J;
        chip.setTag(i, 12);
        this.z.setTag(i, 10);
        this.y.setOnClickListener(this.D);
        this.z.setOnClickListener(this.D);
        this.y.setAccessibilityClassName("android.view.View");
        this.z.setAccessibilityClassName("android.view.View");
    }

    public final void G() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.y.setOnTouchListener(cVar);
        this.z.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.z.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = new a();
        LayoutInflater.from(context).inflate(p05.q, this);
        this.B = (ClockFaceView) findViewById(zz4.k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(zz4.n);
        this.C = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.b
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                this.a.E(materialButtonToggleGroup2, i2, z);
            }
        });
        this.y = (Chip) findViewById(zz4.q);
        this.z = (Chip) findViewById(zz4.o);
        this.A = (ClockHandView) findViewById(zz4.l);
        G();
        F();
    }
}
