package com.zepto;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pv0 {
    public static final pv0 a = new pv0();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[vp7.values().length];
            try {
                iArr[vp7.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vp7.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vp7.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vp7.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vp7.VERY_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public final int a(MediaExtractor extractor, boolean z) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "extractor.getTrackFormat(i)");
            String string = trackFormat.getString("mime");
            if (z) {
                boolValueOf = string != null ? Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default(string, "video/", false, 2, null)) : null;
                Intrinsics.checkNotNull(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i;
                }
            } else {
                boolValueOf = string != null ? Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default(string, "audio/", false, 2, null)) : null;
                Intrinsics.checkNotNull(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i;
                }
            }
        }
        return -5;
    }

    public final Pair b(double d, double d2, boolean z) {
        int iA;
        int iA2;
        if (z) {
            return new Pair(Integer.valueOf(MathKt__MathJVMKt.roundToInt(d)), Integer.valueOf(MathKt__MathJVMKt.roundToInt(d2)));
        }
        if (d >= 1920.0d || d2 >= 1920.0d) {
            iA = me4.a(d, 0.5d);
            iA2 = me4.a(d2, 0.5d);
        } else if (d >= 1280.0d || d2 >= 1280.0d) {
            iA = me4.a(d, 0.75d);
            iA2 = me4.a(d2, 0.75d);
        } else if (d >= 960.0d || d2 >= 960.0d) {
            iA = me4.a(d, 0.95d);
            iA2 = me4.a(d2, 0.95d);
        } else {
            iA = me4.a(d, 0.9d);
            iA2 = me4.a(d2, 0.9d);
        }
        return new Pair(Integer.valueOf(iA), Integer.valueOf(iA2));
    }

    public final int c(int i, vp7 quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        int i2 = a.a[quality.ordinal()];
        if (i2 == 1) {
            return MathKt__MathJVMKt.roundToInt(((double) i) * 0.1d);
        }
        if (i2 == 2) {
            return MathKt__MathJVMKt.roundToInt(((double) i) * 0.2d);
        }
        if (i2 == 3) {
            return MathKt__MathJVMKt.roundToInt(((double) i) * 0.3d);
        }
        if (i2 == 4) {
            return MathKt__MathJVMKt.roundToInt(((double) i) * 0.4d);
        }
        if (i2 == 5) {
            return MathKt__MathJVMKt.roundToInt(((double) i) * 0.6d);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Integer d(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-range")) {
            return Integer.valueOf(mediaFormat.getInteger("color-range"));
        }
        return null;
    }

    public final Integer e(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-standard")) {
            return Integer.valueOf(mediaFormat.getInteger("color-standard"));
        }
        return null;
    }

    public final Integer f(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-transfer")) {
            return Integer.valueOf(mediaFormat.getInteger("color-transfer"));
        }
        return null;
    }

    public final int g(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("frame-rate")) {
            return mediaFormat.getInteger("frame-rate");
        }
        return 30;
    }

    public final int h(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("i-frame-interval")) {
            return mediaFormat.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final boolean i() {
        MediaCodecInfo[] list = new MediaCodecList(0).getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(list, "list");
        for (MediaCodecInfo mediaCodecInfo : list) {
            Log.i("CODECS: ", mediaCodecInfo.getName());
            String name = mediaCodecInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "codec.name");
            if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "qti.avc", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final double j(MediaMetadataRetriever mediaMetadataRetriever) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata == null || strExtractMetadata.length() == 0) {
            return 640.0d;
        }
        return Double.parseDouble(strExtractMetadata);
    }

    public final double k(MediaMetadataRetriever mediaMetadataRetriever) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (strExtractMetadata == null || strExtractMetadata.length() == 0) {
            return 368.0d;
        }
        return Double.parseDouble(strExtractMetadata);
    }

    public final void l(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e("Compressor", localizedMessage, exception);
    }

    public final void m(MediaFormat inputFormat, MediaFormat outputFormat, int i) {
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        int iG = g(inputFormat);
        int iH = h(inputFormat);
        outputFormat.setInteger("color-format", 2130708361);
        outputFormat.setInteger("frame-rate", iG);
        outputFormat.setInteger("i-frame-interval", iH);
        outputFormat.setInteger("bitrate", i);
        outputFormat.setInteger("bitrate-mode", 2);
        pv0 pv0Var = a;
        Integer numE = pv0Var.e(inputFormat);
        if (numE != null) {
            outputFormat.setInteger("color-standard", numE.intValue());
        }
        Integer numF = pv0Var.f(inputFormat);
        if (numF != null) {
            outputFormat.setInteger("color-transfer", numF.intValue());
        }
        Integer numD = pv0Var.d(inputFormat);
        if (numD != null) {
            outputFormat.setInteger("color-range", numD.intValue());
        }
        Log.i("Output file parameters", "videoFormat: " + outputFormat);
    }

    public final jx3 n(int i, File cacheFile) {
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        jx3 jx3Var = new jx3();
        jx3Var.f(cacheFile);
        jx3Var.g(i);
        return jx3Var;
    }
}
