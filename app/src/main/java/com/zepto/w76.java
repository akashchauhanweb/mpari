package com.zepto;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w76 {
    public static void a(e53 e53Var, a63 a63Var) {
        to6.V.c(a63Var, e53Var);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    public static final class b extends Writer {
        public final Appendable c;
        public final a e = new a();

        public static class a implements CharSequence {
            public char[] c;
            public String e;

            public a() {
            }

            public void a(char[] cArr) {
                this.c = cArr;
                this.e = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.c[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.c.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.c, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.e == null) {
                    this.e = new String(this.c);
                }
                return this.e;
            }
        }

        public b(Appendable appendable) {
            this.c = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            this.e.a(cArr);
            this.c.append(this.e, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.c.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.c.append((char) i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
            this.c.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) throws IOException {
            Objects.requireNonNull(str);
            this.c.append(str, i, i2 + i);
        }
    }
}
