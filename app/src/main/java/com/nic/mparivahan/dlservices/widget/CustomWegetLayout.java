package com.nic.mparivahan.dlservices.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.zepto.o15;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 92\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b7\u00108J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R$\u0010,\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R$\u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R(\u00102\u001a\u0004\u0018\u00010\"2\b\u00102\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "Landroid/widget/LinearLayout;", "", "visible", "", "setProgressVisible", "onFinishInflate", "", "w", "h", "oldw", "oldh", "onSizeChanged", "inProgress", "c", "getTextColor", "textColor", "setTextColor", "getTextSize", "pxTextSize", "setTextSize", "Landroid/util/AttributeSet;", "attrs", "b", "Landroid/content/Context;", "context", "a", "d", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "btn", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "pb", "", "Ljava/lang/String;", "buttonText", "I", "e", "textSize", "<set-?>", "f", "getProgressColor", "()I", "progressColor", "g", "progressWidth", "Z", "isInProgress", "()Z", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "i", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CustomWegetLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView btn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ProgressBar pb;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String buttonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int textColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int textSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int progressColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int progressWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isInProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomWegetLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        b(attrs);
        a(context);
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.widget_button_layout, this);
        View viewFindViewById = findViewById(R.id.btn_submit);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.btn = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.progress_bar);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ProgressBar");
        this.pb = (ProgressBar) viewFindViewById2;
        TextView textView = this.btn;
        Intrinsics.checkNotNull(textView);
        textView.setText(this.buttonText);
        TextView textView2 = this.btn;
        Intrinsics.checkNotNull(textView2);
        textView2.setTextColor(this.textColor);
        if (this.textSize != -1) {
            TextView textView3 = this.btn;
            Intrinsics.checkNotNull(textView3);
            textView3.setTextSize(0, this.textSize);
        }
    }

    public final void b(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, o15.b0, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.buttonText = typedArrayObtainStyledAttributes.getString(0);
            this.textColor = typedArrayObtainStyledAttributes.getColor(1, -1);
            this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
            this.progressColor = typedArrayObtainStyledAttributes.getColor(3, -1);
            this.progressWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean c(boolean inProgress) {
        this.isInProgress = inProgress;
        d();
        return inProgress;
    }

    public final void d() {
        setEnabled(!this.isInProgress);
        ProgressBar progressBar = this.pb;
        Intrinsics.checkNotNull(progressBar);
        progressBar.setVisibility(this.isInProgress ? 0 : 8);
        TextView textView = this.btn;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(this.isInProgress ? 8 : 0);
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    /* JADX INFO: renamed from: getText, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int paddingTop = (h - getPaddingTop()) - getPaddingBottom();
        ProgressBar progressBar = this.pb;
        Intrinsics.checkNotNull(progressBar);
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        layoutParams.width = paddingTop;
        layoutParams.height = paddingTop;
        ProgressBar progressBar2 = this.pb;
        Intrinsics.checkNotNull(progressBar2);
        progressBar2.setLayoutParams(layoutParams);
    }

    public final void setProgressVisible(boolean visible) {
        ProgressBar progressBar = this.pb;
        Intrinsics.checkNotNull(progressBar);
        progressBar.setVisibility(visible ? 0 : 8);
    }

    public final void setText(String str) {
        this.buttonText = str;
        TextView textView = this.btn;
        Intrinsics.checkNotNull(textView);
        textView.setText(this.buttonText);
    }

    public final void setTextColor(int textColor) {
        this.textColor = textColor;
        TextView textView = this.btn;
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(textColor);
    }

    public final void setTextSize(int pxTextSize) {
        this.textSize = pxTextSize;
        TextView textView = this.btn;
        Intrinsics.checkNotNull(textView);
        textView.setTextSize(0, this.textSize);
    }
}
