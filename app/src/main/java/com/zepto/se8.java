package com.zepto;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class se8 extends gf8 {
    public final int c;
    public int e;

    public se8(int i, int i2) {
        pe8.b(i2, i, "index");
        this.c = i;
        this.e = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.e < this.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.e;
        this.e = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.e - 1;
        this.e = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }
}
