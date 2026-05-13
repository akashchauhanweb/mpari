package com.kizitonwose.calendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendarview.ui.CalendarLayoutManager;
import com.zepto.aa0;
import com.zepto.ax3;
import com.zepto.ba0;
import com.zepto.dy2;
import com.zepto.e36;
import com.zepto.e43;
import com.zepto.ge1;
import com.zepto.he1;
import com.zepto.hj4;
import com.zepto.jq7;
import com.zepto.m43;
import com.zepto.n15;
import com.zepto.r90;
import com.zepto.rp5;
import com.zepto.w90;
import com.zepto.y90;
import com.zepto.yw3;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002¨\u0001\b\u0016\u0018\u0000 Ì\u00012\u00020\u0001:\u0002Í\u0001B\u001e\b\u0016\u0012\b\u0010È\u0001\u001a\u00030Ç\u0001\u0012\u0007\u0010É\u0001\u001a\u00020\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0014J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007J\u001e\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u0007H\u0014R6\u0010+\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"j\u0004\u0018\u0001`$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00103\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R*\u0010;\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R.\u0010C\u001a\u0004\u0018\u00010<2\b\u0010,\u001a\u0004\u0018\u00010<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR0\u0010I\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\bD\u0010.\u0012\u0004\bG\u0010H\u001a\u0004\bE\u00100\"\u0004\bF\u00102R*\u0010Q\u001a\u00020J2\u0006\u0010,\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Y\u001a\u00020R2\u0006\u0010,\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010a\u001a\u00020Z2\u0006\u0010,\u001a\u00020Z8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010e\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010.\u001a\u0004\bc\u00100\"\u0004\bd\u00102R*\u0010m\u001a\u00020f2\u0006\u0010,\u001a\u00020f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010.\u001a\u0004\bo\u00100\"\u0004\bp\u00102R\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010wR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010hR\u0016\u0010~\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010.R\u0017\u0010\u0080\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010hR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010hR3\u0010\u008e\u0001\u001a\u00030\u0087\u00012\u0007\u0010,\u001a\u00030\u0087\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R(\u0010\u0092\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010.\u001a\u0005\b\u0091\u0001\u00100R(\u0010\u0095\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010.\u001a\u0005\b\u0094\u0001\u00100R(\u0010\u0098\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010.\u001a\u0005\b\u0097\u0001\u00100R(\u0010\u009b\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010.\u001a\u0005\b\u009a\u0001\u00100R(\u0010\u009e\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010.\u001a\u0005\b\u009d\u0001\u00100R(\u0010¡\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010.\u001a\u0005\b \u0001\u00100R(\u0010¤\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b¢\u0001\u0010.\u001a\u0005\b£\u0001\u00100R(\u0010§\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0005\b¥\u0001\u0010.\u001a\u0005\b¦\u0001\u00100R\u0018\u0010«\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R?\u0010µ\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010´\u00012\r\u0010,\u001a\t\u0012\u0002\b\u0003\u0018\u00010´\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R?\u0010¼\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010»\u00012\r\u0010,\u001a\t\u0012\u0002\b\u0003\u0018\u00010»\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R?\u0010Â\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010»\u00012\r\u0010,\u001a\t\u0012\u0002\b\u0003\u0018\u00010»\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010½\u0001\u001a\u0006\bÃ\u0001\u0010¿\u0001\"\u0006\bÄ\u0001\u0010Á\u0001R\u0016\u0010Æ\u0001\u001a\u00020f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010j¨\u0006Î\u0001"}, d2 = {"Lcom/kizitonwose/calendarview/CalendarView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "", "B1", "K1", "C1", "Lcom/zepto/yw3;", "config", "I1", "monthConfig", "A1", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Lcom/zepto/w90;", "day", "G1", "Ljava/time/LocalDate;", "date", "Lcom/zepto/he1;", "owner", "E1", "Ljava/time/YearMonth;", "startMonth", "endMonth", "Ljava/time/DayOfWeek;", "firstDayOfWeek", "H1", "onDetachedFromWindow", "Lkotlin/Function1;", "Lcom/zepto/y90;", "Lcom/kizitonwose/calendarview/ui/MonthScrollListener;", "J0", "Lkotlin/jvm/functions/Function1;", "getMonthScrollListener", "()Lkotlin/jvm/functions/Function1;", "setMonthScrollListener", "(Lkotlin/jvm/functions/Function1;)V", "monthScrollListener", "value", "K0", "I", "getDayViewResource", "()I", "setDayViewResource", "(I)V", "dayViewResource", "L0", "getMonthHeaderResource", "setMonthHeaderResource", "monthHeaderResource", "M0", "getMonthFooterResource", "setMonthFooterResource", "monthFooterResource", "", "N0", "Ljava/lang/String;", "getMonthViewClass", "()Ljava/lang/String;", "setMonthViewClass", "(Ljava/lang/String;)V", "monthViewClass", "O0", "getOrientation", "setOrientation", "getOrientation$annotations", "()V", "orientation", "Lcom/zepto/rp5;", "P0", "Lcom/zepto/rp5;", "getScrollMode", "()Lcom/zepto/rp5;", "setScrollMode", "(Lcom/zepto/rp5;)V", "scrollMode", "Lcom/zepto/dy2;", "Q0", "Lcom/zepto/dy2;", "getInDateStyle", "()Lcom/zepto/dy2;", "setInDateStyle", "(Lcom/zepto/dy2;)V", "inDateStyle", "Lcom/zepto/hj4;", "R0", "Lcom/zepto/hj4;", "getOutDateStyle", "()Lcom/zepto/hj4;", "setOutDateStyle", "(Lcom/zepto/hj4;)V", "outDateStyle", "S0", "getMaxRowCount", "setMaxRowCount", "maxRowCount", "", "T0", "Z", "getHasBoundaries", "()Z", "setHasBoundaries", "(Z)V", "hasBoundaries", "U0", "getWrappedPageHeightAnimationDuration", "setWrappedPageHeightAnimationDuration", "wrappedPageHeightAnimationDuration", "Lcom/zepto/ba0;", "V0", "Lcom/zepto/ba0;", "pagerSnapHelper", "W0", "Ljava/time/YearMonth;", "X0", "Y0", "Ljava/time/DayOfWeek;", "Z0", "autoSize", "a1", "autoSizeHeight", "b1", "sizedInternally", "Lcom/zepto/e43;", "c1", "Lcom/zepto/e43;", "configJob", "d1", "internalConfigUpdate", "Lcom/zepto/e36;", "e1", "Lcom/zepto/e36;", "getDaySize", "()Lcom/zepto/e36;", "setDaySize", "(Lcom/zepto/e36;)V", "daySize", "<set-?>", "f1", "getMonthPaddingStart", "monthPaddingStart", "g1", "getMonthPaddingEnd", "monthPaddingEnd", "h1", "getMonthPaddingTop", "monthPaddingTop", "i1", "getMonthPaddingBottom", "monthPaddingBottom", "j1", "getMonthMarginStart", "monthMarginStart", "k1", "getMonthMarginEnd", "monthMarginEnd", "l1", "getMonthMarginTop", "monthMarginTop", "m1", "getMonthMarginBottom", "monthMarginBottom", "com/zepto/aa0", "n1", "Lcom/zepto/aa0;", "scrollListenerInternal", "Lcom/kizitonwose/calendarview/ui/CalendarLayoutManager;", "getCalendarLayoutManager", "()Lcom/kizitonwose/calendarview/ui/CalendarLayoutManager;", "calendarLayoutManager", "Lcom/zepto/r90;", "getCalendarAdapter", "()Lcom/zepto/r90;", "calendarAdapter", "Lcom/zepto/ge1;", "dayBinder", "Lcom/zepto/ge1;", "getDayBinder", "()Lcom/zepto/ge1;", "setDayBinder", "(Lcom/zepto/ge1;)V", "Lcom/zepto/ax3;", "monthHeaderBinder", "Lcom/zepto/ax3;", "getMonthHeaderBinder", "()Lcom/zepto/ax3;", "setMonthHeaderBinder", "(Lcom/zepto/ax3;)V", "monthFooterBinder", "getMonthFooterBinder", "setMonthFooterBinder", "D1", "isVertical", "Landroid/content/Context;", "context", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p1", "a", "com.github.kizitonwose.CalendarView"}, k = 1, mv = {1, 4, 2})
public class CalendarView extends RecyclerView {

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public Function1 monthScrollListener;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public int dayViewResource;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public int monthHeaderResource;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public int monthFooterResource;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public String monthViewClass;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public int orientation;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public rp5 scrollMode;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public dy2 inDateStyle;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public hj4 outDateStyle;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public int maxRowCount;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public boolean hasBoundaries;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public int wrappedPageHeightAnimationDuration;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public final ba0 pagerSnapHelper;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public YearMonth startMonth;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public YearMonth endMonth;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public DayOfWeek firstDayOfWeek;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public boolean autoSize;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public int autoSizeHeight;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public boolean sizedInternally;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public e43 configJob;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public boolean internalConfigUpdate;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public e36 daySize;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public int monthPaddingStart;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public int monthPaddingEnd;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public int monthPaddingTop;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    public int monthPaddingBottom;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public int monthMarginStart;

    /* JADX INFO: renamed from: k1, reason: from kotlin metadata */
    public int monthMarginEnd;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    public int monthMarginTop;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public int monthMarginBottom;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    public final aa0 scrollListenerInternal;
    public static final e36 o1 = new e36(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);

    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CalendarView.this.getCalendarAdapter().K();
        }
    }

    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CalendarView.this.getCalendarAdapter().K();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.orientation = 1;
        this.scrollMode = rp5.CONTINUOUS;
        this.inDateStyle = dy2.ALL_MONTHS;
        this.outDateStyle = hj4.END_OF_ROW;
        this.maxRowCount = 6;
        this.hasBoundaries = true;
        this.wrappedPageHeightAnimationDuration = 200;
        this.pagerSnapHelper = new ba0();
        this.autoSize = true;
        this.autoSizeHeight = IntCompanionObject.MIN_VALUE;
        this.daySize = o1;
        this.scrollListenerInternal = new aa0(this);
        B1(attrs, 0, 0);
    }

    public static /* synthetic */ void F1(CalendarView calendarView, LocalDate localDate, he1 he1Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyDateChanged");
        }
        if ((i & 2) != 0) {
            he1Var = he1.THIS_MONTH;
        }
        calendarView.E1(localDate, he1Var);
    }

    public static /* synthetic */ void J1(CalendarView calendarView, yw3 yw3Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAdapterMonthConfig");
        }
        if ((i & 1) != 0) {
            yw3Var = null;
        }
        calendarView.I1(yw3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r90 getCalendarAdapter() {
        RecyclerView.h adapter = getAdapter();
        if (adapter != null) {
            return (r90) adapter;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.CalendarAdapter");
    }

    private final CalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager != null) {
            return (CalendarLayoutManager) layoutManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.kizitonwose.calendarview.ui.CalendarLayoutManager");
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public final void A1(yw3 monthConfig) {
        a1(this.scrollListenerInternal);
        k(this.scrollListenerInternal);
        setLayoutManager(new CalendarLayoutManager(this, this.orientation));
        setAdapter(new r90(this, new jq7(this.dayViewResource, this.monthHeaderResource, this.monthFooterResource, this.monthViewClass), monthConfig));
    }

    public final void B1(AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        if (isInEditMode()) {
            return;
        }
        setHasFixedSize(true);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] iArr = n15.a;
        Intrinsics.checkNotNullExpressionValue(iArr, "R.styleable.CalendarView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setDayViewResource(typedArrayObtainStyledAttributes.getResourceId(n15.b, this.dayViewResource));
        setMonthHeaderResource(typedArrayObtainStyledAttributes.getResourceId(n15.g, this.monthHeaderResource));
        setMonthFooterResource(typedArrayObtainStyledAttributes.getResourceId(n15.f, this.monthFooterResource));
        setOrientation(typedArrayObtainStyledAttributes.getInt(n15.i, this.orientation));
        setScrollMode(rp5.values()[typedArrayObtainStyledAttributes.getInt(n15.k, this.scrollMode.ordinal())]);
        setOutDateStyle(hj4.values()[typedArrayObtainStyledAttributes.getInt(n15.j, this.outDateStyle.ordinal())]);
        setInDateStyle(dy2.values()[typedArrayObtainStyledAttributes.getInt(n15.d, this.inDateStyle.ordinal())]);
        setMaxRowCount(typedArrayObtainStyledAttributes.getInt(n15.e, this.maxRowCount));
        setMonthViewClass(typedArrayObtainStyledAttributes.getString(n15.h));
        setHasBoundaries(typedArrayObtainStyledAttributes.getBoolean(n15.c, this.hasBoundaries));
        this.wrappedPageHeightAnimationDuration = typedArrayObtainStyledAttributes.getInt(n15.l, this.wrappedPageHeightAnimationDuration);
        typedArrayObtainStyledAttributes.recycle();
        if (!(this.dayViewResource != 0)) {
            throw new IllegalStateException("No value set for `cv_dayViewResource` attribute.".toString());
        }
    }

    public final void C1() {
        if (this.internalConfigUpdate || getAdapter() == null || getLayoutManager() == null) {
            return;
        }
        RecyclerView.p layoutManager = getLayoutManager();
        Parcelable parcelableJ1 = layoutManager != null ? layoutManager.j1() : null;
        setAdapter(getAdapter());
        RecyclerView.p layoutManager2 = getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.i1(parcelableJ1);
        }
        post(new b());
    }

    public final boolean D1() {
        return this.orientation == 1;
    }

    public final void E1(LocalDate date, he1 owner) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(owner, "owner");
        G1(new w90(date, owner));
    }

    public final void G1(w90 day) {
        Intrinsics.checkNotNullParameter(day, "day");
        getCalendarAdapter().O(day);
    }

    public final void H1(YearMonth startMonth, YearMonth endMonth, DayOfWeek firstDayOfWeek) {
        Intrinsics.checkNotNullParameter(startMonth, "startMonth");
        Intrinsics.checkNotNullParameter(endMonth, "endMonth");
        Intrinsics.checkNotNullParameter(firstDayOfWeek, "firstDayOfWeek");
        e43 e43Var = this.configJob;
        if (e43Var != null) {
            e43.a.a(e43Var, null, 1, null);
        }
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.firstDayOfWeek = firstDayOfWeek;
        A1(new yw3(this.outDateStyle, this.inDateStyle, this.maxRowCount, startMonth, endMonth, firstDayOfWeek, this.hasBoundaries, m43.b(null, 1, null)));
    }

    public final void I1(yw3 config) {
        YearMonth yearMonth;
        DayOfWeek dayOfWeek;
        if (this.internalConfigUpdate || getAdapter() == null) {
            return;
        }
        r90 calendarAdapter = getCalendarAdapter();
        if (config == null) {
            hj4 hj4Var = this.outDateStyle;
            dy2 dy2Var = this.inDateStyle;
            int i = this.maxRowCount;
            YearMonth yearMonth2 = this.startMonth;
            if (yearMonth2 == null || (yearMonth = this.endMonth) == null || (dayOfWeek = this.firstDayOfWeek) == null) {
                return;
            } else {
                config = new yw3(hj4Var, dy2Var, i, yearMonth2, yearMonth, dayOfWeek, this.hasBoundaries, m43.b(null, 1, null));
            }
        }
        calendarAdapter.P(config);
        getCalendarAdapter().j();
        post(new c());
    }

    public final void K1() {
        if (getAdapter() != null) {
            getCalendarAdapter().Q(new jq7(this.dayViewResource, this.monthHeaderResource, this.monthFooterResource, this.monthViewClass));
            C1();
        }
    }

    public final ge1 getDayBinder() {
        return null;
    }

    public final e36 getDaySize() {
        return this.daySize;
    }

    public final int getDayViewResource() {
        return this.dayViewResource;
    }

    public final boolean getHasBoundaries() {
        return this.hasBoundaries;
    }

    public final dy2 getInDateStyle() {
        return this.inDateStyle;
    }

    public final int getMaxRowCount() {
        return this.maxRowCount;
    }

    public final ax3 getMonthFooterBinder() {
        return null;
    }

    public final int getMonthFooterResource() {
        return this.monthFooterResource;
    }

    public final ax3 getMonthHeaderBinder() {
        return null;
    }

    public final int getMonthHeaderResource() {
        return this.monthHeaderResource;
    }

    public final int getMonthMarginBottom() {
        return this.monthMarginBottom;
    }

    public final int getMonthMarginEnd() {
        return this.monthMarginEnd;
    }

    public final int getMonthMarginStart() {
        return this.monthMarginStart;
    }

    public final int getMonthMarginTop() {
        return this.monthMarginTop;
    }

    public final int getMonthPaddingBottom() {
        return this.monthPaddingBottom;
    }

    public final int getMonthPaddingEnd() {
        return this.monthPaddingEnd;
    }

    public final int getMonthPaddingStart() {
        return this.monthPaddingStart;
    }

    public final int getMonthPaddingTop() {
        return this.monthPaddingTop;
    }

    public final Function1<y90, Unit> getMonthScrollListener() {
        return this.monthScrollListener;
    }

    public final String getMonthViewClass() {
        return this.monthViewClass;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final hj4 getOutDateStyle() {
        return this.outDateStyle;
    }

    public final rp5 getScrollMode() {
        return this.scrollMode;
    }

    public final int getWrappedPageHeightAnimationDuration() {
        return this.wrappedPageHeightAnimationDuration;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e43 e43Var = this.configJob;
        if (e43Var != null) {
            e43.a.a(e43Var, null, 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.autoSize && !isInEditMode()) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
            if (mode == 0 && mode2 == 0) {
                throw new UnsupportedOperationException("Cannot calculate the values for day Width/Height with the current configuration.");
            }
            int i = (int) (((double) ((size - (this.monthPaddingStart + this.monthPaddingEnd)) / 7.0f)) + 0.5d);
            int i2 = this.autoSizeHeight;
            if (i2 == Integer.MIN_VALUE) {
                i2 = i;
            }
            e36 e36VarA = this.daySize.a(i, i2);
            if (!Intrinsics.areEqual(this.daySize, e36VarA)) {
                this.sizedInternally = true;
                setDaySize(e36VarA);
                this.sizedInternally = false;
                C1();
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setDayBinder(ge1 ge1Var) {
        C1();
    }

    public final void setDaySize(e36 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.daySize = value;
        if (this.sizedInternally) {
            return;
        }
        this.autoSize = Intrinsics.areEqual(value, o1) || value.c() == Integer.MIN_VALUE;
        this.autoSizeHeight = value.b();
        C1();
    }

    public final void setDayViewResource(int i) {
        if (this.dayViewResource != i) {
            if (i == 0) {
                throw new IllegalArgumentException("'dayViewResource' attribute not provided.");
            }
            this.dayViewResource = i;
            K1();
        }
    }

    public final void setHasBoundaries(boolean z) {
        if (this.hasBoundaries != z) {
            this.hasBoundaries = z;
            J1(this, null, 1, null);
        }
    }

    public final void setInDateStyle(dy2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.inDateStyle != value) {
            this.inDateStyle = value;
            J1(this, null, 1, null);
        }
    }

    public final void setMaxRowCount(int i) {
        if (!new IntRange(1, 6).contains(i)) {
            throw new IllegalArgumentException("'maxRowCount' should be between 1 to 6");
        }
        if (this.maxRowCount != i) {
            this.maxRowCount = i;
            J1(this, null, 1, null);
        }
    }

    public final void setMonthFooterBinder(ax3 ax3Var) {
        C1();
    }

    public final void setMonthFooterResource(int i) {
        if (this.monthFooterResource != i) {
            this.monthFooterResource = i;
            K1();
        }
    }

    public final void setMonthHeaderBinder(ax3 ax3Var) {
        C1();
    }

    public final void setMonthHeaderResource(int i) {
        if (this.monthHeaderResource != i) {
            this.monthHeaderResource = i;
            K1();
        }
    }

    public final void setMonthScrollListener(Function1<? super y90, Unit> function1) {
        this.monthScrollListener = function1;
    }

    public final void setMonthViewClass(String str) {
        if (!Intrinsics.areEqual(this.monthViewClass, str)) {
            this.monthViewClass = str;
            K1();
        }
    }

    public final void setOrientation(int i) {
        YearMonth yearMonth;
        DayOfWeek dayOfWeek;
        if (this.orientation != i) {
            this.orientation = i;
            YearMonth yearMonth2 = this.startMonth;
            if (yearMonth2 == null || (yearMonth = this.endMonth) == null || (dayOfWeek = this.firstDayOfWeek) == null) {
                return;
            }
            H1(yearMonth2, yearMonth, dayOfWeek);
        }
    }

    public final void setOutDateStyle(hj4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.outDateStyle != value) {
            this.outDateStyle = value;
            J1(this, null, 1, null);
        }
    }

    public final void setScrollMode(rp5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.scrollMode != value) {
            this.scrollMode = value;
            this.pagerSnapHelper.b(value == rp5.PAGED ? this : null);
        }
    }

    public final void setWrappedPageHeightAnimationDuration(int i) {
        this.wrappedPageHeightAnimationDuration = i;
    }
}
