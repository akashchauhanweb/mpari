package com.zepto;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jx3 {
    public gr3 a = gr3.j;
    public final ArrayList b = new ArrayList();
    public File c;

    public final void a(int i, long j, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (i < 0 || i >= this.b.size()) {
            return;
        }
        Object obj = this.b.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "tracks[trackIndex]");
        ((bj6) obj).a(j, bufferInfo);
    }

    public final int b(MediaFormat mediaFormat, boolean z) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        ArrayList arrayList = this.b;
        arrayList.add(new bj6(arrayList.size(), mediaFormat, z));
        return this.b.size() - 1;
    }

    public final File c() {
        return this.c;
    }

    public final gr3 d() {
        return this.a;
    }

    public final ArrayList e() {
        return this.b;
    }

    public final void f(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.c = file;
    }

    public final void g(int i) {
        if (i == 0) {
            this.a = gr3.j;
            return;
        }
        if (i == 90) {
            this.a = gr3.k;
        } else if (i == 180) {
            this.a = gr3.l;
        } else {
            if (i != 270) {
                return;
            }
            this.a = gr3.m;
        }
    }
}
