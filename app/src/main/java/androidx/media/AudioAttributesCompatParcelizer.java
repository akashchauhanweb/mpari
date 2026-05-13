package androidx.media;

import com.zepto.op7;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(op7 op7Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) op7Var.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, op7 op7Var) {
        op7Var.x(false, false);
        op7Var.M(audioAttributesCompat.a, 1);
    }
}
