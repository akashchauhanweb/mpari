package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import com.zepto.bq6;
import com.zepto.d56;
import com.zepto.k12;
import com.zepto.l12;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final c.i a;
    public final f b;
    public c.d c;
    public final boolean d;
    public final int[] e;

    public static final class a {
        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    public static final class b {
        public int a = 1;
        public final f.a b;
        public f.a c;
        public f.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public b(f.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public static boolean d(int i) {
            return i == 65039;
        }

        public static boolean f(int i) {
            return i == 65038;
        }

        public int a(int i) {
            f.a aVarA = this.c.a(i);
            int iG = 2;
            if (this.a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.a = 2;
                    this.c = aVarA;
                    this.f = 1;
                }
            } else if (aVarA != null) {
                this.c = aVarA;
                this.f++;
            } else if (f(i)) {
                iG = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    iG = 3;
                    if (this.f != 1 || h()) {
                        this.d = this.c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.e = i;
            return iG;
        }

        public k12 b() {
            return this.c.b();
        }

        public k12 c() {
            return this.d.b();
        }

        public boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || h());
        }

        public final int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(f fVar, c.i iVar, c.d dVar, boolean z, int[] iArr) {
        this.a = iVar;
        this.b = fVar;
        this.c = dVar;
        this.d = z;
        this.e = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        l12[] l12VarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (l12VarArr = (l12[]) editable.getSpans(selectionStart, selectionEnd, l12.class)) != null && l12VarArr.length > 0) {
            for (l12 l12Var : l12VarArr) {
                int spanStart = editable.getSpanStart(l12Var);
                int spanEnd = editable.getSpanEnd(l12Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = a.a(editable, selectionStart, Math.max(i, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            l12[] l12VarArr = (l12[]) editable.getSpans(iMax, iMin, l12.class);
            if (l12VarArr != null && l12VarArr.length > 0) {
                for (l12 l12Var : l12VarArr) {
                    int spanStart = editable.getSpanStart(l12Var);
                    int spanEnd = editable.getSpanEnd(l12Var);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i, KeyEvent keyEvent) {
        boolean zB;
        if (i != 67) {
            if (i == 112) {
                zB = b(editable, keyEvent, true);
            }
            return false;
        }
        zB = b(editable, keyEvent, false);
        if (zB) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(Spannable spannable, k12 k12Var, int i, int i2) {
        spannable.setSpan(this.a.a(k12Var), i, i2, 33);
    }

    public final boolean e(CharSequence charSequence, int i, int i2, k12 k12Var) {
        if (k12Var.d() == 0) {
            k12Var.k(this.c.a(charSequence, i, i2, k12Var.h()));
        }
        return k12Var.d() == 2;
    }

    public CharSequence h(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        bq6 bq6Var;
        int iCharCount;
        l12[] l12VarArr;
        boolean z2 = charSequence instanceof d56;
        if (z2) {
            ((d56) charSequence).a();
        }
        if (!z2) {
            try {
                bq6Var = charSequence instanceof Spannable ? new bq6((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, l12.class) > i2) ? null : new bq6(charSequence);
            } finally {
                if (z2) {
                    ((d56) charSequence).d();
                }
            }
        }
        if (bq6Var != null && (l12VarArr = (l12[]) bq6Var.getSpans(i, i2, l12.class)) != null && l12VarArr.length > 0) {
            for (l12 l12Var : l12VarArr) {
                int spanStart = bq6Var.getSpanStart(l12Var);
                int spanEnd = bq6Var.getSpanEnd(l12Var);
                if (spanStart != i2) {
                    bq6Var.removeSpan(l12Var);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        if (i != i2 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && bq6Var != null) {
                i3 -= ((l12[]) bq6Var.getSpans(0, bq6Var.length(), l12.class)).length;
            }
            b bVar = new b(this.b.f(), this.d, this.e);
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int i4 = 0;
            bq6 bq6Var2 = bq6Var;
            loop1: while (true) {
                iCharCount = i;
                while (i < i2 && i4 < i3) {
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i = iCharCount;
                    } else if (iA == 2) {
                        i += Character.charCount(iCodePointAt);
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                        }
                    } else if (iA == 3) {
                        if (z || !e(charSequence, iCharCount, i, bVar.c())) {
                            if (bq6Var2 == null) {
                                bq6Var2 = new bq6((Spannable) new SpannableString(charSequence));
                            }
                            a(bq6Var2, bVar.c(), iCharCount, i);
                            i4++;
                        }
                    }
                }
                break loop1;
            }
            if (bVar.e() && i4 < i3 && (z || !e(charSequence, iCharCount, i, bVar.b()))) {
                if (bq6Var2 == null) {
                    bq6Var2 = new bq6(charSequence);
                }
                a(bq6Var2, bVar.b(), iCharCount, i);
            }
            if (bq6Var2 == null) {
                if (z2) {
                    ((d56) charSequence).d();
                }
                return charSequence;
            }
            Spannable spannableB = bq6Var2.b();
            if (z2) {
                ((d56) charSequence).d();
            }
            return spannableB;
        }
        return charSequence;
    }
}
