package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zepto.j24;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public class k24 extends j24 implements Iterable, KMappedMarker {
    public static final a s = new a(null);
    public final e56 o;
    public int p;
    public String q;
    public String r;

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.k24$a$a, reason: collision with other inner class name */
        public static final class C0099a extends Lambda implements Function1 {
            public static final C0099a c = new C0099a();

            public C0099a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j24 invoke(j24 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof k24)) {
                    return null;
                }
                k24 k24Var = (k24) it;
                return k24Var.p0(k24Var.v0());
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j24 a(k24 k24Var) {
            Intrinsics.checkNotNullParameter(k24Var, "<this>");
            return (j24) SequencesKt___SequencesKt.last(SequencesKt__SequencesKt.generateSequence(k24Var.p0(k24Var.v0()), (Function1<? super j24, ? extends j24>) ((Function1<? super Object, ? extends Object>) C0099a.c)));
        }
    }

    public static final class b implements Iterator, KMutableIterator {
        public int c = -1;
        public boolean e;

        public b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j24 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.e = true;
            e56 e56VarT0 = k24.this.t0();
            int i = this.c + 1;
            this.c = i;
            Object objR = e56VarT0.r(i);
            Intrinsics.checkNotNullExpressionValue(objR, "nodes.valueAt(++index)");
            return (j24) objR;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c + 1 < k24.this.t0().q();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.e) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            e56 e56VarT0 = k24.this.t0();
            ((j24) e56VarT0.r(this.c)).l0(null);
            e56VarT0.o(this.c);
            this.c--;
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k24(g34 navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.o = new e56();
    }

    @Override // com.zepto.j24
    public String O() {
        return P() != 0 ? super.O() : "the root navigation";
    }

    @Override // com.zepto.j24
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k24)) {
            return false;
        }
        if (super.equals(obj)) {
            k24 k24Var = (k24) obj;
            if (this.o.q() == k24Var.o.q() && v0() == k24Var.v0()) {
                for (j24 j24Var : SequencesKt__SequencesKt.asSequence(f56.b(this.o))) {
                    if (!Intrinsics.areEqual(j24Var, k24Var.o.e(j24Var.P()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.j24
    public j24.b g0(i24 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        j24.b bVarG0 = super.g0(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            j24.b bVarG02 = ((j24) it.next()).g0(navDeepLinkRequest);
            if (bVarG02 != null) {
                arrayList.add(bVarG02);
            }
        }
        return (j24.b) CollectionsKt___CollectionsKt.maxOrNull((Iterable) CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new j24.b[]{bVarG0, (j24.b) CollectionsKt___CollectionsKt.maxOrNull((Iterable) arrayList)}));
    }

    @Override // com.zepto.j24
    public int hashCode() {
        int iV0 = v0();
        e56 e56Var = this.o;
        int iQ = e56Var.q();
        for (int i = 0; i < iQ; i++) {
            iV0 = (((iV0 * 31) + e56Var.k(i)) * 31) + ((j24) e56Var.r(i)).hashCode();
        }
        return iV0;
    }

    @Override // com.zepto.j24
    public void i0(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.i0(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, a25.v);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        y0(typedArrayObtainAttributes.getResourceId(a25.w, 0));
        this.q = j24.m.b(context, this.p);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b();
    }

    public final void o0(j24 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iP = node.P();
        String strD0 = node.d0();
        if (iP == 0 && strD0 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (d0() != null && !(!Intrinsics.areEqual(strD0, d0()))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (iP == P()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        j24 j24Var = (j24) this.o.e(iP);
        if (j24Var == node) {
            return;
        }
        if (node.a0() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (j24Var != null) {
            j24Var.l0(null);
        }
        node.l0(this);
        this.o.l(node.P(), node);
    }

    public final j24 p0(int i) {
        return q0(i, true);
    }

    public final j24 q0(int i, boolean z) {
        j24 j24Var = (j24) this.o.e(i);
        if (j24Var != null) {
            return j24Var;
        }
        if (!z || a0() == null) {
            return null;
        }
        k24 k24VarA0 = a0();
        Intrinsics.checkNotNull(k24VarA0);
        return k24VarA0.p0(i);
    }

    public final j24 r0(String str) {
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return null;
        }
        return s0(str, true);
    }

    public final j24 s0(String route, boolean z) {
        Object next;
        Intrinsics.checkNotNullParameter(route, "route");
        j24 j24Var = (j24) this.o.e(j24.m.a(route).hashCode());
        if (j24Var == null) {
            Iterator it = SequencesKt__SequencesKt.asSequence(f56.b(this.o)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((j24) next).h0(route) != null) {
                    break;
                }
            }
            j24Var = (j24) next;
        }
        if (j24Var != null) {
            return j24Var;
        }
        if (!z || a0() == null) {
            return null;
        }
        k24 k24VarA0 = a0();
        Intrinsics.checkNotNull(k24VarA0);
        return k24VarA0.r0(route);
    }

    public final e56 t0() {
        return this.o;
    }

    @Override // com.zepto.j24
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        j24 j24VarR0 = r0(this.r);
        if (j24VarR0 == null) {
            j24VarR0 = p0(v0());
        }
        sb.append(" startDestination=");
        if (j24VarR0 == null) {
            String str = this.r;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.q;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.p));
                }
            }
        } else {
            sb.append("{");
            sb.append(j24VarR0.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final String u0() {
        if (this.q == null) {
            String strValueOf = this.r;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.p);
            }
            this.q = strValueOf;
        }
        String str = this.q;
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final int v0() {
        return this.p;
    }

    public final String w0() {
        return this.r;
    }

    public final j24.b x0(i24 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return super.g0(request);
    }

    public final void y0(int i) {
        if (i != P()) {
            if (this.r != null) {
                z0(null);
            }
            this.p = i;
            this.q = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    public final void z0(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (!(!Intrinsics.areEqual(str, d0()))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!StringsKt__StringsJVMKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            iHashCode = j24.m.a(str).hashCode();
        }
        this.p = iHashCode;
        this.r = str;
    }
}
