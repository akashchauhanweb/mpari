package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.zepto.aj6;
import com.zepto.k12;
import com.zepto.lu4;
import com.zepto.pt3;
import com.zepto.qt3;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final pt3 a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    public static class a {
        public final SparseArray a;
        public k12 b;

        public a() {
            this(1);
        }

        public a a(int i) {
            SparseArray sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i);
        }

        public final k12 b() {
            return this.b;
        }

        public void c(k12 k12Var, int i, int i2) {
            a aVarA = a(k12Var.b(i));
            if (aVarA == null) {
                aVarA = new a();
                this.a.put(k12Var.b(i), aVarA);
            }
            if (i2 > i) {
                aVarA.c(k12Var, i + 1, i2);
            } else {
                aVarA.b = k12Var;
            }
        }

        public a(int i) {
            this.a = new SparseArray(i);
        }
    }

    public f(Typeface typeface, pt3 pt3Var) {
        this.d = typeface;
        this.a = pt3Var;
        this.b = new char[pt3Var.k() * 2];
        a(pt3Var);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            aj6.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, qt3.b(byteBuffer));
        } finally {
            aj6.b();
        }
    }

    public final void a(pt3 pt3Var) {
        int iK = pt3Var.k();
        for (int i = 0; i < iK; i++) {
            k12 k12Var = new k12(this, i);
            Character.toChars(k12Var.f(), this.b, i * 2);
            h(k12Var);
        }
    }

    public char[] c() {
        return this.b;
    }

    public pt3 d() {
        return this.a;
    }

    public int e() {
        return this.a.l();
    }

    public a f() {
        return this.c;
    }

    public Typeface g() {
        return this.d;
    }

    public void h(k12 k12Var) {
        lu4.h(k12Var, "emoji metadata cannot be null");
        lu4.b(k12Var.c() > 0, "invalid metadata codepoint length");
        this.c.c(k12Var, 0, k12Var.c() - 1);
    }
}
