package com.zepto;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b33 {

    public class a extends bn6 {
        public final /* synthetic */ wh2 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterator it, wh2 wh2Var) {
            super(it);
            this.e = wh2Var;
        }

        @Override // com.zepto.bn6
        public Object a(Object obj) {
            return this.e.a(obj);
        }
    }

    public class b extends yp6 {
        public boolean c;
        public final /* synthetic */ Object e;

        public b(Object obj) {
            this.e = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.c) {
                throw new NoSuchElementException();
            }
            this.c = true;
            return this.e;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !jf4.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static yp6 b(Object obj) {
        return new b(obj);
    }

    public static Iterator c(Iterator it, wh2 wh2Var) {
        ju4.j(wh2Var);
        return new a(it, wh2Var);
    }
}
