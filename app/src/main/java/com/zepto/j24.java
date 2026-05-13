package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.zepto.g24;
import com.zepto.i24;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public abstract class j24 {
    public static final a m = new a(null);
    public static final Map n = new LinkedHashMap();
    public final String c;
    public k24 e;
    public String f;
    public CharSequence g;
    public final List h;
    public final e56 i;
    public Map j;
    public int k;
    public String l;

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.j24$a$a, reason: collision with other inner class name */
        public static final class C0094a extends Lambda implements Function1 {
            public static final C0094a c = new C0094a();

            public C0094a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j24 invoke(j24 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.a0();
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i) {
            String strValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        public final Sequence c(j24 j24Var) {
            Intrinsics.checkNotNullParameter(j24Var, "<this>");
            return SequencesKt__SequencesKt.generateSequence(j24Var, (Function1<? super j24, ? extends j24>) ((Function1<? super Object, ? extends Object>) C0094a.c));
        }
    }

    public static final class b implements Comparable {
        public final j24 c;
        public final Bundle e;
        public final boolean f;
        public final int g;
        public final boolean h;
        public final int i;

        public b(j24 destination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.c = destination;
            this.e = bundle;
            this.f = z;
            this.g = i;
            this.h = z2;
            this.i = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f;
            if (z && !other.f) {
                return 1;
            }
            if (!z && other.f) {
                return -1;
            }
            int i = this.g - other.g;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.e;
            if (bundle != null && other.e == null) {
                return 1;
            }
            if (bundle == null && other.e != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.e;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.h;
            if (z2 && !other.h) {
                return 1;
            }
            if (z2 || !other.h) {
                return this.i - other.i;
            }
            return -1;
        }

        public final j24 b() {
            return this.c;
        }

        public final Bundle c() {
            return this.e;
        }

        public final boolean d(Bundle bundle) {
            Bundle bundle2;
            Object objA;
            if (bundle == null || (bundle2 = this.e) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                y14 y14Var = (y14) this.c.j.get(key);
                Object objA2 = null;
                u24 u24VarA = y14Var != null ? y14Var.a() : null;
                if (u24VarA != null) {
                    Bundle bundle3 = this.e;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    objA = u24VarA.a(bundle3, key);
                } else {
                    objA = null;
                }
                if (u24VarA != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    objA2 = u24VarA.a(bundle, key);
                }
                if (!Intrinsics.areEqual(objA, objA2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public final /* synthetic */ g24 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g24 g24Var) {
            super(1);
            this.c = g24Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.c.j().contains(key));
        }
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ Bundle c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bundle bundle) {
            super(1);
            this.c = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.c.containsKey(key));
        }
    }

    public j24(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.c = navigatorName;
        this.h = new ArrayList();
        this.i = new e56();
        this.j = new LinkedHashMap();
    }

    public static /* synthetic */ int[] z(j24 j24Var, j24 j24Var2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            j24Var2 = null;
        }
        return j24Var.w(j24Var2);
    }

    public final String B(Context context, Bundle bundle) {
        y14 y14Var;
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = this.g;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (bundle == null || !bundle.containsKey(strGroup)) {
                throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + Typography.quote);
            }
            matcher.appendReplacement(stringBuffer, "");
            if (Intrinsics.areEqual((strGroup == null || (y14Var = (y14) this.j.get(strGroup)) == null) ? null : y14Var.a(), u24.e)) {
                String string = context.getString(bundle.getInt(strGroup));
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(bundle.getInt(argName))");
                stringBuffer.append(string);
            } else {
                stringBuffer.append(bundle.getString(strGroup));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final x14 D(int i) {
        x14 x14Var = this.i.i() ? null : (x14) this.i.e(i);
        if (x14Var != null) {
            return x14Var;
        }
        k24 k24Var = this.e;
        if (k24Var != null) {
            return k24Var.D(i);
        }
        return null;
    }

    public String O() {
        String str = this.f;
        return str == null ? String.valueOf(this.k) : str;
    }

    public final int P() {
        return this.k;
    }

    public final String T() {
        return this.c;
    }

    public final k24 a0() {
        return this.e;
    }

    public final String d0() {
        return this.l;
    }

    public final boolean e0(g24 g24Var, Uri uri, Map map) {
        return z14.a(map, new d(g24Var.p(uri, map))).isEmpty();
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j24)) {
            return false;
        }
        j24 j24Var = (j24) obj;
        boolean zAreEqual = Intrinsics.areEqual(this.h, j24Var.h);
        if (this.i.q() != j24Var.i.q()) {
            z = false;
            break;
        }
        Iterator it = SequencesKt__SequencesKt.asSequence(f56.a(this.i)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!Intrinsics.areEqual(this.i.e(iIntValue), j24Var.i.e(iIntValue))) {
                z = false;
                break;
            }
        }
        z = true;
        if (this.j.size() != j24Var.j.size()) {
            z2 = false;
            break;
        }
        for (Map.Entry entry : MapsKt___MapsKt.asSequence(this.j)) {
            if (!j24Var.j.containsKey(entry.getKey()) || !Intrinsics.areEqual(j24Var.j.get(entry.getKey()), entry.getValue())) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        return this.k == j24Var.k && Intrinsics.areEqual(this.l, j24Var.l) && zAreEqual && z && z2;
    }

    public final boolean f0(String route, Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.l, route)) {
            return true;
        }
        b bVarH0 = h0(route);
        if (Intrinsics.areEqual(this, bVarH0 != null ? bVarH0.b() : null)) {
            return bVarH0.d(bundle);
        }
        return false;
    }

    public b g0(i24 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.h.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (g24 g24Var : this.h) {
            Uri uriC = navDeepLinkRequest.c();
            Bundle bundleO = uriC != null ? g24Var.o(uriC, this.j) : null;
            int iH = g24Var.h(uriC);
            String strA = navDeepLinkRequest.a();
            boolean z = strA != null && Intrinsics.areEqual(strA, g24Var.i());
            String strB = navDeepLinkRequest.b();
            int iU = strB != null ? g24Var.u(strB) : -1;
            if (bundleO == null) {
                if (z || iU > -1) {
                    if (e0(g24Var, uriC, this.j)) {
                    }
                }
            }
            b bVar2 = new b(this, bundleO, g24Var.z(), iH, z, iU);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public final b h0(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        i24.a.C0090a c0090a = i24.a.d;
        Uri uri = Uri.parse(m.a(route));
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        i24 i24VarA = c0090a.a(uri).a();
        return this instanceof k24 ? ((k24) this).x0(i24VarA) : g0(i24VarA);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.k * 31;
        String str = this.l;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (g24 g24Var : this.h) {
            int i2 = iHashCode * 31;
            String strY = g24Var.y();
            int iHashCode2 = (i2 + (strY != null ? strY.hashCode() : 0)) * 31;
            String strI = g24Var.i();
            int iHashCode3 = (iHashCode2 + (strI != null ? strI.hashCode() : 0)) * 31;
            String strT = g24Var.t();
            iHashCode = iHashCode3 + (strT != null ? strT.hashCode() : 0);
        }
        Iterator itB = f56.b(this.i);
        while (itB.hasNext()) {
            x14 x14Var = (x14) itB.next();
            int iB = ((iHashCode * 31) + x14Var.b()) * 31;
            r24 r24VarC = x14Var.c();
            iHashCode = iB + (r24VarC != null ? r24VarC.hashCode() : 0);
            Bundle bundleA = x14Var.a();
            if (bundleA != null && (setKeySet = bundleA.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i3 = iHashCode * 31;
                    Bundle bundleA2 = x14Var.a();
                    Intrinsics.checkNotNull(bundleA2);
                    Object obj = bundleA2.get(str2);
                    iHashCode = i3 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.j.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            Object obj2 = this.j.get(str3);
            iHashCode = iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public void i0(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, a25.x);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        m0(typedArrayObtainAttributes.getString(a25.A));
        int i = a25.z;
        if (typedArrayObtainAttributes.hasValue(i)) {
            k0(typedArrayObtainAttributes.getResourceId(i, 0));
            this.f = m.b(context, this.k);
        }
        this.g = typedArrayObtainAttributes.getText(a25.y);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void j0(int i, x14 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (n0()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.i.l(i, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void k0(int i) {
        this.k = i;
        this.f = null;
    }

    public final void l0(k24 k24Var) {
        this.e = k24Var;
    }

    public final void m(String argumentName, y14 argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.j.put(argumentName, argument);
    }

    public final void m0(String str) {
        Object next;
        if (str == null) {
            k0(0);
        } else {
            if (!(!StringsKt__StringsJVMKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String strA = m.a(str);
            k0(strA.hashCode());
            r(strA);
        }
        List list = this.h;
        List list2 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((g24) next).y(), m.a(this.l))) {
                    break;
                }
            }
        }
        TypeIntrinsics.asMutableCollection(list2).remove(next);
        this.l = str;
    }

    public final void n(g24 navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List listA = z14.a(this.j, new c(navDeepLink));
        if (listA.isEmpty()) {
            this.h.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public boolean n0() {
        return true;
    }

    public final void r(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        n(new g24.a().d(uriPattern).a());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.k));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.l;
        if (str2 != null && !StringsKt__StringsJVMKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.l);
        }
        if (this.g != null) {
            sb.append(" label=");
            sb.append(this.g);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final Bundle u(Bundle bundle) {
        Map map;
        if (bundle == null && ((map = this.j) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.j.entrySet()) {
            ((y14) entry.getValue()).d((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.j.entrySet()) {
                String str = (String) entry2.getKey();
                y14 y14Var = (y14) entry2.getValue();
                if (!y14Var.e(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + y14Var.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] w(com.zepto.j24 r6) {
        /*
            r5 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            com.zepto.k24 r2 = r1.e
            if (r6 == 0) goto L10
            com.zepto.k24 r3 = r6.e
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L24
            com.zepto.k24 r3 = r6.e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = r1.k
            com.zepto.j24 r3 = r3.p0(r4)
            if (r3 != r1) goto L24
            r0.addFirst(r1)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            int r3 = r2.v0()
            int r4 = r1.k
            if (r3 == r4) goto L31
        L2e:
            r0.addFirst(r1)
        L31:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r1 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            com.zepto.j24 r1 = (com.zepto.j24) r1
            int r1 = r1.k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4f
        L65:
            int[] r6 = kotlin.collections.CollectionsKt.toIntArray(r0)
            return r6
        L6a:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.j24.w(com.zepto.j24):int[]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j24(g34 navigator) {
        this(h34.b.a(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
