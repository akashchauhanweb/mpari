package com.zepto;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class g24 {
    public static final b q = new b(null);
    public static final Pattern r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern s = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b;
    public final String c;
    public String e;
    public final Lazy h;
    public boolean i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public String n;
    public final Lazy o;
    public boolean p;
    public final List d = new ArrayList();
    public final Lazy f = LazyKt__LazyJVMKt.lazy(new l());
    public final Lazy g = LazyKt__LazyJVMKt.lazy(new j());

    public static final class a {
        public static final C0084a d = new C0084a(null);
        public String a;
        public String b;
        public String c;

        /* JADX INFO: renamed from: com.zepto.g24$a$a, reason: collision with other inner class name */
        public static final class C0084a {
            public C0084a() {
            }

            public /* synthetic */ C0084a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final g24 a() {
            return new g24(this.a, this.b, this.c);
        }

        public final a b(String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }
            this.b = action;
            return this;
        }

        public final a c(String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.c = mimeType;
            return this;
        }

        public final a d(String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.a = uriPattern;
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c implements Comparable {
        public String c;
        public String e;

        public c(String mimeType) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> listSplit = new Regex("/").split(mimeType, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            this.c = (String) listEmptyList.get(0);
            this.e = (String) listEmptyList.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.areEqual(this.c, other.c) ? 2 : 0;
            return Intrinsics.areEqual(this.e, other.e) ? i + 1 : i;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.c;
        }
    }

    public static final class d {
        public String a;
        public final List b = new ArrayList();

        public final void a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.b.add(name);
        }

        public final List b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final void d(String str) {
            this.a = str;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            Pair pairL = g24.this.l();
            return (pairL == null || (list = (List) pairL.getFirst()) == null) ? new ArrayList() : list;
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair invoke() {
            return g24.this.D();
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strN = g24.this.n();
            if (strN != null) {
                return Pattern.compile(strN, 2);
            }
            return null;
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Pair pairL = g24.this.l();
            if (pairL != null) {
                return (String) pairL.getSecond();
            }
            return null;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public final /* synthetic */ Bundle c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Bundle bundle) {
            super(1);
            this.c = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            Intrinsics.checkNotNullParameter(argName, "argName");
            return Boolean.valueOf(!this.c.containsKey(argName));
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((g24.this.y() == null || Uri.parse(g24.this.y()).getQuery() == null) ? false : true);
        }
    }

    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = g24.this.n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = g24.this.e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return g24.this.H();
        }
    }

    public g24(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new m());
        this.j = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new f());
        this.k = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new e());
        this.l = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new h());
        this.m = LazyKt__LazyJVMKt.lazy(new g());
        this.o = LazyKt__LazyJVMKt.lazy(new k());
        G();
        F();
    }

    public final boolean A() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean B(Bundle bundle, String str, String str2, y14 y14Var) {
        if (y14Var != null) {
            y14Var.a().d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public final boolean C(Bundle bundle, String str, String str2, y14 y14Var) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (y14Var == null) {
            return false;
        }
        u24 u24VarA = y14Var.a();
        u24VarA.e(bundle, str, str2, u24VarA.a(bundle, str));
        return false;
    }

    public final Pair D() {
        String str = this.a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.a).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        g(fragment, arrayList, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fragRegex.toString()");
        return TuplesKt.to(arrayList, string);
    }

    public final boolean E(List list, d dVar, Bundle bundle, Map map) {
        if (list == null) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strC = dVar.c();
            Matcher matcher = strC != null ? Pattern.compile(strC, 32).matcher(str) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            try {
                List listB = dVar.b();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listB, 10));
                int i2 = 0;
                for (Object obj : listB) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    String str2 = (String) obj;
                    String strGroup = matcher.group(i3);
                    if (strGroup == null) {
                        strGroup = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    y14 y14Var = (y14) map.get(str2);
                    if (C(bundle, str2, strGroup, y14Var)) {
                        if (!Intrinsics.areEqual(strGroup, '{' + str2 + '}') && B(bundle2, str2, strGroup, y14Var)) {
                            return false;
                        }
                    }
                    arrayList.add(Unit.INSTANCE);
                    i2 = i3;
                }
                bundle.putAll(bundle2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }

    public final void F() {
        if (this.c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.c).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.c);
        this.n = StringsKt__StringsJVMKt.replace$default("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
    }

    public final void G() {
        if (this.a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!r.matcher(this.a).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.a);
        matcher.find();
        boolean z = false;
        String strSubstring = this.a.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        g(strSubstring, this.d, sb);
        if (!StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) ".*", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) "([^/]+?)", false, 2, (Object) null)) {
            z = true;
        }
        this.p = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriRegex.toString()");
        this.e = StringsKt__StringsJVMKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null);
    }

    public final Map H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.a);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParams = uri.getQueryParameters(paramName);
            if (queryParams.size() > 1) {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
            String queryParam = (String) CollectionsKt___CollectionsKt.firstOrNull((List) queryParams);
            if (queryParam == null) {
                this.i = true;
                queryParam = paramName;
            }
            Matcher matcher = s.matcher(queryParam);
            d dVar = new d();
            int iEnd = 0;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
                dVar.a(strGroup);
                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                String strSubstring = queryParam.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
                sb.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < queryParam.length()) {
                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                String strSubstring2 = queryParam.substring(iEnd);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb.append(Pattern.quote(strSubstring2));
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "argRegex.toString()");
            dVar.d(StringsKt__StringsJVMKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
            linkedHashMap.put(paramName, dVar);
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g24)) {
            return false;
        }
        g24 g24Var = (g24) obj;
        return Intrinsics.areEqual(this.a, g24Var.a) && Intrinsics.areEqual(this.b, g24Var.b) && Intrinsics.areEqual(this.c, g24Var.c);
    }

    public final void g(String str, List list, StringBuilder sb) {
        Matcher matcher = s.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public final int h(Uri uri) {
        if (uri == null || this.a == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.a).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
        Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
        return CollectionsKt___CollectionsKt.intersect(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.b;
    }

    public final List j() {
        List list = this.d;
        Collection collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((d) it.next()).b());
        }
        return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList), (Iterable) k());
    }

    public final List k() {
        return (List) this.k.getValue();
    }

    public final Pair l() {
        return (Pair) this.j.getValue();
    }

    public final Pattern m() {
        return (Pattern) this.m.getValue();
    }

    public final String n() {
        return (String) this.l.getValue();
    }

    public final Bundle o(Uri deepLink, Map arguments) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (!z14.a(arguments, new i(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle p(Uri uri, Map arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, arguments);
        if (A()) {
            r(uri, bundle, arguments);
        }
        return bundle;
    }

    public final boolean q(Matcher matcher, Bundle bundle, Map map) {
        List list = this.d;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i3));
            y14 y14Var = (y14) map.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                if (B(bundle, str, value, y14Var)) {
                    return false;
                }
                arrayList.add(Unit.INSTANCE);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : x().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = CollectionsKt__CollectionsJVMKt.listOf(query);
            }
            if (!E(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final void s(String str, Bundle bundle, Map map) {
        Pattern patternM = m();
        Matcher matcher = patternM != null ? patternM.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List listK = k();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listK, 10));
            int i2 = 0;
            for (Object obj : listK) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i3));
                y14 y14Var = (y14) map.get(str2);
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (B(bundle, str2, value, y14Var)) {
                        return;
                    }
                    arrayList.add(Unit.INSTANCE);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    public final String t() {
        return this.c;
    }

    public final int u(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.c != null) {
            Pattern patternV = v();
            Intrinsics.checkNotNull(patternV);
            if (patternV.matcher(mimeType).matches()) {
                return new c(this.c).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    public final Pattern v() {
        return (Pattern) this.o.getValue();
    }

    public final Pattern w() {
        return (Pattern) this.f.getValue();
    }

    public final Map x() {
        return (Map) this.h.getValue();
    }

    public final String y() {
        return this.a;
    }

    public final boolean z() {
        return this.p;
    }
}
