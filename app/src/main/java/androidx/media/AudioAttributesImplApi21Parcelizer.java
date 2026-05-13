package androidx.media;

import android.media.AudioAttributes;
import com.zepto.op7;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(op7 op7Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) op7Var.r(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = op7Var.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, op7 op7Var) {
        op7Var.x(false, false);
        op7Var.H(audioAttributesImplApi21.a, 1);
        op7Var.F(audioAttributesImplApi21.b, 2);
    }
}
