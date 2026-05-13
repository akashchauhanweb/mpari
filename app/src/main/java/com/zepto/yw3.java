package com.zepto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class yw3 {
    public final List a;
    public final hj4 b;
    public final dy2 c;
    public final int d;
    public final YearMonth e;
    public final YearMonth f;
    public final DayOfWeek g;
    public final boolean h;
    public final e43 i;
    public static final a k = new a(null);
    public static final jt0 j = m43.b(null, 1, null);

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.yw3$a$a, reason: collision with other inner class name */
        public static final class C0132a extends Lambda implements Function1 {
            public final /* synthetic */ Ref.ObjectRef c;
            public final /* synthetic */ Ref.IntRef e;
            public final /* synthetic */ int f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0132a(Ref.ObjectRef objectRef, Ref.IntRef intRef, int i) {
                super(1);
                this.c = objectRef;
                this.e = intRef;
                this.f = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y90 invoke(List monthDays) {
                Intrinsics.checkNotNullParameter(monthDays, "monthDays");
                YearMonth yearMonth = (YearMonth) this.c.element;
                List list = CollectionsKt___CollectionsKt.toList(monthDays);
                Ref.IntRef intRef = this.e;
                int i = intRef.element;
                intRef.element = i + 1;
                return new y90(yearMonth, list, i, this.f);
            }
        }

        public static final class b extends Lambda implements Function1 {
            public final /* synthetic */ hj4 c;
            public final /* synthetic */ int e;
            public final /* synthetic */ List f;
            public final /* synthetic */ YearMonth g;
            public final /* synthetic */ int h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(hj4 hj4Var, int i, List list, YearMonth yearMonth, int i2) {
                super(1);
                this.c = hj4Var;
                this.e = i;
                this.f = list;
                this.g = yearMonth;
                this.h = i2;
            }

            public final boolean a(List ephemeralMonthWeeks) {
                Intrinsics.checkNotNullParameter(ephemeralMonthWeeks, "ephemeralMonthWeeks");
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ephemeralMonthWeeks);
                if ((((List) CollectionsKt___CollectionsKt.last(mutableList)).size() < 7 && this.c == hj4.END_OF_ROW) || this.c == hj4.END_OF_GRID) {
                    List list = (List) CollectionsKt___CollectionsKt.last(mutableList);
                    w90 w90Var = (w90) CollectionsKt___CollectionsKt.last(list);
                    IntRange intRange = new IntRange(1, 7 - list.size());
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                    Iterator<Integer> it = intRange.iterator();
                    while (it.hasNext()) {
                        LocalDate localDatePlusDays = w90Var.b().plusDays(((IntIterator) it).nextInt());
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "lastDay.date.plusDays(it.toLong())");
                        arrayList.add(new w90(localDatePlusDays, he1.NEXT_MONTH));
                    }
                    mutableList.set(CollectionsKt__CollectionsKt.getLastIndex(mutableList), CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList));
                }
                while (true) {
                    if ((mutableList.size() >= this.e || this.c != hj4.END_OF_GRID) && !(mutableList.size() == this.e && ((List) CollectionsKt___CollectionsKt.last(mutableList)).size() < 7 && this.c == hj4.END_OF_GRID)) {
                        break;
                    }
                    w90 w90Var2 = (w90) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last(mutableList));
                    IntRange intRange2 = new IntRange(1, 7);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10));
                    Iterator<Integer> it2 = intRange2.iterator();
                    while (it2.hasNext()) {
                        LocalDate localDatePlusDays2 = w90Var2.b().plusDays(((IntIterator) it2).nextInt());
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "lastDay.date.plusDays(it.toLong())");
                        arrayList2.add(new w90(localDatePlusDays2, he1.NEXT_MONTH));
                    }
                    if (((List) CollectionsKt___CollectionsKt.last(mutableList)).size() < 7) {
                        mutableList.set(CollectionsKt__CollectionsKt.getLastIndex(mutableList), CollectionsKt___CollectionsKt.take(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.last(mutableList), (Iterable) arrayList2), 7));
                    } else {
                        mutableList.add(arrayList2);
                    }
                }
                List list2 = this.f;
                return list2.add(new y90(this.g, mutableList, list2.size(), this.h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((List) obj));
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v18, types: [T, java.time.YearMonth] */
        public final List a(YearMonth startMonth, YearMonth endMonth, DayOfWeek firstDayOfWeek, int i, dy2 inDateStyle, hj4 outDateStyle, e43 job) {
            boolean zAreEqual;
            Intrinsics.checkNotNullParameter(startMonth, "startMonth");
            Intrinsics.checkNotNullParameter(endMonth, "endMonth");
            Intrinsics.checkNotNullParameter(firstDayOfWeek, "firstDayOfWeek");
            Intrinsics.checkNotNullParameter(inDateStyle, "inDateStyle");
            Intrinsics.checkNotNullParameter(outDateStyle, "outDateStyle");
            Intrinsics.checkNotNullParameter(job, "job");
            ArrayList arrayList = new ArrayList();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = startMonth;
            while (((YearMonth) objectRef.element).compareTo(endMonth) <= 0 && job.isActive()) {
                int i2 = xw3.a[inDateStyle.ordinal()];
                if (i2 == 1) {
                    zAreEqual = true;
                } else if (i2 == 2) {
                    zAreEqual = Intrinsics.areEqual((YearMonth) objectRef.element, startMonth);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zAreEqual = false;
                }
                List listC = c((YearMonth) objectRef.element, firstDayOfWeek, zAreEqual, outDateStyle);
                ArrayList arrayList2 = new ArrayList();
                int iB = zw3.b(listC.size(), i);
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 0;
                arrayList2.addAll(CollectionsKt___CollectionsKt.chunked(listC, i, new C0132a(objectRef, intRef, iB)));
                arrayList.addAll(arrayList2);
                if (!(!Intrinsics.areEqual((YearMonth) objectRef.element, endMonth))) {
                    break;
                }
                objectRef.element = k72.a((YearMonth) objectRef.element);
            }
            return arrayList;
        }

        public final List b(YearMonth startMonth, YearMonth endMonth, DayOfWeek firstDayOfWeek, int i, dy2 inDateStyle, hj4 outDateStyle, e43 job) {
            boolean zAreEqual;
            Intrinsics.checkNotNullParameter(startMonth, "startMonth");
            Intrinsics.checkNotNullParameter(endMonth, "endMonth");
            Intrinsics.checkNotNullParameter(firstDayOfWeek, "firstDayOfWeek");
            Intrinsics.checkNotNullParameter(inDateStyle, "inDateStyle");
            Intrinsics.checkNotNullParameter(outDateStyle, "outDateStyle");
            Intrinsics.checkNotNullParameter(job, "job");
            ArrayList arrayList = new ArrayList();
            for (YearMonth yearMonthA = startMonth; yearMonthA.compareTo(endMonth) <= 0 && job.isActive(); yearMonthA = k72.a(yearMonthA)) {
                int i2 = xw3.b[inDateStyle.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    zAreEqual = Intrinsics.areEqual(yearMonthA, startMonth);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zAreEqual = false;
                }
                arrayList.addAll(CollectionsKt__IterablesKt.flatten(c(yearMonthA, firstDayOfWeek, zAreEqual, hj4.NONE)));
                if (!(!Intrinsics.areEqual(yearMonthA, endMonth))) {
                    break;
                }
            }
            List list = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.chunked(arrayList, 7));
            ArrayList arrayList2 = new ArrayList();
            CollectionsKt___CollectionsKt.chunked(list, i, new b(outDateStyle, i, arrayList2, startMonth, zw3.b(list.size(), i)));
            return arrayList2;
        }

        public final List c(YearMonth yearMonth, DayOfWeek firstDayOfWeek, boolean z, hj4 outDateStyle) {
            List mutableList;
            Intrinsics.checkNotNullParameter(yearMonth, "yearMonth");
            Intrinsics.checkNotNullParameter(firstDayOfWeek, "firstDayOfWeek");
            Intrinsics.checkNotNullParameter(outDateStyle, "outDateStyle");
            int year = yearMonth.getYear();
            int monthValue = yearMonth.getMonthValue();
            IntRange intRange = new IntRange(1, yearMonth.lengthOfMonth());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                LocalDate localDateOf = LocalDate.of(year, monthValue, ((IntIterator) it).nextInt());
                Intrinsics.checkNotNullExpressionValue(localDateOf, "LocalDate.of(year, month, it)");
                arrayList.add(new w90(localDateOf, he1.THIS_MONTH));
            }
            if (z) {
                TemporalField temporalFieldWeekOfMonth = WeekFields.of(firstDayOfWeek, 1).weekOfMonth();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayList) {
                    Integer numValueOf = Integer.valueOf(((w90) obj).b().get(temporalFieldWeekOfMonth));
                    Object arrayList2 = linkedHashMap.get(numValueOf);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList(linkedHashMap.values());
                List list = (List) CollectionsKt___CollectionsKt.first(mutableList);
                if (list.size() < 7) {
                    YearMonth previousMonth = yearMonth.minusMonths(1L);
                    List listTakeLast = CollectionsKt___CollectionsKt.takeLast(CollectionsKt___CollectionsKt.toList(new IntRange(1, previousMonth.lengthOfMonth())), 7 - list.size());
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTakeLast, 10));
                    Iterator it2 = listTakeLast.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        Intrinsics.checkNotNullExpressionValue(previousMonth, "previousMonth");
                        LocalDate localDateOf2 = LocalDate.of(previousMonth.getYear(), previousMonth.getMonth(), iIntValue);
                        Intrinsics.checkNotNullExpressionValue(localDateOf2, "LocalDate.of(previousMon… previousMonth.month, it)");
                        arrayList3.add(new w90(localDateOf2, he1.PREVIOUS_MONTH));
                    }
                    mutableList.set(0, CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) list));
                }
            } else {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.chunked(arrayList, 7));
            }
            if (outDateStyle == hj4.END_OF_ROW || outDateStyle == hj4.END_OF_GRID) {
                if (((List) CollectionsKt___CollectionsKt.last(mutableList)).size() < 7) {
                    List list2 = (List) CollectionsKt___CollectionsKt.last(mutableList);
                    w90 w90Var = (w90) CollectionsKt___CollectionsKt.last(list2);
                    IntRange intRange2 = new IntRange(1, 7 - list2.size());
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10));
                    Iterator<Integer> it3 = intRange2.iterator();
                    while (it3.hasNext()) {
                        LocalDate localDatePlusDays = w90Var.b().plusDays(((IntIterator) it3).nextInt());
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "lastDay.date.plusDays(it.toLong())");
                        arrayList4.add(new w90(localDatePlusDays, he1.NEXT_MONTH));
                    }
                    mutableList.set(CollectionsKt__CollectionsKt.getLastIndex(mutableList), CollectionsKt___CollectionsKt.plus((Collection) list2, (Iterable) arrayList4));
                }
                if (outDateStyle == hj4.END_OF_GRID) {
                    while (mutableList.size() < 6) {
                        w90 w90Var2 = (w90) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last(mutableList));
                        IntRange intRange3 = new IntRange(1, 7);
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange3, 10));
                        Iterator<Integer> it4 = intRange3.iterator();
                        while (it4.hasNext()) {
                            LocalDate localDatePlusDays2 = w90Var2.b().plusDays(((IntIterator) it4).nextInt());
                            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "lastDay.date.plusDays(it.toLong())");
                            arrayList5.add(new w90(localDatePlusDays2, he1.NEXT_MONTH));
                        }
                        mutableList.add(arrayList5);
                    }
                }
            }
            return mutableList;
        }
    }

    public yw3(hj4 outDateStyle, dy2 inDateStyle, int i, YearMonth startMonth, YearMonth endMonth, DayOfWeek firstDayOfWeek, boolean z, e43 job) {
        Intrinsics.checkNotNullParameter(outDateStyle, "outDateStyle");
        Intrinsics.checkNotNullParameter(inDateStyle, "inDateStyle");
        Intrinsics.checkNotNullParameter(startMonth, "startMonth");
        Intrinsics.checkNotNullParameter(endMonth, "endMonth");
        Intrinsics.checkNotNullParameter(firstDayOfWeek, "firstDayOfWeek");
        Intrinsics.checkNotNullParameter(job, "job");
        this.b = outDateStyle;
        this.c = inDateStyle;
        this.d = i;
        this.e = startMonth;
        this.f = endMonth;
        this.g = firstDayOfWeek;
        this.h = z;
        this.i = job;
        this.a = z ? k.a(startMonth, endMonth, firstDayOfWeek, i, inDateStyle, outDateStyle, job) : k.b(startMonth, endMonth, firstDayOfWeek, i, inDateStyle, outDateStyle, job);
    }

    public final boolean a() {
        return this.h;
    }

    public final List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw3)) {
            return false;
        }
        yw3 yw3Var = (yw3) obj;
        return Intrinsics.areEqual(this.b, yw3Var.b) && Intrinsics.areEqual(this.c, yw3Var.c) && this.d == yw3Var.d && Intrinsics.areEqual(this.e, yw3Var.e) && Intrinsics.areEqual(this.f, yw3Var.f) && Intrinsics.areEqual(this.g, yw3Var.g) && this.h == yw3Var.h && Intrinsics.areEqual(this.i, yw3Var.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v22 */
    public int hashCode() {
        hj4 hj4Var = this.b;
        int iHashCode = (hj4Var != null ? hj4Var.hashCode() : 0) * 31;
        dy2 dy2Var = this.c;
        int iHashCode2 = (((iHashCode + (dy2Var != null ? dy2Var.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31;
        YearMonth yearMonth = this.e;
        int iHashCode3 = (iHashCode2 + (yearMonth != null ? yearMonth.hashCode() : 0)) * 31;
        YearMonth yearMonth2 = this.f;
        int iHashCode4 = (iHashCode3 + (yearMonth2 != null ? yearMonth2.hashCode() : 0)) * 31;
        DayOfWeek dayOfWeek = this.g;
        int iHashCode5 = (iHashCode4 + (dayOfWeek != null ? dayOfWeek.hashCode() : 0)) * 31;
        boolean z = this.h;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode5 + r2) * 31;
        e43 e43Var = this.i;
        return i + (e43Var != null ? e43Var.hashCode() : 0);
    }

    public String toString() {
        return "MonthConfig(outDateStyle=" + this.b + ", inDateStyle=" + this.c + ", maxRowCount=" + this.d + ", startMonth=" + this.e + ", endMonth=" + this.f + ", firstDayOfWeek=" + this.g + ", hasBoundaries=" + this.h + ", job=" + this.i + ")";
    }
}
