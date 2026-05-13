package com.zepto;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t43 {
    public final String a;

    public t43(String str) {
        this.a = (String) ju4.j(str);
    }

    public static t43 e(String str) {
        return new t43(str);
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        ju4.j(appendable);
        if (it.hasNext()) {
            appendable.append(f(it.next()));
            while (it.hasNext()) {
                appendable.append(this.a);
                appendable.append(f(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String c(Iterable iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator it) {
        return b(new StringBuilder(), it).toString();
    }

    public CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
