package io.github.glailton.expandabletextview;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zepto.t15;
import com.zepto.yy4;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001SB#\b\u0007\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\b\b\u0002\u0010P\u001a\u00020\u000f¢\u0006\u0004\bQ\u0010RJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014J\u001c\u0010\u0019\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000fJ\b\u0010#\u001a\u00020\u0005H\u0002J\b\u0010$\u001a\u00020\u0005H\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\u0018\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0002J\f\u0010\f\u001a\u00020\u0003*\u00020\u001aH\u0002J\f\u0010+\u001a\u00020**\u00020\u001aH\u0002R\u0018\u0010.\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R$\u0010\u0004\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010B\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010<R$\u0010!\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u00100\u001a\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010A¨\u0006T"}, d2 = {"Lio/github/glailton/expandabletextview/ExpandableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/View$OnClickListener;", "", "isExpanded", "", "setEllipsizedText", "Landroid/text/SpannableStringBuilder;", "getExpandText", "getCollapseText", "setForeground", "Landroid/view/View;", "v", "onClick", "changed", "", "left", "top", "right", "bottom", "onLayout", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "", "readLess", "A", "animationDuration", "x", "ellipsizeTextColor", "y", "expandType", "z", "C", "u", "t", "startHeight", "endHeight", "Landroid/animation/AnimatorSet;", "s", "Landroid/text/SpannableString;", "B", "h", "Ljava/lang/CharSequence;", "mOriginalText", "i", "I", "mCollapsedLines", "j", "mReadMoreText", "k", "mReadLessText", "<set-?>", "l", "Z", "w", "()Z", "m", "Ljava/lang/Integer;", "mAnimationDuration", "n", "foregroundColor", "o", "Ljava/lang/String;", "initialText", "p", "Ljava/lang/Boolean;", "isUnderlined", "q", "mEllipsizeTextColor", "r", "getExpandType", "()I", "collapsedVisibleText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "expandable-textview_release"}, k = 1, mv = {1, 6, 0})
public final class ExpandableTextView extends AppCompatTextView implements View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public CharSequence mOriginalText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mCollapsedLines;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public CharSequence mReadMoreText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public CharSequence mReadLessText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isExpanded;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public Integer mAnimationDuration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public Integer foregroundColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public String initialText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public Boolean isUnderlined;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public Integer mEllipsizeTextColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int expandType;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public String collapsedVisibleText;

    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ExpandableTextView.this.getIsExpanded()) {
                return;
            }
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.setEllipsizedText(expandableTextView.getIsExpanded());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandableTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final SpannableStringBuilder getCollapseText() {
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(((double) (this.mReadMoreText.length() + 2)) * 2.0d);
        String str = this.collapsedVisibleText;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
            str = null;
        }
        int iMax = Math.max(0, str.length() - iRoundToInt);
        String str3 = this.collapsedVisibleText;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
            str3 = null;
        }
        int iMin = Integer.min(str3.length(), 2);
        String str4 = this.collapsedVisibleText;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
            str4 = null;
        }
        int iMin2 = Integer.min(str4.length() - iMin, this.mReadMoreText.length());
        String str5 = this.collapsedVisibleText;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
        } else {
            str2 = str5;
        }
        String strSubstring = str2.substring(0, iMax);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strSubstring);
        String strSubstring2 = "… ".substring(0, iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) strSubstring2).append((CharSequence) B(this.mReadMoreText.subSequence(0, iMin2).toString()));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "SpannableStringBuilder(c…eAvailableLength).span())");
        return spannableStringBuilderAppend;
    }

    private final SpannableStringBuilder getExpandText() {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(this.initialText).append((CharSequence) " ").append((CharSequence) B(this.mReadLessText.toString()));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "SpannableStringBuilder(i…ssText.toString().span())");
        return spannableStringBuilderAppend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEllipsizedText(boolean isExpanded) {
        CharSequence expandText;
        if (StringsKt__StringsJVMKt.isBlank(this.initialText)) {
            return;
        }
        String str = this.collapsedVisibleText;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
            str = null;
        }
        if (v(str)) {
            expandText = this.initialText;
        } else {
            int i = this.expandType;
            if (i == 0) {
                expandText = isExpanded ? getExpandText() : getCollapseText();
            } else {
                if (i != 1) {
                    throw new UnsupportedOperationException("No supported expand mechanism provided for expand type[" + this.expandType + ']');
                }
                expandText = getCollapseText();
            }
        }
        setText(expandText);
    }

    private final void setForeground(boolean isExpanded) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        Integer num = this.foregroundColor;
        Intrinsics.checkNotNull(num);
        setForeground(new GradientDrawable(orientation, new int[]{num.intValue(), 0}));
        getForeground().setAlpha(isExpanded ? 0 : KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final ExpandableTextView A(String readLess) {
        Intrinsics.checkNotNullParameter(readLess, "readLess");
        this.mReadLessText = readLess;
        return this;
    }

    public final SpannableString B(String str) {
        SpannableString spannableString = new SpannableString(str);
        Integer num = this.mEllipsizeTextColor;
        Intrinsics.checkNotNull(num);
        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
        Boolean bool = this.isUnderlined;
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    public final void C() {
        String str = this.collapsedVisibleText;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
            str = null;
        }
        if (v(str)) {
            return;
        }
        int i = this.expandType;
        if (i != 0) {
            if (i == 1) {
                new AlertDialog.Builder(getContext()).setTitle("").setMessage(this.initialText).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
                return;
            }
            throw new UnsupportedOperationException("No toggle operation provided for expand type[" + this.expandType + ']');
        }
        this.isExpanded = !this.isExpanded;
        u();
        int measuredHeight = getMeasuredHeight();
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        AnimatorSet animatorSetS = s(measuredHeight, getMeasuredHeight());
        Long lValueOf = this.mAnimationDuration != null ? Long.valueOf(r2.intValue()) : null;
        Intrinsics.checkNotNull(lValueOf);
        animatorSetS.setDuration(lValueOf.longValue());
        animatorSetS.start();
        animatorSetS.addListener(new b());
        setEllipsizedText(this.isExpanded);
    }

    public final int getExpandType() {
        return this.expandType;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        C();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (StringsKt__StringsJVMKt.isBlank(this.initialText)) {
            this.initialText = getText().toString();
            String strT = t();
            this.collapsedVisibleText = strT;
            if (strT == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collapsedVisibleText");
                strT = null;
            }
            boolean z = v(strT) ? true : this.expandType == 1 ? false : this.isExpanded;
            this.isExpanded = z;
            setEllipsizedText(z);
            setForeground(this.isExpanded);
        }
    }

    public final AnimatorSet s(int startHeight, int endHeight) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofInt(animatorSet, "maxHeight", startHeight, endHeight), ObjectAnimator.ofInt(getForeground(), "alpha", getForeground().getAlpha(), 255 - getForeground().getAlpha()));
        return animatorSet;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        this.mOriginalText = text;
        super.setText(text, type);
    }

    public final String t() {
        try {
            int i = this.mCollapsedLines;
            if (i >= Integer.MAX_VALUE) {
                return this.initialText;
            }
            int lineEnd = 0;
            for (int i2 = 0; i2 < i; i2++) {
                lineEnd = getLayout().getLineEnd(i2);
                if (lineEnd == this.initialText.length()) {
                    return this.initialText;
                }
            }
            String strSubstring = this.initialText.substring(0, lineEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        } catch (Exception e) {
            e.printStackTrace();
            return this.initialText;
        }
    }

    public final void u() {
        int maxLines = this.mCollapsedLines;
        if (maxLines < Integer.MAX_VALUE) {
            int i = this.expandType;
            if (i != 0) {
                if (i != 1) {
                    maxLines = getMaxLines();
                }
            } else if (this.isExpanded) {
                maxLines = Integer.MAX_VALUE;
            }
            setMaxLines(maxLines);
        }
    }

    public final boolean v(String str) {
        return Intrinsics.areEqual(str, getText());
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final ExpandableTextView x(int animationDuration) {
        this.mAnimationDuration = Integer.valueOf(animationDuration);
        return this;
    }

    public final ExpandableTextView y(int ellipsizeTextColor) {
        this.mEllipsizeTextColor = Integer.valueOf(ellipsizeTextColor);
        return this;
    }

    public final ExpandableTextView z(int expandType) {
        this.expandType = expandType;
        return this;
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? yy4.a : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mOriginalText = "";
        String str = "Read more";
        this.mReadMoreText = "Read more";
        String str2 = "Read less";
        this.mReadLessText = "Read less";
        this.mAnimationDuration = 0;
        this.foregroundColor = 0;
        this.initialText = "";
        this.isUnderlined = Boolean.FALSE;
        this.mEllipsizeTextColor = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, t15.Q);
        try {
            this.mCollapsedLines = typedArrayObtainStyledAttributes.getInt(t15.S, IntCompanionObject.MAX_VALUE);
            this.mAnimationDuration = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(t15.R, 450));
            String string = typedArrayObtainStyledAttributes.getString(t15.Z);
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.styleable.Ex…eadMoreText) ?: READ_MORE");
                str = string;
            }
            this.mReadMoreText = str;
            String string2 = typedArrayObtainStyledAttributes.getString(t15.Y);
            if (string2 != null) {
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.styleable.Ex…eadLessText) ?: READ_LESS");
                str2 = string2;
            }
            this.mReadLessText = str2;
            this.foregroundColor = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(t15.V, 0));
            this.isUnderlined = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(t15.X, false));
            this.isExpanded = typedArrayObtainStyledAttributes.getBoolean(t15.W, false);
            this.mEllipsizeTextColor = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(t15.T, -16776961));
            this.expandType = typedArrayObtainStyledAttributes.getInt(t15.U, 0);
            typedArrayObtainStyledAttributes.recycle();
            u();
            setOnClickListener(this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
