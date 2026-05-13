package com.zepto;

import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class f56 {

    public static final class a extends IntIterator {
        public int c;
        public final /* synthetic */ e56 e;

        public a(e56 e56Var) {
            this.e = e56Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.e.q();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            e56 e56Var = this.e;
            int i = this.c;
            this.c = i + 1;
            return e56Var.k(i);
        }
    }

    public static final class b implements Iterator, KMappedMarker {
        public int c;
        public final /* synthetic */ e56 e;

        public b(e56 e56Var) {
            this.e = e56Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.e.q();
        }

        @Override // java.util.Iterator
        public Object next() {
            e56 e56Var = this.e;
            int i = this.c;
            this.c = i + 1;
            return e56Var.r(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final IntIterator a(e56 receiver$0) {
        Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new a(receiver$0);
    }

    public static final Iterator b(e56 receiver$0) {
        Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new b(receiver$0);
    }
}
