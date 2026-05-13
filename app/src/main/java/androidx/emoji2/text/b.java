package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.c;
import com.zepto.el4;

/* JADX INFO: loaded from: classes.dex */
public class b implements c.d {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.d
    public boolean a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i < i2) {
            sbB.append(charSequence.charAt(i));
            i++;
        }
        return el4.a(this.a, sbB.toString());
    }
}
