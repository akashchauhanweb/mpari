package com.zepto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class jc6 {
    public static final b e = new b(null);
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public static final class a {
        public static final C0096a h = new C0096a(null);
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: com.zepto.jc6$a$a, reason: collision with other inner class name */
        public static final class C0096a {
            public C0096a() {
            }

            public /* synthetic */ C0096a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                return i2 == 0;
            }

            public final boolean b(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) strSubstring).toString(), str);
            }
        }

        public a(String name, String type, boolean z, int i, String str, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.a = name;
            this.b = type;
            this.c = z;
            this.d = i;
            this.e = str;
            this.f = i2;
            this.g = a(type);
        }

        public final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.d != ((a) obj).d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.a, aVar.a) || this.c != aVar.c) {
                return false;
            }
            if (this.f == 1 && aVar.f == 2 && (str3 = this.e) != null && !h.b(str3, aVar.e)) {
                return false;
            }
            if (this.f == 2 && aVar.f == 1 && (str2 = aVar.e) != null && !h.b(str2, this.e)) {
                return false;
            }
            int i = this.f;
            return (i == 0 || i != aVar.f || ((str = this.e) == null ? aVar.e == null : h.b(str, aVar.e))) && this.g == aVar.g;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jc6 a(n96 database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return kc6.f(database, tableName);
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final List e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.a = referenceTable;
            this.b = onDelete;
            this.c = onUpdate;
            this.d = columnNames;
            this.e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d)) {
                return Intrinsics.areEqual(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    public static final class d implements Comparable {
        public final int c;
        public final int e;
        public final String f;
        public final String g;

        public d(int i, int i2, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.c = i;
            this.e = i2;
            this.f = from;
            this.g = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = this.c - other.c;
            return i == 0 ? this.e - other.e : i;
        }

        public final String b() {
            return this.f;
        }

        public final int c() {
            return this.c;
        }

        public final String d() {
            return this.g;
        }
    }

    public static final class e {
        public static final a e = new a(null);
        public final String a;
        public final boolean b;
        public final List c;
        public List d;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String name, boolean z, List columns, List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.a = name;
            this.b = z;
            this.c = columns;
            this.d = orders;
            List arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(ly2.ASC.name());
                }
            }
            this.d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.b == eVar.b && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d)) {
                return StringsKt__StringsJVMKt.startsWith$default(this.a, "index_", false, 2, null) ? StringsKt__StringsJVMKt.startsWith$default(eVar.a, "index_", false, 2, null) : Intrinsics.areEqual(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt__StringsJVMKt.startsWith$default(this.a, "index_", false, 2, null) ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
        }
    }

    public jc6(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.a = name;
        this.b = columns;
        this.c = foreignKeys;
        this.d = set;
    }

    public static final jc6 a(n96 n96Var, String str) {
        return e.a(n96Var, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc6)) {
            return false;
        }
        jc6 jc6Var = (jc6) obj;
        if (!Intrinsics.areEqual(this.a, jc6Var.a) || !Intrinsics.areEqual(this.b, jc6Var.b) || !Intrinsics.areEqual(this.c, jc6Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = jc6Var.d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
