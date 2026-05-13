package androidx.media;

import com.zepto.op7;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(op7 op7Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = op7Var.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = op7Var.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = op7Var.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = op7Var.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, op7 op7Var) {
        op7Var.x(false, false);
        op7Var.F(audioAttributesImplBase.a, 1);
        op7Var.F(audioAttributesImplBase.b, 2);
        op7Var.F(audioAttributesImplBase.c, 3);
        op7Var.F(audioAttributesImplBase.d, 4);
    }
}
