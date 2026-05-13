package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class v76 {
    public static f53 a(s53 s53Var) {
        boolean z;
        try {
            try {
                s53Var.G0();
                z = false;
            } catch (gp3 e) {
                throw new u53(e);
            } catch (IOException e2) {
                throw new i53(e2);
            } catch (NumberFormatException e3) {
                throw new u53(e3);
            }
        } catch (EOFException e4) {
            e = e4;
            z = true;
        }
        try {
            return (f53) so6.V.read(s53Var);
        } catch (EOFException e5) {
            e = e5;
            if (z) {
                return k53.c;
            }
            throw new u53(e);
        }
    }

    public static void b(f53 f53Var, b63 b63Var) {
        so6.V.write(b63Var, f53Var);
    }

    public static Writer c(Appendable appendable) {
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
