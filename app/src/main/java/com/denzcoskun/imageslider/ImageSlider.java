package com.denzcoskun.imageslider;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.zepto.f36;
import com.zepto.ir7;
import com.zepto.j15;
import com.zepto.n05;
import com.zepto.oz4;
import com.zepto.t23;
import com.zepto.u23;
import com.zepto.wi6;
import com.zepto.xz4;
import com.zepto.yy0;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010K\u001a\u00020J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L\u0012\b\b\u0002\u0010N\u001a\u00020\u0018¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0018H\u0002R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0016\u0010:\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010.R\u0016\u0010=\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010.R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010.R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006Q"}, d2 = {"Lcom/denzcoskun/imageslider/ImageSlider;", "Landroid/widget/RelativeLayout;", "", "period", "", "j", "", "Lcom/zepto/f36;", "imageList", "setImageList", "changeablePeriod", "k", "m", "Lcom/zepto/u23;", "itemClickListener", "setItemClickListener", "Lcom/zepto/t23;", "itemChangeListener", "setItemChangeListener", "Lcom/zepto/wi6;", "touchListener", "setTouchListener", "", "textAlign", "", "i", "size", "setupDots", "Landroidx/viewpager/widget/ViewPager;", "a", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "pagerDots", "Lcom/zepto/ir7;", "c", "Lcom/zepto/ir7;", "viewPagerAdapter", "", "Landroid/widget/ImageView;", "d", "[Landroid/widget/ImageView;", "dots", "e", "I", "currentPage", "f", "imageCount", "g", "cornerRadius", "h", "J", "delay", "", "Z", "autoCycle", "selectedDot", "l", "unselectedDot", "errorImage", "n", "placeholder", "o", "titleBackground", "p", "Ljava/lang/String;", "q", "indicatorAlign", "Ljava/util/Timer;", "r", "Ljava/util/Timer;", "swipeTimer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageslider_release"}, k = 1, mv = {1, 4, 0})
public final class ImageSlider extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ViewPager viewPager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout pagerDots;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ir7 viewPagerAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView[] dots;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int currentPage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int imageCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int cornerRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long period;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long delay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean autoCycle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int selectedDot;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int unselectedDot;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int errorImage;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int placeholder;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int titleBackground;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String textAlign;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public String indicatorAlign;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public Timer swipeTimer;

    public static final class a extends TimerTask {
        public final /* synthetic */ Handler c;
        public final /* synthetic */ Runnable e;

        public a(Handler handler, Runnable runnable) {
            this.c = handler;
            this.e = runnable;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.c.post(this.e);
        }
    }

    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ImageSlider.this.currentPage == ImageSlider.this.imageCount) {
                ImageSlider.this.currentPage = 0;
            }
            ViewPager viewPager = ImageSlider.this.viewPager;
            if (viewPager == null) {
                Intrinsics.throwNpe();
            }
            ImageSlider imageSlider = ImageSlider.this;
            int i = imageSlider.currentPage;
            imageSlider.currentPage = i + 1;
            viewPager.J(i, true);
        }
    }

    public static final class c implements ViewPager.i {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i) {
            ImageSlider.this.currentPage = i;
            ImageView[] imageViewArr = ImageSlider.this.dots;
            if (imageViewArr == null) {
                Intrinsics.throwNpe();
            }
            for (ImageView imageView : imageViewArr) {
                if (imageView == null) {
                    Intrinsics.throwNpe();
                }
                imageView.setImageDrawable(yy0.e(ImageSlider.this.getContext(), ImageSlider.this.unselectedDot));
            }
            ImageView[] imageViewArr2 = ImageSlider.this.dots;
            if (imageViewArr2 == null) {
                Intrinsics.throwNpe();
            }
            ImageView imageView2 = imageViewArr2[i];
            if (imageView2 == null) {
                Intrinsics.throwNpe();
            }
            imageView2.setImageDrawable(yy0.e(ImageSlider.this.getContext(), ImageSlider.this.selectedDot));
            ImageSlider.d(ImageSlider.this);
        }
    }

    @JvmOverloads
    public ImageSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static final /* synthetic */ t23 d(ImageSlider imageSlider) {
        imageSlider.getClass();
        return null;
    }

    public static /* synthetic */ void l(ImageSlider imageSlider, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = imageSlider.period;
        }
        imageSlider.k(j);
    }

    private final void setupDots(int size) {
        System.out.println((Object) this.indicatorAlign);
        LinearLayout linearLayout = this.pagerDots;
        if (linearLayout == null) {
            Intrinsics.throwNpe();
        }
        linearLayout.setGravity(i(this.indicatorAlign));
        LinearLayout linearLayout2 = this.pagerDots;
        if (linearLayout2 == null) {
            Intrinsics.throwNpe();
        }
        linearLayout2.removeAllViews();
        this.dots = new ImageView[size];
        for (int i = 0; i < size; i++) {
            ImageView[] imageViewArr = this.dots;
            if (imageViewArr == null) {
                Intrinsics.throwNpe();
            }
            imageViewArr[i] = new ImageView(getContext());
            ImageView[] imageViewArr2 = this.dots;
            if (imageViewArr2 == null) {
                Intrinsics.throwNpe();
            }
            ImageView imageView = imageViewArr2[i];
            if (imageView == null) {
                Intrinsics.throwNpe();
            }
            imageView.setImageDrawable(yy0.e(getContext(), this.unselectedDot));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 0, 8, 0);
            LinearLayout linearLayout3 = this.pagerDots;
            if (linearLayout3 == null) {
                Intrinsics.throwNpe();
            }
            ImageView[] imageViewArr3 = this.dots;
            if (imageViewArr3 == null) {
                Intrinsics.throwNpe();
            }
            linearLayout3.addView(imageViewArr3[i], layoutParams);
        }
        ImageView[] imageViewArr4 = this.dots;
        if (imageViewArr4 == null) {
            Intrinsics.throwNpe();
        }
        ImageView imageView2 = imageViewArr4[0];
        if (imageView2 == null) {
            Intrinsics.throwNpe();
        }
        imageView2.setImageDrawable(yy0.e(getContext(), this.selectedDot));
        ViewPager viewPager = this.viewPager;
        if (viewPager == null) {
            Intrinsics.throwNpe();
        }
        viewPager.b(new c());
    }

    public final int i(String textAlign) {
        Intrinsics.checkParameterIsNotNull(textAlign, "textAlign");
        int iHashCode = textAlign.hashCode();
        if (iHashCode != 2332679) {
            if (iHashCode == 77974012 && textAlign.equals("RIGHT")) {
                return 5;
            }
        } else if (textAlign.equals("LEFT")) {
            return 3;
        }
        return 17;
    }

    public final void j(long period) {
        Handler handler = new Handler();
        b bVar = new b();
        Timer timer = new Timer();
        this.swipeTimer = timer;
        timer.schedule(new a(handler, bVar), this.delay, period);
    }

    public final void k(long changeablePeriod) {
        m();
        j(changeablePeriod);
    }

    public final void m() {
        this.swipeTimer.cancel();
        this.swipeTimer.purge();
    }

    public final void setImageList(List<f36> imageList) {
        Intrinsics.checkParameterIsNotNull(imageList, "imageList");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.viewPagerAdapter = new ir7(context, imageList, this.cornerRadius, this.errorImage, this.placeholder, this.titleBackground, this.textAlign);
        ViewPager viewPager = this.viewPager;
        if (viewPager == null) {
            Intrinsics.throwNpe();
        }
        viewPager.setAdapter(this.viewPagerAdapter);
        this.imageCount = imageList.size();
        if (!imageList.isEmpty()) {
            setupDots(imageList.size());
            if (this.autoCycle) {
                m();
                l(this, 0L, 1, null);
            }
        }
    }

    public final void setItemChangeListener(t23 itemChangeListener) {
        Intrinsics.checkParameterIsNotNull(itemChangeListener, "itemChangeListener");
    }

    public final void setItemClickListener(u23 itemClickListener) {
        Intrinsics.checkParameterIsNotNull(itemClickListener, "itemClickListener");
        ir7 ir7Var = this.viewPagerAdapter;
        if (ir7Var != null) {
            ir7Var.s(itemClickListener);
        }
    }

    public final void setTouchListener(wi6 touchListener) {
        Intrinsics.checkParameterIsNotNull(touchListener, "touchListener");
        ir7 ir7Var = this.viewPagerAdapter;
        if (ir7Var == null) {
            Intrinsics.throwNpe();
        }
        ir7Var.t(touchListener);
    }

    public /* synthetic */ ImageSlider(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.textAlign = "LEFT";
        this.indicatorAlign = "CENTER";
        this.swipeTimer = new Timer();
        LayoutInflater.from(getContext()).inflate(n05.a, (ViewGroup) this, true);
        this.viewPager = (ViewPager) findViewById(xz4.e);
        this.pagerDots = (LinearLayout) findViewById(xz4.c);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j15.R, i, i);
        this.cornerRadius = typedArrayObtainStyledAttributes.getInt(j15.T, 1);
        this.period = typedArrayObtainStyledAttributes.getInt(j15.X, 1000);
        this.delay = typedArrayObtainStyledAttributes.getInt(j15.U, 1000);
        this.autoCycle = typedArrayObtainStyledAttributes.getBoolean(j15.S, false);
        this.placeholder = typedArrayObtainStyledAttributes.getResourceId(j15.Y, oz4.e);
        this.errorImage = typedArrayObtainStyledAttributes.getResourceId(j15.V, oz4.c);
        this.selectedDot = typedArrayObtainStyledAttributes.getResourceId(j15.Z, oz4.a);
        this.unselectedDot = typedArrayObtainStyledAttributes.getResourceId(j15.c0, oz4.b);
        this.titleBackground = typedArrayObtainStyledAttributes.getResourceId(j15.b0, oz4.d);
        int i2 = j15.a0;
        if (typedArrayObtainStyledAttributes.getString(i2) != null) {
            String string = typedArrayObtainStyledAttributes.getString(i2);
            Intrinsics.checkExpressionValueIsNotNull(string, "typedArray.getString(R.s…ageSlider_iss_text_align)");
            this.textAlign = string;
        }
        int i3 = j15.W;
        if (typedArrayObtainStyledAttributes.getString(i3) != null) {
            String string2 = typedArrayObtainStyledAttributes.getString(i3);
            Intrinsics.checkExpressionValueIsNotNull(string2, "typedArray.getString(R.s…ider_iss_indicator_align)");
            this.indicatorAlign = string2;
        }
    }
}
