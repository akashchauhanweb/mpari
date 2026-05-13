package com.zepto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class pl2 implements Iterable, KMappedMarker {
    public static final b e = new b(null);
    public final String[] c;

    public static final class a {
        public final List a = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = pl2.e;
            bVar.d(name);
            bVar.e(value, name);
            d(name, value);
            return this;
        }

        public final a b(pl2 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                d(headers.m(i), headers.u(i));
            }
            return this;
        }

        public final a c(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                d(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                d("", strSubstring3);
            } else {
                d("", line);
            }
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.a.add(name);
            this.a.add(StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        public final pl2 e() {
            Object[] array = this.a.toArray(new String[0]);
            if (array != null) {
                return new pl2((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.downTo(this.a.size() - 2, 0), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!StringsKt__StringsJVMKt.equals(name, (String) this.a.get(first), true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return (String) this.a.get(first + 1);
        }

        public final List g() {
            return this.a;
        }

        public final a h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < this.a.size()) {
                if (StringsKt__StringsJVMKt.equals(name, (String) this.a.get(i), true)) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = pl2.e;
            bVar.d(name);
            bVar.e(value, name);
            h(name);
            d(name, value);
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(et6.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public final void e(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(et6.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(et6.E(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public final String f(String[] strArr, String str) {
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.downTo(strArr.length - 2, 0), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!StringsKt__StringsJVMKt.equals(str, strArr[first], true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return strArr[first + 1];
        }

        public final pl2 g(String... namesAndValues) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i] = StringsKt__StringsKt.trim((CharSequence) str).toString();
            }
            IntProgression intProgressionStep = RangesKt___RangesKt.step(ArraysKt___ArraysKt.getIndices(strArr), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    String str2 = strArr[first];
                    String str3 = strArr[first + 1];
                    d(str2);
                    e(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            return new pl2(strArr, null);
        }
    }

    public pl2(String[] strArr) {
        this.c = strArr;
    }

    public static final pl2 r(String... strArr) {
        return e.g(strArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof pl2) && Arrays.equals(this.c, ((pl2) obj).c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(m(i), u(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final String j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return e.f(this.c, name);
    }

    public final String m(int i) {
        return this.c[i * 2];
    }

    public final a n() {
        a aVar = new a();
        CollectionsKt__MutableCollectionsKt.addAll(aVar.g(), this.c);
        return aVar;
    }

    public final int size() {
        return this.c.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM = m(i);
            String strU = u(i);
            sb.append(strM);
            sb.append(": ");
            if (et6.E(strM)) {
                strU = "██";
            }
            sb.append(strU);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String u(int i) {
        return this.c[(i * 2) + 1];
    }

    public final List w(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(name, m(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(u(i));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public /* synthetic */ pl2(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
